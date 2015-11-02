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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_ID", "RULE_INT", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'/'", "'.'"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_INTERVAL=6;
    public static final int RULE_ID=7;
    public static final int RULE_MEASURE=9;
    public static final int RULE_ACCIDENTAL=5;
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


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:235:1: entryRuleChord : ruleChord EOF ;
    public final void entryRuleChord() throws RecognitionException {
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:236:1: ( ruleChord EOF )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:237:1: ruleChord EOF
            {
             before(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord438);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getChordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord445); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:244:1: ruleChord : ( ( rule__Chord__Group__0 ) ) ;
    public final void ruleChord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:248:2: ( ( ( rule__Chord__Group__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Chord__Group__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:249:1: ( ( rule__Chord__Group__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:250:1: ( rule__Chord__Group__0 )
            {
             before(grammarAccess.getChordAccess().getGroup()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:1: ( rule__Chord__Group__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:251:2: rule__Chord__Group__0
            {
            pushFollow(FOLLOW_rule__Chord__Group__0_in_ruleChord471);
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


    // $ANTLR start "rule__Sequence__Alternatives"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:291:1: rule__Sequence__Alternatives : ( ( ( rule__Sequence__Alternatives_0 ) ) | ( ( rule__Sequence__MeasureAssignment_1 ) ) );
    public final void rule__Sequence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:295:1: ( ( ( rule__Sequence__Alternatives_0 ) ) | ( ( rule__Sequence__MeasureAssignment_1 ) ) )
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
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:296:1: ( ( rule__Sequence__Alternatives_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:296:1: ( ( rule__Sequence__Alternatives_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:297:1: ( rule__Sequence__Alternatives_0 )
                    {
                     before(grammarAccess.getSequenceAccess().getAlternatives_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:298:1: ( rule__Sequence__Alternatives_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:298:2: rule__Sequence__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Alternatives_0_in_rule__Sequence__Alternatives567);
                    rule__Sequence__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:302:6: ( ( rule__Sequence__MeasureAssignment_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:302:6: ( ( rule__Sequence__MeasureAssignment_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:303:1: ( rule__Sequence__MeasureAssignment_1 )
                    {
                     before(grammarAccess.getSequenceAccess().getMeasureAssignment_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:304:1: ( rule__Sequence__MeasureAssignment_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:304:2: rule__Sequence__MeasureAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sequence__MeasureAssignment_1_in_rule__Sequence__Alternatives585);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:313:1: rule__Sequence__Alternatives_0 : ( ( ( rule__Sequence__NoteAssignment_0_0 ) ) | ( ( rule__Sequence__ChordAssignment_0_1 ) ) );
    public final void rule__Sequence__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:317:1: ( ( ( rule__Sequence__NoteAssignment_0_0 ) ) | ( ( rule__Sequence__ChordAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OCTAVE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_NOTE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ACCIDENTAL:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_DURATION:
                            {
                            switch ( input.LA(5) ) {
                            case 24:
                                {
                                int LA3_5 = input.LA(6);

                                if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_5==23) ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 5, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case EOF:
                            case RULE_NOTE_ID:
                            case RULE_MEASURE:
                            case RULE_OCTAVE:
                            case 22:
                                {
                                alt3=1;
                                }
                                break;
                            case 23:
                                {
                                alt3=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 24:
                            {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                                alt3=1;
                            }
                            else if ( (LA3_5==23) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_NOTE_ID:
                        case RULE_MEASURE:
                        case RULE_OCTAVE:
                        case 22:
                            {
                            alt3=1;
                            }
                            break;
                        case 23:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RULE_DURATION:
                        {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                                alt3=1;
                            }
                            else if ( (LA3_5==23) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_NOTE_ID:
                        case RULE_MEASURE:
                        case RULE_OCTAVE:
                        case 22:
                            {
                            alt3=1;
                            }
                            break;
                        case 23:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 24:
                        {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                            alt3=1;
                        }
                        else if ( (LA3_5==23) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_MEASURE:
                    case RULE_OCTAVE:
                    case 22:
                        {
                        alt3=1;
                        }
                        break;
                    case 23:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_NOTE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_ACCIDENTAL:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DURATION:
                        {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                                alt3=1;
                            }
                            else if ( (LA3_5==23) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_NOTE_ID:
                        case RULE_MEASURE:
                        case RULE_OCTAVE:
                        case 22:
                            {
                            alt3=1;
                            }
                            break;
                        case 23:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 24:
                        {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                            alt3=1;
                        }
                        else if ( (LA3_5==23) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_MEASURE:
                    case RULE_OCTAVE:
                    case 22:
                        {
                        alt3=1;
                        }
                        break;
                    case 23:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_DURATION:
                    {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                            alt3=1;
                        }
                        else if ( (LA3_5==23) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_MEASURE:
                    case RULE_OCTAVE:
                    case 22:
                        {
                        alt3=1;
                        }
                        break;
                    case 23:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||LA3_5==RULE_NOTE_ID||(LA3_5>=RULE_MEASURE && LA3_5<=RULE_OCTAVE)||LA3_5==22) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==23) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_NOTE_ID:
                case RULE_MEASURE:
                case RULE_OCTAVE:
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:318:1: ( ( rule__Sequence__NoteAssignment_0_0 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:318:1: ( ( rule__Sequence__NoteAssignment_0_0 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:319:1: ( rule__Sequence__NoteAssignment_0_0 )
                    {
                     before(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:320:1: ( rule__Sequence__NoteAssignment_0_0 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:320:2: rule__Sequence__NoteAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Sequence__NoteAssignment_0_0_in_rule__Sequence__Alternatives_0618);
                    rule__Sequence__NoteAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:324:6: ( ( rule__Sequence__ChordAssignment_0_1 ) )
                    {
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:324:6: ( ( rule__Sequence__ChordAssignment_0_1 ) )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:325:1: ( rule__Sequence__ChordAssignment_0_1 )
                    {
                     before(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); 
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:326:1: ( rule__Sequence__ChordAssignment_0_1 )
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:326:2: rule__Sequence__ChordAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Sequence__ChordAssignment_0_1_in_rule__Sequence__Alternatives_0636);
                    rule__Sequence__ChordAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:337:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:341:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:342:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0667);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0670);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:349:1: rule__Document__Group__0__Impl : ( ( rule__Document__HeaderAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:353:1: ( ( ( rule__Document__HeaderAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:354:1: ( ( rule__Document__HeaderAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:354:1: ( ( rule__Document__HeaderAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:355:1: ( rule__Document__HeaderAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:356:1: ( rule__Document__HeaderAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:356:2: rule__Document__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl697);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:366:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:370:1: ( rule__Document__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:371:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1727);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:377:1: rule__Document__Group__1__Impl : ( ( rule__Document__SongAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:381:1: ( ( ( rule__Document__SongAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:382:1: ( ( rule__Document__SongAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:382:1: ( ( rule__Document__SongAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:383:1: ( rule__Document__SongAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getSongAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:384:1: ( rule__Document__SongAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:384:2: rule__Document__SongAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl754);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:398:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:402:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:403:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__0788);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__0791);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:410:1: rule__Header__Group__0__Impl : ( ( rule__Header__Group_0__0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:414:1: ( ( ( rule__Header__Group_0__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:415:1: ( ( rule__Header__Group_0__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:415:1: ( ( rule__Header__Group_0__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:416:1: ( rule__Header__Group_0__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:417:1: ( rule__Header__Group_0__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:417:2: rule__Header__Group_0__0
            {
            pushFollow(FOLLOW_rule__Header__Group_0__0_in_rule__Header__Group__0__Impl818);
            rule__Header__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup_0()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:427:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:431:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:432:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1848);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1851);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:439:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 )? ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:443:1: ( ( ( rule__Header__Group_1__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:1: ( ( rule__Header__Group_1__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:1: ( ( rule__Header__Group_1__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:445:1: ( rule__Header__Group_1__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:446:1: ( rule__Header__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:446:2: rule__Header__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl878);
                    rule__Header__Group_1__0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:456:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:460:1: ( rule__Header__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:461:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2909);
            rule__Header__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:467:1: rule__Header__Group__2__Impl : ( ( rule__Header__Group_2__0 )? ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:471:1: ( ( ( rule__Header__Group_2__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:472:1: ( ( rule__Header__Group_2__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:472:1: ( ( rule__Header__Group_2__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:473:1: ( rule__Header__Group_2__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:474:1: ( rule__Header__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:474:2: rule__Header__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl936);
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


    // $ANTLR start "rule__Header__Group_0__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:490:1: rule__Header__Group_0__0 : rule__Header__Group_0__0__Impl rule__Header__Group_0__1 ;
    public final void rule__Header__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:494:1: ( rule__Header__Group_0__0__Impl rule__Header__Group_0__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:495:2: rule__Header__Group_0__0__Impl rule__Header__Group_0__1
            {
            pushFollow(FOLLOW_rule__Header__Group_0__0__Impl_in_rule__Header__Group_0__0973);
            rule__Header__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_0__1_in_rule__Header__Group_0__0976);
            rule__Header__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__0"


    // $ANTLR start "rule__Header__Group_0__0__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:502:1: rule__Header__Group_0__0__Impl : ( 'title' ) ;
    public final void rule__Header__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:506:1: ( ( 'title' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:507:1: ( 'title' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:507:1: ( 'title' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:508:1: 'title'
            {
             before(grammarAccess.getHeaderAccess().getTitleKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_0__0__Impl1004); 
             after(grammarAccess.getHeaderAccess().getTitleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__0__Impl"


    // $ANTLR start "rule__Header__Group_0__1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:521:1: rule__Header__Group_0__1 : rule__Header__Group_0__1__Impl rule__Header__Group_0__2 ;
    public final void rule__Header__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:525:1: ( rule__Header__Group_0__1__Impl rule__Header__Group_0__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:526:2: rule__Header__Group_0__1__Impl rule__Header__Group_0__2
            {
            pushFollow(FOLLOW_rule__Header__Group_0__1__Impl_in_rule__Header__Group_0__11035);
            rule__Header__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_0__2_in_rule__Header__Group_0__11038);
            rule__Header__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__1"


    // $ANTLR start "rule__Header__Group_0__1__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:533:1: rule__Header__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:537:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:538:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:538:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:539:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_0__1__Impl1066); 
             after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__1__Impl"


    // $ANTLR start "rule__Header__Group_0__2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:552:1: rule__Header__Group_0__2 : rule__Header__Group_0__2__Impl ;
    public final void rule__Header__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:556:1: ( rule__Header__Group_0__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:557:2: rule__Header__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_0__2__Impl_in_rule__Header__Group_0__21097);
            rule__Header__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__2"


    // $ANTLR start "rule__Header__Group_0__2__Impl"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:563:1: rule__Header__Group_0__2__Impl : ( ( rule__Header__SongNameAssignment_0_2 ) ) ;
    public final void rule__Header__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:567:1: ( ( ( rule__Header__SongNameAssignment_0_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:568:1: ( ( rule__Header__SongNameAssignment_0_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:568:1: ( ( rule__Header__SongNameAssignment_0_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:569:1: ( rule__Header__SongNameAssignment_0_2 )
            {
             before(grammarAccess.getHeaderAccess().getSongNameAssignment_0_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:570:1: ( rule__Header__SongNameAssignment_0_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:570:2: rule__Header__SongNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Header__SongNameAssignment_0_2_in_rule__Header__Group_0__2__Impl1124);
            rule__Header__SongNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getSongNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group_0__2__Impl"


    // $ANTLR start "rule__Header__Group_1__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:586:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:590:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:591:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01160);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01163);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:598:1: rule__Header__Group_1__0__Impl : ( 'tempo' ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:602:1: ( ( 'tempo' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:603:1: ( 'tempo' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:603:1: ( 'tempo' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:604:1: 'tempo'
            {
             before(grammarAccess.getHeaderAccess().getTempoKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Header__Group_1__0__Impl1191); 
             after(grammarAccess.getHeaderAccess().getTempoKeyword_1_0()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:617:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl rule__Header__Group_1__2 ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:621:1: ( rule__Header__Group_1__1__Impl rule__Header__Group_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:622:2: rule__Header__Group_1__1__Impl rule__Header__Group_1__2
            {
            pushFollow(FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11222);
            rule__Header__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11225);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:629:1: rule__Header__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:633:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:634:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:634:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:635:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_1__1__Impl1253); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:648:1: rule__Header__Group_1__2 : rule__Header__Group_1__2__Impl ;
    public final void rule__Header__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:652:1: ( rule__Header__Group_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:653:2: rule__Header__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21284);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:659:1: rule__Header__Group_1__2__Impl : ( ( rule__Header__TempoAssignment_1_2 ) ) ;
    public final void rule__Header__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:663:1: ( ( ( rule__Header__TempoAssignment_1_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:664:1: ( ( rule__Header__TempoAssignment_1_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:664:1: ( ( rule__Header__TempoAssignment_1_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:665:1: ( rule__Header__TempoAssignment_1_2 )
            {
             before(grammarAccess.getHeaderAccess().getTempoAssignment_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:666:1: ( rule__Header__TempoAssignment_1_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:666:2: rule__Header__TempoAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Header__TempoAssignment_1_2_in_rule__Header__Group_1__2__Impl1311);
            rule__Header__TempoAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getTempoAssignment_1_2()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:682:1: rule__Header__Group_2__0 : rule__Header__Group_2__0__Impl rule__Header__Group_2__1 ;
    public final void rule__Header__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:686:1: ( rule__Header__Group_2__0__Impl rule__Header__Group_2__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:687:2: rule__Header__Group_2__0__Impl rule__Header__Group_2__1
            {
            pushFollow(FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01347);
            rule__Header__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01350);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:694:1: rule__Header__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__Header__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( 'key' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( 'key' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( 'key' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:1: 'key'
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Header__Group_2__0__Impl1378); 
             after(grammarAccess.getHeaderAccess().getKeyKeyword_2_0()); 

            }


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:713:1: rule__Header__Group_2__1 : rule__Header__Group_2__1__Impl rule__Header__Group_2__2 ;
    public final void rule__Header__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:717:1: ( rule__Header__Group_2__1__Impl rule__Header__Group_2__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:718:2: rule__Header__Group_2__1__Impl rule__Header__Group_2__2
            {
            pushFollow(FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11409);
            rule__Header__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11412);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:725:1: rule__Header__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:729:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:730:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:730:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:731:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_2__1__Impl1440); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:744:1: rule__Header__Group_2__2 : rule__Header__Group_2__2__Impl ;
    public final void rule__Header__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:748:1: ( rule__Header__Group_2__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:749:2: rule__Header__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21471);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:755:1: rule__Header__Group_2__2__Impl : ( ( rule__Header__KeyAssignment_2_2 ) ) ;
    public final void rule__Header__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:759:1: ( ( ( rule__Header__KeyAssignment_2_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:760:1: ( ( rule__Header__KeyAssignment_2_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:760:1: ( ( rule__Header__KeyAssignment_2_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:761:1: ( rule__Header__KeyAssignment_2_2 )
            {
             before(grammarAccess.getHeaderAccess().getKeyAssignment_2_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:762:1: ( rule__Header__KeyAssignment_2_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:762:2: rule__Header__KeyAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Header__KeyAssignment_2_2_in_rule__Header__Group_2__2__Impl1498);
            rule__Header__KeyAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getKeyAssignment_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Key__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:778:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:782:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:783:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01534);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01537);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:790:1: rule__Key__Group__0__Impl : ( RULE_NOTE_ID ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:794:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: RULE_NOTE_ID
            {
             before(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1564); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:807:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:811:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:812:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11593);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11596);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:819:1: rule__Key__Group__1__Impl : ( ( RULE_ACCIDENTAL )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:823:1: ( ( ( RULE_ACCIDENTAL )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:824:1: ( ( RULE_ACCIDENTAL )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:824:1: ( ( RULE_ACCIDENTAL )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:825:1: ( RULE_ACCIDENTAL )?
            {
             before(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:826:1: ( RULE_ACCIDENTAL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ACCIDENTAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:826:3: RULE_ACCIDENTAL
                    {
                    match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1624); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:836:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:840:1: ( rule__Key__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:841:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21655);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:847:1: rule__Key__Group__2__Impl : ( RULE_INTERVAL ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:851:1: ( ( RULE_INTERVAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:852:1: ( RULE_INTERVAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:852:1: ( RULE_INTERVAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:853:1: RULE_INTERVAL
            {
             before(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); 
            match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1682); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:870:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:874:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:875:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01717);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01720);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:882:1: rule__Instrument__Group__0__Impl : ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:886:1: ( ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:887:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:887:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:888:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:889:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:889:2: rule__Instrument__InstrumentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1747);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:899:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:903:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:904:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11777);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11780);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:911:1: rule__Instrument__Group__1__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:915:1: ( ( '{' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:916:1: ( '{' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:916:1: ( '{' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:917:1: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Instrument__Group__1__Impl1808); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:930:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:934:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:935:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21839);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21842);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:942:1: rule__Instrument__Group__2__Impl : ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:946:1: ( ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:947:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:947:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:948:1: ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:948:1: ( ( rule__Instrument__SequencesAssignment_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:949:1: ( rule__Instrument__SequencesAssignment_2 )
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:950:1: ( rule__Instrument__SequencesAssignment_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:950:2: rule__Instrument__SequencesAssignment_2
            {
            pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1871);
            rule__Instrument__SequencesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:953:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:954:1: ( rule__Instrument__SequencesAssignment_2 )*
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:955:1: ( rule__Instrument__SequencesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_NOTE_ID||(LA7_0>=RULE_MEASURE && LA7_0<=RULE_OCTAVE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:955:2: rule__Instrument__SequencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1883);
            	    rule__Instrument__SequencesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:966:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:970:1: ( rule__Instrument__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:971:2: rule__Instrument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__31916);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:977:1: rule__Instrument__Group__3__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:981:1: ( ( '}' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:982:1: ( '}' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:982:1: ( '}' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:983:1: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Instrument__Group__3__Impl1944); 
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


    // $ANTLR start "rule__Chord__Group__0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1004:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1008:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1009:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__01983);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__01986);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1016:1: rule__Chord__Group__0__Impl : ( ( rule__Chord__ChordNotesAssignment_0 ) ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1020:1: ( ( ( rule__Chord__ChordNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1021:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1021:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1022:1: ( rule__Chord__ChordNotesAssignment_0 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1023:1: ( rule__Chord__ChordNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1023:2: rule__Chord__ChordNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2013);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1033:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1037:1: ( rule__Chord__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1038:2: rule__Chord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12043);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1044:1: rule__Chord__Group__1__Impl : ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1048:1: ( ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1049:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1049:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1050:1: ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1050:1: ( ( rule__Chord__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1051:1: ( rule__Chord__Group_1__0 )
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1052:1: ( rule__Chord__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1052:2: rule__Chord__Group_1__0
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2072);
            rule__Chord__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getGroup_1()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1055:1: ( ( rule__Chord__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1056:1: ( rule__Chord__Group_1__0 )*
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1057:1: ( rule__Chord__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1057:2: rule__Chord__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2084);
            	    rule__Chord__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1072:1: rule__Chord__Group_1__0 : rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 ;
    public final void rule__Chord__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1076:1: ( rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1077:2: rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02121);
            rule__Chord__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02124);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1084:1: rule__Chord__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1088:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1089:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1089:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1090:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Chord__Group_1__0__Impl2152); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1103:1: rule__Chord__Group_1__1 : rule__Chord__Group_1__1__Impl ;
    public final void rule__Chord__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1107:1: ( rule__Chord__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1108:2: rule__Chord__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12183);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1114:1: rule__Chord__Group_1__1__Impl : ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) ;
    public final void rule__Chord__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1118:1: ( ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1119:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1119:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1120:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1121:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1121:2: rule__Chord__ChordNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2210);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1135:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1139:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1140:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02244);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02247);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1147:1: rule__Note__Group__0__Impl : ( ( rule__Note__OctaveAssignment_0 )? ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1151:1: ( ( ( rule__Note__OctaveAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1152:1: ( ( rule__Note__OctaveAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1152:1: ( ( rule__Note__OctaveAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1153:1: ( rule__Note__OctaveAssignment_0 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1154:1: ( rule__Note__OctaveAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OCTAVE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1154:2: rule__Note__OctaveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2274);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1164:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1168:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1169:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12305);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12308);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1176:1: rule__Note__Group__1__Impl : ( ( rule__Note__NoteAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1180:1: ( ( ( rule__Note__NoteAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1181:1: ( ( rule__Note__NoteAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1181:1: ( ( rule__Note__NoteAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1182:1: ( rule__Note__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNoteAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1183:1: ( rule__Note__NoteAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1183:2: rule__Note__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2335);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1193:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1197:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1198:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22365);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22368);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1205:1: rule__Note__Group__2__Impl : ( ( rule__Note__AccidentalAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1209:1: ( ( ( rule__Note__AccidentalAssignment_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1210:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1210:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1211:1: ( rule__Note__AccidentalAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1212:1: ( rule__Note__AccidentalAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ACCIDENTAL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1212:2: rule__Note__AccidentalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2395);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1222:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1226:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1227:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32426);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32429);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1234:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1238:1: ( ( ( rule__Note__DurationAssignment_3 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1239:1: ( ( rule__Note__DurationAssignment_3 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1239:1: ( ( rule__Note__DurationAssignment_3 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1240:1: ( rule__Note__DurationAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1241:1: ( rule__Note__DurationAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DURATION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1241:2: rule__Note__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2456);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:1: rule__Note__Group__4 : rule__Note__Group__4__Impl ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1255:1: ( rule__Note__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1256:2: rule__Note__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42487);
            rule__Note__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1262:1: rule__Note__Group__4__Impl : ( ( rule__Note__PointAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1266:1: ( ( ( rule__Note__PointAssignment_4 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1267:1: ( ( rule__Note__PointAssignment_4 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1267:1: ( ( rule__Note__PointAssignment_4 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1268:1: ( rule__Note__PointAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getPointAssignment_4()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1269:1: ( rule__Note__PointAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1269:2: rule__Note__PointAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2514);
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


    // $ANTLR start "rule__Document__HeaderAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1290:1: rule__Document__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Document__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1294:1: ( ( ruleHeader ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1295:1: ( ruleHeader )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1295:1: ( ruleHeader )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1296:1: ruleHeader
            {
             before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_02560);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1305:1: rule__Document__SongAssignment_1 : ( ruleSong ) ;
    public final void rule__Document__SongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1309:1: ( ( ruleSong ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1310:1: ( ruleSong )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1310:1: ( ruleSong )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1311:1: ruleSong
            {
             before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Document__SongAssignment_12591);
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


    // $ANTLR start "rule__Header__SongNameAssignment_0_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1320:1: rule__Header__SongNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Header__SongNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1324:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1325:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1325:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1326:1: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_0_22622); 
             after(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__SongNameAssignment_0_2"


    // $ANTLR start "rule__Header__TempoAssignment_1_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1335:1: rule__Header__TempoAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Header__TempoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1339:1: ( ( RULE_INT ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1340:1: ( RULE_INT )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1340:1: ( RULE_INT )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1341:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_1_22653); 
             after(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__TempoAssignment_1_2"


    // $ANTLR start "rule__Header__KeyAssignment_2_2"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1350:1: rule__Header__KeyAssignment_2_2 : ( ruleKey ) ;
    public final void rule__Header__KeyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1354:1: ( ( ruleKey ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1355:1: ( ruleKey )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1355:1: ( ruleKey )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1356:1: ruleKey
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__Header__KeyAssignment_2_22684);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__KeyAssignment_2_2"


    // $ANTLR start "rule__Song__InstrumentsAssignment"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1365:1: rule__Song__InstrumentsAssignment : ( ruleInstrument ) ;
    public final void rule__Song__InstrumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1369:1: ( ( ruleInstrument ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1370:1: ( ruleInstrument )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1370:1: ( ruleInstrument )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1371:1: ruleInstrument
            {
             before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment2715);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1380:1: rule__Instrument__InstrumentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instrument__InstrumentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1384:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1385:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1385:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1386:1: RULE_ID
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_02746); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1395:1: rule__Instrument__SequencesAssignment_2 : ( ruleSequence ) ;
    public final void rule__Instrument__SequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1399:1: ( ( ruleSequence ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1400:1: ( ruleSequence )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1400:1: ( ruleSequence )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1401:1: ruleSequence
            {
             before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_22777);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1410:1: rule__Sequence__NoteAssignment_0_0 : ( ruleNote ) ;
    public final void rule__Sequence__NoteAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1415:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1415:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1416:1: ruleNote
            {
             before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_02808);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1425:1: rule__Sequence__ChordAssignment_0_1 : ( ruleChord ) ;
    public final void rule__Sequence__ChordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1429:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1430:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1430:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1431:1: ruleChord
            {
             before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_12839);
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


    // $ANTLR start "rule__Sequence__MeasureAssignment_1"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1440:1: rule__Sequence__MeasureAssignment_1 : ( RULE_MEASURE ) ;
    public final void rule__Sequence__MeasureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1444:1: ( ( RULE_MEASURE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:1: ( RULE_MEASURE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:1: ( RULE_MEASURE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1446:1: RULE_MEASURE
            {
             before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); 
            match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_12870); 
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


    // $ANTLR start "rule__Chord__ChordNotesAssignment_0"
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1455:1: rule__Chord__ChordNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1459:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1460:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1460:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1461:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_02901);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1470:1: rule__Chord__ChordNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1474:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1475:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1475:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1476:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_12932);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1485:1: rule__Note__OctaveAssignment_0 : ( RULE_OCTAVE ) ;
    public final void rule__Note__OctaveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1489:1: ( ( RULE_OCTAVE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1490:1: ( RULE_OCTAVE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1490:1: ( RULE_OCTAVE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1491:1: RULE_OCTAVE
            {
             before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
            match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_02963); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1500:1: rule__Note__NoteAssignment_1 : ( RULE_NOTE_ID ) ;
    public final void rule__Note__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1504:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1505:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1505:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1506:1: RULE_NOTE_ID
            {
             before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_12994); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1515:1: rule__Note__AccidentalAssignment_2 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Note__AccidentalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1519:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1520:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1520:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1521:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23025); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1530:1: rule__Note__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1534:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1535:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1535:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1536:1: RULE_DURATION
            {
             before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33056); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1545:1: rule__Note__PointAssignment_4 : ( ( '.' ) ) ;
    public final void rule__Note__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1549:1: ( ( ( '.' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1550:1: ( ( '.' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1550:1: ( ( '.' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1551:1: ( '.' )
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1552:1: ( '.' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1553:1: '.'
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Note__PointAssignment_43092); 
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0_in_ruleChord471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Alternatives_0_in_rule__Sequence__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MeasureAssignment_1_in_rule__Sequence__Alternatives585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NoteAssignment_0_0_in_rule__Sequence__Alternatives_0618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ChordAssignment_0_1_in_rule__Sequence__Alternatives_0636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0667 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__HeaderAssignment_0_in_rule__Document__Group__0__Impl697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SongAssignment_1_in_rule__Document__Group__1__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__0788 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__0_in_rule__Header__Group__0__Impl818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1848 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__0__Impl_in_rule__Header__Group_0__0973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_0__1_in_rule__Header__Group_0__0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_0__0__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__1__Impl_in_rule__Header__Group_0__11035 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Header__Group_0__2_in_rule__Header__Group_0__11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_0__1__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__2__Impl_in_rule__Header__Group_0__21097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__SongNameAssignment_0_2_in_rule__Header__Group_0__2__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01160 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Header__Group_1__0__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_1__1__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__TempoAssignment_1_2_in_rule__Header__Group_1__2__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01347 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Header__Group_2__0__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_2__1__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__KeyAssignment_2_2_in_rule__Header__Group_2__2__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01534 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11593 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11777 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instrument__Group__1__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21839 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1871 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1883 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__31916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instrument__Group__3__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__01983 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__01986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2072 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2084 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02121 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Chord__Group_1__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02244 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12305 = new BitSet(new long[]{0x0000000001000820L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22365 = new BitSet(new long[]{0x0000000001000820L});
    public static final BitSet FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32426 = new BitSet(new long[]{0x0000000001000820L});
    public static final BitSet FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__42487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_02560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Document__SongAssignment_12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_0_22622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_1_22653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__Header__KeyAssignment_2_22684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_02746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_12870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_02901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_02963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_12994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Note__PointAssignment_43092 = new BitSet(new long[]{0x0000000000000002L});

}