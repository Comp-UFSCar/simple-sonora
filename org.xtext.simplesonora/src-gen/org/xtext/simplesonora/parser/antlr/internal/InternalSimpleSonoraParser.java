package org.xtext.simplesonora.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.simplesonora.services.SimpleSonoraGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleSonoraParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'no-feedback'", "'title'", "'='", "'tempo'", "'key'", "'major'", "'minor'", "'{'", "'}'", "'.'", "'_'", "'/'", "'^'", "'^^'", "'['", "']'", "'('", "')'"
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
    public String getGrammarFileName() { return "../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g"; }



     	private SimpleSonoraGrammarAccess grammarAccess;
     	
        public InternalSimpleSonoraParser(TokenStream input, SimpleSonoraGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected SimpleSonoraGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:76:1: ruleDocument returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_song_1_0= ruleSong ) ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_song_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:79:28: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_song_1_0= ruleSong ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_song_1_0= ruleSong ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_song_1_0= ruleSong ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:2: ( (lv_header_0_0= ruleHeader ) ) ( (lv_song_1_0= ruleSong ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:2: ( (lv_header_0_0= ruleHeader ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:81:1: (lv_header_0_0= ruleHeader )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:81:1: (lv_header_0_0= ruleHeader )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:82:3: lv_header_0_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleDocument131);
            lv_header_0_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"header",
                    		lv_header_0_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:98:2: ( (lv_song_1_0= ruleSong ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:99:1: (lv_song_1_0= ruleSong )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:99:1: (lv_song_1_0= ruleSong )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:100:3: lv_song_1_0= ruleSong
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSong_in_ruleDocument152);
            lv_song_1_0=ruleSong();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"song",
                    		lv_song_1_0, 
                    		"Song");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleHeader"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:124:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:125:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:126:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader188);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:133:1: ruleHeader returns [EObject current=null] : ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_nofeedback_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_songName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_tempo_6_0 = null;

        EObject lv_key_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:136:28: ( ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: ( (lv_nofeedback_0_0= 'no-feedback' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:138:1: (lv_nofeedback_0_0= 'no-feedback' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:138:1: (lv_nofeedback_0_0= 'no-feedback' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:139:3: lv_nofeedback_0_0= 'no-feedback'
                    {
                    lv_nofeedback_0_0=(Token)match(input,16,FOLLOW_16_in_ruleHeader241); 

                            newLeafNode(lv_nofeedback_0_0, grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeaderRule());
                    	        }
                           		setWithLastConsumed(current, "nofeedback", true, "no-feedback");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:152:3: (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:152:5: otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHeader268); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getTitleKeyword_1_0());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleHeader280); 

                	newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:160:1: ( (lv_songName_3_0= RULE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:161:1: (lv_songName_3_0= RULE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:161:1: (lv_songName_3_0= RULE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:162:3: lv_songName_3_0= RULE_ID
            {
            lv_songName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHeader297); 

            			newLeafNode(lv_songName_3_0, grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"songName",
                    		lv_songName_3_0, 
                    		"ID");
            	    

            }


            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:178:3: (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:178:5: otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= ruleTempo ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleHeader316); 

                        	newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getTempoKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleHeader328); 

                        	newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:186:1: ( (lv_tempo_6_0= ruleTempo ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:187:1: (lv_tempo_6_0= ruleTempo )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:187:1: (lv_tempo_6_0= ruleTempo )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:188:3: lv_tempo_6_0= ruleTempo
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getTempoTempoParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTempo_in_ruleHeader349);
                    lv_tempo_6_0=ruleTempo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"tempo",
                            		lv_tempo_6_0, 
                            		"Tempo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:204:4: (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:204:6: otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleHeader364); 

                        	newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getKeyKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleHeader376); 

                        	newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:212:1: ( (lv_key_9_0= ruleKey ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:213:1: (lv_key_9_0= ruleKey )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:213:1: (lv_key_9_0= ruleKey )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:214:3: lv_key_9_0= ruleKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKey_in_ruleHeader397);
                    lv_key_9_0=ruleKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_9_0, 
                            		"Key");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTempo"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:238:1: entryRuleTempo returns [EObject current=null] : iv_ruleTempo= ruleTempo EOF ;
    public final EObject entryRuleTempo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempo = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:239:2: (iv_ruleTempo= ruleTempo EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:240:2: iv_ruleTempo= ruleTempo EOF
            {
             newCompositeNode(grammarAccess.getTempoRule()); 
            pushFollow(FOLLOW_ruleTempo_in_entryRuleTempo435);
            iv_ruleTempo=ruleTempo();

            state._fsp--;

             current =iv_ruleTempo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempo445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTempo"


    // $ANTLR start "ruleTempo"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:247:1: ruleTempo returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTempo() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:250:28: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:252:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:252:1: (lv_value_0_0= RULE_INT )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:253:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTempo487); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getTempoAccess().getValueINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTempoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:270:6: ( (lv_id_1_0= RULE_ID ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:270:6: ( (lv_id_1_0= RULE_ID ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:271:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:271:1: (lv_id_1_0= RULE_ID )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:272:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTempo515); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getTempoAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTempoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTempo"


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:296:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:297:2: (iv_ruleKey= ruleKey EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:298:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey556);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:305:1: ruleKey returns [EObject current=null] : ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token lv_note_0_0=null;
        Token lv_accidental_1_0=null;
        Token lv_interval_2_0=null;
        Token lv_interval_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:308:28: ( ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:309:1: ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:309:1: ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:309:2: ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:309:2: ( (lv_note_0_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:310:1: (lv_note_0_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:310:1: (lv_note_0_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:311:3: lv_note_0_0= RULE_NOTE_ID
            {
            lv_note_0_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleKey608); 

            			newLeafNode(lv_note_0_0, grammarAccess.getKeyAccess().getNoteNOTE_IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_0_0, 
                    		"NOTE_ID");
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:327:2: ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ACCIDENTAL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:328:1: (lv_accidental_1_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:328:1: (lv_accidental_1_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:329:3: lv_accidental_1_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_1_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleKey630); 

                    			newLeafNode(lv_accidental_1_0, grammarAccess.getKeyAccess().getAccidentalACCIDENTALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"accidental",
                            		lv_accidental_1_0, 
                            		"ACCIDENTAL");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:345:3: ( ( (lv_interval_2_0= 'major' ) ) | ( (lv_interval_3_0= 'minor' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:345:4: ( (lv_interval_2_0= 'major' ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:345:4: ( (lv_interval_2_0= 'major' ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:346:1: (lv_interval_2_0= 'major' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:346:1: (lv_interval_2_0= 'major' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:347:3: lv_interval_2_0= 'major'
                    {
                    lv_interval_2_0=(Token)match(input,21,FOLLOW_21_in_ruleKey655); 

                            newLeafNode(lv_interval_2_0, grammarAccess.getKeyAccess().getIntervalMajorKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyRule());
                    	        }
                           		setWithLastConsumed(current, "interval", lv_interval_2_0, "major");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:361:6: ( (lv_interval_3_0= 'minor' ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:361:6: ( (lv_interval_3_0= 'minor' ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:362:1: (lv_interval_3_0= 'minor' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:362:1: (lv_interval_3_0= 'minor' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:363:3: lv_interval_3_0= 'minor'
                    {
                    lv_interval_3_0=(Token)match(input,22,FOLLOW_22_in_ruleKey692); 

                            newLeafNode(lv_interval_3_0, grammarAccess.getKeyAccess().getIntervalMinorKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeyRule());
                    	        }
                           		setWithLastConsumed(current, "interval", lv_interval_3_0, "minor");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleSong"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:384:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:385:2: (iv_ruleSong= ruleSong EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:386:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong742);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:393:1: ruleSong returns [EObject current=null] : ( (lv_instruments_0_0= ruleInstrument ) )+ ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        EObject lv_instruments_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:396:28: ( ( (lv_instruments_0_0= ruleInstrument ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:398:1: (lv_instruments_0_0= ruleInstrument )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:398:1: (lv_instruments_0_0= ruleInstrument )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:399:3: lv_instruments_0_0= ruleInstrument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstrument_in_ruleSong797);
            	    lv_instruments_0_0=ruleInstrument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSongRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instruments",
            	            		lv_instruments_0_0, 
            	            		"Instrument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleInstrument"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:423:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:424:2: (iv_ruleInstrument= ruleInstrument EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:425:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument833);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:432:1: ruleInstrument returns [EObject current=null] : ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )* otherlv_3= '}' ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        Token lv_instrumentName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sequences_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:435:28: ( ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )* otherlv_3= '}' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )* otherlv_3= '}' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )* otherlv_3= '}' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:2: ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )* otherlv_3= '}'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:2: ( (lv_instrumentName_0_0= RULE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:437:1: (lv_instrumentName_0_0= RULE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:437:1: (lv_instrumentName_0_0= RULE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:438:3: lv_instrumentName_0_0= RULE_ID
            {
            lv_instrumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstrument885); 

            			newLeafNode(lv_instrumentName_0_0, grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstrumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"instrumentName",
                    		lv_instrumentName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInstrument902); 

                	newLeafNode(otherlv_1, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:458:1: ( (lv_sequences_2_0= ruleSequence ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_NOTE_ID||(LA8_0>=RULE_MEASURE && LA8_0<=RULE_OCTAVE)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:459:1: (lv_sequences_2_0= ruleSequence )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:459:1: (lv_sequences_2_0= ruleSequence )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:460:3: lv_sequences_2_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleInstrument923);
            	    lv_sequences_2_0=ruleSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstrumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequences",
            	            		lv_sequences_2_0, 
            	            		"Sequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleInstrument936); 

                	newLeafNode(otherlv_3, grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleSequence"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:488:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:489:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:490:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence972);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:497:1: ruleSequence returns [EObject current=null] : ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) | ( (lv_tuplet_3_0= ruleTuplet ) ) | ( (lv_measure_4_0= RULE_MEASURE ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token lv_measure_4_0=null;
        EObject lv_note_0_0 = null;

        EObject lv_chord_1_0 = null;

        EObject lv_harmony_2_0 = null;

        EObject lv_tuplet_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:500:28: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) | ( (lv_tuplet_3_0= ruleTuplet ) ) | ( (lv_measure_4_0= RULE_MEASURE ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) | ( (lv_tuplet_3_0= ruleTuplet ) ) | ( (lv_measure_4_0= RULE_MEASURE ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) | ( (lv_tuplet_3_0= ruleTuplet ) ) | ( (lv_measure_4_0= RULE_MEASURE ) ) )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:2: ( (lv_note_0_0= ruleNote ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:2: ( (lv_note_0_0= ruleNote ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:502:1: (lv_note_0_0= ruleNote )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:502:1: (lv_note_0_0= ruleNote )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:503:3: lv_note_0_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleSequence1028);
                    lv_note_0_0=ruleNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"note",
                            		lv_note_0_0, 
                            		"Note");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:520:6: ( (lv_chord_1_0= ruleChord ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:520:6: ( (lv_chord_1_0= ruleChord ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:521:1: (lv_chord_1_0= ruleChord )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:521:1: (lv_chord_1_0= ruleChord )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:522:3: lv_chord_1_0= ruleChord
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChord_in_ruleSequence1055);
                    lv_chord_1_0=ruleChord();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"chord",
                            		lv_chord_1_0, 
                            		"Chord");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:539:6: ( (lv_harmony_2_0= ruleHarmony ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:539:6: ( (lv_harmony_2_0= ruleHarmony ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:540:1: (lv_harmony_2_0= ruleHarmony )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:540:1: (lv_harmony_2_0= ruleHarmony )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:541:3: lv_harmony_2_0= ruleHarmony
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHarmony_in_ruleSequence1082);
                    lv_harmony_2_0=ruleHarmony();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"harmony",
                            		lv_harmony_2_0, 
                            		"Harmony");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:558:6: ( (lv_tuplet_3_0= ruleTuplet ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:558:6: ( (lv_tuplet_3_0= ruleTuplet ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:559:1: (lv_tuplet_3_0= ruleTuplet )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:559:1: (lv_tuplet_3_0= ruleTuplet )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:560:3: lv_tuplet_3_0= ruleTuplet
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getTupletTupletParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTuplet_in_ruleSequence1109);
                    lv_tuplet_3_0=ruleTuplet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"tuplet",
                            		lv_tuplet_3_0, 
                            		"Tuplet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:577:6: ( (lv_measure_4_0= RULE_MEASURE ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:577:6: ( (lv_measure_4_0= RULE_MEASURE ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:578:1: (lv_measure_4_0= RULE_MEASURE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:578:1: (lv_measure_4_0= RULE_MEASURE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:579:3: lv_measure_4_0= RULE_MEASURE
                    {
                    lv_measure_4_0=(Token)match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_ruleSequence1132); 

                    			newLeafNode(lv_measure_4_0, grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"measure",
                            		true, 
                            		"MEASURE");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleNote"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:603:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:604:2: (iv_ruleNote= ruleNote EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:605:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1173);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1183); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:612:1: ruleNote returns [EObject current=null] : ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        Token lv_note_1_0=null;
        Token lv_accidental_2_0=null;
        Token lv_duration_3_0=null;
        Token lv_point_4_0=null;
        Token lv_tie_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:615:28: ( ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:616:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:616:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:616:2: ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:616:2: ( (lv_octave_0_0= RULE_OCTAVE ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_OCTAVE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:617:1: (lv_octave_0_0= RULE_OCTAVE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:617:1: (lv_octave_0_0= RULE_OCTAVE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:618:3: lv_octave_0_0= RULE_OCTAVE
                    {
                    lv_octave_0_0=(Token)match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_ruleNote1225); 

                    			newLeafNode(lv_octave_0_0, grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"octave",
                            		lv_octave_0_0, 
                            		"OCTAVE");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:634:3: ( (lv_note_1_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:635:1: (lv_note_1_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:635:1: (lv_note_1_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:636:3: lv_note_1_0= RULE_NOTE_ID
            {
            lv_note_1_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleNote1248); 

            			newLeafNode(lv_note_1_0, grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_1_0, 
                    		"NOTE_ID");
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:652:2: ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ACCIDENTAL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:653:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:653:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:654:3: lv_accidental_2_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_2_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleNote1270); 

                    			newLeafNode(lv_accidental_2_0, grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"accidental",
                            		lv_accidental_2_0, 
                            		"ACCIDENTAL");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:670:3: ( (lv_duration_3_0= RULE_DURATION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DURATION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:671:1: (lv_duration_3_0= RULE_DURATION )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:671:1: (lv_duration_3_0= RULE_DURATION )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:672:3: lv_duration_3_0= RULE_DURATION
                    {
                    lv_duration_3_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleNote1293); 

                    			newLeafNode(lv_duration_3_0, grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_3_0, 
                            		"DURATION");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:688:3: ( (lv_point_4_0= '.' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:689:1: (lv_point_4_0= '.' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:689:1: (lv_point_4_0= '.' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:690:3: lv_point_4_0= '.'
                    {
                    lv_point_4_0=(Token)match(input,25,FOLLOW_25_in_ruleNote1317); 

                            newLeafNode(lv_point_4_0, grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(current, "point", true, ".");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:703:3: ( (lv_tie_5_0= '_' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:704:1: (lv_tie_5_0= '_' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:704:1: (lv_tie_5_0= '_' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:705:3: lv_tie_5_0= '_'
                    {
                    lv_tie_5_0=(Token)match(input,26,FOLLOW_26_in_ruleNote1349); 

                            newLeafNode(lv_tie_5_0, grammarAccess.getNoteAccess().getTie_Keyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(current, "tie", true, "_");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:726:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:727:2: (iv_ruleChord= ruleChord EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:728:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord1399);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord1409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChord"


    // $ANTLR start "ruleChord"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:735:1: ruleChord returns [EObject current=null] : ( ( (lv_chordNotes_0_0= ruleNote ) ) ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) ) ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_chordName_4_0=null;
        Token lv_inversion_5_0=null;
        Token lv_inversion_6_0=null;
        EObject lv_chordNotes_0_0 = null;

        EObject lv_chordNotes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:738:28: ( ( ( (lv_chordNotes_0_0= ruleNote ) ) ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:739:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:739:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:739:2: ( (lv_chordNotes_0_0= ruleNote ) ) ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:739:2: ( (lv_chordNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:740:1: (lv_chordNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:740:1: (lv_chordNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:741:3: lv_chordNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChord1455);
            lv_chordNotes_0_0=ruleNote();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChordRule());
            	        }
                   		add(
                   			current, 
                   			"chordNotes",
                    		lv_chordNotes_0_0, 
                    		"Note");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:757:2: ( (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ | (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    alt17=2;
                }
                else if ( (LA17_1==RULE_NOTE_ID||LA17_1==RULE_OCTAVE) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:757:3: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:757:3: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:757:5: otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) )
                    	    {
                    	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleChord1469); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getSolidusKeyword_1_0_0());
                    	        
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:761:1: ( (lv_chordNotes_2_0= ruleNote ) )
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:762:1: (lv_chordNotes_2_0= ruleNote )
                    	    {
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:762:1: (lv_chordNotes_2_0= ruleNote )
                    	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:763:3: lv_chordNotes_2_0= ruleNote
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleNote_in_ruleChord1490);
                    	    lv_chordNotes_2_0=ruleNote();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChordRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"chordNotes",
                    	            		lv_chordNotes_2_0, 
                    	            		"Note");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:780:6: (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:780:6: (otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )? )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:780:8: otherlv_3= '/' ( (lv_chordName_4_0= RULE_ID ) ) ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )?
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleChord1511); 

                        	newLeafNode(otherlv_3, grammarAccess.getChordAccess().getSolidusKeyword_1_1_0());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:784:1: ( (lv_chordName_4_0= RULE_ID ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:785:1: (lv_chordName_4_0= RULE_ID )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:785:1: (lv_chordName_4_0= RULE_ID )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:786:3: lv_chordName_4_0= RULE_ID
                    {
                    lv_chordName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChord1528); 

                    			newLeafNode(lv_chordName_4_0, grammarAccess.getChordAccess().getChordNameIDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChordRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"chordName",
                            		lv_chordName_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:802:2: ( ( (lv_inversion_5_0= '^' ) ) | ( (lv_inversion_6_0= '^^' ) ) )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==28) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==29) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:802:3: ( (lv_inversion_5_0= '^' ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:802:3: ( (lv_inversion_5_0= '^' ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:803:1: (lv_inversion_5_0= '^' )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:803:1: (lv_inversion_5_0= '^' )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:804:3: lv_inversion_5_0= '^'
                            {
                            lv_inversion_5_0=(Token)match(input,28,FOLLOW_28_in_ruleChord1552); 

                                    newLeafNode(lv_inversion_5_0, grammarAccess.getChordAccess().getInversionCircumflexAccentKeyword_1_1_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChordRule());
                            	        }
                                   		setWithLastConsumed(current, "inversion", lv_inversion_5_0, "^");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:818:6: ( (lv_inversion_6_0= '^^' ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:818:6: ( (lv_inversion_6_0= '^^' ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:819:1: (lv_inversion_6_0= '^^' )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:819:1: (lv_inversion_6_0= '^^' )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:820:3: lv_inversion_6_0= '^^'
                            {
                            lv_inversion_6_0=(Token)match(input,29,FOLLOW_29_in_ruleChord1589); 

                                    newLeafNode(lv_inversion_6_0, grammarAccess.getChordAccess().getInversionCircumflexAccentCircumflexAccentKeyword_1_1_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChordRule());
                            	        }
                                   		setWithLastConsumed(current, "inversion", lv_inversion_6_0, "^^");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChord"


    // $ANTLR start "entryRuleHarmony"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:841:1: entryRuleHarmony returns [EObject current=null] : iv_ruleHarmony= ruleHarmony EOF ;
    public final EObject entryRuleHarmony() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarmony = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:842:2: (iv_ruleHarmony= ruleHarmony EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:843:2: iv_ruleHarmony= ruleHarmony EOF
            {
             newCompositeNode(grammarAccess.getHarmonyRule()); 
            pushFollow(FOLLOW_ruleHarmony_in_entryRuleHarmony1642);
            iv_ruleHarmony=ruleHarmony();

            state._fsp--;

             current =iv_ruleHarmony; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHarmony1652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHarmony"


    // $ANTLR start "ruleHarmony"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:850:1: ruleHarmony returns [EObject current=null] : ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) ;
    public final EObject ruleHarmony() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_harmonyNotes_0_0 = null;

        EObject lv_harmonyNotes_2_0 = null;

        EObject lv_notes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:853:28: ( ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:854:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:854:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:854:2: ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:854:2: ( (lv_harmonyNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:855:1: (lv_harmonyNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:855:1: (lv_harmonyNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:856:3: lv_harmonyNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleHarmony1698);
            lv_harmonyNotes_0_0=ruleNote();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHarmonyRule());
            	        }
                   		add(
                   			current, 
                   			"harmonyNotes",
                    		lv_harmonyNotes_0_0, 
                    		"Note");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:872:2: (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:872:4: otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleHarmony1711); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:876:1: ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:877:1: (lv_harmonyNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:877:1: (lv_harmonyNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:878:3: lv_harmonyNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1732);
            	    lv_harmonyNotes_2_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHarmonyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"harmonyNotes",
            	            		lv_harmonyNotes_2_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHarmony1746); 

                	newLeafNode(otherlv_3, grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:898:1: ( (lv_notes_4_0= ruleNote ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_NOTE_ID||LA19_0==RULE_OCTAVE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:899:1: (lv_notes_4_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:899:1: (lv_notes_4_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:900:3: lv_notes_4_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1767);
            	    lv_notes_4_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHarmonyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notes",
            	            		lv_notes_4_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleHarmony1780); 

                	newLeafNode(otherlv_5, grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHarmony"


    // $ANTLR start "entryRuleTuplet"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:928:1: entryRuleTuplet returns [EObject current=null] : iv_ruleTuplet= ruleTuplet EOF ;
    public final EObject entryRuleTuplet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplet = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:929:2: (iv_ruleTuplet= ruleTuplet EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:930:2: iv_ruleTuplet= ruleTuplet EOF
            {
             newCompositeNode(grammarAccess.getTupletRule()); 
            pushFollow(FOLLOW_ruleTuplet_in_entryRuleTuplet1816);
            iv_ruleTuplet=ruleTuplet();

            state._fsp--;

             current =iv_ruleTuplet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuplet1826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplet"


    // $ANTLR start "ruleTuplet"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:937:1: ruleTuplet returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+ otherlv_3= ')' ( (lv_duration_4_0= RULE_DURATION ) ) ) ;
    public final EObject ruleTuplet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_duration_4_0=null;
        EObject lv_tuplet_1_0 = null;

        EObject lv_tuplet_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:940:28: ( (otherlv_0= '(' ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+ otherlv_3= ')' ( (lv_duration_4_0= RULE_DURATION ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:941:1: (otherlv_0= '(' ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+ otherlv_3= ')' ( (lv_duration_4_0= RULE_DURATION ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:941:1: (otherlv_0= '(' ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+ otherlv_3= ')' ( (lv_duration_4_0= RULE_DURATION ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:941:3: otherlv_0= '(' ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+ otherlv_3= ')' ( (lv_duration_4_0= RULE_DURATION ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTuplet1863); 

                	newLeafNode(otherlv_0, grammarAccess.getTupletAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:945:1: ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=3;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:945:2: ( (lv_tuplet_1_0= ruleNote ) )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:945:2: ( (lv_tuplet_1_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:946:1: (lv_tuplet_1_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:946:1: (lv_tuplet_1_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:947:3: lv_tuplet_1_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupletAccess().getTupletNoteParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleTuplet1885);
            	    lv_tuplet_1_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTupletRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tuplet",
            	            		lv_tuplet_1_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:964:6: ( (lv_tuplet_2_0= ruleChord ) )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:964:6: ( (lv_tuplet_2_0= ruleChord ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:965:1: (lv_tuplet_2_0= ruleChord )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:965:1: (lv_tuplet_2_0= ruleChord )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:966:3: lv_tuplet_2_0= ruleChord
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupletAccess().getTupletChordParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChord_in_ruleTuplet1912);
            	    lv_tuplet_2_0=ruleChord();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTupletRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tuplet",
            	            		lv_tuplet_2_0, 
            	            		"Chord");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleTuplet1926); 

                	newLeafNode(otherlv_3, grammarAccess.getTupletAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:986:1: ( (lv_duration_4_0= RULE_DURATION ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:987:1: (lv_duration_4_0= RULE_DURATION )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:987:1: (lv_duration_4_0= RULE_DURATION )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:988:3: lv_duration_4_0= RULE_DURATION
            {
            lv_duration_4_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleTuplet1943); 

            			newLeafNode(lv_duration_4_0, grammarAccess.getTupletAccess().getDurationDURATIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTupletRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"duration",
                    		lv_duration_4_0, 
                    		"DURATION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplet"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\24\uffff";
    static final String DFA9_eofS =
        "\2\uffff\1\11\2\uffff\4\11\5\uffff\5\14\1\uffff";
    static final String DFA9_minS =
        "\3\6\2\uffff\4\6\1\uffff\1\4\2\uffff\7\6";
    static final String DFA9_maxS =
        "\1\40\1\6\1\40\2\uffff\4\40\1\uffff\1\11\2\uffff\1\6\5\40\1\11";
    static final String DFA9_acceptS =
        "\3\uffff\1\4\1\5\4\uffff\1\1\1\uffff\1\3\1\2\7\uffff";
    static final String DFA9_specialS =
        "\24\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\1\4\1\1\26\uffff\1\3",
            "\1\2",
            "\1\11\1\5\2\11\1\6\15\uffff\1\11\1\7\1\10\1\12\2\uffff\1\13"+
            "\1\uffff\1\11",
            "",
            "",
            "\1\11\1\uffff\2\11\1\6\15\uffff\1\11\1\7\1\10\1\12\2\uffff"+
            "\1\13\1\uffff\1\11",
            "\1\11\1\uffff\2\11\16\uffff\1\11\1\7\1\10\1\12\2\uffff\1\13"+
            "\1\uffff\1\11",
            "\1\11\1\uffff\2\11\16\uffff\1\11\1\uffff\1\10\1\12\2\uffff"+
            "\1\13\1\uffff\1\11",
            "\1\11\1\uffff\2\11\16\uffff\1\11\2\uffff\1\12\2\uffff\1\13"+
            "\1\uffff\1\11",
            "",
            "\1\14\1\uffff\1\16\2\uffff\1\15",
            "",
            "",
            "\1\16",
            "\1\14\1\17\2\14\1\20\15\uffff\1\14\1\21\1\22\1\23\2\uffff"+
            "\1\13\1\uffff\1\14",
            "\1\14\1\uffff\2\14\1\20\15\uffff\1\14\1\21\1\22\1\23\2\uffff"+
            "\1\13\1\uffff\1\14",
            "\1\14\1\uffff\2\14\16\uffff\1\14\1\21\1\22\1\23\2\uffff\1"+
            "\13\1\uffff\1\14",
            "\1\14\1\uffff\2\14\16\uffff\1\14\1\uffff\1\22\1\23\2\uffff"+
            "\1\13\1\uffff\1\14",
            "\1\14\1\uffff\2\14\16\uffff\1\14\2\uffff\1\23\2\uffff\1\13"+
            "\1\uffff\1\14",
            "\1\16\2\uffff\1\15"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "501:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) | ( (lv_tuplet_3_0= ruleTuplet ) ) | ( (lv_measure_4_0= RULE_MEASURE ) ) )";
        }
    }
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\6\1\uffff\6\6\2\uffff";
    static final String DFA20_maxS =
        "\1\41\1\uffff\1\6\5\41\2\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\3\6\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\3\2\uffff\1\2\27\uffff\1\1",
            "",
            "\1\3",
            "\1\10\1\4\1\uffff\1\10\1\5\16\uffff\1\6\1\7\1\11\5\uffff\1"+
            "\10",
            "\1\10\2\uffff\1\10\1\5\16\uffff\1\6\1\7\1\11\5\uffff\1\10",
            "\1\10\2\uffff\1\10\17\uffff\1\6\1\7\1\11\5\uffff\1\10",
            "\1\10\2\uffff\1\10\20\uffff\1\7\1\11\5\uffff\1\10",
            "\1\10\2\uffff\1\10\21\uffff\1\11\5\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()+ loopback of 945:1: ( ( (lv_tuplet_1_0= ruleNote ) ) | ( (lv_tuplet_2_0= ruleChord ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSong_in_ruleDocument152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeader241 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader297 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleHeader316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader328 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTempo_in_ruleHeader349 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleHeader364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleKey_in_ruleHeader397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_entryRuleTempo435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempo445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTempo487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTempo515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleKey608 = new BitSet(new long[]{0x0000000000600080L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleKey630 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleKey655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleKey692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_ruleSong797 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstrument885 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstrument902 = new BitSet(new long[]{0x0000000101000340L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleInstrument923 = new BitSet(new long[]{0x0000000101000340L});
    public static final BitSet FOLLOW_24_in_ruleInstrument936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleSequence1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleSequence1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_ruleSequence1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplet_in_ruleSequence1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_ruleSequence1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_ruleNote1225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleNote1248 = new BitSet(new long[]{0x0000000006000482L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleNote1270 = new BitSet(new long[]{0x0000000006000402L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleNote1293 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleNote1317 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleNote1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1455 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleChord1469 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1490 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleChord1511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChord1528 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleChord1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleChord1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_entryRuleHarmony1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHarmony1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1698 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_27_in_ruleHarmony1711 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1732 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_30_in_ruleHarmony1746 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1767 = new BitSet(new long[]{0x0000000080000240L});
    public static final BitSet FOLLOW_31_in_ruleHarmony1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplet_in_entryRuleTuplet1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuplet1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTuplet1863 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleNote_in_ruleTuplet1885 = new BitSet(new long[]{0x0000000200000240L});
    public static final BitSet FOLLOW_ruleChord_in_ruleTuplet1912 = new BitSet(new long[]{0x0000000200000240L});
    public static final BitSet FOLLOW_33_in_ruleTuplet1926 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleTuplet1943 = new BitSet(new long[]{0x0000000000000002L});

}