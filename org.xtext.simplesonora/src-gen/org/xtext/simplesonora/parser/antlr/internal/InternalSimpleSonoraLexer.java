package org.xtext.simplesonora.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleSonoraLexer extends Lexer {
    public static final int RULE_DURATION=10;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_TIME=6;
    public static final int EOF=-1;
    public static final int RULE_NOTE_ID=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_ACCIDENTAL=8;
    public static final int RULE_OCTAVE=9;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSimpleSonoraLexer() {;} 
    public InternalSimpleSonoraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleSonoraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:11:7: ( 'name' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:11:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:12:7: ( '=' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:13:7: ( 'tempo' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:13:9: 'tempo'
            {
            match("tempo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:14:7: ( 'time' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:14:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:15:7: ( 'key' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:15:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:16:7: ( '/' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:534:11: ( ( '3/4' | '4/4' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:534:13: ( '3/4' | '4/4' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:534:13: ( '3/4' | '4/4' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='3') ) {
                alt1=1;
            }
            else if ( (LA1_0=='4') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:534:14: '3/4'
                    {
                    match("3/4"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:534:20: '4/4'
                    {
                    match("4/4"); 


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
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_OCTAVE"
    public final void mRULE_OCTAVE() throws RecognitionException {
        try {
            int _type = RULE_OCTAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:13: ( ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:15: ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:15: ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ )
            int alt4=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt4=1;
                }
                break;
            case 'o':
                {
                alt4=2;
                }
                break;
            case '>':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:16: ( '<' )+
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:16: ( '<' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='<') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:16: '<'
                    	    {
                    	    match('<'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:21: 'o' '0' .. '9'
                    {
                    match('o'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:34: ( '>' )+
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:34: ( '>' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='>') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:536:34: '>'
                    	    {
                    	    match('>'); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAVE"

    // $ANTLR start "RULE_ACCIDENTAL"
    public final void mRULE_ACCIDENTAL() throws RecognitionException {
        try {
            int _type = RULE_ACCIDENTAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:17: ( ( '+' | '-' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:19: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCIDENTAL"

    // $ANTLR start "RULE_NOTE_ID"
    public final void mRULE_NOTE_ID() throws RecognitionException {
        try {
            int _type = RULE_NOTE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:540:14: ( ( 'a' .. 'g' | 'A' .. 'G' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:540:16: ( 'a' .. 'g' | 'A' .. 'G' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='G')||(input.LA(1)>='a' && input.LA(1)<='g') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTE_ID"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:15: ( ':' ( '1' | '2' | '4' | '8' | '16' | '32' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:17: ':' ( '1' | '2' | '4' | '8' | '16' | '32' )
            {
            match(':'); 
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:21: ( '1' | '2' | '4' | '8' | '16' | '32' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '1':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='6') ) {
                    alt5=5;
                }
                else {
                    alt5=1;}
                }
                break;
            case '2':
                {
                alt5=2;
                }
                break;
            case '4':
                {
                alt5=3;
                }
                break;
            case '8':
                {
                alt5=4;
                }
                break;
            case '3':
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:22: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:26: '2'
                    {
                    match('2'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:30: '4'
                    {
                    match('4'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:34: '8'
                    {
                    match('8'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:38: '16'
                    {
                    match("16"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:542:43: '32'
                    {
                    match("32"); 


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
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:544:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:544:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:544:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:544:11: '^'
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:544:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:
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
            	    break loop7;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:546:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:546:12: ( '0' .. '9' )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:546:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:546:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:548:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:550:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:550:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:550:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:550:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:41: '\\r'
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:554:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:554:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:554:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:556:16: ( . )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:556:18: .
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
        // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_TIME | RULE_OCTAVE | RULE_ACCIDENTAL | RULE_NOTE_ID | RULE_DURATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=18;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:46: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 8 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:56: RULE_OCTAVE
                {
                mRULE_OCTAVE(); 

                }
                break;
            case 9 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:68: RULE_ACCIDENTAL
                {
                mRULE_ACCIDENTAL(); 

                }
                break;
            case 10 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:84: RULE_NOTE_ID
                {
                mRULE_NOTE_ID(); 

                }
                break;
            case 11 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:97: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 12 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:111: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:119: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:128: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:140: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:156: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:172: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:180: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\26\1\uffff\2\26\1\35\2\37\1\uffff\1\26\2\uffff\1\43"+
        "\2\24\2\uffff\2\24\2\uffff\1\26\2\uffff\3\26\6\uffff\1\40\5\uffff"+
        "\3\26\1\56\1\57\1\26\1\61\2\uffff\1\62\2\uffff";
    static final String DFA17_eofS =
        "\63\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\uffff\2\145\1\52\2\57\1\uffff\1\60\2\uffff\1\60\1"+
        "\61\1\101\2\uffff\2\0\2\uffff\1\155\2\uffff\2\155\1\171\6\uffff"+
        "\1\60\5\uffff\1\145\1\160\1\145\2\60\1\157\1\60\2\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\uffff\1\151\1\145\3\57\1\uffff\1\71\2\uffff\1"+
        "\172\1\70\1\172\2\uffff\2\uffff\2\uffff\1\155\2\uffff\2\155\1\171"+
        "\6\uffff\1\172\5\uffff\1\145\1\160\1\145\2\172\1\157\1\172\2\uffff"+
        "\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\1\uffff\1\10\1\11\3\uffff\1\14\1\15\2"+
        "\uffff\1\21\1\22\1\uffff\1\14\1\2\3\uffff\1\17\1\20\1\6\1\7\1\15"+
        "\1\10\1\uffff\1\11\1\12\1\13\1\16\1\21\7\uffff\1\5\1\1\1\uffff\1"+
        "\4\1\3";
    static final String DFA17_specialS =
        "\1\1\20\uffff\1\0\1\2\40\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\21\4\24\1\22\3\24\1"+
            "\13\1\24\1\13\1\24\1\5\3\20\1\6\1\7\5\20\1\15\1\24\1\10\1\2"+
            "\1\12\2\24\7\14\23\17\3\24\1\16\1\17\1\24\7\14\3\17\1\4\2\17"+
            "\1\1\1\11\4\17\1\3\6\17\uff85\24",
            "\1\25",
            "",
            "\1\30\3\uffff\1\31",
            "\1\32",
            "\1\33\4\uffff\1\34",
            "\1\36",
            "\1\36",
            "",
            "\12\41",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\4\44\3\uffff\1\44",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\45",
            "\0\45",
            "",
            "",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\60",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_TIME | RULE_OCTAVE | RULE_ACCIDENTAL | RULE_NOTE_ID | RULE_DURATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( ((LA17_17>='\u0000' && LA17_17<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='n') ) {s = 1;}

                        else if ( (LA17_0=='=') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0=='k') ) {s = 4;}

                        else if ( (LA17_0=='/') ) {s = 5;}

                        else if ( (LA17_0=='3') ) {s = 6;}

                        else if ( (LA17_0=='4') ) {s = 7;}

                        else if ( (LA17_0=='<') ) {s = 8;}

                        else if ( (LA17_0=='o') ) {s = 9;}

                        else if ( (LA17_0=='>') ) {s = 10;}

                        else if ( (LA17_0=='+'||LA17_0=='-') ) {s = 11;}

                        else if ( ((LA17_0>='A' && LA17_0<='G')||(LA17_0>='a' && LA17_0<='g')) ) {s = 12;}

                        else if ( (LA17_0==':') ) {s = 13;}

                        else if ( (LA17_0=='^') ) {s = 14;}

                        else if ( ((LA17_0>='H' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='h' && LA17_0<='j')||(LA17_0>='l' && LA17_0<='m')||(LA17_0>='p' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 15;}

                        else if ( ((LA17_0>='0' && LA17_0<='2')||(LA17_0>='5' && LA17_0<='9')) ) {s = 16;}

                        else if ( (LA17_0=='\"') ) {s = 17;}

                        else if ( (LA17_0=='\'') ) {s = 18;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 19;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='*')||LA17_0==','||LA17_0=='.'||LA17_0==';'||(LA17_0>='?' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_18 = input.LA(1);

                        s = -1;
                        if ( ((LA17_18>='\u0000' && LA17_18<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}