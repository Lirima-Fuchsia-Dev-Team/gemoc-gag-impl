/**
 * generated by Xtext 2.14.0
 */
package inria.fuchsia.gag.gagdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import inria.fuchsia.gag.gagdsl.GagDslRuntimeModule;
import inria.fuchsia.gag.gagdsl.GagDslStandaloneSetup;
import inria.fuchsia.gag.gagdsl.ide.GagDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GagDslIdeSetup extends GagDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    GagDslRuntimeModule _gagDslRuntimeModule = new GagDslRuntimeModule();
    GagDslIdeModule _gagDslIdeModule = new GagDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_gagDslRuntimeModule, _gagDslIdeModule));
  }
}
