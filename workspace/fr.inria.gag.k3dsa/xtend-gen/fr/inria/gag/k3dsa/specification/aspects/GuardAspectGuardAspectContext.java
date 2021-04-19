package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties;
import fr.inria.gag.specification.model.specification.Guard;
import java.util.Map;

@SuppressWarnings("all")
public class GuardAspectGuardAspectContext {
  public final static GuardAspectGuardAspectContext INSTANCE = new GuardAspectGuardAspectContext();
  
  public static GuardAspectGuardAspectProperties getSelf(final Guard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Guard, GuardAspectGuardAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.Guard, fr.inria.gag.k3dsa.specification.aspects.GuardAspectGuardAspectProperties>();
  
  public Map<Guard, GuardAspectGuardAspectProperties> getMap() {
    return map;
  }
}
