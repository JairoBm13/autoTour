package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.ToursdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToursdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENING_CURLY_BRACKET", "RULE_NAME", "RULE_COLON", "RULE_QUOTE", "RULE_ID", "RULE_COMMA", "RULE_PLACES", "RULE_OPENING_SQUARE_BRACKET", "RULE_CLOSING_SQUARE_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_DESCRIPTION", "RULE_STRING", "RULE_PATHS", "RULE_TO", "RULE_FROM", "RULE_POSITION", "RULE_COORDINATE_X", "RULE_INT", "RULE_DOT", "RULE_COORDINATE_Y", "RULE_COORDINATE_Z", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_PATHS=16;
    public static final int RULE_TO=17;
    public static final int RULE_NAME=5;
    public static final int RULE_PLACES=10;
    public static final int RULE_STRING=15;
    public static final int RULE_CLOSING_CURLY_BRACKET=13;
    public static final int RULE_POSITION=19;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_OPENING_CURLY_BRACKET=4;
    public static final int RULE_DOT=22;
    public static final int EOF=-1;
    public static final int RULE_COORDINATE_Y=23;
    public static final int RULE_COORDINATE_X=20;
    public static final int RULE_COORDINATE_Z=24;
    public static final int RULE_ID=8;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=27;
    public static final int RULE_DESCRIPTION=14;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_FROM=18;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_QUOTE=7;
    public static final int RULE_OPENING_SQUARE_BRACKET=11;
    public static final int RULE_CLOSING_SQUARE_BRACKET=12;

    // delegates
    // delegators


        public InternalToursdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToursdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToursdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalToursdsl.g"; }



     	private ToursdslGrammarAccess grammarAccess;

        public InternalToursdslParser(TokenStream input, ToursdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tour";
       	}

       	@Override
       	protected ToursdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTour"
    // InternalToursdsl.g:64:1: entryRuleTour returns [EObject current=null] : iv_ruleTour= ruleTour EOF ;
    public final EObject entryRuleTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTour = null;


        try {
            // InternalToursdsl.g:64:45: (iv_ruleTour= ruleTour EOF )
            // InternalToursdsl.g:65:2: iv_ruleTour= ruleTour EOF
            {
             newCompositeNode(grammarAccess.getTourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTour=ruleTour();

            state._fsp--;

             current =iv_ruleTour; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTour"


    // $ANTLR start "ruleTour"
    // InternalToursdsl.g:71:1: ruleTour returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_PLACES_7= RULE_PLACES this_COLON_8= RULE_COLON this_OPENING_SQUARE_BRACKET_9= RULE_OPENING_SQUARE_BRACKET ( (lv_places_10_0= rulePanorama ) ) ( (lv_COMMAplaces_11_0= rulePanorama ) )* this_CLOSING_SQUARE_BRACKET_12= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_13= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleTour() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token this_QUOTE_3=null;
        Token lv_name_4_0=null;
        Token this_QUOTE_5=null;
        Token this_COMMA_6=null;
        Token this_PLACES_7=null;
        Token this_COLON_8=null;
        Token this_OPENING_SQUARE_BRACKET_9=null;
        Token this_CLOSING_SQUARE_BRACKET_12=null;
        Token this_CLOSING_CURLY_BRACKET_13=null;
        EObject lv_places_10_0 = null;

        EObject lv_COMMAplaces_11_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:77:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_PLACES_7= RULE_PLACES this_COLON_8= RULE_COLON this_OPENING_SQUARE_BRACKET_9= RULE_OPENING_SQUARE_BRACKET ( (lv_places_10_0= rulePanorama ) ) ( (lv_COMMAplaces_11_0= rulePanorama ) )* this_CLOSING_SQUARE_BRACKET_12= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_13= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_PLACES_7= RULE_PLACES this_COLON_8= RULE_COLON this_OPENING_SQUARE_BRACKET_9= RULE_OPENING_SQUARE_BRACKET ( (lv_places_10_0= rulePanorama ) ) ( (lv_COMMAplaces_11_0= rulePanorama ) )* this_CLOSING_SQUARE_BRACKET_12= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_13= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_PLACES_7= RULE_PLACES this_COLON_8= RULE_COLON this_OPENING_SQUARE_BRACKET_9= RULE_OPENING_SQUARE_BRACKET ( (lv_places_10_0= rulePanorama ) ) ( (lv_COMMAplaces_11_0= rulePanorama ) )* this_CLOSING_SQUARE_BRACKET_12= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_13= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:79:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_PLACES_7= RULE_PLACES this_COLON_8= RULE_COLON this_OPENING_SQUARE_BRACKET_9= RULE_OPENING_SQUARE_BRACKET ( (lv_places_10_0= rulePanorama ) ) ( (lv_COMMAplaces_11_0= rulePanorama ) )* this_CLOSING_SQUARE_BRACKET_12= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_13= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getTourAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getTourAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_2());
            		
            this_QUOTE_3=(Token)match(input,RULE_QUOTE,FOLLOW_6); 

            			newLeafNode(this_QUOTE_3, grammarAccess.getTourAccess().getQUOTETerminalRuleCall_3());
            		
            // InternalToursdsl.g:95:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalToursdsl.g:96:4: (lv_name_4_0= RULE_ID )
            {
            // InternalToursdsl.g:96:4: (lv_name_4_0= RULE_ID )
            // InternalToursdsl.g:97:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_4_0, grammarAccess.getTourAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_5, grammarAccess.getTourAccess().getQUOTETerminalRuleCall_5());
            		
            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            			newLeafNode(this_COMMA_6, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_6());
            		
            this_PLACES_7=(Token)match(input,RULE_PLACES,FOLLOW_4); 

            			newLeafNode(this_PLACES_7, grammarAccess.getTourAccess().getPLACESTerminalRuleCall_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_8, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_8());
            		
            this_OPENING_SQUARE_BRACKET_9=(Token)match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_10); 

            			newLeafNode(this_OPENING_SQUARE_BRACKET_9, grammarAccess.getTourAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_9());
            		
            // InternalToursdsl.g:133:3: ( (lv_places_10_0= rulePanorama ) )
            // InternalToursdsl.g:134:4: (lv_places_10_0= rulePanorama )
            {
            // InternalToursdsl.g:134:4: (lv_places_10_0= rulePanorama )
            // InternalToursdsl.g:135:5: lv_places_10_0= rulePanorama
            {

            					newCompositeNode(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_places_10_0=rulePanorama();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					add(
            						current,
            						"places",
            						lv_places_10_0,
            						"co.edu.uniandes.Toursdsl.Panorama");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToursdsl.g:152:3: ( (lv_COMMAplaces_11_0= rulePanorama ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_OPENING_CURLY_BRACKET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalToursdsl.g:153:4: (lv_COMMAplaces_11_0= rulePanorama )
            	    {
            	    // InternalToursdsl.g:153:4: (lv_COMMAplaces_11_0= rulePanorama )
            	    // InternalToursdsl.g:154:5: lv_COMMAplaces_11_0= rulePanorama
            	    {

            	    					newCompositeNode(grammarAccess.getTourAccess().getCOMMAplacesPanoramaParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_COMMAplaces_11_0=rulePanorama();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTourRule());
            	    					}
            	    					add(
            	    						current,
            	    						"COMMAplaces",
            	    						lv_COMMAplaces_11_0,
            	    						"co.edu.uniandes.Toursdsl.Panorama");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSING_SQUARE_BRACKET_12=(Token)match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_12); 

            			newLeafNode(this_CLOSING_SQUARE_BRACKET_12, grammarAccess.getTourAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_12());
            		
            this_CLOSING_CURLY_BRACKET_13=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_13, grammarAccess.getTourAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTour"


    // $ANTLR start "entryRulePanorama"
    // InternalToursdsl.g:183:1: entryRulePanorama returns [EObject current=null] : iv_rulePanorama= rulePanorama EOF ;
    public final EObject entryRulePanorama() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanorama = null;


        try {
            // InternalToursdsl.g:183:49: (iv_rulePanorama= rulePanorama EOF )
            // InternalToursdsl.g:184:2: iv_rulePanorama= rulePanorama EOF
            {
             newCompositeNode(grammarAccess.getPanoramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanorama=rulePanorama();

            state._fsp--;

             current =iv_rulePanorama; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePanorama"


    // $ANTLR start "rulePanorama"
    // InternalToursdsl.g:190:1: rulePanorama returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_DESCRIPTION_7= RULE_DESCRIPTION this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (lv_description_10_0= RULE_STRING ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_PATHS_13= RULE_PATHS this_COLON_14= RULE_COLON this_OPENING_SQUARE_BRACKET_15= RULE_OPENING_SQUARE_BRACKET ( (lv_places_16_0= ruleHotspot ) ) (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_19= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject rulePanorama() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token this_QUOTE_3=null;
        Token lv_name_4_0=null;
        Token this_QUOTE_5=null;
        Token this_COMMA_6=null;
        Token this_DESCRIPTION_7=null;
        Token this_COLON_8=null;
        Token this_QUOTE_9=null;
        Token lv_description_10_0=null;
        Token this_QUOTE_11=null;
        Token this_COMMA_12=null;
        Token this_PATHS_13=null;
        Token this_COLON_14=null;
        Token this_OPENING_SQUARE_BRACKET_15=null;
        Token this_COMMA_17=null;
        Token this_CLOSING_SQUARE_BRACKET_19=null;
        Token this_CLOSING_CURLY_BRACKET_20=null;
        EObject lv_places_16_0 = null;

        EObject lv_places_18_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:196:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_DESCRIPTION_7= RULE_DESCRIPTION this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (lv_description_10_0= RULE_STRING ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_PATHS_13= RULE_PATHS this_COLON_14= RULE_COLON this_OPENING_SQUARE_BRACKET_15= RULE_OPENING_SQUARE_BRACKET ( (lv_places_16_0= ruleHotspot ) ) (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_19= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:197:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_DESCRIPTION_7= RULE_DESCRIPTION this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (lv_description_10_0= RULE_STRING ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_PATHS_13= RULE_PATHS this_COLON_14= RULE_COLON this_OPENING_SQUARE_BRACKET_15= RULE_OPENING_SQUARE_BRACKET ( (lv_places_16_0= ruleHotspot ) ) (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_19= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:197:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_DESCRIPTION_7= RULE_DESCRIPTION this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (lv_description_10_0= RULE_STRING ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_PATHS_13= RULE_PATHS this_COLON_14= RULE_COLON this_OPENING_SQUARE_BRACKET_15= RULE_OPENING_SQUARE_BRACKET ( (lv_places_16_0= ruleHotspot ) ) (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_19= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:198:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_DESCRIPTION_7= RULE_DESCRIPTION this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (lv_description_10_0= RULE_STRING ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_PATHS_13= RULE_PATHS this_COLON_14= RULE_COLON this_OPENING_SQUARE_BRACKET_15= RULE_OPENING_SQUARE_BRACKET ( (lv_places_16_0= ruleHotspot ) ) (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_19= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getPanoramaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_2());
            		
            this_QUOTE_3=(Token)match(input,RULE_QUOTE,FOLLOW_6); 

            			newLeafNode(this_QUOTE_3, grammarAccess.getPanoramaAccess().getQUOTETerminalRuleCall_3());
            		
            // InternalToursdsl.g:214:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalToursdsl.g:215:4: (lv_name_4_0= RULE_ID )
            {
            // InternalToursdsl.g:215:4: (lv_name_4_0= RULE_ID )
            // InternalToursdsl.g:216:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPanoramaAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanoramaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_5, grammarAccess.getPanoramaAccess().getQUOTETerminalRuleCall_5());
            		
            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_6, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_6());
            		
            this_DESCRIPTION_7=(Token)match(input,RULE_DESCRIPTION,FOLLOW_4); 

            			newLeafNode(this_DESCRIPTION_7, grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_8, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_8());
            		
            this_QUOTE_9=(Token)match(input,RULE_QUOTE,FOLLOW_14); 

            			newLeafNode(this_QUOTE_9, grammarAccess.getPanoramaAccess().getQUOTETerminalRuleCall_9());
            		
            // InternalToursdsl.g:252:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalToursdsl.g:253:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalToursdsl.g:253:4: (lv_description_10_0= RULE_STRING )
            // InternalToursdsl.g:254:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_description_10_0, grammarAccess.getPanoramaAccess().getDescriptionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanoramaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_QUOTE_11=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_11, grammarAccess.getPanoramaAccess().getQUOTETerminalRuleCall_11());
            		
            this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_12, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_12());
            		
            this_PATHS_13=(Token)match(input,RULE_PATHS,FOLLOW_4); 

            			newLeafNode(this_PATHS_13, grammarAccess.getPanoramaAccess().getPATHSTerminalRuleCall_13());
            		
            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_14, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_14());
            		
            this_OPENING_SQUARE_BRACKET_15=(Token)match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_10); 

            			newLeafNode(this_OPENING_SQUARE_BRACKET_15, grammarAccess.getPanoramaAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_15());
            		
            // InternalToursdsl.g:290:3: ( (lv_places_16_0= ruleHotspot ) )
            // InternalToursdsl.g:291:4: (lv_places_16_0= ruleHotspot )
            {
            // InternalToursdsl.g:291:4: (lv_places_16_0= ruleHotspot )
            // InternalToursdsl.g:292:5: lv_places_16_0= ruleHotspot
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_16);
            lv_places_16_0=ruleHotspot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					add(
            						current,
            						"places",
            						lv_places_16_0,
            						"co.edu.uniandes.Toursdsl.Hotspot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToursdsl.g:309:3: (this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToursdsl.g:310:4: this_COMMA_17= RULE_COMMA ( (lv_places_18_0= ruleHotspot ) )
            	    {
            	    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_10); 

            	    				newLeafNode(this_COMMA_17, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_17_0());
            	    			
            	    // InternalToursdsl.g:314:4: ( (lv_places_18_0= ruleHotspot ) )
            	    // InternalToursdsl.g:315:5: (lv_places_18_0= ruleHotspot )
            	    {
            	    // InternalToursdsl.g:315:5: (lv_places_18_0= ruleHotspot )
            	    // InternalToursdsl.g:316:6: lv_places_18_0= ruleHotspot
            	    {

            	    						newCompositeNode(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_places_18_0=ruleHotspot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanoramaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"places",
            	    							lv_places_18_0,
            	    							"co.edu.uniandes.Toursdsl.Hotspot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_CLOSING_SQUARE_BRACKET_19=(Token)match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_12); 

            			newLeafNode(this_CLOSING_SQUARE_BRACKET_19, grammarAccess.getPanoramaAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_18());
            		
            this_CLOSING_CURLY_BRACKET_20=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_20, grammarAccess.getPanoramaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePanorama"


    // $ANTLR start "entryRuleHotspot"
    // InternalToursdsl.g:346:1: entryRuleHotspot returns [EObject current=null] : iv_ruleHotspot= ruleHotspot EOF ;
    public final EObject entryRuleHotspot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotspot = null;


        try {
            // InternalToursdsl.g:346:48: (iv_ruleHotspot= ruleHotspot EOF )
            // InternalToursdsl.g:347:2: iv_ruleHotspot= ruleHotspot EOF
            {
             newCompositeNode(grammarAccess.getHotspotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHotspot=ruleHotspot();

            state._fsp--;

             current =iv_ruleHotspot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHotspot"


    // $ANTLR start "ruleHotspot"
    // InternalToursdsl.g:353:1: ruleHotspot returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_TO_7= RULE_TO this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (otherlv_10= RULE_ID ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_FROM_13= RULE_FROM this_COLON_14= RULE_COLON this_QUOTE_15= RULE_QUOTE ( (otherlv_16= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE this_COMMA_18= RULE_COMMA this_POSITION_19= RULE_POSITION this_COLON_20= RULE_COLON ( (lv_posicion_21_0= ruleCoordenada ) ) this_COMMA_22= RULE_COMMA this_POSITION_23= RULE_POSITION this_COLON_24= RULE_COLON ( (lv_rotacion_25_0= ruleCoordenada ) ) this_COMMA_26= RULE_COMMA this_CLOSING_CURLY_BRACKET_27= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleHotspot() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token this_QUOTE_3=null;
        Token lv_name_4_0=null;
        Token this_QUOTE_5=null;
        Token this_COMMA_6=null;
        Token this_TO_7=null;
        Token this_COLON_8=null;
        Token this_QUOTE_9=null;
        Token otherlv_10=null;
        Token this_QUOTE_11=null;
        Token this_COMMA_12=null;
        Token this_FROM_13=null;
        Token this_COLON_14=null;
        Token this_QUOTE_15=null;
        Token otherlv_16=null;
        Token this_QUOTE_17=null;
        Token this_COMMA_18=null;
        Token this_POSITION_19=null;
        Token this_COLON_20=null;
        Token this_COMMA_22=null;
        Token this_POSITION_23=null;
        Token this_COLON_24=null;
        Token this_COMMA_26=null;
        Token this_CLOSING_CURLY_BRACKET_27=null;
        EObject lv_posicion_21_0 = null;

        EObject lv_rotacion_25_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:359:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_TO_7= RULE_TO this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (otherlv_10= RULE_ID ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_FROM_13= RULE_FROM this_COLON_14= RULE_COLON this_QUOTE_15= RULE_QUOTE ( (otherlv_16= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE this_COMMA_18= RULE_COMMA this_POSITION_19= RULE_POSITION this_COLON_20= RULE_COLON ( (lv_posicion_21_0= ruleCoordenada ) ) this_COMMA_22= RULE_COMMA this_POSITION_23= RULE_POSITION this_COLON_24= RULE_COLON ( (lv_rotacion_25_0= ruleCoordenada ) ) this_COMMA_26= RULE_COMMA this_CLOSING_CURLY_BRACKET_27= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:360:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_TO_7= RULE_TO this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (otherlv_10= RULE_ID ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_FROM_13= RULE_FROM this_COLON_14= RULE_COLON this_QUOTE_15= RULE_QUOTE ( (otherlv_16= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE this_COMMA_18= RULE_COMMA this_POSITION_19= RULE_POSITION this_COLON_20= RULE_COLON ( (lv_posicion_21_0= ruleCoordenada ) ) this_COMMA_22= RULE_COMMA this_POSITION_23= RULE_POSITION this_COLON_24= RULE_COLON ( (lv_rotacion_25_0= ruleCoordenada ) ) this_COMMA_26= RULE_COMMA this_CLOSING_CURLY_BRACKET_27= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:360:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_TO_7= RULE_TO this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (otherlv_10= RULE_ID ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_FROM_13= RULE_FROM this_COLON_14= RULE_COLON this_QUOTE_15= RULE_QUOTE ( (otherlv_16= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE this_COMMA_18= RULE_COMMA this_POSITION_19= RULE_POSITION this_COLON_20= RULE_COLON ( (lv_posicion_21_0= ruleCoordenada ) ) this_COMMA_22= RULE_COMMA this_POSITION_23= RULE_POSITION this_COLON_24= RULE_COLON ( (lv_rotacion_25_0= ruleCoordenada ) ) this_COMMA_26= RULE_COMMA this_CLOSING_CURLY_BRACKET_27= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:361:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON this_QUOTE_3= RULE_QUOTE ( (lv_name_4_0= RULE_ID ) ) this_QUOTE_5= RULE_QUOTE this_COMMA_6= RULE_COMMA this_TO_7= RULE_TO this_COLON_8= RULE_COLON this_QUOTE_9= RULE_QUOTE ( (otherlv_10= RULE_ID ) ) this_QUOTE_11= RULE_QUOTE this_COMMA_12= RULE_COMMA this_FROM_13= RULE_FROM this_COLON_14= RULE_COLON this_QUOTE_15= RULE_QUOTE ( (otherlv_16= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE this_COMMA_18= RULE_COMMA this_POSITION_19= RULE_POSITION this_COLON_20= RULE_COLON ( (lv_posicion_21_0= ruleCoordenada ) ) this_COMMA_22= RULE_COMMA this_POSITION_23= RULE_POSITION this_COLON_24= RULE_COLON ( (lv_rotacion_25_0= ruleCoordenada ) ) this_COMMA_26= RULE_COMMA this_CLOSING_CURLY_BRACKET_27= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getHotspotAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_2());
            		
            this_QUOTE_3=(Token)match(input,RULE_QUOTE,FOLLOW_6); 

            			newLeafNode(this_QUOTE_3, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_3());
            		
            // InternalToursdsl.g:377:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalToursdsl.g:378:4: (lv_name_4_0= RULE_ID )
            {
            // InternalToursdsl.g:378:4: (lv_name_4_0= RULE_ID )
            // InternalToursdsl.g:379:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_4_0, grammarAccess.getHotspotAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_5, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_5());
            		
            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            			newLeafNode(this_COMMA_6, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_6());
            		
            this_TO_7=(Token)match(input,RULE_TO,FOLLOW_4); 

            			newLeafNode(this_TO_7, grammarAccess.getHotspotAccess().getTOTerminalRuleCall_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_8, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_8());
            		
            this_QUOTE_9=(Token)match(input,RULE_QUOTE,FOLLOW_6); 

            			newLeafNode(this_QUOTE_9, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_9());
            		
            // InternalToursdsl.g:415:3: ( (otherlv_10= RULE_ID ) )
            // InternalToursdsl.g:416:4: (otherlv_10= RULE_ID )
            {
            // InternalToursdsl.g:416:4: (otherlv_10= RULE_ID )
            // InternalToursdsl.g:417:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_10, grammarAccess.getHotspotAccess().getDestinoPanoramaCrossReference_10_0());
            				

            }


            }

            this_QUOTE_11=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_11, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_11());
            		
            this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_18); 

            			newLeafNode(this_COMMA_12, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_12());
            		
            this_FROM_13=(Token)match(input,RULE_FROM,FOLLOW_4); 

            			newLeafNode(this_FROM_13, grammarAccess.getHotspotAccess().getFROMTerminalRuleCall_13());
            		
            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_14, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_14());
            		
            this_QUOTE_15=(Token)match(input,RULE_QUOTE,FOLLOW_6); 

            			newLeafNode(this_QUOTE_15, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_15());
            		
            // InternalToursdsl.g:448:3: ( (otherlv_16= RULE_ID ) )
            // InternalToursdsl.g:449:4: (otherlv_16= RULE_ID )
            {
            // InternalToursdsl.g:449:4: (otherlv_16= RULE_ID )
            // InternalToursdsl.g:450:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_16, grammarAccess.getHotspotAccess().getOrigenPanoramaCrossReference_16_0());
            				

            }


            }

            this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_7); 

            			newLeafNode(this_QUOTE_17, grammarAccess.getHotspotAccess().getQUOTETerminalRuleCall_17());
            		
            this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_19); 

            			newLeafNode(this_COMMA_18, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_18());
            		
            this_POSITION_19=(Token)match(input,RULE_POSITION,FOLLOW_4); 

            			newLeafNode(this_POSITION_19, grammarAccess.getHotspotAccess().getPOSITIONTerminalRuleCall_19());
            		
            this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_10); 

            			newLeafNode(this_COLON_20, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_20());
            		
            // InternalToursdsl.g:477:3: ( (lv_posicion_21_0= ruleCoordenada ) )
            // InternalToursdsl.g:478:4: (lv_posicion_21_0= ruleCoordenada )
            {
            // InternalToursdsl.g:478:4: (lv_posicion_21_0= ruleCoordenada )
            // InternalToursdsl.g:479:5: lv_posicion_21_0= ruleCoordenada
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getPosicionCoordenadaParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_7);
            lv_posicion_21_0=ruleCoordenada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"posicion",
            						lv_posicion_21_0,
            						"co.edu.uniandes.Toursdsl.Coordenada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_19); 

            			newLeafNode(this_COMMA_22, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_22());
            		
            this_POSITION_23=(Token)match(input,RULE_POSITION,FOLLOW_4); 

            			newLeafNode(this_POSITION_23, grammarAccess.getHotspotAccess().getPOSITIONTerminalRuleCall_23());
            		
            this_COLON_24=(Token)match(input,RULE_COLON,FOLLOW_10); 

            			newLeafNode(this_COLON_24, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_24());
            		
            // InternalToursdsl.g:508:3: ( (lv_rotacion_25_0= ruleCoordenada ) )
            // InternalToursdsl.g:509:4: (lv_rotacion_25_0= ruleCoordenada )
            {
            // InternalToursdsl.g:509:4: (lv_rotacion_25_0= ruleCoordenada )
            // InternalToursdsl.g:510:5: lv_rotacion_25_0= ruleCoordenada
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getRotacionCoordenadaParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_7);
            lv_rotacion_25_0=ruleCoordenada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"rotacion",
            						lv_rotacion_25_0,
            						"co.edu.uniandes.Toursdsl.Coordenada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            			newLeafNode(this_COMMA_26, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_26());
            		
            this_CLOSING_CURLY_BRACKET_27=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_27, grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_27());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHotspot"


    // $ANTLR start "entryRuleCoordenada"
    // InternalToursdsl.g:539:1: entryRuleCoordenada returns [EObject current=null] : iv_ruleCoordenada= ruleCoordenada EOF ;
    public final EObject entryRuleCoordenada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordenada = null;


        try {
            // InternalToursdsl.g:539:51: (iv_ruleCoordenada= ruleCoordenada EOF )
            // InternalToursdsl.g:540:2: iv_ruleCoordenada= ruleCoordenada EOF
            {
             newCompositeNode(grammarAccess.getCoordenadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordenada=ruleCoordenada();

            state._fsp--;

             current =iv_ruleCoordenada; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordenada"


    // $ANTLR start "ruleCoordenada"
    // InternalToursdsl.g:546:1: ruleCoordenada returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= RULE_INT ) ) this_DOT_4= RULE_DOT this_INT_5= RULE_INT this_COMMA_6= RULE_COMMA this_COORDINATE_Y_7= RULE_COORDINATE_Y this_COLON_8= RULE_COLON ( (lv_y_9_0= RULE_INT ) ) this_DOT_10= RULE_DOT this_INT_11= RULE_INT this_COMMA_12= RULE_COMMA this_COORDINATE_Z_13= RULE_COORDINATE_Z this_COLON_14= RULE_COLON ( (lv_z_15_0= RULE_INT ) ) this_DOT_16= RULE_DOT this_INT_17= RULE_INT this_CLOSING_CURLY_BRACKET_18= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleCoordenada() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_COORDINATE_X_1=null;
        Token this_COLON_2=null;
        Token lv_x_3_0=null;
        Token this_DOT_4=null;
        Token this_INT_5=null;
        Token this_COMMA_6=null;
        Token this_COORDINATE_Y_7=null;
        Token this_COLON_8=null;
        Token lv_y_9_0=null;
        Token this_DOT_10=null;
        Token this_INT_11=null;
        Token this_COMMA_12=null;
        Token this_COORDINATE_Z_13=null;
        Token this_COLON_14=null;
        Token lv_z_15_0=null;
        Token this_DOT_16=null;
        Token this_INT_17=null;
        Token this_CLOSING_CURLY_BRACKET_18=null;


        	enterRule();

        try {
            // InternalToursdsl.g:552:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= RULE_INT ) ) this_DOT_4= RULE_DOT this_INT_5= RULE_INT this_COMMA_6= RULE_COMMA this_COORDINATE_Y_7= RULE_COORDINATE_Y this_COLON_8= RULE_COLON ( (lv_y_9_0= RULE_INT ) ) this_DOT_10= RULE_DOT this_INT_11= RULE_INT this_COMMA_12= RULE_COMMA this_COORDINATE_Z_13= RULE_COORDINATE_Z this_COLON_14= RULE_COLON ( (lv_z_15_0= RULE_INT ) ) this_DOT_16= RULE_DOT this_INT_17= RULE_INT this_CLOSING_CURLY_BRACKET_18= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:553:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= RULE_INT ) ) this_DOT_4= RULE_DOT this_INT_5= RULE_INT this_COMMA_6= RULE_COMMA this_COORDINATE_Y_7= RULE_COORDINATE_Y this_COLON_8= RULE_COLON ( (lv_y_9_0= RULE_INT ) ) this_DOT_10= RULE_DOT this_INT_11= RULE_INT this_COMMA_12= RULE_COMMA this_COORDINATE_Z_13= RULE_COORDINATE_Z this_COLON_14= RULE_COLON ( (lv_z_15_0= RULE_INT ) ) this_DOT_16= RULE_DOT this_INT_17= RULE_INT this_CLOSING_CURLY_BRACKET_18= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:553:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= RULE_INT ) ) this_DOT_4= RULE_DOT this_INT_5= RULE_INT this_COMMA_6= RULE_COMMA this_COORDINATE_Y_7= RULE_COORDINATE_Y this_COLON_8= RULE_COLON ( (lv_y_9_0= RULE_INT ) ) this_DOT_10= RULE_DOT this_INT_11= RULE_INT this_COMMA_12= RULE_COMMA this_COORDINATE_Z_13= RULE_COORDINATE_Z this_COLON_14= RULE_COLON ( (lv_z_15_0= RULE_INT ) ) this_DOT_16= RULE_DOT this_INT_17= RULE_INT this_CLOSING_CURLY_BRACKET_18= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:554:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= RULE_INT ) ) this_DOT_4= RULE_DOT this_INT_5= RULE_INT this_COMMA_6= RULE_COMMA this_COORDINATE_Y_7= RULE_COORDINATE_Y this_COLON_8= RULE_COLON ( (lv_y_9_0= RULE_INT ) ) this_DOT_10= RULE_DOT this_INT_11= RULE_INT this_COMMA_12= RULE_COMMA this_COORDINATE_Z_13= RULE_COORDINATE_Z this_COLON_14= RULE_COLON ( (lv_z_15_0= RULE_INT ) ) this_DOT_16= RULE_DOT this_INT_17= RULE_INT this_CLOSING_CURLY_BRACKET_18= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_20); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getCoordenadaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_COORDINATE_X_1=(Token)match(input,RULE_COORDINATE_X,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_X_1, grammarAccess.getCoordenadaAccess().getCOORDINATE_XTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_21); 

            			newLeafNode(this_COLON_2, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalToursdsl.g:566:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalToursdsl.g:567:4: (lv_x_3_0= RULE_INT )
            {
            // InternalToursdsl.g:567:4: (lv_x_3_0= RULE_INT )
            // InternalToursdsl.g:568:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_x_3_0, grammarAccess.getCoordenadaAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordenadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_4, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_4());
            		
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_7); 

            			newLeafNode(this_INT_5, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_5());
            		
            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_6, grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_6());
            		
            this_COORDINATE_Y_7=(Token)match(input,RULE_COORDINATE_Y,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Y_7, grammarAccess.getCoordenadaAccess().getCOORDINATE_YTerminalRuleCall_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_21); 

            			newLeafNode(this_COLON_8, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_8());
            		
            // InternalToursdsl.g:604:3: ( (lv_y_9_0= RULE_INT ) )
            // InternalToursdsl.g:605:4: (lv_y_9_0= RULE_INT )
            {
            // InternalToursdsl.g:605:4: (lv_y_9_0= RULE_INT )
            // InternalToursdsl.g:606:5: lv_y_9_0= RULE_INT
            {
            lv_y_9_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_y_9_0, grammarAccess.getCoordenadaAccess().getYINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordenadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_DOT_10=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_10, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_10());
            		
            this_INT_11=(Token)match(input,RULE_INT,FOLLOW_7); 

            			newLeafNode(this_INT_11, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_11());
            		
            this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_24); 

            			newLeafNode(this_COMMA_12, grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_12());
            		
            this_COORDINATE_Z_13=(Token)match(input,RULE_COORDINATE_Z,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Z_13, grammarAccess.getCoordenadaAccess().getCOORDINATE_ZTerminalRuleCall_13());
            		
            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_21); 

            			newLeafNode(this_COLON_14, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_14());
            		
            // InternalToursdsl.g:642:3: ( (lv_z_15_0= RULE_INT ) )
            // InternalToursdsl.g:643:4: (lv_z_15_0= RULE_INT )
            {
            // InternalToursdsl.g:643:4: (lv_z_15_0= RULE_INT )
            // InternalToursdsl.g:644:5: lv_z_15_0= RULE_INT
            {
            lv_z_15_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_z_15_0, grammarAccess.getCoordenadaAccess().getZINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordenadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_DOT_16=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_16, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_16());
            		
            this_INT_17=(Token)match(input,RULE_INT,FOLLOW_12); 

            			newLeafNode(this_INT_17, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_17());
            		
            this_CLOSING_CURLY_BRACKET_18=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_18, grammarAccess.getCoordenadaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordenada"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});

}