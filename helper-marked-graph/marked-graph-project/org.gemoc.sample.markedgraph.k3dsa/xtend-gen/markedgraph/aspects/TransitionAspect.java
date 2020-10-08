package markedgraph.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import markedgraph.Place;
import markedgraph.Transition;
import markedgraph.aspects.TransitionAspectTransitionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void fire(final Transition _self) {
    final markedgraph.aspects.TransitionAspectTransitionAspectProperties _self_ = markedgraph.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_fire(_self_, _self);;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Transition " + _name);
    String _plus_1 = (_plus + ": fired.");
    InputOutput.<String>println(_plus_1);
    EList<Place> _inputs = _self.getInputs();
    final Consumer<Place> _function = (Place it) -> {
      int _runtimeTokenCount = it.getRuntimeTokenCount();
      int _minus = (_runtimeTokenCount - 1);
      it.setRuntimeTokenCount(_minus);
    };
    _inputs.forEach(_function);
    EList<Place> _outputs = _self.getOutputs();
    final Consumer<Place> _function_1 = (Place it) -> {
      int _runtimeTokenCount = it.getRuntimeTokenCount();
      int _plus_2 = (_runtimeTokenCount + 1);
      it.setRuntimeTokenCount(_plus_2);
    };
    _outputs.forEach(_function_1);
  }
}
