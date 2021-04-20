package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConfigurationAspectConfigurationAspectContext {
  public final static ConfigurationAspectConfigurationAspectContext INSTANCE = new ConfigurationAspectConfigurationAspectContext();
  
  public static ConfigurationAspectConfigurationAspectProperties getSelf(final Configuration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Configuration, ConfigurationAspectConfigurationAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.configuration.model.configuration.Configuration, fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectProperties>();
  
  public Map<Configuration, ConfigurationAspectConfigurationAspectProperties> getMap() {
    return map;
  }
}
