package inria.fuchsia.gag.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.specification.Guard;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GuardAdapter extends EObjectAdapter<Guard> implements inria.fuchsia.gag.gagmt.specification.Guard {
  private GagMTAdaptersFactory adaptersFactory;
  
  public GuardAdapter() {
    super(inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getClassPath() {
    return adaptee.getClassPath();
  }
  
  @Override
  public void setClassPath(final String o) {
    adaptee.setClassPath(o);
  }
  
  protected final static String CLASS_PATH_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.specification.SpecificationPackage.eINSTANCE.getGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GUARD__CLASS_PATH:
    		return getClassPath();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GUARD__CLASS_PATH:
    		return getClassPath() != CLASS_PATH_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GUARD__CLASS_PATH:
    		setClassPath(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
