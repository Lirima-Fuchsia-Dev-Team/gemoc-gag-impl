package inria.fuchsia.gag.xdsml.gag.adapters.gagmt.specification;

import inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.xdsml.gagmt.specification.GAG;
import inria.fuchsia.gag.xdsml.gagmt.specification.Guard;
import inria.fuchsia.gag.xdsml.gagmt.specification.Rule;
import inria.fuchsia.gag.xdsml.gagmt.specification.Service;
import inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationFactory;
import inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage;
import inria.fuchsia.gag.xdsml.gagmt.specification.Value;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SpecificationFactoryAdapter extends EFactoryImpl implements SpecificationFactory {
  private GagMTAdaptersFactory adaptersFactory = inria.fuchsia.gag.xdsml.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  
  private inria.fuchsia.gag.xdsml.gag.specification.SpecificationFactory specificationAdaptee = inria.fuchsia.gag.xdsml.gag.specification.SpecificationFactory.eINSTANCE;
  
  @Override
  public GAG createGAG() {
    return adaptersFactory.createGAGAdapter(specificationAdaptee.createGAG(), null);
  }
  
  @Override
  public Value createValue() {
    return adaptersFactory.createValueAdapter(specificationAdaptee.createValue(), null);
  }
  
  @Override
  public Service createService() {
    return adaptersFactory.createServiceAdapter(specificationAdaptee.createService(), null);
  }
  
  @Override
  public Guard createGuard() {
    return adaptersFactory.createGuardAdapter(specificationAdaptee.createGuard(), null);
  }
  
  @Override
  public Rule createRule() {
    return adaptersFactory.createRuleAdapter(specificationAdaptee.createRule(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSpecificationPackage();
  }
  
  public SpecificationPackage getSpecificationPackage() {
    return inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage.eINSTANCE;
  }
}
