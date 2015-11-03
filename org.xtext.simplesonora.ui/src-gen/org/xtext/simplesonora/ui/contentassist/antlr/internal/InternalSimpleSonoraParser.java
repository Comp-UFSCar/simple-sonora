package org.xtext.simplesonora.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.simplesonora.services.SimpleSonoraGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleSonoraParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'/'", "'['", "']'", "'('", "')'", "'no-feedback'", "'major'", "'minor'", "'.'", "'_'", "'^'", "'^^'"
    };
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int RULE_NOTE_ID=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int RULE_OCTAVE=9;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalSimpleSonoraParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleSonoraParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleSonoraParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g"; }


     
     	private SimpleSonoraGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimpleSonoraGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDocument"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:60:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:61:1: ( ruleDocument EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:62:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:69:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:73:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:74:1: ( ( rule__Document__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:74:1: ( ( rule__Document__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:75:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:76:1: ( rule__Document__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:76:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleHeader"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:88:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:89:1: ( ruleHeader EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:90:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader121);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader128); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:97:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:101:2: ( ( ( rule__Header__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:102:1: ( ( rule__Header__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:102:1: ( ( rule__Header__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:103:1: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:104:1: ( rule__Header__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:104:2: rule__Header__Group__0
            {
            pushFollow(FOLLOW_rule__Header__Group__0_in_ruleHeader154);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTempo"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:116:1: entryRuleTempo : ruleTempo EOF ;
    public final void entryRuleTempo() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:117:1: ( ruleTempo EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:118:1: ruleTempo EOF
            {
             before(grammarAccess.getTempoRule()); 
            pushFollow(FOLLOW_ruleTempo_in_entryRuleTempo181);
            ruleTempo();

            state._fsp--;

             after(grammarAccess.getTempoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempo188); 

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
    // $ANTLR end "entryRuleTempo"


    // $ANTLR start "ruleTempo"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:125:1: ruleTempo : ( ( rule__Tempo__Alternatives ) ) ;
    public final void ruleTempo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:129:2: ( ( ( rule__Tempo__Alternatives ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:130:1: ( ( rule__Tempo__Alternatives ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:130:1: ( ( rule__Tempo__Alternatives ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:131:1: ( rule__Tempo__Alternatives )
            {
             before(grammarAccess.getTempoAccess().getAlternatives()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:132:1: ( rule__Tempo__Alternatives )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:132:2: rule__Tempo__Alternatives
            {
            pushFollow(FOLLOW_rule__Tempo__Alternatives_in_ruleTempo214);
            rule__Tempo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTempo"


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:144:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:145:1: ( ruleKey EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:146:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey241);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey248); 

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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:153:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:157:2: ( ( ( rule__Key__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:158:1: ( ( rule__Key__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:158:1: ( ( rule__Key__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:159:1: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:160:1: ( rule__Key__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:160:2: rule__Key__Group__0
            {
            pushFollow(FOLLOW_rule__Key__Group__0_in_ruleKey274);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleSong"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:172:1: entryRuleSong : ruleSong EOF ;
    public final void entryRuleSong() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:173:1: ( ruleSong EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:174:1: ruleSong EOF
            {
             before(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong301);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getSongRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong308); 

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
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:181:1: ruleSong : ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) ) ;
    public final void ruleSong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:185:2: ( ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:186:1: ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:186:1: ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:187:1: ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:187:1: ( ( rule__Song__InstrumentsAssignment ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:188:1: ( rule__Song__InstrumentsAssignment )
            {
             before(grammarAccess.getSongAccess().getInstrumentsAssignment()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:189:1: ( rule__Song__InstrumentsAssignment )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:189:2: rule__Song__InstrumentsAssignment
            {
            pushFollow(FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong336);
            rule__Song__InstrumentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getInstrumentsAssignment()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:192:1: ( ( rule__Song__InstrumentsAssignment )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:193:1: ( rule__Song__InstrumentsAssignment )*
            {
             before(grammarAccess.getSongAccess().getInstrumentsAssignment()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:194:1: ( rule__Song__InstrumentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:194:2: rule__Song__InstrumentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong348);
            	    rule__Song__InstrumentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSongAccess().getInstrumentsAssignment()); 

            }


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
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleInstrument"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:207:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:208:1: ( ruleInstrument EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:209:1: ruleInstrument EOF
            {
             before(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument378);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getInstrumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument385); 

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
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:216:1: ruleInstrument : ( ( rule__Instrument__Group__0 ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:220:2: ( ( ( rule__Instrument__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:221:1: ( ( rule__Instrument__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:221:1: ( ( rule__Instrument__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:222:1: ( rule__Instrument__Group__0 )
            {
             before(grammarAccess.getInstrumentAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:223:1: ( rule__Instrument__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:223:2: rule__Instrument__Group__0
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0_in_ruleInstrument411);
            rule__Instrument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getGroup()); 

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
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleSequence"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:235:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:236:1: ( ruleSequence EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:237:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence438);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence445); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:244:1: ruleSequence : ( ( rule__Sequence__Alternatives ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:248:2: ( ( ( rule__Sequence__Alternatives ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Sequence__Alternatives ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Sequence__Alternatives ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:250:1: ( rule__Sequence__Alternatives )
            {
             before(grammarAccess.getSequenceAccess().getAlternatives()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:1: ( rule__Sequence__Alternatives )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:2: rule__Sequence__Alternatives
            {
            pushFollow(FOLLOW_rule__Sequence__Alternatives_in_ruleSequence471);
            rule__Sequence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleNote"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:263:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:264:1: ( ruleNote EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:265:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote498);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote505); 

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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:272:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:276:2: ( ( ( rule__Note__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:277:1: ( ( rule__Note__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:277:1: ( ( rule__Note__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:278:1: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:279:1: ( rule__Note__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:279:2: rule__Note__Group__0
            {
            pushFollow(FOLLOW_rule__Note__Group__0_in_ruleNote531);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

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
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:291:1: entryRuleChord : ruleChord EOF ;
    public final void entryRuleChord() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:292:1: ( ruleChord EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:293:1: ruleChord EOF
            {
             before(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord558);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getChordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord565); 

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
    // $ANTLR end "entryRuleChord"


    // $ANTLR start "ruleChord"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:300:1: ruleChord : ( ( rule__Chord__Group__0 ) ) ;
    public final void ruleChord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:304:2: ( ( ( rule__Chord__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:305:1: ( ( rule__Chord__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:305:1: ( ( rule__Chord__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:306:1: ( rule__Chord__Group__0 )
            {
             before(grammarAccess.getChordAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:307:1: ( rule__Chord__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:307:2: rule__Chord__Group__0
            {
            pushFollow(FOLLOW_rule__Chord__Group__0_in_ruleChord591);
            rule__Chord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getGroup()); 

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
    // $ANTLR end "ruleChord"


    // $ANTLR start "entryRuleHarmony"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:319:1: entryRuleHarmony : ruleHarmony EOF ;
    public final void entryRuleHarmony() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:320:1: ( ruleHarmony EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:321:1: ruleHarmony EOF
            {
             before(grammarAccess.getHarmonyRule()); 
            pushFollow(FOLLOW_ruleHarmony_in_entryRuleHarmony618);
            ruleHarmony();

            state._fsp--;

             after(grammarAccess.getHarmonyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHarmony625); 

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
    // $ANTLR end "entryRuleHarmony"


    // $ANTLR start "ruleHarmony"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:328:1: ruleHarmony : ( ( rule__Harmony__Group__0 ) ) ;
    public final void ruleHarmony() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:332:2: ( ( ( rule__Harmony__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:333:1: ( ( rule__Harmony__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:333:1: ( ( rule__Harmony__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:334:1: ( rule__Harmony__Group__0 )
            {
             before(grammarAccess.getHarmonyAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:335:1: ( rule__Harmony__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:335:2: rule__Harmony__Group__0
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0_in_ruleHarmony651);
            rule__Harmony__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getGroup()); 

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
    // $ANTLR end "ruleHarmony"


    // $ANTLR start "entryRuleTuplet"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:347:1: entryRuleTuplet : ruleTuplet EOF ;
    public final void entryRuleTuplet() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:348:1: ( ruleTuplet EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:349:1: ruleTuplet EOF
            {
             before(grammarAccess.getTupletRule()); 
            pushFollow(FOLLOW_ruleTuplet_in_entryRuleTuplet678);
            ruleTuplet();

            state._fsp--;

             after(grammarAccess.getTupletRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuplet685); 

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
    // $ANTLR end "entryRuleTuplet"


    // $ANTLR start "ruleTuplet"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:356:1: ruleTuplet : ( ( rule__Tuplet__Group__0 ) ) ;
    public final void ruleTuplet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:360:2: ( ( ( rule__Tuplet__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:361:1: ( ( rule__Tuplet__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:361:1: ( ( rule__Tuplet__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:362:1: ( rule__Tuplet__Group__0 )
            {
             before(grammarAccess.getTupletAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:363:1: ( rule__Tuplet__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:363:2: rule__Tuplet__Group__0
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__0_in_ruleTuplet711);
            rule__Tuplet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupletAccess().getGroup()); 

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
    // $ANTLR end "ruleTuplet"


    // $ANTLR start "rule__Tempo__Alternatives"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:375:1: rule__Tempo__Alternatives : ( ( ( rule__Tempo__ValueAssignment_0 ) ) | ( ( rule__Tempo__IdAssignment_1 ) ) );
    public final void rule__Tempo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:379:1: ( ( ( rule__Tempo__ValueAssignment_0 ) ) | ( ( rule__Tempo__IdAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:380:1: ( ( rule__Tempo__ValueAssignment_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:380:1: ( ( rule__Tempo__ValueAssignment_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:381:1: ( rule__Tempo__ValueAssignment_0 )
                    {
                     before(grammarAccess.getTempoAccess().getValueAssignment_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:382:1: ( rule__Tempo__ValueAssignment_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:382:2: rule__Tempo__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Tempo__ValueAssignment_0_in_rule__Tempo__Alternatives747);
                    rule__Tempo__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempoAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:386:6: ( ( rule__Tempo__IdAssignment_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:386:6: ( ( rule__Tempo__IdAssignment_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:387:1: ( rule__Tempo__IdAssignment_1 )
                    {
                     before(grammarAccess.getTempoAccess().getIdAssignment_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:388:1: ( rule__Tempo__IdAssignment_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:388:2: rule__Tempo__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Tempo__IdAssignment_1_in_rule__Tempo__Alternatives765);
                    rule__Tempo__IdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempoAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Tempo__Alternatives"


    // $ANTLR start "rule__Key__Alternatives_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:397:1: rule__Key__Alternatives_2 : ( ( ( rule__Key__IntervalAssignment_2_0 ) ) | ( ( rule__Key__IntervalAssignment_2_1 ) ) );
    public final void rule__Key__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:401:1: ( ( ( rule__Key__IntervalAssignment_2_0 ) ) | ( ( rule__Key__IntervalAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:402:1: ( ( rule__Key__IntervalAssignment_2_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:402:1: ( ( rule__Key__IntervalAssignment_2_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:403:1: ( rule__Key__IntervalAssignment_2_0 )
                    {
                     before(grammarAccess.getKeyAccess().getIntervalAssignment_2_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:404:1: ( rule__Key__IntervalAssignment_2_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:404:2: rule__Key__IntervalAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Key__IntervalAssignment_2_0_in_rule__Key__Alternatives_2798);
                    rule__Key__IntervalAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeyAccess().getIntervalAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:408:6: ( ( rule__Key__IntervalAssignment_2_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:408:6: ( ( rule__Key__IntervalAssignment_2_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:409:1: ( rule__Key__IntervalAssignment_2_1 )
                    {
                     before(grammarAccess.getKeyAccess().getIntervalAssignment_2_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:410:1: ( rule__Key__IntervalAssignment_2_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:410:2: rule__Key__IntervalAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Key__IntervalAssignment_2_1_in_rule__Key__Alternatives_2816);
                    rule__Key__IntervalAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeyAccess().getIntervalAssignment_2_1()); 

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
    // $ANTLR end "rule__Key__Alternatives_2"


    // $ANTLR start "rule__Sequence__Alternatives"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:419:1: rule__Sequence__Alternatives : ( ( ( rule__Sequence__NoteAssignment_0 ) ) | ( ( rule__Sequence__ChordAssignment_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_2 ) ) | ( ( rule__Sequence__TupletAssignment_3 ) ) | ( ( rule__Sequence__MeasureAssignment_4 ) ) );
    public final void rule__Sequence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:423:1: ( ( ( rule__Sequence__NoteAssignment_0 ) ) | ( ( rule__Sequence__ChordAssignment_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_2 ) ) | ( ( rule__Sequence__TupletAssignment_3 ) ) | ( ( rule__Sequence__MeasureAssignment_4 ) ) )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:424:1: ( ( rule__Sequence__NoteAssignment_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:424:1: ( ( rule__Sequence__NoteAssignment_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:425:1: ( rule__Sequence__NoteAssignment_0 )
                    {
                     before(grammarAccess.getSequenceAccess().getNoteAssignment_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:426:1: ( rule__Sequence__NoteAssignment_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:426:2: rule__Sequence__NoteAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Sequence__NoteAssignment_0_in_rule__Sequence__Alternatives849);
                    rule__Sequence__NoteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getNoteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:430:6: ( ( rule__Sequence__ChordAssignment_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:430:6: ( ( rule__Sequence__ChordAssignment_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:431:1: ( rule__Sequence__ChordAssignment_1 )
                    {
                     before(grammarAccess.getSequenceAccess().getChordAssignment_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:432:1: ( rule__Sequence__ChordAssignment_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:432:2: rule__Sequence__ChordAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sequence__ChordAssignment_1_in_rule__Sequence__Alternatives867);
                    rule__Sequence__ChordAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getChordAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:436:6: ( ( rule__Sequence__HarmonyAssignment_2 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:436:6: ( ( rule__Sequence__HarmonyAssignment_2 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:437:1: ( rule__Sequence__HarmonyAssignment_2 )
                    {
                     before(grammarAccess.getSequenceAccess().getHarmonyAssignment_2()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:438:1: ( rule__Sequence__HarmonyAssignment_2 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:438:2: rule__Sequence__HarmonyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sequence__HarmonyAssignment_2_in_rule__Sequence__Alternatives885);
                    rule__Sequence__HarmonyAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getHarmonyAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:442:6: ( ( rule__Sequence__TupletAssignment_3 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:442:6: ( ( rule__Sequence__TupletAssignment_3 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:443:1: ( rule__Sequence__TupletAssignment_3 )
                    {
                     before(grammarAccess.getSequenceAccess().getTupletAssignment_3()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:1: ( rule__Sequence__TupletAssignment_3 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:2: rule__Sequence__TupletAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Sequence__TupletAssignment_3_in_rule__Sequence__Alternatives903);
                    rule__Sequence__TupletAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getTupletAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:448:6: ( ( rule__Sequence__MeasureAssignment_4 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:448:6: ( ( rule__Sequence__MeasureAssignment_4 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:449:1: ( rule__Sequence__MeasureAssignment_4 )
                    {
                     before(grammarAccess.getSequenceAccess().getMeasureAssignment_4()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:450:1: ( rule__Sequence__MeasureAssignment_4 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:450:2: rule__Sequence__MeasureAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Sequence__MeasureAssignment_4_in_rule__Sequence__Alternatives921);
                    rule__Sequence__MeasureAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getMeasureAssignment_4()); 

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
    // $ANTLR end "rule__Sequence__Alternatives"


    // $ANTLR start "rule__Chord__Alternatives_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:459:1: rule__Chord__Alternatives_1 : ( ( ( ( rule__Chord__Group_1_0__0 ) ) ( ( rule__Chord__Group_1_0__0 )* ) ) | ( ( rule__Chord__Group_1_1__0 ) ) );
    public final void rule__Chord__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:463:1: ( ( ( ( rule__Chord__Group_1_0__0 ) ) ( ( rule__Chord__Group_1_0__0 )* ) ) | ( ( rule__Chord__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_NOTE_ID||LA6_1==RULE_OCTAVE) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:464:1: ( ( ( rule__Chord__Group_1_0__0 ) ) ( ( rule__Chord__Group_1_0__0 )* ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:464:1: ( ( ( rule__Chord__Group_1_0__0 ) ) ( ( rule__Chord__Group_1_0__0 )* ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:465:1: ( ( rule__Chord__Group_1_0__0 ) ) ( ( rule__Chord__Group_1_0__0 )* )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:465:1: ( ( rule__Chord__Group_1_0__0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:466:1: ( rule__Chord__Group_1_0__0 )
                    {
                     before(grammarAccess.getChordAccess().getGroup_1_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:467:1: ( rule__Chord__Group_1_0__0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:467:2: rule__Chord__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Chord__Group_1_0__0_in_rule__Chord__Alternatives_1956);
                    rule__Chord__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChordAccess().getGroup_1_0()); 

                    }

                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:470:1: ( ( rule__Chord__Group_1_0__0 )* )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:471:1: ( rule__Chord__Group_1_0__0 )*
                    {
                     before(grammarAccess.getChordAccess().getGroup_1_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:472:1: ( rule__Chord__Group_1_0__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:472:2: rule__Chord__Group_1_0__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Chord__Group_1_0__0_in_rule__Chord__Alternatives_1968);
                    	    rule__Chord__Group_1_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getChordAccess().getGroup_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:477:6: ( ( rule__Chord__Group_1_1__0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:477:6: ( ( rule__Chord__Group_1_1__0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:478:1: ( rule__Chord__Group_1_1__0 )
                    {
                     before(grammarAccess.getChordAccess().getGroup_1_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:479:1: ( rule__Chord__Group_1_1__0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:479:2: rule__Chord__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Chord__Group_1_1__0_in_rule__Chord__Alternatives_1989);
                    rule__Chord__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChordAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Chord__Alternatives_1"


    // $ANTLR start "rule__Chord__Alternatives_1_1_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:488:1: rule__Chord__Alternatives_1_1_2 : ( ( ( rule__Chord__InversionAssignment_1_1_2_0 ) ) | ( ( rule__Chord__InversionAssignment_1_1_2_1 ) ) );
    public final void rule__Chord__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:492:1: ( ( ( rule__Chord__InversionAssignment_1_1_2_0 ) ) | ( ( rule__Chord__InversionAssignment_1_1_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:493:1: ( ( rule__Chord__InversionAssignment_1_1_2_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:493:1: ( ( rule__Chord__InversionAssignment_1_1_2_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:494:1: ( rule__Chord__InversionAssignment_1_1_2_0 )
                    {
                     before(grammarAccess.getChordAccess().getInversionAssignment_1_1_2_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:495:1: ( rule__Chord__InversionAssignment_1_1_2_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:495:2: rule__Chord__InversionAssignment_1_1_2_0
                    {
                    pushFollow(FOLLOW_rule__Chord__InversionAssignment_1_1_2_0_in_rule__Chord__Alternatives_1_1_21022);
                    rule__Chord__InversionAssignment_1_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChordAccess().getInversionAssignment_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:499:6: ( ( rule__Chord__InversionAssignment_1_1_2_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:499:6: ( ( rule__Chord__InversionAssignment_1_1_2_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:500:1: ( rule__Chord__InversionAssignment_1_1_2_1 )
                    {
                     before(grammarAccess.getChordAccess().getInversionAssignment_1_1_2_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:501:1: ( rule__Chord__InversionAssignment_1_1_2_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:501:2: rule__Chord__InversionAssignment_1_1_2_1
                    {
                    pushFollow(FOLLOW_rule__Chord__InversionAssignment_1_1_2_1_in_rule__Chord__Alternatives_1_1_21040);
                    rule__Chord__InversionAssignment_1_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChordAccess().getInversionAssignment_1_1_2_1()); 

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
    // $ANTLR end "rule__Chord__Alternatives_1_1_2"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:512:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:516:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:517:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__01071);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__01074);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:524:1: rule__Document__Group__0__Impl : ( ( rule__Document__HeaderAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:528:1: ( ( ( rule__Document__HeaderAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:529:1: ( ( rule__Document__HeaderAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:529:1: ( ( rule__Document__HeaderAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:530:1: ( rule__Document__HeaderAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:531:1: ( rule__Document__HeaderAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:531:2: rule__Document__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl1101);
            rule__Document__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); 

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
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:541:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:545:1: ( rule__Document__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:546:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__11131);
            rule__Document__Group__1__Impl();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:552:1: rule__Document__Group__1__Impl : ( ( rule__Document__SongAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:556:1: ( ( ( rule__Document__SongAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:557:1: ( ( rule__Document__SongAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:557:1: ( ( rule__Document__SongAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:558:1: ( rule__Document__SongAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getSongAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:559:1: ( rule__Document__SongAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:559:2: rule__Document__SongAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl1158);
            rule__Document__SongAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSongAssignment_1()); 

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
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:573:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:577:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:578:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01192);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01195);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:585:1: rule__Header__Group__0__Impl : ( ( rule__Header__NofeedbackAssignment_0 )? ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:589:1: ( ( ( rule__Header__NofeedbackAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:590:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:590:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:591:1: ( rule__Header__NofeedbackAssignment_0 )?
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:592:1: ( rule__Header__NofeedbackAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:592:2: rule__Header__NofeedbackAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl1222);
                    rule__Header__NofeedbackAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); 

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
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:602:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:606:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:607:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11253);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11256);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:614:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:618:1: ( ( ( rule__Header__Group_1__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:619:1: ( ( rule__Header__Group_1__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:619:1: ( ( rule__Header__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:620:1: ( rule__Header__Group_1__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:621:1: ( rule__Header__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:621:2: rule__Header__Group_1__0
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl1283);
            rule__Header__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:631:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:635:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:636:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21313);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21316);
            rule__Header__Group__3();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:643:1: rule__Header__Group__2__Impl : ( ( rule__Header__Group_2__0 )? ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:647:1: ( ( ( rule__Header__Group_2__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:648:1: ( ( rule__Header__Group_2__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:648:1: ( ( rule__Header__Group_2__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:649:1: ( rule__Header__Group_2__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:650:1: ( rule__Header__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:650:2: rule__Header__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1343);
                    rule__Header__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeaderAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:660:1: rule__Header__Group__3 : rule__Header__Group__3__Impl ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:664:1: ( rule__Header__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:665:2: rule__Header__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31374);
            rule__Header__Group__3__Impl();

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
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:671:1: rule__Header__Group__3__Impl : ( ( rule__Header__Group_3__0 )? ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:675:1: ( ( ( rule__Header__Group_3__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:676:1: ( ( rule__Header__Group_3__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:676:1: ( ( rule__Header__Group_3__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:677:1: ( rule__Header__Group_3__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:678:1: ( rule__Header__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:678:2: rule__Header__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1401);
                    rule__Header__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeaderAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group_1__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:696:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:701:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01440);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01443);
            rule__Header__Group_1__1();

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
    // $ANTLR end "rule__Header__Group_1__0"


    // $ANTLR start "rule__Header__Group_1__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:708:1: rule__Header__Group_1__0__Impl : ( 'title' ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:712:1: ( ( 'title' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:713:1: ( 'title' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:713:1: ( 'title' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:714:1: 'title'
            {
             before(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Header__Group_1__0__Impl1471); 
             after(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); 

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
    // $ANTLR end "rule__Header__Group_1__0__Impl"


    // $ANTLR start "rule__Header__Group_1__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:727:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl rule__Header__Group_1__2 ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:731:1: ( rule__Header__Group_1__1__Impl rule__Header__Group_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:732:2: rule__Header__Group_1__1__Impl rule__Header__Group_1__2
            {
            pushFollow(FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11502);
            rule__Header__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11505);
            rule__Header__Group_1__2();

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
    // $ANTLR end "rule__Header__Group_1__1"


    // $ANTLR start "rule__Header__Group_1__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:739:1: rule__Header__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:743:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:744:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:744:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:745:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_1__1__Impl1533); 
             after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Header__Group_1__1__Impl"


    // $ANTLR start "rule__Header__Group_1__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:758:1: rule__Header__Group_1__2 : rule__Header__Group_1__2__Impl ;
    public final void rule__Header__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:762:1: ( rule__Header__Group_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:763:2: rule__Header__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21564);
            rule__Header__Group_1__2__Impl();

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
    // $ANTLR end "rule__Header__Group_1__2"


    // $ANTLR start "rule__Header__Group_1__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:769:1: rule__Header__Group_1__2__Impl : ( ( rule__Header__SongNameAssignment_1_2 ) ) ;
    public final void rule__Header__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:773:1: ( ( ( rule__Header__SongNameAssignment_1_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:774:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:774:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:775:1: ( rule__Header__SongNameAssignment_1_2 )
            {
             before(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:776:1: ( rule__Header__SongNameAssignment_1_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:776:2: rule__Header__SongNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1591);
            rule__Header__SongNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); 

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
    // $ANTLR end "rule__Header__Group_1__2__Impl"


    // $ANTLR start "rule__Header__Group_2__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:792:1: rule__Header__Group_2__0 : rule__Header__Group_2__0__Impl rule__Header__Group_2__1 ;
    public final void rule__Header__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: ( rule__Header__Group_2__0__Impl rule__Header__Group_2__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:797:2: rule__Header__Group_2__0__Impl rule__Header__Group_2__1
            {
            pushFollow(FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01627);
            rule__Header__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01630);
            rule__Header__Group_2__1();

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
    // $ANTLR end "rule__Header__Group_2__0"


    // $ANTLR start "rule__Header__Group_2__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:804:1: rule__Header__Group_2__0__Impl : ( 'tempo' ) ;
    public final void rule__Header__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:808:1: ( ( 'tempo' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:809:1: ( 'tempo' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:809:1: ( 'tempo' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:810:1: 'tempo'
            {
             before(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_2__0__Impl1658); 
             after(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); 

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
    // $ANTLR end "rule__Header__Group_2__0__Impl"


    // $ANTLR start "rule__Header__Group_2__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:823:1: rule__Header__Group_2__1 : rule__Header__Group_2__1__Impl rule__Header__Group_2__2 ;
    public final void rule__Header__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:827:1: ( rule__Header__Group_2__1__Impl rule__Header__Group_2__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:828:2: rule__Header__Group_2__1__Impl rule__Header__Group_2__2
            {
            pushFollow(FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11689);
            rule__Header__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11692);
            rule__Header__Group_2__2();

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
    // $ANTLR end "rule__Header__Group_2__1"


    // $ANTLR start "rule__Header__Group_2__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:835:1: rule__Header__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:839:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:840:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:840:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:841:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_2__1__Impl1720); 
             after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Header__Group_2__1__Impl"


    // $ANTLR start "rule__Header__Group_2__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:854:1: rule__Header__Group_2__2 : rule__Header__Group_2__2__Impl ;
    public final void rule__Header__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:858:1: ( rule__Header__Group_2__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:859:2: rule__Header__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21751);
            rule__Header__Group_2__2__Impl();

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
    // $ANTLR end "rule__Header__Group_2__2"


    // $ANTLR start "rule__Header__Group_2__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:865:1: rule__Header__Group_2__2__Impl : ( ( rule__Header__TempoAssignment_2_2 ) ) ;
    public final void rule__Header__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:869:1: ( ( ( rule__Header__TempoAssignment_2_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:870:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:870:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:871:1: ( rule__Header__TempoAssignment_2_2 )
            {
             before(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:872:1: ( rule__Header__TempoAssignment_2_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:872:2: rule__Header__TempoAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1778);
            rule__Header__TempoAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); 

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
    // $ANTLR end "rule__Header__Group_2__2__Impl"


    // $ANTLR start "rule__Header__Group_3__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:888:1: rule__Header__Group_3__0 : rule__Header__Group_3__0__Impl rule__Header__Group_3__1 ;
    public final void rule__Header__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:892:1: ( rule__Header__Group_3__0__Impl rule__Header__Group_3__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:893:2: rule__Header__Group_3__0__Impl rule__Header__Group_3__1
            {
            pushFollow(FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01814);
            rule__Header__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01817);
            rule__Header__Group_3__1();

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
    // $ANTLR end "rule__Header__Group_3__0"


    // $ANTLR start "rule__Header__Group_3__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:900:1: rule__Header__Group_3__0__Impl : ( 'key' ) ;
    public final void rule__Header__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:904:1: ( ( 'key' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:905:1: ( 'key' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:905:1: ( 'key' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:906:1: 'key'
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Header__Group_3__0__Impl1845); 
             after(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); 

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
    // $ANTLR end "rule__Header__Group_3__0__Impl"


    // $ANTLR start "rule__Header__Group_3__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:919:1: rule__Header__Group_3__1 : rule__Header__Group_3__1__Impl rule__Header__Group_3__2 ;
    public final void rule__Header__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:923:1: ( rule__Header__Group_3__1__Impl rule__Header__Group_3__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:924:2: rule__Header__Group_3__1__Impl rule__Header__Group_3__2
            {
            pushFollow(FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11876);
            rule__Header__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11879);
            rule__Header__Group_3__2();

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
    // $ANTLR end "rule__Header__Group_3__1"


    // $ANTLR start "rule__Header__Group_3__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:931:1: rule__Header__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:935:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:936:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:936:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:937:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_3__1__Impl1907); 
             after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Header__Group_3__1__Impl"


    // $ANTLR start "rule__Header__Group_3__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:950:1: rule__Header__Group_3__2 : rule__Header__Group_3__2__Impl ;
    public final void rule__Header__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:954:1: ( rule__Header__Group_3__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:955:2: rule__Header__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21938);
            rule__Header__Group_3__2__Impl();

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
    // $ANTLR end "rule__Header__Group_3__2"


    // $ANTLR start "rule__Header__Group_3__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:961:1: rule__Header__Group_3__2__Impl : ( ( rule__Header__KeyAssignment_3_2 ) ) ;
    public final void rule__Header__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:965:1: ( ( ( rule__Header__KeyAssignment_3_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:966:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:966:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:967:1: ( rule__Header__KeyAssignment_3_2 )
            {
             before(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:968:1: ( rule__Header__KeyAssignment_3_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:968:2: rule__Header__KeyAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl1965);
            rule__Header__KeyAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); 

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
    // $ANTLR end "rule__Header__Group_3__2__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:984:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:988:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:989:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__02001);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__02004);
            rule__Key__Group__1();

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
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:996:1: rule__Key__Group__0__Impl : ( ( rule__Key__NoteAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1000:1: ( ( ( rule__Key__NoteAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1001:1: ( ( rule__Key__NoteAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1001:1: ( ( rule__Key__NoteAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1002:1: ( rule__Key__NoteAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getNoteAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1003:1: ( rule__Key__NoteAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1003:2: rule__Key__NoteAssignment_0
            {
            pushFollow(FOLLOW_rule__Key__NoteAssignment_0_in_rule__Key__Group__0__Impl2031);
            rule__Key__NoteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getNoteAssignment_0()); 

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
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1013:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1017:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1018:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__12061);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__2_in_rule__Key__Group__12064);
            rule__Key__Group__2();

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
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1025:1: rule__Key__Group__1__Impl : ( ( rule__Key__AccidentalAssignment_1 )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1029:1: ( ( ( rule__Key__AccidentalAssignment_1 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1030:1: ( ( rule__Key__AccidentalAssignment_1 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1030:1: ( ( rule__Key__AccidentalAssignment_1 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1031:1: ( rule__Key__AccidentalAssignment_1 )?
            {
             before(grammarAccess.getKeyAccess().getAccidentalAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1032:1: ( rule__Key__AccidentalAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ACCIDENTAL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1032:2: rule__Key__AccidentalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Key__AccidentalAssignment_1_in_rule__Key__Group__1__Impl2091);
                    rule__Key__AccidentalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyAccess().getAccidentalAssignment_1()); 

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
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1042:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1046:1: ( rule__Key__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1047:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__22122);
            rule__Key__Group__2__Impl();

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
    // $ANTLR end "rule__Key__Group__2"


    // $ANTLR start "rule__Key__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1053:1: rule__Key__Group__2__Impl : ( ( rule__Key__Alternatives_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1057:1: ( ( ( rule__Key__Alternatives_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1058:1: ( ( rule__Key__Alternatives_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1058:1: ( ( rule__Key__Alternatives_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1059:1: ( rule__Key__Alternatives_2 )
            {
             before(grammarAccess.getKeyAccess().getAlternatives_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1060:1: ( rule__Key__Alternatives_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1060:2: rule__Key__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Key__Alternatives_2_in_rule__Key__Group__2__Impl2149);
            rule__Key__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Key__Group__2__Impl"


    // $ANTLR start "rule__Instrument__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1076:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1080:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1081:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__02185);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__02188);
            rule__Instrument__Group__1();

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
    // $ANTLR end "rule__Instrument__Group__0"


    // $ANTLR start "rule__Instrument__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1088:1: rule__Instrument__Group__0__Impl : ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1092:1: ( ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1093:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1093:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1094:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1095:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1095:2: rule__Instrument__InstrumentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl2215);
            rule__Instrument__InstrumentNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 

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
    // $ANTLR end "rule__Instrument__Group__0__Impl"


    // $ANTLR start "rule__Instrument__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1105:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1109:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1110:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__12245);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__12248);
            rule__Instrument__Group__2();

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
    // $ANTLR end "rule__Instrument__Group__1"


    // $ANTLR start "rule__Instrument__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1117:1: rule__Instrument__Group__1__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1121:1: ( ( '{' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1122:1: ( '{' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1122:1: ( '{' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1123:1: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Instrument__Group__1__Impl2276); 
             after(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Instrument__Group__1__Impl"


    // $ANTLR start "rule__Instrument__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1136:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1140:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1141:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__22307);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__22310);
            rule__Instrument__Group__3();

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
    // $ANTLR end "rule__Instrument__Group__2"


    // $ANTLR start "rule__Instrument__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1148:1: rule__Instrument__Group__2__Impl : ( ( rule__Instrument__SequencesAssignment_2 )* ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1152:1: ( ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1153:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1153:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1154:1: ( rule__Instrument__SequencesAssignment_2 )*
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1155:1: ( rule__Instrument__SequencesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_NOTE_ID||(LA12_0>=RULE_MEASURE && LA12_0<=RULE_OCTAVE)||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1155:2: rule__Instrument__SequencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2337);
            	    rule__Instrument__SequencesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 

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
    // $ANTLR end "rule__Instrument__Group__2__Impl"


    // $ANTLR start "rule__Instrument__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1165:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1169:1: ( rule__Instrument__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1170:2: rule__Instrument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32368);
            rule__Instrument__Group__3__Impl();

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
    // $ANTLR end "rule__Instrument__Group__3"


    // $ANTLR start "rule__Instrument__Group__3__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1176:1: rule__Instrument__Group__3__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1180:1: ( ( '}' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1181:1: ( '}' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1181:1: ( '}' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1182:1: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Instrument__Group__3__Impl2396); 
             after(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Instrument__Group__3__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1203:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1207:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1208:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02435);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02438);
            rule__Note__Group__1();

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
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1215:1: rule__Note__Group__0__Impl : ( ( rule__Note__OctaveAssignment_0 )? ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1219:1: ( ( ( rule__Note__OctaveAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1220:1: ( ( rule__Note__OctaveAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1220:1: ( ( rule__Note__OctaveAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1221:1: ( rule__Note__OctaveAssignment_0 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1222:1: ( rule__Note__OctaveAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_OCTAVE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1222:2: rule__Note__OctaveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2465);
                    rule__Note__OctaveAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 

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
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1232:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1236:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1237:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12496);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12499);
            rule__Note__Group__2();

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
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1244:1: rule__Note__Group__1__Impl : ( ( rule__Note__NoteAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1248:1: ( ( ( rule__Note__NoteAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1249:1: ( ( rule__Note__NoteAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1249:1: ( ( rule__Note__NoteAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1250:1: ( rule__Note__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNoteAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:1: ( rule__Note__NoteAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:2: rule__Note__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2526);
            rule__Note__NoteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNoteAssignment_1()); 

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
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1261:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1265:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1266:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22556);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22559);
            rule__Note__Group__3();

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
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1273:1: rule__Note__Group__2__Impl : ( ( rule__Note__AccidentalAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1277:1: ( ( ( rule__Note__AccidentalAssignment_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1278:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1278:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1279:1: ( rule__Note__AccidentalAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1280:1: ( rule__Note__AccidentalAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ACCIDENTAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1280:2: rule__Note__AccidentalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2586);
                    rule__Note__AccidentalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 

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
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1290:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1294:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1295:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32617);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32620);
            rule__Note__Group__4();

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
    // $ANTLR end "rule__Note__Group__3"


    // $ANTLR start "rule__Note__Group__3__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1302:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1306:1: ( ( ( rule__Note__DurationAssignment_3 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1307:1: ( ( rule__Note__DurationAssignment_3 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1307:1: ( ( rule__Note__DurationAssignment_3 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1308:1: ( rule__Note__DurationAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1309:1: ( rule__Note__DurationAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DURATION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1309:2: rule__Note__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2647);
                    rule__Note__DurationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getDurationAssignment_3()); 

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
    // $ANTLR end "rule__Note__Group__3__Impl"


    // $ANTLR start "rule__Note__Group__4"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1319:1: rule__Note__Group__4 : rule__Note__Group__4__Impl rule__Note__Group__5 ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1323:1: ( rule__Note__Group__4__Impl rule__Note__Group__5 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1324:2: rule__Note__Group__4__Impl rule__Note__Group__5
            {
            pushFollow(FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42678);
            rule__Note__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__5_in_rule__Note__Group__42681);
            rule__Note__Group__5();

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
    // $ANTLR end "rule__Note__Group__4"


    // $ANTLR start "rule__Note__Group__4__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1331:1: rule__Note__Group__4__Impl : ( ( rule__Note__PointAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1335:1: ( ( ( rule__Note__PointAssignment_4 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1336:1: ( ( rule__Note__PointAssignment_4 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1336:1: ( ( rule__Note__PointAssignment_4 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1337:1: ( rule__Note__PointAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getPointAssignment_4()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1338:1: ( rule__Note__PointAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1338:2: rule__Note__PointAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2708);
                    rule__Note__PointAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getPointAssignment_4()); 

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
    // $ANTLR end "rule__Note__Group__4__Impl"


    // $ANTLR start "rule__Note__Group__5"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1348:1: rule__Note__Group__5 : rule__Note__Group__5__Impl ;
    public final void rule__Note__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1352:1: ( rule__Note__Group__5__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1353:2: rule__Note__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__52739);
            rule__Note__Group__5__Impl();

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
    // $ANTLR end "rule__Note__Group__5"


    // $ANTLR start "rule__Note__Group__5__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1359:1: rule__Note__Group__5__Impl : ( ( rule__Note__TieAssignment_5 )? ) ;
    public final void rule__Note__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1363:1: ( ( ( rule__Note__TieAssignment_5 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1364:1: ( ( rule__Note__TieAssignment_5 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1364:1: ( ( rule__Note__TieAssignment_5 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1365:1: ( rule__Note__TieAssignment_5 )?
            {
             before(grammarAccess.getNoteAccess().getTieAssignment_5()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1366:1: ( rule__Note__TieAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1366:2: rule__Note__TieAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl2766);
                    rule__Note__TieAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getTieAssignment_5()); 

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
    // $ANTLR end "rule__Note__Group__5__Impl"


    // $ANTLR start "rule__Chord__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1388:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1392:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1393:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02809);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02812);
            rule__Chord__Group__1();

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
    // $ANTLR end "rule__Chord__Group__0"


    // $ANTLR start "rule__Chord__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1400:1: rule__Chord__Group__0__Impl : ( ( rule__Chord__ChordNotesAssignment_0 ) ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1404:1: ( ( ( rule__Chord__ChordNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1405:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1405:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1406:1: ( rule__Chord__ChordNotesAssignment_0 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1407:1: ( rule__Chord__ChordNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1407:2: rule__Chord__ChordNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2839);
            rule__Chord__ChordNotesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 

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
    // $ANTLR end "rule__Chord__Group__0__Impl"


    // $ANTLR start "rule__Chord__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1417:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1421:1: ( rule__Chord__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1422:2: rule__Chord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12869);
            rule__Chord__Group__1__Impl();

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
    // $ANTLR end "rule__Chord__Group__1"


    // $ANTLR start "rule__Chord__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1428:1: rule__Chord__Group__1__Impl : ( ( rule__Chord__Alternatives_1 ) ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1432:1: ( ( ( rule__Chord__Alternatives_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1433:1: ( ( rule__Chord__Alternatives_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1433:1: ( ( rule__Chord__Alternatives_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1434:1: ( rule__Chord__Alternatives_1 )
            {
             before(grammarAccess.getChordAccess().getAlternatives_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1435:1: ( rule__Chord__Alternatives_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1435:2: rule__Chord__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Chord__Alternatives_1_in_rule__Chord__Group__1__Impl2896);
            rule__Chord__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Chord__Group__1__Impl"


    // $ANTLR start "rule__Chord__Group_1_0__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1449:1: rule__Chord__Group_1_0__0 : rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1 ;
    public final void rule__Chord__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1453:1: ( rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1454:2: rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_0__0__Impl_in_rule__Chord__Group_1_0__02930);
            rule__Chord__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_0__1_in_rule__Chord__Group_1_0__02933);
            rule__Chord__Group_1_0__1();

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
    // $ANTLR end "rule__Chord__Group_1_0__0"


    // $ANTLR start "rule__Chord__Group_1_0__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1461:1: rule__Chord__Group_1_0__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1465:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1466:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1466:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1467:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Chord__Group_1_0__0__Impl2961); 
             after(grammarAccess.getChordAccess().getSolidusKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Chord__Group_1_0__0__Impl"


    // $ANTLR start "rule__Chord__Group_1_0__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1480:1: rule__Chord__Group_1_0__1 : rule__Chord__Group_1_0__1__Impl ;
    public final void rule__Chord__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1484:1: ( rule__Chord__Group_1_0__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1485:2: rule__Chord__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_0__1__Impl_in_rule__Chord__Group_1_0__12992);
            rule__Chord__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Chord__Group_1_0__1"


    // $ANTLR start "rule__Chord__Group_1_0__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1491:1: rule__Chord__Group_1_0__1__Impl : ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) ) ;
    public final void rule__Chord__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1495:1: ( ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1496:1: ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1496:1: ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1497:1: ( rule__Chord__ChordNotesAssignment_1_0_1 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_1_0_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1498:1: ( rule__Chord__ChordNotesAssignment_1_0_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1498:2: rule__Chord__ChordNotesAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_1_0_1_in_rule__Chord__Group_1_0__1__Impl3019);
            rule__Chord__ChordNotesAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getChordNotesAssignment_1_0_1()); 

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
    // $ANTLR end "rule__Chord__Group_1_0__1__Impl"


    // $ANTLR start "rule__Chord__Group_1_1__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1512:1: rule__Chord__Group_1_1__0 : rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1 ;
    public final void rule__Chord__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1516:1: ( rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1517:2: rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__0__Impl_in_rule__Chord__Group_1_1__03053);
            rule__Chord__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_1__1_in_rule__Chord__Group_1_1__03056);
            rule__Chord__Group_1_1__1();

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
    // $ANTLR end "rule__Chord__Group_1_1__0"


    // $ANTLR start "rule__Chord__Group_1_1__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1524:1: rule__Chord__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1528:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1529:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1529:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1530:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Chord__Group_1_1__0__Impl3084); 
             after(grammarAccess.getChordAccess().getSolidusKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Chord__Group_1_1__0__Impl"


    // $ANTLR start "rule__Chord__Group_1_1__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1543:1: rule__Chord__Group_1_1__1 : rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2 ;
    public final void rule__Chord__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1547:1: ( rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1548:2: rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__1__Impl_in_rule__Chord__Group_1_1__13115);
            rule__Chord__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_1__2_in_rule__Chord__Group_1_1__13118);
            rule__Chord__Group_1_1__2();

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
    // $ANTLR end "rule__Chord__Group_1_1__1"


    // $ANTLR start "rule__Chord__Group_1_1__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1555:1: rule__Chord__Group_1_1__1__Impl : ( ( rule__Chord__ChordNameAssignment_1_1_1 ) ) ;
    public final void rule__Chord__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1559:1: ( ( ( rule__Chord__ChordNameAssignment_1_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1560:1: ( ( rule__Chord__ChordNameAssignment_1_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1560:1: ( ( rule__Chord__ChordNameAssignment_1_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1561:1: ( rule__Chord__ChordNameAssignment_1_1_1 )
            {
             before(grammarAccess.getChordAccess().getChordNameAssignment_1_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1562:1: ( rule__Chord__ChordNameAssignment_1_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1562:2: rule__Chord__ChordNameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNameAssignment_1_1_1_in_rule__Chord__Group_1_1__1__Impl3145);
            rule__Chord__ChordNameAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getChordNameAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Chord__Group_1_1__1__Impl"


    // $ANTLR start "rule__Chord__Group_1_1__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1572:1: rule__Chord__Group_1_1__2 : rule__Chord__Group_1_1__2__Impl ;
    public final void rule__Chord__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1576:1: ( rule__Chord__Group_1_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1577:2: rule__Chord__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__2__Impl_in_rule__Chord__Group_1_1__23175);
            rule__Chord__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Chord__Group_1_1__2"


    // $ANTLR start "rule__Chord__Group_1_1__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1583:1: rule__Chord__Group_1_1__2__Impl : ( ( rule__Chord__Alternatives_1_1_2 )? ) ;
    public final void rule__Chord__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1587:1: ( ( ( rule__Chord__Alternatives_1_1_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1588:1: ( ( rule__Chord__Alternatives_1_1_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1588:1: ( ( rule__Chord__Alternatives_1_1_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1589:1: ( rule__Chord__Alternatives_1_1_2 )?
            {
             before(grammarAccess.getChordAccess().getAlternatives_1_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1590:1: ( rule__Chord__Alternatives_1_1_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1590:2: rule__Chord__Alternatives_1_1_2
                    {
                    pushFollow(FOLLOW_rule__Chord__Alternatives_1_1_2_in_rule__Chord__Group_1_1__2__Impl3202);
                    rule__Chord__Alternatives_1_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChordAccess().getAlternatives_1_1_2()); 

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
    // $ANTLR end "rule__Chord__Group_1_1__2__Impl"


    // $ANTLR start "rule__Harmony__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1606:1: rule__Harmony__Group__0 : rule__Harmony__Group__0__Impl rule__Harmony__Group__1 ;
    public final void rule__Harmony__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1610:1: ( rule__Harmony__Group__0__Impl rule__Harmony__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1611:2: rule__Harmony__Group__0__Impl rule__Harmony__Group__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__03239);
            rule__Harmony__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__03242);
            rule__Harmony__Group__1();

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
    // $ANTLR end "rule__Harmony__Group__0"


    // $ANTLR start "rule__Harmony__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1618:1: rule__Harmony__Group__0__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) ;
    public final void rule__Harmony__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1622:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1623:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1623:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1624:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1625:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1625:2: rule__Harmony__HarmonyNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl3269);
            rule__Harmony__HarmonyNotesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); 

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
    // $ANTLR end "rule__Harmony__Group__0__Impl"


    // $ANTLR start "rule__Harmony__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1635:1: rule__Harmony__Group__1 : rule__Harmony__Group__1__Impl rule__Harmony__Group__2 ;
    public final void rule__Harmony__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1639:1: ( rule__Harmony__Group__1__Impl rule__Harmony__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1640:2: rule__Harmony__Group__1__Impl rule__Harmony__Group__2
            {
            pushFollow(FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__13299);
            rule__Harmony__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__13302);
            rule__Harmony__Group__2();

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
    // $ANTLR end "rule__Harmony__Group__1"


    // $ANTLR start "rule__Harmony__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1647:1: rule__Harmony__Group__1__Impl : ( ( rule__Harmony__Group_1__0 )* ) ;
    public final void rule__Harmony__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1651:1: ( ( ( rule__Harmony__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1652:1: ( ( rule__Harmony__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1652:1: ( ( rule__Harmony__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1653:1: ( rule__Harmony__Group_1__0 )*
            {
             before(grammarAccess.getHarmonyAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1654:1: ( rule__Harmony__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1654:2: rule__Harmony__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl3329);
            	    rule__Harmony__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHarmonyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Harmony__Group__1__Impl"


    // $ANTLR start "rule__Harmony__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1664:1: rule__Harmony__Group__2 : rule__Harmony__Group__2__Impl rule__Harmony__Group__3 ;
    public final void rule__Harmony__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1668:1: ( rule__Harmony__Group__2__Impl rule__Harmony__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1669:2: rule__Harmony__Group__2__Impl rule__Harmony__Group__3
            {
            pushFollow(FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__23360);
            rule__Harmony__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__23363);
            rule__Harmony__Group__3();

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
    // $ANTLR end "rule__Harmony__Group__2"


    // $ANTLR start "rule__Harmony__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1676:1: rule__Harmony__Group__2__Impl : ( '[' ) ;
    public final void rule__Harmony__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1680:1: ( ( '[' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1681:1: ( '[' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1681:1: ( '[' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1682:1: '['
            {
             before(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Harmony__Group__2__Impl3391); 
             after(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Harmony__Group__2__Impl"


    // $ANTLR start "rule__Harmony__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1695:1: rule__Harmony__Group__3 : rule__Harmony__Group__3__Impl rule__Harmony__Group__4 ;
    public final void rule__Harmony__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1699:1: ( rule__Harmony__Group__3__Impl rule__Harmony__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1700:2: rule__Harmony__Group__3__Impl rule__Harmony__Group__4
            {
            pushFollow(FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__33422);
            rule__Harmony__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__33425);
            rule__Harmony__Group__4();

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
    // $ANTLR end "rule__Harmony__Group__3"


    // $ANTLR start "rule__Harmony__Group__3__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1707:1: rule__Harmony__Group__3__Impl : ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) ;
    public final void rule__Harmony__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1711:1: ( ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1712:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1712:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1713:1: ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1713:1: ( ( rule__Harmony__NotesAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1714:1: ( rule__Harmony__NotesAssignment_3 )
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1715:1: ( rule__Harmony__NotesAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1715:2: rule__Harmony__NotesAssignment_3
            {
            pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3454);
            rule__Harmony__NotesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1718:1: ( ( rule__Harmony__NotesAssignment_3 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1719:1: ( rule__Harmony__NotesAssignment_3 )*
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1720:1: ( rule__Harmony__NotesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_NOTE_ID||LA20_0==RULE_OCTAVE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1720:2: rule__Harmony__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3466);
            	    rule__Harmony__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 

            }


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
    // $ANTLR end "rule__Harmony__Group__3__Impl"


    // $ANTLR start "rule__Harmony__Group__4"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1731:1: rule__Harmony__Group__4 : rule__Harmony__Group__4__Impl ;
    public final void rule__Harmony__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1735:1: ( rule__Harmony__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1736:2: rule__Harmony__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__43499);
            rule__Harmony__Group__4__Impl();

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
    // $ANTLR end "rule__Harmony__Group__4"


    // $ANTLR start "rule__Harmony__Group__4__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1742:1: rule__Harmony__Group__4__Impl : ( ']' ) ;
    public final void rule__Harmony__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1746:1: ( ( ']' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1747:1: ( ']' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1747:1: ( ']' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1748:1: ']'
            {
             before(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Harmony__Group__4__Impl3527); 
             after(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Harmony__Group__4__Impl"


    // $ANTLR start "rule__Harmony__Group_1__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1771:1: rule__Harmony__Group_1__0 : rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 ;
    public final void rule__Harmony__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1775:1: ( rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1776:2: rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__03568);
            rule__Harmony__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__03571);
            rule__Harmony__Group_1__1();

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
    // $ANTLR end "rule__Harmony__Group_1__0"


    // $ANTLR start "rule__Harmony__Group_1__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1783:1: rule__Harmony__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Harmony__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1787:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1788:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1788:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1789:1: '/'
            {
             before(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Harmony__Group_1__0__Impl3599); 
             after(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); 

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
    // $ANTLR end "rule__Harmony__Group_1__0__Impl"


    // $ANTLR start "rule__Harmony__Group_1__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1802:1: rule__Harmony__Group_1__1 : rule__Harmony__Group_1__1__Impl ;
    public final void rule__Harmony__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1806:1: ( rule__Harmony__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1807:2: rule__Harmony__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__13630);
            rule__Harmony__Group_1__1__Impl();

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
    // $ANTLR end "rule__Harmony__Group_1__1"


    // $ANTLR start "rule__Harmony__Group_1__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1813:1: rule__Harmony__Group_1__1__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) ;
    public final void rule__Harmony__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1817:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1818:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1818:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1819:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1820:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1820:2: rule__Harmony__HarmonyNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl3657);
            rule__Harmony__HarmonyNotesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); 

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
    // $ANTLR end "rule__Harmony__Group_1__1__Impl"


    // $ANTLR start "rule__Tuplet__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1834:1: rule__Tuplet__Group__0 : rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1 ;
    public final void rule__Tuplet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1838:1: ( rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1839:2: rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__0__Impl_in_rule__Tuplet__Group__03691);
            rule__Tuplet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__1_in_rule__Tuplet__Group__03694);
            rule__Tuplet__Group__1();

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
    // $ANTLR end "rule__Tuplet__Group__0"


    // $ANTLR start "rule__Tuplet__Group__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1846:1: rule__Tuplet__Group__0__Impl : ( '(' ) ;
    public final void rule__Tuplet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1850:1: ( ( '(' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1851:1: ( '(' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1851:1: ( '(' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1852:1: '('
            {
             before(grammarAccess.getTupletAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Tuplet__Group__0__Impl3722); 
             after(grammarAccess.getTupletAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Tuplet__Group__0__Impl"


    // $ANTLR start "rule__Tuplet__Group__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1865:1: rule__Tuplet__Group__1 : rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2 ;
    public final void rule__Tuplet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1869:1: ( rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1870:2: rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__1__Impl_in_rule__Tuplet__Group__13753);
            rule__Tuplet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__2_in_rule__Tuplet__Group__13756);
            rule__Tuplet__Group__2();

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
    // $ANTLR end "rule__Tuplet__Group__1"


    // $ANTLR start "rule__Tuplet__Group__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1877:1: rule__Tuplet__Group__1__Impl : ( ( ( rule__Tuplet__NotesAssignment_1 ) ) ( ( rule__Tuplet__NotesAssignment_1 )* ) ) ;
    public final void rule__Tuplet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1881:1: ( ( ( ( rule__Tuplet__NotesAssignment_1 ) ) ( ( rule__Tuplet__NotesAssignment_1 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1882:1: ( ( ( rule__Tuplet__NotesAssignment_1 ) ) ( ( rule__Tuplet__NotesAssignment_1 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1882:1: ( ( ( rule__Tuplet__NotesAssignment_1 ) ) ( ( rule__Tuplet__NotesAssignment_1 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1883:1: ( ( rule__Tuplet__NotesAssignment_1 ) ) ( ( rule__Tuplet__NotesAssignment_1 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1883:1: ( ( rule__Tuplet__NotesAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1884:1: ( rule__Tuplet__NotesAssignment_1 )
            {
             before(grammarAccess.getTupletAccess().getNotesAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1885:1: ( rule__Tuplet__NotesAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1885:2: rule__Tuplet__NotesAssignment_1
            {
            pushFollow(FOLLOW_rule__Tuplet__NotesAssignment_1_in_rule__Tuplet__Group__1__Impl3785);
            rule__Tuplet__NotesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTupletAccess().getNotesAssignment_1()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1888:1: ( ( rule__Tuplet__NotesAssignment_1 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1889:1: ( rule__Tuplet__NotesAssignment_1 )*
            {
             before(grammarAccess.getTupletAccess().getNotesAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1890:1: ( rule__Tuplet__NotesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_NOTE_ID||LA21_0==RULE_OCTAVE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1890:2: rule__Tuplet__NotesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Tuplet__NotesAssignment_1_in_rule__Tuplet__Group__1__Impl3797);
            	    rule__Tuplet__NotesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTupletAccess().getNotesAssignment_1()); 

            }


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
    // $ANTLR end "rule__Tuplet__Group__1__Impl"


    // $ANTLR start "rule__Tuplet__Group__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1901:1: rule__Tuplet__Group__2 : rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3 ;
    public final void rule__Tuplet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1905:1: ( rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1906:2: rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__2__Impl_in_rule__Tuplet__Group__23830);
            rule__Tuplet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__3_in_rule__Tuplet__Group__23833);
            rule__Tuplet__Group__3();

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
    // $ANTLR end "rule__Tuplet__Group__2"


    // $ANTLR start "rule__Tuplet__Group__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1913:1: rule__Tuplet__Group__2__Impl : ( ')' ) ;
    public final void rule__Tuplet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1917:1: ( ( ')' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1918:1: ( ')' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1918:1: ( ')' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1919:1: ')'
            {
             before(grammarAccess.getTupletAccess().getRightParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Tuplet__Group__2__Impl3861); 
             after(grammarAccess.getTupletAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Tuplet__Group__2__Impl"


    // $ANTLR start "rule__Tuplet__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1932:1: rule__Tuplet__Group__3 : rule__Tuplet__Group__3__Impl ;
    public final void rule__Tuplet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1936:1: ( rule__Tuplet__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1937:2: rule__Tuplet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__3__Impl_in_rule__Tuplet__Group__33892);
            rule__Tuplet__Group__3__Impl();

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
    // $ANTLR end "rule__Tuplet__Group__3"


    // $ANTLR start "rule__Tuplet__Group__3__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1943:1: rule__Tuplet__Group__3__Impl : ( ( rule__Tuplet__DurationAssignment_3 ) ) ;
    public final void rule__Tuplet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1947:1: ( ( ( rule__Tuplet__DurationAssignment_3 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1948:1: ( ( rule__Tuplet__DurationAssignment_3 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1948:1: ( ( rule__Tuplet__DurationAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1949:1: ( rule__Tuplet__DurationAssignment_3 )
            {
             before(grammarAccess.getTupletAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1950:1: ( rule__Tuplet__DurationAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1950:2: rule__Tuplet__DurationAssignment_3
            {
            pushFollow(FOLLOW_rule__Tuplet__DurationAssignment_3_in_rule__Tuplet__Group__3__Impl3919);
            rule__Tuplet__DurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTupletAccess().getDurationAssignment_3()); 

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
    // $ANTLR end "rule__Tuplet__Group__3__Impl"


    // $ANTLR start "rule__Document__HeaderAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1969:1: rule__Document__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Document__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1973:1: ( ( ruleHeader ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1974:1: ( ruleHeader )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1974:1: ( ruleHeader )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1975:1: ruleHeader
            {
             before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03962);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Document__HeaderAssignment_0"


    // $ANTLR start "rule__Document__SongAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1984:1: rule__Document__SongAssignment_1 : ( ruleSong ) ;
    public final void rule__Document__SongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1988:1: ( ( ruleSong ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1989:1: ( ruleSong )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1989:1: ( ruleSong )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1990:1: ruleSong
            {
             before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Document__SongAssignment_13993);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Document__SongAssignment_1"


    // $ANTLR start "rule__Header__NofeedbackAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1999:1: rule__Header__NofeedbackAssignment_0 : ( ( 'no-feedback' ) ) ;
    public final void rule__Header__NofeedbackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2003:1: ( ( ( 'no-feedback' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2004:1: ( ( 'no-feedback' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2004:1: ( ( 'no-feedback' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2005:1: ( 'no-feedback' )
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2006:1: ( 'no-feedback' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2007:1: 'no-feedback'
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Header__NofeedbackAssignment_04029); 
             after(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 

            }

             after(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 

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
    // $ANTLR end "rule__Header__NofeedbackAssignment_0"


    // $ANTLR start "rule__Header__SongNameAssignment_1_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2022:1: rule__Header__SongNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Header__SongNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2026:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2027:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2027:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2028:1: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_24068); 
             after(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Header__SongNameAssignment_1_2"


    // $ANTLR start "rule__Header__TempoAssignment_2_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2037:1: rule__Header__TempoAssignment_2_2 : ( ruleTempo ) ;
    public final void rule__Header__TempoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2041:1: ( ( ruleTempo ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2042:1: ( ruleTempo )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2042:1: ( ruleTempo )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2043:1: ruleTempo
            {
             before(grammarAccess.getHeaderAccess().getTempoTempoParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTempo_in_rule__Header__TempoAssignment_2_24099);
            ruleTempo();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getTempoTempoParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Header__TempoAssignment_2_2"


    // $ANTLR start "rule__Header__KeyAssignment_3_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2052:1: rule__Header__KeyAssignment_3_2 : ( ruleKey ) ;
    public final void rule__Header__KeyAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2056:1: ( ( ruleKey ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2057:1: ( ruleKey )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2057:1: ( ruleKey )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2058:1: ruleKey
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_24130);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Header__KeyAssignment_3_2"


    // $ANTLR start "rule__Tempo__ValueAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2067:1: rule__Tempo__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Tempo__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2071:1: ( ( RULE_INT ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2072:1: ( RULE_INT )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2072:1: ( RULE_INT )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2073:1: RULE_INT
            {
             before(grammarAccess.getTempoAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Tempo__ValueAssignment_04161); 
             after(grammarAccess.getTempoAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Tempo__ValueAssignment_0"


    // $ANTLR start "rule__Tempo__IdAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2082:1: rule__Tempo__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tempo__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2086:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2087:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2087:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2088:1: RULE_ID
            {
             before(grammarAccess.getTempoAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Tempo__IdAssignment_14192); 
             after(grammarAccess.getTempoAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tempo__IdAssignment_1"


    // $ANTLR start "rule__Key__NoteAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2097:1: rule__Key__NoteAssignment_0 : ( RULE_NOTE_ID ) ;
    public final void rule__Key__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2101:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2102:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2102:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2103:1: RULE_NOTE_ID
            {
             before(grammarAccess.getKeyAccess().getNoteNOTE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Key__NoteAssignment_04223); 
             after(grammarAccess.getKeyAccess().getNoteNOTE_IDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Key__NoteAssignment_0"


    // $ANTLR start "rule__Key__AccidentalAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2112:1: rule__Key__AccidentalAssignment_1 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Key__AccidentalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2116:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2117:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2117:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2118:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getKeyAccess().getAccidentalACCIDENTALTerminalRuleCall_1_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Key__AccidentalAssignment_14254); 
             after(grammarAccess.getKeyAccess().getAccidentalACCIDENTALTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Key__AccidentalAssignment_1"


    // $ANTLR start "rule__Key__IntervalAssignment_2_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2127:1: rule__Key__IntervalAssignment_2_0 : ( ( 'major' ) ) ;
    public final void rule__Key__IntervalAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2131:1: ( ( ( 'major' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2132:1: ( ( 'major' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2132:1: ( ( 'major' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2133:1: ( 'major' )
            {
             before(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2134:1: ( 'major' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2135:1: 'major'
            {
             before(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Key__IntervalAssignment_2_04290); 
             after(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 

            }

             after(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Key__IntervalAssignment_2_0"


    // $ANTLR start "rule__Key__IntervalAssignment_2_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2150:1: rule__Key__IntervalAssignment_2_1 : ( ( 'minor' ) ) ;
    public final void rule__Key__IntervalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2154:1: ( ( ( 'minor' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2155:1: ( ( 'minor' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2155:1: ( ( 'minor' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2156:1: ( 'minor' )
            {
             before(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2157:1: ( 'minor' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2158:1: 'minor'
            {
             before(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Key__IntervalAssignment_2_14334); 
             after(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 

            }

             after(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Key__IntervalAssignment_2_1"


    // $ANTLR start "rule__Song__InstrumentsAssignment"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2173:1: rule__Song__InstrumentsAssignment : ( ruleInstrument ) ;
    public final void rule__Song__InstrumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2177:1: ( ( ruleInstrument ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2178:1: ( ruleInstrument )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2178:1: ( ruleInstrument )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2179:1: ruleInstrument
            {
             before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment4373);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Song__InstrumentsAssignment"


    // $ANTLR start "rule__Instrument__InstrumentNameAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2188:1: rule__Instrument__InstrumentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instrument__InstrumentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2192:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2193:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2193:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2194:1: RULE_ID
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_04404); 
             after(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Instrument__InstrumentNameAssignment_0"


    // $ANTLR start "rule__Instrument__SequencesAssignment_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2203:1: rule__Instrument__SequencesAssignment_2 : ( ruleSequence ) ;
    public final void rule__Instrument__SequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2207:1: ( ( ruleSequence ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2208:1: ( ruleSequence )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2208:1: ( ruleSequence )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2209:1: ruleSequence
            {
             before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_24435);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Instrument__SequencesAssignment_2"


    // $ANTLR start "rule__Sequence__NoteAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2218:1: rule__Sequence__NoteAssignment_0 : ( ruleNote ) ;
    public final void rule__Sequence__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2222:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2223:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2223:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2224:1: ruleNote
            {
             before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_04466);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Sequence__NoteAssignment_0"


    // $ANTLR start "rule__Sequence__ChordAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2233:1: rule__Sequence__ChordAssignment_1 : ( ruleChord ) ;
    public final void rule__Sequence__ChordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2237:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2238:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2238:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2239:1: ruleChord
            {
             before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_14497);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sequence__ChordAssignment_1"


    // $ANTLR start "rule__Sequence__HarmonyAssignment_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2248:1: rule__Sequence__HarmonyAssignment_2 : ( ruleHarmony ) ;
    public final void rule__Sequence__HarmonyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2252:1: ( ( ruleHarmony ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2253:1: ( ruleHarmony )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2253:1: ( ruleHarmony )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2254:1: ruleHarmony
            {
             before(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_24528);
            ruleHarmony();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sequence__HarmonyAssignment_2"


    // $ANTLR start "rule__Sequence__TupletAssignment_3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2263:1: rule__Sequence__TupletAssignment_3 : ( ruleTuplet ) ;
    public final void rule__Sequence__TupletAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2267:1: ( ( ruleTuplet ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2268:1: ( ruleTuplet )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2268:1: ( ruleTuplet )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2269:1: ruleTuplet
            {
             before(grammarAccess.getSequenceAccess().getTupletTupletParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTuplet_in_rule__Sequence__TupletAssignment_34559);
            ruleTuplet();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getTupletTupletParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Sequence__TupletAssignment_3"


    // $ANTLR start "rule__Sequence__MeasureAssignment_4"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2278:1: rule__Sequence__MeasureAssignment_4 : ( RULE_MEASURE ) ;
    public final void rule__Sequence__MeasureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2282:1: ( ( RULE_MEASURE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2283:1: ( RULE_MEASURE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2283:1: ( RULE_MEASURE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2284:1: RULE_MEASURE
            {
             before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_4_0()); 
            match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_44590); 
             after(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Sequence__MeasureAssignment_4"


    // $ANTLR start "rule__Note__OctaveAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2293:1: rule__Note__OctaveAssignment_0 : ( RULE_OCTAVE ) ;
    public final void rule__Note__OctaveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2297:1: ( ( RULE_OCTAVE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2298:1: ( RULE_OCTAVE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2298:1: ( RULE_OCTAVE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2299:1: RULE_OCTAVE
            {
             before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
            match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_04621); 
             after(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Note__OctaveAssignment_0"


    // $ANTLR start "rule__Note__NoteAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2308:1: rule__Note__NoteAssignment_1 : ( RULE_NOTE_ID ) ;
    public final void rule__Note__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2312:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2313:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2313:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2314:1: RULE_NOTE_ID
            {
             before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_14652); 
             after(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Note__NoteAssignment_1"


    // $ANTLR start "rule__Note__AccidentalAssignment_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2323:1: rule__Note__AccidentalAssignment_2 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Note__AccidentalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2327:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2328:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2328:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2329:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_24683); 
             after(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Note__AccidentalAssignment_2"


    // $ANTLR start "rule__Note__DurationAssignment_3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2338:1: rule__Note__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2342:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2343:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2343:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2344:1: RULE_DURATION
            {
             before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_34714); 
             after(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Note__DurationAssignment_3"


    // $ANTLR start "rule__Note__PointAssignment_4"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2353:1: rule__Note__PointAssignment_4 : ( ( '.' ) ) ;
    public final void rule__Note__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2357:1: ( ( ( '.' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2358:1: ( ( '.' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2358:1: ( ( '.' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2359:1: ( '.' )
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2360:1: ( '.' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2361:1: '.'
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Note__PointAssignment_44750); 
             after(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 

            }

             after(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 

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
    // $ANTLR end "rule__Note__PointAssignment_4"


    // $ANTLR start "rule__Note__TieAssignment_5"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2376:1: rule__Note__TieAssignment_5 : ( ( '_' ) ) ;
    public final void rule__Note__TieAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2380:1: ( ( ( '_' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2381:1: ( ( '_' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2381:1: ( ( '_' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2382:1: ( '_' )
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2383:1: ( '_' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2384:1: '_'
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__Note__TieAssignment_54794); 
             after(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 

            }

             after(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 

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
    // $ANTLR end "rule__Note__TieAssignment_5"


    // $ANTLR start "rule__Chord__ChordNotesAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2399:1: rule__Chord__ChordNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2403:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2404:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2404:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2405:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_04833);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Chord__ChordNotesAssignment_0"


    // $ANTLR start "rule__Chord__ChordNotesAssignment_1_0_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2414:1: rule__Chord__ChordNotesAssignment_1_0_1 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2418:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2419:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2419:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2420:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_0_14864);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__Chord__ChordNotesAssignment_1_0_1"


    // $ANTLR start "rule__Chord__ChordNameAssignment_1_1_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2429:1: rule__Chord__ChordNameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Chord__ChordNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2433:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2434:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2434:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2435:1: RULE_ID
            {
             before(grammarAccess.getChordAccess().getChordNameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chord__ChordNameAssignment_1_1_14895); 
             after(grammarAccess.getChordAccess().getChordNameIDTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Chord__ChordNameAssignment_1_1_1"


    // $ANTLR start "rule__Chord__InversionAssignment_1_1_2_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2444:1: rule__Chord__InversionAssignment_1_1_2_0 : ( ( '^' ) ) ;
    public final void rule__Chord__InversionAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2448:1: ( ( ( '^' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2449:1: ( ( '^' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2449:1: ( ( '^' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2450:1: ( '^' )
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2451:1: ( '^' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2452:1: '^'
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Chord__InversionAssignment_1_1_2_04931); 
             after(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 

            }

             after(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 

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
    // $ANTLR end "rule__Chord__InversionAssignment_1_1_2_0"


    // $ANTLR start "rule__Chord__InversionAssignment_1_1_2_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2467:1: rule__Chord__InversionAssignment_1_1_2_1 : ( ( '^^' ) ) ;
    public final void rule__Chord__InversionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2471:1: ( ( ( '^^' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2472:1: ( ( '^^' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2472:1: ( ( '^^' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2473:1: ( '^^' )
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2474:1: ( '^^' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2475:1: '^^'
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Chord__InversionAssignment_1_1_2_14975); 
             after(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 

            }

             after(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 

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
    // $ANTLR end "rule__Chord__InversionAssignment_1_1_2_1"


    // $ANTLR start "rule__Harmony__HarmonyNotesAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2490:1: rule__Harmony__HarmonyNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2494:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2495:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2495:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2496:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_05014);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Harmony__HarmonyNotesAssignment_0"


    // $ANTLR start "rule__Harmony__HarmonyNotesAssignment_1_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2505:1: rule__Harmony__HarmonyNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2509:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2510:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2510:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2511:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_15045);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Harmony__HarmonyNotesAssignment_1_1"


    // $ANTLR start "rule__Harmony__NotesAssignment_3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2520:1: rule__Harmony__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__Harmony__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2524:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2525:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2525:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2526:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_35076);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Harmony__NotesAssignment_3"


    // $ANTLR start "rule__Tuplet__NotesAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2535:1: rule__Tuplet__NotesAssignment_1 : ( ruleNote ) ;
    public final void rule__Tuplet__NotesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2539:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2540:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2540:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2541:1: ruleNote
            {
             before(grammarAccess.getTupletAccess().getNotesNoteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Tuplet__NotesAssignment_15107);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getTupletAccess().getNotesNoteParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tuplet__NotesAssignment_1"


    // $ANTLR start "rule__Tuplet__DurationAssignment_3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2550:1: rule__Tuplet__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Tuplet__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2554:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2555:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2555:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2556:1: RULE_DURATION
            {
             before(grammarAccess.getTupletAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Tuplet__DurationAssignment_35138); 
             after(grammarAccess.getTupletAccess().getDurationDURATIONTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Tuplet__DurationAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\32\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\13\2\uffff\4\13\4\uffff\1\16\1\uffff\4\16\2\uffff\5"+
        "\16";
    static final String DFA4_minS =
        "\3\6\2\uffff\4\6\1\4\2\uffff\2\6\1\uffff\13\6";
    static final String DFA4_maxS =
        "\1\31\1\6\1\37\2\uffff\3\37\1\31\1\11\2\uffff\1\6\1\37\1\uffff"+
        "\3\37\1\31\1\11\1\6\4\37\1\31";
    static final String DFA4_acceptS =
        "\3\uffff\1\4\1\5\5\uffff\1\3\1\1\2\uffff\1\2\13\uffff";
    static final String DFA4_specialS =
        "\32\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\1\4\1\1\17\uffff\1\3",
            "\1\2",
            "\1\13\1\5\2\13\1\6\12\uffff\1\13\1\11\1\12\1\uffff\1\13\4"+
            "\uffff\1\7\1\10",
            "",
            "",
            "\1\13\1\uffff\2\13\1\6\12\uffff\1\13\1\11\1\12\1\uffff\1\13"+
            "\4\uffff\1\7\1\10",
            "\1\13\1\uffff\2\13\13\uffff\1\13\1\11\1\12\1\uffff\1\13\4"+
            "\uffff\1\7\1\10",
            "\1\13\1\uffff\2\13\13\uffff\1\13\1\11\1\12\1\uffff\1\13\5"+
            "\uffff\1\10",
            "\1\13\1\uffff\2\13\13\uffff\1\13\1\11\1\12\1\uffff\1\13",
            "\1\16\1\uffff\1\15\2\uffff\1\14",
            "",
            "",
            "\1\15",
            "\1\16\1\17\2\16\1\20\12\uffff\1\16\1\23\1\12\1\uffff\1\16"+
            "\4\uffff\1\21\1\22",
            "",
            "\1\16\1\uffff\2\16\1\20\12\uffff\1\16\1\23\1\12\1\uffff\1"+
            "\16\4\uffff\1\21\1\22",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16\4"+
            "\uffff\1\21\1\22",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16\5"+
            "\uffff\1\22",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16",
            "\1\25\2\uffff\1\24",
            "\1\25",
            "\1\16\1\26\2\16\1\27\12\uffff\1\16\1\23\1\12\1\uffff\1\16"+
            "\4\uffff\1\30\1\31",
            "\1\16\1\uffff\2\16\1\27\12\uffff\1\16\1\23\1\12\1\uffff\1"+
            "\16\4\uffff\1\30\1\31",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16\4"+
            "\uffff\1\30\1\31",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16\5"+
            "\uffff\1\31",
            "\1\16\1\uffff\2\16\13\uffff\1\16\1\23\1\12\1\uffff\1\16"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "419:1: rule__Sequence__Alternatives : ( ( ( rule__Sequence__NoteAssignment_0 ) ) | ( ( rule__Sequence__ChordAssignment_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_2 ) ) | ( ( rule__Sequence__TupletAssignment_3 ) ) | ( ( rule__Sequence__MeasureAssignment_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0_in_ruleHeader154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_entryRuleTempo181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempo188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tempo__Alternatives_in_ruleTempo214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0_in_ruleKey274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong336 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong348 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0_in_ruleInstrument411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Alternatives_in_ruleSequence471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0_in_ruleChord591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_entryRuleHarmony618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHarmony625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0_in_ruleHarmony651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplet_in_entryRuleTuplet678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuplet685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__0_in_ruleTuplet711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tempo__ValueAssignment_0_in_rule__Tempo__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tempo__IdAssignment_1_in_rule__Tempo__Alternatives765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__IntervalAssignment_2_0_in_rule__Key__Alternatives_2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__IntervalAssignment_2_1_in_rule__Key__Alternatives_2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NoteAssignment_0_in_rule__Sequence__Alternatives849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ChordAssignment_1_in_rule__Sequence__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__HarmonyAssignment_2_in_rule__Sequence__Alternatives885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__TupletAssignment_3_in_rule__Sequence__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MeasureAssignment_4_in_rule__Sequence__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__0_in_rule__Chord__Alternatives_1956 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__0_in_rule__Chord__Alternatives_1968 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__0_in_rule__Chord__Alternatives_1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__InversionAssignment_1_1_2_0_in_rule__Chord__Alternatives_1_1_21022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__InversionAssignment_1_1_2_1_in_rule__Chord__Alternatives_1_1_21040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__01071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11253 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21313 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01440 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Header__Group_1__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_1__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_2__0__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11689 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_2__1__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Header__Group_3__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11876 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_3__1__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__02001 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__02004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__NoteAssignment_0_in_rule__Key__Group__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__12061 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_rule__Key__Group__2_in_rule__Key__Group__12064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__AccidentalAssignment_1_in_rule__Key__Group__1__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__22122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Alternatives_2_in_rule__Key__Group__2__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__02185 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__12245 = new BitSet(new long[]{0x0000000002200340L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Instrument__Group__1__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__22307 = new BitSet(new long[]{0x0000000002200340L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__22310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2337 = new BitSet(new long[]{0x0000000002000342L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instrument__Group__3__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02435 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12496 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22556 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32617 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42678 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__5_in_rule__Note__Group__42681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__52739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02809 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Alternatives_1_in_rule__Chord__Group__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__0__Impl_in_rule__Chord__Group_1_0__02930 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__1_in_rule__Chord__Group_1_0__02933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Chord__Group_1_0__0__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__1__Impl_in_rule__Chord__Group_1_0__12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_1_0_1_in_rule__Chord__Group_1_0__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__0__Impl_in_rule__Chord__Group_1_1__03053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__1_in_rule__Chord__Group_1_1__03056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Chord__Group_1_1__0__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__1__Impl_in_rule__Chord__Group_1_1__13115 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__2_in_rule__Chord__Group_1_1__13118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNameAssignment_1_1_1_in_rule__Chord__Group_1_1__1__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__2__Impl_in_rule__Chord__Group_1_1__23175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Alternatives_1_1_2_in_rule__Chord__Group_1_1__2__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__03239 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__13299 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl3329 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__23360 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__23363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Harmony__Group__2__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__33422 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__33425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3454 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3466 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__43499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Harmony__Group__4__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__03568 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__03571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Harmony__Group_1__0__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__13630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__0__Impl_in_rule__Tuplet__Group__03691 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__1_in_rule__Tuplet__Group__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Tuplet__Group__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__1__Impl_in_rule__Tuplet__Group__13753 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__2_in_rule__Tuplet__Group__13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__NotesAssignment_1_in_rule__Tuplet__Group__1__Impl3785 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Tuplet__NotesAssignment_1_in_rule__Tuplet__Group__1__Impl3797 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__2__Impl_in_rule__Tuplet__Group__23830 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__3_in_rule__Tuplet__Group__23833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Tuplet__Group__2__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__3__Impl_in_rule__Tuplet__Group__33892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__DurationAssignment_3_in_rule__Tuplet__Group__3__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Document__SongAssignment_13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Header__NofeedbackAssignment_04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_24068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_rule__Header__TempoAssignment_2_24099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_24130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Tempo__ValueAssignment_04161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Tempo__IdAssignment_14192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Key__NoteAssignment_04223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Key__AccidentalAssignment_14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Key__IntervalAssignment_2_04290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Key__IntervalAssignment_2_14334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_24435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_14497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_24528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplet_in_rule__Sequence__TupletAssignment_34559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_44590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_04621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_24683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_34714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Note__PointAssignment_44750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Note__TieAssignment_54794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_04833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_0_14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chord__ChordNameAssignment_1_1_14895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Chord__InversionAssignment_1_1_2_04931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Chord__InversionAssignment_1_1_2_14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_05014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_15045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_35076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Tuplet__NotesAssignment_15107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Tuplet__DurationAssignment_35138 = new BitSet(new long[]{0x0000000000000002L});

}