package co.edu.uniandes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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

    public InternalToursdslLexer() {;} 
    public InternalToursdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalToursdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalToursdsl.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:11:7: ( '-' )
            // InternalToursdsl.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_OPENING_CURLY_BRACKET"
    public final void mRULE_OPENING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPENING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:629:28: ( '{' )
            // InternalToursdsl.g:629:30: '{'
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
            // InternalToursdsl.g:631:28: ( '}' )
            // InternalToursdsl.g:631:30: '}'
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
            // InternalToursdsl.g:633:29: ( '[' )
            // InternalToursdsl.g:633:31: '['
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
            // InternalToursdsl.g:635:29: ( ']' )
            // InternalToursdsl.g:635:31: ']'
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
            // InternalToursdsl.g:637:12: ( ':' )
            // InternalToursdsl.g:637:14: ':'
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
            // InternalToursdsl.g:639:12: ( '\\'' )
            // InternalToursdsl.g:639:14: '\\''
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
            // InternalToursdsl.g:641:12: ( ',' )
            // InternalToursdsl.g:641:14: ','
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
            // InternalToursdsl.g:643:10: ( '.' )
            // InternalToursdsl.g:643:12: '.'
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
            // InternalToursdsl.g:645:11: ( 'name' )
            // InternalToursdsl.g:645:13: 'name'
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
            // InternalToursdsl.g:647:11: ( 'from' )
            // InternalToursdsl.g:647:13: 'from'
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
            // InternalToursdsl.g:649:9: ( 'to' )
            // InternalToursdsl.g:649:11: 'to'
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
            // InternalToursdsl.g:651:15: ( 'position' )
            // InternalToursdsl.g:651:17: 'position'
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

    // $ANTLR start "RULE_ROTATION"
    public final void mRULE_ROTATION() throws RecognitionException {
        try {
            int _type = RULE_ROTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:653:15: ( 'rotation' )
            // InternalToursdsl.g:653:17: 'rotation'
            {
            match("rotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROTATION"

    // $ANTLR start "RULE_PLACES"
    public final void mRULE_PLACES() throws RecognitionException {
        try {
            int _type = RULE_PLACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalToursdsl.g:655:13: ( 'places' )
            // InternalToursdsl.g:655:15: 'places'
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
            // InternalToursdsl.g:657:18: ( 'description' )
            // InternalToursdsl.g:657:20: 'description'
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
            // InternalToursdsl.g:659:12: ( 'paths' )
            // InternalToursdsl.g:659:14: 'paths'
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
            // InternalToursdsl.g:661:19: ( 'x' )
            // InternalToursdsl.g:661:21: 'x'
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
            // InternalToursdsl.g:663:19: ( 'y' )
            // InternalToursdsl.g:663:21: 'y'
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
            // InternalToursdsl.g:665:19: ( 'z' )
            // InternalToursdsl.g:665:21: 'z'
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
            // InternalToursdsl.g:667:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalToursdsl.g:667:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalToursdsl.g:667:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalToursdsl.g:667:11: '^'
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

            // InternalToursdsl.g:667:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalToursdsl.g:669:10: ( ( '0' .. '9' )+ )
            // InternalToursdsl.g:669:12: ( '0' .. '9' )+
            {
            // InternalToursdsl.g:669:12: ( '0' .. '9' )+
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
            	    // InternalToursdsl.g:669:13: '0' .. '9'
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
            // InternalToursdsl.g:671:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalToursdsl.g:671:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalToursdsl.g:671:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalToursdsl.g:671:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalToursdsl.g:671:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalToursdsl.g:671:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToursdsl.g:671:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalToursdsl.g:671:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalToursdsl.g:671:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalToursdsl.g:671:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalToursdsl.g:671:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalToursdsl.g:673:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalToursdsl.g:673:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalToursdsl.g:673:24: ( options {greedy=false; } : . )*
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
            	    // InternalToursdsl.g:673:52: .
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
            // InternalToursdsl.g:675:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalToursdsl.g:675:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalToursdsl.g:675:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToursdsl.g:675:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalToursdsl.g:675:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToursdsl.g:675:41: ( '\\r' )? '\\n'
                    {
                    // InternalToursdsl.g:675:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToursdsl.g:675:41: '\\r'
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
            // InternalToursdsl.g:677:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalToursdsl.g:677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalToursdsl.g:677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalToursdsl.g:679:16: ( . )
            // InternalToursdsl.g:679:18: .
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
        // InternalToursdsl.g:1:8: ( T__30 | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_FROM | RULE_TO | RULE_POSITION | RULE_ROTATION | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalToursdsl.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalToursdsl.g:1:16: RULE_OPENING_CURLY_BRACKET
                {
                mRULE_OPENING_CURLY_BRACKET(); 

                }
                break;
            case 3 :
                // InternalToursdsl.g:1:43: RULE_CLOSING_CURLY_BRACKET
                {
                mRULE_CLOSING_CURLY_BRACKET(); 

                }
                break;
            case 4 :
                // InternalToursdsl.g:1:70: RULE_OPENING_SQUARE_BRACKET
                {
                mRULE_OPENING_SQUARE_BRACKET(); 

                }
                break;
            case 5 :
                // InternalToursdsl.g:1:98: RULE_CLOSING_SQUARE_BRACKET
                {
                mRULE_CLOSING_SQUARE_BRACKET(); 

                }
                break;
            case 6 :
                // InternalToursdsl.g:1:126: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 7 :
                // InternalToursdsl.g:1:137: RULE_QUOTE
                {
                mRULE_QUOTE(); 

                }
                break;
            case 8 :
                // InternalToursdsl.g:1:148: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 9 :
                // InternalToursdsl.g:1:159: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 10 :
                // InternalToursdsl.g:1:168: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 11 :
                // InternalToursdsl.g:1:178: RULE_FROM
                {
                mRULE_FROM(); 

                }
                break;
            case 12 :
                // InternalToursdsl.g:1:188: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 13 :
                // InternalToursdsl.g:1:196: RULE_POSITION
                {
                mRULE_POSITION(); 

                }
                break;
            case 14 :
                // InternalToursdsl.g:1:210: RULE_ROTATION
                {
                mRULE_ROTATION(); 

                }
                break;
            case 15 :
                // InternalToursdsl.g:1:224: RULE_PLACES
                {
                mRULE_PLACES(); 

                }
                break;
            case 16 :
                // InternalToursdsl.g:1:236: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 17 :
                // InternalToursdsl.g:1:253: RULE_PATHS
                {
                mRULE_PATHS(); 

                }
                break;
            case 18 :
                // InternalToursdsl.g:1:264: RULE_COORDINATE_X
                {
                mRULE_COORDINATE_X(); 

                }
                break;
            case 19 :
                // InternalToursdsl.g:1:282: RULE_COORDINATE_Y
                {
                mRULE_COORDINATE_Y(); 

                }
                break;
            case 20 :
                // InternalToursdsl.g:1:300: RULE_COORDINATE_Z
                {
                mRULE_COORDINATE_Z(); 

                }
                break;
            case 21 :
                // InternalToursdsl.g:1:318: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalToursdsl.g:1:326: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalToursdsl.g:1:335: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalToursdsl.g:1:347: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalToursdsl.g:1:363: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalToursdsl.g:1:379: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalToursdsl.g:1:387: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\7\uffff\1\40\2\uffff\6\45\1\55\1\56\1\57\1\31\2\uffff\2\31\14\uffff\1\45\1\uffff\1\45\1\66\5\45\7\uffff\2\45\1\uffff\5\45\1\103\1\104\5\45\2\uffff\2\45\1\114\3\45\1\120\1\uffff\3\45\1\uffff\2\45\1\126\1\127\1\45\2\uffff\2\45\1\133\1\uffff";
    static final String DFA12_eofS =
        "\134\uffff";
    static final String DFA12_minS =
        "\1\0\6\uffff\1\0\2\uffff\1\141\1\162\1\157\1\141\1\157\1\145\3\60\1\101\2\uffff\1\0\1\52\14\uffff\1\155\1\uffff\1\157\1\60\1\163\1\141\2\164\1\163\7\uffff\1\145\1\155\1\uffff\1\151\1\143\1\150\1\141\1\143\2\60\1\164\1\145\1\163\1\164\1\162\2\uffff\1\151\1\163\1\60\2\151\1\157\1\60\1\uffff\1\157\1\160\1\156\1\uffff\1\156\1\164\2\60\1\151\2\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\6\uffff\1\uffff\2\uffff\1\141\1\162\3\157\1\145\4\172\2\uffff\1\uffff\1\57\14\uffff\1\155\1\uffff\1\157\1\172\1\163\1\141\2\164\1\163\7\uffff\1\145\1\155\1\uffff\1\151\1\143\1\150\1\141\1\143\2\172\1\164\1\145\1\163\1\164\1\162\2\uffff\1\151\1\163\1\172\2\151\1\157\1\172\1\uffff\1\157\1\160\1\156\1\uffff\1\156\1\164\2\172\1\151\2\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\12\uffff\1\25\1\26\2\uffff\1\32\1\33\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\27\1\10\1\11\1\uffff\1\25\7\uffff\1\22\1\23\1\24\1\26\1\30\1\31\1\32\2\uffff\1\14\14\uffff\1\12\1\13\7\uffff\1\21\3\uffff\1\17\5\uffff\1\15\1\16\3\uffff\1\20";
    static final String DFA12_specialS =
        "\1\2\6\uffff\1\1\16\uffff\1\0\105\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\26\4\31\1\7\4\31\1\10\1\1\1\11\1\27\12\25\1\6\6\31\32\24\1\4\1\31\1\5\1\23\1\24\1\31\3\24\1\17\1\24\1\13\7\24\1\12\1\24\1\15\1\24\1\16\1\24\1\14\3\24\1\20\1\21\1\22\1\2\1\31\1\3\uff82\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\41",
            "",
            "",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\52\12\uffff\1\51\2\uffff\1\50",
            "\1\53",
            "\1\54",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\41",
            "\1\61\4\uffff\1\62",
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
            "",
            "\1\64",
            "",
            "\1\65",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\112",
            "\1\113",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            return "1:1: Tokens : ( T__30 | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_OPENING_SQUARE_BRACKET | RULE_CLOSING_SQUARE_BRACKET | RULE_COLON | RULE_QUOTE | RULE_COMMA | RULE_DOT | RULE_NAME | RULE_FROM | RULE_TO | RULE_POSITION | RULE_ROTATION | RULE_PLACES | RULE_DESCRIPTION | RULE_PATHS | RULE_COORDINATE_X | RULE_COORDINATE_Y | RULE_COORDINATE_Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 33;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_7 = input.LA(1);

                        s = -1;
                        if ( ((LA12_7>='\u0000' && LA12_7<='\uFFFF')) ) {s = 33;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==']') ) {s = 5;}

                        else if ( (LA12_0==':') ) {s = 6;}

                        else if ( (LA12_0=='\'') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='.') ) {s = 9;}

                        else if ( (LA12_0=='n') ) {s = 10;}

                        else if ( (LA12_0=='f') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='r') ) {s = 14;}

                        else if ( (LA12_0=='d') ) {s = 15;}

                        else if ( (LA12_0=='x') ) {s = 16;}

                        else if ( (LA12_0=='y') ) {s = 17;}

                        else if ( (LA12_0=='z') ) {s = 18;}

                        else if ( (LA12_0=='^') ) {s = 19;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='w')) ) {s = 20;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 25;}

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