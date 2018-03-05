/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.ide.contentassist.antlr;

import co.edu.uniandes.ide.contentassist.antlr.internal.InternalToursdslParser;
import co.edu.uniandes.services.ToursdslGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ToursdslParser extends AbstractContentAssistParser {

	@Inject
	private ToursdslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalToursdslParser createParser() {
		InternalToursdslParser result = new InternalToursdslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTourAccess().getGroup(), "rule__Tour__Group__0");
					put(grammarAccess.getPanoramaAccess().getGroup(), "rule__Panorama__Group__0");
					put(grammarAccess.getPanoramaAccess().getGroup_17(), "rule__Panorama__Group_17__0");
					put(grammarAccess.getHotspotAccess().getGroup(), "rule__Hotspot__Group__0");
					put(grammarAccess.getCoordenadaAccess().getGroup(), "rule__Coordenada__Group__0");
					put(grammarAccess.getTourAccess().getNameAssignment_4(), "rule__Tour__NameAssignment_4");
					put(grammarAccess.getTourAccess().getPlacesAssignment_10(), "rule__Tour__PlacesAssignment_10");
					put(grammarAccess.getTourAccess().getCOMMAplacesAssignment_11(), "rule__Tour__COMMAplacesAssignment_11");
					put(grammarAccess.getPanoramaAccess().getNameAssignment_4(), "rule__Panorama__NameAssignment_4");
					put(grammarAccess.getPanoramaAccess().getDescriptionAssignment_10(), "rule__Panorama__DescriptionAssignment_10");
					put(grammarAccess.getPanoramaAccess().getPlacesAssignment_16(), "rule__Panorama__PlacesAssignment_16");
					put(grammarAccess.getPanoramaAccess().getPlacesAssignment_17_1(), "rule__Panorama__PlacesAssignment_17_1");
					put(grammarAccess.getHotspotAccess().getNameAssignment_4(), "rule__Hotspot__NameAssignment_4");
					put(grammarAccess.getHotspotAccess().getDestinoAssignment_10(), "rule__Hotspot__DestinoAssignment_10");
					put(grammarAccess.getHotspotAccess().getOrigenAssignment_16(), "rule__Hotspot__OrigenAssignment_16");
					put(grammarAccess.getHotspotAccess().getPosicionAssignment_21(), "rule__Hotspot__PosicionAssignment_21");
					put(grammarAccess.getHotspotAccess().getRotacionAssignment_25(), "rule__Hotspot__RotacionAssignment_25");
					put(grammarAccess.getCoordenadaAccess().getXAssignment_3(), "rule__Coordenada__XAssignment_3");
					put(grammarAccess.getCoordenadaAccess().getYAssignment_9(), "rule__Coordenada__YAssignment_9");
					put(grammarAccess.getCoordenadaAccess().getZAssignment_15(), "rule__Coordenada__ZAssignment_15");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ToursdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ToursdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}