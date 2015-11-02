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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_ID", "RULE_INT", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'['", "']'", "'/'", "'no-feedback'", "'.'", "'_'"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_INTERVAL=6;
    public static final int RULE_ID=7;
    public static final int RULE_MEASURE=9;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_ACCIDENTAL=5;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_STRING=12;
    public static final int RULE_NOTE_ID=4;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_OCTAVE=10;
    public static final int RULE_WS=15;

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


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:116:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:117:1: ( ruleKey EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:118:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey181);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey188); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:125:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:129:2: ( ( ( rule__Key__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:130:1: ( ( rule__Key__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:130:1: ( ( rule__Key__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:131:1: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:132:1: ( rule__Key__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:132:2: rule__Key__Group__0
            {
            pushFollow(FOLLOW_rule__Key__Group__0_in_ruleKey214);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:144:1: entryRuleSong : ruleSong EOF ;
    public final void entryRuleSong() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:145:1: ( ruleSong EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:146:1: ruleSong EOF
            {
             before(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong241);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getSongRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong248); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:153:1: ruleSong : ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) ) ;
    public final void ruleSong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:157:2: ( ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:158:1: ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:158:1: ( ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:159:1: ( ( rule__Song__InstrumentsAssignment ) ) ( ( rule__Song__InstrumentsAssignment )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:159:1: ( ( rule__Song__InstrumentsAssignment ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:160:1: ( rule__Song__InstrumentsAssignment )
            {
             before(grammarAccess.getSongAccess().getInstrumentsAssignment()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:161:1: ( rule__Song__InstrumentsAssignment )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:161:2: rule__Song__InstrumentsAssignment
            {
            pushFollow(FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong276);
            rule__Song__InstrumentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getInstrumentsAssignment()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:164:1: ( ( rule__Song__InstrumentsAssignment )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:165:1: ( rule__Song__InstrumentsAssignment )*
            {
             before(grammarAccess.getSongAccess().getInstrumentsAssignment()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:166:1: ( rule__Song__InstrumentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:166:2: rule__Song__InstrumentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong288);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:179:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:180:1: ( ruleInstrument EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:181:1: ruleInstrument EOF
            {
             before(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument318);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getInstrumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument325); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:188:1: ruleInstrument : ( ( rule__Instrument__Group__0 ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:192:2: ( ( ( rule__Instrument__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:193:1: ( ( rule__Instrument__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:193:1: ( ( rule__Instrument__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:194:1: ( rule__Instrument__Group__0 )
            {
             before(grammarAccess.getInstrumentAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:195:1: ( rule__Instrument__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:195:2: rule__Instrument__Group__0
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0_in_ruleInstrument351);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:207:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:208:1: ( ruleSequence EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:209:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence378);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence385); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:216:1: ruleSequence : ( ( rule__Sequence__Alternatives ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:220:2: ( ( ( rule__Sequence__Alternatives ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:221:1: ( ( rule__Sequence__Alternatives ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:221:1: ( ( rule__Sequence__Alternatives ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:222:1: ( rule__Sequence__Alternatives )
            {
             before(grammarAccess.getSequenceAccess().getAlternatives()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:223:1: ( rule__Sequence__Alternatives )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:223:2: rule__Sequence__Alternatives
            {
            pushFollow(FOLLOW_rule__Sequence__Alternatives_in_ruleSequence411);
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


    // $ANTLR start "entryRuleHarmony"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:235:1: entryRuleHarmony : ruleHarmony EOF ;
    public final void entryRuleHarmony() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:236:1: ( ruleHarmony EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:237:1: ruleHarmony EOF
            {
             before(grammarAccess.getHarmonyRule()); 
            pushFollow(FOLLOW_ruleHarmony_in_entryRuleHarmony438);
            ruleHarmony();

            state._fsp--;

             after(grammarAccess.getHarmonyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHarmony445); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:244:1: ruleHarmony : ( ( rule__Harmony__Group__0 ) ) ;
    public final void ruleHarmony() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:248:2: ( ( ( rule__Harmony__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Harmony__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Harmony__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:250:1: ( rule__Harmony__Group__0 )
            {
             before(grammarAccess.getHarmonyAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:1: ( rule__Harmony__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:2: rule__Harmony__Group__0
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0_in_ruleHarmony471);
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


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:263:1: entryRuleChord : ruleChord EOF ;
    public final void entryRuleChord() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:264:1: ( ruleChord EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:265:1: ruleChord EOF
            {
             before(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord498);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getChordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord505); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:272:1: ruleChord : ( ( rule__Chord__Group__0 ) ) ;
    public final void ruleChord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:276:2: ( ( ( rule__Chord__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:277:1: ( ( rule__Chord__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:277:1: ( ( rule__Chord__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:278:1: ( rule__Chord__Group__0 )
            {
             before(grammarAccess.getChordAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:279:1: ( rule__Chord__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:279:2: rule__Chord__Group__0
            {
            pushFollow(FOLLOW_rule__Chord__Group__0_in_ruleChord531);
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


    // $ANTLR start "entryRuleNote"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:291:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:292:1: ( ruleNote EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:293:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote558);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote565); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:300:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:304:2: ( ( ( rule__Note__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:305:1: ( ( rule__Note__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:305:1: ( ( rule__Note__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:306:1: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:307:1: ( rule__Note__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:307:2: rule__Note__Group__0
            {
            pushFollow(FOLLOW_rule__Note__Group__0_in_ruleNote591);
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


    // $ANTLR start "rule__Sequence__Alternatives"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:319:1: rule__Sequence__Alternatives : ( ( ( rule__Sequence__Alternatives_0 ) ) | ( ( rule__Sequence__MeasureAssignment_1 ) ) );
    public final void rule__Sequence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:323:1: ( ( ( rule__Sequence__Alternatives_0 ) ) | ( ( rule__Sequence__MeasureAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NOTE_ID||LA2_0==RULE_OCTAVE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MEASURE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:324:1: ( ( rule__Sequence__Alternatives_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:324:1: ( ( rule__Sequence__Alternatives_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:325:1: ( rule__Sequence__Alternatives_0 )
                    {
                     before(grammarAccess.getSequenceAccess().getAlternatives_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:326:1: ( rule__Sequence__Alternatives_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:326:2: rule__Sequence__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Alternatives_0_in_rule__Sequence__Alternatives627);
                    rule__Sequence__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:330:6: ( ( rule__Sequence__MeasureAssignment_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:330:6: ( ( rule__Sequence__MeasureAssignment_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:331:1: ( rule__Sequence__MeasureAssignment_1 )
                    {
                     before(grammarAccess.getSequenceAccess().getMeasureAssignment_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:332:1: ( rule__Sequence__MeasureAssignment_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:332:2: rule__Sequence__MeasureAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sequence__MeasureAssignment_1_in_rule__Sequence__Alternatives645);
                    rule__Sequence__MeasureAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getMeasureAssignment_1()); 

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


    // $ANTLR start "rule__Sequence__Alternatives_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:341:1: rule__Sequence__Alternatives_0 : ( ( ( rule__Sequence__NoteAssignment_0_0 ) ) | ( ( rule__Sequence__ChordAssignment_0_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_0_2 ) ) );
    public final void rule__Sequence__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:345:1: ( ( ( rule__Sequence__NoteAssignment_0_0 ) ) | ( ( rule__Sequence__ChordAssignment_0_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_0_2 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:346:1: ( ( rule__Sequence__NoteAssignment_0_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:346:1: ( ( rule__Sequence__NoteAssignment_0_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:347:1: ( rule__Sequence__NoteAssignment_0_0 )
                    {
                     before(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:348:1: ( rule__Sequence__NoteAssignment_0_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:348:2: rule__Sequence__NoteAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Sequence__NoteAssignment_0_0_in_rule__Sequence__Alternatives_0678);
                    rule__Sequence__NoteAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:352:6: ( ( rule__Sequence__ChordAssignment_0_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:352:6: ( ( rule__Sequence__ChordAssignment_0_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:353:1: ( rule__Sequence__ChordAssignment_0_1 )
                    {
                     before(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:354:1: ( rule__Sequence__ChordAssignment_0_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:354:2: rule__Sequence__ChordAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Sequence__ChordAssignment_0_1_in_rule__Sequence__Alternatives_0696);
                    rule__Sequence__ChordAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:358:6: ( ( rule__Sequence__HarmonyAssignment_0_2 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:358:6: ( ( rule__Sequence__HarmonyAssignment_0_2 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:359:1: ( rule__Sequence__HarmonyAssignment_0_2 )
                    {
                     before(grammarAccess.getSequenceAccess().getHarmonyAssignment_0_2()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:360:1: ( rule__Sequence__HarmonyAssignment_0_2 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:360:2: rule__Sequence__HarmonyAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Sequence__HarmonyAssignment_0_2_in_rule__Sequence__Alternatives_0714);
                    rule__Sequence__HarmonyAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getHarmonyAssignment_0_2()); 

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
    // $ANTLR end "rule__Sequence__Alternatives_0"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:371:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:375:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:376:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0745);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0748);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:383:1: rule__Document__Group__0__Impl : ( ( rule__Document__HeaderAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:387:1: ( ( ( rule__Document__HeaderAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:388:1: ( ( rule__Document__HeaderAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:388:1: ( ( rule__Document__HeaderAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:389:1: ( rule__Document__HeaderAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:390:1: ( rule__Document__HeaderAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:390:2: rule__Document__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl775);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:400:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:404:1: ( rule__Document__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:405:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1805);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:411:1: rule__Document__Group__1__Impl : ( ( rule__Document__SongAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:415:1: ( ( ( rule__Document__SongAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:416:1: ( ( rule__Document__SongAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:416:1: ( ( rule__Document__SongAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:417:1: ( rule__Document__SongAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getSongAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:418:1: ( rule__Document__SongAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:418:2: rule__Document__SongAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl832);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:432:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:436:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:437:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__0866);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__0869);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:1: rule__Header__Group__0__Impl : ( ( rule__Header__NofeedbackAssignment_0 )? ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:448:1: ( ( ( rule__Header__NofeedbackAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:449:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:449:1: ( ( rule__Header__NofeedbackAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:450:1: ( rule__Header__NofeedbackAssignment_0 )?
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:451:1: ( rule__Header__NofeedbackAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:451:2: rule__Header__NofeedbackAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl896);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:461:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:465:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:466:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1927);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1930);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:473:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:477:1: ( ( ( rule__Header__Group_1__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:478:1: ( ( rule__Header__Group_1__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:478:1: ( ( rule__Header__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:479:1: ( rule__Header__Group_1__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:480:1: ( rule__Header__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:480:2: rule__Header__Group_1__0
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl957);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:490:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:494:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:495:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2987);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__3_in_rule__Header__Group__2990);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:502:1: rule__Header__Group__2__Impl : ( ( rule__Header__Group_2__0 )? ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:506:1: ( ( ( rule__Header__Group_2__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:507:1: ( ( rule__Header__Group_2__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:507:1: ( ( rule__Header__Group_2__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:508:1: ( rule__Header__Group_2__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:509:1: ( rule__Header__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:509:2: rule__Header__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1017);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:519:1: rule__Header__Group__3 : rule__Header__Group__3__Impl ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:523:1: ( rule__Header__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:524:2: rule__Header__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31048);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:530:1: rule__Header__Group__3__Impl : ( ( rule__Header__Group_3__0 )? ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:534:1: ( ( ( rule__Header__Group_3__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:535:1: ( ( rule__Header__Group_3__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:535:1: ( ( rule__Header__Group_3__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:536:1: ( rule__Header__Group_3__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:537:1: ( rule__Header__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:537:2: rule__Header__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1075);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:555:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:559:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:560:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01114);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01117);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:567:1: rule__Header__Group_1__0__Impl : ( 'title' ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:571:1: ( ( 'title' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:572:1: ( 'title' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:572:1: ( 'title' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:573:1: 'title'
            {
             before(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_1__0__Impl1145); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:586:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl rule__Header__Group_1__2 ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:590:1: ( rule__Header__Group_1__1__Impl rule__Header__Group_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:591:2: rule__Header__Group_1__1__Impl rule__Header__Group_1__2
            {
            pushFollow(FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11176);
            rule__Header__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11179);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:598:1: rule__Header__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:602:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:603:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:603:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:604:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_1__1__Impl1207); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:617:1: rule__Header__Group_1__2 : rule__Header__Group_1__2__Impl ;
    public final void rule__Header__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:621:1: ( rule__Header__Group_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:622:2: rule__Header__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21238);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:628:1: rule__Header__Group_1__2__Impl : ( ( rule__Header__SongNameAssignment_1_2 ) ) ;
    public final void rule__Header__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:632:1: ( ( ( rule__Header__SongNameAssignment_1_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:633:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:633:1: ( ( rule__Header__SongNameAssignment_1_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:634:1: ( rule__Header__SongNameAssignment_1_2 )
            {
             before(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:635:1: ( rule__Header__SongNameAssignment_1_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:635:2: rule__Header__SongNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1265);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:651:1: rule__Header__Group_2__0 : rule__Header__Group_2__0__Impl rule__Header__Group_2__1 ;
    public final void rule__Header__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:655:1: ( rule__Header__Group_2__0__Impl rule__Header__Group_2__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:656:2: rule__Header__Group_2__0__Impl rule__Header__Group_2__1
            {
            pushFollow(FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01301);
            rule__Header__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01304);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:663:1: rule__Header__Group_2__0__Impl : ( 'tempo' ) ;
    public final void rule__Header__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:667:1: ( ( 'tempo' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:668:1: ( 'tempo' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:668:1: ( 'tempo' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:669:1: 'tempo'
            {
             before(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Header__Group_2__0__Impl1332); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:682:1: rule__Header__Group_2__1 : rule__Header__Group_2__1__Impl rule__Header__Group_2__2 ;
    public final void rule__Header__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:686:1: ( rule__Header__Group_2__1__Impl rule__Header__Group_2__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:687:2: rule__Header__Group_2__1__Impl rule__Header__Group_2__2
            {
            pushFollow(FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11363);
            rule__Header__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11366);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:694:1: rule__Header__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_2__1__Impl1394); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:713:1: rule__Header__Group_2__2 : rule__Header__Group_2__2__Impl ;
    public final void rule__Header__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:717:1: ( rule__Header__Group_2__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:718:2: rule__Header__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21425);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:724:1: rule__Header__Group_2__2__Impl : ( ( rule__Header__TempoAssignment_2_2 ) ) ;
    public final void rule__Header__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:728:1: ( ( ( rule__Header__TempoAssignment_2_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:729:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:729:1: ( ( rule__Header__TempoAssignment_2_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:730:1: ( rule__Header__TempoAssignment_2_2 )
            {
             before(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:731:1: ( rule__Header__TempoAssignment_2_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:731:2: rule__Header__TempoAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1452);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:747:1: rule__Header__Group_3__0 : rule__Header__Group_3__0__Impl rule__Header__Group_3__1 ;
    public final void rule__Header__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:751:1: ( rule__Header__Group_3__0__Impl rule__Header__Group_3__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:752:2: rule__Header__Group_3__0__Impl rule__Header__Group_3__1
            {
            pushFollow(FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01488);
            rule__Header__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01491);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:759:1: rule__Header__Group_3__0__Impl : ( 'key' ) ;
    public final void rule__Header__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:763:1: ( ( 'key' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:764:1: ( 'key' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:764:1: ( 'key' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:765:1: 'key'
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Header__Group_3__0__Impl1519); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:778:1: rule__Header__Group_3__1 : rule__Header__Group_3__1__Impl rule__Header__Group_3__2 ;
    public final void rule__Header__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:782:1: ( rule__Header__Group_3__1__Impl rule__Header__Group_3__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:783:2: rule__Header__Group_3__1__Impl rule__Header__Group_3__2
            {
            pushFollow(FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11550);
            rule__Header__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11553);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:790:1: rule__Header__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:794:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_3__1__Impl1581); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:809:1: rule__Header__Group_3__2 : rule__Header__Group_3__2__Impl ;
    public final void rule__Header__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:813:1: ( rule__Header__Group_3__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:814:2: rule__Header__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21612);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:820:1: rule__Header__Group_3__2__Impl : ( ( rule__Header__KeyAssignment_3_2 ) ) ;
    public final void rule__Header__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:824:1: ( ( ( rule__Header__KeyAssignment_3_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:825:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:825:1: ( ( rule__Header__KeyAssignment_3_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:826:1: ( rule__Header__KeyAssignment_3_2 )
            {
             before(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:827:1: ( rule__Header__KeyAssignment_3_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:827:2: rule__Header__KeyAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl1639);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:843:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:847:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:848:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01675);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01678);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:855:1: rule__Key__Group__0__Impl : ( RULE_NOTE_ID ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:859:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:860:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:860:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:861:1: RULE_NOTE_ID
            {
             before(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1705); 
             after(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:872:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:876:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:877:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11734);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11737);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:884:1: rule__Key__Group__1__Impl : ( ( RULE_ACCIDENTAL )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:888:1: ( ( ( RULE_ACCIDENTAL )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:889:1: ( ( RULE_ACCIDENTAL )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:889:1: ( ( RULE_ACCIDENTAL )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:890:1: ( RULE_ACCIDENTAL )?
            {
             before(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:891:1: ( RULE_ACCIDENTAL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ACCIDENTAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:891:3: RULE_ACCIDENTAL
                    {
                    match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1765); 

                    }
                    break;

            }

             after(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:901:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:905:1: ( rule__Key__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:906:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21796);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:912:1: rule__Key__Group__2__Impl : ( RULE_INTERVAL ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:916:1: ( ( RULE_INTERVAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:917:1: ( RULE_INTERVAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:917:1: ( RULE_INTERVAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:918:1: RULE_INTERVAL
            {
             before(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); 
            match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1823); 
             after(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:935:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:939:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:940:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01858);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01861);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:947:1: rule__Instrument__Group__0__Impl : ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:951:1: ( ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:952:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:952:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:953:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:954:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:954:2: rule__Instrument__InstrumentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1888);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:964:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:968:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:969:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11918);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11921);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:976:1: rule__Instrument__Group__1__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:980:1: ( ( '{' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:981:1: ( '{' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:981:1: ( '{' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:982:1: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Instrument__Group__1__Impl1949); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:995:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:999:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1000:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21980);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21983);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1007:1: rule__Instrument__Group__2__Impl : ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1011:1: ( ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1012:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1012:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1013:1: ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1013:1: ( ( rule__Instrument__SequencesAssignment_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1014:1: ( rule__Instrument__SequencesAssignment_2 )
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1015:1: ( rule__Instrument__SequencesAssignment_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1015:2: rule__Instrument__SequencesAssignment_2
            {
            pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2012);
            rule__Instrument__SequencesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1018:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1019:1: ( rule__Instrument__SequencesAssignment_2 )*
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1020:1: ( rule__Instrument__SequencesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_NOTE_ID||(LA8_0>=RULE_MEASURE && LA8_0<=RULE_OCTAVE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1020:2: rule__Instrument__SequencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2024);
            	    rule__Instrument__SequencesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 

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
    // $ANTLR end "rule__Instrument__Group__2__Impl"


    // $ANTLR start "rule__Instrument__Group__3"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1031:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1035:1: ( rule__Instrument__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1036:2: rule__Instrument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32057);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1042:1: rule__Instrument__Group__3__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1046:1: ( ( '}' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1047:1: ( '}' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1047:1: ( '}' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1048:1: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Instrument__Group__3__Impl2085); 
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


    // $ANTLR start "rule__Harmony__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1069:1: rule__Harmony__Group__0 : rule__Harmony__Group__0__Impl rule__Harmony__Group__1 ;
    public final void rule__Harmony__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1073:1: ( rule__Harmony__Group__0__Impl rule__Harmony__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1074:2: rule__Harmony__Group__0__Impl rule__Harmony__Group__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__02124);
            rule__Harmony__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__02127);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1081:1: rule__Harmony__Group__0__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) ;
    public final void rule__Harmony__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1085:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1086:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1086:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1087:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1088:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1088:2: rule__Harmony__HarmonyNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl2154);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1098:1: rule__Harmony__Group__1 : rule__Harmony__Group__1__Impl rule__Harmony__Group__2 ;
    public final void rule__Harmony__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1102:1: ( rule__Harmony__Group__1__Impl rule__Harmony__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1103:2: rule__Harmony__Group__1__Impl rule__Harmony__Group__2
            {
            pushFollow(FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__12184);
            rule__Harmony__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__12187);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1110:1: rule__Harmony__Group__1__Impl : ( ( rule__Harmony__Group_1__0 )* ) ;
    public final void rule__Harmony__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1114:1: ( ( ( rule__Harmony__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1115:1: ( ( rule__Harmony__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1115:1: ( ( rule__Harmony__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1116:1: ( rule__Harmony__Group_1__0 )*
            {
             before(grammarAccess.getHarmonyAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1117:1: ( rule__Harmony__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1117:2: rule__Harmony__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl2214);
            	    rule__Harmony__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1127:1: rule__Harmony__Group__2 : rule__Harmony__Group__2__Impl rule__Harmony__Group__3 ;
    public final void rule__Harmony__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1131:1: ( rule__Harmony__Group__2__Impl rule__Harmony__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1132:2: rule__Harmony__Group__2__Impl rule__Harmony__Group__3
            {
            pushFollow(FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__22245);
            rule__Harmony__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__22248);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1139:1: rule__Harmony__Group__2__Impl : ( '[' ) ;
    public final void rule__Harmony__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1143:1: ( ( '[' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( '[' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( '[' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1145:1: '['
            {
             before(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Harmony__Group__2__Impl2276); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1158:1: rule__Harmony__Group__3 : rule__Harmony__Group__3__Impl rule__Harmony__Group__4 ;
    public final void rule__Harmony__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1162:1: ( rule__Harmony__Group__3__Impl rule__Harmony__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1163:2: rule__Harmony__Group__3__Impl rule__Harmony__Group__4
            {
            pushFollow(FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__32307);
            rule__Harmony__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__32310);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1170:1: rule__Harmony__Group__3__Impl : ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) ;
    public final void rule__Harmony__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1174:1: ( ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1175:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1175:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1176:1: ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1176:1: ( ( rule__Harmony__NotesAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1177:1: ( rule__Harmony__NotesAssignment_3 )
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1178:1: ( rule__Harmony__NotesAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1178:2: rule__Harmony__NotesAssignment_3
            {
            pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2339);
            rule__Harmony__NotesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1181:1: ( ( rule__Harmony__NotesAssignment_3 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1182:1: ( rule__Harmony__NotesAssignment_3 )*
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1183:1: ( rule__Harmony__NotesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_NOTE_ID||LA10_0==RULE_OCTAVE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1183:2: rule__Harmony__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2351);
            	    rule__Harmony__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1194:1: rule__Harmony__Group__4 : rule__Harmony__Group__4__Impl ;
    public final void rule__Harmony__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1198:1: ( rule__Harmony__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1199:2: rule__Harmony__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__42384);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1205:1: rule__Harmony__Group__4__Impl : ( ']' ) ;
    public final void rule__Harmony__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1209:1: ( ( ']' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1210:1: ( ']' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1210:1: ( ']' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1211:1: ']'
            {
             before(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Harmony__Group__4__Impl2412); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1234:1: rule__Harmony__Group_1__0 : rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 ;
    public final void rule__Harmony__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1238:1: ( rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1239:2: rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__02453);
            rule__Harmony__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__02456);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1246:1: rule__Harmony__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Harmony__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1250:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1252:1: '/'
            {
             before(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Harmony__Group_1__0__Impl2484); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1265:1: rule__Harmony__Group_1__1 : rule__Harmony__Group_1__1__Impl ;
    public final void rule__Harmony__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1269:1: ( rule__Harmony__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1270:2: rule__Harmony__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__12515);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1276:1: rule__Harmony__Group_1__1__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) ;
    public final void rule__Harmony__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1280:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1281:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1281:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1282:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1283:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1283:2: rule__Harmony__HarmonyNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl2542);
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


    // $ANTLR start "rule__Chord__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1297:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1301:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1302:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02576);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02579);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1309:1: rule__Chord__Group__0__Impl : ( ( rule__Chord__ChordNotesAssignment_0 ) ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1313:1: ( ( ( rule__Chord__ChordNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1314:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1314:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1315:1: ( rule__Chord__ChordNotesAssignment_0 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1316:1: ( rule__Chord__ChordNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1316:2: rule__Chord__ChordNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2606);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1326:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1330:1: ( rule__Chord__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1331:2: rule__Chord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12636);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1337:1: rule__Chord__Group__1__Impl : ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1341:1: ( ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1342:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1342:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1343:1: ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1343:1: ( ( rule__Chord__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1344:1: ( rule__Chord__Group_1__0 )
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1345:1: ( rule__Chord__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1345:2: rule__Chord__Group_1__0
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2665);
            rule__Chord__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getGroup_1()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1348:1: ( ( rule__Chord__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1349:1: ( rule__Chord__Group_1__0 )*
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1350:1: ( rule__Chord__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1350:2: rule__Chord__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2677);
            	    rule__Chord__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChordAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Chord__Group__1__Impl"


    // $ANTLR start "rule__Chord__Group_1__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1365:1: rule__Chord__Group_1__0 : rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 ;
    public final void rule__Chord__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1369:1: ( rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1370:2: rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02714);
            rule__Chord__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02717);
            rule__Chord__Group_1__1();

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
    // $ANTLR end "rule__Chord__Group_1__0"


    // $ANTLR start "rule__Chord__Group_1__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1377:1: rule__Chord__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1381:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1382:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1382:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1383:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Chord__Group_1__0__Impl2745); 
             after(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group_1__0__Impl"


    // $ANTLR start "rule__Chord__Group_1__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1396:1: rule__Chord__Group_1__1 : rule__Chord__Group_1__1__Impl ;
    public final void rule__Chord__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1400:1: ( rule__Chord__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1401:2: rule__Chord__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12776);
            rule__Chord__Group_1__1__Impl();

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
    // $ANTLR end "rule__Chord__Group_1__1"


    // $ANTLR start "rule__Chord__Group_1__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1407:1: rule__Chord__Group_1__1__Impl : ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) ;
    public final void rule__Chord__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1411:1: ( ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1412:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1412:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1413:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:2: rule__Chord__ChordNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2803);
            rule__Chord__ChordNotesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group_1__1__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1428:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1432:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1433:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02837);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02840);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1440:1: rule__Note__Group__0__Impl : ( ( rule__Note__OctaveAssignment_0 )? ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1444:1: ( ( ( rule__Note__OctaveAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:1: ( ( rule__Note__OctaveAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:1: ( ( rule__Note__OctaveAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1446:1: ( rule__Note__OctaveAssignment_0 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1447:1: ( rule__Note__OctaveAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OCTAVE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1447:2: rule__Note__OctaveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2867);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1457:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1461:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1462:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12898);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12901);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1469:1: rule__Note__Group__1__Impl : ( ( rule__Note__NoteAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1473:1: ( ( ( rule__Note__NoteAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1474:1: ( ( rule__Note__NoteAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1474:1: ( ( rule__Note__NoteAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1475:1: ( rule__Note__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNoteAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1476:1: ( rule__Note__NoteAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1476:2: rule__Note__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2928);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1486:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1490:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1491:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22958);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22961);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1498:1: rule__Note__Group__2__Impl : ( ( rule__Note__AccidentalAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1502:1: ( ( ( rule__Note__AccidentalAssignment_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1503:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1503:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1504:1: ( rule__Note__AccidentalAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1505:1: ( rule__Note__AccidentalAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ACCIDENTAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1505:2: rule__Note__AccidentalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2988);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1515:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1519:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1520:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__33019);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__4_in_rule__Note__Group__33022);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1527:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1531:1: ( ( ( rule__Note__DurationAssignment_3 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1532:1: ( ( rule__Note__DurationAssignment_3 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1532:1: ( ( rule__Note__DurationAssignment_3 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1533:1: ( rule__Note__DurationAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1534:1: ( rule__Note__DurationAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DURATION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1534:2: rule__Note__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl3049);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1544:1: rule__Note__Group__4 : rule__Note__Group__4__Impl rule__Note__Group__5 ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1548:1: ( rule__Note__Group__4__Impl rule__Note__Group__5 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1549:2: rule__Note__Group__4__Impl rule__Note__Group__5
            {
            pushFollow(FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__43080);
            rule__Note__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__5_in_rule__Note__Group__43083);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1556:1: rule__Note__Group__4__Impl : ( ( rule__Note__PointAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1560:1: ( ( ( rule__Note__PointAssignment_4 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1561:1: ( ( rule__Note__PointAssignment_4 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1561:1: ( ( rule__Note__PointAssignment_4 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1562:1: ( rule__Note__PointAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getPointAssignment_4()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1563:1: ( rule__Note__PointAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1563:2: rule__Note__PointAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl3110);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1573:1: rule__Note__Group__5 : rule__Note__Group__5__Impl ;
    public final void rule__Note__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1577:1: ( rule__Note__Group__5__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1578:2: rule__Note__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__53141);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1584:1: rule__Note__Group__5__Impl : ( ( rule__Note__TieAssignment_5 )? ) ;
    public final void rule__Note__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1588:1: ( ( ( rule__Note__TieAssignment_5 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1589:1: ( ( rule__Note__TieAssignment_5 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1589:1: ( ( rule__Note__TieAssignment_5 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1590:1: ( rule__Note__TieAssignment_5 )?
            {
             before(grammarAccess.getNoteAccess().getTieAssignment_5()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1591:1: ( rule__Note__TieAssignment_5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1591:2: rule__Note__TieAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl3168);
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


    // $ANTLR start "rule__Document__HeaderAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1614:1: rule__Document__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Document__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1618:1: ( ( ruleHeader ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1619:1: ( ruleHeader )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1619:1: ( ruleHeader )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1620:1: ruleHeader
            {
             before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03216);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1629:1: rule__Document__SongAssignment_1 : ( ruleSong ) ;
    public final void rule__Document__SongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1633:1: ( ( ruleSong ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1634:1: ( ruleSong )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1634:1: ( ruleSong )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1635:1: ruleSong
            {
             before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Document__SongAssignment_13247);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1644:1: rule__Header__NofeedbackAssignment_0 : ( ( 'no-feedback' ) ) ;
    public final void rule__Header__NofeedbackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1648:1: ( ( ( 'no-feedback' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1649:1: ( ( 'no-feedback' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1649:1: ( ( 'no-feedback' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1650:1: ( 'no-feedback' )
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1651:1: ( 'no-feedback' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1652:1: 'no-feedback'
            {
             before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Header__NofeedbackAssignment_03283); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1667:1: rule__Header__SongNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Header__SongNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1671:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1672:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1672:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1673:1: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_23322); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1682:1: rule__Header__TempoAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Header__TempoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1686:1: ( ( RULE_INT ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1687:1: ( RULE_INT )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1687:1: ( RULE_INT )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1688:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_2_23353); 
             after(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1697:1: rule__Header__KeyAssignment_3_2 : ( ruleKey ) ;
    public final void rule__Header__KeyAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1701:1: ( ( ruleKey ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1702:1: ( ruleKey )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1702:1: ( ruleKey )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1703:1: ruleKey
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_23384);
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


    // $ANTLR start "rule__Song__InstrumentsAssignment"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1712:1: rule__Song__InstrumentsAssignment : ( ruleInstrument ) ;
    public final void rule__Song__InstrumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1716:1: ( ( ruleInstrument ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1717:1: ( ruleInstrument )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1717:1: ( ruleInstrument )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1718:1: ruleInstrument
            {
             before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment3415);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1727:1: rule__Instrument__InstrumentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instrument__InstrumentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1731:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1732:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1732:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1733:1: RULE_ID
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_03446); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1742:1: rule__Instrument__SequencesAssignment_2 : ( ruleSequence ) ;
    public final void rule__Instrument__SequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1746:1: ( ( ruleSequence ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1747:1: ( ruleSequence )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1747:1: ( ruleSequence )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1748:1: ruleSequence
            {
             before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_23477);
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


    // $ANTLR start "rule__Sequence__NoteAssignment_0_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1757:1: rule__Sequence__NoteAssignment_0_0 : ( ruleNote ) ;
    public final void rule__Sequence__NoteAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1761:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1762:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1762:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1763:1: ruleNote
            {
             before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_03508);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__NoteAssignment_0_0"


    // $ANTLR start "rule__Sequence__ChordAssignment_0_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1772:1: rule__Sequence__ChordAssignment_0_1 : ( ruleChord ) ;
    public final void rule__Sequence__ChordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1776:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1777:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1777:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1778:1: ruleChord
            {
             before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_13539);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ChordAssignment_0_1"


    // $ANTLR start "rule__Sequence__HarmonyAssignment_0_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1787:1: rule__Sequence__HarmonyAssignment_0_2 : ( ruleHarmony ) ;
    public final void rule__Sequence__HarmonyAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1791:1: ( ( ruleHarmony ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1792:1: ( ruleHarmony )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1792:1: ( ruleHarmony )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1793:1: ruleHarmony
            {
             before(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_0_23570);
            ruleHarmony();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__HarmonyAssignment_0_2"


    // $ANTLR start "rule__Sequence__MeasureAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1802:1: rule__Sequence__MeasureAssignment_1 : ( RULE_MEASURE ) ;
    public final void rule__Sequence__MeasureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1806:1: ( ( RULE_MEASURE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1807:1: ( RULE_MEASURE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1807:1: ( RULE_MEASURE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1808:1: RULE_MEASURE
            {
             before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); 
            match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_13601); 
             after(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__MeasureAssignment_1"


    // $ANTLR start "rule__Harmony__HarmonyNotesAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1817:1: rule__Harmony__HarmonyNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1821:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1822:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1822:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1823:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_03632);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1832:1: rule__Harmony__HarmonyNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1836:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1837:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1837:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1838:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_13663);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1847:1: rule__Harmony__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__Harmony__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1851:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1852:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1852:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1853:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_33694);
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


    // $ANTLR start "rule__Chord__ChordNotesAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1862:1: rule__Chord__ChordNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1866:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1867:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1867:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1868:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_03725);
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


    // $ANTLR start "rule__Chord__ChordNotesAssignment_1_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1877:1: rule__Chord__ChordNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1881:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1882:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1882:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1883:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_13756);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__ChordNotesAssignment_1_1"


    // $ANTLR start "rule__Note__OctaveAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1892:1: rule__Note__OctaveAssignment_0 : ( RULE_OCTAVE ) ;
    public final void rule__Note__OctaveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1896:1: ( ( RULE_OCTAVE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1897:1: ( RULE_OCTAVE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1897:1: ( RULE_OCTAVE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1898:1: RULE_OCTAVE
            {
             before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
            match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_03787); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1907:1: rule__Note__NoteAssignment_1 : ( RULE_NOTE_ID ) ;
    public final void rule__Note__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1911:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1912:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1912:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1913:1: RULE_NOTE_ID
            {
             before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_13818); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1922:1: rule__Note__AccidentalAssignment_2 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Note__AccidentalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1926:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1927:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1927:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1928:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23849); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1937:1: rule__Note__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1941:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1942:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1942:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1943:1: RULE_DURATION
            {
             before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33880); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1952:1: rule__Note__PointAssignment_4 : ( ( '.' ) ) ;
    public final void rule__Note__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1956:1: ( ( ( '.' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1957:1: ( ( '.' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1957:1: ( ( '.' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1958:1: ( '.' )
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1959:1: ( '.' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1960:1: '.'
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Note__PointAssignment_43916); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1975:1: rule__Note__TieAssignment_5 : ( ( '_' ) ) ;
    public final void rule__Note__TieAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1979:1: ( ( ( '_' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1980:1: ( ( '_' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1980:1: ( ( '_' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1981:1: ( '_' )
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1982:1: ( '_' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1983:1: '_'
            {
             before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__Note__TieAssignment_53960); 
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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\30\uffff";
    static final String DFA3_eofS =
        "\2\uffff\5\11\4\uffff\5\21\3\uffff\5\21";
    static final String DFA3_minS =
        "\10\4\2\uffff\7\4\1\uffff\6\4";
    static final String DFA3_maxS =
        "\1\12\1\4\4\34\1\31\1\12\2\uffff\1\4\4\34\1\31\1\12\1\uffff\1\4"+
        "\4\34\1\31";
    static final String DFA3_acceptS =
        "\10\uffff\1\3\1\1\7\uffff\1\2\6\uffff";
    static final String DFA3_specialS =
        "\30\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\5\uffff\1\1",
            "\1\2",
            "\1\11\1\3\3\uffff\2\11\1\4\12\uffff\1\11\1\10\1\uffff\1\7"+
            "\1\uffff\1\5\1\6",
            "\1\11\4\uffff\2\11\1\4\12\uffff\1\11\1\10\1\uffff\1\7\1\uffff"+
            "\1\5\1\6",
            "\1\11\4\uffff\2\11\13\uffff\1\11\1\10\1\uffff\1\7\1\uffff"+
            "\1\5\1\6",
            "\1\11\4\uffff\2\11\13\uffff\1\11\1\10\1\uffff\1\7\2\uffff"+
            "\1\6",
            "\1\11\4\uffff\2\11\13\uffff\1\11\1\10\1\uffff\1\7",
            "\1\13\5\uffff\1\12",
            "",
            "",
            "\1\13",
            "\1\21\1\14\3\uffff\2\21\1\15\12\uffff\1\21\1\10\1\uffff\1"+
            "\20\1\uffff\1\16\1\17",
            "\1\21\4\uffff\2\21\1\15\12\uffff\1\21\1\10\1\uffff\1\20\1"+
            "\uffff\1\16\1\17",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20\1\uffff"+
            "\1\16\1\17",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20\2\uffff"+
            "\1\17",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20",
            "\1\23\5\uffff\1\22",
            "",
            "\1\23",
            "\1\21\1\24\3\uffff\2\21\1\25\12\uffff\1\21\1\10\1\uffff\1"+
            "\20\1\uffff\1\26\1\27",
            "\1\21\4\uffff\2\21\1\25\12\uffff\1\21\1\10\1\uffff\1\20\1"+
            "\uffff\1\26\1\27",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20\1\uffff"+
            "\1\26\1\27",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20\2\uffff"+
            "\1\27",
            "\1\21\4\uffff\2\21\13\uffff\1\21\1\10\1\uffff\1\20"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "341:1: rule__Sequence__Alternatives_0 : ( ( ( rule__Sequence__NoteAssignment_0_0 ) ) | ( ( rule__Sequence__ChordAssignment_0_1 ) ) | ( ( rule__Sequence__HarmonyAssignment_0_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0_in_ruleHeader154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0_in_ruleKey214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong276 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Song__InstrumentsAssignment_in_ruleSong288 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0_in_ruleInstrument351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Alternatives_in_ruleSequence411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_entryRuleHarmony438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHarmony445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0_in_ruleHarmony471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0_in_ruleChord531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Alternatives_0_in_rule__Sequence__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MeasureAssignment_1_in_rule__Sequence__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NoteAssignment_0_0_in_rule__Sequence__Alternatives_0678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ChordAssignment_0_1_in_rule__Sequence__Alternatives_0696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__HarmonyAssignment_0_2_in_rule__Sequence__Alternatives_0714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0745 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__0866 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__0869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NofeedbackAssignment_0_in_rule__Header__Group__0__Impl896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1927 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2987 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__3_in_rule__Header__Group__2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0_in_rule__Header__Group__3__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01114 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_1__0__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_1__1__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__SongNameAssignment_1_2_in_rule__Header__Group_1__2__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Header__Group_2__0__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_2__1__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__TempoAssignment_2_2_in_rule__Header__Group_2__2__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__0__Impl_in_rule__Header__Group_3__01488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1_in_rule__Header__Group_3__01491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Header__Group_3__0__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__1__Impl_in_rule__Header__Group_3__11550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2_in_rule__Header__Group_3__11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_3__1__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_3__2__Impl_in_rule__Header__Group_3__21612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__KeyAssignment_3_2_in_rule__Header__Group_3__2__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01675 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11734 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11918 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instrument__Group__1__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21980 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2012 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl2024 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__32057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instrument__Group__3__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__02124 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__02127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__12184 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl2214 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__22245 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__22248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Harmony__Group__2__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__32307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__32310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2339 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2351 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__42384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Harmony__Group__4__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__02453 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Harmony__Group_1__0__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02576 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2665 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2677 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02714 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Chord__Group_1__0__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02837 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12898 = new BitSet(new long[]{0x0000000018000820L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22958 = new BitSet(new long[]{0x0000000018000820L});
    public static final BitSet FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__33019 = new BitSet(new long[]{0x0000000018000820L});
    public static final BitSet FOLLOW_rule__Note__Group__4_in_rule__Note__Group__33022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__43080 = new BitSet(new long[]{0x0000000018000820L});
    public static final BitSet FOLLOW_rule__Note__Group__5_in_rule__Note__Group__43083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__5__Impl_in_rule__Note__Group__53141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TieAssignment_5_in_rule__Note__Group__5__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Document__SongAssignment_13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Header__NofeedbackAssignment_03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_1_23322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_2_23353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__Header__KeyAssignment_3_23384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_23477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_13539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_0_23570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_13601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_03632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_13663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_33694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_03725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_13818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Note__PointAssignment_43916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Note__TieAssignment_53960 = new BitSet(new long[]{0x0000000000000002L});

}