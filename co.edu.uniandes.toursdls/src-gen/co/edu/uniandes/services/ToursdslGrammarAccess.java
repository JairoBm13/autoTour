/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ToursdslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TourElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.Tour");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOPENING_CURLY_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cNAMETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cQUOTETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cQUOTETerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cCOMMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cPLACESTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cCOLONTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cOPENING_SQUARE_BRACKETTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cPlacesAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPlacesPanoramaParserRuleCall_10_0 = (RuleCall)cPlacesAssignment_10.eContents().get(0);
		private final Assignment cCOMMAplacesAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cCOMMAplacesPanoramaParserRuleCall_11_0 = (RuleCall)cCOMMAplacesAssignment_11.eContents().get(0);
		private final RuleCall cCLOSING_SQUARE_BRACKETTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cCLOSING_CURLY_BRACKETTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		
		//Tour:
		//	OPENING_CURLY_BRACKET
		//	NAME COLON QUOTE name=ID QUOTE COMMA
		//	PLACES COLON OPENING_SQUARE_BRACKET places+=Panorama COMMAplaces+=Panorama* CLOSING_SQUARE_BRACKET
		//	CLOSING_CURLY_BRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//OPENING_CURLY_BRACKET NAME COLON QUOTE name=ID QUOTE COMMA PLACES COLON OPENING_SQUARE_BRACKET places+=Panorama
		//COMMAplaces+=Panorama* CLOSING_SQUARE_BRACKET CLOSING_CURLY_BRACKET
		public Group getGroup() { return cGroup; }
		
		//OPENING_CURLY_BRACKET
		public RuleCall getOPENING_CURLY_BRACKETTerminalRuleCall_0() { return cOPENING_CURLY_BRACKETTerminalRuleCall_0; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_1() { return cNAMETerminalRuleCall_1; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_3() { return cQUOTETerminalRuleCall_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_5() { return cQUOTETerminalRuleCall_5; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_6() { return cCOMMATerminalRuleCall_6; }
		
		//PLACES
		public RuleCall getPLACESTerminalRuleCall_7() { return cPLACESTerminalRuleCall_7; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_8() { return cCOLONTerminalRuleCall_8; }
		
		//OPENING_SQUARE_BRACKET
		public RuleCall getOPENING_SQUARE_BRACKETTerminalRuleCall_9() { return cOPENING_SQUARE_BRACKETTerminalRuleCall_9; }
		
		//places+=Panorama
		public Assignment getPlacesAssignment_10() { return cPlacesAssignment_10; }
		
		//Panorama
		public RuleCall getPlacesPanoramaParserRuleCall_10_0() { return cPlacesPanoramaParserRuleCall_10_0; }
		
		//COMMAplaces+=Panorama*
		public Assignment getCOMMAplacesAssignment_11() { return cCOMMAplacesAssignment_11; }
		
		//Panorama
		public RuleCall getCOMMAplacesPanoramaParserRuleCall_11_0() { return cCOMMAplacesPanoramaParserRuleCall_11_0; }
		
		//CLOSING_SQUARE_BRACKET
		public RuleCall getCLOSING_SQUARE_BRACKETTerminalRuleCall_12() { return cCLOSING_SQUARE_BRACKETTerminalRuleCall_12; }
		
		//CLOSING_CURLY_BRACKET
		public RuleCall getCLOSING_CURLY_BRACKETTerminalRuleCall_13() { return cCLOSING_CURLY_BRACKETTerminalRuleCall_13; }
	}
	public class PanoramaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.Panorama");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOPENING_CURLY_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cNAMETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cQUOTETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cQUOTETerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cCOMMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cDESCRIPTIONTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cCOLONTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cQUOTETerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cDescriptionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_10_0 = (RuleCall)cDescriptionAssignment_10.eContents().get(0);
		private final RuleCall cQUOTETerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cCOMMATerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cPATHSTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cCOLONTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cOPENING_SQUARE_BRACKETTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final Assignment cPlacesAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cPlacesHotspotParserRuleCall_16_0 = (RuleCall)cPlacesAssignment_16.eContents().get(0);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final RuleCall cCOMMATerminalRuleCall_17_0 = (RuleCall)cGroup_17.eContents().get(0);
		private final Assignment cPlacesAssignment_17_1 = (Assignment)cGroup_17.eContents().get(1);
		private final RuleCall cPlacesHotspotParserRuleCall_17_1_0 = (RuleCall)cPlacesAssignment_17_1.eContents().get(0);
		private final RuleCall cCLOSING_SQUARE_BRACKETTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final RuleCall cCLOSING_CURLY_BRACKETTerminalRuleCall_19 = (RuleCall)cGroup.eContents().get(19);
		
		//Panorama:
		//	OPENING_CURLY_BRACKET
		//	NAME COLON QUOTE name=ID QUOTE COMMA
		//	DESCRIPTION COLON QUOTE description=STRING QUOTE COMMA
		//	PATHS COLON OPENING_SQUARE_BRACKET places+=Hotspot (COMMA places+=Hotspot)* CLOSING_SQUARE_BRACKET
		//	CLOSING_CURLY_BRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//OPENING_CURLY_BRACKET NAME COLON QUOTE name=ID QUOTE COMMA DESCRIPTION COLON QUOTE description=STRING QUOTE COMMA PATHS
		//COLON OPENING_SQUARE_BRACKET places+=Hotspot (COMMA places+=Hotspot)* CLOSING_SQUARE_BRACKET CLOSING_CURLY_BRACKET
		public Group getGroup() { return cGroup; }
		
		//OPENING_CURLY_BRACKET
		public RuleCall getOPENING_CURLY_BRACKETTerminalRuleCall_0() { return cOPENING_CURLY_BRACKETTerminalRuleCall_0; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_1() { return cNAMETerminalRuleCall_1; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_3() { return cQUOTETerminalRuleCall_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_5() { return cQUOTETerminalRuleCall_5; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_6() { return cCOMMATerminalRuleCall_6; }
		
		//DESCRIPTION
		public RuleCall getDESCRIPTIONTerminalRuleCall_7() { return cDESCRIPTIONTerminalRuleCall_7; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_8() { return cCOLONTerminalRuleCall_8; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_9() { return cQUOTETerminalRuleCall_9; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_10() { return cDescriptionAssignment_10; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_10_0() { return cDescriptionSTRINGTerminalRuleCall_10_0; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_11() { return cQUOTETerminalRuleCall_11; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_12() { return cCOMMATerminalRuleCall_12; }
		
		//PATHS
		public RuleCall getPATHSTerminalRuleCall_13() { return cPATHSTerminalRuleCall_13; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_14() { return cCOLONTerminalRuleCall_14; }
		
		//OPENING_SQUARE_BRACKET
		public RuleCall getOPENING_SQUARE_BRACKETTerminalRuleCall_15() { return cOPENING_SQUARE_BRACKETTerminalRuleCall_15; }
		
		//places+=Hotspot
		public Assignment getPlacesAssignment_16() { return cPlacesAssignment_16; }
		
		//Hotspot
		public RuleCall getPlacesHotspotParserRuleCall_16_0() { return cPlacesHotspotParserRuleCall_16_0; }
		
		//(COMMA places+=Hotspot)*
		public Group getGroup_17() { return cGroup_17; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_17_0() { return cCOMMATerminalRuleCall_17_0; }
		
		//places+=Hotspot
		public Assignment getPlacesAssignment_17_1() { return cPlacesAssignment_17_1; }
		
		//Hotspot
		public RuleCall getPlacesHotspotParserRuleCall_17_1_0() { return cPlacesHotspotParserRuleCall_17_1_0; }
		
		//CLOSING_SQUARE_BRACKET
		public RuleCall getCLOSING_SQUARE_BRACKETTerminalRuleCall_18() { return cCLOSING_SQUARE_BRACKETTerminalRuleCall_18; }
		
		//CLOSING_CURLY_BRACKET
		public RuleCall getCLOSING_CURLY_BRACKETTerminalRuleCall_19() { return cCLOSING_CURLY_BRACKETTerminalRuleCall_19; }
	}
	public class HotspotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.Hotspot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOPENING_CURLY_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cNAMETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cQUOTETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cQUOTETerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cCOMMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cTOTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cCOLONTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cQUOTETerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cDestinoAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cDestinoPanoramaCrossReference_10_0 = (CrossReference)cDestinoAssignment_10.eContents().get(0);
		private final RuleCall cDestinoPanoramaIDTerminalRuleCall_10_0_1 = (RuleCall)cDestinoPanoramaCrossReference_10_0.eContents().get(1);
		private final RuleCall cQUOTETerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cCOMMATerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cFROMTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cCOLONTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cQUOTETerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final Assignment cOrigenAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cOrigenPanoramaCrossReference_16_0 = (CrossReference)cOrigenAssignment_16.eContents().get(0);
		private final RuleCall cOrigenPanoramaIDTerminalRuleCall_16_0_1 = (RuleCall)cOrigenPanoramaCrossReference_16_0.eContents().get(1);
		private final RuleCall cQUOTETerminalRuleCall_17 = (RuleCall)cGroup.eContents().get(17);
		private final RuleCall cCOMMATerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final RuleCall cPOSITIONTerminalRuleCall_19 = (RuleCall)cGroup.eContents().get(19);
		private final RuleCall cCOLONTerminalRuleCall_20 = (RuleCall)cGroup.eContents().get(20);
		private final Assignment cPosicionAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cPosicionCoordenadaParserRuleCall_21_0 = (RuleCall)cPosicionAssignment_21.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_22 = (RuleCall)cGroup.eContents().get(22);
		private final RuleCall cPOSITIONTerminalRuleCall_23 = (RuleCall)cGroup.eContents().get(23);
		private final RuleCall cCOLONTerminalRuleCall_24 = (RuleCall)cGroup.eContents().get(24);
		private final Assignment cRotacionAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cRotacionCoordenadaParserRuleCall_25_0 = (RuleCall)cRotacionAssignment_25.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_26 = (RuleCall)cGroup.eContents().get(26);
		private final RuleCall cCLOSING_CURLY_BRACKETTerminalRuleCall_27 = (RuleCall)cGroup.eContents().get(27);
		
		//Hotspot:
		//	OPENING_CURLY_BRACKET
		//	NAME COLON QUOTE name=ID QUOTE COMMA
		//	TO COLON QUOTE destino=[Panorama] QUOTE COMMA
		//	FROM COLON QUOTE origen=[Panorama] QUOTE COMMA
		//	POSITION COLON posicion=Coordenada COMMA
		//	POSITION COLON rotacion=Coordenada COMMA
		//	CLOSING_CURLY_BRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//OPENING_CURLY_BRACKET NAME COLON QUOTE name=ID QUOTE COMMA TO COLON QUOTE destino=[Panorama] QUOTE COMMA FROM COLON
		//QUOTE origen=[Panorama] QUOTE COMMA POSITION COLON posicion=Coordenada COMMA POSITION COLON rotacion=Coordenada COMMA
		//CLOSING_CURLY_BRACKET
		public Group getGroup() { return cGroup; }
		
		//OPENING_CURLY_BRACKET
		public RuleCall getOPENING_CURLY_BRACKETTerminalRuleCall_0() { return cOPENING_CURLY_BRACKETTerminalRuleCall_0; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_1() { return cNAMETerminalRuleCall_1; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_3() { return cQUOTETerminalRuleCall_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_5() { return cQUOTETerminalRuleCall_5; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_6() { return cCOMMATerminalRuleCall_6; }
		
		//TO
		public RuleCall getTOTerminalRuleCall_7() { return cTOTerminalRuleCall_7; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_8() { return cCOLONTerminalRuleCall_8; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_9() { return cQUOTETerminalRuleCall_9; }
		
		//destino=[Panorama]
		public Assignment getDestinoAssignment_10() { return cDestinoAssignment_10; }
		
		//[Panorama]
		public CrossReference getDestinoPanoramaCrossReference_10_0() { return cDestinoPanoramaCrossReference_10_0; }
		
		//ID
		public RuleCall getDestinoPanoramaIDTerminalRuleCall_10_0_1() { return cDestinoPanoramaIDTerminalRuleCall_10_0_1; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_11() { return cQUOTETerminalRuleCall_11; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_12() { return cCOMMATerminalRuleCall_12; }
		
		//FROM
		public RuleCall getFROMTerminalRuleCall_13() { return cFROMTerminalRuleCall_13; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_14() { return cCOLONTerminalRuleCall_14; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_15() { return cQUOTETerminalRuleCall_15; }
		
		//origen=[Panorama]
		public Assignment getOrigenAssignment_16() { return cOrigenAssignment_16; }
		
		//[Panorama]
		public CrossReference getOrigenPanoramaCrossReference_16_0() { return cOrigenPanoramaCrossReference_16_0; }
		
		//ID
		public RuleCall getOrigenPanoramaIDTerminalRuleCall_16_0_1() { return cOrigenPanoramaIDTerminalRuleCall_16_0_1; }
		
		//QUOTE
		public RuleCall getQUOTETerminalRuleCall_17() { return cQUOTETerminalRuleCall_17; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_18() { return cCOMMATerminalRuleCall_18; }
		
		//POSITION
		public RuleCall getPOSITIONTerminalRuleCall_19() { return cPOSITIONTerminalRuleCall_19; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_20() { return cCOLONTerminalRuleCall_20; }
		
		//posicion=Coordenada
		public Assignment getPosicionAssignment_21() { return cPosicionAssignment_21; }
		
		//Coordenada
		public RuleCall getPosicionCoordenadaParserRuleCall_21_0() { return cPosicionCoordenadaParserRuleCall_21_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_22() { return cCOMMATerminalRuleCall_22; }
		
		//POSITION
		public RuleCall getPOSITIONTerminalRuleCall_23() { return cPOSITIONTerminalRuleCall_23; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_24() { return cCOLONTerminalRuleCall_24; }
		
		//rotacion=Coordenada
		public Assignment getRotacionAssignment_25() { return cRotacionAssignment_25; }
		
		//Coordenada
		public RuleCall getRotacionCoordenadaParserRuleCall_25_0() { return cRotacionCoordenadaParserRuleCall_25_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_26() { return cCOMMATerminalRuleCall_26; }
		
		//CLOSING_CURLY_BRACKET
		public RuleCall getCLOSING_CURLY_BRACKETTerminalRuleCall_27() { return cCLOSING_CURLY_BRACKETTerminalRuleCall_27; }
	}
	public class CoordenadaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.Coordenada");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOPENING_CURLY_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCOORDINATE_XTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cXAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cXINTTerminalRuleCall_3_0 = (RuleCall)cXAssignment_3.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cINTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cCOMMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cCOORDINATE_YTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cCOLONTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Assignment cYAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cYINTTerminalRuleCall_9_0 = (RuleCall)cYAssignment_9.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final RuleCall cINTTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cCOMMATerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cCOORDINATE_ZTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cCOLONTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final Assignment cZAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cZINTTerminalRuleCall_15_0 = (RuleCall)cZAssignment_15.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_16 = (RuleCall)cGroup.eContents().get(16);
		private final RuleCall cINTTerminalRuleCall_17 = (RuleCall)cGroup.eContents().get(17);
		private final RuleCall cCLOSING_CURLY_BRACKETTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		
		//Coordenada:
		//	OPENING_CURLY_BRACKET
		//	COORDINATE_X COLON x=INT DOT INT COMMA
		//	COORDINATE_Y COLON y=INT DOT INT COMMA
		//	COORDINATE_Z COLON z=INT DOT INT
		//	CLOSING_CURLY_BRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//OPENING_CURLY_BRACKET COORDINATE_X COLON x=INT DOT INT COMMA COORDINATE_Y COLON y=INT DOT INT COMMA COORDINATE_Z COLON
		//z=INT DOT INT CLOSING_CURLY_BRACKET
		public Group getGroup() { return cGroup; }
		
		//OPENING_CURLY_BRACKET
		public RuleCall getOPENING_CURLY_BRACKETTerminalRuleCall_0() { return cOPENING_CURLY_BRACKETTerminalRuleCall_0; }
		
		//COORDINATE_X
		public RuleCall getCOORDINATE_XTerminalRuleCall_1() { return cCOORDINATE_XTerminalRuleCall_1; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2() { return cCOLONTerminalRuleCall_2; }
		
		//x=INT
		public Assignment getXAssignment_3() { return cXAssignment_3; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_3_0() { return cXINTTerminalRuleCall_3_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_4() { return cDOTTerminalRuleCall_4; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_5() { return cINTTerminalRuleCall_5; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_6() { return cCOMMATerminalRuleCall_6; }
		
		//COORDINATE_Y
		public RuleCall getCOORDINATE_YTerminalRuleCall_7() { return cCOORDINATE_YTerminalRuleCall_7; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_8() { return cCOLONTerminalRuleCall_8; }
		
		//y=INT
		public Assignment getYAssignment_9() { return cYAssignment_9; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_9_0() { return cYINTTerminalRuleCall_9_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_10() { return cDOTTerminalRuleCall_10; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_11() { return cINTTerminalRuleCall_11; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_12() { return cCOMMATerminalRuleCall_12; }
		
		//COORDINATE_Z
		public RuleCall getCOORDINATE_ZTerminalRuleCall_13() { return cCOORDINATE_ZTerminalRuleCall_13; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_14() { return cCOLONTerminalRuleCall_14; }
		
		//z=INT
		public Assignment getZAssignment_15() { return cZAssignment_15; }
		
		//INT
		public RuleCall getZINTTerminalRuleCall_15_0() { return cZINTTerminalRuleCall_15_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_16() { return cDOTTerminalRuleCall_16; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_17() { return cINTTerminalRuleCall_17; }
		
		//CLOSING_CURLY_BRACKET
		public RuleCall getCLOSING_CURLY_BRACKETTerminalRuleCall_18() { return cCLOSING_CURLY_BRACKETTerminalRuleCall_18; }
	}
	
	
	private final TourElements pTour;
	private final PanoramaElements pPanorama;
	private final HotspotElements pHotspot;
	private final CoordenadaElements pCoordenada;
	private final TerminalRule tOPENING_CURLY_BRACKET;
	private final TerminalRule tCLOSING_CURLY_BRACKET;
	private final TerminalRule tOPENING_SQUARE_BRACKET;
	private final TerminalRule tCLOSING_SQUARE_BRACKET;
	private final TerminalRule tCOLON;
	private final TerminalRule tQUOTE;
	private final TerminalRule tCOMMA;
	private final TerminalRule tDOT;
	private final TerminalRule tNAME;
	private final TerminalRule tFROM;
	private final TerminalRule tTO;
	private final TerminalRule tPOSITION;
	private final TerminalRule tPLACES;
	private final TerminalRule tDESCRIPTION;
	private final TerminalRule tPATHS;
	private final TerminalRule tCOORDINATE_X;
	private final TerminalRule tCOORDINATE_Y;
	private final TerminalRule tCOORDINATE_Z;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ToursdslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTour = new TourElements();
		this.pPanorama = new PanoramaElements();
		this.pHotspot = new HotspotElements();
		this.pCoordenada = new CoordenadaElements();
		this.tOPENING_CURLY_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.OPENING_CURLY_BRACKET");
		this.tCLOSING_CURLY_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.CLOSING_CURLY_BRACKET");
		this.tOPENING_SQUARE_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.OPENING_SQUARE_BRACKET");
		this.tCLOSING_SQUARE_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.CLOSING_SQUARE_BRACKET");
		this.tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.COLON");
		this.tQUOTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.QUOTE");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.COMMA");
		this.tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.DOT");
		this.tNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.NAME");
		this.tFROM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.FROM");
		this.tTO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.TO");
		this.tPOSITION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.POSITION");
		this.tPLACES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.PLACES");
		this.tDESCRIPTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.DESCRIPTION");
		this.tPATHS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.PATHS");
		this.tCOORDINATE_X = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.COORDINATE_X");
		this.tCOORDINATE_Y = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.COORDINATE_Y");
		this.tCOORDINATE_Z = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.Toursdsl.COORDINATE_Z");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.Toursdsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Tour:
	//	OPENING_CURLY_BRACKET
	//	NAME COLON QUOTE name=ID QUOTE COMMA
	//	PLACES COLON OPENING_SQUARE_BRACKET places+=Panorama COMMAplaces+=Panorama* CLOSING_SQUARE_BRACKET
	//	CLOSING_CURLY_BRACKET;
	public TourElements getTourAccess() {
		return pTour;
	}
	
	public ParserRule getTourRule() {
		return getTourAccess().getRule();
	}
	
	//Panorama:
	//	OPENING_CURLY_BRACKET
	//	NAME COLON QUOTE name=ID QUOTE COMMA
	//	DESCRIPTION COLON QUOTE description=STRING QUOTE COMMA
	//	PATHS COLON OPENING_SQUARE_BRACKET places+=Hotspot (COMMA places+=Hotspot)* CLOSING_SQUARE_BRACKET
	//	CLOSING_CURLY_BRACKET;
	public PanoramaElements getPanoramaAccess() {
		return pPanorama;
	}
	
	public ParserRule getPanoramaRule() {
		return getPanoramaAccess().getRule();
	}
	
	//Hotspot:
	//	OPENING_CURLY_BRACKET
	//	NAME COLON QUOTE name=ID QUOTE COMMA
	//	TO COLON QUOTE destino=[Panorama] QUOTE COMMA
	//	FROM COLON QUOTE origen=[Panorama] QUOTE COMMA
	//	POSITION COLON posicion=Coordenada COMMA
	//	POSITION COLON rotacion=Coordenada COMMA
	//	CLOSING_CURLY_BRACKET;
	public HotspotElements getHotspotAccess() {
		return pHotspot;
	}
	
	public ParserRule getHotspotRule() {
		return getHotspotAccess().getRule();
	}
	
	//Coordenada:
	//	OPENING_CURLY_BRACKET
	//	COORDINATE_X COLON x=INT DOT INT COMMA
	//	COORDINATE_Y COLON y=INT DOT INT COMMA
	//	COORDINATE_Z COLON z=INT DOT INT
	//	CLOSING_CURLY_BRACKET;
	public CoordenadaElements getCoordenadaAccess() {
		return pCoordenada;
	}
	
	public ParserRule getCoordenadaRule() {
		return getCoordenadaAccess().getRule();
	}
	
	//terminal OPENING_CURLY_BRACKET:
	//	'{';
	public TerminalRule getOPENING_CURLY_BRACKETRule() {
		return tOPENING_CURLY_BRACKET;
	}
	
	//terminal CLOSING_CURLY_BRACKET:
	//	'}';
	public TerminalRule getCLOSING_CURLY_BRACKETRule() {
		return tCLOSING_CURLY_BRACKET;
	}
	
	//terminal OPENING_SQUARE_BRACKET:
	//	'[';
	public TerminalRule getOPENING_SQUARE_BRACKETRule() {
		return tOPENING_SQUARE_BRACKET;
	}
	
	//terminal CLOSING_SQUARE_BRACKET:
	//	']';
	public TerminalRule getCLOSING_SQUARE_BRACKETRule() {
		return tCLOSING_SQUARE_BRACKET;
	}
	
	//terminal COLON:
	//	':';
	public TerminalRule getCOLONRule() {
		return tCOLON;
	}
	
	//terminal QUOTE:
	//	'"';
	public TerminalRule getQUOTERule() {
		return tQUOTE;
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal DOT:
	//	'.';
	public TerminalRule getDOTRule() {
		return tDOT;
	}
	
	//terminal NAME:
	//	'name';
	public TerminalRule getNAMERule() {
		return tNAME;
	}
	
	//terminal FROM:
	//	'from';
	public TerminalRule getFROMRule() {
		return tFROM;
	}
	
	//terminal TO:
	//	'to';
	public TerminalRule getTORule() {
		return tTO;
	}
	
	//terminal POSITION:
	//	'position';
	public TerminalRule getPOSITIONRule() {
		return tPOSITION;
	}
	
	//terminal PLACES:
	//	'places';
	public TerminalRule getPLACESRule() {
		return tPLACES;
	}
	
	//terminal DESCRIPTION:
	//	'description';
	public TerminalRule getDESCRIPTIONRule() {
		return tDESCRIPTION;
	}
	
	//terminal PATHS:
	//	'paths';
	public TerminalRule getPATHSRule() {
		return tPATHS;
	}
	
	//terminal COORDINATE_X:
	//	'x';
	public TerminalRule getCOORDINATE_XRule() {
		return tCOORDINATE_X;
	}
	
	//terminal COORDINATE_Y:
	//	'y';
	public TerminalRule getCOORDINATE_YRule() {
		return tCOORDINATE_Y;
	}
	
	//terminal COORDINATE_Z:
	//	'z';
	public TerminalRule getCOORDINATE_ZRule() {
		return tCOORDINATE_Z;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
