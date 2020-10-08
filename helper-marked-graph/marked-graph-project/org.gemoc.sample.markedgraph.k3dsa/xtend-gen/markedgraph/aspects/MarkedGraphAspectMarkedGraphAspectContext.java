package markedgraph.aspects;

import java.util.Map;
import markedgraph.MarkedGraph;
import markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectProperties;

@SuppressWarnings("all")
public class MarkedGraphAspectMarkedGraphAspectContext {
  public final static MarkedGraphAspectMarkedGraphAspectContext INSTANCE = new MarkedGraphAspectMarkedGraphAspectContext();
  
  public static MarkedGraphAspectMarkedGraphAspectProperties getSelf(final MarkedGraph _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MarkedGraph, MarkedGraphAspectMarkedGraphAspectProperties> map = new java.util.WeakHashMap<markedgraph.MarkedGraph, markedgraph.aspects.MarkedGraphAspectMarkedGraphAspectProperties>();
  
  public Map<MarkedGraph, MarkedGraphAspectMarkedGraphAspectProperties> getMap() {
    return map;
  }
}
