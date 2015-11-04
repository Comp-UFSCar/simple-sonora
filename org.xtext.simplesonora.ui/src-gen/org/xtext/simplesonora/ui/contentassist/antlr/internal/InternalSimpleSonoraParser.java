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


    // $ANTLR start "rule__Tuplet__Alternatives_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:510:1: rule__Tuplet__Alternatives_1 : ( ( ( rule__Tuplet__TupletAssignment_1_0 ) ) | ( ( rule__Tuplet__TupletAssignment_1_1 ) ) );
    public final void rule__Tuplet__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:514:1: ( ( ( rule__Tuplet__TupletAssignment_1_0 ) ) | ( ( rule__Tuplet__TupletAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OCTAVE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_NOTE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ACCIDENTAL:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_DURATION:
                            {
                            switch ( input.LA(5) ) {
                            case 30:
                                {
                                switch ( input.LA(6) ) {
                                case 31:
                                    {
                                    int LA8_6 = input.LA(7);

                                    if ( (LA8_6==22) ) {
                                        alt8=2;
                                    }
                                    else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                        alt8=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 8, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case RULE_NOTE_ID:
                                case RULE_OCTAVE:
                                case 26:
                                    {
                                    alt8=1;
                                    }
                                    break;
                                case 22:
                                    {
                                    alt8=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 5, input);

                                    throw nvae;
                                }

                                }
                                break;
                            case 31:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==22) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 22:
                                {
                                alt8=2;
                                }
                                break;
                            case RULE_NOTE_ID:
                            case RULE_OCTAVE:
                            case 26:
                                {
                                alt8=1;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 4, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 30:
                            {
                            switch ( input.LA(5) ) {
                            case 31:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==22) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_NOTE_ID:
                            case RULE_OCTAVE:
                            case 26:
                                {
                                alt8=1;
                                }
                                break;
                            case 22:
                                {
                                alt8=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 5, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RULE_DURATION:
                        {
                        switch ( input.LA(4) ) {
                        case 30:
                            {
                            switch ( input.LA(5) ) {
                            case 31:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==22) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_NOTE_ID:
                            case RULE_OCTAVE:
                            case 26:
                                {
                                alt8=1;
                                }
                                break;
                            case 22:
                                {
                                alt8=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 5, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 30:
                        {
                        switch ( input.LA(4) ) {
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 31:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==22) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        alt8=2;
                        }
                        break;
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_NOTE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_ACCIDENTAL:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DURATION:
                        {
                        switch ( input.LA(4) ) {
                        case 30:
                            {
                            switch ( input.LA(5) ) {
                            case 31:
                                {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==22) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_NOTE_ID:
                            case RULE_OCTAVE:
                            case 26:
                                {
                                alt8=1;
                                }
                                break;
                            case 22:
                                {
                                alt8=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 5, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 30:
                        {
                        switch ( input.LA(4) ) {
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 31:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==22) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    case 22:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_DURATION:
                    {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        switch ( input.LA(4) ) {
                        case 31:
                            {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==22) ) {
                                alt8=2;
                            }
                            else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                                alt8=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 26:
                            {
                            alt8=1;
                            }
                            break;
                        case 22:
                            {
                            alt8=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 31:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==22) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        alt8=2;
                        }
                        break;
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 30:
                    {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==22) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    case 22:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 31:
                    {
                    int LA8_6 = input.LA(3);

                    if ( (LA8_6==22) ) {
                        alt8=2;
                    }
                    else if ( (LA8_6==RULE_NOTE_ID||LA8_6==RULE_OCTAVE||LA8_6==26) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_NOTE_ID:
                case RULE_OCTAVE:
                case 26:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:515:1: ( ( rule__Tuplet__TupletAssignment_1_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:515:1: ( ( rule__Tuplet__TupletAssignment_1_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:516:1: ( rule__Tuplet__TupletAssignment_1_0 )
                    {
                     before(grammarAccess.getTupletAccess().getTupletAssignment_1_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:517:1: ( rule__Tuplet__TupletAssignment_1_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:517:2: rule__Tuplet__TupletAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Tuplet__TupletAssignment_1_0_in_rule__Tuplet__Alternatives_11073);
                    rule__Tuplet__TupletAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTupletAccess().getTupletAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:521:6: ( ( rule__Tuplet__TupletAssignment_1_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:521:6: ( ( rule__Tuplet__TupletAssignment_1_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:522:1: ( rule__Tuplet__TupletAssignment_1_1 )
                    {
                     before(grammarAccess.getTupletAccess().getTupletAssignment_1_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:523:1: ( rule__Tuplet__TupletAssignment_1_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:523:2: rule__Tuplet__TupletAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Tuplet__TupletAssignment_1_1_in_rule__Tuplet__Alternatives_11091);
                    rule__Tuplet__TupletAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTupletAccess().getTupletAssignment_1_1()); 

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
    // $ANTLR end "rule__Tuplet__Alternatives_1"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:534:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:538:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:539:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__01122);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__01125);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:546:1: rule__Document__Group__0__Impl : ( ( rule__Document__HeaderAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:550:1: ( ( ( rule__Document__HeaderAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:551:1: ( ( rule__Document__HeaderAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:551:1: ( ( rule__Document__HeaderAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:552:1: ( rule__Document__HeaderAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:553:1: ( rule__Document__HeaderAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:553:2: rule__Document__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl1152);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:563:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:567:1: ( rule__Document__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:568:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__11182);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:574:1: rule__Document__Group__1__Impl : ( ( rule__Document__SongAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:578:1: ( ( ( rule__Document__SongAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:579:1: ( ( rule__Document__SongAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:579:1: ( ( rule__Document__SongAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:580:1: ( rule__Document__SongAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getSongAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:581:1: ( rule__Document__SongAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:581:2: rule__Document__SongAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl1209);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:595:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:599:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:600:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01243);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01246);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:607:1: rule__Header__Group__0__Impl : ( ( rule__Header__NofeedbackAssignment_0 )? ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:611:1: ( ( ( rule__Header__NofeedbackAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:612:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:612:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:613:1: ( rule__Header__NofeedbackAssignment_0 )?
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:614:1: ( rule__Header__NofeedbackAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:614:2: rule__Header__NofeedbackAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl1273);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:624:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:628:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:629:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11304);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11307);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:636:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:640:1: ( ( ( rule__Header__Group_1__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:641:1: ( ( rule__Header__Group_1__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:641:1: ( ( rule__Header__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:642:1: ( rule__Header__Group_1__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:643:1: ( rule__Header__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:643:2: rule__Header__Group_1__0
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl1334);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:653:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:657:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:658:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21364);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21367);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:665:1: rule__Header__Group__2__Impl : ( ( rule__Header__Group_2__0 )? ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:669:1: ( ( ( rule__Header__Group_2__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:670:1: ( ( rule__Header__Group_2__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:670:1: ( ( rule__Header__Group_2__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:671:1: ( rule__Header__Group_2__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:672:1: ( rule__Header__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:672:2: rule__Header__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1394);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:682:1: rule__Header__Group__3 : rule__Header__Group__3__Impl ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:686:1: ( rule__Header__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:687:2: rule__Header__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31425);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:693:1: rule__Header__Group__3__Impl : ( ( rule__Header__Group_3__0 )? ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:697:1: ( ( ( rule__Header__Group_3__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( rule__Header__Group_3__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( rule__Header__Group_3__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( rule__Header__Group_3__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:1: ( rule__Header__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:2: rule__Header__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1452);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:718:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:722:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:723:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01491);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01494);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:730:1: rule__Header__Group_1__0__Impl : ( 'title' ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:734:1: ( ( 'title' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:735:1: ( 'title' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:735:1: ( 'title' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:736:1: 'title'
            {
             before(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Header__Group_1__0__Impl1522); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:749:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl rule__Header__Group_1__2 ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:753:1: ( rule__Header__Group_1__1__Impl rule__Header__Group_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:754:2: rule__Header__Group_1__1__Impl rule__Header__Group_1__2
            {
            pushFollow(FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11553);
            rule__Header__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11556);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:761:1: rule__Header__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:765:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:766:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:766:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:767:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_1__1__Impl1584); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:780:1: rule__Header__Group_1__2 : rule__Header__Group_1__2__Impl ;
    public final void rule__Header__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:784:1: ( rule__Header__Group_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:785:2: rule__Header__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21615);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:791:1: rule__Header__Group_1__2__Impl : ( ( rule__Header__SongNameAssignment_1_2 ) ) ;
    public final void rule__Header__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( ( ( rule__Header__SongNameAssignment_1_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:797:1: ( rule__Header__SongNameAssignment_1_2 )
            {
             before(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:798:1: ( rule__Header__SongNameAssignment_1_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:798:2: rule__Header__SongNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1642);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:814:1: rule__Header__Group_2__0 : rule__Header__Group_2__0__Impl rule__Header__Group_2__1 ;
    public final void rule__Header__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:818:1: ( rule__Header__Group_2__0__Impl rule__Header__Group_2__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:819:2: rule__Header__Group_2__0__Impl rule__Header__Group_2__1
            {
            pushFollow(FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01678);
            rule__Header__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01681);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:826:1: rule__Header__Group_2__0__Impl : ( 'tempo' ) ;
    public final void rule__Header__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:830:1: ( ( 'tempo' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:831:1: ( 'tempo' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:831:1: ( 'tempo' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:832:1: 'tempo'
            {
             before(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_2__0__Impl1709); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:845:1: rule__Header__Group_2__1 : rule__Header__Group_2__1__Impl rule__Header__Group_2__2 ;
    public final void rule__Header__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:849:1: ( rule__Header__Group_2__1__Impl rule__Header__Group_2__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:850:2: rule__Header__Group_2__1__Impl rule__Header__Group_2__2
            {
            pushFollow(FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11740);
            rule__Header__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11743);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:857:1: rule__Header__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:861:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:862:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:862:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:863:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_2__1__Impl1771); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:876:1: rule__Header__Group_2__2 : rule__Header__Group_2__2__Impl ;
    public final void rule__Header__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:880:1: ( rule__Header__Group_2__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:881:2: rule__Header__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21802);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:887:1: rule__Header__Group_2__2__Impl : ( ( rule__Header__TempoAssignment_2_2 ) ) ;
    public final void rule__Header__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:891:1: ( ( ( rule__Header__TempoAssignment_2_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:892:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:892:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:893:1: ( rule__Header__TempoAssignment_2_2 )
            {
             before(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:894:1: ( rule__Header__TempoAssignment_2_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:894:2: rule__Header__TempoAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1829);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:910:1: rule__Header__Group_3__0 : rule__Header__Group_3__0__Impl rule__Header__Group_3__1 ;
    public final void rule__Header__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:914:1: ( rule__Header__Group_3__0__Impl rule__Header__Group_3__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:915:2: rule__Header__Group_3__0__Impl rule__Header__Group_3__1
            {
            pushFollow(FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01865);
            rule__Header__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01868);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:922:1: rule__Header__Group_3__0__Impl : ( 'key' ) ;
    public final void rule__Header__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:926:1: ( ( 'key' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:927:1: ( 'key' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:927:1: ( 'key' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:928:1: 'key'
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Header__Group_3__0__Impl1896); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:941:1: rule__Header__Group_3__1 : rule__Header__Group_3__1__Impl rule__Header__Group_3__2 ;
    public final void rule__Header__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:945:1: ( rule__Header__Group_3__1__Impl rule__Header__Group_3__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:946:2: rule__Header__Group_3__1__Impl rule__Header__Group_3__2
            {
            pushFollow(FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11927);
            rule__Header__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11930);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:953:1: rule__Header__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:957:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:958:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:958:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:959:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_3__1__Impl1958); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:972:1: rule__Header__Group_3__2 : rule__Header__Group_3__2__Impl ;
    public final void rule__Header__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:976:1: ( rule__Header__Group_3__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:977:2: rule__Header__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21989);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:983:1: rule__Header__Group_3__2__Impl : ( ( rule__Header__KeyAssignment_3_2 ) ) ;
    public final void rule__Header__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:987:1: ( ( ( rule__Header__KeyAssignment_3_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:988:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:988:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:989:1: ( rule__Header__KeyAssignment_3_2 )
            {
             before(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:990:1: ( rule__Header__KeyAssignment_3_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:990:2: rule__Header__KeyAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl2016);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1006:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1010:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1011:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__02052);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__02055);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1018:1: rule__Key__Group__0__Impl : ( ( rule__Key__NoteAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1022:1: ( ( ( rule__Key__NoteAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1023:1: ( ( rule__Key__NoteAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1023:1: ( ( rule__Key__NoteAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1024:1: ( rule__Key__NoteAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getNoteAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1025:1: ( rule__Key__NoteAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1025:2: rule__Key__NoteAssignment_0
            {
            pushFollow(FOLLOW_rule__Key__NoteAssignment_0_in_rule__Key__Group__0__Impl2082);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1035:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1039:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1040:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__12112);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__2_in_rule__Key__Group__12115);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1047:1: rule__Key__Group__1__Impl : ( ( rule__Key__AccidentalAssignment_1 )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1051:1: ( ( ( rule__Key__AccidentalAssignment_1 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1052:1: ( ( rule__Key__AccidentalAssignment_1 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1052:1: ( ( rule__Key__AccidentalAssignment_1 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1053:1: ( rule__Key__AccidentalAssignment_1 )?
            {
             before(grammarAccess.getKeyAccess().getAccidentalAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1054:1: ( rule__Key__AccidentalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ACCIDENTAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1054:2: rule__Key__AccidentalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Key__AccidentalAssignment_1_in_rule__Key__Group__1__Impl2142);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1064:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1068:1: ( rule__Key__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1069:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__22173);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1075:1: rule__Key__Group__2__Impl : ( ( rule__Key__Alternatives_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1079:1: ( ( ( rule__Key__Alternatives_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1080:1: ( ( rule__Key__Alternatives_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1080:1: ( ( rule__Key__Alternatives_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1081:1: ( rule__Key__Alternatives_2 )
            {
             before(grammarAccess.getKeyAccess().getAlternatives_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1082:1: ( rule__Key__Alternatives_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1082:2: rule__Key__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Key__Alternatives_2_in_rule__Key__Group__2__Impl2200);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1098:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1102:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1103:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__02236);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__02239);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1110:1: rule__Instrument__Group__0__Impl : ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1114:1: ( ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1115:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1115:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1116:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1117:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1117:2: rule__Instrument__InstrumentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl2266);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1127:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1131:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1132:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__12296);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__12299);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1139:1: rule__Instrument__Group__1__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1143:1: ( ( '{' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( '{' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( '{' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1145:1: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Instrument__Group__1__Impl2327); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1158:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1162:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1163:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__22358);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__22361);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1170:1: rule__Instrument__Group__2__Impl : ( ( rule__Instrument__SequencesAssignment_2 )* ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1174:1: ( ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1175:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1175:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1176:1: ( rule__Instrument__SequencesAssignment_2 )*
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1177:1: ( rule__Instrument__SequencesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_NOTE_ID||(LA13_0>=RULE_MEASURE && LA13_0<=RULE_OCTAVE)||LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1177:2: rule__Instrument__SequencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2388);
            	    rule__Instrument__SequencesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1187:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1191:1: ( rule__Instrument__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1192:2: rule__Instrument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32419);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1198:1: rule__Instrument__Group__3__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1202:1: ( ( '}' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1203:1: ( '}' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1203:1: ( '}' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1204:1: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Instrument__Group__3__Impl2447); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1225:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1229:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1230:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02486);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02489);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1237:1: rule__Note__Group__0__Impl : ( ( rule__Note__OctaveAssignment_0 )? ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1241:1: ( ( ( rule__Note__OctaveAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1242:1: ( ( rule__Note__OctaveAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1242:1: ( ( rule__Note__OctaveAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1243:1: ( rule__Note__OctaveAssignment_0 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1244:1: ( rule__Note__OctaveAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OCTAVE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1244:2: rule__Note__OctaveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2516);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1254:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1258:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1259:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12547);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12550);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1266:1: rule__Note__Group__1__Impl : ( ( rule__Note__NoteAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1270:1: ( ( ( rule__Note__NoteAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1271:1: ( ( rule__Note__NoteAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1271:1: ( ( rule__Note__NoteAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1272:1: ( rule__Note__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNoteAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1273:1: ( rule__Note__NoteAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1273:2: rule__Note__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2577);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1283:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1287:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1288:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22607);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22610);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1295:1: rule__Note__Group__2__Impl : ( ( rule__Note__AccidentalAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1299:1: ( ( ( rule__Note__AccidentalAssignment_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1300:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1300:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1301:1: ( rule__Note__AccidentalAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1302:1: ( rule__Note__AccidentalAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ACCIDENTAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1302:2: rule__Note__AccidentalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2637);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1312:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1316:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1317:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32668);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32671);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1324:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1328:1: ( ( ( rule__Note__DurationAssignment_3 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1329:1: ( ( rule__Note__DurationAssignment_3 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1329:1: ( ( rule__Note__DurationAssignment_3 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1330:1: ( rule__Note__DurationAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1331:1: ( rule__Note__DurationAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DURATION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1331:2: rule__Note__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2698);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1341:1: rule__Note__Group__4 : rule__Note__Group__4__Impl rule__Note__Group__5 ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1345:1: ( rule__Note__Group__4__Impl rule__Note__Group__5 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1346:2: rule__Note__Group__4__Impl rule__Note__Group__5
            {
            pushFollow(FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42729);
            rule__Note__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__5_in_rule__Note__Group__42732);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1353:1: rule__Note__Group__4__Impl : ( ( rule__Note__PointAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1357:1: ( ( ( rule__Note__PointAssignment_4 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1358:1: ( ( rule__Note__PointAssignment_4 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1358:1: ( ( rule__Note__PointAssignment_4 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1359:1: ( rule__Note__PointAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getPointAssignment_4()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1360:1: ( rule__Note__PointAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1360:2: rule__Note__PointAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2759);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1370:1: rule__Note__Group__5 : rule__Note__Group__5__Impl ;
    public final void rule__Note__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1374:1: ( rule__Note__Group__5__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1375:2: rule__Note__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__52790);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1381:1: rule__Note__Group__5__Impl : ( ( rule__Note__TieAssignment_5 )? ) ;
    public final void rule__Note__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1385:1: ( ( ( rule__Note__TieAssignment_5 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1386:1: ( ( rule__Note__TieAssignment_5 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1386:1: ( ( rule__Note__TieAssignment_5 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1387:1: ( rule__Note__TieAssignment_5 )?
            {
             before(grammarAccess.getNoteAccess().getTieAssignment_5()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1388:1: ( rule__Note__TieAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1388:2: rule__Note__TieAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl2817);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1410:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1415:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02860);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02863);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1422:1: rule__Chord__Group__0__Impl : ( ( rule__Chord__ChordNotesAssignment_0 ) ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1426:1: ( ( ( rule__Chord__ChordNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1427:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1427:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1428:1: ( rule__Chord__ChordNotesAssignment_0 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1429:1: ( rule__Chord__ChordNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1429:2: rule__Chord__ChordNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2890);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1439:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1443:1: ( rule__Chord__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1444:2: rule__Chord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12920);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1450:1: rule__Chord__Group__1__Impl : ( ( rule__Chord__Alternatives_1 ) ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1454:1: ( ( ( rule__Chord__Alternatives_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1455:1: ( ( rule__Chord__Alternatives_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1455:1: ( ( rule__Chord__Alternatives_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1456:1: ( rule__Chord__Alternatives_1 )
            {
             before(grammarAccess.getChordAccess().getAlternatives_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1457:1: ( rule__Chord__Alternatives_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1457:2: rule__Chord__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Chord__Alternatives_1_in_rule__Chord__Group__1__Impl2947);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1471:1: rule__Chord__Group_1_0__0 : rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1 ;
    public final void rule__Chord__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1475:1: ( rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1476:2: rule__Chord__Group_1_0__0__Impl rule__Chord__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_0__0__Impl_in_rule__Chord__Group_1_0__02981);
            rule__Chord__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_0__1_in_rule__Chord__Group_1_0__02984);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1483:1: rule__Chord__Group_1_0__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1487:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1488:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1488:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1489:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Chord__Group_1_0__0__Impl3012); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1502:1: rule__Chord__Group_1_0__1 : rule__Chord__Group_1_0__1__Impl ;
    public final void rule__Chord__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1506:1: ( rule__Chord__Group_1_0__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1507:2: rule__Chord__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_0__1__Impl_in_rule__Chord__Group_1_0__13043);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1513:1: rule__Chord__Group_1_0__1__Impl : ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) ) ;
    public final void rule__Chord__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1517:1: ( ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1518:1: ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1518:1: ( ( rule__Chord__ChordNotesAssignment_1_0_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1519:1: ( rule__Chord__ChordNotesAssignment_1_0_1 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_1_0_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1520:1: ( rule__Chord__ChordNotesAssignment_1_0_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1520:2: rule__Chord__ChordNotesAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_1_0_1_in_rule__Chord__Group_1_0__1__Impl3070);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1534:1: rule__Chord__Group_1_1__0 : rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1 ;
    public final void rule__Chord__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1538:1: ( rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1539:2: rule__Chord__Group_1_1__0__Impl rule__Chord__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__0__Impl_in_rule__Chord__Group_1_1__03104);
            rule__Chord__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_1__1_in_rule__Chord__Group_1_1__03107);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1546:1: rule__Chord__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1550:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1551:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1551:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1552:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Chord__Group_1_1__0__Impl3135); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1565:1: rule__Chord__Group_1_1__1 : rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2 ;
    public final void rule__Chord__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1569:1: ( rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1570:2: rule__Chord__Group_1_1__1__Impl rule__Chord__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__1__Impl_in_rule__Chord__Group_1_1__13166);
            rule__Chord__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1_1__2_in_rule__Chord__Group_1_1__13169);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1577:1: rule__Chord__Group_1_1__1__Impl : ( ( rule__Chord__ChordNameAssignment_1_1_1 ) ) ;
    public final void rule__Chord__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1581:1: ( ( ( rule__Chord__ChordNameAssignment_1_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1582:1: ( ( rule__Chord__ChordNameAssignment_1_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1582:1: ( ( rule__Chord__ChordNameAssignment_1_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1583:1: ( rule__Chord__ChordNameAssignment_1_1_1 )
            {
             before(grammarAccess.getChordAccess().getChordNameAssignment_1_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1584:1: ( rule__Chord__ChordNameAssignment_1_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1584:2: rule__Chord__ChordNameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNameAssignment_1_1_1_in_rule__Chord__Group_1_1__1__Impl3196);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1594:1: rule__Chord__Group_1_1__2 : rule__Chord__Group_1_1__2__Impl ;
    public final void rule__Chord__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1598:1: ( rule__Chord__Group_1_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1599:2: rule__Chord__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1_1__2__Impl_in_rule__Chord__Group_1_1__23226);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1605:1: rule__Chord__Group_1_1__2__Impl : ( ( rule__Chord__Alternatives_1_1_2 )? ) ;
    public final void rule__Chord__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1609:1: ( ( ( rule__Chord__Alternatives_1_1_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1610:1: ( ( rule__Chord__Alternatives_1_1_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1610:1: ( ( rule__Chord__Alternatives_1_1_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1611:1: ( rule__Chord__Alternatives_1_1_2 )?
            {
             before(grammarAccess.getChordAccess().getAlternatives_1_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1612:1: ( rule__Chord__Alternatives_1_1_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1612:2: rule__Chord__Alternatives_1_1_2
                    {
                    pushFollow(FOLLOW_rule__Chord__Alternatives_1_1_2_in_rule__Chord__Group_1_1__2__Impl3253);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1628:1: rule__Harmony__Group__0 : rule__Harmony__Group__0__Impl rule__Harmony__Group__1 ;
    public final void rule__Harmony__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1632:1: ( rule__Harmony__Group__0__Impl rule__Harmony__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1633:2: rule__Harmony__Group__0__Impl rule__Harmony__Group__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__03290);
            rule__Harmony__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__03293);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1640:1: rule__Harmony__Group__0__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) ;
    public final void rule__Harmony__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1644:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1645:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1645:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1646:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1647:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1647:2: rule__Harmony__HarmonyNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl3320);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1657:1: rule__Harmony__Group__1 : rule__Harmony__Group__1__Impl rule__Harmony__Group__2 ;
    public final void rule__Harmony__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1661:1: ( rule__Harmony__Group__1__Impl rule__Harmony__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1662:2: rule__Harmony__Group__1__Impl rule__Harmony__Group__2
            {
            pushFollow(FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__13350);
            rule__Harmony__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__13353);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1669:1: rule__Harmony__Group__1__Impl : ( ( rule__Harmony__Group_1__0 )* ) ;
    public final void rule__Harmony__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1673:1: ( ( ( rule__Harmony__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1674:1: ( ( rule__Harmony__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1674:1: ( ( rule__Harmony__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1675:1: ( rule__Harmony__Group_1__0 )*
            {
             before(grammarAccess.getHarmonyAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1676:1: ( rule__Harmony__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1676:2: rule__Harmony__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl3380);
            	    rule__Harmony__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1686:1: rule__Harmony__Group__2 : rule__Harmony__Group__2__Impl rule__Harmony__Group__3 ;
    public final void rule__Harmony__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1690:1: ( rule__Harmony__Group__2__Impl rule__Harmony__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1691:2: rule__Harmony__Group__2__Impl rule__Harmony__Group__3
            {
            pushFollow(FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__23411);
            rule__Harmony__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__23414);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1698:1: rule__Harmony__Group__2__Impl : ( '[' ) ;
    public final void rule__Harmony__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1702:1: ( ( '[' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1703:1: ( '[' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1703:1: ( '[' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1704:1: '['
            {
             before(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Harmony__Group__2__Impl3442); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1717:1: rule__Harmony__Group__3 : rule__Harmony__Group__3__Impl rule__Harmony__Group__4 ;
    public final void rule__Harmony__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1721:1: ( rule__Harmony__Group__3__Impl rule__Harmony__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1722:2: rule__Harmony__Group__3__Impl rule__Harmony__Group__4
            {
            pushFollow(FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__33473);
            rule__Harmony__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__33476);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1729:1: rule__Harmony__Group__3__Impl : ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) ;
    public final void rule__Harmony__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1733:1: ( ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1734:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1734:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1735:1: ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1735:1: ( ( rule__Harmony__NotesAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1736:1: ( rule__Harmony__NotesAssignment_3 )
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1737:1: ( rule__Harmony__NotesAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1737:2: rule__Harmony__NotesAssignment_3
            {
            pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3505);
            rule__Harmony__NotesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1740:1: ( ( rule__Harmony__NotesAssignment_3 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1741:1: ( rule__Harmony__NotesAssignment_3 )*
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1742:1: ( rule__Harmony__NotesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_NOTE_ID||LA21_0==RULE_OCTAVE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1742:2: rule__Harmony__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3517);
            	    rule__Harmony__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1753:1: rule__Harmony__Group__4 : rule__Harmony__Group__4__Impl ;
    public final void rule__Harmony__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1757:1: ( rule__Harmony__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1758:2: rule__Harmony__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__43550);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1764:1: rule__Harmony__Group__4__Impl : ( ']' ) ;
    public final void rule__Harmony__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1768:1: ( ( ']' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1769:1: ( ']' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1769:1: ( ']' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1770:1: ']'
            {
             before(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Harmony__Group__4__Impl3578); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1793:1: rule__Harmony__Group_1__0 : rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 ;
    public final void rule__Harmony__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1797:1: ( rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1798:2: rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__03619);
            rule__Harmony__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__03622);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1805:1: rule__Harmony__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Harmony__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1809:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1810:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1810:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1811:1: '/'
            {
             before(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Harmony__Group_1__0__Impl3650); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1824:1: rule__Harmony__Group_1__1 : rule__Harmony__Group_1__1__Impl ;
    public final void rule__Harmony__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1828:1: ( rule__Harmony__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1829:2: rule__Harmony__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__13681);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1835:1: rule__Harmony__Group_1__1__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) ;
    public final void rule__Harmony__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1839:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1840:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1840:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1841:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1842:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1842:2: rule__Harmony__HarmonyNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl3708);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1856:1: rule__Tuplet__Group__0 : rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1 ;
    public final void rule__Tuplet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1860:1: ( rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1861:2: rule__Tuplet__Group__0__Impl rule__Tuplet__Group__1
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__0__Impl_in_rule__Tuplet__Group__03742);
            rule__Tuplet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__1_in_rule__Tuplet__Group__03745);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1868:1: rule__Tuplet__Group__0__Impl : ( '(' ) ;
    public final void rule__Tuplet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1872:1: ( ( '(' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1873:1: ( '(' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1873:1: ( '(' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1874:1: '('
            {
             before(grammarAccess.getTupletAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Tuplet__Group__0__Impl3773); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1887:1: rule__Tuplet__Group__1 : rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2 ;
    public final void rule__Tuplet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1891:1: ( rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1892:2: rule__Tuplet__Group__1__Impl rule__Tuplet__Group__2
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__1__Impl_in_rule__Tuplet__Group__13804);
            rule__Tuplet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__2_in_rule__Tuplet__Group__13807);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1899:1: rule__Tuplet__Group__1__Impl : ( ( ( rule__Tuplet__Alternatives_1 ) ) ( ( rule__Tuplet__Alternatives_1 )* ) ) ;
    public final void rule__Tuplet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1903:1: ( ( ( ( rule__Tuplet__Alternatives_1 ) ) ( ( rule__Tuplet__Alternatives_1 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1904:1: ( ( ( rule__Tuplet__Alternatives_1 ) ) ( ( rule__Tuplet__Alternatives_1 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1904:1: ( ( ( rule__Tuplet__Alternatives_1 ) ) ( ( rule__Tuplet__Alternatives_1 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1905:1: ( ( rule__Tuplet__Alternatives_1 ) ) ( ( rule__Tuplet__Alternatives_1 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1905:1: ( ( rule__Tuplet__Alternatives_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1906:1: ( rule__Tuplet__Alternatives_1 )
            {
             before(grammarAccess.getTupletAccess().getAlternatives_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1907:1: ( rule__Tuplet__Alternatives_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1907:2: rule__Tuplet__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Tuplet__Alternatives_1_in_rule__Tuplet__Group__1__Impl3836);
            rule__Tuplet__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTupletAccess().getAlternatives_1()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1910:1: ( ( rule__Tuplet__Alternatives_1 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1911:1: ( rule__Tuplet__Alternatives_1 )*
            {
             before(grammarAccess.getTupletAccess().getAlternatives_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1912:1: ( rule__Tuplet__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_NOTE_ID||LA22_0==RULE_OCTAVE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1912:2: rule__Tuplet__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Tuplet__Alternatives_1_in_rule__Tuplet__Group__1__Impl3848);
            	    rule__Tuplet__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTupletAccess().getAlternatives_1()); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1923:1: rule__Tuplet__Group__2 : rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3 ;
    public final void rule__Tuplet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1927:1: ( rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1928:2: rule__Tuplet__Group__2__Impl rule__Tuplet__Group__3
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__2__Impl_in_rule__Tuplet__Group__23881);
            rule__Tuplet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tuplet__Group__3_in_rule__Tuplet__Group__23884);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1935:1: rule__Tuplet__Group__2__Impl : ( ')' ) ;
    public final void rule__Tuplet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1939:1: ( ( ')' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1940:1: ( ')' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1940:1: ( ')' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1941:1: ')'
            {
             before(grammarAccess.getTupletAccess().getRightParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Tuplet__Group__2__Impl3912); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1954:1: rule__Tuplet__Group__3 : rule__Tuplet__Group__3__Impl ;
    public final void rule__Tuplet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1958:1: ( rule__Tuplet__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1959:2: rule__Tuplet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Tuplet__Group__3__Impl_in_rule__Tuplet__Group__33943);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1965:1: rule__Tuplet__Group__3__Impl : ( ( rule__Tuplet__DurationAssignment_3 ) ) ;
    public final void rule__Tuplet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1969:1: ( ( ( rule__Tuplet__DurationAssignment_3 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1970:1: ( ( rule__Tuplet__DurationAssignment_3 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1970:1: ( ( rule__Tuplet__DurationAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1971:1: ( rule__Tuplet__DurationAssignment_3 )
            {
             before(grammarAccess.getTupletAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1972:1: ( rule__Tuplet__DurationAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1972:2: rule__Tuplet__DurationAssignment_3
            {
            pushFollow(FOLLOW_rule__Tuplet__DurationAssignment_3_in_rule__Tuplet__Group__3__Impl3970);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1991:1: rule__Document__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Document__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1995:1: ( ( ruleHeader ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1996:1: ( ruleHeader )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1996:1: ( ruleHeader )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1997:1: ruleHeader
            {
             before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_04013);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2006:1: rule__Document__SongAssignment_1 : ( ruleSong ) ;
    public final void rule__Document__SongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2010:1: ( ( ruleSong ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2011:1: ( ruleSong )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2011:1: ( ruleSong )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2012:1: ruleSong
            {
             before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Document__SongAssignment_14044);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2021:1: rule__Header__NofeedbackAssignment_0 : ( ( 'no-feedback' ) ) ;
    public final void rule__Header__NofeedbackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2025:1: ( ( ( 'no-feedback' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2026:1: ( ( 'no-feedback' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2026:1: ( ( 'no-feedback' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2027:1: ( 'no-feedback' )
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2028:1: ( 'no-feedback' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2029:1: 'no-feedback'
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Header__NofeedbackAssignment_04080); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2044:1: rule__Header__SongNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Header__SongNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2048:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2049:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2049:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2050:1: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_24119); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2059:1: rule__Header__TempoAssignment_2_2 : ( ruleTempo ) ;
    public final void rule__Header__TempoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2063:1: ( ( ruleTempo ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2064:1: ( ruleTempo )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2064:1: ( ruleTempo )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2065:1: ruleTempo
            {
             before(grammarAccess.getHeaderAccess().getTempoTempoParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTempo_in_rule__Header__TempoAssignment_2_24150);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2074:1: rule__Header__KeyAssignment_3_2 : ( ruleKey ) ;
    public final void rule__Header__KeyAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2078:1: ( ( ruleKey ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2079:1: ( ruleKey )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2079:1: ( ruleKey )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2080:1: ruleKey
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_24181);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2089:1: rule__Tempo__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Tempo__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2093:1: ( ( RULE_INT ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2094:1: ( RULE_INT )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2094:1: ( RULE_INT )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2095:1: RULE_INT
            {
             before(grammarAccess.getTempoAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Tempo__ValueAssignment_04212); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2104:1: rule__Tempo__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tempo__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2108:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2109:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2109:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2110:1: RULE_ID
            {
             before(grammarAccess.getTempoAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Tempo__IdAssignment_14243); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2119:1: rule__Key__NoteAssignment_0 : ( RULE_NOTE_ID ) ;
    public final void rule__Key__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2123:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2124:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2124:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2125:1: RULE_NOTE_ID
            {
             before(grammarAccess.getKeyAccess().getNoteNOTE_IDTerminalRuleCall_0_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Key__NoteAssignment_04274); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2134:1: rule__Key__AccidentalAssignment_1 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Key__AccidentalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2138:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2139:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2139:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2140:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getKeyAccess().getAccidentalACCIDENTALTerminalRuleCall_1_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Key__AccidentalAssignment_14305); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2149:1: rule__Key__IntervalAssignment_2_0 : ( ( 'major' ) ) ;
    public final void rule__Key__IntervalAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2153:1: ( ( ( 'major' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2154:1: ( ( 'major' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2154:1: ( ( 'major' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2155:1: ( 'major' )
            {
             before(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2156:1: ( 'major' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2157:1: 'major'
            {
             before(grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Key__IntervalAssignment_2_04341); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2172:1: rule__Key__IntervalAssignment_2_1 : ( ( 'minor' ) ) ;
    public final void rule__Key__IntervalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2176:1: ( ( ( 'minor' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2177:1: ( ( 'minor' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2177:1: ( ( 'minor' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2178:1: ( 'minor' )
            {
             before(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2179:1: ( 'minor' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2180:1: 'minor'
            {
             before(grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Key__IntervalAssignment_2_14385); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2195:1: rule__Song__InstrumentsAssignment : ( ruleInstrument ) ;
    public final void rule__Song__InstrumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2199:1: ( ( ruleInstrument ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2200:1: ( ruleInstrument )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2200:1: ( ruleInstrument )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2201:1: ruleInstrument
            {
             before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment4424);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2210:1: rule__Instrument__InstrumentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instrument__InstrumentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2214:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2215:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2215:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2216:1: RULE_ID
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_04455); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2225:1: rule__Instrument__SequencesAssignment_2 : ( ruleSequence ) ;
    public final void rule__Instrument__SequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2229:1: ( ( ruleSequence ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2230:1: ( ruleSequence )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2230:1: ( ruleSequence )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2231:1: ruleSequence
            {
             before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_24486);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2240:1: rule__Sequence__NoteAssignment_0 : ( ruleNote ) ;
    public final void rule__Sequence__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2244:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2245:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2245:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2246:1: ruleNote
            {
             before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_04517);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2255:1: rule__Sequence__ChordAssignment_1 : ( ruleChord ) ;
    public final void rule__Sequence__ChordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2259:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2260:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2260:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2261:1: ruleChord
            {
             before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_14548);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2270:1: rule__Sequence__HarmonyAssignment_2 : ( ruleHarmony ) ;
    public final void rule__Sequence__HarmonyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2274:1: ( ( ruleHarmony ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2275:1: ( ruleHarmony )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2275:1: ( ruleHarmony )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2276:1: ruleHarmony
            {
             before(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_24579);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2285:1: rule__Sequence__TupletAssignment_3 : ( ruleTuplet ) ;
    public final void rule__Sequence__TupletAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2289:1: ( ( ruleTuplet ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2290:1: ( ruleTuplet )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2290:1: ( ruleTuplet )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2291:1: ruleTuplet
            {
             before(grammarAccess.getSequenceAccess().getTupletTupletParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTuplet_in_rule__Sequence__TupletAssignment_34610);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2300:1: rule__Sequence__MeasureAssignment_4 : ( RULE_MEASURE ) ;
    public final void rule__Sequence__MeasureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2304:1: ( ( RULE_MEASURE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2305:1: ( RULE_MEASURE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2305:1: ( RULE_MEASURE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2306:1: RULE_MEASURE
            {
             before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_4_0()); 
            match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_44641); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2315:1: rule__Note__OctaveAssignment_0 : ( RULE_OCTAVE ) ;
    public final void rule__Note__OctaveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2319:1: ( ( RULE_OCTAVE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2320:1: ( RULE_OCTAVE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2320:1: ( RULE_OCTAVE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2321:1: RULE_OCTAVE
            {
             before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
            match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_04672); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2330:1: rule__Note__NoteAssignment_1 : ( RULE_NOTE_ID ) ;
    public final void rule__Note__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2334:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2335:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2335:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2336:1: RULE_NOTE_ID
            {
             before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_14703); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2345:1: rule__Note__AccidentalAssignment_2 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Note__AccidentalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2349:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2350:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2350:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2351:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_24734); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2360:1: rule__Note__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2364:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2365:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2365:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2366:1: RULE_DURATION
            {
             before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_34765); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2375:1: rule__Note__PointAssignment_4 : ( ( '.' ) ) ;
    public final void rule__Note__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2379:1: ( ( ( '.' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2380:1: ( ( '.' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2380:1: ( ( '.' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2381:1: ( '.' )
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2382:1: ( '.' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2383:1: '.'
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Note__PointAssignment_44801); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2398:1: rule__Note__TieAssignment_5 : ( ( '_' ) ) ;
    public final void rule__Note__TieAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2402:1: ( ( ( '_' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2403:1: ( ( '_' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2403:1: ( ( '_' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2404:1: ( '_' )
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2405:1: ( '_' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2406:1: '_'
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__Note__TieAssignment_54845); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2421:1: rule__Chord__ChordNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2425:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2426:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2426:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2427:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_04884);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2436:1: rule__Chord__ChordNotesAssignment_1_0_1 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2440:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2441:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2441:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2442:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_0_14915);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2451:1: rule__Chord__ChordNameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Chord__ChordNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2455:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2456:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2456:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2457:1: RULE_ID
            {
             before(grammarAccess.getChordAccess().getChordNameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chord__ChordNameAssignment_1_1_14946); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2466:1: rule__Chord__InversionAssignment_1_1_2_0 : ( ( '^' ) ) ;
    public final void rule__Chord__InversionAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2470:1: ( ( ( '^' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2471:1: ( ( '^' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2471:1: ( ( '^' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2472:1: ( '^' )
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2473:1: ( '^' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2474:1: '^'
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Chord__InversionAssignment_1_1_2_04982); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2489:1: rule__Chord__InversionAssignment_1_1_2_1 : ( ( '^^' ) ) ;
    public final void rule__Chord__InversionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2493:1: ( ( ( '^^' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2494:1: ( ( '^^' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2494:1: ( ( '^^' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2495:1: ( '^^' )
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2496:1: ( '^^' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2497:1: '^^'
            {
             before(grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Chord__InversionAssignment_1_1_2_15026); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2512:1: rule__Harmony__HarmonyNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2516:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2517:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2517:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2518:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_05065);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2527:1: rule__Harmony__HarmonyNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2531:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2532:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2532:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2533:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_15096);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2542:1: rule__Harmony__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__Harmony__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2546:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2547:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2547:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2548:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_35127);
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


    // $ANTLR start "rule__Tuplet__TupletAssignment_1_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2557:1: rule__Tuplet__TupletAssignment_1_0 : ( ruleNote ) ;
    public final void rule__Tuplet__TupletAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2561:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2562:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2562:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2563:1: ruleNote
            {
             before(grammarAccess.getTupletAccess().getTupletNoteParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Tuplet__TupletAssignment_1_05158);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getTupletAccess().getTupletNoteParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuplet__TupletAssignment_1_0"


    // $ANTLR start "rule__Tuplet__TupletAssignment_1_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2572:1: rule__Tuplet__TupletAssignment_1_1 : ( ruleChord ) ;
    public final void rule__Tuplet__TupletAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2576:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2577:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2577:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2578:1: ruleChord
            {
             before(grammarAccess.getTupletAccess().getTupletChordParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Tuplet__TupletAssignment_1_15189);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getTupletAccess().getTupletChordParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuplet__TupletAssignment_1_1"


    // $ANTLR start "rule__Tuplet__DurationAssignment_3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2587:1: rule__Tuplet__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Tuplet__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2591:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2592:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2592:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:2593:1: RULE_DURATION
            {
             before(grammarAccess.getTupletAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Tuplet__DurationAssignment_35220); 
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
        "\2\uffff\1\12\2\uffff\4\12\5\uffff\5\14\2\uffff\5\14";
    static final String DFA4_minS =
        "\3\6\2\uffff\4\6\1\4\3\uffff\15\6";
    static final String DFA4_maxS =
        "\1\31\1\6\1\37\2\uffff\3\37\1\31\1\11\3\uffff\1\6\4\37\1\31\1\11"+
        "\1\6\4\37\1\31";
    static final String DFA4_acceptS =
        "\3\uffff\1\4\1\5\5\uffff\1\1\1\3\1\2\15\uffff";
    static final String DFA4_specialS =
        "\32\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\1\4\1\1\17\uffff\1\3",
            "\1\2",
            "\1\12\1\5\2\12\1\6\12\uffff\1\12\1\11\1\13\1\uffff\1\12\4"+
            "\uffff\1\7\1\10",
            "",
            "",
            "\1\12\1\uffff\2\12\1\6\12\uffff\1\12\1\11\1\13\1\uffff\1\12"+
            "\4\uffff\1\7\1\10",
            "\1\12\1\uffff\2\12\13\uffff\1\12\1\11\1\13\1\uffff\1\12\4"+
            "\uffff\1\7\1\10",
            "\1\12\1\uffff\2\12\13\uffff\1\12\1\11\1\13\1\uffff\1\12\5"+
            "\uffff\1\10",
            "\1\12\1\uffff\2\12\13\uffff\1\12\1\11\1\13\1\uffff\1\12",
            "\1\14\1\uffff\1\16\2\uffff\1\15",
            "",
            "",
            "",
            "\1\16",
            "\1\14\1\17\2\14\1\20\12\uffff\1\14\1\23\1\13\1\uffff\1\14"+
            "\4\uffff\1\21\1\22",
            "\1\14\1\uffff\2\14\1\20\12\uffff\1\14\1\23\1\13\1\uffff\1"+
            "\14\4\uffff\1\21\1\22",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14\4"+
            "\uffff\1\21\1\22",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14\5"+
            "\uffff\1\22",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14",
            "\1\25\2\uffff\1\24",
            "\1\25",
            "\1\14\1\26\2\14\1\27\12\uffff\1\14\1\23\1\13\1\uffff\1\14"+
            "\4\uffff\1\30\1\31",
            "\1\14\1\uffff\2\14\1\27\12\uffff\1\14\1\23\1\13\1\uffff\1"+
            "\14\4\uffff\1\30\1\31",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14\4"+
            "\uffff\1\30\1\31",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14\5"+
            "\uffff\1\31",
            "\1\14\1\uffff\2\14\13\uffff\1\14\1\23\1\13\1\uffff\1\14"
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
    public static final BitSet FOLLOW_rule__Tuplet__TupletAssignment_1_0_in_rule__Tuplet__Alternatives_11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__TupletAssignment_1_1_in_rule__Tuplet__Alternatives_11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__01122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01243 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11304 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21364 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01491 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Header__Group_1__0__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_1__1__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01678 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_2__0__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11740 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_2__1__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Header__Group_3__0__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11927 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_3__1__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__02052 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__02055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__NoteAssignment_0_in_rule__Key__Group__0__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__12112 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_rule__Key__Group__2_in_rule__Key__Group__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__AccidentalAssignment_1_in_rule__Key__Group__1__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__22173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Alternatives_2_in_rule__Key__Group__2__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__02236 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__12296 = new BitSet(new long[]{0x0000000002200340L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Instrument__Group__1__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__22358 = new BitSet(new long[]{0x0000000002200340L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2388 = new BitSet(new long[]{0x0000000002000342L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instrument__Group__3__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02486 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12547 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22607 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32668 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42729 = new BitSet(new long[]{0x00000000C0000480L});
    public static final BitSet FOLLOW_rule__Note__Group__5_in_rule__Note__Group__42732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__52790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02860 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Alternatives_1_in_rule__Chord__Group__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__0__Impl_in_rule__Chord__Group_1_0__02981 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__1_in_rule__Chord__Group_1_0__02984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Chord__Group_1_0__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_0__1__Impl_in_rule__Chord__Group_1_0__13043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_1_0_1_in_rule__Chord__Group_1_0__1__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__0__Impl_in_rule__Chord__Group_1_1__03104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__1_in_rule__Chord__Group_1_1__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Chord__Group_1_1__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__1__Impl_in_rule__Chord__Group_1_1__13166 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__2_in_rule__Chord__Group_1_1__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNameAssignment_1_1_1_in_rule__Chord__Group_1_1__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1_1__2__Impl_in_rule__Chord__Group_1_1__23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Alternatives_1_1_2_in_rule__Chord__Group_1_1__2__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__03290 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__13350 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl3380 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__23411 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__23414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Harmony__Group__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__33473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__33476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3505 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl3517 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__43550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Harmony__Group__4__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__03619 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__03622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Harmony__Group_1__0__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__0__Impl_in_rule__Tuplet__Group__03742 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__1_in_rule__Tuplet__Group__03745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Tuplet__Group__0__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__1__Impl_in_rule__Tuplet__Group__13804 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__2_in_rule__Tuplet__Group__13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Alternatives_1_in_rule__Tuplet__Group__1__Impl3836 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Tuplet__Alternatives_1_in_rule__Tuplet__Group__1__Impl3848 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__2__Impl_in_rule__Tuplet__Group__23881 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__3_in_rule__Tuplet__Group__23884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Tuplet__Group__2__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__Group__3__Impl_in_rule__Tuplet__Group__33943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tuplet__DurationAssignment_3_in_rule__Tuplet__Group__3__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_04013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Document__SongAssignment_14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Header__NofeedbackAssignment_04080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_24119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_rule__Header__TempoAssignment_2_24150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_24181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Tempo__ValueAssignment_04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Tempo__IdAssignment_14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Key__NoteAssignment_04274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Key__AccidentalAssignment_14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Key__IntervalAssignment_2_04341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Key__IntervalAssignment_2_14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_24486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_04517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_24579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplet_in_rule__Sequence__TupletAssignment_34610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_44641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_04672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_24734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_34765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Note__PointAssignment_44801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Note__TieAssignment_54845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_04884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_0_14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chord__ChordNameAssignment_1_1_14946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Chord__InversionAssignment_1_1_2_04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Chord__InversionAssignment_1_1_2_15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_05065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_35127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Tuplet__TupletAssignment_1_05158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Tuplet__TupletAssignment_1_15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Tuplet__DurationAssignment_35220 = new BitSet(new long[]{0x0000000000000002L});

}