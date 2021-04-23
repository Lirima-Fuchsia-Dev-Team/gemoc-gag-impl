package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TaskAspectTaskAspectContext {
  public final static TaskAspectTaskAspectContext INSTANCE = new TaskAspectTaskAspectContext();
  
  public static TaskAspectTaskAspectProperties getSelf(final Task _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Task, TaskAspectTaskAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.configuration.model.configuration.Task, fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties>();
  
  public Map<Task, TaskAspectTaskAspectProperties> getMap() {
    return map;
  }
}
