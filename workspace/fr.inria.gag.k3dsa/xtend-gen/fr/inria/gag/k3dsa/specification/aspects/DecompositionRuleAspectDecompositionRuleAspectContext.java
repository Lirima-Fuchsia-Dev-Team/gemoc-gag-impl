package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectProperties;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import java.util.Map;

@SuppressWarnings("all")
public class DecompositionRuleAspectDecompositionRuleAspectContext {
  public final static DecompositionRuleAspectDecompositionRuleAspectContext INSTANCE = new DecompositionRuleAspectDecompositionRuleAspectContext();
  
  public static DecompositionRuleAspectDecompositionRuleAspectProperties getSelf(final DecompositionRule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecompositionRule, DecompositionRuleAspectDecompositionRuleAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.DecompositionRule, fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspectDecompositionRuleAspectProperties>();
  
  public Map<DecompositionRule, DecompositionRuleAspectDecompositionRuleAspectProperties> getMap() {
    return map;
  }
}
