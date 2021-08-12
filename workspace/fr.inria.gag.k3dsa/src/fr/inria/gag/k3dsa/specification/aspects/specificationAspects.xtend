package fr.inria.gag.k3dsa.specification.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.gag.specification.model.specification.GAG
import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.specification.model.specification.DecompositionRule
import fr.inria.gag.specification.model.specification.Guard
import fr.inria.gag.specification.model.specification.SemanticRule
import fr.inria.gag.specification.model.specification.Parameter
import fr.inria.gag.specification.model.specification.IdExpression
import fr.inria.gag.specification.model.specification.FunctionExpression
import fr.inria.gag.configuration.model.configuration.Data

// import for groovy
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

// eclipse need for groovy
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils
import java.util.ArrayList
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import java.net.URL
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.launching.JavaRuntime
import java.net.URLClassLoader
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor

import static extension fr.inria.gag.k3dsa.specification.aspects.GAGAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ServiceAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.GuardAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ParameterAspect.*
import static extension fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspect.*
import static extension fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspect.*

import fr.inria.gag.k3dsa.Console
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory
import fr.inria.gag.configuration.model.configuration.Configuration
import java.util.ArrayList
import fr.inria.gag.configuration.model.configuration.Task
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList
import fr.inria.gag.k3dsa.GagGuardExecutor
import fr.inria.gag.k3dsa.EncapsulatedValue
import java.util.List
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation
import fr.inria.gag.specification.model.specification.SpecificationFactory
import java.util.Hashtable
import fr.inria.gag.specification.model.specification.LocalData
import fr.inria.gag.specification.model.specification.LeftPartExpression

@Aspect(className=GAG)
class GAGAspect {
	public GagGuardExecutor exec = new GagGuardExecutor();

	@Step
	@InitializeModel
	def void initializeModel(EList<String> args) {
		val configuration = ConfigurationFactory.eINSTANCE.createConfiguration
		_self.configuration = configuration
	}

	@Main
	def void run() {
		Console.debug("Hello world on " + _self.eResource.URI);
		// _self.staticGuardEvalForTesting();
		// for testing groovy
		//_self.callGroovy(new Binding)
		val conf = _self.configuration as Configuration;

		// get the axioms
		chooseTheAxiom(_self);

		// run the conf
		var openTask = getOpenTask(_self, conf.root);
		while (openTask.size != 0) {
			var task = chooseTask(_self, openTask);
			var rule = chooseRule(_self, task);
			if(rule !=null){
			applyRule(_self, task, rule);}
			Console.debug("La configuration resultante est " + conf.print());
			openTask = getOpenTask(_self, conf.root);
		}
		Console.debug("Exécution terminée !");
	}

	@Step
	def void chooseTheAxiom() {
		val services = _self.services;
		val axioms = new ArrayList();
		for (i : 0 ..< services.size) {
			val element = services.get(i)
			if (element.isIsAxiom) {
				axioms.add(services.get(i));
			}
		}
		Console.debug("Veuillez choisir le service axiome de démarrage parmi les services suivants : ");
		var txtAf = "";
		for (i : 0 ..< axioms.size) {
			val element = axioms.get(i) as Service;
			Console.debug((i + 1) + "- " + element.name)
		// txtAf += " " + (i + 1) + "- " + element.name;
		}
		// Console.debug(txtAf);
		val choice = Console.readConsoleLine(txtAf);
		val id = Integer.parseInt(choice);
		val serviceChoice = axioms.get(id - 1) as Service;
		val conf = _self.configuration as Configuration
		conf.root = ConfigurationFactory.eINSTANCE.createTask
		conf.root.service = serviceChoice;
		Console.debug("Veuillez fournir les valeurs des entrées de l'axiome ");
		for (i : 0 ..< conf.root.service.inputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = conf.root.service.inputParameters.get(i);
			Console.debug("Veuillez entrer la valeur du paramètre " + data.parameter.name);
			data.value = new EncapsulatedValue(Console.readConsoleLine(""));
			conf.root.inputs.add(data);
		}
		for (i : 0 ..< conf.root.service.outputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = conf.root.service.outputParameters.get(i);
			data.value = new EncapsulatedValue;
			conf.root.outputs.add(data);
		}
	}

	@Step
	def Task chooseTask(ArrayList<Task> openTasks) {
		Console.debug("Veuillez choisir la tâche à traiter parmi les tâches suivantes : ");
		var txtAf = "";
		for (i : 0 ..< openTasks.size) {
			val element = openTasks.get(i);
			Console.debug((i + 1) + "- " + element.service.name)
		// txtAf += " " + (i + 1) + "- " + element.service.name;
		}
		val choice = Console.readConsoleLine(txtAf);
		val id = Integer.parseInt(choice);
		return openTasks.get(id - 1);
	}

