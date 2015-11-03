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
    public static final int RULE_ID=4;
    public static final int RULE_MEASURE=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_ACCIDENTAL=7;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=11;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int RULE_NOTE_ID=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int RULE_OCTAVE=9;
    public static final int RULE_WS=14;

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:11:7: ( 'no-feedback' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:11:9: 'no-feedback'
            {
            match("no-feedback"); 


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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:12:7: ( 'title' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:12:9: 'title'
            {
            match("title"); 


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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:13:7: ( '=' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:13:9: '='
            {
            match('='); 

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:14:7: ( 'tempo' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:14:9: 'tempo'
            {
            match("tempo"); 


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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:16:7: ( 'major' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:16:9: 'major'
            {
            match("major"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:17:7: ( 'minor' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:17:9: 'minor'
            {
            match("minor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:18:7: ( '{' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:19:7: ( '}' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:20:7: ( '.' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:20:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:21:7: ( '_' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:21:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:22:7: ( '/' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:22:9: '/'
            {
            match('/'); 

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:23:7: ( '^' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:23:9: '^'
            {
            match('^'); 

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:24:7: ( '^^' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:24:9: '^^'
            {
            match("^^"); 


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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:25:7: ( '[' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:25:9: '['
            {
            match('['); 

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:26:7: ( ']' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:27:7: ( '(' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:28:7: ( ')' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_OCTAVE"
    public final void mRULE_OCTAVE() throws RecognitionException {
        try {
            int _type = RULE_OCTAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:13: ( ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:15: ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:15: ( ( '<' )+ | 'o' '0' .. '9' | ( '>' )+ )
            int alt3=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt3=1;
                }
                break;
            case 'o':
                {
                alt3=2;
                }
                break;
            case '>':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:16: ( '<' )+
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:16: ( '<' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='<') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:16: '<'
                    	    {
                    	    match('<'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:21: 'o' '0' .. '9'
                    {
                    match('o'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:34: ( '>' )+
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:34: ( '>' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='>') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:992:34: '>'
                    	    {
                    	    match('>'); 

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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:994:17: ( ( '+' | '-' | '@' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:994:19: ( '+' | '-' | '@' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='@' ) {
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:996:14: ( ( 'a' .. 'g' | 'A' .. 'G' | ( 'R' | 'r' ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:996:16: ( 'a' .. 'g' | 'A' .. 'G' | ( 'R' | 'r' ) )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='G')||input.LA(1)=='R'||(input.LA(1)>='a' && input.LA(1)<='g')||input.LA(1)=='r' ) {
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:15: ( ':' ( '1' | '2' | '4' | '8' | '16' | '32' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:17: ':' ( '1' | '2' | '4' | '8' | '16' | '32' )
            {
            match(':'); 
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:21: ( '1' | '2' | '4' | '8' | '16' | '32' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '1':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='6') ) {
                    alt4=5;
                }
                else {
                    alt4=1;}
                }
                break;
            case '2':
                {
                alt4=2;
                }
                break;
            case '4':
                {
                alt4=3;
                }
                break;
            case '8':
                {
                alt4=4;
                }
                break;
            case '3':
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:22: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:26: '2'
                    {
                    match('2'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:30: '4'
                    {
                    match('4'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:34: '8'
                    {
                    match('8'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:38: '16'
                    {
                    match("16"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:998:43: '32'
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

    // $ANTLR start "RULE_MEASURE"
    public final void mRULE_MEASURE() throws RecognitionException {
        try {
            int _type = RULE_MEASURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1000:14: ( ( '|' )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1000:16: ( '|' )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1000:16: ( '|' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='|') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1000:16: '|'
                    {
                    match('|'); 

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
    // $ANTLR end "RULE_MEASURE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1002:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1002:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1002:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1002:11: '^'
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1002:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1004:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1004:12: ( '0' .. '9' )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1004:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1004:13: '0' .. '9'
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1006:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1008:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1008:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1008:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1008:52: .
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1010:41: '\\r'
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1012:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1012:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1012:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1014:16: ( . )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1014:18: .
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
        // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_OCTAVE | RULE_ACCIDENTAL | RULE_NOTE_ID | RULE_DURATION | RULE_MEASURE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=30;
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
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:118: RULE_OCTAVE
                {
                mRULE_OCTAVE(); 

                }
                break;
            case 20 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:130: RULE_ACCIDENTAL
                {
                mRULE_ACCIDENTAL(); 

                }
                break;
            case 21 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:146: RULE_NOTE_ID
                {
                mRULE_NOTE_ID(); 

                }
                break;
            case 22 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:159: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 23 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:173: RULE_MEASURE
                {
                mRULE_MEASURE(); 

                }
                break;
            case 24 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:186: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:194: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:203: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:215: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:231: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:247: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:1:255: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\27\2\37\1\uffff\2\37\3\uffff\1\51\1\54\1\56\5\uffff\1\37\2\uffff"+
        "\1\66\1\35\4\uffff\2\35\2\uffff\1\37\1\uffff\2\37\1\uffff\3\37\16"+
        "\uffff\1\63\7\uffff\2\37\1\103\4\37\1\uffff\2\37\1\112\1\113\1\114"+
        "\1\115\4\uffff";
    static final String DFA17_eofS =
        "\116\uffff";
    static final String DFA17_minS =
        "\1\0\1\157\1\145\1\uffff\1\145\1\141\3\uffff\1\60\1\52\1\101\5"+
        "\uffff\1\60\2\uffff\1\60\1\61\4\uffff\2\0\2\uffff\1\55\1\uffff\1"+
        "\164\1\155\1\uffff\1\171\1\152\1\156\16\uffff\1\60\7\uffff\1\154"+
        "\1\160\1\60\2\157\1\145\1\157\1\uffff\2\162\4\60\4\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\157\1\151\1\uffff\1\145\1\151\3\uffff\1\172\1\57\1\172"+
        "\5\uffff\1\71\2\uffff\1\172\1\70\4\uffff\2\uffff\2\uffff\1\55\1"+
        "\uffff\1\164\1\155\1\uffff\1\171\1\152\1\156\16\uffff\1\172\7\uffff"+
        "\1\154\1\160\1\172\2\157\1\145\1\157\1\uffff\2\162\4\172\4\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\2\uffff\1\10\1\11\1\12\3\uffff\1\17\1\20\1\21\1\22"+
        "\1\23\1\uffff\1\23\1\24\2\uffff\2\27\1\30\1\31\2\uffff\1\35\1\36"+
        "\1\uffff\1\30\2\uffff\1\3\3\uffff\1\10\1\11\1\12\1\13\1\33\1\34"+
        "\1\14\1\16\1\15\1\17\1\20\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26"+
        "\1\31\1\32\1\35\1\1\7\uffff\1\5\6\uffff\1\2\1\4\1\6\1\7";
    static final String DFA17_specialS =
        "\1\2\31\uffff\1\0\1\1\62\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\32\4\35\1\33\1\16\1"+
            "\17\1\35\1\23\1\35\1\23\1\10\1\12\12\31\1\25\1\35\1\20\1\3\1"+
            "\22\1\35\1\23\7\24\12\30\1\24\10\30\1\14\1\35\1\15\1\13\1\11"+
            "\1\35\7\24\3\30\1\4\1\30\1\5\1\1\1\21\2\30\1\24\1\30\1\2\6\30"+
            "\1\6\1\26\1\7\uff82\35",
            "\1\36",
            "\1\41\3\uffff\1\40",
            "",
            "\1\43",
            "\1\44\7\uffff\1\45",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\52\4\uffff\1\53",
            "\32\37\3\uffff\1\55\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "\12\64",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\4\67\3\uffff\1\67",
            "",
            "",
            "",
            "",
            "\0\71",
            "\0\71",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
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
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_OCTAVE | RULE_ACCIDENTAL | RULE_NOTE_ID | RULE_DURATION | RULE_MEASURE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='n') ) {s = 1;}

                        else if ( (LA17_0=='t') ) {s = 2;}

                        else if ( (LA17_0=='=') ) {s = 3;}

                        else if ( (LA17_0=='k') ) {s = 4;}

                        else if ( (LA17_0=='m') ) {s = 5;}

                        else if ( (LA17_0=='{') ) {s = 6;}

                        else if ( (LA17_0=='}') ) {s = 7;}

                        else if ( (LA17_0=='.') ) {s = 8;}

                        else if ( (LA17_0=='_') ) {s = 9;}

                        else if ( (LA17_0=='/') ) {s = 10;}

                        else if ( (LA17_0=='^') ) {s = 11;}

                        else if ( (LA17_0=='[') ) {s = 12;}

                        else if ( (LA17_0==']') ) {s = 13;}

                        else if ( (LA17_0=='(') ) {s = 14;}

                        else if ( (LA17_0==')') ) {s = 15;}

                        else if ( (LA17_0=='<') ) {s = 16;}

                        else if ( (LA17_0=='o') ) {s = 17;}

                        else if ( (LA17_0=='>') ) {s = 18;}

                        else if ( (LA17_0=='+'||LA17_0=='-'||LA17_0=='@') ) {s = 19;}

                        else if ( ((LA17_0>='A' && LA17_0<='G')||LA17_0=='R'||(LA17_0>='a' && LA17_0<='g')||LA17_0=='r') ) {s = 20;}

                        else if ( (LA17_0==':') ) {s = 21;}

                        else if ( (LA17_0=='|') ) {s = 22;}

                        else if ( ((LA17_0>='H' && LA17_0<='Q')||(LA17_0>='S' && LA17_0<='Z')||(LA17_0>='h' && LA17_0<='j')||LA17_0=='l'||(LA17_0>='p' && LA17_0<='q')||LA17_0=='s'||(LA17_0>='u' && LA17_0<='z')) ) {s = 24;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 25;}

                        else if ( (LA17_0=='\"') ) {s = 26;}

                        else if ( (LA17_0=='\'') ) {s = 27;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 28;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||LA17_0=='*'||LA17_0==','||LA17_0==';'||LA17_0=='?'||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 29;}

                        else s = 23;

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