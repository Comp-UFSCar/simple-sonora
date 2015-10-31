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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_INTERVAL", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'='", "'tempo'", "'key'", "'{'", "'}'", "'/'"
    };
    public static final int RULE_DURATION=10;
    public static final int RULE_INTERVAL=8;
    public static final int RULE_ID=4;
    public static final int RULE_ACCIDENTAL=7;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_STRING=11;
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
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHeader236); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getTitleKeyword_0_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHeader248); 

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

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:163:5: otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHeader284); 

                        	newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getTempoKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleHeader296); 

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

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:189:6: otherlv_6= 'key' otherlv_7= '=' ( (lv_key_8_0= ruleKey ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleHeader333); 

                        	newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getKeyKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleHeader345); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInstrument704); 

                	newLeafNode(otherlv_1, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:339:1: ( (lv_sequences_2_0= ruleSequence ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_NOTE_ID||LA5_0==RULE_OCTAVE) ) {
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleInstrument738); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:378:1: ruleSequence returns [EObject current=null] : ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_note_0_0 = null;

        EObject lv_chord_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:381:28: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_chord_1_0= ruleChord ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OCTAVE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_NOTE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ACCIDENTAL:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_DURATION:
                            {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4==22) ) {
                                alt6=2;
                            }
                            else if ( (LA6_4==EOF||LA6_4==RULE_NOTE_ID||LA6_4==RULE_OCTAVE||LA6_4==21) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_NOTE_ID:
                        case RULE_OCTAVE:
                        case 21:
                            {
                            alt6=1;
                            }
                            break;
                        case 22:
                            {
                            alt6=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RULE_DURATION:
                        {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==22) ) {
                            alt6=2;
                        }
                        else if ( (LA6_4==EOF||LA6_4==RULE_NOTE_ID||LA6_4==RULE_OCTAVE||LA6_4==21) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        alt6=2;
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 21:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_NOTE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_ACCIDENTAL:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DURATION:
                        {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==22) ) {
                            alt6=2;
                        }
                        else if ( (LA6_4==EOF||LA6_4==RULE_NOTE_ID||LA6_4==RULE_OCTAVE||LA6_4==21) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                    case 21:
                        {
                        alt6=1;
                        }
                        break;
                    case 22:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_DURATION:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==22) ) {
                        alt6=2;
                    }
                    else if ( (LA6_4==EOF||LA6_4==RULE_NOTE_ID||LA6_4==RULE_OCTAVE||LA6_4==21) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    alt6=2;
                    }
                    break;
                case EOF:
                case RULE_NOTE_ID:
                case RULE_OCTAVE:
                case 21:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

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
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:2: ( (lv_note_0_0= ruleNote ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:382:2: ( (lv_note_0_0= ruleNote ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:383:1: (lv_note_0_0= ruleNote )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:383:1: (lv_note_0_0= ruleNote )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:384:3: lv_note_0_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleSequence830);
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
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChord_in_ruleSequence857);
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


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:427:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:428:2: (iv_ruleChord= ruleChord EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:429:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord893);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord903); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:1: ruleChord returns [EObject current=null] : ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_chordNotes_0_0 = null;

        EObject lv_chordNotes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:439:28: ( ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:2: ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:440:2: ( (lv_chordNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:441:1: (lv_chordNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:441:1: (lv_chordNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:442:3: lv_chordNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChord949);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:458:2: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:458:4: otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleChord962); 

            	        	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:462:1: ( (lv_chordNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:463:1: (lv_chordNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:463:1: (lv_chordNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:464:3: lv_chordNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleChord983);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:488:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:489:2: (iv_ruleNote= ruleNote EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:490:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1021);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1031); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:497:1: ruleNote returns [EObject current=null] : ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        Token lv_note_1_0=null;
        Token lv_accidental_2_0=null;
        Token lv_duration_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:500:28: ( ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:2: ( (lv_octave_0_0= RULE_OCTAVE ) )? ( (lv_note_1_0= RULE_NOTE_ID ) ) ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )? ( (lv_duration_3_0= RULE_DURATION ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:501:2: ( (lv_octave_0_0= RULE_OCTAVE ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OCTAVE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:502:1: (lv_octave_0_0= RULE_OCTAVE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:502:1: (lv_octave_0_0= RULE_OCTAVE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:503:3: lv_octave_0_0= RULE_OCTAVE
                    {
                    lv_octave_0_0=(Token)match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_ruleNote1073); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:519:3: ( (lv_note_1_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:520:1: (lv_note_1_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:520:1: (lv_note_1_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:521:3: lv_note_1_0= RULE_NOTE_ID
            {
            lv_note_1_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleNote1096); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:537:2: ( (lv_accidental_2_0= RULE_ACCIDENTAL ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ACCIDENTAL) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:538:1: (lv_accidental_2_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:539:3: lv_accidental_2_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_2_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleNote1118); 

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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:555:3: ( (lv_duration_3_0= RULE_DURATION ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DURATION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:556:1: (lv_duration_3_0= RULE_DURATION )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:556:1: (lv_duration_3_0= RULE_DURATION )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:557:3: lv_duration_3_0= RULE_DURATION
                    {
                    lv_duration_3_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleNote1141); 

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


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSong_in_ruleDocument152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeader236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader265 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleHeader284 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader313 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleHeader333 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader345 = new BitSet(new long[]{0x0000000000000040L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstrument687 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInstrument704 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleInstrument725 = new BitSet(new long[]{0x0000000000200240L});
    public static final BitSet FOLLOW_21_in_ruleInstrument738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleSequence830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleSequence857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord949 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleChord962 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord983 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_ruleNote1073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleNote1096 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleNote1118 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleNote1141 = new BitSet(new long[]{0x0000000000000002L});

}