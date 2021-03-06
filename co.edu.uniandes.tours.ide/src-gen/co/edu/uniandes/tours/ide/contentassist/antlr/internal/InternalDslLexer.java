package co.edu.uniandes.tours.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
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

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDsl.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:11:7: ( 'E' )
            // InternalDsl.g:11:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:12:7: ( 'e' )
            // InternalDsl.g:12:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:13:7: ( 'position' )
            // InternalDsl.g:13:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:14:7: ( 'rotation' )
            // InternalDsl.g:14:9: 'rotation'
            {
            match("rotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:15:7: ( '-' )
            // InternalDsl.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_OPENING_CURLY_BRACKET"
    public final void mRULE_OPENING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPENING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2769:28: ( '{' )
            // InternalDsl.g:2769:30: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENING_CURLY_BRACKET"

    // $ANTLR start "RULE_CLOSING_CURLY_BRACKET"
    public final void mRULE_CLOSING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_CLOSING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2771:28: ( '}' )
            // InternalDsl.g:2771:30: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSING_CURLY_BRACKET"

    // $ANTLR start "RULE_OPENING_SQUARE_BRACKET"
    public final void mRULE_OPENING_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPENING_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2773:29: ( '[' )
            // InternalDsl.g:2773:31: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENING_SQUARE_BRACKET"

    // $ANTLR start "RULE_CLOSING_SQUARE_BRACKET"
    public final void mRULE_CLOSING_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_CLOSING_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2775:29: ( ']' )
            // InternalDsl.g:2775:31: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSING_SQUARE_BRACKET"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2777:12: ( ':' )
            // InternalDsl.g:2777:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_QUOTE"
    public final void mRULE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2779:12: ( '\\'' )
            // InternalDsl.g:2779:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTE"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2781:12: ( ',' )
            // InternalDsl.g:2781:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2783:10: ( '.' )
            // InternalDsl.g:2783:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2785:11: ( 'name' )
            // InternalDsl.g:2785:13: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2787:9: ( 'to' )
            // InternalDsl.g:2787:11: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO"

    // $ANTLR start "RULE_PLACES"
    public final void mRULE_PLACES() throws RecognitionException {
        try {
            int _type = RULE_PLACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2789:13: ( 'places' )
            // InternalDsl.g:2789:15: 'places'
            {
            match("places"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLACES"

    // $ANTLR start "RULE_DESCRIPTION"
    public final void mRULE_DESCRIPTION() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2791:18: ( 'description' )
            // InternalDsl.g:2791:20: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION"

    // $ANTLR start "RULE_PATHS"
    public final void mRULE_PATHS() throws RecognitionException {
        try {
            int _type = RULE_PATHS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2793:12: ( 'paths' )
            // InternalDsl.g:2793:14: 'paths'
            {
            match("paths"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATHS"

    // $ANTLR start "RULE_COORDINATE_X"
    public final void mRULE_COORDINATE_X() throws RecognitionException {
        try {
            int _type = RULE_COORDINATE_X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2795:19: ( 'posx' )
            // InternalDsl.g:2795:21: 'posx'
            {
            match("posx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COORDINATE_X"

    // $ANTLR start "RULE_COORDINATE_Y"
    public final void mRULE_COORDINATE_Y() throws RecognitionException {
        try {
            int _type = RULE_COORDINATE_Y;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2797:19: ( 'posy' )
            // InternalDsl.g:2797:21: 'posy'
            {
            match("posy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COORDINATE_Y"

    // $ANTLR start "RULE_COORDINATE_Z"
    public final void mRULE_COORDINATE_Z() throws RecognitionException {
        try {
            int _type = RULE_COORDINATE_Z;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2799:19: ( 'posz' )
            // InternalDsl.g:2799:21: 'posz'
            {
            match("posz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COORDINATE_Z"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2801:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDsl.g:2801:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDsl.g:2801:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:2801:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:2801:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2803:10: ( ( '0' .. '9' )+ )
            // InternalDsl.g:2803:12: ( '0' .. '9' )+
            {
            // InternalDsl.g:2803:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:2803:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2805:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDsl.g:2805:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDsl.g:2805:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:2805:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDsl.g:2805:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDsl.g:2805:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:2805:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2805:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDsl.g:2805:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:2805:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:2805:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2807:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDsl.g:2807:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDsl.g:2807:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:2807:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2809:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:2809:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDsl.g:2809:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:2809:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDsl.g:2809:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:2809:41: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:2809:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl.g:2809:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2811:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDsl.g:2811:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDsl.g:2811:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:2813:16: ( . )
            // InternalDsl.g:2813:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDsl.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_TO | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalDsl.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:40: RULE_OPENING_CURLY_BRACKET
                {
                mRULE_OPENING_CURLY_BRACKET(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:67: RULE_CLOSING_CURLY_BRACKET
                {
                mRULE_CLOSING_CURLY_BRACKET(); 

                }
                break;
            case 8 :
                // InternalDsl.g:1:94: RULE_OPENING_SQUARE_BRACKET
                {
                mRULE_OPENING_SQUARE_BRACKET(); 

                }
                break;
            case 9 :
                // InternalDsl.g:1:122: RULE_CLOSING_SQUARE_BRACKET
                {
                mRULE_CLOSING_SQUARE_BRACKET(); 

                }
                break;
            case 10 :
                // InternalDsl.g:1:150: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 11 :
                // InternalDsl.g:1:161: RULE_QUOTE
                {
                mRULE_QUOTE(); 

                }
                break;
            case 12 :
                // InternalDsl.g:1:172: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 13 :
                // InternalDsl.g:1:183: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 14 :
                // InternalDsl.g:1:192: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 15 :
                // InternalDsl.g:1:202: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 16 :
                // InternalDsl.g:1:210: RULE_PLACES
                {
                mRULE_PLACES(); 

                }
                break;
            case 17 :
                // InternalDsl.g:1:222: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 18 :
                // InternalDsl.g:1:239: RULE_PATHS
                {
                mRULE_PATHS(); 

                }
                break;
            case 19 :
                // InternalDsl.g:1:250: RULE_COORDINATE_X
                {
                mRULE_COORDINATE_X(); 

                }
                break;
            case 20 :
                // InternalDsl.g:1:268: RULE_COORDINATE_Y
                {
                mRULE_COORDINATE_Y(); 

                }
                break;
            case 21 :
                // InternalDsl.g:1:286: RULE_COORDINATE_Z
                {
                mRULE_COORDINATE_Z(); 

                }
                break;
            case 22 :
                // InternalDsl.g:1:304: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalDsl.g:1:312: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalDsl.g:1:321: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalDsl.g:1:333: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalDsl.g:1:349: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalDsl.g:1:365: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalDsl.g:1:373: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\30\1\32\2\31\6\uffff\1\45\2\uffff\3\31\1\27\2\uffff\2\27\5\uffff\4\31\12\uffff\1\31\1\65\1\31\4\uffff\5\31\1\uffff\2\31\1\101\1\102\1\103\3\31\1\107\2\31\3\uffff\1\31\1\113\1\31\1\uffff\2\31\1\117\1\uffff\3\31\1\uffff\2\31\1\125\1\126\1\31\2\uffff\2\31\1\132\1\uffff";
    static final String DFA12_eofS =
        "\133\uffff";
    static final String DFA12_minS =
        "\1\0\2\60\1\141\1\157\6\uffff\1\0\2\uffff\1\141\1\157\1\145\1\101\2\uffff\1\0\1\52\5\uffff\1\163\1\141\2\164\12\uffff\1\155\1\60\1\163\4\uffff\1\151\1\143\1\150\1\141\1\145\1\uffff\1\143\1\164\3\60\1\145\1\163\1\164\1\60\1\162\1\151\3\uffff\1\163\1\60\1\151\1\uffff\1\151\1\157\1\60\1\uffff\1\157\1\160\1\156\1\uffff\1\156\1\164\2\60\1\151\2\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\172\2\157\6\uffff\1\uffff\2\uffff\1\141\1\157\1\145\1\172\2\uffff\1\uffff\1\57\5\uffff\1\163\1\141\2\164\12\uffff\1\155\1\172\1\163\4\uffff\1\172\1\143\1\150\1\141\1\145\1\uffff\1\143\1\164\3\172\1\145\1\163\1\164\1\172\1\162\1\151\3\uffff\1\163\1\172\1\151\1\uffff\1\151\1\157\1\172\1\uffff\1\157\1\160\1\156\1\uffff\1\156\1\164\2\172\1\151\2\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15\4\uffff\1\26\1\27\2\uffff\1\33\1\34\1\1\1\26\1\2\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\30\1\14\1\15\3\uffff\1\27\1\31\1\32\1\33\5\uffff\1\17\13\uffff\1\23\1\24\1\25\3\uffff\1\16\3\uffff\1\22\3\uffff\1\20\5\uffff\1\3\1\4\3\uffff\1\21";
    static final String DFA12_specialS =
        "\1\2\12\uffff\1\1\10\uffff\1\0\106\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\24\4\27\1\13\4\27\1\14\1\5\1\15\1\25\12\23\1\12\6\27\4\22\1\1\25\22\1\10\1\27\1\11\1\21\1\22\1\27\3\22\1\20\1\2\10\22\1\16\1\22\1\3\1\22\1\4\1\22\1\17\6\22\1\6\1\27\1\7\uff82\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\35\12\uffff\1\34\2\uffff\1\33",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\46",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\46",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\67\16\uffff\1\70\1\71\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_TO | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 38;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 38;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='r') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0=='{') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='[') ) {s = 8;}

                        else if ( (LA12_0==']') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0==',') ) {s = 12;}

                        else if ( (LA12_0=='.') ) {s = 13;}

                        else if ( (LA12_0=='n') ) {s = 14;}

                        else if ( (LA12_0=='t') ) {s = 15;}

                        else if ( (LA12_0=='d') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='f' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\"') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}