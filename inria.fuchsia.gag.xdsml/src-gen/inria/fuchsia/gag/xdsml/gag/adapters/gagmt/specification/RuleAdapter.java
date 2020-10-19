package inria.fuchsia.gag.xdsml.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.xdsml.gag.specification.Rule;
import inria.fuchsia.gag.xdsml.gagmt.specification.Guard;
import inria.fuchsia.gag.xdsml.gagmt.specification.Service;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RuleAdapter extends EObjectAdapter<Rule> implements inria.fuchsia.gag.xdsml.gagmt.specification.Rule {
  private GagMTAdaptersFactory adaptersFactory;
  
  public RuleAdapter() {
    super(inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
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
  public EList getParameters() {
    return adaptee.getParameters();
  }
  
  @Override
  public void setParameters(final EList o) {
    adaptee.setParameters(o);
  }
  
  @Override
  public Service getLeft_hand_side() {
    return (Service) adaptersFactory.createAdapter(adaptee.getLeft_hand_side(), eResource);
  }
  
  @Override
  public void setLeft_hand_side(final Service o) {
    if (o != null)
    	adaptee.setLeft_hand_side(((inria.fuchsia.gag.xdsml.gag.adapters.gagmt.specification.ServiceAdapter) o).getAdaptee());
    else adaptee.setLeft_hand_side(null);
  }
  
  private EList<Service> right_hand_side_service_;
  
  @Override
  public EList<Service> getRight_hand_side_service() {
    if (right_hand_side_service_ == null)
    	right_hand_side_service_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRight_hand_side_service(), adaptersFactory, eResource);
    return right_hand_side_service_;
  }
  
  @Override
  public Guard getGuard() {
    return (Guard) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Guard o) {
    if (o != null)
    	adaptee.setGuard(((inria.fuchsia.gag.xdsml.gag.adapters.gagmt.specification.GuardAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.eINSTANCE.getRule();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__LEFT_HAND_SIDE:
    		return getLeft_hand_side();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__NAME:
    		return getName();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__PARAMETERS:
    		return getParameters();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
    		return getRight_hand_side_service();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__GUARD:
    		return getGuard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__LEFT_HAND_SIDE:
    		return getLeft_hand_side() != null;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__PARAMETERS:
    		return getParameters() != null;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
    		return getRight_hand_side_service() != null && !getRight_hand_side_service().isEmpty();
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__GUARD:
    		return getGuard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__LEFT_HAND_SIDE:
    		setLeft_hand_side(
    		(inria.fuchsia.gag.xdsml.gagmt.specification.Service)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__PARAMETERS:
    		setParameters(
    		(org.eclipse.emf.common.util.EList)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
    		getRight_hand_side_service().clear();
    		getRight_hand_side_service().addAll((Collection) newValue);
    		return;
    	case inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.RULE__GUARD:
    		setGuard(
    		(inria.fuchsia.gag.xdsml.gagmt.specification.Guard)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
