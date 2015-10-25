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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_TIME", "RULE_NOTE_ID", "RULE_ACCIDENTAL", "RULE_OCTAVE", "RULE_DURATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'='", "'tempo'", "'time'", "'key'", "'/'"
    };
    public static final int RULE_DURATION=10;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_TIME=6;
    public static final int EOF=-1;
    public static final int RULE_NOTE_ID=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_ACCIDENTAL=8;
    public static final int RULE_OCTAVE=9;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:76:1: ruleDocument returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_melody_1_0= ruleMelody ) ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_melody_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:79:28: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_melody_1_0= ruleMelody ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_melody_1_0= ruleMelody ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_melody_1_0= ruleMelody ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:80:2: ( (lv_header_0_0= ruleHeader ) ) ( (lv_melody_1_0= ruleMelody ) )
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:98:2: ( (lv_melody_1_0= ruleMelody ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:99:1: (lv_melody_1_0= ruleMelody )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:99:1: (lv_melody_1_0= ruleMelody )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:100:3: lv_melody_1_0= ruleMelody
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getMelodyMelodyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMelody_in_ruleDocument152);
            lv_melody_1_0=ruleMelody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"melody",
                    		lv_melody_1_0, 
                    		"Melody");
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:133:1: ruleHeader returns [EObject current=null] : ( (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) ) (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) ) (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) ) ) ;
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
        Token lv_time_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_key_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:136:28: ( ( (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) ) (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) ) (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) ) (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) ) (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:1: ( (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) ) (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) ) (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) ) (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) ) (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) ) (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:2: (otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:137:4: otherlv_0= 'name' otherlv_1= '=' ( (lv_songName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHeader236); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getNameKeyword_0_0());
                
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:163:3: (otherlv_3= 'tempo' otherlv_4= '=' ( (lv_tempo_5_0= RULE_INT ) ) )
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:189:3: (otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:189:5: otherlv_6= 'time' otherlv_7= '=' ( (lv_time_8_0= RULE_TIME ) )
            {
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleHeader332); 

                	newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getTimeKeyword_2_0());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleHeader344); 

                	newLeafNode(otherlv_7, grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:197:1: ( (lv_time_8_0= RULE_TIME ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:198:1: (lv_time_8_0= RULE_TIME )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:198:1: (lv_time_8_0= RULE_TIME )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:199:3: lv_time_8_0= RULE_TIME
            {
            lv_time_8_0=(Token)match(input,RULE_TIME,FOLLOW_RULE_TIME_in_ruleHeader361); 

            			newLeafNode(lv_time_8_0, grammarAccess.getHeaderAccess().getTimeTIMETerminalRuleCall_2_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_8_0, 
                    		"TIME");
            	    

            }


            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:215:3: (otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:215:5: otherlv_9= 'key' otherlv_10= '=' ( (lv_key_11_0= ruleKey ) )
            {
            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleHeader380); 

                	newLeafNode(otherlv_9, grammarAccess.getHeaderAccess().getKeyKeyword_3_0());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleHeader392); 

                	newLeafNode(otherlv_10, grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1());
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:223:1: ( (lv_key_11_0= ruleKey ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:224:1: (lv_key_11_0= ruleKey )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:224:1: (lv_key_11_0= ruleKey )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:225:3: lv_key_11_0= ruleKey
            {
             
            	        newCompositeNode(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKey_in_ruleHeader413);
            lv_key_11_0=ruleKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_11_0, 
                    		"Key");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:249:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:250:2: (iv_ruleKey= ruleKey EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:251:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey451);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey462); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:258:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NOTE_ID_0=null;
        Token this_ACCIDENTAL_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:261:28: ( (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:262:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:262:1: (this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:262:6: this_NOTE_ID_0= RULE_NOTE_ID (this_ACCIDENTAL_1= RULE_ACCIDENTAL )?
            {
            this_NOTE_ID_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleKey502); 

            		current.merge(this_NOTE_ID_0);
                
             
                newLeafNode(this_NOTE_ID_0, grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); 
                
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:269:1: (this_ACCIDENTAL_1= RULE_ACCIDENTAL )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ACCIDENTAL) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:269:6: this_ACCIDENTAL_1= RULE_ACCIDENTAL
                    {
                    this_ACCIDENTAL_1=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleKey523); 

                    		current.merge(this_ACCIDENTAL_1);
                        
                     
                        newLeafNode(this_ACCIDENTAL_1, grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleMelody"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:284:1: entryRuleMelody returns [EObject current=null] : iv_ruleMelody= ruleMelody EOF ;
    public final EObject entryRuleMelody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMelody = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:285:2: (iv_ruleMelody= ruleMelody EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:286:2: iv_ruleMelody= ruleMelody EOF
            {
             newCompositeNode(grammarAccess.getMelodyRule()); 
            pushFollow(FOLLOW_ruleMelody_in_entryRuleMelody570);
            iv_ruleMelody=ruleMelody();

            state._fsp--;

             current =iv_ruleMelody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMelody580); 

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
    // $ANTLR end "entryRuleMelody"


    // $ANTLR start "ruleMelody"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:293:1: ruleMelody returns [EObject current=null] : ( (lv_sequences_0_0= ruleSequence ) )+ ;
    public final EObject ruleMelody() throws RecognitionException {
        EObject current = null;

        EObject lv_sequences_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:296:28: ( ( (lv_sequences_0_0= ruleSequence ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:297:1: ( (lv_sequences_0_0= ruleSequence ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:297:1: ( (lv_sequences_0_0= ruleSequence ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NOTE_ID||LA2_0==RULE_OCTAVE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:298:1: (lv_sequences_0_0= ruleSequence )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:298:1: (lv_sequences_0_0= ruleSequence )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:299:3: lv_sequences_0_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMelodyAccess().getSequencesSequenceParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleMelody625);
            	    lv_sequences_0_0=ruleSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMelodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequences",
            	            		lv_sequences_0_0, 
            	            		"Sequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleMelody"


    // $ANTLR start "entryRuleSequence"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:323:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:324:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:325:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence661);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence671); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:332:1: ruleSequence returns [EObject current=null] : ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        EObject lv_note_1_0 = null;

        EObject lv_chord_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:335:28: ( ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:336:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:336:1: ( ( (lv_octave_0_0= RULE_OCTAVE ) )? ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:336:2: ( (lv_octave_0_0= RULE_OCTAVE ) )? ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:336:2: ( (lv_octave_0_0= RULE_OCTAVE ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OCTAVE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:337:1: (lv_octave_0_0= RULE_OCTAVE )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:337:1: (lv_octave_0_0= RULE_OCTAVE )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:338:3: lv_octave_0_0= RULE_OCTAVE
                    {
                    lv_octave_0_0=(Token)match(input,RULE_OCTAVE,FOLLOW_RULE_OCTAVE_in_ruleSequence713); 

                    			newLeafNode(lv_octave_0_0, grammarAccess.getSequenceAccess().getOctaveOCTAVETerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceRule());
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:354:3: ( ( (lv_note_1_0= ruleNote ) ) | ( (lv_chord_2_0= ruleChord ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NOTE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_ACCIDENTAL:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_DURATION:
                        {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==21) ) {
                            alt4=2;
                        }
                        else if ( (LA4_3==EOF||LA4_3==RULE_NOTE_ID||LA4_3==RULE_OCTAVE) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_NOTE_ID:
                    case RULE_OCTAVE:
                        {
                        alt4=1;
                        }
                        break;
                    case 21:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_DURATION:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==21) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==EOF||LA4_3==RULE_NOTE_ID||LA4_3==RULE_OCTAVE) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                    {
                    alt4=2;
                    }
                    break;
                case EOF:
                case RULE_NOTE_ID:
                case RULE_OCTAVE:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:354:4: ( (lv_note_1_0= ruleNote ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:354:4: ( (lv_note_1_0= ruleNote ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:355:1: (lv_note_1_0= ruleNote )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:355:1: (lv_note_1_0= ruleNote )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:356:3: lv_note_1_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleSequence741);
                    lv_note_1_0=ruleNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"note",
                            		lv_note_1_0, 
                            		"Note");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:373:6: ( (lv_chord_2_0= ruleChord ) )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:373:6: ( (lv_chord_2_0= ruleChord ) )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:374:1: (lv_chord_2_0= ruleChord )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:374:1: (lv_chord_2_0= ruleChord )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:375:3: lv_chord_2_0= ruleChord
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChord_in_ruleSequence768);
                    lv_chord_2_0=ruleChord();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"chord",
                            		lv_chord_2_0, 
                            		"Chord");
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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleChord"
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:399:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:400:2: (iv_ruleChord= ruleChord EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:401:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord805);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord815); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:408:1: ruleChord returns [EObject current=null] : ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_chordNotes_0_0 = null;

        EObject lv_chordNotes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:411:28: ( ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:412:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:412:1: ( ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+ )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:412:2: ( (lv_chordNotes_0_0= ruleNote ) ) (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:412:2: ( (lv_chordNotes_0_0= ruleNote ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:413:1: (lv_chordNotes_0_0= ruleNote )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:413:1: (lv_chordNotes_0_0= ruleNote )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:414:3: lv_chordNotes_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChord861);
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:430:2: (otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:430:4: otherlv_1= '/' ( (lv_chordNotes_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleChord874); 

            	        	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:434:1: ( (lv_chordNotes_2_0= ruleNote ) )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:435:1: (lv_chordNotes_2_0= ruleNote )
            	    {
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:435:1: (lv_chordNotes_2_0= ruleNote )
            	    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:436:3: lv_chordNotes_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleChord895);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:460:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:461:2: (iv_ruleNote= ruleNote EOF )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:462:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote933);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote943); 

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
    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:469:1: ruleNote returns [EObject current=null] : ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( (lv_duration_2_0= RULE_DURATION ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_note_0_0=null;
        Token lv_accidental_1_0=null;
        Token lv_duration_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:472:28: ( ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( (lv_duration_2_0= RULE_DURATION ) )? ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:473:1: ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( (lv_duration_2_0= RULE_DURATION ) )? )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:473:1: ( ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( (lv_duration_2_0= RULE_DURATION ) )? )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:473:2: ( (lv_note_0_0= RULE_NOTE_ID ) ) ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )? ( (lv_duration_2_0= RULE_DURATION ) )?
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:473:2: ( (lv_note_0_0= RULE_NOTE_ID ) )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:474:1: (lv_note_0_0= RULE_NOTE_ID )
            {
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:474:1: (lv_note_0_0= RULE_NOTE_ID )
            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:475:3: lv_note_0_0= RULE_NOTE_ID
            {
            lv_note_0_0=(Token)match(input,RULE_NOTE_ID,FOLLOW_RULE_NOTE_ID_in_ruleNote985); 

            			newLeafNode(lv_note_0_0, grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_0_0, 
                    		"NOTE_ID");
            	    

            }


            }

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:491:2: ( (lv_accidental_1_0= RULE_ACCIDENTAL ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ACCIDENTAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:492:1: (lv_accidental_1_0= RULE_ACCIDENTAL )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:492:1: (lv_accidental_1_0= RULE_ACCIDENTAL )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:493:3: lv_accidental_1_0= RULE_ACCIDENTAL
                    {
                    lv_accidental_1_0=(Token)match(input,RULE_ACCIDENTAL,FOLLOW_RULE_ACCIDENTAL_in_ruleNote1007); 

                    			newLeafNode(lv_accidental_1_0, grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
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

            // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:509:3: ( (lv_duration_2_0= RULE_DURATION ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DURATION) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:510:1: (lv_duration_2_0= RULE_DURATION )
                    {
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:510:1: (lv_duration_2_0= RULE_DURATION )
                    // ../org.xtext.simplesonora/src-gen/org/xtext/simplesonora/parser/antlr/internal/InternalSimpleSonora.g:511:3: lv_duration_2_0= RULE_DURATION
                    {
                    lv_duration_2_0=(Token)match(input,RULE_DURATION,FOLLOW_RULE_DURATION_in_ruleNote1030); 

                    			newLeafNode(lv_duration_2_0, grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNoteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_2_0, 
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
    public static final BitSet FOLLOW_ruleHeader_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_ruleMelody_in_ruleDocument152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeader236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader284 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader313 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHeader332 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader344 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_TIME_in_ruleHeader361 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHeader380 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader392 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleKey_in_ruleHeader413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleKey502 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleKey523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMelody_in_entryRuleMelody570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMelody580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleMelody625 = new BitSet(new long[]{0x0000000000000282L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAVE_in_ruleSequence713 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_ruleNote_in_ruleSequence741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleSequence768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord861 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleChord874 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord895 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_ID_in_ruleNote985 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_RULE_ACCIDENTAL_in_ruleNote1007 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DURATION_in_ruleNote1030 = new BitSet(new long[]{0x0000000000000002L});

}