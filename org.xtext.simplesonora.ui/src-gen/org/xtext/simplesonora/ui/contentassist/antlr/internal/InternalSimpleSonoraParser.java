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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_ID", "RULE_INT", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'['", "']'", "'/'", "'.'"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_INTERVAL=6;
    public static final int RULE_ID=7;
    public static final int RULE_MEASURE=9;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:444:1: rule__Header__Group__0__Impl : ( ( rule__Header__Group_0__0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:448:1: ( ( ( rule__Header__Group_0__0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:449:1: ( ( rule__Header__Group_0__0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:449:1: ( ( rule__Header__Group_0__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:450:1: ( rule__Header__Group_0__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:451:1: ( rule__Header__Group_0__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:451:2: rule__Header__Group_0__0
            {
            pushFollow(FOLLOW_rule__Header__Group_0__0_in_rule__Header__Group__0__Impl896);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:461:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:465:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:466:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1926);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1929);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:473:1: rule__Header__Group__1__Impl : ( ( rule__Header__Group_1__0 )? ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:477:1: ( ( ( rule__Header__Group_1__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:478:1: ( ( rule__Header__Group_1__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:478:1: ( ( rule__Header__Group_1__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:479:1: ( rule__Header__Group_1__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:480:1: ( rule__Header__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:480:2: rule__Header__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl956);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:490:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:494:1: ( rule__Header__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:495:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2987);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:501:1: rule__Header__Group__2__Impl : ( ( rule__Header__Group_2__0 )? ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:505:1: ( ( ( rule__Header__Group_2__0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:506:1: ( ( rule__Header__Group_2__0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:506:1: ( ( rule__Header__Group_2__0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:507:1: ( rule__Header__Group_2__0 )?
            {
             before(grammarAccess.getHeaderAccess().getGroup_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:508:1: ( rule__Header__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:508:2: rule__Header__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1014);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:524:1: rule__Header__Group_0__0 : rule__Header__Group_0__0__Impl rule__Header__Group_0__1 ;
    public final void rule__Header__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:528:1: ( rule__Header__Group_0__0__Impl rule__Header__Group_0__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:529:2: rule__Header__Group_0__0__Impl rule__Header__Group_0__1
            {
            pushFollow(FOLLOW_rule__Header__Group_0__0__Impl_in_rule__Header__Group_0__01051);
            rule__Header__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_0__1_in_rule__Header__Group_0__01054);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:536:1: rule__Header__Group_0__0__Impl : ( 'title' ) ;
    public final void rule__Header__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:540:1: ( ( 'title' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:541:1: ( 'title' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:541:1: ( 'title' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:542:1: 'title'
            {
             before(grammarAccess.getHeaderAccess().getTitleKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Header__Group_0__0__Impl1082); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:555:1: rule__Header__Group_0__1 : rule__Header__Group_0__1__Impl rule__Header__Group_0__2 ;
    public final void rule__Header__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:559:1: ( rule__Header__Group_0__1__Impl rule__Header__Group_0__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:560:2: rule__Header__Group_0__1__Impl rule__Header__Group_0__2
            {
            pushFollow(FOLLOW_rule__Header__Group_0__1__Impl_in_rule__Header__Group_0__11113);
            rule__Header__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_0__2_in_rule__Header__Group_0__11116);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:567:1: rule__Header__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:571:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:572:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:572:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:573:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_0__1__Impl1144); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:586:1: rule__Header__Group_0__2 : rule__Header__Group_0__2__Impl ;
    public final void rule__Header__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:590:1: ( rule__Header__Group_0__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:591:2: rule__Header__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_0__2__Impl_in_rule__Header__Group_0__21175);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:597:1: rule__Header__Group_0__2__Impl : ( ( rule__Header__SongNameAssignment_0_2 ) ) ;
    public final void rule__Header__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:601:1: ( ( ( rule__Header__SongNameAssignment_0_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:602:1: ( ( rule__Header__SongNameAssignment_0_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:602:1: ( ( rule__Header__SongNameAssignment_0_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:603:1: ( rule__Header__SongNameAssignment_0_2 )
            {
             before(grammarAccess.getHeaderAccess().getSongNameAssignment_0_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:604:1: ( rule__Header__SongNameAssignment_0_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:604:2: rule__Header__SongNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Header__SongNameAssignment_0_2_in_rule__Header__Group_0__2__Impl1202);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:620:1: rule__Header__Group_1__0 : rule__Header__Group_1__0__Impl rule__Header__Group_1__1 ;
    public final void rule__Header__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:624:1: ( rule__Header__Group_1__0__Impl rule__Header__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:625:2: rule__Header__Group_1__0__Impl rule__Header__Group_1__1
            {
            pushFollow(FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01238);
            rule__Header__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01241);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:632:1: rule__Header__Group_1__0__Impl : ( 'tempo' ) ;
    public final void rule__Header__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:636:1: ( ( 'tempo' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:637:1: ( 'tempo' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:637:1: ( 'tempo' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:638:1: 'tempo'
            {
             before(grammarAccess.getHeaderAccess().getTempoKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Header__Group_1__0__Impl1269); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:651:1: rule__Header__Group_1__1 : rule__Header__Group_1__1__Impl rule__Header__Group_1__2 ;
    public final void rule__Header__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:655:1: ( rule__Header__Group_1__1__Impl rule__Header__Group_1__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:656:2: rule__Header__Group_1__1__Impl rule__Header__Group_1__2
            {
            pushFollow(FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11300);
            rule__Header__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11303);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:663:1: rule__Header__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:667:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:668:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:668:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:669:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_1__1__Impl1331); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:682:1: rule__Header__Group_1__2 : rule__Header__Group_1__2__Impl ;
    public final void rule__Header__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:686:1: ( rule__Header__Group_1__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:687:2: rule__Header__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21362);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:693:1: rule__Header__Group_1__2__Impl : ( ( rule__Header__TempoAssignment_1_2 ) ) ;
    public final void rule__Header__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:697:1: ( ( ( rule__Header__TempoAssignment_1_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( rule__Header__TempoAssignment_1_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:698:1: ( ( rule__Header__TempoAssignment_1_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:699:1: ( rule__Header__TempoAssignment_1_2 )
            {
             before(grammarAccess.getHeaderAccess().getTempoAssignment_1_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:1: ( rule__Header__TempoAssignment_1_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:700:2: rule__Header__TempoAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Header__TempoAssignment_1_2_in_rule__Header__Group_1__2__Impl1389);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:716:1: rule__Header__Group_2__0 : rule__Header__Group_2__0__Impl rule__Header__Group_2__1 ;
    public final void rule__Header__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:720:1: ( rule__Header__Group_2__0__Impl rule__Header__Group_2__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:721:2: rule__Header__Group_2__0__Impl rule__Header__Group_2__1
            {
            pushFollow(FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01425);
            rule__Header__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01428);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:728:1: rule__Header__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__Header__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:732:1: ( ( 'key' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:733:1: ( 'key' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:733:1: ( 'key' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:734:1: 'key'
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Header__Group_2__0__Impl1456); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:747:1: rule__Header__Group_2__1 : rule__Header__Group_2__1__Impl rule__Header__Group_2__2 ;
    public final void rule__Header__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:751:1: ( rule__Header__Group_2__1__Impl rule__Header__Group_2__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:752:2: rule__Header__Group_2__1__Impl rule__Header__Group_2__2
            {
            pushFollow(FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11487);
            rule__Header__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11490);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:759:1: rule__Header__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Header__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:763:1: ( ( '=' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:764:1: ( '=' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:764:1: ( '=' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:765:1: '='
            {
             before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Header__Group_2__1__Impl1518); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:778:1: rule__Header__Group_2__2 : rule__Header__Group_2__2__Impl ;
    public final void rule__Header__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:782:1: ( rule__Header__Group_2__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:783:2: rule__Header__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21549);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:789:1: rule__Header__Group_2__2__Impl : ( ( rule__Header__KeyAssignment_2_2 ) ) ;
    public final void rule__Header__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:793:1: ( ( ( rule__Header__KeyAssignment_2_2 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:794:1: ( ( rule__Header__KeyAssignment_2_2 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:794:1: ( ( rule__Header__KeyAssignment_2_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:795:1: ( rule__Header__KeyAssignment_2_2 )
            {
             before(grammarAccess.getHeaderAccess().getKeyAssignment_2_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:1: ( rule__Header__KeyAssignment_2_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:796:2: rule__Header__KeyAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Header__KeyAssignment_2_2_in_rule__Header__Group_2__2__Impl1576);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:812:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:816:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:817:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01612);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01615);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:824:1: rule__Key__Group__0__Impl : ( RULE_NOTE_ID ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:828:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:829:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:829:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:830:1: RULE_NOTE_ID
            {
             before(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1642); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:841:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:845:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:846:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11671);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11674);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:853:1: rule__Key__Group__1__Impl : ( ( RULE_ACCIDENTAL )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:857:1: ( ( ( RULE_ACCIDENTAL )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:858:1: ( ( RULE_ACCIDENTAL )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:858:1: ( ( RULE_ACCIDENTAL )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:859:1: ( RULE_ACCIDENTAL )?
            {
             before(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:860:1: ( RULE_ACCIDENTAL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ACCIDENTAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:860:3: RULE_ACCIDENTAL
                    {
                    match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1702); 

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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:870:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:874:1: ( rule__Key__Group__2__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:875:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21733);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:881:1: rule__Key__Group__2__Impl : ( RULE_INTERVAL ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:885:1: ( ( RULE_INTERVAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:886:1: ( RULE_INTERVAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:886:1: ( RULE_INTERVAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:887:1: RULE_INTERVAL
            {
             before(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); 
            match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1760); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:904:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:908:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:909:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01795);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01798);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:916:1: rule__Instrument__Group__0__Impl : ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:920:1: ( ( ( rule__Instrument__InstrumentNameAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:921:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:921:1: ( ( rule__Instrument__InstrumentNameAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:922:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:923:1: ( rule__Instrument__InstrumentNameAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:923:2: rule__Instrument__InstrumentNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1825);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:933:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:937:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:938:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11855);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11858);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:945:1: rule__Instrument__Group__1__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:949:1: ( ( '{' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:950:1: ( '{' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:950:1: ( '{' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:951:1: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Instrument__Group__1__Impl1886); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:964:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:968:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:969:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21917);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21920);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:976:1: rule__Instrument__Group__2__Impl : ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:980:1: ( ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:981:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:981:1: ( ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:982:1: ( ( rule__Instrument__SequencesAssignment_2 ) ) ( ( rule__Instrument__SequencesAssignment_2 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:982:1: ( ( rule__Instrument__SequencesAssignment_2 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:983:1: ( rule__Instrument__SequencesAssignment_2 )
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:984:1: ( rule__Instrument__SequencesAssignment_2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:984:2: rule__Instrument__SequencesAssignment_2
            {
            pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1949);
            rule__Instrument__SequencesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:987:1: ( ( rule__Instrument__SequencesAssignment_2 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:988:1: ( rule__Instrument__SequencesAssignment_2 )*
            {
             before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:989:1: ( rule__Instrument__SequencesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_NOTE_ID||(LA7_0>=RULE_MEASURE && LA7_0<=RULE_OCTAVE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:989:2: rule__Instrument__SequencesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1961);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1000:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1004:1: ( rule__Instrument__Group__3__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1005:2: rule__Instrument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__31994);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1011:1: rule__Instrument__Group__3__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1015:1: ( ( '}' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1016:1: ( '}' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1016:1: ( '}' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1017:1: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Instrument__Group__3__Impl2022); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1038:1: rule__Harmony__Group__0 : rule__Harmony__Group__0__Impl rule__Harmony__Group__1 ;
    public final void rule__Harmony__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1042:1: ( rule__Harmony__Group__0__Impl rule__Harmony__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1043:2: rule__Harmony__Group__0__Impl rule__Harmony__Group__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__02061);
            rule__Harmony__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__02064);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1050:1: rule__Harmony__Group__0__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) ;
    public final void rule__Harmony__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1054:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1055:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1055:1: ( ( rule__Harmony__HarmonyNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1056:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1057:1: ( rule__Harmony__HarmonyNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1057:2: rule__Harmony__HarmonyNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl2091);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1067:1: rule__Harmony__Group__1 : rule__Harmony__Group__1__Impl rule__Harmony__Group__2 ;
    public final void rule__Harmony__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1071:1: ( rule__Harmony__Group__1__Impl rule__Harmony__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1072:2: rule__Harmony__Group__1__Impl rule__Harmony__Group__2
            {
            pushFollow(FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__12121);
            rule__Harmony__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__12124);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1079:1: rule__Harmony__Group__1__Impl : ( ( rule__Harmony__Group_1__0 )* ) ;
    public final void rule__Harmony__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1083:1: ( ( ( rule__Harmony__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1084:1: ( ( rule__Harmony__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1084:1: ( ( rule__Harmony__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1085:1: ( rule__Harmony__Group_1__0 )*
            {
             before(grammarAccess.getHarmonyAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1086:1: ( rule__Harmony__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1086:2: rule__Harmony__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl2151);
            	    rule__Harmony__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1096:1: rule__Harmony__Group__2 : rule__Harmony__Group__2__Impl rule__Harmony__Group__3 ;
    public final void rule__Harmony__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1100:1: ( rule__Harmony__Group__2__Impl rule__Harmony__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1101:2: rule__Harmony__Group__2__Impl rule__Harmony__Group__3
            {
            pushFollow(FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__22182);
            rule__Harmony__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__22185);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1108:1: rule__Harmony__Group__2__Impl : ( '[' ) ;
    public final void rule__Harmony__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1112:1: ( ( '[' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1113:1: ( '[' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1113:1: ( '[' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1114:1: '['
            {
             before(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Harmony__Group__2__Impl2213); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1127:1: rule__Harmony__Group__3 : rule__Harmony__Group__3__Impl rule__Harmony__Group__4 ;
    public final void rule__Harmony__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1131:1: ( rule__Harmony__Group__3__Impl rule__Harmony__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1132:2: rule__Harmony__Group__3__Impl rule__Harmony__Group__4
            {
            pushFollow(FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__32244);
            rule__Harmony__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__32247);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1139:1: rule__Harmony__Group__3__Impl : ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) ;
    public final void rule__Harmony__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1143:1: ( ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1144:1: ( ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1145:1: ( ( rule__Harmony__NotesAssignment_3 ) ) ( ( rule__Harmony__NotesAssignment_3 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1145:1: ( ( rule__Harmony__NotesAssignment_3 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1146:1: ( rule__Harmony__NotesAssignment_3 )
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1147:1: ( rule__Harmony__NotesAssignment_3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1147:2: rule__Harmony__NotesAssignment_3
            {
            pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2276);
            rule__Harmony__NotesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1150:1: ( ( rule__Harmony__NotesAssignment_3 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1151:1: ( rule__Harmony__NotesAssignment_3 )*
            {
             before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1152:1: ( rule__Harmony__NotesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NOTE_ID||LA9_0==RULE_OCTAVE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1152:2: rule__Harmony__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2288);
            	    rule__Harmony__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1163:1: rule__Harmony__Group__4 : rule__Harmony__Group__4__Impl ;
    public final void rule__Harmony__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1167:1: ( rule__Harmony__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1168:2: rule__Harmony__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__42321);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1174:1: rule__Harmony__Group__4__Impl : ( ']' ) ;
    public final void rule__Harmony__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1178:1: ( ( ']' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1179:1: ( ']' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1179:1: ( ']' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1180:1: ']'
            {
             before(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Harmony__Group__4__Impl2349); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1203:1: rule__Harmony__Group_1__0 : rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 ;
    public final void rule__Harmony__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1207:1: ( rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1208:2: rule__Harmony__Group_1__0__Impl rule__Harmony__Group_1__1
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__02390);
            rule__Harmony__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__02393);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1215:1: rule__Harmony__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Harmony__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1219:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1220:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1220:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1221:1: '/'
            {
             before(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Harmony__Group_1__0__Impl2421); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1234:1: rule__Harmony__Group_1__1 : rule__Harmony__Group_1__1__Impl ;
    public final void rule__Harmony__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1238:1: ( rule__Harmony__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1239:2: rule__Harmony__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__12452);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1245:1: rule__Harmony__Group_1__1__Impl : ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) ;
    public final void rule__Harmony__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1249:1: ( ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1250:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1250:1: ( ( rule__Harmony__HarmonyNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1251:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1252:1: ( rule__Harmony__HarmonyNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1252:2: rule__Harmony__HarmonyNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl2479);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1266:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1270:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1271:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02513);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02516);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1278:1: rule__Chord__Group__0__Impl : ( ( rule__Chord__ChordNotesAssignment_0 ) ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1282:1: ( ( ( rule__Chord__ChordNotesAssignment_0 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1283:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1283:1: ( ( rule__Chord__ChordNotesAssignment_0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1284:1: ( rule__Chord__ChordNotesAssignment_0 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1285:1: ( rule__Chord__ChordNotesAssignment_0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1285:2: rule__Chord__ChordNotesAssignment_0
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2543);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1295:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1299:1: ( rule__Chord__Group__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1300:2: rule__Chord__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12573);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1306:1: rule__Chord__Group__1__Impl : ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1310:1: ( ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1311:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1311:1: ( ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1312:1: ( ( rule__Chord__Group_1__0 ) ) ( ( rule__Chord__Group_1__0 )* )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1312:1: ( ( rule__Chord__Group_1__0 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1313:1: ( rule__Chord__Group_1__0 )
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1314:1: ( rule__Chord__Group_1__0 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1314:2: rule__Chord__Group_1__0
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2602);
            rule__Chord__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getGroup_1()); 

            }

            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1317:1: ( ( rule__Chord__Group_1__0 )* )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1318:1: ( rule__Chord__Group_1__0 )*
            {
             before(grammarAccess.getChordAccess().getGroup_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1319:1: ( rule__Chord__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1319:2: rule__Chord__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2614);
            	    rule__Chord__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1334:1: rule__Chord__Group_1__0 : rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 ;
    public final void rule__Chord__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1338:1: ( rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1339:2: rule__Chord__Group_1__0__Impl rule__Chord__Group_1__1
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02651);
            rule__Chord__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02654);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1346:1: rule__Chord__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Chord__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1350:1: ( ( '/' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1351:1: ( '/' )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1351:1: ( '/' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1352:1: '/'
            {
             before(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Chord__Group_1__0__Impl2682); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1365:1: rule__Chord__Group_1__1 : rule__Chord__Group_1__1__Impl ;
    public final void rule__Chord__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1369:1: ( rule__Chord__Group_1__1__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1370:2: rule__Chord__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12713);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1376:1: rule__Chord__Group_1__1__Impl : ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) ;
    public final void rule__Chord__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1380:1: ( ( ( rule__Chord__ChordNotesAssignment_1_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1381:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1381:1: ( ( rule__Chord__ChordNotesAssignment_1_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1382:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            {
             before(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1383:1: ( rule__Chord__ChordNotesAssignment_1_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1383:2: rule__Chord__ChordNotesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2740);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1397:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1401:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1402:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02774);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02777);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1409:1: rule__Note__Group__0__Impl : ( ( rule__Note__OctaveAssignment_0 )? ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1413:1: ( ( ( rule__Note__OctaveAssignment_0 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:1: ( ( rule__Note__OctaveAssignment_0 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1414:1: ( ( rule__Note__OctaveAssignment_0 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1415:1: ( rule__Note__OctaveAssignment_0 )?
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1416:1: ( rule__Note__OctaveAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OCTAVE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1416:2: rule__Note__OctaveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2804);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1426:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1430:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1431:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12835);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12838);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1438:1: rule__Note__Group__1__Impl : ( ( rule__Note__NoteAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1442:1: ( ( ( rule__Note__NoteAssignment_1 ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1443:1: ( ( rule__Note__NoteAssignment_1 ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1443:1: ( ( rule__Note__NoteAssignment_1 ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1444:1: ( rule__Note__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNoteAssignment_1()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:1: ( rule__Note__NoteAssignment_1 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1445:2: rule__Note__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2865);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1455:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1459:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1460:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22895);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22898);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1467:1: rule__Note__Group__2__Impl : ( ( rule__Note__AccidentalAssignment_2 )? ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1471:1: ( ( ( rule__Note__AccidentalAssignment_2 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1472:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1472:1: ( ( rule__Note__AccidentalAssignment_2 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1473:1: ( rule__Note__AccidentalAssignment_2 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1474:1: ( rule__Note__AccidentalAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ACCIDENTAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1474:2: rule__Note__AccidentalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2925);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1484:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1488:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1489:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32956);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32959);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1496:1: rule__Note__Group__3__Impl : ( ( rule__Note__DurationAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1500:1: ( ( ( rule__Note__DurationAssignment_3 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1501:1: ( ( rule__Note__DurationAssignment_3 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1501:1: ( ( rule__Note__DurationAssignment_3 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1502:1: ( rule__Note__DurationAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_3()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1503:1: ( rule__Note__DurationAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DURATION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1503:2: rule__Note__DurationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2986);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1513:1: rule__Note__Group__4 : rule__Note__Group__4__Impl ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1517:1: ( rule__Note__Group__4__Impl )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1518:2: rule__Note__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__43017);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1524:1: rule__Note__Group__4__Impl : ( ( rule__Note__PointAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1528:1: ( ( ( rule__Note__PointAssignment_4 )? ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1529:1: ( ( rule__Note__PointAssignment_4 )? )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1529:1: ( ( rule__Note__PointAssignment_4 )? )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1530:1: ( rule__Note__PointAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getPointAssignment_4()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1531:1: ( rule__Note__PointAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1531:2: rule__Note__PointAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl3044);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1552:1: rule__Document__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Document__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1556:1: ( ( ruleHeader ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1557:1: ( ruleHeader )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1557:1: ( ruleHeader )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1558:1: ruleHeader
            {
             before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03090);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1567:1: rule__Document__SongAssignment_1 : ( ruleSong ) ;
    public final void rule__Document__SongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1571:1: ( ( ruleSong ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1572:1: ( ruleSong )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1572:1: ( ruleSong )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1573:1: ruleSong
            {
             before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Document__SongAssignment_13121);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1582:1: rule__Header__SongNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Header__SongNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1586:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1587:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1587:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1588:1: RULE_ID
            {
             before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_0_23152); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1597:1: rule__Header__TempoAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Header__TempoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1601:1: ( ( RULE_INT ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1602:1: ( RULE_INT )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1602:1: ( RULE_INT )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1603:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_1_23183); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1612:1: rule__Header__KeyAssignment_2_2 : ( ruleKey ) ;
    public final void rule__Header__KeyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1616:1: ( ( ruleKey ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1617:1: ( ruleKey )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1617:1: ( ruleKey )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1618:1: ruleKey
            {
             before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__Header__KeyAssignment_2_23214);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1627:1: rule__Song__InstrumentsAssignment : ( ruleInstrument ) ;
    public final void rule__Song__InstrumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1631:1: ( ( ruleInstrument ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1632:1: ( ruleInstrument )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1632:1: ( ruleInstrument )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1633:1: ruleInstrument
            {
             before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment3245);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1642:1: rule__Instrument__InstrumentNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Instrument__InstrumentNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1646:1: ( ( RULE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1647:1: ( RULE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1647:1: ( RULE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1648:1: RULE_ID
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_03276); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1657:1: rule__Instrument__SequencesAssignment_2 : ( ruleSequence ) ;
    public final void rule__Instrument__SequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1661:1: ( ( ruleSequence ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1662:1: ( ruleSequence )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1662:1: ( ruleSequence )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1663:1: ruleSequence
            {
             before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_23307);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1672:1: rule__Sequence__NoteAssignment_0_0 : ( ruleNote ) ;
    public final void rule__Sequence__NoteAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1676:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1677:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1677:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1678:1: ruleNote
            {
             before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_03338);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1687:1: rule__Sequence__ChordAssignment_0_1 : ( ruleChord ) ;
    public final void rule__Sequence__ChordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1691:1: ( ( ruleChord ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1692:1: ( ruleChord )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1692:1: ( ruleChord )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1693:1: ruleChord
            {
             before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_13369);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1702:1: rule__Sequence__HarmonyAssignment_0_2 : ( ruleHarmony ) ;
    public final void rule__Sequence__HarmonyAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1706:1: ( ( ruleHarmony ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1707:1: ( ruleHarmony )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1707:1: ( ruleHarmony )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1708:1: ruleHarmony
            {
             before(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_0_23400);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1717:1: rule__Sequence__MeasureAssignment_1 : ( RULE_MEASURE ) ;
    public final void rule__Sequence__MeasureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1721:1: ( ( RULE_MEASURE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1722:1: ( RULE_MEASURE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1722:1: ( RULE_MEASURE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1723:1: RULE_MEASURE
            {
             before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); 
            match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_13431); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1732:1: rule__Harmony__HarmonyNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1736:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1737:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1737:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1738:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_03462);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1747:1: rule__Harmony__HarmonyNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Harmony__HarmonyNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1751:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1752:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1752:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1753:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_13493);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1762:1: rule__Harmony__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__Harmony__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1766:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1767:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1767:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1768:1: ruleNote
            {
             before(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_33524);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1777:1: rule__Chord__ChordNotesAssignment_0 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1781:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1782:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1782:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1783:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_03555);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1792:1: rule__Chord__ChordNotesAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Chord__ChordNotesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1796:1: ( ( ruleNote ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1797:1: ( ruleNote )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1797:1: ( ruleNote )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1798:1: ruleNote
            {
             before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_13586);
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1807:1: rule__Note__OctaveAssignment_0 : ( RULE_OCTAVE ) ;
    public final void rule__Note__OctaveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1811:1: ( ( RULE_OCTAVE ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1812:1: ( RULE_OCTAVE )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1812:1: ( RULE_OCTAVE )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1813:1: RULE_OCTAVE
            {
             before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
            match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_03617); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1822:1: rule__Note__NoteAssignment_1 : ( RULE_NOTE_ID ) ;
    public final void rule__Note__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1826:1: ( ( RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1827:1: ( RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1827:1: ( RULE_NOTE_ID )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1828:1: RULE_NOTE_ID
            {
             before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_13648); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1837:1: rule__Note__AccidentalAssignment_2 : ( RULE_ACCIDENTAL ) ;
    public final void rule__Note__AccidentalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1841:1: ( ( RULE_ACCIDENTAL ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1842:1: ( RULE_ACCIDENTAL )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1842:1: ( RULE_ACCIDENTAL )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1843:1: RULE_ACCIDENTAL
            {
             before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
            match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23679); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1852:1: rule__Note__DurationAssignment_3 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1856:1: ( ( RULE_DURATION ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1857:1: ( RULE_DURATION )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1857:1: ( RULE_DURATION )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1858:1: RULE_DURATION
            {
             before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33710); 
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
    // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1867:1: rule__Note__PointAssignment_4 : ( ( '.' ) ) ;
    public final void rule__Note__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1871:1: ( ( ( '.' ) ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1872:1: ( ( '.' ) )
            {
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1872:1: ( ( '.' ) )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1873:1: ( '.' )
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1874:1: ( '.' )
            // ../org.xtext.simplesonora.ui/src-gen/org/xtext/simplesonora/ui/contentassist/antlr/internal/InternalSimpleSonora.g:1875:1: '.'
            {
             before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Note__PointAssignment_43746); 
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\25\uffff";
    static final String DFA3_eofS =
        "\2\uffff\4\10\4\uffff\4\17\3\uffff\4\17";
    static final String DFA3_minS =
        "\7\4\2\uffff\6\4\1\uffff\5\4";
    static final String DFA3_maxS =
        "\1\12\1\4\3\32\1\31\1\12\2\uffff\1\4\3\32\1\31\1\12\1\uffff\1\4"+
        "\3\32\1\31";
    static final String DFA3_acceptS =
        "\7\uffff\1\3\1\1\6\uffff\1\2\5\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\5\uffff\1\1",
            "\1\2",
            "\1\10\1\3\3\uffff\2\10\1\4\12\uffff\1\10\1\7\1\uffff\1\6\1"+
            "\5",
            "\1\10\4\uffff\2\10\1\4\12\uffff\1\10\1\7\1\uffff\1\6\1\5",
            "\1\10\4\uffff\2\10\13\uffff\1\10\1\7\1\uffff\1\6\1\5",
            "\1\10\4\uffff\2\10\13\uffff\1\10\1\7\1\uffff\1\6",
            "\1\12\5\uffff\1\11",
            "",
            "",
            "\1\12",
            "\1\17\1\13\3\uffff\2\17\1\14\12\uffff\1\17\1\7\1\uffff\1\16"+
            "\1\15",
            "\1\17\4\uffff\2\17\1\14\12\uffff\1\17\1\7\1\uffff\1\16\1\15",
            "\1\17\4\uffff\2\17\13\uffff\1\17\1\7\1\uffff\1\16\1\15",
            "\1\17\4\uffff\2\17\13\uffff\1\17\1\7\1\uffff\1\16",
            "\1\21\5\uffff\1\20",
            "",
            "\1\21",
            "\1\17\1\22\3\uffff\2\17\1\23\12\uffff\1\17\1\7\1\uffff\1\16"+
            "\1\24",
            "\1\17\4\uffff\2\17\1\23\12\uffff\1\17\1\7\1\uffff\1\16\1\24",
            "\1\17\4\uffff\2\17\13\uffff\1\17\1\7\1\uffff\1\16\1\24",
            "\1\17\4\uffff\2\17\13\uffff\1\17\1\7\1\uffff\1\16"
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
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__0866 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__0869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__0_in_rule__Header__Group__0__Impl896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__1926 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0_in_rule__Header__Group__1__Impl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0_in_rule__Header__Group__2__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__0__Impl_in_rule__Header__Group_0__01051 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_0__1_in_rule__Header__Group_0__01054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Header__Group_0__0__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__1__Impl_in_rule__Header__Group_0__11113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Header__Group_0__2_in_rule__Header__Group_0__11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_0__1__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_0__2__Impl_in_rule__Header__Group_0__21175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__SongNameAssignment_0_2_in_rule__Header__Group_0__2__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__0__Impl_in_rule__Header__Group_1__01238 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1_in_rule__Header__Group_1__01241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Header__Group_1__0__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__1__Impl_in_rule__Header__Group_1__11300 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2_in_rule__Header__Group_1__11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_1__1__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_1__2__Impl_in_rule__Header__Group_1__21362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__TempoAssignment_1_2_in_rule__Header__Group_1__2__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__0__Impl_in_rule__Header__Group_2__01425 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1_in_rule__Header__Group_2__01428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Header__Group_2__0__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__1__Impl_in_rule__Header__Group_2__11487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2_in_rule__Header__Group_2__11490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Header__Group_2__1__Impl1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group_2__2__Impl_in_rule__Header__Group_2__21549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__KeyAssignment_2_2_in_rule__Header__Group_2__2__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__01612 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Key__Group__0__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__11671 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Key__Group__2_in_rule__Key__Group__11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Key__Group__1__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__2__Impl_in_rule__Key__Group__21733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_rule__Key__Group__2__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__0__Impl_in_rule__Instrument__Group__01795 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1_in_rule__Instrument__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__InstrumentNameAssignment_0_in_rule__Instrument__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__1__Impl_in_rule__Instrument__Group__11855 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2_in_rule__Instrument__Group__11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instrument__Group__1__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Group__2__Impl_in_rule__Instrument__Group__21917 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3_in_rule__Instrument__Group__21920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1949 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__SequencesAssignment_2_in_rule__Instrument__Group__2__Impl1961 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__Instrument__Group__3__Impl_in_rule__Instrument__Group__31994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instrument__Group__3__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__0__Impl_in_rule__Harmony__Group__02061 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1_in_rule__Harmony__Group__02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_0_in_rule__Harmony__Group__0__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__1__Impl_in_rule__Harmony__Group__12121 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2_in_rule__Harmony__Group__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0_in_rule__Harmony__Group__1__Impl2151 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__2__Impl_in_rule__Harmony__Group__22182 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3_in_rule__Harmony__Group__22185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Harmony__Group__2__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group__3__Impl_in_rule__Harmony__Group__32244 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4_in_rule__Harmony__Group__32247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2276 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_rule__Harmony__NotesAssignment_3_in_rule__Harmony__Group__3__Impl2288 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_rule__Harmony__Group__4__Impl_in_rule__Harmony__Group__42321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Harmony__Group__4__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__0__Impl_in_rule__Harmony__Group_1__02390 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1_in_rule__Harmony__Group_1__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Harmony__Group_1__0__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__Group_1__1__Impl_in_rule__Harmony__Group_1__12452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Harmony__HarmonyNotesAssignment_1_1_in_rule__Harmony__Group_1__1__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__02513 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__02516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_0_in_rule__Chord__Group__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2602 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0_in_rule__Chord__Group__1__Impl2614 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__0__Impl_in_rule__Chord__Group_1__02651 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1_in_rule__Chord__Group_1__02654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Chord__Group_1__0__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group_1__1__Impl_in_rule__Chord__Group_1__12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__ChordNotesAssignment_1_1_in_rule__Chord__Group_1__1__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__02774 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__02777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__OctaveAssignment_0_in_rule__Note__Group__0__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__12835 = new BitSet(new long[]{0x0000000004000820L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__NoteAssignment_1_in_rule__Note__Group__1__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__22895 = new BitSet(new long[]{0x0000000004000820L});
    public static final BitSet FOLLOW_rule__Note__Group__3_in_rule__Note__Group__22898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__AccidentalAssignment_2_in_rule__Note__Group__2__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__3__Impl_in_rule__Note__Group__32956 = new BitSet(new long[]{0x0000000004000820L});
    public static final BitSet FOLLOW_rule__Note__Group__4_in_rule__Note__Group__32959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__DurationAssignment_3_in_rule__Note__Group__3__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__4__Impl_in_rule__Note__Group__43017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__PointAssignment_4_in_rule__Note__Group__4__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Document__HeaderAssignment_03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Document__SongAssignment_13121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__SongNameAssignment_0_23152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__TempoAssignment_1_23183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__Header__KeyAssignment_2_23214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Song__InstrumentsAssignment3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instrument__InstrumentNameAssignment_03276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instrument__SequencesAssignment_23307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Sequence__NoteAssignment_0_03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__Sequence__ChordAssignment_0_13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_rule__Sequence__HarmonyAssignment_0_23400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_rule__Sequence__MeasureAssignment_13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_03462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__HarmonyNotesAssignment_1_13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Harmony__NotesAssignment_33524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_03555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Chord__ChordNotesAssignment_1_13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_rule__Note__OctaveAssignment_03617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_rule__Note__NoteAssignment_13648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_rule__Note__AccidentalAssignment_23679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DURATION_in_rule__Note__DurationAssignment_33710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Note__PointAssignment_43746 = new BitSet(new long[]{0x0000000000000002L});

}