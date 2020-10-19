package inria.fuchsia.gag.xdsml.gag.adapters.gagmt.process;

import inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.xdsml.gagmt.process.Configuration;
import inria.fuchsia.gag.xdsml.gagmt.process.ProcessFactory;
import inria.fuchsia.gag.xdsml.gagmt.process.ProcessPackage;
import inria.fuchsia.gag.xdsml.gagmt.process.Task;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ProcessFactoryAdapter extends EFactoryImpl implements ProcessFactory {
  private GagMTAdaptersFactory adaptersFactory = inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  
  private inria.fuchsia.gag.xdsml.gag.process.ProcessFactory processAdaptee = inria.fuchsia.gag.xdsml.gag.process.ProcessFactory.eINSTANCE;
  
  @Override
  public Task createTask() {
    return adaptersFactory.createTaskAdapter(processAdaptee.createTask(), null);
  }
  
  @Override
  public Configuration createConfiguration() {
    return adaptersFactory.createConfigurationAdapter(processAdaptee.createConfiguration(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getProcessPackage();
  }
  
  public ProcessPackage getProcessPackage() {
    return inria.fuchsia.gag.xdsml.gagmt.process.ProcessPackage.eINSTANCE;
  }
}
