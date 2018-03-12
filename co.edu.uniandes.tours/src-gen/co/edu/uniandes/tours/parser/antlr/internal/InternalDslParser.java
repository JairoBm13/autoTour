package co.edu.uniandes.tours.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.tours.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENING_CURLY_BRACKET", "RULE_NAME", "RULE_COLON", "RULE_COMMA", "RULE_PLACES", "RULE_OPENING_SQUARE_BRACKET", "RULE_CLOSING_SQUARE_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_DESCRIPTION", "RULE_STRING", "RULE_PATHS", "RULE_TO", "RULE_ID", "RULE_COORDINATE_X", "RULE_COORDINATE_Y", "RULE_COORDINATE_Z", "RULE_INT", "RULE_DOT", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'position'", "'rotation'", "'-'", "'E'", "'e'"
    };
    public static final int RULE_PATHS=14;
    public static final int RULE_TO=15;
    public static final int RULE_NAME=5;
    public static final int RULE_PLACES=8;
    public static final int RULE_STRING=13;
    public static final int RULE_CLOSING_CURLY_BRACKET=11;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_OPENING_CURLY_BRACKET=4;
    public static final int RULE_DOT=21;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_COORDINATE_Y=18;
    public static final int RULE_COORDINATE_X=17;
    public static final int RULE_COORDINATE_Z=19;
    public static final int RULE_ID=16;
    public static final int RULE_COMMA=7;
    public static final int RULE_WS=25;
    public static final int RULE_DESCRIPTION=12;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_QUOTE=22;
    public static final int RULE_OPENING_SQUARE_BRACKET=9;
    public static final int RULE_CLOSING_SQUARE_BRACKET=10;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tour";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTour"
    // InternalDsl.g:64:1: entryRuleTour returns [EObject current=null] : iv_ruleTour= ruleTour EOF ;
    public final EObject entryRuleTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTour = null;


        try {
            // InternalDsl.g:64:45: (iv_ruleTour= ruleTour EOF )
            // InternalDsl.g:65:2: iv_ruleTour= ruleTour EOF
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
    // InternalDsl.g:71:1: ruleTour returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_panoramas_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleTour() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token this_PLACES_5=null;
        Token this_COLON_6=null;
        Token this_OPENING_SQUARE_BRACKET_7=null;
        Token this_COMMA_9=null;
        Token this_CLOSING_SQUARE_BRACKET_11=null;
        Token this_CLOSING_CURLY_BRACKET_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_panoramas_8_0 = null;

        EObject lv_panoramas_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_panoramas_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_panoramas_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:78:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_panoramas_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:79:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_PLACES_5= RULE_PLACES this_COLON_6= RULE_COLON this_OPENING_SQUARE_BRACKET_7= RULE_OPENING_SQUARE_BRACKET ( (lv_panoramas_8_0= rulePanorama ) ) (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )* this_CLOSING_SQUARE_BRACKET_11= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getTourAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getTourAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getTourAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalDsl.g:91:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDsl.g:92:4: (lv_name_3_0= ruleEString )
            {
            // InternalDsl.g:92:4: (lv_name_3_0= ruleEString )
            // InternalDsl.g:93:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTourAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.edu.uniandes.tours.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

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
            		
            // InternalDsl.g:126:3: ( (lv_panoramas_8_0= rulePanorama ) )
            // InternalDsl.g:127:4: (lv_panoramas_8_0= rulePanorama )
            {
            // InternalDsl.g:127:4: (lv_panoramas_8_0= rulePanorama )
            // InternalDsl.g:128:5: lv_panoramas_8_0= rulePanorama
            {

            					newCompositeNode(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_panoramas_8_0=rulePanorama();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					add(
            						current,
            						"panoramas",
            						lv_panoramas_8_0,
            						"co.edu.uniandes.tours.Dsl.Panorama");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:145:3: (this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:146:4: this_COMMA_9= RULE_COMMA ( (lv_panoramas_10_0= rulePanorama ) )
            	    {
            	    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_9, grammarAccess.getTourAccess().getCOMMATerminalRuleCall_9_0());
            	    			
            	    // InternalDsl.g:150:4: ( (lv_panoramas_10_0= rulePanorama ) )
            	    // InternalDsl.g:151:5: (lv_panoramas_10_0= rulePanorama )
            	    {
            	    // InternalDsl.g:151:5: (lv_panoramas_10_0= rulePanorama )
            	    // InternalDsl.g:152:6: lv_panoramas_10_0= rulePanorama
            	    {

            	    						newCompositeNode(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_panoramas_10_0=rulePanorama();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTourRule());
            	    						}
            	    						add(
            	    							current,
            	    							"panoramas",
            	    							lv_panoramas_10_0,
            	    							"co.edu.uniandes.tours.Dsl.Panorama");
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
    // InternalDsl.g:182:1: entryRulePanorama returns [EObject current=null] : iv_rulePanorama= rulePanorama EOF ;
    public final EObject entryRulePanorama() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanorama = null;


        try {
            // InternalDsl.g:182:49: (iv_rulePanorama= rulePanorama EOF )
            // InternalDsl.g:183:2: iv_rulePanorama= rulePanorama EOF
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
    // InternalDsl.g:189:1: rulePanorama returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_hotspots_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject rulePanorama() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_hotspots_12_0 = null;

        EObject lv_hotspots_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:195:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_hotspots_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:196:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_hotspots_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:196:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_hotspots_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:197:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_DESCRIPTION_5= RULE_DESCRIPTION this_COLON_6= RULE_COLON ( (lv_description_7_0= RULE_STRING ) ) this_COMMA_8= RULE_COMMA this_PATHS_9= RULE_PATHS this_COLON_10= RULE_COLON this_OPENING_SQUARE_BRACKET_11= RULE_OPENING_SQUARE_BRACKET ( (lv_hotspots_12_0= ruleHotspot ) ) (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )* this_CLOSING_SQUARE_BRACKET_15= RULE_CLOSING_SQUARE_BRACKET this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getPanoramaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalDsl.g:209:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDsl.g:210:4: (lv_name_3_0= ruleEString )
            {
            // InternalDsl.g:210:4: (lv_name_3_0= ruleEString )
            // InternalDsl.g:211:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.edu.uniandes.tours.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            			newLeafNode(this_COMMA_4, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_4());
            		
            this_DESCRIPTION_5=(Token)match(input,RULE_DESCRIPTION,FOLLOW_4); 

            			newLeafNode(this_DESCRIPTION_5, grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_6, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalDsl.g:240:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalDsl.g:241:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalDsl.g:241:4: (lv_description_7_0= RULE_STRING )
            // InternalDsl.g:242:5: lv_description_7_0= RULE_STRING
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

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_14); 

            			newLeafNode(this_COMMA_8, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_8());
            		
            this_PATHS_9=(Token)match(input,RULE_PATHS,FOLLOW_4); 

            			newLeafNode(this_PATHS_9, grammarAccess.getPanoramaAccess().getPATHSTerminalRuleCall_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_10, grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_10());
            		
            this_OPENING_SQUARE_BRACKET_11=(Token)match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_9); 

            			newLeafNode(this_OPENING_SQUARE_BRACKET_11, grammarAccess.getPanoramaAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_11());
            		
            // InternalDsl.g:274:3: ( (lv_hotspots_12_0= ruleHotspot ) )
            // InternalDsl.g:275:4: (lv_hotspots_12_0= ruleHotspot )
            {
            // InternalDsl.g:275:4: (lv_hotspots_12_0= ruleHotspot )
            // InternalDsl.g:276:5: lv_hotspots_12_0= ruleHotspot
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_hotspots_12_0=ruleHotspot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					add(
            						current,
            						"hotspots",
            						lv_hotspots_12_0,
            						"co.edu.uniandes.tours.Dsl.Hotspot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:293:3: (this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:294:4: this_COMMA_13= RULE_COMMA ( (lv_hotspots_14_0= ruleHotspot ) )
            	    {
            	    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            	    				newLeafNode(this_COMMA_13, grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_13_0());
            	    			
            	    // InternalDsl.g:298:4: ( (lv_hotspots_14_0= ruleHotspot ) )
            	    // InternalDsl.g:299:5: (lv_hotspots_14_0= ruleHotspot )
            	    {
            	    // InternalDsl.g:299:5: (lv_hotspots_14_0= ruleHotspot )
            	    // InternalDsl.g:300:6: lv_hotspots_14_0= ruleHotspot
            	    {

            	    						newCompositeNode(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_hotspots_14_0=ruleHotspot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanoramaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hotspots",
            	    							lv_hotspots_14_0,
            	    							"co.edu.uniandes.tours.Dsl.Hotspot");
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
    // InternalDsl.g:330:1: entryRuleHotspot returns [EObject current=null] : iv_ruleHotspot= ruleHotspot EOF ;
    public final EObject entryRuleHotspot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotspot = null;


        try {
            // InternalDsl.g:330:48: (iv_ruleHotspot= ruleHotspot EOF )
            // InternalDsl.g:331:2: iv_ruleHotspot= ruleHotspot EOF
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
    // InternalDsl.g:337:1: ruleHotspot returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA otherlv_9= 'position' this_COLON_10= RULE_COLON ( (lv_position_11_0= rulePosition ) ) this_COMMA_12= RULE_COMMA otherlv_13= 'rotation' this_COLON_14= RULE_COLON ( (lv_rotation_15_0= ruleRotation ) ) this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleHotspot() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_NAME_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token this_TO_5=null;
        Token this_COLON_6=null;
        Token otherlv_7=null;
        Token this_COMMA_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_COMMA_12=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token this_CLOSING_CURLY_BRACKET_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_position_11_0 = null;

        EObject lv_rotation_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:343:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA otherlv_9= 'position' this_COLON_10= RULE_COLON ( (lv_position_11_0= rulePosition ) ) this_COMMA_12= RULE_COMMA otherlv_13= 'rotation' this_COLON_14= RULE_COLON ( (lv_rotation_15_0= ruleRotation ) ) this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:344:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA otherlv_9= 'position' this_COLON_10= RULE_COLON ( (lv_position_11_0= rulePosition ) ) this_COMMA_12= RULE_COMMA otherlv_13= 'rotation' this_COLON_14= RULE_COLON ( (lv_rotation_15_0= ruleRotation ) ) this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:344:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA otherlv_9= 'position' this_COLON_10= RULE_COLON ( (lv_position_11_0= rulePosition ) ) this_COMMA_12= RULE_COMMA otherlv_13= 'rotation' this_COLON_14= RULE_COLON ( (lv_rotation_15_0= ruleRotation ) ) this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:345:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_NAME_1= RULE_NAME this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA this_TO_5= RULE_TO this_COLON_6= RULE_COLON ( (otherlv_7= RULE_ID ) ) this_COMMA_8= RULE_COMMA otherlv_9= 'position' this_COLON_10= RULE_COLON ( (lv_position_11_0= rulePosition ) ) this_COMMA_12= RULE_COMMA otherlv_13= 'rotation' this_COLON_14= RULE_COLON ( (lv_rotation_15_0= ruleRotation ) ) this_CLOSING_CURLY_BRACKET_16= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_3); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getHotspotAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_1, grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalDsl.g:357:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDsl.g:358:4: (lv_name_3_0= ruleEString )
            {
            // InternalDsl.g:358:4: (lv_name_3_0= ruleEString )
            // InternalDsl.g:359:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.edu.uniandes.tours.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_4, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_4());
            		
            this_TO_5=(Token)match(input,RULE_TO,FOLLOW_4); 

            			newLeafNode(this_TO_5, grammarAccess.getHotspotAccess().getTOTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_16); 

            			newLeafNode(this_COLON_6, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalDsl.g:388:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:389:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:389:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:390:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_7, grammarAccess.getHotspotAccess().getToPanoramaCrossReference_7_0());
            				

            }


            }

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            			newLeafNode(this_COMMA_8, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getHotspotAccess().getPositionKeyword_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_10, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalDsl.g:413:3: ( (lv_position_11_0= rulePosition ) )
            // InternalDsl.g:414:4: (lv_position_11_0= rulePosition )
            {
            // InternalDsl.g:414:4: (lv_position_11_0= rulePosition )
            // InternalDsl.g:415:5: lv_position_11_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_6);
            lv_position_11_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_11_0,
            						"co.edu.uniandes.tours.Dsl.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_18); 

            			newLeafNode(this_COMMA_12, grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_12());
            		
            otherlv_13=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getHotspotAccess().getRotationKeyword_13());
            		
            this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_9); 

            			newLeafNode(this_COLON_14, grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_14());
            		
            // InternalDsl.g:444:3: ( (lv_rotation_15_0= ruleRotation ) )
            // InternalDsl.g:445:4: (lv_rotation_15_0= ruleRotation )
            {
            // InternalDsl.g:445:4: (lv_rotation_15_0= ruleRotation )
            // InternalDsl.g:446:5: lv_rotation_15_0= ruleRotation
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_11);
            lv_rotation_15_0=ruleRotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"rotation",
            						lv_rotation_15_0,
            						"co.edu.uniandes.tours.Dsl.Rotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSING_CURLY_BRACKET_16=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_16, grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_16());
            		

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


    // $ANTLR start "entryRulePosition"
    // InternalDsl.g:471:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalDsl.g:471:49: (iv_rulePosition= rulePosition EOF )
            // InternalDsl.g:472:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalDsl.g:478:1: rulePosition returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_COORDINATE_X_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token this_COORDINATE_Y_5=null;
        Token this_COLON_6=null;
        Token this_COMMA_8=null;
        Token this_COORDINATE_Z_9=null;
        Token this_COLON_10=null;
        Token this_CLOSING_CURLY_BRACKET_12=null;
        AntlrDatatypeRuleToken lv_posx_3_0 = null;

        AntlrDatatypeRuleToken lv_posy_7_0 = null;

        AntlrDatatypeRuleToken lv_posz_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:484:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:485:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:485:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:486:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_19); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getPositionAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_COORDINATE_X_1=(Token)match(input,RULE_COORDINATE_X,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_X_1, grammarAccess.getPositionAccess().getCOORDINATE_XTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_2, grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalDsl.g:498:3: ( (lv_posx_3_0= ruleEDouble ) )
            // InternalDsl.g:499:4: (lv_posx_3_0= ruleEDouble )
            {
            // InternalDsl.g:499:4: (lv_posx_3_0= ruleEDouble )
            // InternalDsl.g:500:5: lv_posx_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getPosxEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_posx_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"posx",
            						lv_posx_3_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_21); 

            			newLeafNode(this_COMMA_4, grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_4());
            		
            this_COORDINATE_Y_5=(Token)match(input,RULE_COORDINATE_Y,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Y_5, grammarAccess.getPositionAccess().getCOORDINATE_YTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_6, grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalDsl.g:529:3: ( (lv_posy_7_0= ruleEDouble ) )
            // InternalDsl.g:530:4: (lv_posy_7_0= ruleEDouble )
            {
            // InternalDsl.g:530:4: (lv_posy_7_0= ruleEDouble )
            // InternalDsl.g:531:5: lv_posy_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getPosyEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
            lv_posy_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"posy",
            						lv_posy_7_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_22); 

            			newLeafNode(this_COMMA_8, grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_8());
            		
            this_COORDINATE_Z_9=(Token)match(input,RULE_COORDINATE_Z,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Z_9, grammarAccess.getPositionAccess().getCOORDINATE_ZTerminalRuleCall_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_10, grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalDsl.g:560:3: ( (lv_posz_11_0= ruleEDouble ) )
            // InternalDsl.g:561:4: (lv_posz_11_0= ruleEDouble )
            {
            // InternalDsl.g:561:4: (lv_posz_11_0= ruleEDouble )
            // InternalDsl.g:562:5: lv_posz_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getPoszEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_posz_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"posz",
            						lv_posz_11_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSING_CURLY_BRACKET_12=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_12, grammarAccess.getPositionAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12());
            		

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleRotation"
    // InternalDsl.g:587:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalDsl.g:587:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalDsl.g:588:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
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
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalDsl.g:594:1: ruleRotation returns [EObject current=null] : (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token this_OPENING_CURLY_BRACKET_0=null;
        Token this_COORDINATE_X_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token this_COORDINATE_Y_5=null;
        Token this_COLON_6=null;
        Token this_COMMA_8=null;
        Token this_COORDINATE_Z_9=null;
        Token this_COLON_10=null;
        Token this_CLOSING_CURLY_BRACKET_12=null;
        AntlrDatatypeRuleToken lv_posx_3_0 = null;

        AntlrDatatypeRuleToken lv_posy_7_0 = null;

        AntlrDatatypeRuleToken lv_posz_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:600:2: ( (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:601:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:601:2: (this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:602:3: this_OPENING_CURLY_BRACKET_0= RULE_OPENING_CURLY_BRACKET this_COORDINATE_X_1= RULE_COORDINATE_X this_COLON_2= RULE_COLON ( (lv_posx_3_0= ruleEDouble ) ) this_COMMA_4= RULE_COMMA this_COORDINATE_Y_5= RULE_COORDINATE_Y this_COLON_6= RULE_COLON ( (lv_posy_7_0= ruleEDouble ) ) this_COMMA_8= RULE_COMMA this_COORDINATE_Z_9= RULE_COORDINATE_Z this_COLON_10= RULE_COLON ( (lv_posz_11_0= ruleEDouble ) ) this_CLOSING_CURLY_BRACKET_12= RULE_CLOSING_CURLY_BRACKET
            {
            this_OPENING_CURLY_BRACKET_0=(Token)match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_19); 

            			newLeafNode(this_OPENING_CURLY_BRACKET_0, grammarAccess.getRotationAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0());
            		
            this_COORDINATE_X_1=(Token)match(input,RULE_COORDINATE_X,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_X_1, grammarAccess.getRotationAccess().getCOORDINATE_XTerminalRuleCall_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_2, grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalDsl.g:614:3: ( (lv_posx_3_0= ruleEDouble ) )
            // InternalDsl.g:615:4: (lv_posx_3_0= ruleEDouble )
            {
            // InternalDsl.g:615:4: (lv_posx_3_0= ruleEDouble )
            // InternalDsl.g:616:5: lv_posx_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getPosxEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_posx_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					set(
            						current,
            						"posx",
            						lv_posx_3_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_21); 

            			newLeafNode(this_COMMA_4, grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_4());
            		
            this_COORDINATE_Y_5=(Token)match(input,RULE_COORDINATE_Y,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Y_5, grammarAccess.getRotationAccess().getCOORDINATE_YTerminalRuleCall_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_6, grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalDsl.g:645:3: ( (lv_posy_7_0= ruleEDouble ) )
            // InternalDsl.g:646:4: (lv_posy_7_0= ruleEDouble )
            {
            // InternalDsl.g:646:4: (lv_posy_7_0= ruleEDouble )
            // InternalDsl.g:647:5: lv_posy_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getPosyEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
            lv_posy_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					set(
            						current,
            						"posy",
            						lv_posy_7_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_22); 

            			newLeafNode(this_COMMA_8, grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_8());
            		
            this_COORDINATE_Z_9=(Token)match(input,RULE_COORDINATE_Z,FOLLOW_4); 

            			newLeafNode(this_COORDINATE_Z_9, grammarAccess.getRotationAccess().getCOORDINATE_ZTerminalRuleCall_9());
            		
            this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_10, grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalDsl.g:676:3: ( (lv_posz_11_0= ruleEDouble ) )
            // InternalDsl.g:677:4: (lv_posz_11_0= ruleEDouble )
            {
            // InternalDsl.g:677:4: (lv_posz_11_0= ruleEDouble )
            // InternalDsl.g:678:5: lv_posz_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRotationAccess().getPoszEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_posz_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationRule());
            					}
            					set(
            						current,
            						"posz",
            						lv_posz_11_0,
            						"co.edu.uniandes.tours.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSING_CURLY_BRACKET_12=(Token)match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 

            			newLeafNode(this_CLOSING_CURLY_BRACKET_12, grammarAccess.getRotationAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:703:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:703:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:704:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:710:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:716:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:717:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:717:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:718:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:726:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:737:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:737:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:738:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:744:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? this_DOT_2= RULE_DOT this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_DOT_2=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:750:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? this_DOT_2= RULE_DOT this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:751:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? this_DOT_2= RULE_DOT this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:751:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? this_DOT_2= RULE_DOT this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:752:3: (kw= '-' )? (this_INT_1= RULE_INT )? this_DOT_2= RULE_DOT this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:752:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:753:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:759:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:760:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_25); 

            			current.merge(this_DOT_2);
            		

            			newLeafNode(this_DOT_2, grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:782:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:783:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:783:4: (kw= 'E' | kw= 'e' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==30) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==31) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDsl.g:784:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:790:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:796:4: (kw= '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==29) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDsl.g:797:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020100000L});

}