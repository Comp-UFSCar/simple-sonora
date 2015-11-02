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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'no-feedback'", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'/'", "'['", "']'", "'.'", "'_'"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_INTERVAL=8;
    public static final int RULE_ID=4;
    public static final int RULE_MEASURE=9;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_ACCIDENTAL=7;
    public static final int T__26=26;
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
    public static final int RULE_NOTE_ID=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=5;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:133:1: ruleHeader returns [EObject current=null] : ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_nofeedback_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_songName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tempo_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_key_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:136:28: ( ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: ( (lv_nofeedback_0_0= 'no-feedback' ) )? (otherlv_1= 'title' otherlv_2= '=' ( (lv_songName_3_0= RULE_ID ) ) ) (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )? (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: ( (lv_nofeedback_0_0= 'no-feedback' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:138:1: (lv_nofeedback_0_0= 'no-feedback' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:138:1: (lv_nofeedback_0_0= 'no-feedback' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:139:3: lv_nofeedback_0_0= 'no-feedback'
                    {
                    lv_nofeedback_0_0=(Token)match(input,17,FOLLOW_17_in_ruleHeader241); 

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
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleHeader268); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getTitleKeyword_1_0());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleHeader280); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:178:3: (otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:178:5: otherlv_4= 'tempo' otherlv_5= '=' ( (lv_tempo_6_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleHeader316); 

                        	newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getTempoKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHeader328); 

                        	newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:186:1: ( (lv_tempo_6_0= RULE_INT ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:187:1: (lv_tempo_6_0= RULE_INT )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:187:1: (lv_tempo_6_0= RULE_INT )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:188:3: lv_tempo_6_0= RULE_INT
                    {
                    lv_tempo_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader345); 

                    			newLeafNode(lv_tempo_6_0, grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tempo",
                            		lv_tempo_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:204:4: (otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:204:6: otherlv_7= 'key' otherlv_8= '=' ( (lv_key_9_0= ruleKey ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleHeader365); 

                        	newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getKeyKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleHeader377); 

                        	newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:212:1: ( (lv_key_9_0= ruleKey ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:213:1: (lv_key_9_0= ruleKey )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:213:1: (lv_key_9_0= ruleKey )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:214:3: lv_key_9_0= ruleKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKey_in_ruleHeader398);
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


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:238:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:239:2: (iv_ruleKey= ruleKey EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:240:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey437);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey448); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:247:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NOTE_ID_0=null;
        Token this_ACCIDENTAL_1=null;
        Token this_INTERVAL_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:250:28: ( (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:6: this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL
            {
            this_NOTE_ID_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleKey488); 

            		current.merge(this_NOTE_ID_0);
                
             
                newLeafNode(this_NOTE_ID_0, grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:258:1: (this_ACCIDENTAL_1= RULE_ACCIDENTAL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ACCIDENTAL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:258:6: this_ACCIDENTAL_1= RULE_ACCIDENTAL
                    {
                    this_ACCIDENTAL_1=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleKey509); 

                    		current.merge(this_ACCIDENTAL_1);
                        
                     
                        newLeafNode(this_ACCIDENTAL_1, grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            this_INTERVAL_2=(Token)match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_ruleKey531); 

            		current.merge(this_INTERVAL_2);
                
             
                newLeafNode(this_INTERVAL_2, grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); 
                

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:280:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:281:2: (iv_ruleSong= ruleSong EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:282:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong576);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong586); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:289:1: ruleSong returns [EObject current=null] : ( (lv_instruments_0_0= ruleInstrument ) )+ ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        EObject lv_instruments_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:292:28: ( ( (lv_instruments_0_0= ruleInstrument ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:293:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:293:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:294:1: (lv_instruments_0_0= ruleInstrument )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:294:1: (lv_instruments_0_0= ruleInstrument )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:295:3: lv_instruments_0_0= ruleInstrument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstrument_in_ruleSong631);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:319:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:320:2: (iv_ruleInstrument= ruleInstrument EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:321:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument667);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument677); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:328:1: ruleInstrument returns [EObject current=null] : ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        Token lv_instrumentName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sequences_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:331:28: ( ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:332:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:332:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:332:2: ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:332:2: ( (lv_instrumentName_0_0= RULE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:333:1: (lv_instrumentName_0_0= RULE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:333:1: (lv_instrumentName_0_0= RULE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:334:3: lv_instrumentName_0_0= RULE_ID
            {
            lv_instrumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstrument719); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInstrument736); 

                	newLeafNode(otherlv_1, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:354:1: ( (lv_sequences_2_0= ruleSequence ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_NOTE_ID||(LA6_0>=RULE_MEASURE && LA6_0<=RULE_OCTAVE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:355:1: (lv_sequences_2_0= ruleSequence )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:355:1: (lv_sequences_2_0= ruleSequence )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:356:3: lv_sequences_2_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleInstrument757);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleInstrument770); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:384:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:385:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:386:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence806);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence816); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:393:1: ruleSequence returns [EObject current=null] : ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token lv_measure_3_0=null;
        EObject lv_note_0_0 = null;

        EObject lv_chord_1_0 = null;

        EObject lv_harmony_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:396:28: ( ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:1: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:1: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NOTE_ID||LA8_0==RULE_OCTAVE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_MEASURE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )
                    int alt7=3;
                    alt7 = dfa7.predict(input);
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:3: ( (lv_note_0_0= ruleNote ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:397:3: ( (lv_note_0_0= ruleNote ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:398:1: (lv_note_0_0= ruleNote )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:398:1: (lv_note_0_0= ruleNote )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:399:3: lv_note_0_0= ruleNote
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNote_in_ruleSequence863);
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
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:416:6: ( (lv_chord_1_0= ruleChord ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:416:6: ( (lv_chord_1_0= ruleChord ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:417:1: (lv_chord_1_0= ruleChord )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:417:1: (lv_chord_1_0= ruleChord )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:418:3: lv_chord_1_0= ruleChord
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleChord_in_ruleSequence890);
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
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:435:6: ( (lv_harmony_2_0= ruleHarmony ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:435:6: ( (lv_harmony_2_0= ruleHarmony ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:1: (lv_harmony_2_0= ruleHarmony )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:1: (lv_harmony_2_0= ruleHarmony )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:437:3: lv_harmony_2_0= ruleHarmony
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleHarmony_in_ruleSequence917);
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

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:454:6: ( (lv_measure_3_0= RULE_MEASURE ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:454:6: ( (lv_measure_3_0= RULE_MEASURE ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:455:1: (lv_measure_3_0= RULE_MEASURE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:455:1: (lv_measure_3_0= RULE_MEASURE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:456:3: lv_measure_3_0= RULE_MEASURE
                    {
                    lv_measure_3_0=(Token)match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_ruleSequence941); 

                    			newLeafNode(lv_measure_3_0, grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); 
                    		

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


    // $ANTLR start "entryRuleHarmony"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:480:1: entryRuleHarmony returns [EObject current=null] : iv_ruleHarmony= ruleHarmony EOF ;
    public final EObject entryRuleHarmony() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarmony = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:481:2: (iv_ruleHarmony= ruleHarmony EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:482:2: iv_ruleHarmony= ruleHarmony EOF
            {
             newCompositeNode(grammarAccess.getHarmonyRule()); 
            pushFollow(FOLLOW_ruleHarmony_in_entryRuleHarmony982);
            iv_ruleHarmony=ruleHarmony();

            state._fsp--;

             current =iv_ruleHarmony; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHarmony992); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:489:1: ruleHarmony returns [EObject current=null] : ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) ;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:492:28: ( ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:493:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:493:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:493:2: ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:493:2: ( (lv_harmonyNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:494:1: (lv_harmonyNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:494:1: (lv_harmonyNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:495:3: lv_harmonyNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleHarmony1038);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:511:2: (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:511:4: otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleHarmony1051); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:515:1: ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:516:1: (lv_harmonyNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:516:1: (lv_harmonyNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:517:3: lv_harmonyNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1072);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleHarmony1086); 

                	newLeafNode(otherlv_3, grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:537:1: ( (lv_notes_4_0= ruleNote ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_NOTE_ID||LA10_0==RULE_OCTAVE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:1: (lv_notes_4_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:1: (lv_notes_4_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:539:3: lv_notes_4_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1107);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleHarmony1120); 

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


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:567:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:568:2: (iv_ruleChord= ruleChord EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:569:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord1156);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord1166); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:576:1: ruleChord returns [EObject current=null] : ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_chordNotes_0_0 = null;

        EObject lv_chordNotes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:579:28: ( ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:580:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:580:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:580:2: ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:580:2: ( (lv_chordNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:581:1: (lv_chordNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:581:1: (lv_chordNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:582:3: lv_chordNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChord1212);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:598:2: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:598:4: otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleChord1225); 

            	        	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:602:1: ( (lv_chordNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:603:1: (lv_chordNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:603:1: (lv_chordNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:604:3: lv_chordNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleChord1246);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


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


    // $ANTLR start "entryRuleNote"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:628:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:629:2: (iv_ruleNote= ruleNote EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:630:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1284);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1294); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:637:1: ruleNote returns [EObject current=null] : ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? ) ;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:640:28: ( ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:641:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:641:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:641:2: ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ( (lv_tie_5_0= '_' ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:641:2: ( (lv_octave_0_0= RULE_OCTAVE ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OCTAVE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:642:1: (lv_octave_0_0= RULE_OCTAVE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:642:1: (lv_octave_0_0= RULE_OCTAVE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:643:3: lv_octave_0_0= RULE_OCTAVE
                    {
                    lv_octave_0_0=(Token)match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_ruleNote1336); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:659:3: ( (lv_note_1_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:660:1: (lv_note_1_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:660:1: (lv_note_1_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:661:3: lv_note_1_0= RULE_NOTE_ID
            {
            lv_note_1_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleNote1359); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:677:2: ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ACCIDENTAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:678:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:678:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:679:3: lv_accidental_2_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_2_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleNote1381); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:695:3: ( (lv_duration_3_0= RULE_DURATION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DURATION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:696:1: (lv_duration_3_0= RULE_DURATION )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:696:1: (lv_duration_3_0= RULE_DURATION )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:697:3: lv_duration_3_0= RULE_DURATION
                    {
                    lv_duration_3_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleNote1404); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:713:3: ( (lv_point_4_0= '.' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:714:1: (lv_point_4_0= '.' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:714:1: (lv_point_4_0= '.' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:715:3: lv_point_4_0= '.'
                    {
                    lv_point_4_0=(Token)match(input,27,FOLLOW_27_in_ruleNote1428); 

                            newLeafNode(lv_point_4_0, grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(current, "point", true, ".");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:728:3: ( (lv_tie_5_0= '_' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:729:1: (lv_tie_5_0= '_' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:729:1: (lv_tie_5_0= '_' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:730:3: lv_tie_5_0= '_'
                    {
                    lv_tie_5_0=(Token)match(input,28,FOLLOW_28_in_ruleNote1460); 

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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\2\uffff\5\11\4\uffff\5\20\1\uffff";
    static final String DFA7_minS =
        "\10\6\2\uffff\6\6\1\uffff";
    static final String DFA7_maxS =
        "\1\12\1\6\4\34\1\31\1\12\2\uffff\1\6\4\34\1\31\1\uffff";
    static final String DFA7_acceptS =
        "\10\uffff\1\3\1\1\6\uffff\1\2";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\2",
            "\1\11\1\3\1\uffff\2\11\1\4\13\uffff\1\11\1\7\1\10\1\uffff"+
            "\1\5\1\6",
            "\1\11\2\uffff\2\11\1\4\13\uffff\1\11\1\7\1\10\1\uffff\1\5"+
            "\1\6",
            "\1\11\2\uffff\2\11\14\uffff\1\11\1\7\1\10\1\uffff\1\5\1\6",
            "\1\11\2\uffff\2\11\14\uffff\1\11\1\7\1\10\2\uffff\1\6",
            "\1\11\2\uffff\2\11\14\uffff\1\11\1\7\1\10",
            "\1\13\3\uffff\1\12",
            "",
            "",
            "\1\13",
            "\1\20\1\14\1\uffff\2\20\1\15\13\uffff\1\20\1\7\1\10\1\uffff"+
            "\1\16\1\17",
            "\1\20\2\uffff\2\20\1\15\13\uffff\1\20\1\7\1\10\1\uffff\1\16"+
            "\1\17",
            "\1\20\2\uffff\2\20\14\uffff\1\20\1\7\1\10\1\uffff\1\16\1\17",
            "\1\20\2\uffff\2\20\14\uffff\1\20\1\7\1\10\2\uffff\1\17",
            "\1\20\2\uffff\2\20\14\uffff\1\20\1\7\1\10",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "397:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSong_in_ruleDocument152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHeader241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHeader280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader297 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleHeader316 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHeader328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader345 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleHeader365 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHeader377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleKey_in_ruleHeader398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleKey488 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleKey509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_ruleKey531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_ruleSong631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstrument719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInstrument736 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleInstrument757 = new BitSet(new long[]{0x0000000000800640L});
    public static final BitSet FOLLOW_23_in_ruleInstrument770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleSequence863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleSequence890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_ruleSequence917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_ruleSequence941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_entryRuleHarmony982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHarmony992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1038 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleHarmony1051 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1072 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleHarmony1086 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1107 = new BitSet(new long[]{0x0000000004000440L});
    public static final BitSet FOLLOW_26_in_ruleHarmony1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleChord1225 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1246 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_ruleNote1336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleNote1359 = new BitSet(new long[]{0x0000000018000882L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleNote1381 = new BitSet(new long[]{0x0000000018000802L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleNote1404 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleNote1428 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleNote1460 = new BitSet(new long[]{0x0000000000000002L});

}