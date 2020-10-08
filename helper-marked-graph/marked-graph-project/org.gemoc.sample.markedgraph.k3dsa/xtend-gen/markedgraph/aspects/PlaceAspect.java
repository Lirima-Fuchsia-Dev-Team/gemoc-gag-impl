package markedgraph.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import markedgraph.Place;
import markedgraph.aspects.PlaceAspectPlaceAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Place.class)
@SuppressWarnings("all")
public class PlaceAspect {
  public static void initialize(final Place _self) {
    final markedgraph.aspects.PlaceAspectPlaceAspectProperties _self_ = markedgraph.aspects.PlaceAspectPlaceAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  public static int runtimeTokenCount(final Place _self) {
    final markedgraph.aspects.PlaceAspectPlaceAspectProperties _self_ = markedgraph.aspects.PlaceAspectPlaceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_runtimeTokenCount(_self_, _self);;
    return (int)result;
  }
  
  public static void runtimeTokenCount(final Place _self, final int runtimeTokenCount) {
    final markedgraph.aspects.PlaceAspectPlaceAspectProperties _self_ = markedgraph.aspects.PlaceAspectPlaceAspectContext.getSelf(_self);
    _privk3_runtimeTokenCount(_self_, _self,runtimeTokenCount);;
  }
  
  protected static void _privk3_initialize(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    String _name = _self.getName();
    String _plus = ("Place " + _name);
    String _plus_1 = (_plus + ": initialized.");
    InputOutput.<String>println(_plus_1);
    int _tokenCount = _self.getTokenCount();
    _self.setRuntimeTokenCount(_tokenCount);
  }
  
  protected static int _privk3_runtimeTokenCount(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRuntimeTokenCount") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.runtimeTokenCount;
  }
  
  protected static void _privk3_runtimeTokenCount(final PlaceAspectPlaceAspectProperties _self_, final Place _self, final int runtimeTokenCount) {
    _self_.runtimeTokenCount = runtimeTokenCount; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRuntimeTokenCount")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, runtimeTokenCount);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
