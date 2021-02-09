package inria.fuchsia.gag.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.specification.Service;
import inria.fuchsia.gag.gagmt.specification.Attribute;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ServiceAdapter extends EObjectAdapter<Service> implements inria.fuchsia.gag.gagmt.specification.Service {
  private GagMTAdaptersFactory adaptersFactory;
  
  public ServiceAdapter() {
    super(inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Attribute> input_;
  
  @Override
  public EList<Attribute> getInput() {
    if (input_ == null)
    	input_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInput(), adaptersFactory, eResource);
    return input_;
  }
  
  private EList<Attribute> output_;
  
  @Override
  public EList<Attribute> getOutput() {
    if (output_ == null)
    	output_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutput(), adaptersFactory, eResource);
    return output_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.specification.SpecificationPackage.eINSTANCE.getService();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__INPUT:
    		return getInput();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__OUTPUT:
    		return getOutput();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__INPUT:
    		return getInput() != null && !getInput().isEmpty();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__OUTPUT:
    		return getOutput() != null && !getOutput().isEmpty();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__INPUT:
    		getInput().clear();
    		getInput().addAll((Collection) newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__OUTPUT:
    		getOutput().clear();
    		getOutput().addAll((Collection) newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.SERVICE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
