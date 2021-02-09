package inria.fuchsia.gag.gag.adapters.gagmt.specification;

import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gagmt.specification.Attribute;
import inria.fuchsia.gag.gagmt.specification.GAG;
import inria.fuchsia.gag.gagmt.specification.Guard;
import inria.fuchsia.gag.gagmt.specification.Rule;
import inria.fuchsia.gag.gagmt.specification.Service;
import inria.fuchsia.gag.gagmt.specification.SpecificationFactory;
import inria.fuchsia.gag.gagmt.specification.SpecificationPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SpecificationFactoryAdapter extends EFactoryImpl implements SpecificationFactory {
  private GagMTAdaptersFactory adaptersFactory = inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  
  private inria.fuchsia.gag.gag.specification.SpecificationFactory specificationAdaptee = inria.fuchsia.gag.gag.specification.SpecificationFactory.eINSTANCE;
  
  @Override
  public GAG createGAG() {
    return adaptersFactory.createGAGAdapter(specificationAdaptee.createGAG(), null);
  }
  
  @Override
  public Attribute createAttribute() {
    return adaptersFactory.createAttributeAdapter(specificationAdaptee.createAttribute(), null);
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
    return inria.fuchsia.gag.gagmt.specification.SpecificationPackage.eINSTANCE;
  }
}
