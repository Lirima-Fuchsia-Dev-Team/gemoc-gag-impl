package markedgraph.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import markedgraph.MarkedGraph;
import markedgraph.Place;
import markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectProperties;
import markedgraph.aspects.PlaceAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = MarkedGraph.class)
@SuppressWarnings("all")
public class MarkedGraphAspect {
  public static void initialize(final MarkedGraph _self) {
    final markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectProperties _self_ = markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  protected static void _privk3_initialize(final MarkedGraphAspectMarkedGraphAspectProperties _self_, final MarkedGraph _self) {
    String _name = _self.getName();
    String _plus = ("Graph " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    EList<Place> _places = _self.getPlaces();
    final Consumer<Place> _function = (Place pl) -> {
      PlaceAspect.initialize(pl);
    };
    _places.forEach(_function);
  }
}
