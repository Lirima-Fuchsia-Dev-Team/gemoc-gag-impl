package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.k3dsa.Console;
import fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties;
import fr.inria.gag.specification.model.specification.GAG;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

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
  
  protected static void _privk3_initializeModel(final GAGAspectGAGAspectProperties _self_, final GAG _self, final EList<String> args) {
    final Configuration configuration = ConfigurationFactory.eINSTANCE.createConfiguration();
    configuration.setRoot(ConfigurationFactory.eINSTANCE.createTask());
  }
  
  protected static void _privk3_run(final GAGAspectGAGAspectProperties _self_, final GAG _self) {
    URI _uRI = _self.eResource().getURI();
    String _plus = ("Hello world on " + _uRI);
    Console.debug(_plus);
  }
}
