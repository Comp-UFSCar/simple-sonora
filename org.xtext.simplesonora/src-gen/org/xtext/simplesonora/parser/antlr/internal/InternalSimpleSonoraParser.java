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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_MEASURE", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'/'", "'['", "']'", "'.'"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_INTERVAL=8;
    public static final int RULE_ID=4;
    public static final int RULE_MEASURE=9;
    public static final int T__26=26;
    public static final int RULE_ACCIDENTAL=7;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:133:1: ruleHeader returns [EObject current=null] : ( (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )? (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )? ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_songName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_tempo_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:136:28: ( ( (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )? (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )? (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )? (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )? (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: (otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:4: otherlv_0= 'title' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleHeader236); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getTitleKeyword_0_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleHeader248); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getEqualsSignKeyword_0_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:145:1: ( (lv_songName_2_0= RULE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:146:1: (lv_songName_2_0= RULE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:146:1: (lv_songName_2_0= RULE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:147:3: lv_songName_2_0= RULE_ID
            {
            lv_songName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHeader265); 

            			newLeafNode(lv_songName_2_0, grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_0_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"songName",
                    		lv_songName_2_0, 
                    		"ID");
            	    

            }


            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:163:3: (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:163:5: otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleHeader284); 

                        	newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getTempoKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleHeader296); 

                        	newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:171:1: ( (lv_tempo_5_0= RULE_INT ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:172:1: (lv_tempo_5_0= RULE_INT )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:172:1: (lv_tempo_5_0= RULE_INT )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:173:3: lv_tempo_5_0= RULE_INT
                    {
                    lv_tempo_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader313); 

                    			newLeafNode(lv_tempo_5_0, grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tempo",
                            		lv_tempo_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:189:4: (otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:189:6: otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleHeader333); 

                        	newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getKeyKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleHeader345); 

                        	newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1());
                        
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:197:1: ( (lv_key_8_0= ruleKey ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:198:1: (lv_key_8_0= ruleKey )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:198:1: (lv_key_8_0= ruleKey )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:199:3: lv_key_8_0= ruleKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKey_in_ruleHeader366);
                    lv_key_8_0=ruleKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_8_0, 
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:223:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:224:2: (iv_ruleKey= ruleKey EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:225:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey405);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey416); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:232:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NOTE_ID_0=null;
        Token this_ACCIDENTAL_1=null;
        Token this_INTERVAL_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:235:28: ( (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:236:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:236:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:236:6: this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? this_INTERVAL_2= RULE_INTERVAL
            {
            this_NOTE_ID_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleKey456); 

            		current.merge(this_NOTE_ID_0);
                
             
                newLeafNode(this_NOTE_ID_0, grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:243:1: (this_ACCIDENTAL_1= RULE_ACCIDENTAL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ACCIDENTAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:243:6: this_ACCIDENTAL_1= RULE_ACCIDENTAL
                    {
                    this_ACCIDENTAL_1=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleKey477); 

                    		current.merge(this_ACCIDENTAL_1);
                        
                     
                        newLeafNode(this_ACCIDENTAL_1, grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            this_INTERVAL_2=(Token)match(input,RULE_INTERVAL,FOLLOW_RULE_INTERVAL_in_ruleKey499); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:265:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:266:2: (iv_ruleSong= ruleSong EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:267:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong544);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong554); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:274:1: ruleSong returns [EObject current=null] : ( (lv_instruments_0_0= ruleInstrument ) )+ ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        EObject lv_instruments_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:277:28: ( ( (lv_instruments_0_0= ruleInstrument ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:278:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:278:1: ( (lv_instruments_0_0= ruleInstrument ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:279:1: (lv_instruments_0_0= ruleInstrument )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:279:1: (lv_instruments_0_0= ruleInstrument )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:280:3: lv_instruments_0_0= ruleInstrument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstrument_in_ruleSong599);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:304:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:305:2: (iv_ruleInstrument= ruleInstrument EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:306:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument635);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument645); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:313:1: ruleInstrument returns [EObject current=null] : ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        Token lv_instrumentName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sequences_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:316:28: ( ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:317:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:317:1: ( ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:317:2: ( (lv_instrumentName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_sequences_2_0= ruleSequence ) )+ otherlv_3= '}'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:317:2: ( (lv_instrumentName_0_0= RULE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:318:1: (lv_instrumentName_0_0= RULE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:318:1: (lv_instrumentName_0_0= RULE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:319:3: lv_instrumentName_0_0= RULE_ID
            {
            lv_instrumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstrument687); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInstrument704); 

                	newLeafNode(otherlv_1, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:339:1: ( (lv_sequences_2_0= ruleSequence ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_NOTE_ID||(LA5_0>=RULE_MEASURE && LA5_0<=RULE_OCTAVE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:340:1: (lv_sequences_2_0= ruleSequence )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:340:1: (lv_sequences_2_0= ruleSequence )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:341:3: lv_sequences_2_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleInstrument725);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleInstrument738); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:369:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:370:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:371:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence774);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence784); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:378:1: ruleSequence returns [EObject current=null] : ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token lv_measure_3_0=null;
        EObject lv_note_0_0 = null;

        EObject lv_chord_1_0 = null;

        EObject lv_harmony_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:381:28: ( ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:1: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:1: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) ) | ( (lv_measure_3_0= RULE_MEASURE ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOTE_ID||LA7_0==RULE_OCTAVE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_MEASURE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )
                    int alt6=3;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:3: ( (lv_note_0_0= ruleNote ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:3: ( (lv_note_0_0= ruleNote ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:383:1: (lv_note_0_0= ruleNote )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:383:1: (lv_note_0_0= ruleNote )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:384:3: lv_note_0_0= ruleNote
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNote_in_ruleSequence831);
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
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:401:6: ( (lv_chord_1_0= ruleChord ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:401:6: ( (lv_chord_1_0= ruleChord ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:402:1: (lv_chord_1_0= ruleChord )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:402:1: (lv_chord_1_0= ruleChord )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:403:3: lv_chord_1_0= ruleChord
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleChord_in_ruleSequence858);
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
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:420:6: ( (lv_harmony_2_0= ruleHarmony ) )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:420:6: ( (lv_harmony_2_0= ruleHarmony ) )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:421:1: (lv_harmony_2_0= ruleHarmony )
                            {
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:421:1: (lv_harmony_2_0= ruleHarmony )
                            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:422:3: lv_harmony_2_0= ruleHarmony
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleHarmony_in_ruleSequence885);
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
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:439:6: ( (lv_measure_3_0= RULE_MEASURE ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:439:6: ( (lv_measure_3_0= RULE_MEASURE ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:1: (lv_measure_3_0= RULE_MEASURE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:1: (lv_measure_3_0= RULE_MEASURE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:441:3: lv_measure_3_0= RULE_MEASURE
                    {
                    lv_measure_3_0=(Token)match(input,RULE_MEASURE,FOLLOW_RULE_MEASURE_in_ruleSequence909); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:465:1: entryRuleHarmony returns [EObject current=null] : iv_ruleHarmony= ruleHarmony EOF ;
    public final EObject entryRuleHarmony() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarmony = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:466:2: (iv_ruleHarmony= ruleHarmony EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:467:2: iv_ruleHarmony= ruleHarmony EOF
            {
             newCompositeNode(grammarAccess.getHarmonyRule()); 
            pushFollow(FOLLOW_ruleHarmony_in_entryRuleHarmony950);
            iv_ruleHarmony=ruleHarmony();

            state._fsp--;

             current =iv_ruleHarmony; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHarmony960); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:474:1: ruleHarmony returns [EObject current=null] : ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) ;
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
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:477:28: ( ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:478:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:478:1: ( ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']' )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:478:2: ( (lv_harmonyNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )* otherlv_3= '[' ( (lv_notes_4_0= ruleNote ) )+ otherlv_5= ']'
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:478:2: ( (lv_harmonyNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:479:1: (lv_harmonyNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:479:1: (lv_harmonyNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:480:3: lv_harmonyNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleHarmony1006);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:496:2: (otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:496:4: otherlv_1= '/' ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleHarmony1019); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:500:1: ( (lv_harmonyNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: (lv_harmonyNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: (lv_harmonyNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:502:3: lv_harmonyNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1040);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleHarmony1054); 

                	newLeafNode(otherlv_3, grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:522:1: ( (lv_notes_4_0= ruleNote ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NOTE_ID||LA9_0==RULE_OCTAVE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:523:1: (lv_notes_4_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:523:1: (lv_notes_4_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:524:3: lv_notes_4_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleHarmony1075);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleHarmony1088); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:552:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:553:2: (iv_ruleChord= ruleChord EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:554:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord1124);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord1134); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:561:1: ruleChord returns [EObject current=null] : ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_chordNotes_0_0 = null;

        EObject lv_chordNotes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:564:28: ( ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:565:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:565:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:565:2: ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:565:2: ( (lv_chordNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:566:1: (lv_chordNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:566:1: (lv_chordNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:567:3: lv_chordNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChord1180);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:583:2: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:583:4: otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleChord1193); 

            	        	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:587:1: ( (lv_chordNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:588:1: (lv_chordNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:588:1: (lv_chordNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:589:3: lv_chordNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleChord1214);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:613:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:614:2: (iv_ruleNote= ruleNote EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:615:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1252);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1262); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:622:1: ruleNote returns [EObject current=null] : ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        Token lv_note_1_0=null;
        Token lv_accidental_2_0=null;
        Token lv_duration_3_0=null;
        Token lv_point_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:625:28: ( ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:626:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:626:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:626:2: ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ( (lv_point_4_0= '.' ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:626:2: ( (lv_octave_0_0= RULE_OCTAVE ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OCTAVE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:627:1: (lv_octave_0_0= RULE_OCTAVE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:627:1: (lv_octave_0_0= RULE_OCTAVE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:628:3: lv_octave_0_0= RULE_OCTAVE
                    {
                    lv_octave_0_0=(Token)match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_ruleNote1304); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:644:3: ( (lv_note_1_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:645:1: (lv_note_1_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:645:1: (lv_note_1_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:646:3: lv_note_1_0= RULE_NOTE_ID
            {
            lv_note_1_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleNote1327); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:662:2: ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ACCIDENTAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:663:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:663:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:664:3: lv_accidental_2_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_2_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleNote1349); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:680:3: ( (lv_duration_3_0= RULE_DURATION ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DURATION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:681:1: (lv_duration_3_0= RULE_DURATION )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:681:1: (lv_duration_3_0= RULE_DURATION )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:682:3: lv_duration_3_0= RULE_DURATION
                    {
                    lv_duration_3_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleNote1372); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:698:3: ( (lv_point_4_0= '.' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:699:1: (lv_point_4_0= '.' )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:699:1: (lv_point_4_0= '.' )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:700:3: lv_point_4_0= '.'
                    {
                    lv_point_4_0=(Token)match(input,26,FOLLOW_26_in_ruleNote1396); 

                            newLeafNode(lv_point_4_0, grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(current, "point", true, ".");
                    	    

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


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\17\uffff";
    static final String DFA6_eofS =
        "\2\uffff\4\10\4\uffff\4\16\1\uffff";
    static final String DFA6_minS =
        "\7\6\2\uffff\5\6\1\uffff";
    static final String DFA6_maxS =
        "\1\12\1\6\3\32\1\30\1\12\2\uffff\1\6\3\32\1\30\1\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\3\1\1\5\uffff\1\2";
    static final String DFA6_specialS =
        "\17\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\2",
            "\1\10\1\3\1\uffff\2\10\1\4\12\uffff\1\10\1\6\1\7\1\uffff\1"+
            "\5",
            "\1\10\2\uffff\2\10\1\4\12\uffff\1\10\1\6\1\7\1\uffff\1\5",
            "\1\10\2\uffff\2\10\13\uffff\1\10\1\6\1\7\1\uffff\1\5",
            "\1\10\2\uffff\2\10\13\uffff\1\10\1\6\1\7",
            "\1\12\3\uffff\1\11",
            "",
            "",
            "\1\12",
            "\1\16\1\13\1\uffff\2\16\1\14\12\uffff\1\16\1\6\1\7\1\uffff"+
            "\1\15",
            "\1\16\2\uffff\2\16\1\14\12\uffff\1\16\1\6\1\7\1\uffff\1\15",
            "\1\16\2\uffff\2\16\13\uffff\1\16\1\6\1\7\1\uffff\1\15",
            "\1\16\2\uffff\2\16\13\uffff\1\16\1\6\1\7",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "382:2: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) | ( (lv_harmony_2_0= ruleHarmony ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSong_in_ruleDocument152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHeader236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader265 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleHeader284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader313 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleHeader333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader345 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleKey_in_ruleHeader366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleKey456 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleKey477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INTERVAL_in_ruleKey499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_ruleSong599 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstrument687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInstrument704 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleInstrument725 = new BitSet(new long[]{0x0000000000400640L});
    public static final BitSet FOLLOW_22_in_ruleInstrument738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleSequence831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleSequence858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_ruleSequence885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MEASURE_in_ruleSequence909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHarmony_in_entryRuleHarmony950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHarmony960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1006 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleHarmony1019 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1040 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleHarmony1054 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleHarmony1075 = new BitSet(new long[]{0x0000000002000440L});
    public static final BitSet FOLLOW_25_in_ruleHarmony1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord1124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1180 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleChord1193 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord1214 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_ruleNote1304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleNote1327 = new BitSet(new long[]{0x0000000004000882L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleNote1349 = new BitSet(new long[]{0x0000000004000802L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleNote1372 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleNote1396 = new BitSet(new long[]{0x0000000000000002L});

}