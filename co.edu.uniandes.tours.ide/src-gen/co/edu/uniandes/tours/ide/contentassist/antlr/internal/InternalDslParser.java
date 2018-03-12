package co.edu.uniandes.tours.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.tours.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OPENING_CURLY_BRACKET", "RULE_NAME", "RULE_COLON", "RULE_COMMA", "RULE_PLACES", "RULE_OPENING_SQUARE_BRACKET", "RULE_CLOSING_SQUARE_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_DESCRIPTION", "RULE_PATHS", "RULE_TO", "RULE_COORDINATE_X", "RULE_COORDINATE_Y", "RULE_COORDINATE_Z", "RULE_INT", "RULE_DOT", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'position'", "'rotation'", "'-'"
    };
    public static final int RULE_PATHS=15;
    public static final int RULE_TO=16;
    public static final int RULE_NAME=7;
    public static final int RULE_PLACES=10;
    public static final int RULE_STRING=4;
    public static final int RULE_CLOSING_CURLY_BRACKET=13;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_OPENING_CURLY_BRACKET=6;
    public static final int RULE_DOT=21;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_COORDINATE_Y=18;
    public static final int RULE_COORDINATE_X=17;
    public static final int RULE_COORDINATE_Z=19;
    public static final int RULE_ID=5;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=25;
    public static final int RULE_DESCRIPTION=14;
    public static final int RULE_COLON=8;
    public static final int RULE_ANY_OTHER=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_QUOTE=22;
    public static final int RULE_OPENING_SQUARE_BRACKET=11;
    public static final int RULE_CLOSING_SQUARE_BRACKET=12;

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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTour"
    // InternalDsl.g:53:1: entryRuleTour : ruleTour EOF ;
    public final void entryRuleTour() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleTour EOF )
            // InternalDsl.g:55:1: ruleTour EOF
            {
             before(grammarAccess.getTourRule()); 
            pushFollow(FOLLOW_1);
            ruleTour();

            state._fsp--;

             after(grammarAccess.getTourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTour"


    // $ANTLR start "ruleTour"
    // InternalDsl.g:62:1: ruleTour : ( ( rule__Tour__Group__0 ) ) ;
    public final void ruleTour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Tour__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Tour__Group__0 )
            {
             before(grammarAccess.getTourAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Tour__Group__0 )
            // InternalDsl.g:69:4: rule__Tour__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTour"


    // $ANTLR start "entryRulePanorama"
    // InternalDsl.g:78:1: entryRulePanorama : rulePanorama EOF ;
    public final void entryRulePanorama() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePanorama EOF )
            // InternalDsl.g:80:1: rulePanorama EOF
            {
             before(grammarAccess.getPanoramaRule()); 
            pushFollow(FOLLOW_1);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getPanoramaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanorama"


    // $ANTLR start "rulePanorama"
    // InternalDsl.g:87:1: rulePanorama : ( ( rule__Panorama__Group__0 ) ) ;
    public final void rulePanorama() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Panorama__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Panorama__Group__0 )
            {
             before(grammarAccess.getPanoramaAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Panorama__Group__0 )
            // InternalDsl.g:94:4: rule__Panorama__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanorama"


    // $ANTLR start "entryRuleHotspot"
    // InternalDsl.g:103:1: entryRuleHotspot : ruleHotspot EOF ;
    public final void entryRuleHotspot() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleHotspot EOF )
            // InternalDsl.g:105:1: ruleHotspot EOF
            {
             before(grammarAccess.getHotspotRule()); 
            pushFollow(FOLLOW_1);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getHotspotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHotspot"


    // $ANTLR start "ruleHotspot"
    // InternalDsl.g:112:1: ruleHotspot : ( ( rule__Hotspot__Group__0 ) ) ;
    public final void ruleHotspot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Hotspot__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Hotspot__Group__0 )
            {
             before(grammarAccess.getHotspotAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Hotspot__Group__0 )
            // InternalDsl.g:119:4: rule__Hotspot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHotspot"


    // $ANTLR start "entryRulePosition"
    // InternalDsl.g:128:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( rulePosition EOF )
            // InternalDsl.g:130:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalDsl.g:137:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Position__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Position__Group__0 )
            // InternalDsl.g:144:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleRotation"
    // InternalDsl.g:153:1: entryRuleRotation : ruleRotation EOF ;
    public final void entryRuleRotation() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleRotation EOF )
            // InternalDsl.g:155:1: ruleRotation EOF
            {
             before(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getRotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalDsl.g:162:1: ruleRotation : ( ( rule__Rotation__Group__0 ) ) ;
    public final void ruleRotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Rotation__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Rotation__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Rotation__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Rotation__Group__0 )
            {
             before(grammarAccess.getRotationAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Rotation__Group__0 )
            // InternalDsl.g:169:4: rule__Rotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleEString EOF )
            // InternalDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:203:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleEDouble EOF )
            // InternalDsl.g:205:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:212:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__EDouble__Group__0 )
            // InternalDsl.g:219:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:232:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:232:2: ( RULE_STRING )
                    // InternalDsl.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:238:2: ( RULE_ID )
                    {
                    // InternalDsl.g:238:2: ( RULE_ID )
                    // InternalDsl.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalDsl.g:248:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:252:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:253:2: ( 'E' )
                    {
                    // InternalDsl.g:253:2: ( 'E' )
                    // InternalDsl.g:254:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:259:2: ( 'e' )
                    {
                    // InternalDsl.g:259:2: ( 'e' )
                    // InternalDsl.g:260:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Tour__Group__0"
    // InternalDsl.g:269:1: rule__Tour__Group__0 : rule__Tour__Group__0__Impl rule__Tour__Group__1 ;
    public final void rule__Tour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:273:1: ( rule__Tour__Group__0__Impl rule__Tour__Group__1 )
            // InternalDsl.g:274:2: rule__Tour__Group__0__Impl rule__Tour__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tour__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__0"


    // $ANTLR start "rule__Tour__Group__0__Impl"
    // InternalDsl.g:281:1: rule__Tour__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Tour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:285:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalDsl.g:286:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalDsl.g:286:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalDsl.g:287:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getTourAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__0__Impl"


    // $ANTLR start "rule__Tour__Group__1"
    // InternalDsl.g:296:1: rule__Tour__Group__1 : rule__Tour__Group__1__Impl rule__Tour__Group__2 ;
    public final void rule__Tour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:300:1: ( rule__Tour__Group__1__Impl rule__Tour__Group__2 )
            // InternalDsl.g:301:2: rule__Tour__Group__1__Impl rule__Tour__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tour__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__1"


    // $ANTLR start "rule__Tour__Group__1__Impl"
    // InternalDsl.g:308:1: rule__Tour__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Tour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:312:1: ( ( RULE_NAME ) )
            // InternalDsl.g:313:1: ( RULE_NAME )
            {
            // InternalDsl.g:313:1: ( RULE_NAME )
            // InternalDsl.g:314:2: RULE_NAME
            {
             before(grammarAccess.getTourAccess().getNAMETerminalRuleCall_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getNAMETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__1__Impl"


    // $ANTLR start "rule__Tour__Group__2"
    // InternalDsl.g:323:1: rule__Tour__Group__2 : rule__Tour__Group__2__Impl rule__Tour__Group__3 ;
    public final void rule__Tour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:327:1: ( rule__Tour__Group__2__Impl rule__Tour__Group__3 )
            // InternalDsl.g:328:2: rule__Tour__Group__2__Impl rule__Tour__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tour__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__2"


    // $ANTLR start "rule__Tour__Group__2__Impl"
    // InternalDsl.g:335:1: rule__Tour__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Tour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:339:1: ( ( RULE_COLON ) )
            // InternalDsl.g:340:1: ( RULE_COLON )
            {
            // InternalDsl.g:340:1: ( RULE_COLON )
            // InternalDsl.g:341:2: RULE_COLON
            {
             before(grammarAccess.getTourAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__2__Impl"


    // $ANTLR start "rule__Tour__Group__3"
    // InternalDsl.g:350:1: rule__Tour__Group__3 : rule__Tour__Group__3__Impl rule__Tour__Group__4 ;
    public final void rule__Tour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:354:1: ( rule__Tour__Group__3__Impl rule__Tour__Group__4 )
            // InternalDsl.g:355:2: rule__Tour__Group__3__Impl rule__Tour__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Tour__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__3"


    // $ANTLR start "rule__Tour__Group__3__Impl"
    // InternalDsl.g:362:1: rule__Tour__Group__3__Impl : ( ( rule__Tour__NameAssignment_3 ) ) ;
    public final void rule__Tour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:1: ( ( ( rule__Tour__NameAssignment_3 ) ) )
            // InternalDsl.g:367:1: ( ( rule__Tour__NameAssignment_3 ) )
            {
            // InternalDsl.g:367:1: ( ( rule__Tour__NameAssignment_3 ) )
            // InternalDsl.g:368:2: ( rule__Tour__NameAssignment_3 )
            {
             before(grammarAccess.getTourAccess().getNameAssignment_3()); 
            // InternalDsl.g:369:2: ( rule__Tour__NameAssignment_3 )
            // InternalDsl.g:369:3: rule__Tour__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tour__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__3__Impl"


    // $ANTLR start "rule__Tour__Group__4"
    // InternalDsl.g:377:1: rule__Tour__Group__4 : rule__Tour__Group__4__Impl rule__Tour__Group__5 ;
    public final void rule__Tour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:1: ( rule__Tour__Group__4__Impl rule__Tour__Group__5 )
            // InternalDsl.g:382:2: rule__Tour__Group__4__Impl rule__Tour__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Tour__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__4"


    // $ANTLR start "rule__Tour__Group__4__Impl"
    // InternalDsl.g:389:1: rule__Tour__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Tour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:393:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:394:1: ( RULE_COMMA )
            {
            // InternalDsl.g:394:1: ( RULE_COMMA )
            // InternalDsl.g:395:2: RULE_COMMA
            {
             before(grammarAccess.getTourAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__4__Impl"


    // $ANTLR start "rule__Tour__Group__5"
    // InternalDsl.g:404:1: rule__Tour__Group__5 : rule__Tour__Group__5__Impl rule__Tour__Group__6 ;
    public final void rule__Tour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:408:1: ( rule__Tour__Group__5__Impl rule__Tour__Group__6 )
            // InternalDsl.g:409:2: rule__Tour__Group__5__Impl rule__Tour__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Tour__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__5"


    // $ANTLR start "rule__Tour__Group__5__Impl"
    // InternalDsl.g:416:1: rule__Tour__Group__5__Impl : ( RULE_PLACES ) ;
    public final void rule__Tour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:420:1: ( ( RULE_PLACES ) )
            // InternalDsl.g:421:1: ( RULE_PLACES )
            {
            // InternalDsl.g:421:1: ( RULE_PLACES )
            // InternalDsl.g:422:2: RULE_PLACES
            {
             before(grammarAccess.getTourAccess().getPLACESTerminalRuleCall_5()); 
            match(input,RULE_PLACES,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getPLACESTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__5__Impl"


    // $ANTLR start "rule__Tour__Group__6"
    // InternalDsl.g:431:1: rule__Tour__Group__6 : rule__Tour__Group__6__Impl rule__Tour__Group__7 ;
    public final void rule__Tour__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( rule__Tour__Group__6__Impl rule__Tour__Group__7 )
            // InternalDsl.g:436:2: rule__Tour__Group__6__Impl rule__Tour__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Tour__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__6"


    // $ANTLR start "rule__Tour__Group__6__Impl"
    // InternalDsl.g:443:1: rule__Tour__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Tour__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:447:1: ( ( RULE_COLON ) )
            // InternalDsl.g:448:1: ( RULE_COLON )
            {
            // InternalDsl.g:448:1: ( RULE_COLON )
            // InternalDsl.g:449:2: RULE_COLON
            {
             before(grammarAccess.getTourAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__6__Impl"


    // $ANTLR start "rule__Tour__Group__7"
    // InternalDsl.g:458:1: rule__Tour__Group__7 : rule__Tour__Group__7__Impl rule__Tour__Group__8 ;
    public final void rule__Tour__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:462:1: ( rule__Tour__Group__7__Impl rule__Tour__Group__8 )
            // InternalDsl.g:463:2: rule__Tour__Group__7__Impl rule__Tour__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Tour__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__7"


    // $ANTLR start "rule__Tour__Group__7__Impl"
    // InternalDsl.g:470:1: rule__Tour__Group__7__Impl : ( RULE_OPENING_SQUARE_BRACKET ) ;
    public final void rule__Tour__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:474:1: ( ( RULE_OPENING_SQUARE_BRACKET ) )
            // InternalDsl.g:475:1: ( RULE_OPENING_SQUARE_BRACKET )
            {
            // InternalDsl.g:475:1: ( RULE_OPENING_SQUARE_BRACKET )
            // InternalDsl.g:476:2: RULE_OPENING_SQUARE_BRACKET
            {
             before(grammarAccess.getTourAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__7__Impl"


    // $ANTLR start "rule__Tour__Group__8"
    // InternalDsl.g:485:1: rule__Tour__Group__8 : rule__Tour__Group__8__Impl rule__Tour__Group__9 ;
    public final void rule__Tour__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:489:1: ( rule__Tour__Group__8__Impl rule__Tour__Group__9 )
            // InternalDsl.g:490:2: rule__Tour__Group__8__Impl rule__Tour__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Tour__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__8"


    // $ANTLR start "rule__Tour__Group__8__Impl"
    // InternalDsl.g:497:1: rule__Tour__Group__8__Impl : ( ( rule__Tour__PanoramasAssignment_8 ) ) ;
    public final void rule__Tour__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:501:1: ( ( ( rule__Tour__PanoramasAssignment_8 ) ) )
            // InternalDsl.g:502:1: ( ( rule__Tour__PanoramasAssignment_8 ) )
            {
            // InternalDsl.g:502:1: ( ( rule__Tour__PanoramasAssignment_8 ) )
            // InternalDsl.g:503:2: ( rule__Tour__PanoramasAssignment_8 )
            {
             before(grammarAccess.getTourAccess().getPanoramasAssignment_8()); 
            // InternalDsl.g:504:2: ( rule__Tour__PanoramasAssignment_8 )
            // InternalDsl.g:504:3: rule__Tour__PanoramasAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Tour__PanoramasAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getPanoramasAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__8__Impl"


    // $ANTLR start "rule__Tour__Group__9"
    // InternalDsl.g:512:1: rule__Tour__Group__9 : rule__Tour__Group__9__Impl rule__Tour__Group__10 ;
    public final void rule__Tour__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:1: ( rule__Tour__Group__9__Impl rule__Tour__Group__10 )
            // InternalDsl.g:517:2: rule__Tour__Group__9__Impl rule__Tour__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Tour__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__9"


    // $ANTLR start "rule__Tour__Group__9__Impl"
    // InternalDsl.g:524:1: rule__Tour__Group__9__Impl : ( ( rule__Tour__Group_9__0 )* ) ;
    public final void rule__Tour__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:528:1: ( ( ( rule__Tour__Group_9__0 )* ) )
            // InternalDsl.g:529:1: ( ( rule__Tour__Group_9__0 )* )
            {
            // InternalDsl.g:529:1: ( ( rule__Tour__Group_9__0 )* )
            // InternalDsl.g:530:2: ( rule__Tour__Group_9__0 )*
            {
             before(grammarAccess.getTourAccess().getGroup_9()); 
            // InternalDsl.g:531:2: ( rule__Tour__Group_9__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:531:3: rule__Tour__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tour__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTourAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__9__Impl"


    // $ANTLR start "rule__Tour__Group__10"
    // InternalDsl.g:539:1: rule__Tour__Group__10 : rule__Tour__Group__10__Impl rule__Tour__Group__11 ;
    public final void rule__Tour__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:543:1: ( rule__Tour__Group__10__Impl rule__Tour__Group__11 )
            // InternalDsl.g:544:2: rule__Tour__Group__10__Impl rule__Tour__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Tour__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__10"


    // $ANTLR start "rule__Tour__Group__10__Impl"
    // InternalDsl.g:551:1: rule__Tour__Group__10__Impl : ( RULE_CLOSING_SQUARE_BRACKET ) ;
    public final void rule__Tour__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:555:1: ( ( RULE_CLOSING_SQUARE_BRACKET ) )
            // InternalDsl.g:556:1: ( RULE_CLOSING_SQUARE_BRACKET )
            {
            // InternalDsl.g:556:1: ( RULE_CLOSING_SQUARE_BRACKET )
            // InternalDsl.g:557:2: RULE_CLOSING_SQUARE_BRACKET
            {
             before(grammarAccess.getTourAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_10()); 
            match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__10__Impl"


    // $ANTLR start "rule__Tour__Group__11"
    // InternalDsl.g:566:1: rule__Tour__Group__11 : rule__Tour__Group__11__Impl ;
    public final void rule__Tour__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:570:1: ( rule__Tour__Group__11__Impl )
            // InternalDsl.g:571:2: rule__Tour__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__11"


    // $ANTLR start "rule__Tour__Group__11__Impl"
    // InternalDsl.g:577:1: rule__Tour__Group__11__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Tour__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:582:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:582:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:583:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getTourAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_11()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__11__Impl"


    // $ANTLR start "rule__Tour__Group_9__0"
    // InternalDsl.g:593:1: rule__Tour__Group_9__0 : rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1 ;
    public final void rule__Tour__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:597:1: ( rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1 )
            // InternalDsl.g:598:2: rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Tour__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group_9__0"


    // $ANTLR start "rule__Tour__Group_9__0__Impl"
    // InternalDsl.g:605:1: rule__Tour__Group_9__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Tour__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:609:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:610:1: ( RULE_COMMA )
            {
            // InternalDsl.g:610:1: ( RULE_COMMA )
            // InternalDsl.g:611:2: RULE_COMMA
            {
             before(grammarAccess.getTourAccess().getCOMMATerminalRuleCall_9_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCOMMATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group_9__0__Impl"


    // $ANTLR start "rule__Tour__Group_9__1"
    // InternalDsl.g:620:1: rule__Tour__Group_9__1 : rule__Tour__Group_9__1__Impl ;
    public final void rule__Tour__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( rule__Tour__Group_9__1__Impl )
            // InternalDsl.g:625:2: rule__Tour__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group_9__1"


    // $ANTLR start "rule__Tour__Group_9__1__Impl"
    // InternalDsl.g:631:1: rule__Tour__Group_9__1__Impl : ( ( rule__Tour__PanoramasAssignment_9_1 ) ) ;
    public final void rule__Tour__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:635:1: ( ( ( rule__Tour__PanoramasAssignment_9_1 ) ) )
            // InternalDsl.g:636:1: ( ( rule__Tour__PanoramasAssignment_9_1 ) )
            {
            // InternalDsl.g:636:1: ( ( rule__Tour__PanoramasAssignment_9_1 ) )
            // InternalDsl.g:637:2: ( rule__Tour__PanoramasAssignment_9_1 )
            {
             before(grammarAccess.getTourAccess().getPanoramasAssignment_9_1()); 
            // InternalDsl.g:638:2: ( rule__Tour__PanoramasAssignment_9_1 )
            // InternalDsl.g:638:3: rule__Tour__PanoramasAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Tour__PanoramasAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getPanoramasAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group_9__1__Impl"


    // $ANTLR start "rule__Panorama__Group__0"
    // InternalDsl.g:647:1: rule__Panorama__Group__0 : rule__Panorama__Group__0__Impl rule__Panorama__Group__1 ;
    public final void rule__Panorama__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:651:1: ( rule__Panorama__Group__0__Impl rule__Panorama__Group__1 )
            // InternalDsl.g:652:2: rule__Panorama__Group__0__Impl rule__Panorama__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Panorama__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__0"


    // $ANTLR start "rule__Panorama__Group__0__Impl"
    // InternalDsl.g:659:1: rule__Panorama__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Panorama__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:663:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalDsl.g:664:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalDsl.g:664:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalDsl.g:665:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getPanoramaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__0__Impl"


    // $ANTLR start "rule__Panorama__Group__1"
    // InternalDsl.g:674:1: rule__Panorama__Group__1 : rule__Panorama__Group__1__Impl rule__Panorama__Group__2 ;
    public final void rule__Panorama__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( rule__Panorama__Group__1__Impl rule__Panorama__Group__2 )
            // InternalDsl.g:679:2: rule__Panorama__Group__1__Impl rule__Panorama__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Panorama__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__1"


    // $ANTLR start "rule__Panorama__Group__1__Impl"
    // InternalDsl.g:686:1: rule__Panorama__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Panorama__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:690:1: ( ( RULE_NAME ) )
            // InternalDsl.g:691:1: ( RULE_NAME )
            {
            // InternalDsl.g:691:1: ( RULE_NAME )
            // InternalDsl.g:692:2: RULE_NAME
            {
             before(grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__1__Impl"


    // $ANTLR start "rule__Panorama__Group__2"
    // InternalDsl.g:701:1: rule__Panorama__Group__2 : rule__Panorama__Group__2__Impl rule__Panorama__Group__3 ;
    public final void rule__Panorama__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( rule__Panorama__Group__2__Impl rule__Panorama__Group__3 )
            // InternalDsl.g:706:2: rule__Panorama__Group__2__Impl rule__Panorama__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Panorama__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__2"


    // $ANTLR start "rule__Panorama__Group__2__Impl"
    // InternalDsl.g:713:1: rule__Panorama__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( ( RULE_COLON ) )
            // InternalDsl.g:718:1: ( RULE_COLON )
            {
            // InternalDsl.g:718:1: ( RULE_COLON )
            // InternalDsl.g:719:2: RULE_COLON
            {
             before(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__2__Impl"


    // $ANTLR start "rule__Panorama__Group__3"
    // InternalDsl.g:728:1: rule__Panorama__Group__3 : rule__Panorama__Group__3__Impl rule__Panorama__Group__4 ;
    public final void rule__Panorama__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( rule__Panorama__Group__3__Impl rule__Panorama__Group__4 )
            // InternalDsl.g:733:2: rule__Panorama__Group__3__Impl rule__Panorama__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Panorama__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__3"


    // $ANTLR start "rule__Panorama__Group__3__Impl"
    // InternalDsl.g:740:1: rule__Panorama__Group__3__Impl : ( ( rule__Panorama__NameAssignment_3 ) ) ;
    public final void rule__Panorama__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( ( ( rule__Panorama__NameAssignment_3 ) ) )
            // InternalDsl.g:745:1: ( ( rule__Panorama__NameAssignment_3 ) )
            {
            // InternalDsl.g:745:1: ( ( rule__Panorama__NameAssignment_3 ) )
            // InternalDsl.g:746:2: ( rule__Panorama__NameAssignment_3 )
            {
             before(grammarAccess.getPanoramaAccess().getNameAssignment_3()); 
            // InternalDsl.g:747:2: ( rule__Panorama__NameAssignment_3 )
            // InternalDsl.g:747:3: rule__Panorama__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__3__Impl"


    // $ANTLR start "rule__Panorama__Group__4"
    // InternalDsl.g:755:1: rule__Panorama__Group__4 : rule__Panorama__Group__4__Impl rule__Panorama__Group__5 ;
    public final void rule__Panorama__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__Panorama__Group__4__Impl rule__Panorama__Group__5 )
            // InternalDsl.g:760:2: rule__Panorama__Group__4__Impl rule__Panorama__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Panorama__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__4"


    // $ANTLR start "rule__Panorama__Group__4__Impl"
    // InternalDsl.g:767:1: rule__Panorama__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:772:1: ( RULE_COMMA )
            {
            // InternalDsl.g:772:1: ( RULE_COMMA )
            // InternalDsl.g:773:2: RULE_COMMA
            {
             before(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__4__Impl"


    // $ANTLR start "rule__Panorama__Group__5"
    // InternalDsl.g:782:1: rule__Panorama__Group__5 : rule__Panorama__Group__5__Impl rule__Panorama__Group__6 ;
    public final void rule__Panorama__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__Panorama__Group__5__Impl rule__Panorama__Group__6 )
            // InternalDsl.g:787:2: rule__Panorama__Group__5__Impl rule__Panorama__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Panorama__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__5"


    // $ANTLR start "rule__Panorama__Group__5__Impl"
    // InternalDsl.g:794:1: rule__Panorama__Group__5__Impl : ( RULE_DESCRIPTION ) ;
    public final void rule__Panorama__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( RULE_DESCRIPTION ) )
            // InternalDsl.g:799:1: ( RULE_DESCRIPTION )
            {
            // InternalDsl.g:799:1: ( RULE_DESCRIPTION )
            // InternalDsl.g:800:2: RULE_DESCRIPTION
            {
             before(grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_5()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__5__Impl"


    // $ANTLR start "rule__Panorama__Group__6"
    // InternalDsl.g:809:1: rule__Panorama__Group__6 : rule__Panorama__Group__6__Impl rule__Panorama__Group__7 ;
    public final void rule__Panorama__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__Panorama__Group__6__Impl rule__Panorama__Group__7 )
            // InternalDsl.g:814:2: rule__Panorama__Group__6__Impl rule__Panorama__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Panorama__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__6"


    // $ANTLR start "rule__Panorama__Group__6__Impl"
    // InternalDsl.g:821:1: rule__Panorama__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( RULE_COLON ) )
            // InternalDsl.g:826:1: ( RULE_COLON )
            {
            // InternalDsl.g:826:1: ( RULE_COLON )
            // InternalDsl.g:827:2: RULE_COLON
            {
             before(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__6__Impl"


    // $ANTLR start "rule__Panorama__Group__7"
    // InternalDsl.g:836:1: rule__Panorama__Group__7 : rule__Panorama__Group__7__Impl rule__Panorama__Group__8 ;
    public final void rule__Panorama__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:840:1: ( rule__Panorama__Group__7__Impl rule__Panorama__Group__8 )
            // InternalDsl.g:841:2: rule__Panorama__Group__7__Impl rule__Panorama__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Panorama__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__7"


    // $ANTLR start "rule__Panorama__Group__7__Impl"
    // InternalDsl.g:848:1: rule__Panorama__Group__7__Impl : ( ( rule__Panorama__DescriptionAssignment_7 ) ) ;
    public final void rule__Panorama__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:852:1: ( ( ( rule__Panorama__DescriptionAssignment_7 ) ) )
            // InternalDsl.g:853:1: ( ( rule__Panorama__DescriptionAssignment_7 ) )
            {
            // InternalDsl.g:853:1: ( ( rule__Panorama__DescriptionAssignment_7 ) )
            // InternalDsl.g:854:2: ( rule__Panorama__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPanoramaAccess().getDescriptionAssignment_7()); 
            // InternalDsl.g:855:2: ( rule__Panorama__DescriptionAssignment_7 )
            // InternalDsl.g:855:3: rule__Panorama__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__DescriptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__7__Impl"


    // $ANTLR start "rule__Panorama__Group__8"
    // InternalDsl.g:863:1: rule__Panorama__Group__8 : rule__Panorama__Group__8__Impl rule__Panorama__Group__9 ;
    public final void rule__Panorama__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:867:1: ( rule__Panorama__Group__8__Impl rule__Panorama__Group__9 )
            // InternalDsl.g:868:2: rule__Panorama__Group__8__Impl rule__Panorama__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Panorama__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__8"


    // $ANTLR start "rule__Panorama__Group__8__Impl"
    // InternalDsl.g:875:1: rule__Panorama__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:879:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:880:1: ( RULE_COMMA )
            {
            // InternalDsl.g:880:1: ( RULE_COMMA )
            // InternalDsl.g:881:2: RULE_COMMA
            {
             before(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_8()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__8__Impl"


    // $ANTLR start "rule__Panorama__Group__9"
    // InternalDsl.g:890:1: rule__Panorama__Group__9 : rule__Panorama__Group__9__Impl rule__Panorama__Group__10 ;
    public final void rule__Panorama__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:894:1: ( rule__Panorama__Group__9__Impl rule__Panorama__Group__10 )
            // InternalDsl.g:895:2: rule__Panorama__Group__9__Impl rule__Panorama__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Panorama__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__9"


    // $ANTLR start "rule__Panorama__Group__9__Impl"
    // InternalDsl.g:902:1: rule__Panorama__Group__9__Impl : ( RULE_PATHS ) ;
    public final void rule__Panorama__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:906:1: ( ( RULE_PATHS ) )
            // InternalDsl.g:907:1: ( RULE_PATHS )
            {
            // InternalDsl.g:907:1: ( RULE_PATHS )
            // InternalDsl.g:908:2: RULE_PATHS
            {
             before(grammarAccess.getPanoramaAccess().getPATHSTerminalRuleCall_9()); 
            match(input,RULE_PATHS,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getPATHSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__9__Impl"


    // $ANTLR start "rule__Panorama__Group__10"
    // InternalDsl.g:917:1: rule__Panorama__Group__10 : rule__Panorama__Group__10__Impl rule__Panorama__Group__11 ;
    public final void rule__Panorama__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( rule__Panorama__Group__10__Impl rule__Panorama__Group__11 )
            // InternalDsl.g:922:2: rule__Panorama__Group__10__Impl rule__Panorama__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Panorama__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__10"


    // $ANTLR start "rule__Panorama__Group__10__Impl"
    // InternalDsl.g:929:1: rule__Panorama__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:933:1: ( ( RULE_COLON ) )
            // InternalDsl.g:934:1: ( RULE_COLON )
            {
            // InternalDsl.g:934:1: ( RULE_COLON )
            // InternalDsl.g:935:2: RULE_COLON
            {
             before(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_10()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOLONTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__10__Impl"


    // $ANTLR start "rule__Panorama__Group__11"
    // InternalDsl.g:944:1: rule__Panorama__Group__11 : rule__Panorama__Group__11__Impl rule__Panorama__Group__12 ;
    public final void rule__Panorama__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:948:1: ( rule__Panorama__Group__11__Impl rule__Panorama__Group__12 )
            // InternalDsl.g:949:2: rule__Panorama__Group__11__Impl rule__Panorama__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Panorama__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__11"


    // $ANTLR start "rule__Panorama__Group__11__Impl"
    // InternalDsl.g:956:1: rule__Panorama__Group__11__Impl : ( RULE_OPENING_SQUARE_BRACKET ) ;
    public final void rule__Panorama__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:960:1: ( ( RULE_OPENING_SQUARE_BRACKET ) )
            // InternalDsl.g:961:1: ( RULE_OPENING_SQUARE_BRACKET )
            {
            // InternalDsl.g:961:1: ( RULE_OPENING_SQUARE_BRACKET )
            // InternalDsl.g:962:2: RULE_OPENING_SQUARE_BRACKET
            {
             before(grammarAccess.getPanoramaAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_11()); 
            match(input,RULE_OPENING_SQUARE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getOPENING_SQUARE_BRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__11__Impl"


    // $ANTLR start "rule__Panorama__Group__12"
    // InternalDsl.g:971:1: rule__Panorama__Group__12 : rule__Panorama__Group__12__Impl rule__Panorama__Group__13 ;
    public final void rule__Panorama__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:975:1: ( rule__Panorama__Group__12__Impl rule__Panorama__Group__13 )
            // InternalDsl.g:976:2: rule__Panorama__Group__12__Impl rule__Panorama__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Panorama__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__12"


    // $ANTLR start "rule__Panorama__Group__12__Impl"
    // InternalDsl.g:983:1: rule__Panorama__Group__12__Impl : ( ( rule__Panorama__HotspotsAssignment_12 ) ) ;
    public final void rule__Panorama__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:987:1: ( ( ( rule__Panorama__HotspotsAssignment_12 ) ) )
            // InternalDsl.g:988:1: ( ( rule__Panorama__HotspotsAssignment_12 ) )
            {
            // InternalDsl.g:988:1: ( ( rule__Panorama__HotspotsAssignment_12 ) )
            // InternalDsl.g:989:2: ( rule__Panorama__HotspotsAssignment_12 )
            {
             before(grammarAccess.getPanoramaAccess().getHotspotsAssignment_12()); 
            // InternalDsl.g:990:2: ( rule__Panorama__HotspotsAssignment_12 )
            // InternalDsl.g:990:3: rule__Panorama__HotspotsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__HotspotsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getHotspotsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__12__Impl"


    // $ANTLR start "rule__Panorama__Group__13"
    // InternalDsl.g:998:1: rule__Panorama__Group__13 : rule__Panorama__Group__13__Impl rule__Panorama__Group__14 ;
    public final void rule__Panorama__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1002:1: ( rule__Panorama__Group__13__Impl rule__Panorama__Group__14 )
            // InternalDsl.g:1003:2: rule__Panorama__Group__13__Impl rule__Panorama__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Panorama__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__13"


    // $ANTLR start "rule__Panorama__Group__13__Impl"
    // InternalDsl.g:1010:1: rule__Panorama__Group__13__Impl : ( ( rule__Panorama__Group_13__0 )* ) ;
    public final void rule__Panorama__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1014:1: ( ( ( rule__Panorama__Group_13__0 )* ) )
            // InternalDsl.g:1015:1: ( ( rule__Panorama__Group_13__0 )* )
            {
            // InternalDsl.g:1015:1: ( ( rule__Panorama__Group_13__0 )* )
            // InternalDsl.g:1016:2: ( rule__Panorama__Group_13__0 )*
            {
             before(grammarAccess.getPanoramaAccess().getGroup_13()); 
            // InternalDsl.g:1017:2: ( rule__Panorama__Group_13__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:1017:3: rule__Panorama__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Panorama__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPanoramaAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__13__Impl"


    // $ANTLR start "rule__Panorama__Group__14"
    // InternalDsl.g:1025:1: rule__Panorama__Group__14 : rule__Panorama__Group__14__Impl rule__Panorama__Group__15 ;
    public final void rule__Panorama__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1029:1: ( rule__Panorama__Group__14__Impl rule__Panorama__Group__15 )
            // InternalDsl.g:1030:2: rule__Panorama__Group__14__Impl rule__Panorama__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Panorama__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__14"


    // $ANTLR start "rule__Panorama__Group__14__Impl"
    // InternalDsl.g:1037:1: rule__Panorama__Group__14__Impl : ( RULE_CLOSING_SQUARE_BRACKET ) ;
    public final void rule__Panorama__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1041:1: ( ( RULE_CLOSING_SQUARE_BRACKET ) )
            // InternalDsl.g:1042:1: ( RULE_CLOSING_SQUARE_BRACKET )
            {
            // InternalDsl.g:1042:1: ( RULE_CLOSING_SQUARE_BRACKET )
            // InternalDsl.g:1043:2: RULE_CLOSING_SQUARE_BRACKET
            {
             before(grammarAccess.getPanoramaAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_14()); 
            match(input,RULE_CLOSING_SQUARE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCLOSING_SQUARE_BRACKETTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__14__Impl"


    // $ANTLR start "rule__Panorama__Group__15"
    // InternalDsl.g:1052:1: rule__Panorama__Group__15 : rule__Panorama__Group__15__Impl ;
    public final void rule__Panorama__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1056:1: ( rule__Panorama__Group__15__Impl )
            // InternalDsl.g:1057:2: rule__Panorama__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__15"


    // $ANTLR start "rule__Panorama__Group__15__Impl"
    // InternalDsl.g:1063:1: rule__Panorama__Group__15__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Panorama__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1067:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:1068:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:1068:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:1069:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getPanoramaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_15()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__15__Impl"


    // $ANTLR start "rule__Panorama__Group_13__0"
    // InternalDsl.g:1079:1: rule__Panorama__Group_13__0 : rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1 ;
    public final void rule__Panorama__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1 )
            // InternalDsl.g:1084:2: rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1
            {
            pushFollow(FOLLOW_9);
            rule__Panorama__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group_13__0"


    // $ANTLR start "rule__Panorama__Group_13__0__Impl"
    // InternalDsl.g:1091:1: rule__Panorama__Group_13__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1095:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1096:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1096:1: ( RULE_COMMA )
            // InternalDsl.g:1097:2: RULE_COMMA
            {
             before(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_13_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOMMATerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group_13__0__Impl"


    // $ANTLR start "rule__Panorama__Group_13__1"
    // InternalDsl.g:1106:1: rule__Panorama__Group_13__1 : rule__Panorama__Group_13__1__Impl ;
    public final void rule__Panorama__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1110:1: ( rule__Panorama__Group_13__1__Impl )
            // InternalDsl.g:1111:2: rule__Panorama__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group_13__1"


    // $ANTLR start "rule__Panorama__Group_13__1__Impl"
    // InternalDsl.g:1117:1: rule__Panorama__Group_13__1__Impl : ( ( rule__Panorama__HotspotsAssignment_13_1 ) ) ;
    public final void rule__Panorama__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1121:1: ( ( ( rule__Panorama__HotspotsAssignment_13_1 ) ) )
            // InternalDsl.g:1122:1: ( ( rule__Panorama__HotspotsAssignment_13_1 ) )
            {
            // InternalDsl.g:1122:1: ( ( rule__Panorama__HotspotsAssignment_13_1 ) )
            // InternalDsl.g:1123:2: ( rule__Panorama__HotspotsAssignment_13_1 )
            {
             before(grammarAccess.getPanoramaAccess().getHotspotsAssignment_13_1()); 
            // InternalDsl.g:1124:2: ( rule__Panorama__HotspotsAssignment_13_1 )
            // InternalDsl.g:1124:3: rule__Panorama__HotspotsAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__HotspotsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getHotspotsAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group_13__1__Impl"


    // $ANTLR start "rule__Hotspot__Group__0"
    // InternalDsl.g:1133:1: rule__Hotspot__Group__0 : rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 ;
    public final void rule__Hotspot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1137:1: ( rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 )
            // InternalDsl.g:1138:2: rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hotspot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__0"


    // $ANTLR start "rule__Hotspot__Group__0__Impl"
    // InternalDsl.g:1145:1: rule__Hotspot__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Hotspot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1149:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalDsl.g:1150:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalDsl.g:1150:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalDsl.g:1151:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getHotspotAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__0__Impl"


    // $ANTLR start "rule__Hotspot__Group__1"
    // InternalDsl.g:1160:1: rule__Hotspot__Group__1 : rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 ;
    public final void rule__Hotspot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1164:1: ( rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 )
            // InternalDsl.g:1165:2: rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__1"


    // $ANTLR start "rule__Hotspot__Group__1__Impl"
    // InternalDsl.g:1172:1: rule__Hotspot__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Hotspot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1176:1: ( ( RULE_NAME ) )
            // InternalDsl.g:1177:1: ( RULE_NAME )
            {
            // InternalDsl.g:1177:1: ( RULE_NAME )
            // InternalDsl.g:1178:2: RULE_NAME
            {
             before(grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__1__Impl"


    // $ANTLR start "rule__Hotspot__Group__2"
    // InternalDsl.g:1187:1: rule__Hotspot__Group__2 : rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 ;
    public final void rule__Hotspot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:1: ( rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 )
            // InternalDsl.g:1192:2: rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Hotspot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__2"


    // $ANTLR start "rule__Hotspot__Group__2__Impl"
    // InternalDsl.g:1199:1: rule__Hotspot__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1203:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1204:1: ( RULE_COLON )
            {
            // InternalDsl.g:1204:1: ( RULE_COLON )
            // InternalDsl.g:1205:2: RULE_COLON
            {
             before(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__2__Impl"


    // $ANTLR start "rule__Hotspot__Group__3"
    // InternalDsl.g:1214:1: rule__Hotspot__Group__3 : rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 ;
    public final void rule__Hotspot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1218:1: ( rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 )
            // InternalDsl.g:1219:2: rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Hotspot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__3"


    // $ANTLR start "rule__Hotspot__Group__3__Impl"
    // InternalDsl.g:1226:1: rule__Hotspot__Group__3__Impl : ( ( rule__Hotspot__NameAssignment_3 ) ) ;
    public final void rule__Hotspot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1230:1: ( ( ( rule__Hotspot__NameAssignment_3 ) ) )
            // InternalDsl.g:1231:1: ( ( rule__Hotspot__NameAssignment_3 ) )
            {
            // InternalDsl.g:1231:1: ( ( rule__Hotspot__NameAssignment_3 ) )
            // InternalDsl.g:1232:2: ( rule__Hotspot__NameAssignment_3 )
            {
             before(grammarAccess.getHotspotAccess().getNameAssignment_3()); 
            // InternalDsl.g:1233:2: ( rule__Hotspot__NameAssignment_3 )
            // InternalDsl.g:1233:3: rule__Hotspot__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__3__Impl"


    // $ANTLR start "rule__Hotspot__Group__4"
    // InternalDsl.g:1241:1: rule__Hotspot__Group__4 : rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 ;
    public final void rule__Hotspot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1245:1: ( rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 )
            // InternalDsl.g:1246:2: rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Hotspot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__4"


    // $ANTLR start "rule__Hotspot__Group__4__Impl"
    // InternalDsl.g:1253:1: rule__Hotspot__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1257:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1258:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1258:1: ( RULE_COMMA )
            // InternalDsl.g:1259:2: RULE_COMMA
            {
             before(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__4__Impl"


    // $ANTLR start "rule__Hotspot__Group__5"
    // InternalDsl.g:1268:1: rule__Hotspot__Group__5 : rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 ;
    public final void rule__Hotspot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1272:1: ( rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 )
            // InternalDsl.g:1273:2: rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__5"


    // $ANTLR start "rule__Hotspot__Group__5__Impl"
    // InternalDsl.g:1280:1: rule__Hotspot__Group__5__Impl : ( RULE_TO ) ;
    public final void rule__Hotspot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1284:1: ( ( RULE_TO ) )
            // InternalDsl.g:1285:1: ( RULE_TO )
            {
            // InternalDsl.g:1285:1: ( RULE_TO )
            // InternalDsl.g:1286:2: RULE_TO
            {
             before(grammarAccess.getHotspotAccess().getTOTerminalRuleCall_5()); 
            match(input,RULE_TO,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getTOTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__5__Impl"


    // $ANTLR start "rule__Hotspot__Group__6"
    // InternalDsl.g:1295:1: rule__Hotspot__Group__6 : rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 ;
    public final void rule__Hotspot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1299:1: ( rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 )
            // InternalDsl.g:1300:2: rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Hotspot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__6"


    // $ANTLR start "rule__Hotspot__Group__6__Impl"
    // InternalDsl.g:1307:1: rule__Hotspot__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1311:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1312:1: ( RULE_COLON )
            {
            // InternalDsl.g:1312:1: ( RULE_COLON )
            // InternalDsl.g:1313:2: RULE_COLON
            {
             before(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__6__Impl"


    // $ANTLR start "rule__Hotspot__Group__7"
    // InternalDsl.g:1322:1: rule__Hotspot__Group__7 : rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 ;
    public final void rule__Hotspot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1326:1: ( rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 )
            // InternalDsl.g:1327:2: rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Hotspot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__7"


    // $ANTLR start "rule__Hotspot__Group__7__Impl"
    // InternalDsl.g:1334:1: rule__Hotspot__Group__7__Impl : ( ( rule__Hotspot__ToAssignment_7 ) ) ;
    public final void rule__Hotspot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( ( ( rule__Hotspot__ToAssignment_7 ) ) )
            // InternalDsl.g:1339:1: ( ( rule__Hotspot__ToAssignment_7 ) )
            {
            // InternalDsl.g:1339:1: ( ( rule__Hotspot__ToAssignment_7 ) )
            // InternalDsl.g:1340:2: ( rule__Hotspot__ToAssignment_7 )
            {
             before(grammarAccess.getHotspotAccess().getToAssignment_7()); 
            // InternalDsl.g:1341:2: ( rule__Hotspot__ToAssignment_7 )
            // InternalDsl.g:1341:3: rule__Hotspot__ToAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__7__Impl"


    // $ANTLR start "rule__Hotspot__Group__8"
    // InternalDsl.g:1349:1: rule__Hotspot__Group__8 : rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 ;
    public final void rule__Hotspot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 )
            // InternalDsl.g:1354:2: rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Hotspot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__8"


    // $ANTLR start "rule__Hotspot__Group__8__Impl"
    // InternalDsl.g:1361:1: rule__Hotspot__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1365:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1366:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1366:1: ( RULE_COMMA )
            // InternalDsl.g:1367:2: RULE_COMMA
            {
             before(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_8()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__8__Impl"


    // $ANTLR start "rule__Hotspot__Group__9"
    // InternalDsl.g:1376:1: rule__Hotspot__Group__9 : rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 ;
    public final void rule__Hotspot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1380:1: ( rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 )
            // InternalDsl.g:1381:2: rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__9"


    // $ANTLR start "rule__Hotspot__Group__9__Impl"
    // InternalDsl.g:1388:1: rule__Hotspot__Group__9__Impl : ( 'position' ) ;
    public final void rule__Hotspot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1392:1: ( ( 'position' ) )
            // InternalDsl.g:1393:1: ( 'position' )
            {
            // InternalDsl.g:1393:1: ( 'position' )
            // InternalDsl.g:1394:2: 'position'
            {
             before(grammarAccess.getHotspotAccess().getPositionKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getPositionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__9__Impl"


    // $ANTLR start "rule__Hotspot__Group__10"
    // InternalDsl.g:1403:1: rule__Hotspot__Group__10 : rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 ;
    public final void rule__Hotspot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 )
            // InternalDsl.g:1408:2: rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Hotspot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__10"


    // $ANTLR start "rule__Hotspot__Group__10__Impl"
    // InternalDsl.g:1415:1: rule__Hotspot__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1420:1: ( RULE_COLON )
            {
            // InternalDsl.g:1420:1: ( RULE_COLON )
            // InternalDsl.g:1421:2: RULE_COLON
            {
             before(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_10()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__10__Impl"


    // $ANTLR start "rule__Hotspot__Group__11"
    // InternalDsl.g:1430:1: rule__Hotspot__Group__11 : rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 ;
    public final void rule__Hotspot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 )
            // InternalDsl.g:1435:2: rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Hotspot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__11"


    // $ANTLR start "rule__Hotspot__Group__11__Impl"
    // InternalDsl.g:1442:1: rule__Hotspot__Group__11__Impl : ( ( rule__Hotspot__PositionAssignment_11 ) ) ;
    public final void rule__Hotspot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1446:1: ( ( ( rule__Hotspot__PositionAssignment_11 ) ) )
            // InternalDsl.g:1447:1: ( ( rule__Hotspot__PositionAssignment_11 ) )
            {
            // InternalDsl.g:1447:1: ( ( rule__Hotspot__PositionAssignment_11 ) )
            // InternalDsl.g:1448:2: ( rule__Hotspot__PositionAssignment_11 )
            {
             before(grammarAccess.getHotspotAccess().getPositionAssignment_11()); 
            // InternalDsl.g:1449:2: ( rule__Hotspot__PositionAssignment_11 )
            // InternalDsl.g:1449:3: rule__Hotspot__PositionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__PositionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getPositionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__11__Impl"


    // $ANTLR start "rule__Hotspot__Group__12"
    // InternalDsl.g:1457:1: rule__Hotspot__Group__12 : rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 ;
    public final void rule__Hotspot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1461:1: ( rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 )
            // InternalDsl.g:1462:2: rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Hotspot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__12"


    // $ANTLR start "rule__Hotspot__Group__12__Impl"
    // InternalDsl.g:1469:1: rule__Hotspot__Group__12__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1474:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1474:1: ( RULE_COMMA )
            // InternalDsl.g:1475:2: RULE_COMMA
            {
             before(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_12()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__12__Impl"


    // $ANTLR start "rule__Hotspot__Group__13"
    // InternalDsl.g:1484:1: rule__Hotspot__Group__13 : rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 ;
    public final void rule__Hotspot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 )
            // InternalDsl.g:1489:2: rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__13"


    // $ANTLR start "rule__Hotspot__Group__13__Impl"
    // InternalDsl.g:1496:1: rule__Hotspot__Group__13__Impl : ( 'rotation' ) ;
    public final void rule__Hotspot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1500:1: ( ( 'rotation' ) )
            // InternalDsl.g:1501:1: ( 'rotation' )
            {
            // InternalDsl.g:1501:1: ( 'rotation' )
            // InternalDsl.g:1502:2: 'rotation'
            {
             before(grammarAccess.getHotspotAccess().getRotationKeyword_13()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getRotationKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__13__Impl"


    // $ANTLR start "rule__Hotspot__Group__14"
    // InternalDsl.g:1511:1: rule__Hotspot__Group__14 : rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15 ;
    public final void rule__Hotspot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1515:1: ( rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15 )
            // InternalDsl.g:1516:2: rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__Hotspot__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__14"


    // $ANTLR start "rule__Hotspot__Group__14__Impl"
    // InternalDsl.g:1523:1: rule__Hotspot__Group__14__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1527:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1528:1: ( RULE_COLON )
            {
            // InternalDsl.g:1528:1: ( RULE_COLON )
            // InternalDsl.g:1529:2: RULE_COLON
            {
             before(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_14()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__14__Impl"


    // $ANTLR start "rule__Hotspot__Group__15"
    // InternalDsl.g:1538:1: rule__Hotspot__Group__15 : rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16 ;
    public final void rule__Hotspot__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16 )
            // InternalDsl.g:1543:2: rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__Hotspot__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__15"


    // $ANTLR start "rule__Hotspot__Group__15__Impl"
    // InternalDsl.g:1550:1: rule__Hotspot__Group__15__Impl : ( ( rule__Hotspot__RotationAssignment_15 ) ) ;
    public final void rule__Hotspot__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1554:1: ( ( ( rule__Hotspot__RotationAssignment_15 ) ) )
            // InternalDsl.g:1555:1: ( ( rule__Hotspot__RotationAssignment_15 ) )
            {
            // InternalDsl.g:1555:1: ( ( rule__Hotspot__RotationAssignment_15 ) )
            // InternalDsl.g:1556:2: ( rule__Hotspot__RotationAssignment_15 )
            {
             before(grammarAccess.getHotspotAccess().getRotationAssignment_15()); 
            // InternalDsl.g:1557:2: ( rule__Hotspot__RotationAssignment_15 )
            // InternalDsl.g:1557:3: rule__Hotspot__RotationAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__RotationAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getRotationAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__15__Impl"


    // $ANTLR start "rule__Hotspot__Group__16"
    // InternalDsl.g:1565:1: rule__Hotspot__Group__16 : rule__Hotspot__Group__16__Impl ;
    public final void rule__Hotspot__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1569:1: ( rule__Hotspot__Group__16__Impl )
            // InternalDsl.g:1570:2: rule__Hotspot__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__16"


    // $ANTLR start "rule__Hotspot__Group__16__Impl"
    // InternalDsl.g:1576:1: rule__Hotspot__Group__16__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Hotspot__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1580:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:1581:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:1581:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:1582:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_16()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__16__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalDsl.g:1592:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalDsl.g:1597:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalDsl.g:1604:1: rule__Position__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1608:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalDsl.g:1609:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalDsl.g:1609:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalDsl.g:1610:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getPositionAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalDsl.g:1619:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1623:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalDsl.g:1624:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalDsl.g:1631:1: rule__Position__Group__1__Impl : ( RULE_COORDINATE_X ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1635:1: ( ( RULE_COORDINATE_X ) )
            // InternalDsl.g:1636:1: ( RULE_COORDINATE_X )
            {
            // InternalDsl.g:1636:1: ( RULE_COORDINATE_X )
            // InternalDsl.g:1637:2: RULE_COORDINATE_X
            {
             before(grammarAccess.getPositionAccess().getCOORDINATE_XTerminalRuleCall_1()); 
            match(input,RULE_COORDINATE_X,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOORDINATE_XTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalDsl.g:1646:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalDsl.g:1651:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalDsl.g:1658:1: rule__Position__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1662:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1663:1: ( RULE_COLON )
            {
            // InternalDsl.g:1663:1: ( RULE_COLON )
            // InternalDsl.g:1664:2: RULE_COLON
            {
             before(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalDsl.g:1673:1: rule__Position__Group__3 : rule__Position__Group__3__Impl rule__Position__Group__4 ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1677:1: ( rule__Position__Group__3__Impl rule__Position__Group__4 )
            // InternalDsl.g:1678:2: rule__Position__Group__3__Impl rule__Position__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Position__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalDsl.g:1685:1: rule__Position__Group__3__Impl : ( ( rule__Position__PosxAssignment_3 ) ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1689:1: ( ( ( rule__Position__PosxAssignment_3 ) ) )
            // InternalDsl.g:1690:1: ( ( rule__Position__PosxAssignment_3 ) )
            {
            // InternalDsl.g:1690:1: ( ( rule__Position__PosxAssignment_3 ) )
            // InternalDsl.g:1691:2: ( rule__Position__PosxAssignment_3 )
            {
             before(grammarAccess.getPositionAccess().getPosxAssignment_3()); 
            // InternalDsl.g:1692:2: ( rule__Position__PosxAssignment_3 )
            // InternalDsl.g:1692:3: rule__Position__PosxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__PosxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPosxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__4"
    // InternalDsl.g:1700:1: rule__Position__Group__4 : rule__Position__Group__4__Impl rule__Position__Group__5 ;
    public final void rule__Position__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( rule__Position__Group__4__Impl rule__Position__Group__5 )
            // InternalDsl.g:1705:2: rule__Position__Group__4__Impl rule__Position__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Position__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4"


    // $ANTLR start "rule__Position__Group__4__Impl"
    // InternalDsl.g:1712:1: rule__Position__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Position__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1716:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1717:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1717:1: ( RULE_COMMA )
            // InternalDsl.g:1718:2: RULE_COMMA
            {
             before(grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4__Impl"


    // $ANTLR start "rule__Position__Group__5"
    // InternalDsl.g:1727:1: rule__Position__Group__5 : rule__Position__Group__5__Impl rule__Position__Group__6 ;
    public final void rule__Position__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1731:1: ( rule__Position__Group__5__Impl rule__Position__Group__6 )
            // InternalDsl.g:1732:2: rule__Position__Group__5__Impl rule__Position__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Position__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__5"


    // $ANTLR start "rule__Position__Group__5__Impl"
    // InternalDsl.g:1739:1: rule__Position__Group__5__Impl : ( RULE_COORDINATE_Y ) ;
    public final void rule__Position__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1743:1: ( ( RULE_COORDINATE_Y ) )
            // InternalDsl.g:1744:1: ( RULE_COORDINATE_Y )
            {
            // InternalDsl.g:1744:1: ( RULE_COORDINATE_Y )
            // InternalDsl.g:1745:2: RULE_COORDINATE_Y
            {
             before(grammarAccess.getPositionAccess().getCOORDINATE_YTerminalRuleCall_5()); 
            match(input,RULE_COORDINATE_Y,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOORDINATE_YTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__5__Impl"


    // $ANTLR start "rule__Position__Group__6"
    // InternalDsl.g:1754:1: rule__Position__Group__6 : rule__Position__Group__6__Impl rule__Position__Group__7 ;
    public final void rule__Position__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( rule__Position__Group__6__Impl rule__Position__Group__7 )
            // InternalDsl.g:1759:2: rule__Position__Group__6__Impl rule__Position__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Position__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__6"


    // $ANTLR start "rule__Position__Group__6__Impl"
    // InternalDsl.g:1766:1: rule__Position__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Position__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1770:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1771:1: ( RULE_COLON )
            {
            // InternalDsl.g:1771:1: ( RULE_COLON )
            // InternalDsl.g:1772:2: RULE_COLON
            {
             before(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__6__Impl"


    // $ANTLR start "rule__Position__Group__7"
    // InternalDsl.g:1781:1: rule__Position__Group__7 : rule__Position__Group__7__Impl rule__Position__Group__8 ;
    public final void rule__Position__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1785:1: ( rule__Position__Group__7__Impl rule__Position__Group__8 )
            // InternalDsl.g:1786:2: rule__Position__Group__7__Impl rule__Position__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Position__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__7"


    // $ANTLR start "rule__Position__Group__7__Impl"
    // InternalDsl.g:1793:1: rule__Position__Group__7__Impl : ( ( rule__Position__PosyAssignment_7 ) ) ;
    public final void rule__Position__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( ( ( rule__Position__PosyAssignment_7 ) ) )
            // InternalDsl.g:1798:1: ( ( rule__Position__PosyAssignment_7 ) )
            {
            // InternalDsl.g:1798:1: ( ( rule__Position__PosyAssignment_7 ) )
            // InternalDsl.g:1799:2: ( rule__Position__PosyAssignment_7 )
            {
             before(grammarAccess.getPositionAccess().getPosyAssignment_7()); 
            // InternalDsl.g:1800:2: ( rule__Position__PosyAssignment_7 )
            // InternalDsl.g:1800:3: rule__Position__PosyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Position__PosyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPosyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__7__Impl"


    // $ANTLR start "rule__Position__Group__8"
    // InternalDsl.g:1808:1: rule__Position__Group__8 : rule__Position__Group__8__Impl rule__Position__Group__9 ;
    public final void rule__Position__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1812:1: ( rule__Position__Group__8__Impl rule__Position__Group__9 )
            // InternalDsl.g:1813:2: rule__Position__Group__8__Impl rule__Position__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Position__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__8"


    // $ANTLR start "rule__Position__Group__8__Impl"
    // InternalDsl.g:1820:1: rule__Position__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Position__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1824:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:1825:1: ( RULE_COMMA )
            {
            // InternalDsl.g:1825:1: ( RULE_COMMA )
            // InternalDsl.g:1826:2: RULE_COMMA
            {
             before(grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_8()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOMMATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__8__Impl"


    // $ANTLR start "rule__Position__Group__9"
    // InternalDsl.g:1835:1: rule__Position__Group__9 : rule__Position__Group__9__Impl rule__Position__Group__10 ;
    public final void rule__Position__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1839:1: ( rule__Position__Group__9__Impl rule__Position__Group__10 )
            // InternalDsl.g:1840:2: rule__Position__Group__9__Impl rule__Position__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Position__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__9"


    // $ANTLR start "rule__Position__Group__9__Impl"
    // InternalDsl.g:1847:1: rule__Position__Group__9__Impl : ( RULE_COORDINATE_Z ) ;
    public final void rule__Position__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1851:1: ( ( RULE_COORDINATE_Z ) )
            // InternalDsl.g:1852:1: ( RULE_COORDINATE_Z )
            {
            // InternalDsl.g:1852:1: ( RULE_COORDINATE_Z )
            // InternalDsl.g:1853:2: RULE_COORDINATE_Z
            {
             before(grammarAccess.getPositionAccess().getCOORDINATE_ZTerminalRuleCall_9()); 
            match(input,RULE_COORDINATE_Z,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOORDINATE_ZTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__9__Impl"


    // $ANTLR start "rule__Position__Group__10"
    // InternalDsl.g:1862:1: rule__Position__Group__10 : rule__Position__Group__10__Impl rule__Position__Group__11 ;
    public final void rule__Position__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1866:1: ( rule__Position__Group__10__Impl rule__Position__Group__11 )
            // InternalDsl.g:1867:2: rule__Position__Group__10__Impl rule__Position__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Position__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__10"


    // $ANTLR start "rule__Position__Group__10__Impl"
    // InternalDsl.g:1874:1: rule__Position__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Position__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1878:1: ( ( RULE_COLON ) )
            // InternalDsl.g:1879:1: ( RULE_COLON )
            {
            // InternalDsl.g:1879:1: ( RULE_COLON )
            // InternalDsl.g:1880:2: RULE_COLON
            {
             before(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_10()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOLONTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__10__Impl"


    // $ANTLR start "rule__Position__Group__11"
    // InternalDsl.g:1889:1: rule__Position__Group__11 : rule__Position__Group__11__Impl rule__Position__Group__12 ;
    public final void rule__Position__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1893:1: ( rule__Position__Group__11__Impl rule__Position__Group__12 )
            // InternalDsl.g:1894:2: rule__Position__Group__11__Impl rule__Position__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Position__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__11"


    // $ANTLR start "rule__Position__Group__11__Impl"
    // InternalDsl.g:1901:1: rule__Position__Group__11__Impl : ( ( rule__Position__PoszAssignment_11 ) ) ;
    public final void rule__Position__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1905:1: ( ( ( rule__Position__PoszAssignment_11 ) ) )
            // InternalDsl.g:1906:1: ( ( rule__Position__PoszAssignment_11 ) )
            {
            // InternalDsl.g:1906:1: ( ( rule__Position__PoszAssignment_11 ) )
            // InternalDsl.g:1907:2: ( rule__Position__PoszAssignment_11 )
            {
             before(grammarAccess.getPositionAccess().getPoszAssignment_11()); 
            // InternalDsl.g:1908:2: ( rule__Position__PoszAssignment_11 )
            // InternalDsl.g:1908:3: rule__Position__PoszAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Position__PoszAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPoszAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__11__Impl"


    // $ANTLR start "rule__Position__Group__12"
    // InternalDsl.g:1916:1: rule__Position__Group__12 : rule__Position__Group__12__Impl ;
    public final void rule__Position__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1920:1: ( rule__Position__Group__12__Impl )
            // InternalDsl.g:1921:2: rule__Position__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__12"


    // $ANTLR start "rule__Position__Group__12__Impl"
    // InternalDsl.g:1927:1: rule__Position__Group__12__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Position__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1931:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:1932:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:1932:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:1933:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getPositionAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__12__Impl"


    // $ANTLR start "rule__Rotation__Group__0"
    // InternalDsl.g:1943:1: rule__Rotation__Group__0 : rule__Rotation__Group__0__Impl rule__Rotation__Group__1 ;
    public final void rule__Rotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1947:1: ( rule__Rotation__Group__0__Impl rule__Rotation__Group__1 )
            // InternalDsl.g:1948:2: rule__Rotation__Group__0__Impl rule__Rotation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Rotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0"


    // $ANTLR start "rule__Rotation__Group__0__Impl"
    // InternalDsl.g:1955:1: rule__Rotation__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Rotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalDsl.g:1960:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalDsl.g:1960:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalDsl.g:1961:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getRotationAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0__Impl"


    // $ANTLR start "rule__Rotation__Group__1"
    // InternalDsl.g:1970:1: rule__Rotation__Group__1 : rule__Rotation__Group__1__Impl rule__Rotation__Group__2 ;
    public final void rule__Rotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1974:1: ( rule__Rotation__Group__1__Impl rule__Rotation__Group__2 )
            // InternalDsl.g:1975:2: rule__Rotation__Group__1__Impl rule__Rotation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1"


    // $ANTLR start "rule__Rotation__Group__1__Impl"
    // InternalDsl.g:1982:1: rule__Rotation__Group__1__Impl : ( RULE_COORDINATE_X ) ;
    public final void rule__Rotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1986:1: ( ( RULE_COORDINATE_X ) )
            // InternalDsl.g:1987:1: ( RULE_COORDINATE_X )
            {
            // InternalDsl.g:1987:1: ( RULE_COORDINATE_X )
            // InternalDsl.g:1988:2: RULE_COORDINATE_X
            {
             before(grammarAccess.getRotationAccess().getCOORDINATE_XTerminalRuleCall_1()); 
            match(input,RULE_COORDINATE_X,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOORDINATE_XTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1__Impl"


    // $ANTLR start "rule__Rotation__Group__2"
    // InternalDsl.g:1997:1: rule__Rotation__Group__2 : rule__Rotation__Group__2__Impl rule__Rotation__Group__3 ;
    public final void rule__Rotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2001:1: ( rule__Rotation__Group__2__Impl rule__Rotation__Group__3 )
            // InternalDsl.g:2002:2: rule__Rotation__Group__2__Impl rule__Rotation__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Rotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2"


    // $ANTLR start "rule__Rotation__Group__2__Impl"
    // InternalDsl.g:2009:1: rule__Rotation__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Rotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2013:1: ( ( RULE_COLON ) )
            // InternalDsl.g:2014:1: ( RULE_COLON )
            {
            // InternalDsl.g:2014:1: ( RULE_COLON )
            // InternalDsl.g:2015:2: RULE_COLON
            {
             before(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2__Impl"


    // $ANTLR start "rule__Rotation__Group__3"
    // InternalDsl.g:2024:1: rule__Rotation__Group__3 : rule__Rotation__Group__3__Impl rule__Rotation__Group__4 ;
    public final void rule__Rotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( rule__Rotation__Group__3__Impl rule__Rotation__Group__4 )
            // InternalDsl.g:2029:2: rule__Rotation__Group__3__Impl rule__Rotation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Rotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3"


    // $ANTLR start "rule__Rotation__Group__3__Impl"
    // InternalDsl.g:2036:1: rule__Rotation__Group__3__Impl : ( ( rule__Rotation__PosxAssignment_3 ) ) ;
    public final void rule__Rotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2040:1: ( ( ( rule__Rotation__PosxAssignment_3 ) ) )
            // InternalDsl.g:2041:1: ( ( rule__Rotation__PosxAssignment_3 ) )
            {
            // InternalDsl.g:2041:1: ( ( rule__Rotation__PosxAssignment_3 ) )
            // InternalDsl.g:2042:2: ( rule__Rotation__PosxAssignment_3 )
            {
             before(grammarAccess.getRotationAccess().getPosxAssignment_3()); 
            // InternalDsl.g:2043:2: ( rule__Rotation__PosxAssignment_3 )
            // InternalDsl.g:2043:3: rule__Rotation__PosxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__PosxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getPosxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3__Impl"


    // $ANTLR start "rule__Rotation__Group__4"
    // InternalDsl.g:2051:1: rule__Rotation__Group__4 : rule__Rotation__Group__4__Impl rule__Rotation__Group__5 ;
    public final void rule__Rotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2055:1: ( rule__Rotation__Group__4__Impl rule__Rotation__Group__5 )
            // InternalDsl.g:2056:2: rule__Rotation__Group__4__Impl rule__Rotation__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Rotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4"


    // $ANTLR start "rule__Rotation__Group__4__Impl"
    // InternalDsl.g:2063:1: rule__Rotation__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Rotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2067:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:2068:1: ( RULE_COMMA )
            {
            // InternalDsl.g:2068:1: ( RULE_COMMA )
            // InternalDsl.g:2069:2: RULE_COMMA
            {
             before(grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4__Impl"


    // $ANTLR start "rule__Rotation__Group__5"
    // InternalDsl.g:2078:1: rule__Rotation__Group__5 : rule__Rotation__Group__5__Impl rule__Rotation__Group__6 ;
    public final void rule__Rotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2082:1: ( rule__Rotation__Group__5__Impl rule__Rotation__Group__6 )
            // InternalDsl.g:2083:2: rule__Rotation__Group__5__Impl rule__Rotation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Rotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5"


    // $ANTLR start "rule__Rotation__Group__5__Impl"
    // InternalDsl.g:2090:1: rule__Rotation__Group__5__Impl : ( RULE_COORDINATE_Y ) ;
    public final void rule__Rotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2094:1: ( ( RULE_COORDINATE_Y ) )
            // InternalDsl.g:2095:1: ( RULE_COORDINATE_Y )
            {
            // InternalDsl.g:2095:1: ( RULE_COORDINATE_Y )
            // InternalDsl.g:2096:2: RULE_COORDINATE_Y
            {
             before(grammarAccess.getRotationAccess().getCOORDINATE_YTerminalRuleCall_5()); 
            match(input,RULE_COORDINATE_Y,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOORDINATE_YTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5__Impl"


    // $ANTLR start "rule__Rotation__Group__6"
    // InternalDsl.g:2105:1: rule__Rotation__Group__6 : rule__Rotation__Group__6__Impl rule__Rotation__Group__7 ;
    public final void rule__Rotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2109:1: ( rule__Rotation__Group__6__Impl rule__Rotation__Group__7 )
            // InternalDsl.g:2110:2: rule__Rotation__Group__6__Impl rule__Rotation__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Rotation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__6"


    // $ANTLR start "rule__Rotation__Group__6__Impl"
    // InternalDsl.g:2117:1: rule__Rotation__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Rotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2121:1: ( ( RULE_COLON ) )
            // InternalDsl.g:2122:1: ( RULE_COLON )
            {
            // InternalDsl.g:2122:1: ( RULE_COLON )
            // InternalDsl.g:2123:2: RULE_COLON
            {
             before(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_6()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__6__Impl"


    // $ANTLR start "rule__Rotation__Group__7"
    // InternalDsl.g:2132:1: rule__Rotation__Group__7 : rule__Rotation__Group__7__Impl rule__Rotation__Group__8 ;
    public final void rule__Rotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2136:1: ( rule__Rotation__Group__7__Impl rule__Rotation__Group__8 )
            // InternalDsl.g:2137:2: rule__Rotation__Group__7__Impl rule__Rotation__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Rotation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__7"


    // $ANTLR start "rule__Rotation__Group__7__Impl"
    // InternalDsl.g:2144:1: rule__Rotation__Group__7__Impl : ( ( rule__Rotation__PosyAssignment_7 ) ) ;
    public final void rule__Rotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2148:1: ( ( ( rule__Rotation__PosyAssignment_7 ) ) )
            // InternalDsl.g:2149:1: ( ( rule__Rotation__PosyAssignment_7 ) )
            {
            // InternalDsl.g:2149:1: ( ( rule__Rotation__PosyAssignment_7 ) )
            // InternalDsl.g:2150:2: ( rule__Rotation__PosyAssignment_7 )
            {
             before(grammarAccess.getRotationAccess().getPosyAssignment_7()); 
            // InternalDsl.g:2151:2: ( rule__Rotation__PosyAssignment_7 )
            // InternalDsl.g:2151:3: rule__Rotation__PosyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__PosyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getPosyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__7__Impl"


    // $ANTLR start "rule__Rotation__Group__8"
    // InternalDsl.g:2159:1: rule__Rotation__Group__8 : rule__Rotation__Group__8__Impl rule__Rotation__Group__9 ;
    public final void rule__Rotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2163:1: ( rule__Rotation__Group__8__Impl rule__Rotation__Group__9 )
            // InternalDsl.g:2164:2: rule__Rotation__Group__8__Impl rule__Rotation__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Rotation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__8"


    // $ANTLR start "rule__Rotation__Group__8__Impl"
    // InternalDsl.g:2171:1: rule__Rotation__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Rotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2175:1: ( ( RULE_COMMA ) )
            // InternalDsl.g:2176:1: ( RULE_COMMA )
            {
            // InternalDsl.g:2176:1: ( RULE_COMMA )
            // InternalDsl.g:2177:2: RULE_COMMA
            {
             before(grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_8()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOMMATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__8__Impl"


    // $ANTLR start "rule__Rotation__Group__9"
    // InternalDsl.g:2186:1: rule__Rotation__Group__9 : rule__Rotation__Group__9__Impl rule__Rotation__Group__10 ;
    public final void rule__Rotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2190:1: ( rule__Rotation__Group__9__Impl rule__Rotation__Group__10 )
            // InternalDsl.g:2191:2: rule__Rotation__Group__9__Impl rule__Rotation__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Rotation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__9"


    // $ANTLR start "rule__Rotation__Group__9__Impl"
    // InternalDsl.g:2198:1: rule__Rotation__Group__9__Impl : ( RULE_COORDINATE_Z ) ;
    public final void rule__Rotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2202:1: ( ( RULE_COORDINATE_Z ) )
            // InternalDsl.g:2203:1: ( RULE_COORDINATE_Z )
            {
            // InternalDsl.g:2203:1: ( RULE_COORDINATE_Z )
            // InternalDsl.g:2204:2: RULE_COORDINATE_Z
            {
             before(grammarAccess.getRotationAccess().getCOORDINATE_ZTerminalRuleCall_9()); 
            match(input,RULE_COORDINATE_Z,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOORDINATE_ZTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__9__Impl"


    // $ANTLR start "rule__Rotation__Group__10"
    // InternalDsl.g:2213:1: rule__Rotation__Group__10 : rule__Rotation__Group__10__Impl rule__Rotation__Group__11 ;
    public final void rule__Rotation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2217:1: ( rule__Rotation__Group__10__Impl rule__Rotation__Group__11 )
            // InternalDsl.g:2218:2: rule__Rotation__Group__10__Impl rule__Rotation__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Rotation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__10"


    // $ANTLR start "rule__Rotation__Group__10__Impl"
    // InternalDsl.g:2225:1: rule__Rotation__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Rotation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2229:1: ( ( RULE_COLON ) )
            // InternalDsl.g:2230:1: ( RULE_COLON )
            {
            // InternalDsl.g:2230:1: ( RULE_COLON )
            // InternalDsl.g:2231:2: RULE_COLON
            {
             before(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_10()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOLONTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__10__Impl"


    // $ANTLR start "rule__Rotation__Group__11"
    // InternalDsl.g:2240:1: rule__Rotation__Group__11 : rule__Rotation__Group__11__Impl rule__Rotation__Group__12 ;
    public final void rule__Rotation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2244:1: ( rule__Rotation__Group__11__Impl rule__Rotation__Group__12 )
            // InternalDsl.g:2245:2: rule__Rotation__Group__11__Impl rule__Rotation__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Rotation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__11"


    // $ANTLR start "rule__Rotation__Group__11__Impl"
    // InternalDsl.g:2252:1: rule__Rotation__Group__11__Impl : ( ( rule__Rotation__PoszAssignment_11 ) ) ;
    public final void rule__Rotation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2256:1: ( ( ( rule__Rotation__PoszAssignment_11 ) ) )
            // InternalDsl.g:2257:1: ( ( rule__Rotation__PoszAssignment_11 ) )
            {
            // InternalDsl.g:2257:1: ( ( rule__Rotation__PoszAssignment_11 ) )
            // InternalDsl.g:2258:2: ( rule__Rotation__PoszAssignment_11 )
            {
             before(grammarAccess.getRotationAccess().getPoszAssignment_11()); 
            // InternalDsl.g:2259:2: ( rule__Rotation__PoszAssignment_11 )
            // InternalDsl.g:2259:3: rule__Rotation__PoszAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__PoszAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getPoszAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__11__Impl"


    // $ANTLR start "rule__Rotation__Group__12"
    // InternalDsl.g:2267:1: rule__Rotation__Group__12 : rule__Rotation__Group__12__Impl ;
    public final void rule__Rotation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2271:1: ( rule__Rotation__Group__12__Impl )
            // InternalDsl.g:2272:2: rule__Rotation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__12"


    // $ANTLR start "rule__Rotation__Group__12__Impl"
    // InternalDsl.g:2278:1: rule__Rotation__Group__12__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Rotation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2282:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalDsl.g:2283:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalDsl.g:2283:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalDsl.g:2284:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getRotationAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__12__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDsl.g:2294:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2298:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDsl.g:2299:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDsl.g:2306:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2311:1: ( ( '-' )? )
            {
            // InternalDsl.g:2311:1: ( ( '-' )? )
            // InternalDsl.g:2312:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:2313:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:2313:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDsl.g:2321:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDsl.g:2326:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDsl.g:2333:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2337:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:2338:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:2338:1: ( ( RULE_INT )? )
            // InternalDsl.g:2339:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:2340:2: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:2340:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDsl.g:2348:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2352:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDsl.g:2353:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDsl.g:2360:1: rule__EDouble__Group__2__Impl : ( RULE_DOT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2364:1: ( ( RULE_DOT ) )
            // InternalDsl.g:2365:1: ( RULE_DOT )
            {
            // InternalDsl.g:2365:1: ( RULE_DOT )
            // InternalDsl.g:2366:2: RULE_DOT
            {
             before(grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_2()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getDOTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDsl.g:2375:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2379:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalDsl.g:2380:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDsl.g:2387:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2391:1: ( ( RULE_INT ) )
            // InternalDsl.g:2392:1: ( RULE_INT )
            {
            // InternalDsl.g:2392:1: ( RULE_INT )
            // InternalDsl.g:2393:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalDsl.g:2402:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2406:1: ( rule__EDouble__Group__4__Impl )
            // InternalDsl.g:2407:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalDsl.g:2413:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2417:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalDsl.g:2418:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalDsl.g:2418:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalDsl.g:2419:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalDsl.g:2420:2: ( rule__EDouble__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=27 && LA7_0<=28)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:2420:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalDsl.g:2429:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2433:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalDsl.g:2434:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalDsl.g:2441:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2445:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalDsl.g:2446:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalDsl.g:2446:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalDsl.g:2447:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalDsl.g:2448:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalDsl.g:2448:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalDsl.g:2456:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2460:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalDsl.g:2461:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalDsl.g:2468:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2472:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2473:1: ( ( '-' )? )
            {
            // InternalDsl.g:2473:1: ( ( '-' )? )
            // InternalDsl.g:2474:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:2475:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:2475:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalDsl.g:2483:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2487:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalDsl.g:2488:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalDsl.g:2494:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2498:1: ( ( RULE_INT ) )
            // InternalDsl.g:2499:1: ( RULE_INT )
            {
            // InternalDsl.g:2499:1: ( RULE_INT )
            // InternalDsl.g:2500:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Tour__NameAssignment_3"
    // InternalDsl.g:2510:1: rule__Tour__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Tour__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2514:1: ( ( ruleEString ) )
            // InternalDsl.g:2515:2: ( ruleEString )
            {
            // InternalDsl.g:2515:2: ( ruleEString )
            // InternalDsl.g:2516:3: ruleEString
            {
             before(grammarAccess.getTourAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTourAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__NameAssignment_3"


    // $ANTLR start "rule__Tour__PanoramasAssignment_8"
    // InternalDsl.g:2525:1: rule__Tour__PanoramasAssignment_8 : ( rulePanorama ) ;
    public final void rule__Tour__PanoramasAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2529:1: ( ( rulePanorama ) )
            // InternalDsl.g:2530:2: ( rulePanorama )
            {
            // InternalDsl.g:2530:2: ( rulePanorama )
            // InternalDsl.g:2531:3: rulePanorama
            {
             before(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__PanoramasAssignment_8"


    // $ANTLR start "rule__Tour__PanoramasAssignment_9_1"
    // InternalDsl.g:2540:1: rule__Tour__PanoramasAssignment_9_1 : ( rulePanorama ) ;
    public final void rule__Tour__PanoramasAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2544:1: ( ( rulePanorama ) )
            // InternalDsl.g:2545:2: ( rulePanorama )
            {
            // InternalDsl.g:2545:2: ( rulePanorama )
            // InternalDsl.g:2546:3: rulePanorama
            {
             before(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getTourAccess().getPanoramasPanoramaParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__PanoramasAssignment_9_1"


    // $ANTLR start "rule__Panorama__NameAssignment_3"
    // InternalDsl.g:2555:1: rule__Panorama__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Panorama__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2559:1: ( ( ruleEString ) )
            // InternalDsl.g:2560:2: ( ruleEString )
            {
            // InternalDsl.g:2560:2: ( ruleEString )
            // InternalDsl.g:2561:3: ruleEString
            {
             before(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__NameAssignment_3"


    // $ANTLR start "rule__Panorama__DescriptionAssignment_7"
    // InternalDsl.g:2570:1: rule__Panorama__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Panorama__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2574:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2575:2: ( RULE_STRING )
            {
            // InternalDsl.g:2575:2: ( RULE_STRING )
            // InternalDsl.g:2576:3: RULE_STRING
            {
             before(grammarAccess.getPanoramaAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__DescriptionAssignment_7"


    // $ANTLR start "rule__Panorama__HotspotsAssignment_12"
    // InternalDsl.g:2585:1: rule__Panorama__HotspotsAssignment_12 : ( ruleHotspot ) ;
    public final void rule__Panorama__HotspotsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2589:1: ( ( ruleHotspot ) )
            // InternalDsl.g:2590:2: ( ruleHotspot )
            {
            // InternalDsl.g:2590:2: ( ruleHotspot )
            // InternalDsl.g:2591:3: ruleHotspot
            {
             before(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__HotspotsAssignment_12"


    // $ANTLR start "rule__Panorama__HotspotsAssignment_13_1"
    // InternalDsl.g:2600:1: rule__Panorama__HotspotsAssignment_13_1 : ( ruleHotspot ) ;
    public final void rule__Panorama__HotspotsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2604:1: ( ( ruleHotspot ) )
            // InternalDsl.g:2605:2: ( ruleHotspot )
            {
            // InternalDsl.g:2605:2: ( ruleHotspot )
            // InternalDsl.g:2606:3: ruleHotspot
            {
             before(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getHotspotsHotspotParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__HotspotsAssignment_13_1"


    // $ANTLR start "rule__Hotspot__NameAssignment_3"
    // InternalDsl.g:2615:1: rule__Hotspot__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Hotspot__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2619:1: ( ( ruleEString ) )
            // InternalDsl.g:2620:2: ( ruleEString )
            {
            // InternalDsl.g:2620:2: ( ruleEString )
            // InternalDsl.g:2621:3: ruleEString
            {
             before(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__NameAssignment_3"


    // $ANTLR start "rule__Hotspot__ToAssignment_7"
    // InternalDsl.g:2630:1: rule__Hotspot__ToAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Hotspot__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2634:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2635:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2635:2: ( ( RULE_ID ) )
            // InternalDsl.g:2636:3: ( RULE_ID )
            {
             before(grammarAccess.getHotspotAccess().getToPanoramaCrossReference_7_0()); 
            // InternalDsl.g:2637:3: ( RULE_ID )
            // InternalDsl.g:2638:4: RULE_ID
            {
             before(grammarAccess.getHotspotAccess().getToPanoramaIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getToPanoramaIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getHotspotAccess().getToPanoramaCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__ToAssignment_7"


    // $ANTLR start "rule__Hotspot__PositionAssignment_11"
    // InternalDsl.g:2649:1: rule__Hotspot__PositionAssignment_11 : ( rulePosition ) ;
    public final void rule__Hotspot__PositionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2653:1: ( ( rulePosition ) )
            // InternalDsl.g:2654:2: ( rulePosition )
            {
            // InternalDsl.g:2654:2: ( rulePosition )
            // InternalDsl.g:2655:3: rulePosition
            {
             before(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__PositionAssignment_11"


    // $ANTLR start "rule__Hotspot__RotationAssignment_15"
    // InternalDsl.g:2664:1: rule__Hotspot__RotationAssignment_15 : ( ruleRotation ) ;
    public final void rule__Hotspot__RotationAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2668:1: ( ( ruleRotation ) )
            // InternalDsl.g:2669:2: ( ruleRotation )
            {
            // InternalDsl.g:2669:2: ( ruleRotation )
            // InternalDsl.g:2670:3: ruleRotation
            {
             before(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__RotationAssignment_15"


    // $ANTLR start "rule__Position__PosxAssignment_3"
    // InternalDsl.g:2679:1: rule__Position__PosxAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Position__PosxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2683:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2684:2: ( ruleEDouble )
            {
            // InternalDsl.g:2684:2: ( ruleEDouble )
            // InternalDsl.g:2685:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getPosxEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPosxEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PosxAssignment_3"


    // $ANTLR start "rule__Position__PosyAssignment_7"
    // InternalDsl.g:2694:1: rule__Position__PosyAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Position__PosyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2698:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2699:2: ( ruleEDouble )
            {
            // InternalDsl.g:2699:2: ( ruleEDouble )
            // InternalDsl.g:2700:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getPosyEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPosyEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PosyAssignment_7"


    // $ANTLR start "rule__Position__PoszAssignment_11"
    // InternalDsl.g:2709:1: rule__Position__PoszAssignment_11 : ( ruleEDouble ) ;
    public final void rule__Position__PoszAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2713:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2714:2: ( ruleEDouble )
            {
            // InternalDsl.g:2714:2: ( ruleEDouble )
            // InternalDsl.g:2715:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getPoszEDoubleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPoszEDoubleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PoszAssignment_11"


    // $ANTLR start "rule__Rotation__PosxAssignment_3"
    // InternalDsl.g:2724:1: rule__Rotation__PosxAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Rotation__PosxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2728:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2729:2: ( ruleEDouble )
            {
            // InternalDsl.g:2729:2: ( ruleEDouble )
            // InternalDsl.g:2730:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getPosxEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getPosxEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__PosxAssignment_3"


    // $ANTLR start "rule__Rotation__PosyAssignment_7"
    // InternalDsl.g:2739:1: rule__Rotation__PosyAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Rotation__PosyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2743:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2744:2: ( ruleEDouble )
            {
            // InternalDsl.g:2744:2: ( ruleEDouble )
            // InternalDsl.g:2745:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getPosyEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getPosyEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__PosyAssignment_7"


    // $ANTLR start "rule__Rotation__PoszAssignment_11"
    // InternalDsl.g:2754:1: rule__Rotation__PoszAssignment_11 : ( ruleEDouble ) ;
    public final void rule__Rotation__PoszAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2758:1: ( ( ruleEDouble ) )
            // InternalDsl.g:2759:2: ( ruleEDouble )
            {
            // InternalDsl.g:2759:2: ( ruleEDouble )
            // InternalDsl.g:2760:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getPoszEDoubleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getPoszEDoubleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__PoszAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080300000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080100000L});

}