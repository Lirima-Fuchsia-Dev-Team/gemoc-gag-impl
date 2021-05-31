package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.k3dsa.GagGuardExecutor;
import fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectProperties;
import fr.inria.gag.specification.model.specification.DecompositionRule;

@Aspect(className = DecompositionRule.class)
@SuppressWarnings("all")
public class DecompositionRuleAspect {
  public static void evaluateAllGuardsForTesting(final DecompositionRule _self, final GagGuardExecutor exec) {
    final fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectProperties _self_ = fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateAllGuardsForTesting(GagGuardExecutor)
    if (_self instanceof fr.inria.gag.specification.model.specification.DecompositionRule){
    	fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect._privk3_evaluateAllGuardsForTesting(_self_, (fr.inria.gag.specification.model.specification.DecompositionRule)_self,exec);
    };
  }
  
  protected static void _privk3_evaluateAllGuardsForTesting(final DecompositionRuleAspectDecompositionRuleAspectProperties _self_, final DecompositionRule _self, final GagGuardExecutor exec) {
  }
}
