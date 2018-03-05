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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENING_CURLY_BRACKET", "RULE_NAME", "RULE_COLON", "RULE_STRING", "RULE_COMMA", "RULE_PLACES", "RULE_OPENING_SQUARE_BRACKET", "RULE_CLOSING_SQUARE_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_DESCRIPTION", "RULE_PATHS", "RULE_TO", "RULE_ID", "RULE_FROM", "RULE_POSITION", "RULE_ROTATION", "RULE_COORDINATE_X", "RULE_INT", "RULE_DOT", "RULE_COORDINATE_Y", "RULE_COORDINATE_Z", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'"
    };
    public static final int RULE_PATHS=14;
    public static final int RULE_TO=15;
    public static final int RULE_NAME=5;
    public static final int RULE_PLACES=9;
    public static final int RULE_STRING=7;
    public static final int RULE_CLOSING_CURLY_BRACKET=12;
    public static final int RULE_POSITION=18;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_OPENING_CURLY_BRACKET=4;
    public static final int RULE_DOT=22;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_COORDINATE_Y=23;
    public static final int RULE_COORDINATE_X=20;
    public static final int RULE_COORDINATE_Z=24;
    public static final int RULE_ID=16;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=28;
    public static final int RULE_DESCRIPTION=13;
    public static final int RULE_ROTATION=19;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_FROM=17;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_QUOTE=25;
    public static final int RULE_OPENING_SQUARE_BRACKET=10;
    public static final int RULE_CLOSING_SQUARE_BRACKET=11;

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
    // InternalToursdsl.g:71:1: ruleTour returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_places_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleTour() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token lv_name_3_0=null;
        Token this_COMMA_4=null;
        Token this_PLACES_5=null;
        Token this_COLON_6=null;
        Token this_OPENING_SQUARE_BRACKET_7=null;
        Token this_COMMA_9=null;
        Token this_CLOSING_SQUARE_BRACKET_11=null;
        Token this_CLOSING_CURLY_BRACKET_12=null;
        EObject lv_places_8_0 = null;

        EObject lv_places_10_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:77:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_places_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_places_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_places_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:79:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_places_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getTourAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getTourAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalToursdsl.g:91:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalToursdsl.g:92:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalToursdsl.g:92:4: (lv_name_3_0= RULE_STRING )
            // InternalToursdsl.g:93:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTourAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_4, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_4());
            		
            this_PLACES_5=(Token)match(input,RULE_PLACES,FOLLOW_4); 

            			newLeafNode(this_PLACES_5, grammarAccess.getTourAccess().getPLACESTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_6, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_6());
            		
            this_OPENING_SQUARE_BRACKET_7=(Token)match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_9); 

            			newLeafNode(this_OPENING_SQUARE_BRACKET_7, grammarAccess.getTourAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_7());
            		
            // InternalToursdsl.g:125:3: ( (lv_places_8_0= rulePanorama ) )
            // InternalToursdsl.g:126:4: (lv_places_8_0= rulePanorama )
            {
            // InternalToursdsl.g:126:4: (lv_places_8_0= rulePanorama )
            // InternalToursdsl.g:127:5: lv_places_8_0= rulePanorama
            {

            					newCompositeNode(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_places_8_0=rulePanorama();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					add(
            						current,
            						"places",
            						lv_places_8_0,
            						"co.edu.uniandes.Toursdsl.Panorama");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToursdsl.g:144:3: (this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalToursdsl.g:145:4: this_COMMA_9= RULE_COMMA ( (lv_places_10_0= rulePanorama ) )
            	    {
            	    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_9, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_9_0());
            	    			
            	    // InternalToursdsl.g:149:4: ( (lv_places_10_0= rulePanorama ) )
            	    // InternalToursdsl.g:150:5: (lv_places_10_0= rulePanorama )
            	    {
            	    // InternalToursdsl.g:150:5: (lv_places_10_0= rulePanorama )
            	    // InternalToursdsl.g:151:6: lv_places_10_0= rulePanorama
            	    {

            	    						newCompositeNode(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSING_SQUARE_BRACKET_11=(Token)match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_11); 

            			newLeafNode(this_CLOSING_SQUARE_BRACKET_11, grammarAccess.getTourAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_10());
            		
            this_CLOSING_CURLY_BRACKET_12=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_12, grammarAccess.getTourAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_11());
            		

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
    // InternalToursdsl.g:181:1: entryRulePanorama returns [EObject current=null] : iv_rulePanorama= rulePanorama EOF ;
    public final EObject entryRulePanorama() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanorama = null;


        try {
            // InternalToursdsl.g:181:49: (iv_rulePanorama= rulePanorama EOF )
            // InternalToursdsl.g:182:2: iv_rulePanorama= rulePanorama EOF
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
    // InternalToursdsl.g:188:1: rulePanorama returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_places_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject rulePanorama() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token lv_name_3_0=null;
        Token this_COMMA_4=null;
        Token this_DESCRIPTION_5=null;
        Token this_COLON_6=null;
        Token lv_description_7_0=null;
        Token this_COMMA_8=null;
        Token this_PATHS_9=null;
        Token this_COLON_10=null;
        Token this_OPENING_SQUARE_BRACKET_11=null;
        Token this_COMMA_13=null;
        Token this_CLOSING_SQUARE_BRACKET_15=null;
        Token this_CLOSING_CURLY_BRACKET_16=null;
        EObject lv_places_12_0 = null;

        EObject lv_places_14_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:194:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_places_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:195:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_places_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:195:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_places_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:196:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_places_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getPanoramaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalToursdsl.g:208:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalToursdsl.g:209:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalToursdsl.g:209:4: (lv_name_3_0= RULE_STRING )
            // InternalToursdsl.g:210:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPanoramaAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanoramaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            			newLeafNode(this_COMMA_4, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_4());
            		
            this_DESCRIPTION_5=(Token)match(input,RULE_DESCRIPTION,FOLLOW_4); 

            			newLeafNode(this_DESCRIPTION_5, grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_6, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalToursdsl.g:238:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalToursdsl.g:239:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalToursdsl.g:239:4: (lv_description_7_0= RULE_STRING )
            // InternalToursdsl.g:240:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_7_0, grammarAccess.getPanoramaAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanoramaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_8, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_8());
            		
            this_PATHS_9=(Token)match(input,RULE_PATHS,FOLLOW_4); 

            			newLeafNode(this_PATHS_9, grammarAccess.getPanoramaAccess().getPATHSTerminalRuleCall_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_10, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_10());
            		
            this_OPENING_SQUARE_BRACKET_11=(Token)match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_9); 

            			newLeafNode(this_OPENING_SQUARE_BRACKET_11, grammarAccess.getPanoramaAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_11());
            		
            // InternalToursdsl.g:272:3: ( (lv_places_12_0= ruleHotspot ) )
            // InternalToursdsl.g:273:4: (lv_places_12_0= ruleHotspot )
            {
            // InternalToursdsl.g:273:4: (lv_places_12_0= ruleHotspot )
            // InternalToursdsl.g:274:5: lv_places_12_0= ruleHotspot
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_places_12_0=ruleHotspot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					add(
            						current,
            						"places",
            						lv_places_12_0,
            						"co.edu.uniandes.Toursdsl.Hotspot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToursdsl.g:291:3: (this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToursdsl.g:292:4: this_COMMA_13= RULE_COMMA ( (lv_places_14_0= ruleHotspot ) )
            	    {
            	    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_13, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_13_0());
            	    			
            	    // InternalToursdsl.g:296:4: ( (lv_places_14_0= ruleHotspot ) )
            	    // InternalToursdsl.g:297:5: (lv_places_14_0= ruleHotspot )
            	    {
            	    // InternalToursdsl.g:297:5: (lv_places_14_0= ruleHotspot )
            	    // InternalToursdsl.g:298:6: lv_places_14_0= ruleHotspot
            	    {

            	    						newCompositeNode(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_places_14_0=ruleHotspot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanoramaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"places",
            	    							lv_places_14_0,
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

            this_CLOSING_SQUARE_BRACKET_15=(Token)match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_11); 

            			newLeafNode(this_CLOSING_SQUARE_BRACKET_15, grammarAccess.getPanoramaAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_14());
            		
            this_CLOSING_CURLY_BRACKET_16=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_16, grammarAccess.getPanoramaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_15());
            		

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
    // InternalToursdsl.g:328:1: entryRuleHotspot returns [EObject current=null] : iv_ruleHotspot= ruleHotspot EOF ;
    public final EObject entryRuleHotspot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotspot = null;


        try {
            // InternalToursdsl.g:328:48: (iv_ruleHotspot= ruleHotspot EOF )
            // InternalToursdsl.g:329:2: iv_ruleHotspot= ruleHotspot EOF
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
    // InternalToursdsl.g:335:1: ruleHotspot returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA this_FROM_9= RULE_FROM this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMMA_12= RULE_COMMA this_POSITION_13= RULE_POSITION this_COLON_14= RULE_COLON ( (lv_posicion_15_0= ruleCoordenada ) ) this_COMMA_16= RULE_COMMA this_ROTATION_17= RULE_ROTATION this_COLON_18= RULE_COLON ( (lv_rotacion_19_0= ruleCoordenada ) ) this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleHotspot() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token lv_name_3_0=null;
        Token this_COMMA_4=null;
        Token this_TO_5=null;
        Token this_COLON_6=null;
        Token otherlv_7=null;
        Token this_COMMA_8=null;
        Token this_FROM_9=null;
        Token this_COLON_10=null;
        Token otherlv_11=null;
        Token this_COMMA_12=null;
        Token this_POSITION_13=null;
        Token this_COLON_14=null;
        Token this_COMMA_16=null;
        Token this_ROTATION_17=null;
        Token this_COLON_18=null;
        Token this_CLOSING_CURLY_BRACKET_20=null;
        EObject lv_posicion_15_0 = null;

        EObject lv_rotacion_19_0 = null;



        	enterRule();

        try {
            // InternalToursdsl.g:341:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA this_FROM_9= RULE_FROM this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMMA_12= RULE_COMMA this_POSITION_13= RULE_POSITION this_COLON_14= RULE_COLON ( (lv_posicion_15_0= ruleCoordenada ) ) this_COMMA_16= RULE_COMMA this_ROTATION_17= RULE_ROTATION this_COLON_18= RULE_COLON ( (lv_rotacion_19_0= ruleCoordenada ) ) this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:342:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA this_FROM_9= RULE_FROM this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMMA_12= RULE_COMMA this_POSITION_13= RULE_POSITION this_COLON_14= RULE_COLON ( (lv_posicion_15_0= ruleCoordenada ) ) this_COMMA_16= RULE_COMMA this_ROTATION_17= RULE_ROTATION this_COLON_18= RULE_COLON ( (lv_rotacion_19_0= ruleCoordenada ) ) this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:342:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA this_FROM_9= RULE_FROM this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMMA_12= RULE_COMMA this_POSITION_13= RULE_POSITION this_COLON_14= RULE_COLON ( (lv_posicion_15_0= ruleCoordenada ) ) this_COMMA_16= RULE_COMMA this_ROTATION_17= RULE_ROTATION this_COLON_18= RULE_COLON ( (lv_rotacion_19_0= ruleCoordenada ) ) this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:343:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= RULE_STRING ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA this_FROM_9= RULE_FROM this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMMA_12= RULE_COMMA this_POSITION_13= RULE_POSITION this_COLON_14= RULE_COLON ( (lv_posicion_15_0= ruleCoordenada ) ) this_COMMA_16= RULE_COMMA this_ROTATION_17= RULE_ROTATION this_COLON_18= RULE_COLON ( (lv_rotacion_19_0= ruleCoordenada ) ) this_CLOSING_CURLY_BRACKET_20= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getHotspotAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalToursdsl.g:355:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalToursdsl.g:356:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalToursdsl.g:356:4: (lv_name_3_0= RULE_STRING )
            // InternalToursdsl.g:357:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getHotspotAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_14); 

            			newLeafNode(this_COMMA_4, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_4());
            		
            this_TO_5=(Token)match(input,RULE_TO,FOLLOW_4); 

            			newLeafNode(this_TO_5, grammarAccess.getHotspotAccess().getTOTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_6, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalToursdsl.g:385:3: ( (otherlv_7= RULE_ID ) )
            // InternalToursdsl.g:386:4: (otherlv_7= RULE_ID )
            {
            // InternalToursdsl.g:386:4: (otherlv_7= RULE_ID )
            // InternalToursdsl.g:387:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_7, grammarAccess.getHotspotAccess().getDestinoPanoramaCrossReference_7_0());
            				

            }


            }

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_16); 

            			newLeafNode(this_COMMA_8, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_8());
            		
            this_FROM_9=(Token)match(input,RULE_FROM,FOLLOW_4); 

            			newLeafNode(this_FROM_9, grammarAccess.getHotspotAccess().getFROMTerminalRuleCall_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_15); 

            			newLeafNode(this_COLON_10, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalToursdsl.g:410:3: ( (otherlv_11= RULE_ID ) )
            // InternalToursdsl.g:411:4: (otherlv_11= RULE_ID )
            {
            // InternalToursdsl.g:411:4: (otherlv_11= RULE_ID )
            // InternalToursdsl.g:412:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_11, grammarAccess.getHotspotAccess().getOrigenPanoramaCrossReference_11_0());
            				

            }


            }

            this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            			newLeafNode(this_COMMA_12, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_12());
            		
            this_POSITION_13=(Token)match(input,RULE_POSITION,FOLLOW_4); 

            			newLeafNode(this_POSITION_13, grammarAccess.getHotspotAccess().getPOSITIONTerminalRuleCall_13());
            		
            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_14, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_14());
            		
            // InternalToursdsl.g:435:3: ( (lv_posicion_15_0= ruleCoordenada ) )
            // InternalToursdsl.g:436:4: (lv_posicion_15_0= ruleCoordenada )
            {
            // InternalToursdsl.g:436:4: (lv_posicion_15_0= ruleCoordenada )
            // InternalToursdsl.g:437:5: lv_posicion_15_0= ruleCoordenada
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getPosicionCoordenadaParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_6);
            lv_posicion_15_0=ruleCoordenada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"posicion",
            						lv_posicion_15_0,
            						"co.edu.uniandes.Toursdsl.Coordenada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_18); 

            			newLeafNode(this_COMMA_16, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_16());
            		
            this_ROTATION_17=(Token)match(input,RULE_ROTATION,FOLLOW_4); 

            			newLeafNode(this_ROTATION_17, grammarAccess.getHotspotAccess().getROTATIONTerminalRuleCall_17());
            		
            this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_18, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_18());
            		
            // InternalToursdsl.g:466:3: ( (lv_rotacion_19_0= ruleCoordenada ) )
            // InternalToursdsl.g:467:4: (lv_rotacion_19_0= ruleCoordenada )
            {
            // InternalToursdsl.g:467:4: (lv_rotacion_19_0= ruleCoordenada )
            // InternalToursdsl.g:468:5: lv_rotacion_19_0= ruleCoordenada
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getRotacionCoordenadaParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_11);
            lv_rotacion_19_0=ruleCoordenada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"rotacion",
            						lv_rotacion_19_0,
            						"co.edu.uniandes.Toursdsl.Coordenada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSING_CURLY_BRACKET_20=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_20, grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_20());
            		

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
    // InternalToursdsl.g:493:1: entryRuleCoordenada returns [EObject current=null] : iv_ruleCoordenada= ruleCoordenada EOF ;
    public final EObject entryRuleCoordenada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordenada = null;


        try {
            // InternalToursdsl.g:493:51: (iv_ruleCoordenada= ruleCoordenada EOF )
            // InternalToursdsl.g:494:2: iv_ruleCoordenada= ruleCoordenada EOF
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
    // InternalToursdsl.g:500:1: ruleCoordenada returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= '-' ) )? this_INT_4= RULE_INT this_DOT_5= RULE_DOT this_INT_6= RULE_INT this_COMMA_7= RULE_COMMA this_COORDINATE_Y_8= RULE_COORDINATE_Y this_COLON_9= RULE_COLON ( (lv_y_10_0= '-' ) )? this_INT_11= RULE_INT this_DOT_12= RULE_DOT this_INT_13= RULE_INT this_COMMA_14= RULE_COMMA this_COORDINATE_Z_15= RULE_COORDINATE_Z this_COLON_16= RULE_COLON ( (lv_z_17_0= '-' ) )? this_INT_18= RULE_INT this_DOT_19= RULE_DOT this_INT_20= RULE_INT this_CLOSING_CURLY_BRACKET_21= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleCoordenada() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_COORDINATE_X_1=null;
        Token this_COLON_2=null;
        Token lv_x_3_0=null;
        Token this_INT_4=null;
        Token this_DOT_5=null;
        Token this_INT_6=null;
        Token this_COMMA_7=null;
        Token this_COORDINATE_Y_8=null;
        Token this_COLON_9=null;
        Token lv_y_10_0=null;
        Token this_INT_11=null;
        Token this_DOT_12=null;
        Token this_INT_13=null;
        Token this_COMMA_14=null;
        Token this_COORDINATE_Z_15=null;
        Token this_COLON_16=null;
        Token lv_z_17_0=null;
        Token this_INT_18=null;
        Token this_DOT_19=null;
        Token this_INT_20=null;
        Token this_CLOSING_CURLY_BRACKET_21=null;


        	enterRule();

        try {
            // InternalToursdsl.g:506:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= '-' ) )? this_INT_4= RULE_INT this_DOT_5= RULE_DOT this_INT_6= RULE_INT this_COMMA_7= RULE_COMMA this_COORDINATE_Y_8= RULE_COORDINATE_Y this_COLON_9= RULE_COLON ( (lv_y_10_0= '-' ) )? this_INT_11= RULE_INT this_DOT_12= RULE_DOT this_INT_13= RULE_INT this_COMMA_14= RULE_COMMA this_COORDINATE_Z_15= RULE_COORDINATE_Z this_COLON_16= RULE_COLON ( (lv_z_17_0= '-' ) )? this_INT_18= RULE_INT this_DOT_19= RULE_DOT this_INT_20= RULE_INT this_CLOSING_CURLY_BRACKET_21= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:507:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= '-' ) )? this_INT_4= RULE_INT this_DOT_5= RULE_DOT this_INT_6= RULE_INT this_COMMA_7= RULE_COMMA this_COORDINATE_Y_8= RULE_COORDINATE_Y this_COLON_9= RULE_COLON ( (lv_y_10_0= '-' ) )? this_INT_11= RULE_INT this_DOT_12= RULE_DOT this_INT_13= RULE_INT this_COMMA_14= RULE_COMMA this_COORDINATE_Z_15= RULE_COORDINATE_Z this_COLON_16= RULE_COLON ( (lv_z_17_0= '-' ) )? this_INT_18= RULE_INT this_DOT_19= RULE_DOT this_INT_20= RULE_INT this_CLOSING_CURLY_BRACKET_21= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:507:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= '-' ) )? this_INT_4= RULE_INT this_DOT_5= RULE_DOT this_INT_6= RULE_INT this_COMMA_7= RULE_COMMA this_COORDINATE_Y_8= RULE_COORDINATE_Y this_COLON_9= RULE_COLON ( (lv_y_10_0= '-' ) )? this_INT_11= RULE_INT this_DOT_12= RULE_DOT this_INT_13= RULE_INT this_COMMA_14= RULE_COMMA this_COORDINATE_Z_15= RULE_COORDINATE_Z this_COLON_16= RULE_COLON ( (lv_z_17_0= '-' ) )? this_INT_18= RULE_INT this_DOT_19= RULE_DOT this_INT_20= RULE_INT this_CLOSING_CURLY_BRACKET_21= RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:508:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_x_3_0= '-' ) )? this_INT_4= RULE_INT this_DOT_5= RULE_DOT this_INT_6= RULE_INT this_COMMA_7= RULE_COMMA this_COORDINATE_Y_8= RULE_COORDINATE_Y this_COLON_9= RULE_COLON ( (lv_y_10_0= '-' ) )? this_INT_11= RULE_INT this_DOT_12= RULE_DOT this_INT_13= RULE_INT this_COMMA_14= RULE_COMMA this_COORDINATE_Z_15= RULE_COORDINATE_Z this_COLON_16= RULE_COLON ( (lv_z_17_0= '-' ) )? this_INT_18= RULE_INT this_DOT_19= RULE_DOT this_INT_20= RULE_INT this_CLOSING_CURLY_BRACKET_21= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_19); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getCoordenadaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_COORDINATE_X_1=(Token)match(input,RULE_COORDINATE_X,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_X_1, grammarAccess.getCoordenadaAccess().getCOORDINATE_XTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_2, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalToursdsl.g:520:3: ( (lv_x_3_0= '-' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToursdsl.g:521:4: (lv_x_3_0= '-' )
                    {
                    // InternalToursdsl.g:521:4: (lv_x_3_0= '-' )
                    // InternalToursdsl.g:522:5: lv_x_3_0= '-'
                    {
                    lv_x_3_0=(Token)match(input,30,FOLLOW_21); 

                    					newLeafNode(lv_x_3_0, grammarAccess.getCoordenadaAccess().getXHyphenMinusKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCoordenadaRule());
                    					}
                    					setWithLastConsumed(current, "x", lv_x_3_0, "-");
                    				

                    }


                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_22); 

            			newLeafNode(this_INT_4, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_4());
            		
            this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_5, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_5());
            		
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_6); 

            			newLeafNode(this_INT_6, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_6());
            		
            this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_7, grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_7());
            		
            this_COORDINATE_Y_8=(Token)match(input,RULE_COORDINATE_Y,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Y_8, grammarAccess.getCoordenadaAccess().getCOORDINATE_YTerminalRuleCall_8());
            		
            this_COLON_9=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_9, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_9());
            		
            // InternalToursdsl.g:558:3: ( (lv_y_10_0= '-' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalToursdsl.g:559:4: (lv_y_10_0= '-' )
                    {
                    // InternalToursdsl.g:559:4: (lv_y_10_0= '-' )
                    // InternalToursdsl.g:560:5: lv_y_10_0= '-'
                    {
                    lv_y_10_0=(Token)match(input,30,FOLLOW_21); 

                    					newLeafNode(lv_y_10_0, grammarAccess.getCoordenadaAccess().getYHyphenMinusKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCoordenadaRule());
                    					}
                    					setWithLastConsumed(current, "y", lv_y_10_0, "-");
                    				

                    }


                    }
                    break;

            }

            this_INT_11=(Token)match(input,RULE_INT,FOLLOW_22); 

            			newLeafNode(this_INT_11, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_11());
            		
            this_DOT_12=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_12, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_12());
            		
            this_INT_13=(Token)match(input,RULE_INT,FOLLOW_6); 

            			newLeafNode(this_INT_13, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_13());
            		
            this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_24); 

            			newLeafNode(this_COMMA_14, grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_14());
            		
            this_COORDINATE_Z_15=(Token)match(input,RULE_COORDINATE_Z,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Z_15, grammarAccess.getCoordenadaAccess().getCOORDINATE_ZTerminalRuleCall_15());
            		
            this_COLON_16=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_16, grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_16());
            		
            // InternalToursdsl.g:596:3: ( (lv_z_17_0= '-' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToursdsl.g:597:4: (lv_z_17_0= '-' )
                    {
                    // InternalToursdsl.g:597:4: (lv_z_17_0= '-' )
                    // InternalToursdsl.g:598:5: lv_z_17_0= '-'
                    {
                    lv_z_17_0=(Token)match(input,30,FOLLOW_21); 

                    					newLeafNode(lv_z_17_0, grammarAccess.getCoordenadaAccess().getZHyphenMinusKeyword_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCoordenadaRule());
                    					}
                    					setWithLastConsumed(current, "z", lv_z_17_0, "-");
                    				

                    }


                    }
                    break;

            }

            this_INT_18=(Token)match(input,RULE_INT,FOLLOW_22); 

            			newLeafNode(this_INT_18, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_18());
            		
            this_DOT_19=(Token)match(input,RULE_DOT,FOLLOW_21); 

            			newLeafNode(this_DOT_19, grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_19());
            		
            this_INT_20=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(this_INT_20, grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_20());
            		
            this_CLOSING_CURLY_BRACKET_21=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_21, grammarAccess.getCoordenadaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_21());
            		

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});

}