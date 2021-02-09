/**
 * generated by Xtext 2.14.0
 */
package inria.fuchsia.gag.xtext.formatting2;

import com.google.inject.Inject;
import inria.fuchsia.gag.gag.process.Configuration;
import inria.fuchsia.gag.gag.process.Task;
import inria.fuchsia.gag.gag.specification.GAG;
import inria.fuchsia.gag.xtext.services.GagGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GagFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GagGrammarAccess _gagGrammarAccess;
  
  protected void _format(final inria.fuchsia.gag.gag.process.Process process, @Extension final IFormattableDocument document) {
    document.<Configuration>format(process.getConfiguration());
    document.<GAG>format(process.getSpecification());
  }
  
  protected void _format(final Configuration configuration, @Extension final IFormattableDocument document) {
    document.<Task>format(configuration.getRoot());
  }
  
  public void format(final Object configuration, final IFormattableDocument document) {
    if (configuration instanceof XtextResource) {
      _format((XtextResource)configuration, document);
      return;
    } else if (configuration instanceof Configuration) {
      _format((Configuration)configuration, document);
      return;
    } else if (configuration instanceof inria.fuchsia.gag.gag.process.Process) {
      _format((inria.fuchsia.gag.gag.process.Process)configuration, document);
      return;
    } else if (configuration instanceof EObject) {
      _format((EObject)configuration, document);
      return;
    } else if (configuration == null) {
      _format((Void)null, document);
      return;
    } else if (configuration != null) {
      _format(configuration, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(configuration, document).toString());
    }
  }
}
