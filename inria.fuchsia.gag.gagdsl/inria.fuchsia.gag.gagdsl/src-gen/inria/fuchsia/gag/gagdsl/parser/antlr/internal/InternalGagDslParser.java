package inria.fuchsia.gag.gagdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import inria.fuchsia.gag.gagdsl.services.GagDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGagDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'root'", "'consistent_to'", "'}'", "'is_open'", "'Task'", "'id'", "'appliedRule'", "'instance_of'", "'sub_task'", "','", "'-'", "'defined'", "'Value'", "'value'", "'sub_value'", "'EJavaObject'", "'Rule'", "'left_hand_side'", "'right_hand_side_service'", "'('", "')'", "'guard'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGagDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGagDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGagDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGagDsl.g"; }



     	private GagDslGrammarAccess grammarAccess;

        public InternalGagDslParser(TokenStream input, GagDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Configuration";
       	}

       	@Override
       	protected GagDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfiguration"
    // InternalGagDsl.g:64:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalGagDsl.g:64:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalGagDsl.g:65:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGagDsl.g:71:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= 'consistent_to' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGagDsl.g:77:2: ( (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= 'consistent_to' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalGagDsl.g:78:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= 'consistent_to' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalGagDsl.g:78:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= 'consistent_to' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalGagDsl.g:79:3: otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= 'consistent_to' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalGagDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGagDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalGagDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalGagDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.gagdsl.GagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getRootKeyword_3());
            		
            // InternalGagDsl.g:110:3: ( ( ruleEString ) )
            // InternalGagDsl.g:111:4: ( ruleEString )
            {
            // InternalGagDsl.g:111:4: ( ruleEString )
            // InternalGagDsl.g:112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConfigurationAccess().getRootTaskCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getConsistent_toKeyword_5());
            		
            // InternalGagDsl.g:130:3: ( ( ruleEString ) )
            // InternalGagDsl.g:131:4: ( ruleEString )
            {
            // InternalGagDsl.g:131:4: ( ruleEString )
            // InternalGagDsl.g:132:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConfigurationAccess().getConsistent_toGAGCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleTask"
    // InternalGagDsl.g:154:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalGagDsl.g:154:45: (iv_ruleTask= ruleTask EOF )
            // InternalGagDsl.g:155:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGagDsl.g:161:1: ruleTask returns [EObject current=null] : ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'instance_of' ( ( ruleEString ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_is_open_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_appliedRule_7_0 = null;

        EObject lv_sub_task_12_0 = null;

        EObject lv_sub_task_14_0 = null;



        	enterRule();

        try {
            // InternalGagDsl.g:167:2: ( ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'instance_of' ( ( ruleEString ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalGagDsl.g:168:2: ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'instance_of' ( ( ruleEString ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalGagDsl.g:168:2: ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'instance_of' ( ( ruleEString ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalGagDsl.g:169:3: ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'instance_of' ( ( ruleEString ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalGagDsl.g:169:3: ( (lv_is_open_0_0= 'is_open' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGagDsl.g:170:4: (lv_is_open_0_0= 'is_open' )
                    {
                    // InternalGagDsl.g:170:4: (lv_is_open_0_0= 'is_open' )
                    // InternalGagDsl.g:171:5: lv_is_open_0_0= 'is_open'
                    {
                    lv_is_open_0_0=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(lv_is_open_0_0, grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(current, "is_open", true, "is_open");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
            		
            // InternalGagDsl.g:187:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGagDsl.g:188:4: (lv_name_2_0= ruleEString )
            {
            // InternalGagDsl.g:188:4: (lv_name_2_0= ruleEString )
            // InternalGagDsl.g:189:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"inria.fuchsia.gag.gagdsl.GagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getIdKeyword_4());
            		
            // InternalGagDsl.g:214:3: ( (lv_id_5_0= ruleELong ) )
            // InternalGagDsl.g:215:4: (lv_id_5_0= ruleELong )
            {
            // InternalGagDsl.g:215:4: (lv_id_5_0= ruleELong )
            // InternalGagDsl.g:216:5: lv_id_5_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getIdELongParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_id_5_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"inria.fuchsia.gag.gagdsl.GagDsl.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGagDsl.g:233:3: (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGagDsl.g:234:4: otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getAppliedRuleKeyword_6_0());
                    			
                    // InternalGagDsl.g:238:4: ( (lv_appliedRule_7_0= ruleEString ) )
                    // InternalGagDsl.g:239:5: (lv_appliedRule_7_0= ruleEString )
                    {
                    // InternalGagDsl.g:239:5: (lv_appliedRule_7_0= ruleEString )
                    // InternalGagDsl.g:240:6: lv_appliedRule_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getAppliedRuleEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_appliedRule_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"appliedRule",
                    							lv_appliedRule_7_0,
                    							"inria.fuchsia.gag.gagdsl.GagDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGagDsl.g:258:3: (otherlv_8= 'instance_of' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGagDsl.g:259:4: otherlv_8= 'instance_of' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getInstance_ofKeyword_7_0());
                    			
                    // InternalGagDsl.g:263:4: ( ( ruleEString ) )
                    // InternalGagDsl.g:264:5: ( ruleEString )
                    {
                    // InternalGagDsl.g:264:5: ( ruleEString )
                    // InternalGagDsl.g:265:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskAccess().getInstance_ofServiceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGagDsl.g:280:3: (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGagDsl.g:281:4: otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getSub_taskKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalGagDsl.g:289:4: ( (lv_sub_task_12_0= ruleTask ) )
                    // InternalGagDsl.g:290:5: (lv_sub_task_12_0= ruleTask )
                    {
                    // InternalGagDsl.g:290:5: (lv_sub_task_12_0= ruleTask )
                    // InternalGagDsl.g:291:6: lv_sub_task_12_0= ruleTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sub_task_12_0=ruleTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"sub_task",
                    							lv_sub_task_12_0,
                    							"inria.fuchsia.gag.gagdsl.GagDsl.Task");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGagDsl.g:308:4: (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGagDsl.g:309:5: otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) )
                    	    {
                    	    otherlv_13=(Token)match(input,22,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGagDsl.g:313:5: ( (lv_sub_task_14_0= ruleTask ) )
                    	    // InternalGagDsl.g:314:6: (lv_sub_task_14_0= ruleTask )
                    	    {
                    	    // InternalGagDsl.g:314:6: (lv_sub_task_14_0= ruleTask )
                    	    // InternalGagDsl.g:315:7: lv_sub_task_14_0= ruleTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_sub_task_14_0=ruleTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sub_task",
                    	    								lv_sub_task_14_0,
                    	    								"inria.fuchsia.gag.gagdsl.GagDsl.Task");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalGagDsl.g:346:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGagDsl.g:346:47: (iv_ruleEString= ruleEString EOF )
            // InternalGagDsl.g:347:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGagDsl.g:353:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGagDsl.g:359:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGagDsl.g:360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGagDsl.g:360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGagDsl.g:361:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGagDsl.g:369:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleELong"
    // InternalGagDsl.g:380:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalGagDsl.g:380:45: (iv_ruleELong= ruleELong EOF )
            // InternalGagDsl.g:381:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalGagDsl.g:387:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGagDsl.g:393:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGagDsl.g:394:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGagDsl.g:394:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGagDsl.g:395:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGagDsl.g:395:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGagDsl.g:396:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleValue"
    // InternalGagDsl.g:413:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGagDsl.g:413:46: (iv_ruleValue= ruleValue EOF )
            // InternalGagDsl.g:414:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGagDsl.g:420:1: ruleValue returns [EObject current=null] : ( ( (lv_defined_0_0= 'defined' ) ) otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )? (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_defined_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_sub_value_8_0 = null;

        EObject lv_sub_value_10_0 = null;



        	enterRule();

        try {
            // InternalGagDsl.g:426:2: ( ( ( (lv_defined_0_0= 'defined' ) ) otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )? (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalGagDsl.g:427:2: ( ( (lv_defined_0_0= 'defined' ) ) otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )? (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalGagDsl.g:427:2: ( ( (lv_defined_0_0= 'defined' ) ) otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )? (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalGagDsl.g:428:3: ( (lv_defined_0_0= 'defined' ) ) otherlv_1= 'Value' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )? (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalGagDsl.g:428:3: ( (lv_defined_0_0= 'defined' ) )
            // InternalGagDsl.g:429:4: (lv_defined_0_0= 'defined' )
            {
            // InternalGagDsl.g:429:4: (lv_defined_0_0= 'defined' )
            // InternalGagDsl.g:430:5: lv_defined_0_0= 'defined'
            {
            lv_defined_0_0=(Token)match(input,24,FOLLOW_17); 

            					newLeafNode(lv_defined_0_0, grammarAccess.getValueAccess().getDefinedDefinedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueRule());
            					}
            					setWithLastConsumed(current, "defined", true, "defined");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
            		
            // InternalGagDsl.g:446:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGagDsl.g:447:4: (lv_name_2_0= ruleEString )
            {
            // InternalGagDsl.g:447:4: (lv_name_2_0= ruleEString )
            // InternalGagDsl.g:448:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"inria.fuchsia.gag.gagdsl.GagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGagDsl.g:469:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGagDsl.g:470:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueAccess().getValueKeyword_4_0());
                    			
                    // InternalGagDsl.g:474:4: ( (lv_value_5_0= ruleEJavaObject ) )
                    // InternalGagDsl.g:475:5: (lv_value_5_0= ruleEJavaObject )
                    {
                    // InternalGagDsl.g:475:5: (lv_value_5_0= ruleEJavaObject )
                    // InternalGagDsl.g:476:6: lv_value_5_0= ruleEJavaObject
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getValueEJavaObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_5_0=ruleEJavaObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"inria.fuchsia.gag.gagdsl.GagDsl.EJavaObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGagDsl.g:494:3: (otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGagDsl.g:495:4: otherlv_6= 'sub_value' otherlv_7= '{' ( (lv_sub_value_8_0= ruleValue ) ) (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getValueAccess().getSub_valueKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGagDsl.g:503:4: ( (lv_sub_value_8_0= ruleValue ) )
                    // InternalGagDsl.g:504:5: (lv_sub_value_8_0= ruleValue )
                    {
                    // InternalGagDsl.g:504:5: (lv_sub_value_8_0= ruleValue )
                    // InternalGagDsl.g:505:6: lv_sub_value_8_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sub_value_8_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						add(
                    							current,
                    							"sub_value",
                    							lv_sub_value_8_0,
                    							"inria.fuchsia.gag.gagdsl.GagDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGagDsl.g:522:4: (otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGagDsl.g:523:5: otherlv_9= ',' ( (lv_sub_value_10_0= ruleValue ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_21); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getValueAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGagDsl.g:527:5: ( (lv_sub_value_10_0= ruleValue ) )
                    	    // InternalGagDsl.g:528:6: (lv_sub_value_10_0= ruleValue )
                    	    {
                    	    // InternalGagDsl.g:528:6: (lv_sub_value_10_0= ruleValue )
                    	    // InternalGagDsl.g:529:7: lv_sub_value_10_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_sub_value_10_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sub_value",
                    	    								lv_sub_value_10_0,
                    	    								"inria.fuchsia.gag.gagdsl.GagDsl.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalGagDsl.g:560:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // InternalGagDsl.g:560:51: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // InternalGagDsl.g:561:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEJavaObject"


    // $ANTLR start "ruleEJavaObject"
    // InternalGagDsl.g:567:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGagDsl.g:573:2: (kw= 'EJavaObject' )
            // InternalGagDsl.g:574:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword());
            	

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
    // $ANTLR end "ruleEJavaObject"


    // $ANTLR start "entryRuleRule"
    // InternalGagDsl.g:582:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGagDsl.g:582:45: (iv_ruleRule= ruleRule EOF )
            // InternalGagDsl.g:583:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGagDsl.g:589:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( ( ruleEString ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guard' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGagDsl.g:595:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( ( ruleEString ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guard' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalGagDsl.g:596:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( ( ruleEString ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guard' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalGagDsl.g:596:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( ( ruleEString ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guard' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalGagDsl.g:597:3: otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( ( ruleEString ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guard' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGagDsl.g:601:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGagDsl.g:602:4: (lv_name_1_0= ruleEString )
            {
            // InternalGagDsl.g:602:4: (lv_name_1_0= ruleEString )
            // InternalGagDsl.g:603:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.gagdsl.GagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getLeft_hand_sideKeyword_3());
            		
            // InternalGagDsl.g:628:3: ( ( ruleEString ) )
            // InternalGagDsl.g:629:4: ( ruleEString )
            {
            // InternalGagDsl.g:629:4: ( ruleEString )
            // InternalGagDsl.g:630:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getLeft_hand_sideServiceCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGagDsl.g:644:3: (otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGagDsl.g:645:4: otherlv_5= 'right_hand_side_service' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRight_hand_side_serviceKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGagDsl.g:653:4: ( ( ruleEString ) )
                    // InternalGagDsl.g:654:5: ( ruleEString )
                    {
                    // InternalGagDsl.g:654:5: ( ruleEString )
                    // InternalGagDsl.g:655:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGagDsl.g:669:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGagDsl.g:670:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGagDsl.g:674:5: ( ( ruleEString ) )
                    	    // InternalGagDsl.g:675:6: ( ruleEString )
                    	    {
                    	    // InternalGagDsl.g:675:6: ( ruleEString )
                    	    // InternalGagDsl.g:676:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGagDsl.g:696:3: (otherlv_11= 'guard' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGagDsl.g:697:4: otherlv_11= 'guard' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getGuardKeyword_6_0());
                    			
                    // InternalGagDsl.g:701:4: ( ( ruleEString ) )
                    // InternalGagDsl.g:702:5: ( ruleEString )
                    {
                    // InternalGagDsl.g:702:5: ( ruleEString )
                    // InternalGagDsl.g:703:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getGuardGuardCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000480008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400008000L});

}