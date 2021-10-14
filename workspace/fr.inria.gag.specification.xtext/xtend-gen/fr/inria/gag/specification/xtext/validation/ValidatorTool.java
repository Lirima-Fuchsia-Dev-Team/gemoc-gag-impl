package fr.inria.gag.specification.xtext.validation;

import com.google.common.base.Objects;
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.Equation;
import fr.inria.gag.specification.model.specification.Expression;
import fr.inria.gag.specification.model.specification.FunctionExpression;
import fr.inria.gag.specification.model.specification.IdExpression;
import fr.inria.gag.specification.model.specification.LeftPartExpression;
import fr.inria.gag.specification.model.specification.LocalData;
import fr.inria.gag.specification.model.specification.Service;
import fr.inria.gag.specification.xtext.validation.Dependency;
import fr.inria.gag.specification.xtext.validation.EncapsulatedValue;
import fr.inria.gag.specification.xtext.validation.ServiceInterface;
import fr.inria.gag.specification.xtext.validation.ValidatorToolBase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class ValidatorTool {
  public ServiceInterface getRuleInterface(final DecompositionRule rule) {
    EObject _eContainer = rule.eContainer();
    Service service = ((Service) _eContainer);
    Task t = ConfigurationFactory.eINSTANCE.createTask();
    ValidatorToolBase.initTask(t, service);
    int _size = rule.getSubServices().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Service element = rule.getSubServices().get((i).intValue());
        Task st = ConfigurationFactory.eINSTANCE.createTask();
        ValidatorToolBase.initTask(st, element);
        t.getSubTasks().add(st);
      }
    }
    ArrayList<Task> context = new ArrayList<Task>();
    Hashtable<String, Data> variablesNameMap = new Hashtable<String, Data>();
    ArrayList<PendingLocalFunctionComputation> localFunctions = new ArrayList<PendingLocalFunctionComputation>();
    Hashtable<String, Pair<Data, Object>> assignments = new Hashtable<String, Pair<Data, Object>>();
    context.add(t);
    context.addAll(t.getSubTasks());
    boolean continue_ = true;
    int _size_1 = rule.getSemantic().getEquations().size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      if (continue_) {
        Equation eq = rule.getSemantic().getEquations().get((i_1).intValue());
        Data data1 = ((Data) null);
        String leftVariableName = ((String) null);
        LeftPartExpression _leftpart = eq.getLeftpart();
        if ((_leftpart instanceof IdExpression)) {
          LeftPartExpression _leftpart_1 = eq.getLeftpart();
          IdExpression eql = ((IdExpression) _leftpart_1);
          String _serviceName = eql.getServiceName();
          String _parameterName = eql.getParameterName();
          String[] ref1 = new String[] { _serviceName, _parameterName };
          data1 = ValidatorToolBase.findReference(ref1, context);
          if ((data1 == null)) {
            continue_ = false;
          } else {
            String _serviceName_1 = eql.getServiceName();
            String _plus = (_serviceName_1 + ".");
            String _parameterName_1 = eql.getParameterName();
            leftVariableName = (_plus + _parameterName_1).trim();
            variablesNameMap.put(leftVariableName, data1);
          }
        } else {
          LeftPartExpression _leftpart_2 = eq.getLeftpart();
          LocalData eql_1 = ((LocalData) _leftpart_2);
          data1 = variablesNameMap.get(eql_1.getName().trim());
          if ((data1 == null)) {
            leftVariableName = eql_1.getName().trim();
            data1 = ConfigurationFactory.eINSTANCE.createData();
            EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
            data1.setValue(_encapsulatedValue);
            variablesNameMap.put(eql_1.getName().trim(), data1);
          } else {
            continue_ = false;
          }
        }
        if (continue_) {
          Expression _rightpart = eq.getRightpart();
          if ((_rightpart instanceof LeftPartExpression)) {
            Data data2 = ((Data) null);
            Expression _rightpart_1 = eq.getRightpart();
            if ((_rightpart_1 instanceof IdExpression)) {
              Expression _rightpart_2 = eq.getRightpart();
              final IdExpression rightPartIdExpression = ((IdExpression) _rightpart_2);
              String _serviceName_2 = rightPartIdExpression.getServiceName();
              String _parameterName_2 = rightPartIdExpression.getParameterName();
              final String[] ref2 = new String[] { _serviceName_2, _parameterName_2 };
              data2 = ValidatorToolBase.findReference(ref2, context);
              if ((data2 == null)) {
                continue_ = false;
              } else {
                String _trim = ref2[0].trim();
                String _plus_1 = (_trim + ".");
                String _trim_1 = ref2[1].trim();
                String variableName = (_plus_1 + _trim_1).trim();
                variablesNameMap.put(variableName, data2);
              }
            } else {
              Expression _rightpart_3 = eq.getRightpart();
              LocalData eqr = ((LocalData) _rightpart_3);
              data2 = variablesNameMap.get(eqr.getName().trim());
              boolean _equals = Objects.equal(data2, null);
              if (_equals) {
                data2 = ConfigurationFactory.eINSTANCE.createData();
                EncapsulatedValue _encapsulatedValue_1 = new EncapsulatedValue();
                data2.setValue(_encapsulatedValue_1);
                variablesNameMap.put(eqr.getName().trim(), data2);
              }
            }
            Object _value = data1.getValue();
            EncapsulatedValue ecData1 = ((EncapsulatedValue) _value);
            Object _value_1 = data2.getValue();
            ecData1.addReference(((EncapsulatedValue) _value_1));
            Pair<Data, Object> _pair = new Pair<Data, Object>(data1, data2);
            assignments.put(leftVariableName, _pair);
          } else {
            Expression _rightpart_4 = eq.getRightpart();
            FunctionExpression func = ((FunctionExpression) _rightpart_4);
            Object _value_2 = data1.getValue();
            EncapsulatedValue ecData1_1 = ((EncapsulatedValue) _value_2);
            PendingLocalFunctionComputation runningFunction = ConfigurationFactory.eINSTANCE.createPendingLocalFunctionComputation();
            runningFunction.setDataToCompute(data1);
            runningFunction.setFunctiondeclaration(func.getFunction());
            int _size_2 = func.getExpressions().size();
            ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
            for (final Integer k : _doubleDotLessThan_2) {
              {
                LeftPartExpression elId = func.getExpressions().get((k).intValue());
                Data data = ((Data) null);
                if ((elId instanceof IdExpression)) {
                  String _serviceName_3 = ((IdExpression) elId).getServiceName();
                  String _parameterName_3 = ((IdExpression) elId).getParameterName();
                  final String[] ref = new String[] { _serviceName_3, _parameterName_3 };
                  data = ValidatorToolBase.findReference(ref, context);
                  if ((data == null)) {
                    continue_ = false;
                  } else {
                    String _trim_2 = ref[0].trim();
                    String _plus_2 = (_trim_2 + ".");
                    String _trim_3 = ref[1].trim();
                    String variableName_1 = (_plus_2 + _trim_3).trim();
                    variablesNameMap.put(variableName_1, data);
                  }
                } else {
                  data = variablesNameMap.get(((LocalData) elId).getName().trim());
                  if ((data == null)) {
                    data = ConfigurationFactory.eINSTANCE.createData();
                    EncapsulatedValue _encapsulatedValue_2 = new EncapsulatedValue();
                    data.setValue(_encapsulatedValue_2);
                    variablesNameMap.put(((LocalData) elId).getName().trim(), data);
                  }
                }
                runningFunction.getActualParameters().add(data);
              }
            }
            localFunctions.add(runningFunction);
            Pair<Data, Object> _pair_1 = new Pair<Data, Object>(data1, runningFunction);
            assignments.put(leftVariableName, _pair_1);
          }
        }
      }
    }
    ServiceInterface inter = this.getServiceInterfaceFromSpecificsData(rule, t, assignments, ValidatorToolBase.reverseStringDataHashtable(variablesNameMap));
    return inter;
  }
  
  public ServiceInterface getServiceInterfaceFromSpecificsData(final DecompositionRule rule, final Task baseTask, final Hashtable<String, Pair<Data, Object>> assignments, final Hashtable<Data, String> variablesMap) {
    ServiceInterface inter = new ServiceInterface();
    EObject _eContainer = rule.eContainer();
    Service service = ((Service) _eContainer);
    int _size = baseTask.getOutputs().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Data data = baseTask.getOutputs().get((i).intValue());
        Dependency dependency = new Dependency();
        String _name = service.getName();
        String _plus = (_name + ".");
        String _name_1 = data.getParameter().getName();
        String _plus_1 = (_plus + _name_1);
        dependency.setOutParameter(_plus_1);
        String _outParameter = dependency.getOutParameter();
        HashSet<String> _hashSet = new HashSet<String>();
        dependency.getInParameters().addAll(
          this.getAllDependenciesFromVariableName(_outParameter, assignments, variablesMap, _hashSet));
        inter.addDependency(dependency);
      }
    }
    return inter;
  }
  
  public HashSet<String> getAllDependenciesFromVariableName(final String variableName, final Hashtable<String, Pair<Data, Object>> assignments, final Hashtable<Data, String> variablesMap, final HashSet<String> treatedDependency) {
    HashSet<String> hset = new HashSet<String>();
    Pair<Data, Object> ref = assignments.get(variableName);
    if ((ref != null)) {
      Object d = ref.getValue();
      if ((d instanceof Data)) {
        String dependenceSt = variablesMap.get(((Data) d));
        if ((((dependenceSt != null) && (!hset.contains(dependenceSt))) && (!treatedDependency.contains(dependenceSt)))) {
          hset.add(dependenceSt);
          treatedDependency.add(dependenceSt);
          HashSet<String> nextDependencies = this.getAllDependenciesFromVariableName(dependenceSt, assignments, variablesMap, treatedDependency);
          hset.addAll(nextDependencies);
        }
      } else {
        PendingLocalFunctionComputation mfunction = ((PendingLocalFunctionComputation) d);
        int _size = mfunction.getActualParameters().size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer i : _doubleDotLessThan) {
          {
            Data element = mfunction.getActualParameters().get((i).intValue());
            String dependenceSt_1 = variablesMap.get(element);
            if ((((dependenceSt_1 != null) && (!hset.contains(dependenceSt_1))) && (!treatedDependency.contains(dependenceSt_1)))) {
              hset.add(dependenceSt_1);
              treatedDependency.add(dependenceSt_1);
              HashSet<String> nextDependencies_1 = this.getAllDependenciesFromVariableName(dependenceSt_1, assignments, variablesMap, treatedDependency);
              hset.addAll(nextDependencies_1);
            }
          }
        }
      }
    }
    return hset;
  }
}
