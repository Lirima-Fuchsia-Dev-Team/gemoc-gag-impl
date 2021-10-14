package fr.inria.gag.specification.xtext.validation

import fr.inria.gag.specification.model.specification.DecompositionRule

import org.eclipse.xtext.validation.Check

import fr.inria.gag.configuration.model.configuration.Task
import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory
import fr.inria.gag.specification.model.specification.SpecificationPackage
import java.util.ArrayList
import fr.inria.gag.configuration.model.configuration.Data
import java.util.Hashtable
import fr.inria.gag.specification.model.specification.IdExpression
import fr.inria.gag.specification.model.specification.LocalData
import fr.inria.gag.specification.model.specification.LeftPartExpression
import fr.inria.gag.specification.model.specification.FunctionExpression
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation
import java.util.HashSet
import java.util.Set

class ValidatorTool {

	// we construct here the partial interface of a service according to one of its decomposition rule
	def ServiceInterface getRuleInterface(DecompositionRule rule) {

		var service = rule.eContainer as Service;
		var t = ConfigurationFactory.eINSTANCE.createTask;
		ValidatorToolBase.initTask(t, service);
		// we check if the defined rule is applicable
		for (i : 0 ..< rule.subServices.size) {
			val element = rule.subServices.get(i)
			var st = ConfigurationFactory.eINSTANCE.createTask;
			ValidatorToolBase.initTask(st, element);

			t.subTasks.add(st);
		}
		// we simulate the rule application
		var context = new ArrayList<Task>();
		var variablesNameMap = new Hashtable<String, Data>(); // for local Variables
		var localFunctions = new ArrayList<PendingLocalFunctionComputation>();
		var assignments = new Hashtable<String, Pair<Data, Object>>();
		context.add(t);
		context.addAll(t.subTasks);
		var continue = true;
		for (i : 0 ..< rule.semantic.equations.size) {
			if (continue) {
				var eq = rule.semantic.equations.get(i);
				// test if left part is a local data or an idExpressions
				// creating the left part data
				var data1 = null as Data;
				var leftVariableName = null as String;
				if (eq.leftpart instanceof IdExpression) {
					var eql = eq.leftpart as IdExpression;
					var String[] ref1 = #[eql.serviceName, eql.parameterName];
					data1 = ValidatorToolBase.findReference(ref1, context)

					if (data1 === null) {
						continue = false;
					} else {
						leftVariableName = (eql.serviceName + "." + eql.parameterName).trim();
						// map with name;
						variablesNameMap.put(leftVariableName, data1);
					}

				} else {
					var eql = eq.leftpart as LocalData;

					data1 = variablesNameMap.get(eql.name.trim());
					if (data1 === null) {
						leftVariableName = eql.name.trim();
						data1 = ConfigurationFactory.eINSTANCE.createData();
						data1.value = new EncapsulatedValue;
						variablesNameMap.put(eql.name.trim(), data1);
					} else {
						// the variable is already defined, generate error
						continue = false;
					}
				}

				// creating the right part datas if we are allow to continue
				// if the right part is not a function
				if (continue) {
					if (eq.rightpart instanceof LeftPartExpression) {
						var data2 = null as Data;
						if (eq.rightpart instanceof IdExpression) {
							val rightPartIdExpression = eq.rightpart as IdExpression;
							val String[] ref2 = #[rightPartIdExpression.serviceName,
								rightPartIdExpression.parameterName];
							data2 = ValidatorToolBase.findReference(ref2, context);
							if (data2 === null) {
								continue = false;
							// error('the parameter ' + ref2.get(0) + "." + ref2.get(1) + " doesn't exist",
							// SpecificationPackage.Literals.DECOMPOSITION_RULE__SEMANTIC);
							}else{
								var variableName = (ref2.get(0).trim() + "." + ref2.get(1).trim() ).trim();
									variablesNameMap.put(variableName, data2);
							}

						} else {
							var eqr = eq.rightpart as LocalData;
							data2 = variablesNameMap.get(eqr.name.trim());
							if (data2 == null) {
								data2 = ConfigurationFactory.eINSTANCE.createData();
								data2.value = new EncapsulatedValue;
								variablesNameMap.put(eqr.name.trim(), data2);
							}
						}
						var ecData1 = data1.value as EncapsulatedValue;
						ecData1.addReference(data2.value as EncapsulatedValue);
						// store the assignment
						assignments.put(leftVariableName, new Pair(data1, data2));
					} // if the rightPart is a function
					else {
						var func = eq.rightpart as FunctionExpression;
						var ecData1 = data1.value as EncapsulatedValue;
						var runningFunction = ConfigurationFactory.eINSTANCE.createPendingLocalFunctionComputation;
						runningFunction.dataToCompute = data1;
						runningFunction.functiondeclaration = func.function;
						for (k : 0 ..< func.expressions.size) {
							var elId = func.expressions.get(k);
							var data = null as Data;
							if (elId instanceof IdExpression) {
								val String[] ref = #[(elId as IdExpression).serviceName,
									(elId as IdExpression).parameterName];
								data = ValidatorToolBase.findReference(ref, context);
								if (data === null) {
									continue = false;
								// error('the parameter ' + ref.get(0) + "." + ref.get(1) + " doesn't exist",
								} else {
									var variableName = (ref.get(0).trim() + "." + ref.get(1).trim() ).trim();
									variablesNameMap.put(variableName, data);
								}
							} // it is a local data
							else {
								data = variablesNameMap.get((elId as LocalData).name.trim());
								if (data === null) {
									data = ConfigurationFactory.eINSTANCE.createData();
									data.value = new EncapsulatedValue;
									variablesNameMap.put((elId as LocalData).name.trim(), data);
								}
							}
							runningFunction.actualParameters.add(data);
						}
						localFunctions.add(runningFunction);
						assignments.put(leftVariableName, new Pair(data1, runningFunction));
					}
				}
			}
		}
		
		// add the end of this loop all the variables are associated with their dependencies
		// we call another functions to extract full dependencies from the variables constructed;
		var inter= getServiceInterfaceFromSpecificsData(rule,t,assignments,ValidatorToolBase.reverseStringDataHashtable(variablesNameMap) );
		
		return inter;
	}

	def ServiceInterface getServiceInterfaceFromSpecificsData(
		DecompositionRule rule,
		Task baseTask,
		Hashtable<String, Pair<Data, Object>> assignments,
		Hashtable<Data, String> variablesMap
	) {

		var inter = new ServiceInterface();
		var service = rule.eContainer as Service;
		// we browse the task simulation executing the service to get the dependency of each output attribute
		for (i : 0 ..< baseTask.outputs.size) {
			var data = baseTask.outputs.get(i);
			var dependency = new Dependency();
			dependency.outParameter = service.name + '.' + data.parameter.name;
			dependency.inParameters.addAll(
				getAllDependenciesFromVariableName(dependency.outParameter, assignments, variablesMap, new HashSet<String>()));
			inter.addDependency(dependency);
		}
		return inter;
	}

	def HashSet<String> getAllDependenciesFromVariableName(
		String variableName,
		Hashtable<String, Pair<Data, Object>> assignments,
		Hashtable<Data, String> variablesMap,
		HashSet<String> treatedDependency
	) {

		var hset = new HashSet<String>();
		var ref = assignments.get(variableName);
		if (ref !== null) {
			var d = ref.value;
			if (d instanceof Data) {
				var dependenceSt = variablesMap.get(d as Data);
				if (dependenceSt!==null && !hset.contains(dependenceSt) && !treatedDependency.contains(dependenceSt)) { // we add only when needed
					hset.add(dependenceSt);
					treatedDependency.add(dependenceSt);
					var nextDependencies = getAllDependenciesFromVariableName(dependenceSt, assignments, variablesMap,treatedDependency);
					hset.addAll(nextDependencies); // we retrieve the dependencies recursively;
				}
			} else {
				var mfunction = d as PendingLocalFunctionComputation;
				for (i : 0 ..< mfunction.actualParameters.size) {
					var element = mfunction.actualParameters.get(i);
					var dependenceSt = variablesMap.get(element);
					if (dependenceSt!==null && !hset.contains(dependenceSt)  && !treatedDependency.contains(dependenceSt)) { // we add only when needed
						hset.add(dependenceSt);
						treatedDependency.add(dependenceSt);
						var nextDependencies = getAllDependenciesFromVariableName(dependenceSt, assignments,
							variablesMap,treatedDependency);
						hset.addAll(nextDependencies); // we retrieve the dependencies recursively;
					}
				}
			}
		}
		return hset;
	}

}
