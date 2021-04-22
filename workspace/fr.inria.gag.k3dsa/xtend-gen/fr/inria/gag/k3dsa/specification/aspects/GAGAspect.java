package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.Console;
import fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.GAG;
import fr.inria.gag.specification.model.specification.RuntimeData;
import fr.inria.gag.specification.model.specification.Service;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
        openTask = GAGAspect.getOpenTask(_self, conf.getRoot());
      }
    }
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
    Console.debug("Veillez choisir le service axiome de démarrage parmi les services suivants : ");
    String txtAf = "";
    int _size_1 = axioms.size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        Service _get = axioms.get((i_1).intValue());
        final Service element = ((Service) _get);
        String _txtAf = txtAf;
        String _name = element.getName();
        String _plus = (((" " + Integer.valueOf(((i_1).intValue() + 1))) + "- ") + _name);
        txtAf = (_txtAf + _plus);
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
  }
  
  protected static Task _privk3_chooseTask(final GAGAspectGAGAspectProperties _self_, final GAG _self, final ArrayList<Task> openTasks) {
    RuntimeData _configuration = _self.getConfiguration();
    final Configuration conf = ((Configuration) _configuration);
    Console.debug("Veillez choisir la tâche à traiter parmi les tâches suivantes : ");
    String txtAf = "";
    int _size = openTasks.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Task element = openTasks.get((i).intValue());
        String _txtAf = txtAf;
        String _name = element.getService().getName();
        String _plus = (((" " + Integer.valueOf(((i).intValue() + 1))) + "- ") + _name);
        txtAf = (_txtAf + _plus);
      }
    }
    final String choice = Console.readConsoleLine(txtAf);
    final int id = Integer.parseInt(choice);
    return openTasks.get((id - 1));
  }
  
  protected static DecompositionRule _privk3_chooseRule(final GAGAspectGAGAspectProperties _self_, final GAG _self, final Task t) {
    Console.debug("Veillez choisir la règle de décomposition à appliquer parmi les règles suivantes : ");
    String txtAf = "";
    int _size = t.getService().getRules().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final DecompositionRule element = t.getService().getRules().get((i).intValue());
        String _txtAf = txtAf;
        String _name = element.getName();
        String _plus = (((" " + Integer.valueOf(((i).intValue() + 1))) + "- ") + _name);
        txtAf = (_txtAf + _plus);
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
        final Task st = ConfigurationFactory.eINSTANCE.createTask();
        st.setService(element);
        st.setIsOpen(true);
        t.getSubTasks().add(st);
      }
    }
  }
}
