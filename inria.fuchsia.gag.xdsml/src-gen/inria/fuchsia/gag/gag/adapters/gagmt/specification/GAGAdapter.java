package inria.fuchsia.gag.gag.adapters.gagmt.specification;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.specification.GAG;
import inria.fuchsia.gag.gagmt.specification.Rule;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GAGAdapter extends EObjectAdapter<GAG> implements inria.fuchsia.gag.gagmt.specification.GAG {
  private GagMTAdaptersFactory adaptersFactory;
  
  public GAGAdapter() {
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
  
  private EList<Rule> rule_;
  
  @Override
  public EList<Rule> getRule() {
    if (rule_ == null)
    	rule_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRule(), adaptersFactory, eResource);
    return rule_;
  }
  
  @Override
  public void addRule(final Rule rule) {
    adaptee.addRule(((inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter) rule).getAdaptee()
    );
  }
  
  @Override
  public void removeRule(final Rule rule) {
    adaptee.removeRule(((inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter) rule).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.specification.SpecificationPackage.eINSTANCE.getGAG();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__RULE:
    		return getRule();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__RULE:
    		return getRule() != null && !getRule().isEmpty();
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__RULE:
    		getRule().clear();
    		getRule().addAll((Collection) newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.specification.SpecificationPackage.GAG__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
