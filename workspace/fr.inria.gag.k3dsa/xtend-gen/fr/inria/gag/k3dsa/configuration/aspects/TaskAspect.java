package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.k3dsa.configuration.aspects.DataAspect;
import fr.inria.gag.k3dsa.configuration.aspects.TaskAspectTaskAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

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
    String _plus = (_name + "(");
    conf = (_conf + _plus);
    boolean _isIsOpen = _self.isIsOpen();
    boolean _not = (!_isIsOpen);
    if (_not) {
      String _conf_1 = conf;
      String _appliedRule = _self.getAppliedRule();
      String _plus_1 = (" appliedRule=" + _appliedRule);
      conf = (_conf_1 + _plus_1);
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
    } else {
      int _size = _self.getInputs().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i_1 : _doubleDotLessThan) {
        {
          final Data el = _self.getInputs().get((i_1).intValue());
          String _conf_4 = conf;
          String _print = DataAspect.print(el);
          conf = (_conf_4 + _print);
          int _size_1 = _self.getInputs().size();
          int _minus = (_size_1 - 1);
          boolean _lessThan = ((i_1).intValue() < _minus);
          if (_lessThan) {
            String _conf_5 = conf;
            conf = (_conf_5 + ", ");
          }
        }
      }
      String _conf_4 = conf;
      conf = (_conf_4 + ")[");
      int _size_1 = _self.getOutputs().size();
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
      for (final Integer i_2 : _doubleDotLessThan_1) {
        {
          final Data el = _self.getOutputs().get((i_2).intValue());
          String _conf_5 = conf;
          String _print = DataAspect.print(el);
          conf = (_conf_5 + _print);
          int _size_2 = _self.getOutputs().size();
          int _minus = (_size_2 - 1);
          boolean _lessThan = ((i_2).intValue() < _minus);
          if (_lessThan) {
            String _conf_6 = conf;
            conf = (_conf_6 + ", ");
          }
        }
      }
      String _conf_5 = conf;
      conf = (_conf_5 + "]");
    }
    return conf;
  }
}
