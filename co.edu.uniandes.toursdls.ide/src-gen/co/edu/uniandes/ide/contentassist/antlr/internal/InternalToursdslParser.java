package co.edu.uniandes.ide.contentassist.antlr.internal;

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
import co.edu.uniandes.services.ToursdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToursdslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENING_CURLY_BRACKET", "RULE_NAME", "RULE_COLON", "RULE_COMMA", "RULE_PLACES", "RULE_OPENING_SQUARE_BRACKET", "RULE_CLOSING_SQUARE_BRACKET", "RULE_CLOSING_CURLY_BRACKET", "RULE_DESCRIPTION", "RULE_PATHS", "RULE_TO", "RULE_FROM", "RULE_POSITION", "RULE_ROTATION", "RULE_COORDINATE_X", "RULE_INT", "RULE_DOT", "RULE_COORDINATE_Y", "RULE_COORDINATE_Z", "RULE_STRING", "RULE_ID", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'"
    };
    public static final int RULE_PATHS=13;
    public static final int RULE_TO=14;
    public static final int RULE_NAME=5;
    public static final int RULE_PLACES=8;
    public static final int RULE_STRING=23;
    public static final int RULE_CLOSING_CURLY_BRACKET=11;
    public static final int RULE_POSITION=16;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_OPENING_CURLY_BRACKET=4;
    public static final int RULE_DOT=20;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_COORDINATE_Y=21;
    public static final int RULE_COORDINATE_X=18;
    public static final int RULE_COORDINATE_Z=22;
    public static final int RULE_ID=24;
    public static final int RULE_COMMA=7;
    public static final int RULE_WS=28;
    public static final int RULE_DESCRIPTION=12;
    public static final int RULE_ROTATION=17;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_FROM=15;
    public static final int RULE_INT=19;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_QUOTE=25;
    public static final int RULE_OPENING_SQUARE_BRACKET=9;
    public static final int RULE_CLOSING_SQUARE_BRACKET=10;

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

    	public void setGrammarAccess(ToursdslGrammarAccess grammarAccess) {
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
    // InternalToursdsl.g:53:1: entryRuleTour : ruleTour EOF ;
    public final void entryRuleTour() throws RecognitionException {
        try {
            // InternalToursdsl.g:54:1: ( ruleTour EOF )
            // InternalToursdsl.g:55:1: ruleTour EOF
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
    // InternalToursdsl.g:62:1: ruleTour : ( ( rule__Tour__Group__0 ) ) ;
    public final void ruleTour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:66:2: ( ( ( rule__Tour__Group__0 ) ) )
            // InternalToursdsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            {
            // InternalToursdsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            // InternalToursdsl.g:68:3: ( rule__Tour__Group__0 )
            {
             before(grammarAccess.getTourAccess().getGroup()); 
            // InternalToursdsl.g:69:3: ( rule__Tour__Group__0 )
            // InternalToursdsl.g:69:4: rule__Tour__Group__0
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
    // InternalToursdsl.g:78:1: entryRulePanorama : rulePanorama EOF ;
    public final void entryRulePanorama() throws RecognitionException {
        try {
            // InternalToursdsl.g:79:1: ( rulePanorama EOF )
            // InternalToursdsl.g:80:1: rulePanorama EOF
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
    // InternalToursdsl.g:87:1: rulePanorama : ( ( rule__Panorama__Group__0 ) ) ;
    public final void rulePanorama() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:91:2: ( ( ( rule__Panorama__Group__0 ) ) )
            // InternalToursdsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            {
            // InternalToursdsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            // InternalToursdsl.g:93:3: ( rule__Panorama__Group__0 )
            {
             before(grammarAccess.getPanoramaAccess().getGroup()); 
            // InternalToursdsl.g:94:3: ( rule__Panorama__Group__0 )
            // InternalToursdsl.g:94:4: rule__Panorama__Group__0
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
    // InternalToursdsl.g:103:1: entryRuleHotspot : ruleHotspot EOF ;
    public final void entryRuleHotspot() throws RecognitionException {
        try {
            // InternalToursdsl.g:104:1: ( ruleHotspot EOF )
            // InternalToursdsl.g:105:1: ruleHotspot EOF
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
    // InternalToursdsl.g:112:1: ruleHotspot : ( ( rule__Hotspot__Group__0 ) ) ;
    public final void ruleHotspot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:116:2: ( ( ( rule__Hotspot__Group__0 ) ) )
            // InternalToursdsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            {
            // InternalToursdsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            // InternalToursdsl.g:118:3: ( rule__Hotspot__Group__0 )
            {
             before(grammarAccess.getHotspotAccess().getGroup()); 
            // InternalToursdsl.g:119:3: ( rule__Hotspot__Group__0 )
            // InternalToursdsl.g:119:4: rule__Hotspot__Group__0
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


    // $ANTLR start "entryRuleCoordenada"
    // InternalToursdsl.g:128:1: entryRuleCoordenada : ruleCoordenada EOF ;
    public final void entryRuleCoordenada() throws RecognitionException {
        try {
            // InternalToursdsl.g:129:1: ( ruleCoordenada EOF )
            // InternalToursdsl.g:130:1: ruleCoordenada EOF
            {
             before(grammarAccess.getCoordenadaRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordenada();

            state._fsp--;

             after(grammarAccess.getCoordenadaRule()); 
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
    // $ANTLR end "entryRuleCoordenada"


    // $ANTLR start "ruleCoordenada"
    // InternalToursdsl.g:137:1: ruleCoordenada : ( ( rule__Coordenada__Group__0 ) ) ;
    public final void ruleCoordenada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:141:2: ( ( ( rule__Coordenada__Group__0 ) ) )
            // InternalToursdsl.g:142:2: ( ( rule__Coordenada__Group__0 ) )
            {
            // InternalToursdsl.g:142:2: ( ( rule__Coordenada__Group__0 ) )
            // InternalToursdsl.g:143:3: ( rule__Coordenada__Group__0 )
            {
             before(grammarAccess.getCoordenadaAccess().getGroup()); 
            // InternalToursdsl.g:144:3: ( rule__Coordenada__Group__0 )
            // InternalToursdsl.g:144:4: rule__Coordenada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordenadaAccess().getGroup()); 

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
    // $ANTLR end "ruleCoordenada"


    // $ANTLR start "rule__Tour__Group__0"
    // InternalToursdsl.g:152:1: rule__Tour__Group__0 : rule__Tour__Group__0__Impl rule__Tour__Group__1 ;
    public final void rule__Tour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:156:1: ( rule__Tour__Group__0__Impl rule__Tour__Group__1 )
            // InternalToursdsl.g:157:2: rule__Tour__Group__0__Impl rule__Tour__Group__1
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
    // InternalToursdsl.g:164:1: rule__Tour__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Tour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:168:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalToursdsl.g:169:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:169:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalToursdsl.g:170:2: RULE_OPENING_CURLY_BRACKET
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
    // InternalToursdsl.g:179:1: rule__Tour__Group__1 : rule__Tour__Group__1__Impl rule__Tour__Group__2 ;
    public final void rule__Tour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:183:1: ( rule__Tour__Group__1__Impl rule__Tour__Group__2 )
            // InternalToursdsl.g:184:2: rule__Tour__Group__1__Impl rule__Tour__Group__2
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
    // InternalToursdsl.g:191:1: rule__Tour__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Tour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:195:1: ( ( RULE_NAME ) )
            // InternalToursdsl.g:196:1: ( RULE_NAME )
            {
            // InternalToursdsl.g:196:1: ( RULE_NAME )
            // InternalToursdsl.g:197:2: RULE_NAME
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
    // InternalToursdsl.g:206:1: rule__Tour__Group__2 : rule__Tour__Group__2__Impl rule__Tour__Group__3 ;
    public final void rule__Tour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:210:1: ( rule__Tour__Group__2__Impl rule__Tour__Group__3 )
            // InternalToursdsl.g:211:2: rule__Tour__Group__2__Impl rule__Tour__Group__3
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
    // InternalToursdsl.g:218:1: rule__Tour__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Tour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:222:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:223:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:223:1: ( RULE_COLON )
            // InternalToursdsl.g:224:2: RULE_COLON
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
    // InternalToursdsl.g:233:1: rule__Tour__Group__3 : rule__Tour__Group__3__Impl rule__Tour__Group__4 ;
    public final void rule__Tour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:237:1: ( rule__Tour__Group__3__Impl rule__Tour__Group__4 )
            // InternalToursdsl.g:238:2: rule__Tour__Group__3__Impl rule__Tour__Group__4
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
    // InternalToursdsl.g:245:1: rule__Tour__Group__3__Impl : ( ( rule__Tour__NameAssignment_3 ) ) ;
    public final void rule__Tour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:249:1: ( ( ( rule__Tour__NameAssignment_3 ) ) )
            // InternalToursdsl.g:250:1: ( ( rule__Tour__NameAssignment_3 ) )
            {
            // InternalToursdsl.g:250:1: ( ( rule__Tour__NameAssignment_3 ) )
            // InternalToursdsl.g:251:2: ( rule__Tour__NameAssignment_3 )
            {
             before(grammarAccess.getTourAccess().getNameAssignment_3()); 
            // InternalToursdsl.g:252:2: ( rule__Tour__NameAssignment_3 )
            // InternalToursdsl.g:252:3: rule__Tour__NameAssignment_3
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
    // InternalToursdsl.g:260:1: rule__Tour__Group__4 : rule__Tour__Group__4__Impl rule__Tour__Group__5 ;
    public final void rule__Tour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:264:1: ( rule__Tour__Group__4__Impl rule__Tour__Group__5 )
            // InternalToursdsl.g:265:2: rule__Tour__Group__4__Impl rule__Tour__Group__5
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
    // InternalToursdsl.g:272:1: rule__Tour__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Tour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:276:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:277:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:277:1: ( RULE_COMMA )
            // InternalToursdsl.g:278:2: RULE_COMMA
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
    // InternalToursdsl.g:287:1: rule__Tour__Group__5 : rule__Tour__Group__5__Impl rule__Tour__Group__6 ;
    public final void rule__Tour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:291:1: ( rule__Tour__Group__5__Impl rule__Tour__Group__6 )
            // InternalToursdsl.g:292:2: rule__Tour__Group__5__Impl rule__Tour__Group__6
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
    // InternalToursdsl.g:299:1: rule__Tour__Group__5__Impl : ( RULE_PLACES ) ;
    public final void rule__Tour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:303:1: ( ( RULE_PLACES ) )
            // InternalToursdsl.g:304:1: ( RULE_PLACES )
            {
            // InternalToursdsl.g:304:1: ( RULE_PLACES )
            // InternalToursdsl.g:305:2: RULE_PLACES
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
    // InternalToursdsl.g:314:1: rule__Tour__Group__6 : rule__Tour__Group__6__Impl rule__Tour__Group__7 ;
    public final void rule__Tour__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:318:1: ( rule__Tour__Group__6__Impl rule__Tour__Group__7 )
            // InternalToursdsl.g:319:2: rule__Tour__Group__6__Impl rule__Tour__Group__7
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
    // InternalToursdsl.g:326:1: rule__Tour__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Tour__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:330:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:331:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:331:1: ( RULE_COLON )
            // InternalToursdsl.g:332:2: RULE_COLON
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
    // InternalToursdsl.g:341:1: rule__Tour__Group__7 : rule__Tour__Group__7__Impl rule__Tour__Group__8 ;
    public final void rule__Tour__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:345:1: ( rule__Tour__Group__7__Impl rule__Tour__Group__8 )
            // InternalToursdsl.g:346:2: rule__Tour__Group__7__Impl rule__Tour__Group__8
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
    // InternalToursdsl.g:353:1: rule__Tour__Group__7__Impl : ( RULE_OPENING_SQUARE_BRACKET ) ;
    public final void rule__Tour__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:357:1: ( ( RULE_OPENING_SQUARE_BRACKET ) )
            // InternalToursdsl.g:358:1: ( RULE_OPENING_SQUARE_BRACKET )
            {
            // InternalToursdsl.g:358:1: ( RULE_OPENING_SQUARE_BRACKET )
            // InternalToursdsl.g:359:2: RULE_OPENING_SQUARE_BRACKET
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
    // InternalToursdsl.g:368:1: rule__Tour__Group__8 : rule__Tour__Group__8__Impl rule__Tour__Group__9 ;
    public final void rule__Tour__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:372:1: ( rule__Tour__Group__8__Impl rule__Tour__Group__9 )
            // InternalToursdsl.g:373:2: rule__Tour__Group__8__Impl rule__Tour__Group__9
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
    // InternalToursdsl.g:380:1: rule__Tour__Group__8__Impl : ( ( rule__Tour__PlacesAssignment_8 ) ) ;
    public final void rule__Tour__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:384:1: ( ( ( rule__Tour__PlacesAssignment_8 ) ) )
            // InternalToursdsl.g:385:1: ( ( rule__Tour__PlacesAssignment_8 ) )
            {
            // InternalToursdsl.g:385:1: ( ( rule__Tour__PlacesAssignment_8 ) )
            // InternalToursdsl.g:386:2: ( rule__Tour__PlacesAssignment_8 )
            {
             before(grammarAccess.getTourAccess().getPlacesAssignment_8()); 
            // InternalToursdsl.g:387:2: ( rule__Tour__PlacesAssignment_8 )
            // InternalToursdsl.g:387:3: rule__Tour__PlacesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Tour__PlacesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getPlacesAssignment_8()); 

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
    // InternalToursdsl.g:395:1: rule__Tour__Group__9 : rule__Tour__Group__9__Impl rule__Tour__Group__10 ;
    public final void rule__Tour__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:399:1: ( rule__Tour__Group__9__Impl rule__Tour__Group__10 )
            // InternalToursdsl.g:400:2: rule__Tour__Group__9__Impl rule__Tour__Group__10
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
    // InternalToursdsl.g:407:1: rule__Tour__Group__9__Impl : ( ( rule__Tour__Group_9__0 )* ) ;
    public final void rule__Tour__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:411:1: ( ( ( rule__Tour__Group_9__0 )* ) )
            // InternalToursdsl.g:412:1: ( ( rule__Tour__Group_9__0 )* )
            {
            // InternalToursdsl.g:412:1: ( ( rule__Tour__Group_9__0 )* )
            // InternalToursdsl.g:413:2: ( rule__Tour__Group_9__0 )*
            {
             before(grammarAccess.getTourAccess().getGroup_9()); 
            // InternalToursdsl.g:414:2: ( rule__Tour__Group_9__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalToursdsl.g:414:3: rule__Tour__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tour__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalToursdsl.g:422:1: rule__Tour__Group__10 : rule__Tour__Group__10__Impl rule__Tour__Group__11 ;
    public final void rule__Tour__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:426:1: ( rule__Tour__Group__10__Impl rule__Tour__Group__11 )
            // InternalToursdsl.g:427:2: rule__Tour__Group__10__Impl rule__Tour__Group__11
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
    // InternalToursdsl.g:434:1: rule__Tour__Group__10__Impl : ( RULE_CLOSING_SQUARE_BRACKET ) ;
    public final void rule__Tour__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:438:1: ( ( RULE_CLOSING_SQUARE_BRACKET ) )
            // InternalToursdsl.g:439:1: ( RULE_CLOSING_SQUARE_BRACKET )
            {
            // InternalToursdsl.g:439:1: ( RULE_CLOSING_SQUARE_BRACKET )
            // InternalToursdsl.g:440:2: RULE_CLOSING_SQUARE_BRACKET
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
    // InternalToursdsl.g:449:1: rule__Tour__Group__11 : rule__Tour__Group__11__Impl ;
    public final void rule__Tour__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:453:1: ( rule__Tour__Group__11__Impl )
            // InternalToursdsl.g:454:2: rule__Tour__Group__11__Impl
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
    // InternalToursdsl.g:460:1: rule__Tour__Group__11__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Tour__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:464:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:465:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:465:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:466:2: RULE_CLOSING_CURLY_BRACKET
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
    // InternalToursdsl.g:476:1: rule__Tour__Group_9__0 : rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1 ;
    public final void rule__Tour__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:480:1: ( rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1 )
            // InternalToursdsl.g:481:2: rule__Tour__Group_9__0__Impl rule__Tour__Group_9__1
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
    // InternalToursdsl.g:488:1: rule__Tour__Group_9__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Tour__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:492:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:493:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:493:1: ( RULE_COMMA )
            // InternalToursdsl.g:494:2: RULE_COMMA
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
    // InternalToursdsl.g:503:1: rule__Tour__Group_9__1 : rule__Tour__Group_9__1__Impl ;
    public final void rule__Tour__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:507:1: ( rule__Tour__Group_9__1__Impl )
            // InternalToursdsl.g:508:2: rule__Tour__Group_9__1__Impl
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
    // InternalToursdsl.g:514:1: rule__Tour__Group_9__1__Impl : ( ( rule__Tour__PlacesAssignment_9_1 ) ) ;
    public final void rule__Tour__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:518:1: ( ( ( rule__Tour__PlacesAssignment_9_1 ) ) )
            // InternalToursdsl.g:519:1: ( ( rule__Tour__PlacesAssignment_9_1 ) )
            {
            // InternalToursdsl.g:519:1: ( ( rule__Tour__PlacesAssignment_9_1 ) )
            // InternalToursdsl.g:520:2: ( rule__Tour__PlacesAssignment_9_1 )
            {
             before(grammarAccess.getTourAccess().getPlacesAssignment_9_1()); 
            // InternalToursdsl.g:521:2: ( rule__Tour__PlacesAssignment_9_1 )
            // InternalToursdsl.g:521:3: rule__Tour__PlacesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Tour__PlacesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getPlacesAssignment_9_1()); 

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
    // InternalToursdsl.g:530:1: rule__Panorama__Group__0 : rule__Panorama__Group__0__Impl rule__Panorama__Group__1 ;
    public final void rule__Panorama__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:534:1: ( rule__Panorama__Group__0__Impl rule__Panorama__Group__1 )
            // InternalToursdsl.g:535:2: rule__Panorama__Group__0__Impl rule__Panorama__Group__1
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
    // InternalToursdsl.g:542:1: rule__Panorama__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Panorama__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:546:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalToursdsl.g:547:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:547:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalToursdsl.g:548:2: RULE_OPENING_CURLY_BRACKET
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
    // InternalToursdsl.g:557:1: rule__Panorama__Group__1 : rule__Panorama__Group__1__Impl rule__Panorama__Group__2 ;
    public final void rule__Panorama__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:561:1: ( rule__Panorama__Group__1__Impl rule__Panorama__Group__2 )
            // InternalToursdsl.g:562:2: rule__Panorama__Group__1__Impl rule__Panorama__Group__2
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
    // InternalToursdsl.g:569:1: rule__Panorama__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Panorama__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:573:1: ( ( RULE_NAME ) )
            // InternalToursdsl.g:574:1: ( RULE_NAME )
            {
            // InternalToursdsl.g:574:1: ( RULE_NAME )
            // InternalToursdsl.g:575:2: RULE_NAME
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
    // InternalToursdsl.g:584:1: rule__Panorama__Group__2 : rule__Panorama__Group__2__Impl rule__Panorama__Group__3 ;
    public final void rule__Panorama__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:588:1: ( rule__Panorama__Group__2__Impl rule__Panorama__Group__3 )
            // InternalToursdsl.g:589:2: rule__Panorama__Group__2__Impl rule__Panorama__Group__3
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
    // InternalToursdsl.g:596:1: rule__Panorama__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:600:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:601:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:601:1: ( RULE_COLON )
            // InternalToursdsl.g:602:2: RULE_COLON
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
    // InternalToursdsl.g:611:1: rule__Panorama__Group__3 : rule__Panorama__Group__3__Impl rule__Panorama__Group__4 ;
    public final void rule__Panorama__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:615:1: ( rule__Panorama__Group__3__Impl rule__Panorama__Group__4 )
            // InternalToursdsl.g:616:2: rule__Panorama__Group__3__Impl rule__Panorama__Group__4
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
    // InternalToursdsl.g:623:1: rule__Panorama__Group__3__Impl : ( ( rule__Panorama__NameAssignment_3 ) ) ;
    public final void rule__Panorama__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:627:1: ( ( ( rule__Panorama__NameAssignment_3 ) ) )
            // InternalToursdsl.g:628:1: ( ( rule__Panorama__NameAssignment_3 ) )
            {
            // InternalToursdsl.g:628:1: ( ( rule__Panorama__NameAssignment_3 ) )
            // InternalToursdsl.g:629:2: ( rule__Panorama__NameAssignment_3 )
            {
             before(grammarAccess.getPanoramaAccess().getNameAssignment_3()); 
            // InternalToursdsl.g:630:2: ( rule__Panorama__NameAssignment_3 )
            // InternalToursdsl.g:630:3: rule__Panorama__NameAssignment_3
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
    // InternalToursdsl.g:638:1: rule__Panorama__Group__4 : rule__Panorama__Group__4__Impl rule__Panorama__Group__5 ;
    public final void rule__Panorama__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:642:1: ( rule__Panorama__Group__4__Impl rule__Panorama__Group__5 )
            // InternalToursdsl.g:643:2: rule__Panorama__Group__4__Impl rule__Panorama__Group__5
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
    // InternalToursdsl.g:650:1: rule__Panorama__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:654:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:655:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:655:1: ( RULE_COMMA )
            // InternalToursdsl.g:656:2: RULE_COMMA
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
    // InternalToursdsl.g:665:1: rule__Panorama__Group__5 : rule__Panorama__Group__5__Impl rule__Panorama__Group__6 ;
    public final void rule__Panorama__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:669:1: ( rule__Panorama__Group__5__Impl rule__Panorama__Group__6 )
            // InternalToursdsl.g:670:2: rule__Panorama__Group__5__Impl rule__Panorama__Group__6
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
    // InternalToursdsl.g:677:1: rule__Panorama__Group__5__Impl : ( RULE_DESCRIPTION ) ;
    public final void rule__Panorama__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:681:1: ( ( RULE_DESCRIPTION ) )
            // InternalToursdsl.g:682:1: ( RULE_DESCRIPTION )
            {
            // InternalToursdsl.g:682:1: ( RULE_DESCRIPTION )
            // InternalToursdsl.g:683:2: RULE_DESCRIPTION
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
    // InternalToursdsl.g:692:1: rule__Panorama__Group__6 : rule__Panorama__Group__6__Impl rule__Panorama__Group__7 ;
    public final void rule__Panorama__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:696:1: ( rule__Panorama__Group__6__Impl rule__Panorama__Group__7 )
            // InternalToursdsl.g:697:2: rule__Panorama__Group__6__Impl rule__Panorama__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalToursdsl.g:704:1: rule__Panorama__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:708:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:709:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:709:1: ( RULE_COLON )
            // InternalToursdsl.g:710:2: RULE_COLON
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
    // InternalToursdsl.g:719:1: rule__Panorama__Group__7 : rule__Panorama__Group__7__Impl rule__Panorama__Group__8 ;
    public final void rule__Panorama__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:723:1: ( rule__Panorama__Group__7__Impl rule__Panorama__Group__8 )
            // InternalToursdsl.g:724:2: rule__Panorama__Group__7__Impl rule__Panorama__Group__8
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
    // InternalToursdsl.g:731:1: rule__Panorama__Group__7__Impl : ( ( rule__Panorama__DescriptionAssignment_7 ) ) ;
    public final void rule__Panorama__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:735:1: ( ( ( rule__Panorama__DescriptionAssignment_7 ) ) )
            // InternalToursdsl.g:736:1: ( ( rule__Panorama__DescriptionAssignment_7 ) )
            {
            // InternalToursdsl.g:736:1: ( ( rule__Panorama__DescriptionAssignment_7 ) )
            // InternalToursdsl.g:737:2: ( rule__Panorama__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPanoramaAccess().getDescriptionAssignment_7()); 
            // InternalToursdsl.g:738:2: ( rule__Panorama__DescriptionAssignment_7 )
            // InternalToursdsl.g:738:3: rule__Panorama__DescriptionAssignment_7
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
    // InternalToursdsl.g:746:1: rule__Panorama__Group__8 : rule__Panorama__Group__8__Impl rule__Panorama__Group__9 ;
    public final void rule__Panorama__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:750:1: ( rule__Panorama__Group__8__Impl rule__Panorama__Group__9 )
            // InternalToursdsl.g:751:2: rule__Panorama__Group__8__Impl rule__Panorama__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalToursdsl.g:758:1: rule__Panorama__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:762:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:763:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:763:1: ( RULE_COMMA )
            // InternalToursdsl.g:764:2: RULE_COMMA
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
    // InternalToursdsl.g:773:1: rule__Panorama__Group__9 : rule__Panorama__Group__9__Impl rule__Panorama__Group__10 ;
    public final void rule__Panorama__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:777:1: ( rule__Panorama__Group__9__Impl rule__Panorama__Group__10 )
            // InternalToursdsl.g:778:2: rule__Panorama__Group__9__Impl rule__Panorama__Group__10
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
    // InternalToursdsl.g:785:1: rule__Panorama__Group__9__Impl : ( RULE_PATHS ) ;
    public final void rule__Panorama__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:789:1: ( ( RULE_PATHS ) )
            // InternalToursdsl.g:790:1: ( RULE_PATHS )
            {
            // InternalToursdsl.g:790:1: ( RULE_PATHS )
            // InternalToursdsl.g:791:2: RULE_PATHS
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
    // InternalToursdsl.g:800:1: rule__Panorama__Group__10 : rule__Panorama__Group__10__Impl rule__Panorama__Group__11 ;
    public final void rule__Panorama__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:804:1: ( rule__Panorama__Group__10__Impl rule__Panorama__Group__11 )
            // InternalToursdsl.g:805:2: rule__Panorama__Group__10__Impl rule__Panorama__Group__11
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
    // InternalToursdsl.g:812:1: rule__Panorama__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Panorama__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:816:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:817:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:817:1: ( RULE_COLON )
            // InternalToursdsl.g:818:2: RULE_COLON
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
    // InternalToursdsl.g:827:1: rule__Panorama__Group__11 : rule__Panorama__Group__11__Impl rule__Panorama__Group__12 ;
    public final void rule__Panorama__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:831:1: ( rule__Panorama__Group__11__Impl rule__Panorama__Group__12 )
            // InternalToursdsl.g:832:2: rule__Panorama__Group__11__Impl rule__Panorama__Group__12
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
    // InternalToursdsl.g:839:1: rule__Panorama__Group__11__Impl : ( RULE_OPENING_SQUARE_BRACKET ) ;
    public final void rule__Panorama__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:843:1: ( ( RULE_OPENING_SQUARE_BRACKET ) )
            // InternalToursdsl.g:844:1: ( RULE_OPENING_SQUARE_BRACKET )
            {
            // InternalToursdsl.g:844:1: ( RULE_OPENING_SQUARE_BRACKET )
            // InternalToursdsl.g:845:2: RULE_OPENING_SQUARE_BRACKET
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
    // InternalToursdsl.g:854:1: rule__Panorama__Group__12 : rule__Panorama__Group__12__Impl rule__Panorama__Group__13 ;
    public final void rule__Panorama__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:858:1: ( rule__Panorama__Group__12__Impl rule__Panorama__Group__13 )
            // InternalToursdsl.g:859:2: rule__Panorama__Group__12__Impl rule__Panorama__Group__13
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
    // InternalToursdsl.g:866:1: rule__Panorama__Group__12__Impl : ( ( rule__Panorama__PlacesAssignment_12 ) ) ;
    public final void rule__Panorama__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:870:1: ( ( ( rule__Panorama__PlacesAssignment_12 ) ) )
            // InternalToursdsl.g:871:1: ( ( rule__Panorama__PlacesAssignment_12 ) )
            {
            // InternalToursdsl.g:871:1: ( ( rule__Panorama__PlacesAssignment_12 ) )
            // InternalToursdsl.g:872:2: ( rule__Panorama__PlacesAssignment_12 )
            {
             before(grammarAccess.getPanoramaAccess().getPlacesAssignment_12()); 
            // InternalToursdsl.g:873:2: ( rule__Panorama__PlacesAssignment_12 )
            // InternalToursdsl.g:873:3: rule__Panorama__PlacesAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__PlacesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getPlacesAssignment_12()); 

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
    // InternalToursdsl.g:881:1: rule__Panorama__Group__13 : rule__Panorama__Group__13__Impl rule__Panorama__Group__14 ;
    public final void rule__Panorama__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:885:1: ( rule__Panorama__Group__13__Impl rule__Panorama__Group__14 )
            // InternalToursdsl.g:886:2: rule__Panorama__Group__13__Impl rule__Panorama__Group__14
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
    // InternalToursdsl.g:893:1: rule__Panorama__Group__13__Impl : ( ( rule__Panorama__Group_13__0 )* ) ;
    public final void rule__Panorama__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:897:1: ( ( ( rule__Panorama__Group_13__0 )* ) )
            // InternalToursdsl.g:898:1: ( ( rule__Panorama__Group_13__0 )* )
            {
            // InternalToursdsl.g:898:1: ( ( rule__Panorama__Group_13__0 )* )
            // InternalToursdsl.g:899:2: ( rule__Panorama__Group_13__0 )*
            {
             before(grammarAccess.getPanoramaAccess().getGroup_13()); 
            // InternalToursdsl.g:900:2: ( rule__Panorama__Group_13__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToursdsl.g:900:3: rule__Panorama__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Panorama__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalToursdsl.g:908:1: rule__Panorama__Group__14 : rule__Panorama__Group__14__Impl rule__Panorama__Group__15 ;
    public final void rule__Panorama__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:912:1: ( rule__Panorama__Group__14__Impl rule__Panorama__Group__15 )
            // InternalToursdsl.g:913:2: rule__Panorama__Group__14__Impl rule__Panorama__Group__15
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
    // InternalToursdsl.g:920:1: rule__Panorama__Group__14__Impl : ( RULE_CLOSING_SQUARE_BRACKET ) ;
    public final void rule__Panorama__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:924:1: ( ( RULE_CLOSING_SQUARE_BRACKET ) )
            // InternalToursdsl.g:925:1: ( RULE_CLOSING_SQUARE_BRACKET )
            {
            // InternalToursdsl.g:925:1: ( RULE_CLOSING_SQUARE_BRACKET )
            // InternalToursdsl.g:926:2: RULE_CLOSING_SQUARE_BRACKET
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
    // InternalToursdsl.g:935:1: rule__Panorama__Group__15 : rule__Panorama__Group__15__Impl ;
    public final void rule__Panorama__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:939:1: ( rule__Panorama__Group__15__Impl )
            // InternalToursdsl.g:940:2: rule__Panorama__Group__15__Impl
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
    // InternalToursdsl.g:946:1: rule__Panorama__Group__15__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Panorama__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:950:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:951:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:951:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:952:2: RULE_CLOSING_CURLY_BRACKET
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
    // InternalToursdsl.g:962:1: rule__Panorama__Group_13__0 : rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1 ;
    public final void rule__Panorama__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:966:1: ( rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1 )
            // InternalToursdsl.g:967:2: rule__Panorama__Group_13__0__Impl rule__Panorama__Group_13__1
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
    // InternalToursdsl.g:974:1: rule__Panorama__Group_13__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Panorama__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:978:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:979:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:979:1: ( RULE_COMMA )
            // InternalToursdsl.g:980:2: RULE_COMMA
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
    // InternalToursdsl.g:989:1: rule__Panorama__Group_13__1 : rule__Panorama__Group_13__1__Impl ;
    public final void rule__Panorama__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:993:1: ( rule__Panorama__Group_13__1__Impl )
            // InternalToursdsl.g:994:2: rule__Panorama__Group_13__1__Impl
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
    // InternalToursdsl.g:1000:1: rule__Panorama__Group_13__1__Impl : ( ( rule__Panorama__PlacesAssignment_13_1 ) ) ;
    public final void rule__Panorama__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1004:1: ( ( ( rule__Panorama__PlacesAssignment_13_1 ) ) )
            // InternalToursdsl.g:1005:1: ( ( rule__Panorama__PlacesAssignment_13_1 ) )
            {
            // InternalToursdsl.g:1005:1: ( ( rule__Panorama__PlacesAssignment_13_1 ) )
            // InternalToursdsl.g:1006:2: ( rule__Panorama__PlacesAssignment_13_1 )
            {
             before(grammarAccess.getPanoramaAccess().getPlacesAssignment_13_1()); 
            // InternalToursdsl.g:1007:2: ( rule__Panorama__PlacesAssignment_13_1 )
            // InternalToursdsl.g:1007:3: rule__Panorama__PlacesAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__PlacesAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getPlacesAssignment_13_1()); 

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
    // InternalToursdsl.g:1016:1: rule__Hotspot__Group__0 : rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 ;
    public final void rule__Hotspot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1020:1: ( rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 )
            // InternalToursdsl.g:1021:2: rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1
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
    // InternalToursdsl.g:1028:1: rule__Hotspot__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Hotspot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1032:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalToursdsl.g:1033:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:1033:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalToursdsl.g:1034:2: RULE_OPENING_CURLY_BRACKET
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
    // InternalToursdsl.g:1043:1: rule__Hotspot__Group__1 : rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 ;
    public final void rule__Hotspot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1047:1: ( rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 )
            // InternalToursdsl.g:1048:2: rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2
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
    // InternalToursdsl.g:1055:1: rule__Hotspot__Group__1__Impl : ( RULE_NAME ) ;
    public final void rule__Hotspot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1059:1: ( ( RULE_NAME ) )
            // InternalToursdsl.g:1060:1: ( RULE_NAME )
            {
            // InternalToursdsl.g:1060:1: ( RULE_NAME )
            // InternalToursdsl.g:1061:2: RULE_NAME
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
    // InternalToursdsl.g:1070:1: rule__Hotspot__Group__2 : rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 ;
    public final void rule__Hotspot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1074:1: ( rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 )
            // InternalToursdsl.g:1075:2: rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3
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
    // InternalToursdsl.g:1082:1: rule__Hotspot__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1086:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1087:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1087:1: ( RULE_COLON )
            // InternalToursdsl.g:1088:2: RULE_COLON
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
    // InternalToursdsl.g:1097:1: rule__Hotspot__Group__3 : rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 ;
    public final void rule__Hotspot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1101:1: ( rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 )
            // InternalToursdsl.g:1102:2: rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4
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
    // InternalToursdsl.g:1109:1: rule__Hotspot__Group__3__Impl : ( ( rule__Hotspot__NameAssignment_3 ) ) ;
    public final void rule__Hotspot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1113:1: ( ( ( rule__Hotspot__NameAssignment_3 ) ) )
            // InternalToursdsl.g:1114:1: ( ( rule__Hotspot__NameAssignment_3 ) )
            {
            // InternalToursdsl.g:1114:1: ( ( rule__Hotspot__NameAssignment_3 ) )
            // InternalToursdsl.g:1115:2: ( rule__Hotspot__NameAssignment_3 )
            {
             before(grammarAccess.getHotspotAccess().getNameAssignment_3()); 
            // InternalToursdsl.g:1116:2: ( rule__Hotspot__NameAssignment_3 )
            // InternalToursdsl.g:1116:3: rule__Hotspot__NameAssignment_3
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
    // InternalToursdsl.g:1124:1: rule__Hotspot__Group__4 : rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 ;
    public final void rule__Hotspot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1128:1: ( rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 )
            // InternalToursdsl.g:1129:2: rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalToursdsl.g:1136:1: rule__Hotspot__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1140:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1141:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1141:1: ( RULE_COMMA )
            // InternalToursdsl.g:1142:2: RULE_COMMA
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
    // InternalToursdsl.g:1151:1: rule__Hotspot__Group__5 : rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 ;
    public final void rule__Hotspot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1155:1: ( rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 )
            // InternalToursdsl.g:1156:2: rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6
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
    // InternalToursdsl.g:1163:1: rule__Hotspot__Group__5__Impl : ( RULE_TO ) ;
    public final void rule__Hotspot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1167:1: ( ( RULE_TO ) )
            // InternalToursdsl.g:1168:1: ( RULE_TO )
            {
            // InternalToursdsl.g:1168:1: ( RULE_TO )
            // InternalToursdsl.g:1169:2: RULE_TO
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
    // InternalToursdsl.g:1178:1: rule__Hotspot__Group__6 : rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 ;
    public final void rule__Hotspot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1182:1: ( rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 )
            // InternalToursdsl.g:1183:2: rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalToursdsl.g:1190:1: rule__Hotspot__Group__6__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1194:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1195:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1195:1: ( RULE_COLON )
            // InternalToursdsl.g:1196:2: RULE_COLON
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
    // InternalToursdsl.g:1205:1: rule__Hotspot__Group__7 : rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 ;
    public final void rule__Hotspot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1209:1: ( rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 )
            // InternalToursdsl.g:1210:2: rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8
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
    // InternalToursdsl.g:1217:1: rule__Hotspot__Group__7__Impl : ( ( rule__Hotspot__DestinoAssignment_7 ) ) ;
    public final void rule__Hotspot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1221:1: ( ( ( rule__Hotspot__DestinoAssignment_7 ) ) )
            // InternalToursdsl.g:1222:1: ( ( rule__Hotspot__DestinoAssignment_7 ) )
            {
            // InternalToursdsl.g:1222:1: ( ( rule__Hotspot__DestinoAssignment_7 ) )
            // InternalToursdsl.g:1223:2: ( rule__Hotspot__DestinoAssignment_7 )
            {
             before(grammarAccess.getHotspotAccess().getDestinoAssignment_7()); 
            // InternalToursdsl.g:1224:2: ( rule__Hotspot__DestinoAssignment_7 )
            // InternalToursdsl.g:1224:3: rule__Hotspot__DestinoAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__DestinoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getDestinoAssignment_7()); 

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
    // InternalToursdsl.g:1232:1: rule__Hotspot__Group__8 : rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 ;
    public final void rule__Hotspot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1236:1: ( rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 )
            // InternalToursdsl.g:1237:2: rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalToursdsl.g:1244:1: rule__Hotspot__Group__8__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1248:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1249:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1249:1: ( RULE_COMMA )
            // InternalToursdsl.g:1250:2: RULE_COMMA
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
    // InternalToursdsl.g:1259:1: rule__Hotspot__Group__9 : rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 ;
    public final void rule__Hotspot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1263:1: ( rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 )
            // InternalToursdsl.g:1264:2: rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10
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
    // InternalToursdsl.g:1271:1: rule__Hotspot__Group__9__Impl : ( RULE_FROM ) ;
    public final void rule__Hotspot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1275:1: ( ( RULE_FROM ) )
            // InternalToursdsl.g:1276:1: ( RULE_FROM )
            {
            // InternalToursdsl.g:1276:1: ( RULE_FROM )
            // InternalToursdsl.g:1277:2: RULE_FROM
            {
             before(grammarAccess.getHotspotAccess().getFROMTerminalRuleCall_9()); 
            match(input,RULE_FROM,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getFROMTerminalRuleCall_9()); 

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
    // InternalToursdsl.g:1286:1: rule__Hotspot__Group__10 : rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 ;
    public final void rule__Hotspot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1290:1: ( rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 )
            // InternalToursdsl.g:1291:2: rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalToursdsl.g:1298:1: rule__Hotspot__Group__10__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1302:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1303:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1303:1: ( RULE_COLON )
            // InternalToursdsl.g:1304:2: RULE_COLON
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
    // InternalToursdsl.g:1313:1: rule__Hotspot__Group__11 : rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 ;
    public final void rule__Hotspot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1317:1: ( rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 )
            // InternalToursdsl.g:1318:2: rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12
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
    // InternalToursdsl.g:1325:1: rule__Hotspot__Group__11__Impl : ( ( rule__Hotspot__OrigenAssignment_11 ) ) ;
    public final void rule__Hotspot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1329:1: ( ( ( rule__Hotspot__OrigenAssignment_11 ) ) )
            // InternalToursdsl.g:1330:1: ( ( rule__Hotspot__OrigenAssignment_11 ) )
            {
            // InternalToursdsl.g:1330:1: ( ( rule__Hotspot__OrigenAssignment_11 ) )
            // InternalToursdsl.g:1331:2: ( rule__Hotspot__OrigenAssignment_11 )
            {
             before(grammarAccess.getHotspotAccess().getOrigenAssignment_11()); 
            // InternalToursdsl.g:1332:2: ( rule__Hotspot__OrigenAssignment_11 )
            // InternalToursdsl.g:1332:3: rule__Hotspot__OrigenAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__OrigenAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getOrigenAssignment_11()); 

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
    // InternalToursdsl.g:1340:1: rule__Hotspot__Group__12 : rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 ;
    public final void rule__Hotspot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1344:1: ( rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 )
            // InternalToursdsl.g:1345:2: rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13
            {
            pushFollow(FOLLOW_18);
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
    // InternalToursdsl.g:1352:1: rule__Hotspot__Group__12__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1356:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1357:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1357:1: ( RULE_COMMA )
            // InternalToursdsl.g:1358:2: RULE_COMMA
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
    // InternalToursdsl.g:1367:1: rule__Hotspot__Group__13 : rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 ;
    public final void rule__Hotspot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1371:1: ( rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 )
            // InternalToursdsl.g:1372:2: rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14
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
    // InternalToursdsl.g:1379:1: rule__Hotspot__Group__13__Impl : ( RULE_POSITION ) ;
    public final void rule__Hotspot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1383:1: ( ( RULE_POSITION ) )
            // InternalToursdsl.g:1384:1: ( RULE_POSITION )
            {
            // InternalToursdsl.g:1384:1: ( RULE_POSITION )
            // InternalToursdsl.g:1385:2: RULE_POSITION
            {
             before(grammarAccess.getHotspotAccess().getPOSITIONTerminalRuleCall_13()); 
            match(input,RULE_POSITION,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getPOSITIONTerminalRuleCall_13()); 

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
    // InternalToursdsl.g:1394:1: rule__Hotspot__Group__14 : rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15 ;
    public final void rule__Hotspot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1398:1: ( rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15 )
            // InternalToursdsl.g:1399:2: rule__Hotspot__Group__14__Impl rule__Hotspot__Group__15
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
    // InternalToursdsl.g:1406:1: rule__Hotspot__Group__14__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1410:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1411:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1411:1: ( RULE_COLON )
            // InternalToursdsl.g:1412:2: RULE_COLON
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
    // InternalToursdsl.g:1421:1: rule__Hotspot__Group__15 : rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16 ;
    public final void rule__Hotspot__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1425:1: ( rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16 )
            // InternalToursdsl.g:1426:2: rule__Hotspot__Group__15__Impl rule__Hotspot__Group__16
            {
            pushFollow(FOLLOW_6);
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
    // InternalToursdsl.g:1433:1: rule__Hotspot__Group__15__Impl : ( ( rule__Hotspot__PosicionAssignment_15 ) ) ;
    public final void rule__Hotspot__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1437:1: ( ( ( rule__Hotspot__PosicionAssignment_15 ) ) )
            // InternalToursdsl.g:1438:1: ( ( rule__Hotspot__PosicionAssignment_15 ) )
            {
            // InternalToursdsl.g:1438:1: ( ( rule__Hotspot__PosicionAssignment_15 ) )
            // InternalToursdsl.g:1439:2: ( rule__Hotspot__PosicionAssignment_15 )
            {
             before(grammarAccess.getHotspotAccess().getPosicionAssignment_15()); 
            // InternalToursdsl.g:1440:2: ( rule__Hotspot__PosicionAssignment_15 )
            // InternalToursdsl.g:1440:3: rule__Hotspot__PosicionAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__PosicionAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getPosicionAssignment_15()); 

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
    // InternalToursdsl.g:1448:1: rule__Hotspot__Group__16 : rule__Hotspot__Group__16__Impl rule__Hotspot__Group__17 ;
    public final void rule__Hotspot__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1452:1: ( rule__Hotspot__Group__16__Impl rule__Hotspot__Group__17 )
            // InternalToursdsl.g:1453:2: rule__Hotspot__Group__16__Impl rule__Hotspot__Group__17
            {
            pushFollow(FOLLOW_19);
            rule__Hotspot__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__17();

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
    // InternalToursdsl.g:1460:1: rule__Hotspot__Group__16__Impl : ( RULE_COMMA ) ;
    public final void rule__Hotspot__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1464:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1465:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1465:1: ( RULE_COMMA )
            // InternalToursdsl.g:1466:2: RULE_COMMA
            {
             before(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_16()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMMATerminalRuleCall_16()); 

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


    // $ANTLR start "rule__Hotspot__Group__17"
    // InternalToursdsl.g:1475:1: rule__Hotspot__Group__17 : rule__Hotspot__Group__17__Impl rule__Hotspot__Group__18 ;
    public final void rule__Hotspot__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1479:1: ( rule__Hotspot__Group__17__Impl rule__Hotspot__Group__18 )
            // InternalToursdsl.g:1480:2: rule__Hotspot__Group__17__Impl rule__Hotspot__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__18();

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
    // $ANTLR end "rule__Hotspot__Group__17"


    // $ANTLR start "rule__Hotspot__Group__17__Impl"
    // InternalToursdsl.g:1487:1: rule__Hotspot__Group__17__Impl : ( RULE_ROTATION ) ;
    public final void rule__Hotspot__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1491:1: ( ( RULE_ROTATION ) )
            // InternalToursdsl.g:1492:1: ( RULE_ROTATION )
            {
            // InternalToursdsl.g:1492:1: ( RULE_ROTATION )
            // InternalToursdsl.g:1493:2: RULE_ROTATION
            {
             before(grammarAccess.getHotspotAccess().getROTATIONTerminalRuleCall_17()); 
            match(input,RULE_ROTATION,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getROTATIONTerminalRuleCall_17()); 

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
    // $ANTLR end "rule__Hotspot__Group__17__Impl"


    // $ANTLR start "rule__Hotspot__Group__18"
    // InternalToursdsl.g:1502:1: rule__Hotspot__Group__18 : rule__Hotspot__Group__18__Impl rule__Hotspot__Group__19 ;
    public final void rule__Hotspot__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1506:1: ( rule__Hotspot__Group__18__Impl rule__Hotspot__Group__19 )
            // InternalToursdsl.g:1507:2: rule__Hotspot__Group__18__Impl rule__Hotspot__Group__19
            {
            pushFollow(FOLLOW_9);
            rule__Hotspot__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__19();

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
    // $ANTLR end "rule__Hotspot__Group__18"


    // $ANTLR start "rule__Hotspot__Group__18__Impl"
    // InternalToursdsl.g:1514:1: rule__Hotspot__Group__18__Impl : ( RULE_COLON ) ;
    public final void rule__Hotspot__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1518:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1519:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1519:1: ( RULE_COLON )
            // InternalToursdsl.g:1520:2: RULE_COLON
            {
             before(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_18()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOLONTerminalRuleCall_18()); 

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
    // $ANTLR end "rule__Hotspot__Group__18__Impl"


    // $ANTLR start "rule__Hotspot__Group__19"
    // InternalToursdsl.g:1529:1: rule__Hotspot__Group__19 : rule__Hotspot__Group__19__Impl rule__Hotspot__Group__20 ;
    public final void rule__Hotspot__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1533:1: ( rule__Hotspot__Group__19__Impl rule__Hotspot__Group__20 )
            // InternalToursdsl.g:1534:2: rule__Hotspot__Group__19__Impl rule__Hotspot__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Hotspot__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__20();

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
    // $ANTLR end "rule__Hotspot__Group__19"


    // $ANTLR start "rule__Hotspot__Group__19__Impl"
    // InternalToursdsl.g:1541:1: rule__Hotspot__Group__19__Impl : ( ( rule__Hotspot__RotacionAssignment_19 ) ) ;
    public final void rule__Hotspot__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1545:1: ( ( ( rule__Hotspot__RotacionAssignment_19 ) ) )
            // InternalToursdsl.g:1546:1: ( ( rule__Hotspot__RotacionAssignment_19 ) )
            {
            // InternalToursdsl.g:1546:1: ( ( rule__Hotspot__RotacionAssignment_19 ) )
            // InternalToursdsl.g:1547:2: ( rule__Hotspot__RotacionAssignment_19 )
            {
             before(grammarAccess.getHotspotAccess().getRotacionAssignment_19()); 
            // InternalToursdsl.g:1548:2: ( rule__Hotspot__RotacionAssignment_19 )
            // InternalToursdsl.g:1548:3: rule__Hotspot__RotacionAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__RotacionAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getRotacionAssignment_19()); 

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
    // $ANTLR end "rule__Hotspot__Group__19__Impl"


    // $ANTLR start "rule__Hotspot__Group__20"
    // InternalToursdsl.g:1556:1: rule__Hotspot__Group__20 : rule__Hotspot__Group__20__Impl ;
    public final void rule__Hotspot__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1560:1: ( rule__Hotspot__Group__20__Impl )
            // InternalToursdsl.g:1561:2: rule__Hotspot__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__20__Impl();

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
    // $ANTLR end "rule__Hotspot__Group__20"


    // $ANTLR start "rule__Hotspot__Group__20__Impl"
    // InternalToursdsl.g:1567:1: rule__Hotspot__Group__20__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Hotspot__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1571:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:1572:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:1572:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:1573:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_20()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_20()); 

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
    // $ANTLR end "rule__Hotspot__Group__20__Impl"


    // $ANTLR start "rule__Coordenada__Group__0"
    // InternalToursdsl.g:1583:1: rule__Coordenada__Group__0 : rule__Coordenada__Group__0__Impl rule__Coordenada__Group__1 ;
    public final void rule__Coordenada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1587:1: ( rule__Coordenada__Group__0__Impl rule__Coordenada__Group__1 )
            // InternalToursdsl.g:1588:2: rule__Coordenada__Group__0__Impl rule__Coordenada__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Coordenada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__1();

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
    // $ANTLR end "rule__Coordenada__Group__0"


    // $ANTLR start "rule__Coordenada__Group__0__Impl"
    // InternalToursdsl.g:1595:1: rule__Coordenada__Group__0__Impl : ( RULE_OPENING_CURLY_BRACKET ) ;
    public final void rule__Coordenada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1599:1: ( ( RULE_OPENING_CURLY_BRACKET ) )
            // InternalToursdsl.g:1600:1: ( RULE_OPENING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:1600:1: ( RULE_OPENING_CURLY_BRACKET )
            // InternalToursdsl.g:1601:2: RULE_OPENING_CURLY_BRACKET
            {
             before(grammarAccess.getCoordenadaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_OPENING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getOPENING_CURLY_BRACKETTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Coordenada__Group__0__Impl"


    // $ANTLR start "rule__Coordenada__Group__1"
    // InternalToursdsl.g:1610:1: rule__Coordenada__Group__1 : rule__Coordenada__Group__1__Impl rule__Coordenada__Group__2 ;
    public final void rule__Coordenada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1614:1: ( rule__Coordenada__Group__1__Impl rule__Coordenada__Group__2 )
            // InternalToursdsl.g:1615:2: rule__Coordenada__Group__1__Impl rule__Coordenada__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Coordenada__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__2();

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
    // $ANTLR end "rule__Coordenada__Group__1"


    // $ANTLR start "rule__Coordenada__Group__1__Impl"
    // InternalToursdsl.g:1622:1: rule__Coordenada__Group__1__Impl : ( RULE_COORDINATE_X ) ;
    public final void rule__Coordenada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1626:1: ( ( RULE_COORDINATE_X ) )
            // InternalToursdsl.g:1627:1: ( RULE_COORDINATE_X )
            {
            // InternalToursdsl.g:1627:1: ( RULE_COORDINATE_X )
            // InternalToursdsl.g:1628:2: RULE_COORDINATE_X
            {
             before(grammarAccess.getCoordenadaAccess().getCOORDINATE_XTerminalRuleCall_1()); 
            match(input,RULE_COORDINATE_X,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOORDINATE_XTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Coordenada__Group__1__Impl"


    // $ANTLR start "rule__Coordenada__Group__2"
    // InternalToursdsl.g:1637:1: rule__Coordenada__Group__2 : rule__Coordenada__Group__2__Impl rule__Coordenada__Group__3 ;
    public final void rule__Coordenada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1641:1: ( rule__Coordenada__Group__2__Impl rule__Coordenada__Group__3 )
            // InternalToursdsl.g:1642:2: rule__Coordenada__Group__2__Impl rule__Coordenada__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__3();

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
    // $ANTLR end "rule__Coordenada__Group__2"


    // $ANTLR start "rule__Coordenada__Group__2__Impl"
    // InternalToursdsl.g:1649:1: rule__Coordenada__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__Coordenada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1653:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1654:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1654:1: ( RULE_COLON )
            // InternalToursdsl.g:1655:2: RULE_COLON
            {
             before(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Coordenada__Group__2__Impl"


    // $ANTLR start "rule__Coordenada__Group__3"
    // InternalToursdsl.g:1664:1: rule__Coordenada__Group__3 : rule__Coordenada__Group__3__Impl rule__Coordenada__Group__4 ;
    public final void rule__Coordenada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1668:1: ( rule__Coordenada__Group__3__Impl rule__Coordenada__Group__4 )
            // InternalToursdsl.g:1669:2: rule__Coordenada__Group__3__Impl rule__Coordenada__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__4();

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
    // $ANTLR end "rule__Coordenada__Group__3"


    // $ANTLR start "rule__Coordenada__Group__3__Impl"
    // InternalToursdsl.g:1676:1: rule__Coordenada__Group__3__Impl : ( ( rule__Coordenada__XAssignment_3 )? ) ;
    public final void rule__Coordenada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1680:1: ( ( ( rule__Coordenada__XAssignment_3 )? ) )
            // InternalToursdsl.g:1681:1: ( ( rule__Coordenada__XAssignment_3 )? )
            {
            // InternalToursdsl.g:1681:1: ( ( rule__Coordenada__XAssignment_3 )? )
            // InternalToursdsl.g:1682:2: ( rule__Coordenada__XAssignment_3 )?
            {
             before(grammarAccess.getCoordenadaAccess().getXAssignment_3()); 
            // InternalToursdsl.g:1683:2: ( rule__Coordenada__XAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalToursdsl.g:1683:3: rule__Coordenada__XAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Coordenada__XAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordenadaAccess().getXAssignment_3()); 

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
    // $ANTLR end "rule__Coordenada__Group__3__Impl"


    // $ANTLR start "rule__Coordenada__Group__4"
    // InternalToursdsl.g:1691:1: rule__Coordenada__Group__4 : rule__Coordenada__Group__4__Impl rule__Coordenada__Group__5 ;
    public final void rule__Coordenada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1695:1: ( rule__Coordenada__Group__4__Impl rule__Coordenada__Group__5 )
            // InternalToursdsl.g:1696:2: rule__Coordenada__Group__4__Impl rule__Coordenada__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Coordenada__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__5();

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
    // $ANTLR end "rule__Coordenada__Group__4"


    // $ANTLR start "rule__Coordenada__Group__4__Impl"
    // InternalToursdsl.g:1703:1: rule__Coordenada__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1707:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:1708:1: ( RULE_INT )
            {
            // InternalToursdsl.g:1708:1: ( RULE_INT )
            // InternalToursdsl.g:1709:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Coordenada__Group__4__Impl"


    // $ANTLR start "rule__Coordenada__Group__5"
    // InternalToursdsl.g:1718:1: rule__Coordenada__Group__5 : rule__Coordenada__Group__5__Impl rule__Coordenada__Group__6 ;
    public final void rule__Coordenada__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1722:1: ( rule__Coordenada__Group__5__Impl rule__Coordenada__Group__6 )
            // InternalToursdsl.g:1723:2: rule__Coordenada__Group__5__Impl rule__Coordenada__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Coordenada__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__6();

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
    // $ANTLR end "rule__Coordenada__Group__5"


    // $ANTLR start "rule__Coordenada__Group__5__Impl"
    // InternalToursdsl.g:1730:1: rule__Coordenada__Group__5__Impl : ( RULE_DOT ) ;
    public final void rule__Coordenada__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1734:1: ( ( RULE_DOT ) )
            // InternalToursdsl.g:1735:1: ( RULE_DOT )
            {
            // InternalToursdsl.g:1735:1: ( RULE_DOT )
            // InternalToursdsl.g:1736:2: RULE_DOT
            {
             before(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_5()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Coordenada__Group__5__Impl"


    // $ANTLR start "rule__Coordenada__Group__6"
    // InternalToursdsl.g:1745:1: rule__Coordenada__Group__6 : rule__Coordenada__Group__6__Impl rule__Coordenada__Group__7 ;
    public final void rule__Coordenada__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1749:1: ( rule__Coordenada__Group__6__Impl rule__Coordenada__Group__7 )
            // InternalToursdsl.g:1750:2: rule__Coordenada__Group__6__Impl rule__Coordenada__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Coordenada__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__7();

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
    // $ANTLR end "rule__Coordenada__Group__6"


    // $ANTLR start "rule__Coordenada__Group__6__Impl"
    // InternalToursdsl.g:1757:1: rule__Coordenada__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1761:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:1762:1: ( RULE_INT )
            {
            // InternalToursdsl.g:1762:1: ( RULE_INT )
            // InternalToursdsl.g:1763:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_6()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Coordenada__Group__6__Impl"


    // $ANTLR start "rule__Coordenada__Group__7"
    // InternalToursdsl.g:1772:1: rule__Coordenada__Group__7 : rule__Coordenada__Group__7__Impl rule__Coordenada__Group__8 ;
    public final void rule__Coordenada__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1776:1: ( rule__Coordenada__Group__7__Impl rule__Coordenada__Group__8 )
            // InternalToursdsl.g:1777:2: rule__Coordenada__Group__7__Impl rule__Coordenada__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Coordenada__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__8();

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
    // $ANTLR end "rule__Coordenada__Group__7"


    // $ANTLR start "rule__Coordenada__Group__7__Impl"
    // InternalToursdsl.g:1784:1: rule__Coordenada__Group__7__Impl : ( RULE_COMMA ) ;
    public final void rule__Coordenada__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1788:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1789:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1789:1: ( RULE_COMMA )
            // InternalToursdsl.g:1790:2: RULE_COMMA
            {
             before(grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_7()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Coordenada__Group__7__Impl"


    // $ANTLR start "rule__Coordenada__Group__8"
    // InternalToursdsl.g:1799:1: rule__Coordenada__Group__8 : rule__Coordenada__Group__8__Impl rule__Coordenada__Group__9 ;
    public final void rule__Coordenada__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1803:1: ( rule__Coordenada__Group__8__Impl rule__Coordenada__Group__9 )
            // InternalToursdsl.g:1804:2: rule__Coordenada__Group__8__Impl rule__Coordenada__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Coordenada__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__9();

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
    // $ANTLR end "rule__Coordenada__Group__8"


    // $ANTLR start "rule__Coordenada__Group__8__Impl"
    // InternalToursdsl.g:1811:1: rule__Coordenada__Group__8__Impl : ( RULE_COORDINATE_Y ) ;
    public final void rule__Coordenada__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1815:1: ( ( RULE_COORDINATE_Y ) )
            // InternalToursdsl.g:1816:1: ( RULE_COORDINATE_Y )
            {
            // InternalToursdsl.g:1816:1: ( RULE_COORDINATE_Y )
            // InternalToursdsl.g:1817:2: RULE_COORDINATE_Y
            {
             before(grammarAccess.getCoordenadaAccess().getCOORDINATE_YTerminalRuleCall_8()); 
            match(input,RULE_COORDINATE_Y,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOORDINATE_YTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__Coordenada__Group__8__Impl"


    // $ANTLR start "rule__Coordenada__Group__9"
    // InternalToursdsl.g:1826:1: rule__Coordenada__Group__9 : rule__Coordenada__Group__9__Impl rule__Coordenada__Group__10 ;
    public final void rule__Coordenada__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1830:1: ( rule__Coordenada__Group__9__Impl rule__Coordenada__Group__10 )
            // InternalToursdsl.g:1831:2: rule__Coordenada__Group__9__Impl rule__Coordenada__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__10();

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
    // $ANTLR end "rule__Coordenada__Group__9"


    // $ANTLR start "rule__Coordenada__Group__9__Impl"
    // InternalToursdsl.g:1838:1: rule__Coordenada__Group__9__Impl : ( RULE_COLON ) ;
    public final void rule__Coordenada__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1842:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:1843:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:1843:1: ( RULE_COLON )
            // InternalToursdsl.g:1844:2: RULE_COLON
            {
             before(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_9()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Coordenada__Group__9__Impl"


    // $ANTLR start "rule__Coordenada__Group__10"
    // InternalToursdsl.g:1853:1: rule__Coordenada__Group__10 : rule__Coordenada__Group__10__Impl rule__Coordenada__Group__11 ;
    public final void rule__Coordenada__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1857:1: ( rule__Coordenada__Group__10__Impl rule__Coordenada__Group__11 )
            // InternalToursdsl.g:1858:2: rule__Coordenada__Group__10__Impl rule__Coordenada__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__11();

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
    // $ANTLR end "rule__Coordenada__Group__10"


    // $ANTLR start "rule__Coordenada__Group__10__Impl"
    // InternalToursdsl.g:1865:1: rule__Coordenada__Group__10__Impl : ( ( rule__Coordenada__YAssignment_10 )? ) ;
    public final void rule__Coordenada__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1869:1: ( ( ( rule__Coordenada__YAssignment_10 )? ) )
            // InternalToursdsl.g:1870:1: ( ( rule__Coordenada__YAssignment_10 )? )
            {
            // InternalToursdsl.g:1870:1: ( ( rule__Coordenada__YAssignment_10 )? )
            // InternalToursdsl.g:1871:2: ( rule__Coordenada__YAssignment_10 )?
            {
             before(grammarAccess.getCoordenadaAccess().getYAssignment_10()); 
            // InternalToursdsl.g:1872:2: ( rule__Coordenada__YAssignment_10 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalToursdsl.g:1872:3: rule__Coordenada__YAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Coordenada__YAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordenadaAccess().getYAssignment_10()); 

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
    // $ANTLR end "rule__Coordenada__Group__10__Impl"


    // $ANTLR start "rule__Coordenada__Group__11"
    // InternalToursdsl.g:1880:1: rule__Coordenada__Group__11 : rule__Coordenada__Group__11__Impl rule__Coordenada__Group__12 ;
    public final void rule__Coordenada__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1884:1: ( rule__Coordenada__Group__11__Impl rule__Coordenada__Group__12 )
            // InternalToursdsl.g:1885:2: rule__Coordenada__Group__11__Impl rule__Coordenada__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Coordenada__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__12();

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
    // $ANTLR end "rule__Coordenada__Group__11"


    // $ANTLR start "rule__Coordenada__Group__11__Impl"
    // InternalToursdsl.g:1892:1: rule__Coordenada__Group__11__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1896:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:1897:1: ( RULE_INT )
            {
            // InternalToursdsl.g:1897:1: ( RULE_INT )
            // InternalToursdsl.g:1898:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_11()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Coordenada__Group__11__Impl"


    // $ANTLR start "rule__Coordenada__Group__12"
    // InternalToursdsl.g:1907:1: rule__Coordenada__Group__12 : rule__Coordenada__Group__12__Impl rule__Coordenada__Group__13 ;
    public final void rule__Coordenada__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1911:1: ( rule__Coordenada__Group__12__Impl rule__Coordenada__Group__13 )
            // InternalToursdsl.g:1912:2: rule__Coordenada__Group__12__Impl rule__Coordenada__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__Coordenada__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__13();

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
    // $ANTLR end "rule__Coordenada__Group__12"


    // $ANTLR start "rule__Coordenada__Group__12__Impl"
    // InternalToursdsl.g:1919:1: rule__Coordenada__Group__12__Impl : ( RULE_DOT ) ;
    public final void rule__Coordenada__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1923:1: ( ( RULE_DOT ) )
            // InternalToursdsl.g:1924:1: ( RULE_DOT )
            {
            // InternalToursdsl.g:1924:1: ( RULE_DOT )
            // InternalToursdsl.g:1925:2: RULE_DOT
            {
             before(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_12()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_12()); 

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
    // $ANTLR end "rule__Coordenada__Group__12__Impl"


    // $ANTLR start "rule__Coordenada__Group__13"
    // InternalToursdsl.g:1934:1: rule__Coordenada__Group__13 : rule__Coordenada__Group__13__Impl rule__Coordenada__Group__14 ;
    public final void rule__Coordenada__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1938:1: ( rule__Coordenada__Group__13__Impl rule__Coordenada__Group__14 )
            // InternalToursdsl.g:1939:2: rule__Coordenada__Group__13__Impl rule__Coordenada__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__Coordenada__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__14();

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
    // $ANTLR end "rule__Coordenada__Group__13"


    // $ANTLR start "rule__Coordenada__Group__13__Impl"
    // InternalToursdsl.g:1946:1: rule__Coordenada__Group__13__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1950:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:1951:1: ( RULE_INT )
            {
            // InternalToursdsl.g:1951:1: ( RULE_INT )
            // InternalToursdsl.g:1952:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_13()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_13()); 

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
    // $ANTLR end "rule__Coordenada__Group__13__Impl"


    // $ANTLR start "rule__Coordenada__Group__14"
    // InternalToursdsl.g:1961:1: rule__Coordenada__Group__14 : rule__Coordenada__Group__14__Impl rule__Coordenada__Group__15 ;
    public final void rule__Coordenada__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1965:1: ( rule__Coordenada__Group__14__Impl rule__Coordenada__Group__15 )
            // InternalToursdsl.g:1966:2: rule__Coordenada__Group__14__Impl rule__Coordenada__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__Coordenada__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__15();

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
    // $ANTLR end "rule__Coordenada__Group__14"


    // $ANTLR start "rule__Coordenada__Group__14__Impl"
    // InternalToursdsl.g:1973:1: rule__Coordenada__Group__14__Impl : ( RULE_COMMA ) ;
    public final void rule__Coordenada__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1977:1: ( ( RULE_COMMA ) )
            // InternalToursdsl.g:1978:1: ( RULE_COMMA )
            {
            // InternalToursdsl.g:1978:1: ( RULE_COMMA )
            // InternalToursdsl.g:1979:2: RULE_COMMA
            {
             before(grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_14()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOMMATerminalRuleCall_14()); 

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
    // $ANTLR end "rule__Coordenada__Group__14__Impl"


    // $ANTLR start "rule__Coordenada__Group__15"
    // InternalToursdsl.g:1988:1: rule__Coordenada__Group__15 : rule__Coordenada__Group__15__Impl rule__Coordenada__Group__16 ;
    public final void rule__Coordenada__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:1992:1: ( rule__Coordenada__Group__15__Impl rule__Coordenada__Group__16 )
            // InternalToursdsl.g:1993:2: rule__Coordenada__Group__15__Impl rule__Coordenada__Group__16
            {
            pushFollow(FOLLOW_4);
            rule__Coordenada__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__16();

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
    // $ANTLR end "rule__Coordenada__Group__15"


    // $ANTLR start "rule__Coordenada__Group__15__Impl"
    // InternalToursdsl.g:2000:1: rule__Coordenada__Group__15__Impl : ( RULE_COORDINATE_Z ) ;
    public final void rule__Coordenada__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2004:1: ( ( RULE_COORDINATE_Z ) )
            // InternalToursdsl.g:2005:1: ( RULE_COORDINATE_Z )
            {
            // InternalToursdsl.g:2005:1: ( RULE_COORDINATE_Z )
            // InternalToursdsl.g:2006:2: RULE_COORDINATE_Z
            {
             before(grammarAccess.getCoordenadaAccess().getCOORDINATE_ZTerminalRuleCall_15()); 
            match(input,RULE_COORDINATE_Z,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOORDINATE_ZTerminalRuleCall_15()); 

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
    // $ANTLR end "rule__Coordenada__Group__15__Impl"


    // $ANTLR start "rule__Coordenada__Group__16"
    // InternalToursdsl.g:2015:1: rule__Coordenada__Group__16 : rule__Coordenada__Group__16__Impl rule__Coordenada__Group__17 ;
    public final void rule__Coordenada__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2019:1: ( rule__Coordenada__Group__16__Impl rule__Coordenada__Group__17 )
            // InternalToursdsl.g:2020:2: rule__Coordenada__Group__16__Impl rule__Coordenada__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__17();

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
    // $ANTLR end "rule__Coordenada__Group__16"


    // $ANTLR start "rule__Coordenada__Group__16__Impl"
    // InternalToursdsl.g:2027:1: rule__Coordenada__Group__16__Impl : ( RULE_COLON ) ;
    public final void rule__Coordenada__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2031:1: ( ( RULE_COLON ) )
            // InternalToursdsl.g:2032:1: ( RULE_COLON )
            {
            // InternalToursdsl.g:2032:1: ( RULE_COLON )
            // InternalToursdsl.g:2033:2: RULE_COLON
            {
             before(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_16()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCOLONTerminalRuleCall_16()); 

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
    // $ANTLR end "rule__Coordenada__Group__16__Impl"


    // $ANTLR start "rule__Coordenada__Group__17"
    // InternalToursdsl.g:2042:1: rule__Coordenada__Group__17 : rule__Coordenada__Group__17__Impl rule__Coordenada__Group__18 ;
    public final void rule__Coordenada__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2046:1: ( rule__Coordenada__Group__17__Impl rule__Coordenada__Group__18 )
            // InternalToursdsl.g:2047:2: rule__Coordenada__Group__17__Impl rule__Coordenada__Group__18
            {
            pushFollow(FOLLOW_21);
            rule__Coordenada__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__18();

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
    // $ANTLR end "rule__Coordenada__Group__17"


    // $ANTLR start "rule__Coordenada__Group__17__Impl"
    // InternalToursdsl.g:2054:1: rule__Coordenada__Group__17__Impl : ( ( rule__Coordenada__ZAssignment_17 )? ) ;
    public final void rule__Coordenada__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2058:1: ( ( ( rule__Coordenada__ZAssignment_17 )? ) )
            // InternalToursdsl.g:2059:1: ( ( rule__Coordenada__ZAssignment_17 )? )
            {
            // InternalToursdsl.g:2059:1: ( ( rule__Coordenada__ZAssignment_17 )? )
            // InternalToursdsl.g:2060:2: ( rule__Coordenada__ZAssignment_17 )?
            {
             before(grammarAccess.getCoordenadaAccess().getZAssignment_17()); 
            // InternalToursdsl.g:2061:2: ( rule__Coordenada__ZAssignment_17 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalToursdsl.g:2061:3: rule__Coordenada__ZAssignment_17
                    {
                    pushFollow(FOLLOW_2);
                    rule__Coordenada__ZAssignment_17();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordenadaAccess().getZAssignment_17()); 

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
    // $ANTLR end "rule__Coordenada__Group__17__Impl"


    // $ANTLR start "rule__Coordenada__Group__18"
    // InternalToursdsl.g:2069:1: rule__Coordenada__Group__18 : rule__Coordenada__Group__18__Impl rule__Coordenada__Group__19 ;
    public final void rule__Coordenada__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2073:1: ( rule__Coordenada__Group__18__Impl rule__Coordenada__Group__19 )
            // InternalToursdsl.g:2074:2: rule__Coordenada__Group__18__Impl rule__Coordenada__Group__19
            {
            pushFollow(FOLLOW_22);
            rule__Coordenada__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__19();

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
    // $ANTLR end "rule__Coordenada__Group__18"


    // $ANTLR start "rule__Coordenada__Group__18__Impl"
    // InternalToursdsl.g:2081:1: rule__Coordenada__Group__18__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2085:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:2086:1: ( RULE_INT )
            {
            // InternalToursdsl.g:2086:1: ( RULE_INT )
            // InternalToursdsl.g:2087:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_18()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_18()); 

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
    // $ANTLR end "rule__Coordenada__Group__18__Impl"


    // $ANTLR start "rule__Coordenada__Group__19"
    // InternalToursdsl.g:2096:1: rule__Coordenada__Group__19 : rule__Coordenada__Group__19__Impl rule__Coordenada__Group__20 ;
    public final void rule__Coordenada__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2100:1: ( rule__Coordenada__Group__19__Impl rule__Coordenada__Group__20 )
            // InternalToursdsl.g:2101:2: rule__Coordenada__Group__19__Impl rule__Coordenada__Group__20
            {
            pushFollow(FOLLOW_23);
            rule__Coordenada__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__20();

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
    // $ANTLR end "rule__Coordenada__Group__19"


    // $ANTLR start "rule__Coordenada__Group__19__Impl"
    // InternalToursdsl.g:2108:1: rule__Coordenada__Group__19__Impl : ( RULE_DOT ) ;
    public final void rule__Coordenada__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2112:1: ( ( RULE_DOT ) )
            // InternalToursdsl.g:2113:1: ( RULE_DOT )
            {
            // InternalToursdsl.g:2113:1: ( RULE_DOT )
            // InternalToursdsl.g:2114:2: RULE_DOT
            {
             before(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_19()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getDOTTerminalRuleCall_19()); 

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
    // $ANTLR end "rule__Coordenada__Group__19__Impl"


    // $ANTLR start "rule__Coordenada__Group__20"
    // InternalToursdsl.g:2123:1: rule__Coordenada__Group__20 : rule__Coordenada__Group__20__Impl rule__Coordenada__Group__21 ;
    public final void rule__Coordenada__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2127:1: ( rule__Coordenada__Group__20__Impl rule__Coordenada__Group__21 )
            // InternalToursdsl.g:2128:2: rule__Coordenada__Group__20__Impl rule__Coordenada__Group__21
            {
            pushFollow(FOLLOW_12);
            rule__Coordenada__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__21();

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
    // $ANTLR end "rule__Coordenada__Group__20"


    // $ANTLR start "rule__Coordenada__Group__20__Impl"
    // InternalToursdsl.g:2135:1: rule__Coordenada__Group__20__Impl : ( RULE_INT ) ;
    public final void rule__Coordenada__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2139:1: ( ( RULE_INT ) )
            // InternalToursdsl.g:2140:1: ( RULE_INT )
            {
            // InternalToursdsl.g:2140:1: ( RULE_INT )
            // InternalToursdsl.g:2141:2: RULE_INT
            {
             before(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_20()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getINTTerminalRuleCall_20()); 

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
    // $ANTLR end "rule__Coordenada__Group__20__Impl"


    // $ANTLR start "rule__Coordenada__Group__21"
    // InternalToursdsl.g:2150:1: rule__Coordenada__Group__21 : rule__Coordenada__Group__21__Impl ;
    public final void rule__Coordenada__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2154:1: ( rule__Coordenada__Group__21__Impl )
            // InternalToursdsl.g:2155:2: rule__Coordenada__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordenada__Group__21__Impl();

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
    // $ANTLR end "rule__Coordenada__Group__21"


    // $ANTLR start "rule__Coordenada__Group__21__Impl"
    // InternalToursdsl.g:2161:1: rule__Coordenada__Group__21__Impl : ( RULE_CLOSING_CURLY_BRACKET ) ;
    public final void rule__Coordenada__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2165:1: ( ( RULE_CLOSING_CURLY_BRACKET ) )
            // InternalToursdsl.g:2166:1: ( RULE_CLOSING_CURLY_BRACKET )
            {
            // InternalToursdsl.g:2166:1: ( RULE_CLOSING_CURLY_BRACKET )
            // InternalToursdsl.g:2167:2: RULE_CLOSING_CURLY_BRACKET
            {
             before(grammarAccess.getCoordenadaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_21()); 
            match(input,RULE_CLOSING_CURLY_BRACKET,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getCLOSING_CURLY_BRACKETTerminalRuleCall_21()); 

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
    // $ANTLR end "rule__Coordenada__Group__21__Impl"


    // $ANTLR start "rule__Tour__NameAssignment_3"
    // InternalToursdsl.g:2177:1: rule__Tour__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Tour__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2181:1: ( ( RULE_STRING ) )
            // InternalToursdsl.g:2182:2: ( RULE_STRING )
            {
            // InternalToursdsl.g:2182:2: ( RULE_STRING )
            // InternalToursdsl.g:2183:3: RULE_STRING
            {
             before(grammarAccess.getTourAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getNameSTRINGTerminalRuleCall_3_0()); 

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


    // $ANTLR start "rule__Tour__PlacesAssignment_8"
    // InternalToursdsl.g:2192:1: rule__Tour__PlacesAssignment_8 : ( rulePanorama ) ;
    public final void rule__Tour__PlacesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2196:1: ( ( rulePanorama ) )
            // InternalToursdsl.g:2197:2: ( rulePanorama )
            {
            // InternalToursdsl.g:2197:2: ( rulePanorama )
            // InternalToursdsl.g:2198:3: rulePanorama
            {
             before(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Tour__PlacesAssignment_8"


    // $ANTLR start "rule__Tour__PlacesAssignment_9_1"
    // InternalToursdsl.g:2207:1: rule__Tour__PlacesAssignment_9_1 : ( rulePanorama ) ;
    public final void rule__Tour__PlacesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2211:1: ( ( rulePanorama ) )
            // InternalToursdsl.g:2212:2: ( rulePanorama )
            {
            // InternalToursdsl.g:2212:2: ( rulePanorama )
            // InternalToursdsl.g:2213:3: rulePanorama
            {
             before(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getTourAccess().getPlacesPanoramaParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Tour__PlacesAssignment_9_1"


    // $ANTLR start "rule__Panorama__NameAssignment_3"
    // InternalToursdsl.g:2222:1: rule__Panorama__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Panorama__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2226:1: ( ( RULE_STRING ) )
            // InternalToursdsl.g:2227:2: ( RULE_STRING )
            {
            // InternalToursdsl.g:2227:2: ( RULE_STRING )
            // InternalToursdsl.g:2228:3: RULE_STRING
            {
             before(grammarAccess.getPanoramaAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getNameSTRINGTerminalRuleCall_3_0()); 

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
    // InternalToursdsl.g:2237:1: rule__Panorama__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Panorama__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2241:1: ( ( RULE_STRING ) )
            // InternalToursdsl.g:2242:2: ( RULE_STRING )
            {
            // InternalToursdsl.g:2242:2: ( RULE_STRING )
            // InternalToursdsl.g:2243:3: RULE_STRING
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


    // $ANTLR start "rule__Panorama__PlacesAssignment_12"
    // InternalToursdsl.g:2252:1: rule__Panorama__PlacesAssignment_12 : ( ruleHotspot ) ;
    public final void rule__Panorama__PlacesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2256:1: ( ( ruleHotspot ) )
            // InternalToursdsl.g:2257:2: ( ruleHotspot )
            {
            // InternalToursdsl.g:2257:2: ( ruleHotspot )
            // InternalToursdsl.g:2258:3: ruleHotspot
            {
             before(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Panorama__PlacesAssignment_12"


    // $ANTLR start "rule__Panorama__PlacesAssignment_13_1"
    // InternalToursdsl.g:2267:1: rule__Panorama__PlacesAssignment_13_1 : ( ruleHotspot ) ;
    public final void rule__Panorama__PlacesAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2271:1: ( ( ruleHotspot ) )
            // InternalToursdsl.g:2272:2: ( ruleHotspot )
            {
            // InternalToursdsl.g:2272:2: ( ruleHotspot )
            // InternalToursdsl.g:2273:3: ruleHotspot
            {
             before(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getPlacesHotspotParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Panorama__PlacesAssignment_13_1"


    // $ANTLR start "rule__Hotspot__NameAssignment_3"
    // InternalToursdsl.g:2282:1: rule__Hotspot__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Hotspot__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2286:1: ( ( RULE_STRING ) )
            // InternalToursdsl.g:2287:2: ( RULE_STRING )
            {
            // InternalToursdsl.g:2287:2: ( RULE_STRING )
            // InternalToursdsl.g:2288:3: RULE_STRING
            {
             before(grammarAccess.getHotspotAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getNameSTRINGTerminalRuleCall_3_0()); 

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


    // $ANTLR start "rule__Hotspot__DestinoAssignment_7"
    // InternalToursdsl.g:2297:1: rule__Hotspot__DestinoAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Hotspot__DestinoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2301:1: ( ( ( RULE_ID ) ) )
            // InternalToursdsl.g:2302:2: ( ( RULE_ID ) )
            {
            // InternalToursdsl.g:2302:2: ( ( RULE_ID ) )
            // InternalToursdsl.g:2303:3: ( RULE_ID )
            {
             before(grammarAccess.getHotspotAccess().getDestinoPanoramaCrossReference_7_0()); 
            // InternalToursdsl.g:2304:3: ( RULE_ID )
            // InternalToursdsl.g:2305:4: RULE_ID
            {
             before(grammarAccess.getHotspotAccess().getDestinoPanoramaIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getDestinoPanoramaIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getHotspotAccess().getDestinoPanoramaCrossReference_7_0()); 

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
    // $ANTLR end "rule__Hotspot__DestinoAssignment_7"


    // $ANTLR start "rule__Hotspot__OrigenAssignment_11"
    // InternalToursdsl.g:2316:1: rule__Hotspot__OrigenAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Hotspot__OrigenAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2320:1: ( ( ( RULE_ID ) ) )
            // InternalToursdsl.g:2321:2: ( ( RULE_ID ) )
            {
            // InternalToursdsl.g:2321:2: ( ( RULE_ID ) )
            // InternalToursdsl.g:2322:3: ( RULE_ID )
            {
             before(grammarAccess.getHotspotAccess().getOrigenPanoramaCrossReference_11_0()); 
            // InternalToursdsl.g:2323:3: ( RULE_ID )
            // InternalToursdsl.g:2324:4: RULE_ID
            {
             before(grammarAccess.getHotspotAccess().getOrigenPanoramaIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getOrigenPanoramaIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getHotspotAccess().getOrigenPanoramaCrossReference_11_0()); 

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
    // $ANTLR end "rule__Hotspot__OrigenAssignment_11"


    // $ANTLR start "rule__Hotspot__PosicionAssignment_15"
    // InternalToursdsl.g:2335:1: rule__Hotspot__PosicionAssignment_15 : ( ruleCoordenada ) ;
    public final void rule__Hotspot__PosicionAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2339:1: ( ( ruleCoordenada ) )
            // InternalToursdsl.g:2340:2: ( ruleCoordenada )
            {
            // InternalToursdsl.g:2340:2: ( ruleCoordenada )
            // InternalToursdsl.g:2341:3: ruleCoordenada
            {
             before(grammarAccess.getHotspotAccess().getPosicionCoordenadaParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordenada();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getPosicionCoordenadaParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Hotspot__PosicionAssignment_15"


    // $ANTLR start "rule__Hotspot__RotacionAssignment_19"
    // InternalToursdsl.g:2350:1: rule__Hotspot__RotacionAssignment_19 : ( ruleCoordenada ) ;
    public final void rule__Hotspot__RotacionAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2354:1: ( ( ruleCoordenada ) )
            // InternalToursdsl.g:2355:2: ( ruleCoordenada )
            {
            // InternalToursdsl.g:2355:2: ( ruleCoordenada )
            // InternalToursdsl.g:2356:3: ruleCoordenada
            {
             before(grammarAccess.getHotspotAccess().getRotacionCoordenadaParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordenada();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getRotacionCoordenadaParserRuleCall_19_0()); 

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
    // $ANTLR end "rule__Hotspot__RotacionAssignment_19"


    // $ANTLR start "rule__Coordenada__XAssignment_3"
    // InternalToursdsl.g:2365:1: rule__Coordenada__XAssignment_3 : ( ( '-' ) ) ;
    public final void rule__Coordenada__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2369:1: ( ( ( '-' ) ) )
            // InternalToursdsl.g:2370:2: ( ( '-' ) )
            {
            // InternalToursdsl.g:2370:2: ( ( '-' ) )
            // InternalToursdsl.g:2371:3: ( '-' )
            {
             before(grammarAccess.getCoordenadaAccess().getXHyphenMinusKeyword_3_0()); 
            // InternalToursdsl.g:2372:3: ( '-' )
            // InternalToursdsl.g:2373:4: '-'
            {
             before(grammarAccess.getCoordenadaAccess().getXHyphenMinusKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getXHyphenMinusKeyword_3_0()); 

            }

             after(grammarAccess.getCoordenadaAccess().getXHyphenMinusKeyword_3_0()); 

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
    // $ANTLR end "rule__Coordenada__XAssignment_3"


    // $ANTLR start "rule__Coordenada__YAssignment_10"
    // InternalToursdsl.g:2384:1: rule__Coordenada__YAssignment_10 : ( ( '-' ) ) ;
    public final void rule__Coordenada__YAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2388:1: ( ( ( '-' ) ) )
            // InternalToursdsl.g:2389:2: ( ( '-' ) )
            {
            // InternalToursdsl.g:2389:2: ( ( '-' ) )
            // InternalToursdsl.g:2390:3: ( '-' )
            {
             before(grammarAccess.getCoordenadaAccess().getYHyphenMinusKeyword_10_0()); 
            // InternalToursdsl.g:2391:3: ( '-' )
            // InternalToursdsl.g:2392:4: '-'
            {
             before(grammarAccess.getCoordenadaAccess().getYHyphenMinusKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getYHyphenMinusKeyword_10_0()); 

            }

             after(grammarAccess.getCoordenadaAccess().getYHyphenMinusKeyword_10_0()); 

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
    // $ANTLR end "rule__Coordenada__YAssignment_10"


    // $ANTLR start "rule__Coordenada__ZAssignment_17"
    // InternalToursdsl.g:2403:1: rule__Coordenada__ZAssignment_17 : ( ( '-' ) ) ;
    public final void rule__Coordenada__ZAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToursdsl.g:2407:1: ( ( ( '-' ) ) )
            // InternalToursdsl.g:2408:2: ( ( '-' ) )
            {
            // InternalToursdsl.g:2408:2: ( ( '-' ) )
            // InternalToursdsl.g:2409:3: ( '-' )
            {
             before(grammarAccess.getCoordenadaAccess().getZHyphenMinusKeyword_17_0()); 
            // InternalToursdsl.g:2410:3: ( '-' )
            // InternalToursdsl.g:2411:4: '-'
            {
             before(grammarAccess.getCoordenadaAccess().getZHyphenMinusKeyword_17_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCoordenadaAccess().getZHyphenMinusKeyword_17_0()); 

            }

             after(grammarAccess.getCoordenadaAccess().getZHyphenMinusKeyword_17_0()); 

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
    // $ANTLR end "rule__Coordenada__ZAssignment_17"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});

}