/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ToursdslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co/edu/uniandes/parser/antlr/internal/InternalToursdsl.tokens");
	}
}