package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Task.class)
@SuppressWarnings("all")
public class TaskAspect {
  public static String print(final Task _self) {
    final fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties _self_ = fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String print()
    if (_self instanceof fr.inria.gag.configuration.model.configuration.Task){
    	result = fr.inria.gag.k3dsa.configuration.aspects.TaskAspect._privk3_print(_self_, (fr.inria.gag.configuration.model.configuration.Task)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final TaskAspectTaskAspectProperties _self_, final Task _self) {
    String conf = "";
    String _conf = conf;
    String _name = _self.getService().getName();
    String _plus = (_name + "(isOpen=");
    boolean _isIsOpen = _self.isIsOpen();
    String _plus_1 = (_plus + Boolean.valueOf(_isIsOpen));
    conf = (_conf + _plus_1);
    boolean _isIsOpen_1 = _self.isIsOpen();
    boolean _not = (!_isIsOpen_1);
    if (_not) {
      String _conf_1 = conf;
      String _appliedRule = _self.getAppliedRule();
      String _plus_2 = (", appliedRule=" + _appliedRule);
      conf = (_conf_1 + _plus_2);
    }
    String _conf_2 = conf;
    conf = (_conf_2 + ")[");
    int i = 1;
    EList<Task> _subTasks = _self.getSubTasks();
    for (final Task t : _subTasks) {
      {
        String _conf_3 = conf;
        String _print = TaskAspect.print(t);
        conf = (_conf_3 + _print);
        int _size = _self.getSubTasks().size();
        boolean _lessThan = (i < _size);
        if (_lessThan) {
          String _conf_4 = conf;
          conf = (_conf_4 + ", ");
        }
      }
    }
    String _conf_3 = conf;
    conf = (_conf_3 + "]");
    return conf;
  }
}
