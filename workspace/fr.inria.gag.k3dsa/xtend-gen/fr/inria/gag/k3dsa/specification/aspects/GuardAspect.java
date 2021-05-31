package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspect;
import fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties;
import fr.inria.gag.specification.model.specification.FunctionDeclaration;
import fr.inria.gag.specification.model.specification.Guard;
import fr.inria.gag.specification.model.specification.SpecificationFactory;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public class GuardAspect {
  public static boolean isApplicable(final Guard _self, final Task t) {
    final fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isApplicable(Task)
    if (_self instanceof fr.inria.gag.specification.model.specification.Guard){
    	result = fr.inria.gag.k3dsa.specification.aspects.GuardAspect._privk3_isApplicable(_self_, (fr.inria.gag.specification.model.specification.Guard)_self,t);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isApplicable(final GuardAspectGuardAspectProperties _self_, final Guard _self, final Task t) {
    boolean result = false;
    FunctionDeclaration funcDec = SpecificationFactory.eINSTANCE.createFunctionDeclaration();
    funcDec.setLocation(_self.getLocation());
    funcDec.setMethod(_self.getMethod());
    PendingLocalFunctionComputation funcCall = ConfigurationFactory.eINSTANCE.createPendingLocalFunctionComputation();
    funcCall.setFunctiondeclaration(funcDec);
    int _size = t.getInputs().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      funcCall.getActualParameters().add(t.getInputs().get((i).intValue()));
    }
    Object _execute = PendingLocalFunctionComputationAspect.execute(funcCall);
    result = (((Boolean) _execute)).booleanValue();
    return result;
  }
}
