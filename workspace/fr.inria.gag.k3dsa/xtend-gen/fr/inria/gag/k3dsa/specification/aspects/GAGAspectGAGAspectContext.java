package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties;
import fr.inria.gag.specification.model.specification.GAG;
import java.util.Map;

@SuppressWarnings("all")
public class GAGAspectGAGAspectContext {
  public final static GAGAspectGAGAspectContext INSTANCE = new GAGAspectGAGAspectContext();
  
  public static GAGAspectGAGAspectProperties getSelf(final GAG _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GAG, GAGAspectGAGAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.GAG, fr.inria.gag.k3dsa.specification.aspects.GAGAspectGAGAspectProperties>();
  
  public Map<GAG, GAGAspectGAGAspectProperties> getMap() {
    return map;
  }
}
