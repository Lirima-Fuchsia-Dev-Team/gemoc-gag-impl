package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.Console;
import fr.inria.gag.k3dsa.EncapsulatedValue;
import fr.inria.gag.k3dsa.GagGuardExecutor;
import fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspect;
import fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties;
import fr.inria.gag.k3dsa.specification.aspects.ServiceAspect;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.Equation;
import fr.inria.gag.specification.model.specification.Expression;
import fr.inria.gag.specification.model.specification.FunctionExpression;
import fr.inria.gag.specification.model.specification.GAG;
import fr.inria.gag.specification.model.specification.IdExpression;
import fr.inria.gag.specification.model.specification.RuntimeData;
import fr.inria.gag.specification.model.specification.Service;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@Aspect(className = GAG.class)
@SuppressWarnings("all")
public class GAGAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final GAG _self, final EList<String> args) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_initializeModel(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "GAG", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Main
  public static void run(final GAG _self) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run()
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_run(_self_, (fr.inria.gag.specification.model.specification.GAG)_self);
    };
  }
  
  @Step
  public static void chooseTheAxiom(final GAG _self) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void chooseTheAxiom()
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_chooseTheAxiom(_self_, (fr.inria.gag.specification.model.specification.GAG)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "GAG", "chooseTheAxiom");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static Task chooseTask(final GAG _self, final ArrayList<Task> openTasks) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Task chooseTask(ArrayList<Task>)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_chooseTask(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,openTasks));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {openTasks}, command, "GAG", "chooseTask");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (fr.inria.gag.configuration.model.configuration.Task)result;
  }
  
  @Step
  public static DecompositionRule chooseRule(final GAG _self, final Task t) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# DecompositionRule chooseRule(Task)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_chooseRule(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,t));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {t}, command, "GAG", "chooseRule");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (fr.inria.gag.specification.model.specification.DecompositionRule)result;
  }
  
  public static ArrayList<Task> getOpenTask(final GAG _self, final Task root) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<Task> getOpenTask(Task)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	result = fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_getOpenTask(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,root);
    };
    return (java.util.ArrayList<fr.inria.gag.configuration.model.configuration.Task>)result;
  }
  
  @Step
  public static void applyRule(final GAG _self, final Task t, final DecompositionRule r) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void applyRule(Task,DecompositionRule)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_applyRule(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,t,r);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {t,r}, command, "GAG", "applyRule");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static Data findReference(final GAG _self, final String[] ref, final ArrayList<Task> tasks) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Data findReference(String[],ArrayList<Task>)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	result = fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_findReference(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,ref,tasks);
    };
    return (fr.inria.gag.configuration.model.configuration.Data)result;
  }
  
  public static void initTask(final GAG _self, final Task t, final Service s) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initTask(Task,Service)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_initTask(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,t,s);
    };
  }
  
  public static void evaluateAllGuardsForTesting(final GAG _self) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateAllGuardsForTesting()
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_evaluateAllGuardsForTesting(_self_, (fr.inria.gag.specification.model.specification.GAG)_self);
    };
  }
  
  public static void staticGuardEvalForTesting(final GAG _self) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void staticGuardEvalForTesting()
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_staticGuardEvalForTesting(_self_, (fr.inria.gag.specification.model.specification.GAG)_self);
    };
  }
  
  public static GagGuardExecutor exec(final GAG _self) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# GagGuardExecutor exec()
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	result = fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_exec(_self_, (fr.inria.gag.specification.model.specification.GAG)_self);
    };
    return (fr.inria.gag.k3dsa.GagGuardExecutor)result;
  }
  
  public static void exec(final GAG _self, final GagGuardExecutor exec) {
    final fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(GagGuardExecutor)
    if (_self instanceof fr.inria.gag.specification.model.specification.GAG){
    	fr.inria.gag.k3dsa.specification.aspects.GAGAspect._privk3_exec(_self_, (fr.inria.gag.specification.model.specification.GAG)_self,exec);
    };
  }
  
  protected static void _privk3_initializeModel(final GAGAspectGAGAspectProperties _self_, final GAG _self, final EList<String> args) {
    final Configuration configuration = ConfigurationFactory.eINSTANCE.createConfiguration();
    _self.setConfiguration(configuration);
  }
  
  protected static void _privk3_run(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    URI _uRI = _self.eResource().getURI();
    String _plus = ("Hello world on " + _uRI);
    Console.debug(_plus);
    RuntimeData _configuration = _self.getConfiguration();
    final Configuration conf = ((Configuration) _configuration);
    GAGAspect.chooseTheAxiom(_self);
    ArrayList<Task> openTask = GAGAspect.getOpenTask(_self, conf.getRoot());
    while ((openTask.size() != 0)) {
      {
        Task task = GAGAspect.chooseTask(_self, openTask);
        DecompositionRule rule = GAGAspect.chooseRule(_self, task);
        GAGAspect.applyRule(_self, task, rule);
        String _print = ConfigurationAspect.print(conf);
        String _plus_1 = ("La configuration resultante est " + _print);
        Console.debug(_plus_1);
        openTask = GAGAspect.getOpenTask(_self, conf.getRoot());
      }
    }
    Console.debug("Exécution terminée !");
  }
  
  protected static void _privk3_chooseTheAxiom(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    final EList<Service> services = _self.getServices();
    final ArrayList<Service> axioms = new ArrayList<Service>();
    int _size = services.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Service element = services.get((i).intValue());
        boolean _isIsAxiom = element.isIsAxiom();
        if (_isIsAxiom) {
          axioms.add(services.get((i).intValue()));
        }
      }
    }
    Console.debug("Veuillez choisir le service axiome de démarrage parmi les services suivants : ");
    String txtAf = "";
    int _size_1 = axioms.size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        Service _get = axioms.get((i_1).intValue());
        final Service element = ((Service) _get);
        String _plus = (Integer.valueOf(((i_1).intValue() + 1)) + "- ");
        String _name = element.getName();
        String _plus_1 = (_plus + _name);
        Console.debug(_plus_1);
      }
    }
    final String choice = Console.readConsoleLine(txtAf);
    final int id = Integer.parseInt(choice);
    Service _get = axioms.get((id - 1));
    final Service serviceChoice = ((Service) _get);
    RuntimeData _configuration = _self.getConfiguration();
    final Configuration conf = ((Configuration) _configuration);
    conf.setRoot(ConfigurationFactory.eINSTANCE.createTask());
    Task _root = conf.getRoot();
    _root.setService(serviceChoice);
    Console.debug("Veuillez fournir les valeurs des entrées de l\'axiome ");
    int _size_2 = conf.getRoot().getService().getInputParameters().size();
    ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
    for (final Integer i_2 : _doubleDotLessThan_2) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(conf.getRoot().getService().getInputParameters().get((i_2).intValue()));
        String _name = data.getParameter().getName();
        String _plus = ("Veuillez entrer la valeur du paramètre " + _name);
        Console.debug(_plus);
        String _readConsoleLine = Console.readConsoleLine("");
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue(_readConsoleLine);
        data.setValue(_encapsulatedValue);
        conf.getRoot().getInputs().add(data);
      }
    }
    int _size_3 = conf.getRoot().getService().getOutputParameters().size();
    ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _size_3, true);
    for (final Integer i_3 : _doubleDotLessThan_3) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(conf.getRoot().getService().getOutputParameters().get((i_3).intValue()));
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
        data.setValue(_encapsulatedValue);
        conf.getRoot().getOutputs().add(data);
      }
    }
  }
  
  protected static Task _privk3_chooseTask(final GAGAspectGAGAspectProperties _self_, final GAG _self, final ArrayList<Task> openTasks) {
    Console.debug("Veuillez choisir la tâche à traiter parmi les tâches suivantes : ");
    String txtAf = "";
    int _size = openTasks.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Task element = openTasks.get((i).intValue());
        String _plus = (Integer.valueOf(((i).intValue() + 1)) + "- ");
        String _name = element.getService().getName();
        String _plus_1 = (_plus + _name);
        Console.debug(_plus_1);
      }
    }
    final String choice = Console.readConsoleLine(txtAf);
    final int id = Integer.parseInt(choice);
    return openTasks.get((id - 1));
  }
  
  protected static DecompositionRule _privk3_chooseRule(final GAGAspectGAGAspectProperties _self_, final GAG _self, final Task t) {
    Console.debug("Veuillez choisir la règle de décomposition à appliquer parmi les règles suivantes : ");
    String txtAf = "";
    int _size = t.getService().getRules().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final DecompositionRule element = t.getService().getRules().get((i).intValue());
        String _plus = (Integer.valueOf(((i).intValue() + 1)) + "- ");
        String _name = element.getName();
        String _plus_1 = (_plus + _name);
        Console.debug(_plus_1);
      }
    }
    final String choice = Console.readConsoleLine(txtAf);
    final int id = Integer.parseInt(choice);
    final DecompositionRule rule = t.getService().getRules().get((id - 1));
    return rule;
  }
  
  protected static ArrayList<Task> _privk3_getOpenTask(final GAGAspectGAGAspectProperties _self_, final GAG _self, final Task root) {
    final ArrayList<Task> openTasks = new ArrayList<Task>();
    boolean _isIsOpen = root.isIsOpen();
    if (_isIsOpen) {
      openTasks.add(root);
    } else {
      int _size = root.getSubTasks().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final Task element = root.getSubTasks().get((i).intValue());
          final ArrayList<Task> subOpenTasks = GAGAspect.getOpenTask(_self, element);
          openTasks.addAll(subOpenTasks);
        }
      }
    }
    return openTasks;
  }
  
  protected static void _privk3_applyRule(final GAGAspectGAGAspectProperties _self_, final GAG _self, final Task t, final DecompositionRule r) {
    t.setAppliedRule(r.getName());
    t.setIsOpen(false);
    int _size = r.getSubServices().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Service element = r.getSubServices().get((i).intValue());
        Task st = ConfigurationFactory.eINSTANCE.createTask();
        GAGAspect.initTask(_self, st, element);
        t.getSubTasks().add(st);
      }
    }
    ArrayList<Task> context = new ArrayList<Task>();
    context.add(t);
    context.addAll(t.getSubTasks());
    int _size_1 = r.getSemantic().getEquations().size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        Equation eq = r.getSemantic().getEquations().get((i_1).intValue());
        String _serviceName = eq.getLeftpart().getServiceName();
        String _parameterName = eq.getLeftpart().getParameterName();
        String[] ref1 = new String[] { _serviceName, _parameterName };
        Data data1 = GAGAspect.findReference(_self, ref1, context);
        Expression _rightpart = eq.getRightpart();
        if ((_rightpart instanceof IdExpression)) {
          Data data2 = ((Data) null);
          Expression _rightpart_1 = eq.getRightpart();
          final IdExpression rightPartIdExpression = ((IdExpression) _rightpart_1);
          String _serviceName_1 = rightPartIdExpression.getServiceName();
          String _parameterName_1 = rightPartIdExpression.getParameterName();
          final String[] ref2 = new String[] { _serviceName_1, _parameterName_1 };
          data2 = GAGAspect.findReference(_self, ref2, context);
          Object _value = data1.getValue();
          EncapsulatedValue ecData1 = ((EncapsulatedValue) _value);
          Object _value_1 = data2.getValue();
          ecData1.addReference(((EncapsulatedValue) _value_1));
        } else {
          Expression _rightpart_2 = eq.getRightpart();
          FunctionExpression func = ((FunctionExpression) _rightpart_2);
          Object _value_2 = data1.getValue();
          EncapsulatedValue ecData1_1 = ((EncapsulatedValue) _value_2);
          boolean _equals = func.getFunction().getName().equals("g");
          if (_equals) {
            ecData1_1.setValue(Integer.valueOf(8));
          } else {
            ecData1_1.setValue(Integer.valueOf(7));
          }
        }
      }
    }
  }
  
  protected static Data _privk3_findReference(final GAGAspectGAGAspectProperties _self_, final GAG _self, final String[] ref, final ArrayList<Task> tasks) {
    Data objectRef = ((Data) null);
    String serviceName = ref[0].toString().trim();
    String serviceParameter = ref[1].toString().trim();
    int _size = tasks.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Task element = tasks.get((i).intValue());
        boolean _equals = element.getService().getName().equals(serviceName);
        if (_equals) {
          int _size_1 = element.getInputs().size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
          for (final Integer j : _doubleDotLessThan_1) {
            boolean _equals_1 = element.getInputs().get((j).intValue()).getParameter().getName().equals(serviceParameter);
            if (_equals_1) {
              objectRef = element.getInputs().get((j).intValue());
            }
          }
          int _size_2 = element.getOutputs().size();
          ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
          for (final Integer j_1 : _doubleDotLessThan_2) {
            boolean _equals_2 = element.getOutputs().get((j_1).intValue()).getParameter().getName().equals(serviceParameter);
            if (_equals_2) {
              objectRef = element.getOutputs().get((j_1).intValue());
            }
          }
        }
      }
    }
    return objectRef;
  }
  
  protected static void _privk3_initTask(final GAGAspectGAGAspectProperties _self_, final GAG _self, final Task t, final Service s) {
    t.setService(s);
    t.setIsOpen(true);
    int _size = s.getInputParameters().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(s.getInputParameters().get((i).intValue()));
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
        data.setValue(_encapsulatedValue);
        t.getInputs().add(data);
      }
    }
    int _size_1 = s.getOutputParameters().size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(s.getOutputParameters().get((i_1).intValue()));
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
        data.setValue(_encapsulatedValue);
        t.getOutputs().add(data);
      }
    }
  }
  
  protected static void _privk3_evaluateAllGuardsForTesting(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    URI _uRI = _self.eResource().getURI();
    String _plus = ("Trying guard evaluation on " + _uRI);
    Console.debug(_plus);
    EList<Service> _services = _self.getServices();
    for (final Service service : _services) {
      ServiceAspect.evaluateAllGuardsForTesting(service, GAGAspect.exec(_self));
    }
  }
  
  protected static void _privk3_staticGuardEvalForTesting(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    URI _uRI = _self.eResource().getURI();
    String _plus = ("Trying static guard evaluation on " + _uRI);
    Console.debug(_plus);
    try {
      boolean _isRuleActivable = GAGAspect.exec(_self).isRuleActivable("E:/PhD Recherche/Fuchsia Team/Fuchsia Dev/runtime-Modeling_Workbench/gag.with.guard/bin", "urifia.gag.MyCustomGAGGuard");
      String _plus_1 = ("Fixed guard evaluation result is : " + Boolean.valueOf(_isRuleActivable));
      Console.debug(_plus_1);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        Console.error("Exception on guard evaluation", e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static GagGuardExecutor _privk3_exec(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getExec") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.inria.gag.k3dsa.GagGuardExecutor) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.exec;
  }
  
  protected static void _privk3_exec(final GAGAspectGAGAspectProperties _self_, final GAG _self, final GagGuardExecutor exec) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setExec")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, exec);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.exec = exec;
    }
  }
}
