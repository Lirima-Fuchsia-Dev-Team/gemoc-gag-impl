package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectProperties;
import fr.inria.gag.k3dsa.configuration.aspects.TaskAspect;

@Aspect(className = Configuration.class)
@SuppressWarnings("all")
public class ConfigurationAspect {
  public static String print(final Configuration _self) {
    final fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectProperties _self_ = fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspectConfigurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String print()
    if (_self instanceof fr.inria.gag.configuration.model.configuration.Configuration){
    	result = fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspect._privk3_print(_self_, (fr.inria.gag.configuration.model.configuration.Configuration)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final ConfigurationAspectConfigurationAspectProperties _self_, final Configuration _self) {
    return TaskAspect.print(_self.getRoot());
  }
}
