/**
 * generated by Xtext 2.14.0
 */
package inria.fuchsia.gag.gagdsl;

import inria.fuchsia.gag.gagdsl.GagDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GagDslStandaloneSetup extends GagDslStandaloneSetupGenerated {
  public static void doSetup() {
    new GagDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}