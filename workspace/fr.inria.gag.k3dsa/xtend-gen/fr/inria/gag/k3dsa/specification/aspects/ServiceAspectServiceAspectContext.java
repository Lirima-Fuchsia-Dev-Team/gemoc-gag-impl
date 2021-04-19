package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectProperties;
import fr.inria.gag.specification.model.specification.Service;
import java.util.Map;

@SuppressWarnings("all")
public class ServiceAspectServiceAspectContext {
  public final static ServiceAspectServiceAspectContext INSTANCE = new ServiceAspectServiceAspectContext();
  
  public static ServiceAspectServiceAspectProperties getSelf(final Service _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Service, ServiceAspectServiceAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.Service, fr.inria.gag.k3dsa.specification.aspects.ServiceAspectServiceAspectProperties>();
  
  public Map<Service, ServiceAspectServiceAspectProperties> getMap() {
    return map;
  }
}
