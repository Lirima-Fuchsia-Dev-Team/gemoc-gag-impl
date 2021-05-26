package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class DataAspectDataAspectContext {
  public final static DataAspectDataAspectContext INSTANCE = new DataAspectDataAspectContext();
  
  public static DataAspectDataAspectProperties getSelf(final Data _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Data, DataAspectDataAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.configuration.model.configuration.Data, fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectProperties>();
  
  public Map<Data, DataAspectDataAspectProperties> getMap() {
    return map;
  }
}
