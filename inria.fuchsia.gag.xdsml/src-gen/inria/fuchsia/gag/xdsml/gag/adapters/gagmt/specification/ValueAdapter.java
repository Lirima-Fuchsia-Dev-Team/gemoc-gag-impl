package inria.fuchsia.gag.xdsml.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.xdsml.gag.specification.Value;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ValueAdapter extends EObjectAdapter<Value> implements inria.fuchsia.gag.xdsml.gagmt.specification.Value {
  private GagMTAdaptersFactory adaptersFactory;
  
  public ValueAdapter() {
    super(inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isDefined() {
    return adaptee.isDefined();
  }
  
  @Override
  public void setDefined(final boolean o) {
    adaptee.setDefined(o);
  }
  
  @Override
  public Object getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Object o) {
    adaptee.setValue(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<inria.fuchsia.gag.xdsml.gagmt.specification.Value> sub_value_;
  
  @Override
  public EList<inria.fuchsia.gag.xdsml.gagmt.specification.Value> getSub_value() {
    if (sub_value_ == null)
    	sub_value_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSub_value(), adaptersFactory, eResource);
    return sub_value_;
  }
  
  protected final static boolean DEFINED_EDEFAULT = false;
  
  protected final static Object VALUE_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.eINSTANCE.getValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__SUB_VALUE:
    		return getSub_value();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__DEFINED:
    		return isDefined() ? Boolean.TRUE : Boolean.FALSE;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__VALUE:
    		return getValue();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__SUB_VALUE:
    		return getSub_value() != null && !getSub_value().isEmpty();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__DEFINED:
    		return isDefined() != DEFINED_EDEFAULT;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__SUB_VALUE:
    		getSub_value().clear();
    		getSub_value().addAll((Collection) newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__DEFINED:
    		setDefined(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__VALUE:
    		setValue( newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.VALUE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
