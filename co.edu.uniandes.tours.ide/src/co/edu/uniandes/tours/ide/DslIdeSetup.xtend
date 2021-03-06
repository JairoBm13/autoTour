/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.ide

import co.edu.uniandes.tours.DslRuntimeModule
import co.edu.uniandes.tours.DslStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DslIdeSetup extends DslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DslRuntimeModule, new DslIdeModule))
	}
	
}