	@Step
	def DecompositionRule chooseRule(Task t) {
		
		var applicableRules =new ArrayList<DecompositionRule> ;
		for (i : 0 ..< t.service.rules.size) {
			val element = t.service.rules.get(i);
			var guard =element.guard;
			if(guard ==null || guard.isApplicable(t)){
				applicableRules.add(element);
			}
			
		
		}
		if(applicableRules.size!=0){
			Console.debug("Veuillez choisir la règle de décomposition à appliquer parmi les règles suivantes : ");
			var txtAf = "";
			for(i:0 ..< applicableRules.size){
				Console.debug((i + 1) + "- " + applicableRules.get(i).name)
			}
			val choice = Console.readConsoleLine(txtAf);
			val id = Integer.parseInt(choice);
			val rule = applicableRules.get(id - 1);
			return rule;
		}else {
			Console.debug("Aucune règle de décomposition n'est actuellement applicable pour cette tâche ");
			Console.readConsoleLine("");
			return null;
		}
		

	}

	def ArrayList<Task> getOpenTask(Task root) {
		val openTasks = new ArrayList<Task>();
		if (root.isOpen) {
			openTasks.add(root);
		} else {
			for (i : 0 ..< root.subTasks.size) {
				val element = root.subTasks.get(i)
				val subOpenTasks = getOpenTask(_self, element);
				openTasks.addAll(subOpenTasks);
			}
		}
		return openTasks;
	}

	@Step
	def void applyRule(Task t, DecompositionRule r) {
		t.appliedRule = r.name;
		t.isOpen = false;
		// t.subTasks = new EList<Task>();
		for (i : 0 ..< r.subServices.size) {
			val element = r.subServices.get(i)
			var st = ConfigurationFactory.eINSTANCE.createTask;
			initTask(_self, st, element);

			t.subTasks.add(st);
		}

		// code for the semantic rule here
		var conf = _self.configuration as Configuration;
		var context = new ArrayList<Task>();
		var localVariables = new Hashtable<String,Data>(); // for local Variables
		context.add(t);
		context.addAll(t.subTasks);
		for (i : 0 ..< r.semantic.equations.size) {
			var eq = r.semantic.equations.get(i);
			// test if left part is a local data or an idExpressions
			// creating the left part data
			var data1=null as Data;
			if(eq.leftpart instanceof IdExpression){
				var eql = eq.leftpart as IdExpression; 
				var String[] ref1 = #[eql.serviceName, eql.parameterName];
				data1 = findReference(_self, ref1, context)
					
			}else{
				var eql = eq.leftpart as LocalData; 
				data1=localVariables.get(eql.name);
				if(data1==null){
					data1 = ConfigurationFactory.eINSTANCE.createData();
					data1.value = new EncapsulatedValue;
					localVariables.put(eql.name,data1);
				}
			}
			
			// creating the right part datas
			// if the right part is not a function
			if (eq.rightpart instanceof LeftPartExpression) {
				var data2 = null as Data;
				if(eq.rightpart instanceof IdExpression){
				val rightPartIdExpression = eq.rightpart as IdExpression;
				val String[] ref2 = #[rightPartIdExpression.serviceName, rightPartIdExpression.parameterName];
				data2 = findReference(_self, ref2, context);
				
				}
			 else {
				var eqr = eq.rightpart as LocalData; 
				data1=localVariables.get(eqr.name);
				if(data1==null){
					data1 = ConfigurationFactory.eINSTANCE.createData();
					data1.value = new EncapsulatedValue;
					localVariables.put(eqr.name,data1);
				}
				}
				var ecData1 = data1.value as EncapsulatedValue;
				ecData1.addReference(data2.value as EncapsulatedValue);
			}
			// if the rightPart is a function
			else {
				var func = eq.rightpart as FunctionExpression;
				var ecData1 = data1.value as EncapsulatedValue;
				var runningFunction = ConfigurationFactory.eINSTANCE.createPendingLocalFunctionComputation;
				runningFunction.dataToCompute = data1;
				runningFunction.functiondeclaration = func.function;
				for (k : 0 ..< func.expressions.size) {
					var elId = func.expressions.get(k);
					var data = null as Data;
					if(elId instanceof IdExpression){
						val String[] ref = #[(elId as IdExpression).serviceName, (elId as IdExpression).parameterName];
						data = findReference(_self, ref, context);
					}
					// it is a local data
					else {
						data=localVariables.get((elId as LocalData).name);
						if(data==null){
							data = ConfigurationFactory.eINSTANCE.createData();
							data.value = new EncapsulatedValue;
							localVariables.put((elId as LocalData).name,data);
						}
					}
					runningFunction.actualParameters.add(data);
				}
				
				conf.pendingLocalComputations.add(runningFunction);
			}

		}
		
		//code to compute function
		_self.computeFunction(conf.pendingLocalComputations);
	}

