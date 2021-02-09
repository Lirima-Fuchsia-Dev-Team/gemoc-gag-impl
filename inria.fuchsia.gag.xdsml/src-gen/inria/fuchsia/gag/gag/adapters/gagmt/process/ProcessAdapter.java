package inria.fuchsia.gag.gag.adapters.gagmt.process;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gagmt.process.Configuration;
import inria.fuchsia.gag.gagmt.specification.GAG;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProcessAdapter extends EObjectAdapter<inria.fuchsia.gag.gag.process.Process> implements inria.fuchsia.gag.gagmt.process.Process {
  private GagMTAdaptersFactory adaptersFactory;
  
  public ProcessAdapter() {
    super(inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Configuration getConfiguration() {
    return (Configuration) adaptersFactory.createAdapter(adaptee.getConfiguration(), eResource);
  }
  
  @Override
  public void setConfiguration(final Configuration o) {
    if (o != null)
    	adaptee.setConfiguration(((inria.fuchsia.gag.gag.adapters.gagmt.process.ConfigurationAdapter) o).getAdaptee());
    else adaptee.setConfiguration(null);
  }
  
  @Override
  public GAG getSpecification() {
    return (GAG) adaptersFactory.createAdapter(adaptee.getSpecification(), eResource);
  }
  
  @Override
  public void setSpecification(final GAG o) {
    if (o != null)
    	adaptee.setSpecification(((inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter) o).getAdaptee());
    else adaptee.setSpecification(null);
  }
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.process.ProcessPackage.eINSTANCE.getProcess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__CONFIGURATION:
    		return getConfiguration();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__SPECIFICATION:
    		return getSpecification();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__CONFIGURATION:
    		return getConfiguration() != null;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__SPECIFICATION:
    		return getSpecification() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__CONFIGURATION:
    		setConfiguration(
    		(inria.fuchsia.gag.gagmt.process.Configuration)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.PROCESS__SPECIFICATION:
    		setSpecification(
    		(inria.fuchsia.gag.gagmt.specification.GAG)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
