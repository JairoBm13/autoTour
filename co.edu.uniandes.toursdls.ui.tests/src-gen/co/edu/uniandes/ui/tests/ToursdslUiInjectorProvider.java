/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.ui.tests;

import co.edu.uniandes.toursdls.ui.internal.ToursdlsActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ToursdslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ToursdlsActivator.getInstance().getInjector("co.edu.uniandes.Toursdsl");
	}

}
