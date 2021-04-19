package fr.inria.gag.k3dsa.specification.aspects;

import fr.inria.gag.k3dsa.specification.aspects.ParameterAspectParameterAspectProperties;
import fr.inria.gag.specification.model.specification.Parameter;
import java.util.Map;

@SuppressWarnings("all")
public class ParameterAspectParameterAspectContext {
  public final static ParameterAspectParameterAspectContext INSTANCE = new ParameterAspectParameterAspectContext();
  
  public static ParameterAspectParameterAspectProperties getSelf(final Parameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.specification.aspects.ParameterAspectParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Parameter, ParameterAspectParameterAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.specification.model.specification.Parameter, fr.inria.gag.k3dsa.specification.aspects.ParameterAspectParameterAspectProperties>();
  
  public Map<Parameter, ParameterAspectParameterAspectProperties> getMap() {
    return map;
  }
}
