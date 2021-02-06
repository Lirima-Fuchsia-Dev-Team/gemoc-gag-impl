package inria.fuchsia.gag.gag.adapters.gagmt.process;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.process.Configuration;
import inria.fuchsia.gag.gagmt.process.Task;
import inria.fuchsia.gag.gagmt.specification.GAG;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConfigurationAdapter extends EObjectAdapter<Configuration> implements inria.fuchsia.gag.gagmt.process.Configuration {
  private GagMTAdaptersFactory adaptersFactory;
  
  public ConfigurationAdapter() {
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
  public Task getRoot() {
    return (Task) adaptersFactory.createAdapter(adaptee.getRoot(), eResource);
  }
  
  @Override
  public void setRoot(final Task o) {
    if (o != null)
    	adaptee.setRoot(((inria.fuchsia.gag.gag.adapters.gagmt.process.TaskAdapter) o).getAdaptee());
    else adaptee.setRoot(null);
  }
  
  @Override
  public GAG getConsistent_to() {
    return (GAG) adaptersFactory.createAdapter(adaptee.getConsistent_to(), eResource);
  }
  
  @Override
  public void setConsistent_to(final GAG o) {
    if (o != null)
    	adaptee.setConsistent_to(((inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter) o).getAdaptee());
    else adaptee.setConsistent_to(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.process.ProcessPackage.eINSTANCE.getConfiguration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__ROOT:
    		return getRoot();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__NAME:
    		return getName();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__CONSISTENT_TO:
    		return getConsistent_to();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__ROOT:
    		return getRoot() != null;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__CONSISTENT_TO:
    		return getConsistent_to() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__ROOT:
    		setRoot(
    		(inria.fuchsia.gag.gagmt.process.Task)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.CONFIGURATION__CONSISTENT_TO:
    		setConsistent_to(
    		(inria.fuchsia.gag.gagmt.specification.GAG)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
