package inria.fuchsia.gag.gag.adapters.gagmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import inria.fuchsia.gag.GagMT;
import inria.fuchsia.gag.gagmt.process.ProcessFactory;
import inria.fuchsia.gag.gagmt.specification.SpecificationFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GagAdapter extends ResourceAdapter implements GagMT {
  public GagAdapter() {
    super(inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ProcessFactory getProcessFactory() {
    return new inria.fuchsia.gag.gag.adapters.gagmt.process.ProcessFactoryAdapter();
  }
  
  @Override
  public SpecificationFactory getSpecificationFactory() {
    return new inria.fuchsia.gag.gag.adapters.gagmt.specification.SpecificationFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getProcessFactory());
    res.add(getSpecificationFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
