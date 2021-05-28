package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;
import fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectContext {
  public final static PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectContext INSTANCE = new PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectContext();
  
  public static PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties getSelf(final PendingLocalFunctionComputation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PendingLocalFunctionComputation, PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties> map = new java.util.WeakHashMap<fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation, fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties>();
  
  public Map<PendingLocalFunctionComputation, PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties> getMap() {
    return map;
  }
}