	def fr.inria.gag.configuration.model.configuration.Data findReference(String[] ref, ArrayList<Task> tasks) {
		var objectRef = null as fr.inria.gag.configuration.model.configuration.Data;
		var serviceName = ref.get(0).toString.trim;
		var serviceParameter = ref.get(1).toString.trim;
		// Console.debug(serviceName+"."+serviceParameter);
		for (i : 0 ..< tasks.size) {
			var element = tasks.get(i);
			if (element.service.name.equals(serviceName)) {
				// we look in inputs and outputs to find the parameter
				for (j : 0 ..< element.inputs.size) {
					if (element.inputs.get(j).parameter.name.equals(serviceParameter)) {
						objectRef = element.inputs.get(j);
					// Console.debug('i found');
					}
				}
				for (j : 0 ..< element.outputs.size) {
					if (element.outputs.get(j).parameter.name.equals(serviceParameter)) {
						objectRef = element.outputs.get(j);
					// Console.debug('i found');
					}
				}
			}
		}
		return objectRef;
	}

	// method to execute functions
	def void computeFunction(EList<PendingLocalFunctionComputation> runningFunctions) {

		var executableFunctions = new ArrayList<PendingLocalFunctionComputation>
		for (i : 0 ..< runningFunctions.size) {
			var func = runningFunctions.get(i);
			if (func.executable) {
				executableFunctions.add(func);
			}
		}
		while (executableFunctions.size != 0) {
			for (i : 0 ..< executableFunctions.size) {
				//execute the function
				var elFunc = executableFunctions.get(i);
				var result = elFunc.execute;
				var ecObj= elFunc.dataToCompute.value as EncapsulatedValue;
				ecObj.value = result;
								
			}
			
			runningFunctions.removeAll(executableFunctions); // remove the executed function
			executableFunctions = new ArrayList<PendingLocalFunctionComputation> //re-initialize the candidate function list
			for (i : 0 ..< runningFunctions.size) {
				var func = runningFunctions.get(i);
				if (func.executable) {
					executableFunctions.add(func);
				}
			}
		}

	}

	def void initTask(Task t, Service s) {
		t.service = s;
		t.isOpen = true;
		for (i : 0 ..< s.inputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = s.inputParameters.get(i);
			data.value = new EncapsulatedValue;
			t.inputs.add(data);
		}
		for (i : 0 ..< s.outputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = s.outputParameters.get(i);
			data.value = new EncapsulatedValue;
			t.outputs.add(data);
		}
	}

	def void evaluateAllGuardsForTesting() {
		Console.debug("Trying guard evaluation on " + _self.eResource.URI);
		for (Service service : _self.services) {
			service.evaluateAllGuardsForTesting(_self.exec);
		}
	}

	def void staticGuardEvalForTesting() {
		Console.debug("Trying static guard evaluation on " + _self.eResource.URI);
		try {
			Console.debug("Fixed guard evaluation result is : " +
				_self.exec.isRuleActivable(
					"E:/PhD Recherche/Fuchsia Team/Fuchsia Dev/runtime-Modeling_Workbench/gag.with.guard/bin",
					"urifia.gag.MyCustomGAGGuard"));
		} catch (Exception e) {
			Console.error("Exception on guard evaluation", e);
		}
	}

}

@Aspect(className=Service)
class ServiceAspect {
	def void evaluateAllGuardsForTesting(GagGuardExecutor exec) {
		for (DecompositionRule rule : _self.rules) {
			rule.evaluateAllGuardsForTesting(exec);
		}
	}
}

@Aspect(className=DecompositionRule)
class DecompositionRuleAspect {
	def void evaluateAllGuardsForTesting(GagGuardExecutor exec) {
		/* if (_self.guard !== null)
			Console.debug("Guard for rule " + _self.name + " evaluation result is : " +
				_self.guard.isRuleActivable(exec));*/
	}
}

@Aspect(className=Guard)
class GuardAspect {
	
	def boolean isApplicable( Task t){
		var result=false;
		var funcDec=SpecificationFactory.eINSTANCE.createFunctionDeclaration;
		funcDec.location = _self.location;
		funcDec.method =_self.method;
		var funcCall = ConfigurationFactory.eINSTANCE.createPendingLocalFunctionComputation;
		funcCall.functiondeclaration = funcDec;
		for(i:0 ..<t.inputs.size){
			funcCall.actualParameters.add(t.inputs.get(i));
		}
		//if (funcCall.isExecutable){
			result =funcCall.execute as Boolean ;
		//}
		
		return result;
		
	}
	
	/*def boolean isRuleActivable(GagGuardExecutor exec) {
		if (_self.classPath !== null && !_self.classPath.isEmpty()) {
			try {
				// val String libLocation = _self.libLocation;
				val String libLocation = "E:/PhD Recherche/Fuchsia Team/Fuchsia Dev/runtime-Modeling_Workbench/gag.with.guard/bin";
				return exec.isRuleActivable(libLocation, _self.classPath)
			} catch (Exception e) {
				Console.error("Exception on guard evaluation");
				return false;
			}
		}
		return true;
	}
	* */
	
}

@Aspect(className=SemanticRule)
class SemanticRuleAspect {
}

@Aspect(className=Parameter)
class ParameterAspect {
}
