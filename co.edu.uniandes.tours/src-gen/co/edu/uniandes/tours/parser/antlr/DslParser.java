/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.parser.antlr;

import co.edu.uniandes.tours.parser.antlr.internal.InternalDslParser;
import co.edu.uniandes.tours.services.DslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DslParser extends AbstractAntlrParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDslParser createParser(XtextTokenStream stream) {
		return new InternalDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Tour";
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
