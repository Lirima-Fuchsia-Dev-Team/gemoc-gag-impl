package inria.fuchsia.gag.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.specification.Attribute;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AttributeAdapter extends EObjectAdapter<Attribute> implements inria.fuchsia.gag.gagmt.specification.Attribute {
  private GagMTAdaptersFactory adaptersFactory;
  
  public AttributeAdapter() {
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
  
  @Override
  public String getType() {
    return adaptee.getType();
  }
  
  @Override
  public void setType(final String o) {
    adaptee.setType(o);
  }
  
  @Override
  public Object getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Object o) {
    adaptee.setValue(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String TYPE_EDEFAULT = null;
  
  protected final static Object VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.specification.SpecificationPackage.eINSTANCE.getAttribute();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__NAME:
    		return getName();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__TYPE:
    		return getType();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__TYPE:
    		setType(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.ATTRIBUTE__VALUE:
    		setValue( newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
