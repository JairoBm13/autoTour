package co.edu.uniandes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToursdslLexer extends Lexer {
    public static final int RULE_PATHS=14;
    public static final int RULE_TO=15;
    public static final int RULE_NAME=5;
    public static final int RULE_PLACES=9;
    public static final int RULE_STRING=24;
    public static final int RULE_CLOSING_CURLY_BRACKET=12;
    public static final int RULE_POSITION=17;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_OPENING_CURLY_BRACKET=4;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int RULE_COORDINATE_Y=21;
    public static final int RULE_COORDINATE_X=18;
    public static final int RULE_COORDINATE_Z=22;
    public static final int RULE_ID=23;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=27;
    public static final int RULE_DESCRIPTION=13;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_FROM=16;
    public static final int RULE_INT=20;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_QUOTE=7;
    public static final int RULE_OPENING_SQUARE_BRACKET=10;
    public static final int RULE_CLOSING_SQUARE_BRACKET=11;

    // delegates
    // delegators

    public InternalToursdslLexer() {;} 
    public InternalToursdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalToursdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalToursdsl.g"; }

    // $ANTLR start "RULE_OPENING_CURLY_BRACKET"
    public final void mRULE_OPENING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPENING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:2626:28: ( '{' )
            // InternalToursdsl.g:2626:30: '{'
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
            // InternalToursdsl.g:2628:28: ( '}' )
            // InternalToursdsl.g:2628:30: '}'
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
            // InternalToursdsl.g:2630:29: ( '[' )
            // InternalToursdsl.g:2630:31: '['
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
            // InternalToursdsl.g:2632:29: ( ']' )
            // InternalToursdsl.g:2632:31: ']'
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
            // InternalToursdsl.g:2634:12: ( ':' )
            // InternalToursdsl.g:2634:14: ':'
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
            // InternalToursdsl.g:2636:12: ( '\"' )
            // InternalToursdsl.g:2636:14: '\"'
            {
            match('\"'); 

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
            // InternalToursdsl.g:2638:12: ( ',' )
            // InternalToursdsl.g:2638:14: ','
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
            // InternalToursdsl.g:2640:10: ( '.' )
            // InternalToursdsl.g:2640:12: '.'
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
            // InternalToursdsl.g:2642:11: ( 'name' )
            // InternalToursdsl.g:2642:13: 'name'
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

    // $ANTLR start "RULE_FROM"
    public final void mRULE_FROM() throws RecognitionException {
        try {
            int _type = RULE_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:2644:11: ( 'from' )
            // InternalToursdsl.g:2644:13: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FROM"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:2646:9: ( 'to' )
            // InternalToursdsl.g:2646:11: 'to'
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

    // $ANTLR start "RULE_POSITION"
    public final void mRULE_POSITION() throws RecognitionException {
        try {
            int _type = RULE_POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:2648:15: ( 'position' )
            // InternalToursdsl.g:2648:17: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSITION"

    // $ANTLR start "RULE_PLACES"
    public final void mRULE_PLACES() throws RecognitionException {
        try {
            int _type = RULE_PLACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:2650:13: ( 'places' )
            // InternalToursdsl.g:2650:15: 'places'
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
            // InternalToursdsl.g:2652:18: ( 'description' )
            // InternalToursdsl.g:2652:20: 'description'
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
            // InternalToursdsl.g:2654:12: ( 'paths' )
            // InternalToursdsl.g:2654:14: 'paths'
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
            // InternalToursdsl.g:2656:19: ( 'x' )
            // InternalToursdsl.g:2656:21: 'x'
            {
            match('x'); 

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
            // InternalToursdsl.g:2658:19: ( 'y' )
            // InternalToursdsl.g:2658:21: 'y'
            {
            match('y'); 

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
            // InternalToursdsl.g:2660:19: ( 'z' )
            // InternalToursdsl.g:2660:21: 'z'
            {
            match('z'); 

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
            // InternalToursdsl.g:2662:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToursdsl.g:2662:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToursdsl.g:2662:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToursdsl.g:2662:11: '^'
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

            // InternalToursdsl.g:2662:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToursdsl.g:
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
            // InternalToursdsl.g:2664:10: ( ( '0' .. '9' )+ )
            // InternalToursdsl.g:2664:12: ( '0' .. '9' )+
            {
            // InternalToursdsl.g:2664:12: ( '0' .. '9' )+
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
            	    // InternalToursdsl.g:2664:13: '0' .. '9'
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
            // InternalToursdsl.g:2666:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToursdsl.g:2666:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToursdsl.g:2666:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalToursdsl.g:2666:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToursdsl.g:2666:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalToursdsl.g:2666:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToursdsl.g:2666:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalToursdsl.g:2666:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToursdsl.g:2666:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalToursdsl.g:2666:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToursdsl.g:2666:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalToursdsl.g:2668:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToursdsl.g:2668:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToursdsl.g:2668:24: ( options {greedy=false; } : . )*
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
            	    // InternalToursdsl.g:2668:52: .
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
            // InternalToursdsl.g:2670:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToursdsl.g:2670:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToursdsl.g:2670:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToursdsl.g:2670:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalToursdsl.g:2670:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToursdsl.g:2670:41: ( '\\r' )? '\\n'
                    {
                    // InternalToursdsl.g:2670:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToursdsl.g:2670:41: '\\r'
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
            // InternalToursdsl.g:2672:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToursdsl.g:2672:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToursdsl.g:2672:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalToursdsl.g:
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
            // InternalToursdsl.g:2674:16: ( . )
            // InternalToursdsl.g:2674:18: .
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
        // InternalToursdsl.g:1:8: ( RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_FROM | RULE_TO | RULE_POSITION | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=25;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalToursdsl.g:1:10: RULE_OPENING_CURLY_BRACKET
                {
                mRULE_OPENING_CURLY_BRACKET(); 

                }
                break;
            case 2 :
                // InternalToursdsl.g:1:37: RULE_CLOSING_CURLY_BRACKET
                {
                mRULE_CLOSING_CURLY_BRACKET(); 

                }
                break;
            case 3 :
                // InternalToursdsl.g:1:64: RULE_OPENING_SQUARE_BRACKET
                {
                mRULE_OPENING_SQUARE_BRACKET(); 

                }
                break;
            case 4 :
                // InternalToursdsl.g:1:92: RULE_CLOSING_SQUARE_BRACKET
                {
                mRULE_CLOSING_SQUARE_BRACKET(); 

                }
                break;
            case 5 :
                // InternalToursdsl.g:1:120: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 6 :
                // InternalToursdsl.g:1:131: RULE_QUOTE
                {
                mRULE_QUOTE(); 

                }
                break;
            case 7 :
                // InternalToursdsl.g:1:142: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 8 :
                // InternalToursdsl.g:1:153: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 9 :
                // InternalToursdsl.g:1:162: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 10 :
                // InternalToursdsl.g:1:172: RULE_FROM
                {
                mRULE_FROM(); 

                }
                break;
            case 11 :
                // InternalToursdsl.g:1:182: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 12 :
                // InternalToursdsl.g:1:190: RULE_POSITION
                {
                mRULE_POSITION(); 

                }
                break;
            case 13 :
                // InternalToursdsl.g:1:204: RULE_PLACES
                {
                mRULE_PLACES(); 

                }
                break;
            case 14 :
                // InternalToursdsl.g:1:216: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 15 :
                // InternalToursdsl.g:1:233: RULE_PATHS
                {
                mRULE_PATHS(); 

                }
                break;
            case 16 :
                // InternalToursdsl.g:1:244: RULE_COORDINATE_X
                {
                mRULE_COORDINATE_X(); 

                }
                break;
            case 17 :
                // InternalToursdsl.g:1:262: RULE_COORDINATE_Y
                {
                mRULE_COORDINATE_Y(); 

                }
                break;
            case 18 :
                // InternalToursdsl.g:1:280: RULE_COORDINATE_Z
                {
                mRULE_COORDINATE_Z(); 

                }
                break;
            case 19 :
                // InternalToursdsl.g:1:298: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalToursdsl.g:1:306: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalToursdsl.g:1:315: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalToursdsl.g:1:327: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalToursdsl.g:1:343: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalToursdsl.g:1:359: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalToursdsl.g:1:367: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\6\uffff\1\36\2\uffff\5\42\1\51\1\52\1\53\1\27\2\uffff\2\27\13\uffff\1\42\1\uffff\1\42\1\62\4\42\7\uffff\2\42\1\uffff\4\42\1\75\1\76\4\42\2\uffff\2\42\1\105\2\42\1\110\1\uffff\2\42\1\uffff\1\42\1\114\1\42\1\uffff\2\42\1\120\1\uffff";
    static final String DFA12_eofS =
        "\121\uffff";
    static final String DFA12_minS =
        "\1\0\5\uffff\1\0\2\uffff\1\141\1\162\1\157\1\141\1\145\3\60\1\101\2\uffff\1\0\1\52\13\uffff\1\155\1\uffff\1\157\1\60\1\163\1\141\1\164\1\163\7\uffff\1\145\1\155\1\uffff\1\151\1\143\1\150\1\143\2\60\1\164\1\145\1\163\1\162\2\uffff\1\151\1\163\1\60\1\151\1\157\1\60\1\uffff\1\160\1\156\1\uffff\1\164\1\60\1\151\1\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\5\uffff\1\uffff\2\uffff\1\141\1\162\2\157\1\145\4\172\2\uffff\1\uffff\1\57\13\uffff\1\155\1\uffff\1\157\1\172\1\163\1\141\1\164\1\163\7\uffff\1\145\1\155\1\uffff\1\151\1\143\1\150\1\143\2\172\1\164\1\145\1\163\1\162\2\uffff\1\151\1\163\1\172\1\151\1\157\1\172\1\uffff\1\160\1\156\1\uffff\1\164\1\172\1\151\1\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\11\uffff\1\23\1\24\2\uffff\1\30\1\31\1\1\1\2\1\3\1\4\1\5\1\25\1\6\1\7\1\10\1\uffff\1\23\6\uffff\1\20\1\21\1\22\1\24\1\26\1\27\1\30\2\uffff\1\13\12\uffff\1\11\1\12\6\uffff\1\17\2\uffff\1\15\3\uffff\1\14\3\uffff\1\16";
    static final String DFA12_specialS =
        "\1\2\5\uffff\1\1\15\uffff\1\0\74\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\6\4\27\1\24\4\27\1\7\1\27\1\10\1\25\12\23\1\5\6\27\32\22\1\3\1\27\1\4\1\21\1\22\1\27\3\22\1\15\1\22\1\12\7\22\1\11\1\22\1\14\3\22\1\13\3\22\1\16\1\17\1\20\1\1\1\27\1\2\uff82\27",
            "",
            "",
            "",
            "",
            "",
            "\0\35",
            "",
            "",
            "\1\41",
            "\1\43",
            "\1\44",
            "\1\47\12\uffff\1\46\2\uffff\1\45",
            "\1\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\35",
            "\1\55\4\uffff\1\56",
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
            "",
            "\1\60",
            "",
            "\1\61",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\106",
            "\1\107",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
            return "1:1: Tokens : ( RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_FROM | RULE_TO | RULE_POSITION | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 29;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_6 = input.LA(1);

                        s = -1;
                        if ( ((LA12_6>='\u0000' && LA12_6<='\uFFFF')) ) {s = 29;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='{') ) {s = 1;}

                        else if ( (LA12_0=='}') ) {s = 2;}

                        else if ( (LA12_0=='[') ) {s = 3;}

                        else if ( (LA12_0==']') ) {s = 4;}

                        else if ( (LA12_0==':') ) {s = 5;}

                        else if ( (LA12_0=='\"') ) {s = 6;}

                        else if ( (LA12_0==',') ) {s = 7;}

                        else if ( (LA12_0=='.') ) {s = 8;}

                        else if ( (LA12_0=='n') ) {s = 9;}

                        else if ( (LA12_0=='f') ) {s = 10;}

                        else if ( (LA12_0=='t') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='d') ) {s = 13;}

                        else if ( (LA12_0=='x') ) {s = 14;}

                        else if ( (LA12_0=='y') ) {s = 15;}

                        else if ( (LA12_0=='z') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='m')||LA12_0=='o'||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='w')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

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