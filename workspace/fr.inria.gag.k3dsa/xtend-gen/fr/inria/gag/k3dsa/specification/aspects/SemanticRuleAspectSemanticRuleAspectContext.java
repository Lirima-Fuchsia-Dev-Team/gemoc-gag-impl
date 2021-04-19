package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspectSemanticRuleAspectProperties;
import fr.inria.gag.specification.model.specification.SemanticRule;
import java.util.Map;

@SuppressWarnings("all")
public class SemanticRuleAspectSemanticRuleAspectContext {
  public final static SemanticRuleAspectSemanticRuleAspectContext INSTANCE = new SemanticRuleAspectSemanticRuleAspectContext();
  
  public static SemanticRuleAspectSemanticRuleAspectProperties getSelf(final SemanticRule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspectSemanticRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SemanticRule, SemanticRuleAspectSemanticRuleAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.SemanticRule, fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspectSemanticRuleAspectProperties>();
  
  public Map<SemanticRule, SemanticRuleAspectSemanticRuleAspectProperties> getMap() {
    return map;
  }
}
