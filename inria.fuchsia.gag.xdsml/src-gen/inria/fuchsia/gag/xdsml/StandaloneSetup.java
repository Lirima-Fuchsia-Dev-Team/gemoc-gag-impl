package inria.fuchsia.gag.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	inria.fuchsia.gag.xdsml.gag.process.ProcessPackage.eNS_URI,
    	inria.fuchsia.gag.xdsml.gag.process.ProcessPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	inria.fuchsia.gag.xdsml.gag.specification.SpecificationPackage.eNS_URI,
    	inria.fuchsia.gag.xdsml.gag.specification.SpecificationPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor gag = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"inria.fuchsia.gag.xdsml.Gag", "", "http://inria.fuchsia.gag.xdsml.gag/process/", "inria.fuchsia.gag.xdsml.GagMT"
    );
    gag.addAdapter("inria.fuchsia.gag.xdsml.GagMT", inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"inria.fuchsia.gag.xdsml.Gag",
    	gag
    );
    MelangeRegistry.ModelTypeDescriptor gagMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"inria.fuchsia.gag.xdsml.GagMT", "", "http://inria.fuchsia.gag.xdsml.gagmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"inria.fuchsia.gag.xdsml.GagMT",
    	gagMT
    );
  }
}
