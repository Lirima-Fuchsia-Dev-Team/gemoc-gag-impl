package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.k3dsa.Console;
import fr.inria.gag.k3dsa.GagGuardExecutor;
import fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties;
import fr.inria.gag.specification.model.specification.Guard;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public class GuardAspect {
  public static boolean isRuleActivable(final Guard _self, final GagGuardExecutor exec) {
    final fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isRuleActivable(GagGuardExecutor)
    if (_self instanceof fr.inria.gag.specification.model.specification.Guard){
    	result = fr.inria.gag.k3dsa.specification.aspects.GuardAspect._privk3_isRuleActivable(_self_, (fr.inria.gag.specification.model.specification.Guard)_self,exec);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isRuleActivable(final GuardAspectGuardAspectProperties _self_, final Guard _self, final GagGuardExecutor exec) {
    if (((_self.getClassPath() != null) && (!_self.getClassPath().isEmpty()))) {
      try {
        final String libLocation = "F:/Workspace/Fuchsia/gemoc-gag-impl/runtime-Modeling_Workbench/gag.with.guard/bin";
        return exec.isRuleActivable(libLocation, _self.getClassPath());
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          Console.error("Exception on guard evaluation");
          return false;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return true;
  }
}
