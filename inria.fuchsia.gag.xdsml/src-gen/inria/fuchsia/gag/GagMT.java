package inria.fuchsia.gag;

import fr.inria.diverse.melange.lib.IModelType;
import inria.fuchsia.gag.gagmt.process.ProcessFactory;
import inria.fuchsia.gag.gagmt.specification.SpecificationFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface GagMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ProcessFactory getProcessFactory();
  
  public abstract SpecificationFactory getSpecificationFactory();
  
  public abstract void save(final String uri) throws IOException;
}
