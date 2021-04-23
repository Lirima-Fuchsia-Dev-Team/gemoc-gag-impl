package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.k3dsa.GagGuardExecutor;
import fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect;
import fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectProperties;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.Service;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Service.class)
@SuppressWarnings("all")
public class ServiceAspect {
  public static void evaluateAllGuardsForTesting(final Service _self, final GagGuardExecutor exec) {
    final fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateAllGuardsForTesting(GagGuardExecutor)
    if (_self instanceof fr.inria.gag.specification.model.specification.Service){
    	fr.inria.gag.k3dsa.specification.aspects.ServiceAspect._privk3_evaluateAllGuardsForTesting(_self_, (fr.inria.gag.specification.model.specification.Service)_self,exec);
    };
  }
  
  protected static void _privk3_evaluateAllGuardsForTesting(final ServiceAspectServiceAspectProperties _self_, final Service _self, final GagGuardExecutor exec) {
    EList<DecompositionRule> _rules = _self.getRules();
    for (final DecompositionRule rule : _rules) {
      DecompositionRuleAspect.evaluateAllGuardsForTesting(rule, exec);
    }
  }
}
