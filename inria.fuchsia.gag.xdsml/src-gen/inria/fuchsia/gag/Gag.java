package inria.fuchsia.gag;

import fr.inria.diverse.melange.lib.IMetamodel;
import inria.fuchsia.gag.GagMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class Gag implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Gag load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    Gag mm = new Gag();
    mm.setResource(res);
    return mm ;
  }
  
  public GagMT toGagMT() {
    inria.fuchsia.gag.gag.adapters.gagmt.GagAdapter adaptee = new inria.fuchsia.gag.gag.adapters.gagmt.GagAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
