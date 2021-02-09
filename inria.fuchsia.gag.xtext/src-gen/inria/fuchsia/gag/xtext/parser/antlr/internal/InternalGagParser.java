package inria.fuchsia.gag.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import inria.fuchsia.gag.xtext.services.GagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGagParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'configuration'", "'specification'", "'}'", "'Configuration'", "'root'", "'GAG'", "'rule'", "','", "'is_open'", "'Task'", "'id'", "'appliedRule'", "'associated_to'", "'sub_task'", "'-'", "'Service'", "'input'", "'output'", "'Attribute'", "'type'", "'value'", "'EJavaObject'", "'Rule'", "'left_hand_side'", "'right_hand_side_service'", "'guard'", "'Guard'", "'classPath'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGagParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGagParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGagParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGag.g"; }



     	private GagGrammarAccess grammarAccess;

        public InternalGagParser(TokenStream input, GagGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected GagGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalGag.g:64:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalGag.g:64:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalGag.g:65:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalGag.g:71:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) otherlv_4= 'specification' ( (lv_specification_5_0= ruleGAG ) ) otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_configuration_3_0 = null;

        EObject lv_specification_5_0 = null;



        	enterRule();

        try {
            // InternalGag.g:77:2: ( (otherlv_0= 'Process' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) otherlv_4= 'specification' ( (lv_specification_5_0= ruleGAG ) ) otherlv_6= '}' ) )
            // InternalGag.g:78:2: (otherlv_0= 'Process' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) otherlv_4= 'specification' ( (lv_specification_5_0= ruleGAG ) ) otherlv_6= '}' )
            {
            // InternalGag.g:78:2: (otherlv_0= 'Process' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) otherlv_4= 'specification' ( (lv_specification_5_0= ruleGAG ) ) otherlv_6= '}' )
            // InternalGag.g:79:3: otherlv_0= 'Process' otherlv_1= '{' otherlv_2= 'configuration' ( (lv_configuration_3_0= ruleConfiguration ) ) otherlv_4= 'specification' ( (lv_specification_5_0= ruleGAG ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getConfigurationKeyword_2());
            		
            // InternalGag.g:91:3: ( (lv_configuration_3_0= ruleConfiguration ) )
            // InternalGag.g:92:4: (lv_configuration_3_0= ruleConfiguration )
            {
            // InternalGag.g:92:4: (lv_configuration_3_0= ruleConfiguration )
            // InternalGag.g:93:5: lv_configuration_3_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getConfigurationConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_configuration_3_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_3_0,
            						"inria.fuchsia.gag.xtext.Gag.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getSpecificationKeyword_4());
            		
            // InternalGag.g:114:3: ( (lv_specification_5_0= ruleGAG ) )
            // InternalGag.g:115:4: (lv_specification_5_0= ruleGAG )
            {
            // InternalGag.g:115:4: (lv_specification_5_0= ruleGAG )
            // InternalGag.g:116:5: lv_specification_5_0= ruleGAG
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getSpecificationGAGParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_specification_5_0=ruleGAG();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_5_0,
            						"inria.fuchsia.gag.xtext.Gag.GAG");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleConfiguration"
    // InternalGag.g:141:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalGag.g:141:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalGag.g:142:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalGag.g:148:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( (lv_root_4_0= ruleTask ) ) otherlv_5= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_4_0 = null;



        	enterRule();

        try {
            // InternalGag.g:154:2: ( (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( (lv_root_4_0= ruleTask ) ) otherlv_5= '}' ) )
            // InternalGag.g:155:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( (lv_root_4_0= ruleTask ) ) otherlv_5= '}' )
            {
            // InternalGag.g:155:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( (lv_root_4_0= ruleTask ) ) otherlv_5= '}' )
            // InternalGag.g:156:3: otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root' ( (lv_root_4_0= ruleTask ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalGag.g:160:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:161:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:161:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:162:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getRootKeyword_3());
            		
            // InternalGag.g:187:3: ( (lv_root_4_0= ruleTask ) )
            // InternalGag.g:188:4: (lv_root_4_0= ruleTask )
            {
            // InternalGag.g:188:4: (lv_root_4_0= ruleTask )
            // InternalGag.g:189:5: lv_root_4_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getRootTaskParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_root_4_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_4_0,
            						"inria.fuchsia.gag.xtext.Gag.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleGAG"
    // InternalGag.g:214:1: entryRuleGAG returns [EObject current=null] : iv_ruleGAG= ruleGAG EOF ;
    public final EObject entryRuleGAG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAG = null;


        try {
            // InternalGag.g:214:44: (iv_ruleGAG= ruleGAG EOF )
            // InternalGag.g:215:2: iv_ruleGAG= ruleGAG EOF
            {
             newCompositeNode(grammarAccess.getGAGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGAG=ruleGAG();

            state._fsp--;

             current =iv_ruleGAG; 
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
    // $ANTLR end "entryRuleGAG"


    // $ANTLR start "ruleGAG"
    // InternalGag.g:221:1: ruleGAG returns [EObject current=null] : (otherlv_0= 'GAG' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleGAG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rule_5_0 = null;

        EObject lv_rule_7_0 = null;



        	enterRule();

        try {
            // InternalGag.g:227:2: ( (otherlv_0= 'GAG' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalGag.g:228:2: (otherlv_0= 'GAG' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalGag.g:228:2: (otherlv_0= 'GAG' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalGag.g:229:3: otherlv_0= 'GAG' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rule' otherlv_4= '{' ( (lv_rule_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGAGAccess().getGAGKeyword_0());
            		
            // InternalGag.g:233:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:234:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:234:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:235:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGAGAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGAGRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGAGAccess().getRuleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGag.g:264:3: ( (lv_rule_5_0= ruleRule ) )
            // InternalGag.g:265:4: (lv_rule_5_0= ruleRule )
            {
            // InternalGag.g:265:4: (lv_rule_5_0= ruleRule )
            // InternalGag.g:266:5: lv_rule_5_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_rule_5_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGAGRule());
            					}
            					add(
            						current,
            						"rule",
            						lv_rule_5_0,
            						"inria.fuchsia.gag.xtext.Gag.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:283:3: (otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGag.g:284:4: otherlv_6= ',' ( (lv_rule_7_0= ruleRule ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getGAGAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalGag.g:288:4: ( (lv_rule_7_0= ruleRule ) )
            	    // InternalGag.g:289:5: (lv_rule_7_0= ruleRule )
            	    {
            	    // InternalGag.g:289:5: (lv_rule_7_0= ruleRule )
            	    // InternalGag.g:290:6: lv_rule_7_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rule_7_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGAGRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rule",
            	    							lv_rule_7_0,
            	    							"inria.fuchsia.gag.xtext.Gag.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGAG"


    // $ANTLR start "entryRuleTask"
    // InternalGag.g:320:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalGag.g:320:45: (iv_ruleTask= ruleTask EOF )
            // InternalGag.g:321:2: iv_ruleTask= ruleTask EOF
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
    // InternalGag.g:327:1: ruleTask returns [EObject current=null] : ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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

        EObject lv_associated_to_9_0 = null;

        EObject lv_sub_task_12_0 = null;

        EObject lv_sub_task_14_0 = null;



        	enterRule();

        try {
            // InternalGag.g:333:2: ( ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalGag.g:334:2: ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalGag.g:334:2: ( ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalGag.g:335:3: ( (lv_is_open_0_0= 'is_open' ) )? otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleELong ) ) (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )? (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )? (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalGag.g:335:3: ( (lv_is_open_0_0= 'is_open' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGag.g:336:4: (lv_is_open_0_0= 'is_open' )
                    {
                    // InternalGag.g:336:4: (lv_is_open_0_0= 'is_open' )
                    // InternalGag.g:337:5: lv_is_open_0_0= 'is_open'
                    {
                    lv_is_open_0_0=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(lv_is_open_0_0, grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(current, "is_open", true, "is_open");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
            		
            // InternalGag.g:353:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:354:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:354:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:355:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getIdKeyword_4());
            		
            // InternalGag.g:380:3: ( (lv_id_5_0= ruleELong ) )
            // InternalGag.g:381:4: (lv_id_5_0= ruleELong )
            {
            // InternalGag.g:381:4: (lv_id_5_0= ruleELong )
            // InternalGag.g:382:5: lv_id_5_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getIdELongParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_id_5_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"inria.fuchsia.gag.xtext.Gag.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:399:3: (otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGag.g:400:4: otherlv_6= 'appliedRule' ( (lv_appliedRule_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getAppliedRuleKeyword_6_0());
                    			
                    // InternalGag.g:404:4: ( (lv_appliedRule_7_0= ruleEString ) )
                    // InternalGag.g:405:5: (lv_appliedRule_7_0= ruleEString )
                    {
                    // InternalGag.g:405:5: (lv_appliedRule_7_0= ruleEString )
                    // InternalGag.g:406:6: lv_appliedRule_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getAppliedRuleEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_appliedRule_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"appliedRule",
                    							lv_appliedRule_7_0,
                    							"inria.fuchsia.gag.xtext.Gag.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:424:3: (otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGag.g:425:4: otherlv_8= 'associated_to' ( (lv_associated_to_9_0= ruleService ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getAssociated_toKeyword_7_0());
                    			
                    // InternalGag.g:429:4: ( (lv_associated_to_9_0= ruleService ) )
                    // InternalGag.g:430:5: (lv_associated_to_9_0= ruleService )
                    {
                    // InternalGag.g:430:5: (lv_associated_to_9_0= ruleService )
                    // InternalGag.g:431:6: lv_associated_to_9_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getAssociated_toServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_associated_to_9_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"associated_to",
                    							lv_associated_to_9_0,
                    							"inria.fuchsia.gag.xtext.Gag.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:449:3: (otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGag.g:450:4: otherlv_10= 'sub_task' otherlv_11= '{' ( (lv_sub_task_12_0= ruleTask ) ) (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getSub_taskKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalGag.g:458:4: ( (lv_sub_task_12_0= ruleTask ) )
                    // InternalGag.g:459:5: (lv_sub_task_12_0= ruleTask )
                    {
                    // InternalGag.g:459:5: (lv_sub_task_12_0= ruleTask )
                    // InternalGag.g:460:6: lv_sub_task_12_0= ruleTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_sub_task_12_0=ruleTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"sub_task",
                    							lv_sub_task_12_0,
                    							"inria.fuchsia.gag.xtext.Gag.Task");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:477:4: (otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGag.g:478:5: otherlv_13= ',' ( (lv_sub_task_14_0= ruleTask ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGag.g:482:5: ( (lv_sub_task_14_0= ruleTask ) )
                    	    // InternalGag.g:483:6: (lv_sub_task_14_0= ruleTask )
                    	    {
                    	    // InternalGag.g:483:6: (lv_sub_task_14_0= ruleTask )
                    	    // InternalGag.g:484:7: lv_sub_task_14_0= ruleTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_sub_task_14_0=ruleTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sub_task",
                    	    								lv_sub_task_14_0,
                    	    								"inria.fuchsia.gag.xtext.Gag.Task");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

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
    // InternalGag.g:515:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGag.g:515:47: (iv_ruleEString= ruleEString EOF )
            // InternalGag.g:516:2: iv_ruleEString= ruleEString EOF
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
    // InternalGag.g:522:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGag.g:528:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGag.g:529:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGag.g:529:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGag.g:530:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:538:3: this_ID_1= RULE_ID
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
    // InternalGag.g:549:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalGag.g:549:45: (iv_ruleELong= ruleELong EOF )
            // InternalGag.g:550:2: iv_ruleELong= ruleELong EOF
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
    // InternalGag.g:556:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGag.g:562:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGag.g:563:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGag.g:563:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGag.g:564:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGag.g:564:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGag.g:565:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_22); 

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


    // $ANTLR start "entryRuleService"
    // InternalGag.g:582:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalGag.g:582:48: (iv_ruleService= ruleService EOF )
            // InternalGag.g:583:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalGag.g:589:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_input_6_0 = null;

        EObject lv_input_8_0 = null;

        EObject lv_output_12_0 = null;

        EObject lv_output_14_0 = null;



        	enterRule();

        try {
            // InternalGag.g:595:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalGag.g:596:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalGag.g:596:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalGag.g:597:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalGag.g:597:3: ()
            // InternalGag.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
            		
            // InternalGag.g:608:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:609:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:609:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:610:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGag.g:631:3: (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGag.g:632:4: otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getInputKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGag.g:640:4: ( (lv_input_6_0= ruleAttribute ) )
                    // InternalGag.g:641:5: (lv_input_6_0= ruleAttribute )
                    {
                    // InternalGag.g:641:5: (lv_input_6_0= ruleAttribute )
                    // InternalGag.g:642:6: lv_input_6_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_input_6_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_6_0,
                    							"inria.fuchsia.gag.xtext.Gag.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:659:4: (otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGag.g:660:5: otherlv_7= ',' ( (lv_input_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_24); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGag.g:664:5: ( (lv_input_8_0= ruleAttribute ) )
                    	    // InternalGag.g:665:6: (lv_input_8_0= ruleAttribute )
                    	    {
                    	    // InternalGag.g:665:6: (lv_input_8_0= ruleAttribute )
                    	    // InternalGag.g:666:7: lv_input_8_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_input_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_8_0,
                    	    								"inria.fuchsia.gag.xtext.Gag.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGag.g:689:3: (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGag.g:690:4: otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getOutputKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGag.g:698:4: ( (lv_output_12_0= ruleAttribute ) )
                    // InternalGag.g:699:5: (lv_output_12_0= ruleAttribute )
                    {
                    // InternalGag.g:699:5: (lv_output_12_0= ruleAttribute )
                    // InternalGag.g:700:6: lv_output_12_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_output_12_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"output",
                    							lv_output_12_0,
                    							"inria.fuchsia.gag.xtext.Gag.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:717:4: (otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGag.g:718:5: otherlv_13= ',' ( (lv_output_14_0= ruleAttribute ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGag.g:722:5: ( (lv_output_14_0= ruleAttribute ) )
                    	    // InternalGag.g:723:6: (lv_output_14_0= ruleAttribute )
                    	    {
                    	    // InternalGag.g:723:6: (lv_output_14_0= ruleAttribute )
                    	    // InternalGag.g:724:7: lv_output_14_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_output_14_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"output",
                    	    								lv_output_14_0,
                    	    								"inria.fuchsia.gag.xtext.Gag.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAttribute"
    // InternalGag.g:755:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalGag.g:755:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalGag.g:756:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalGag.g:762:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalGag.g:768:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )? otherlv_7= '}' ) )
            // InternalGag.g:769:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )? otherlv_7= '}' )
            {
            // InternalGag.g:769:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )? otherlv_7= '}' )
            // InternalGag.g:770:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalGag.g:774:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:775:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:775:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:776:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalGag.g:801:3: ( (lv_type_4_0= ruleEString ) )
            // InternalGag.g:802:4: (lv_type_4_0= ruleEString )
            {
            // InternalGag.g:802:4: (lv_type_4_0= ruleEString )
            // InternalGag.g:803:5: lv_type_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_type_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:820:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGag.g:821:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEJavaObject ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalGag.g:825:4: ( (lv_value_6_0= ruleEJavaObject ) )
                    // InternalGag.g:826:5: (lv_value_6_0= ruleEJavaObject )
                    {
                    // InternalGag.g:826:5: (lv_value_6_0= ruleEJavaObject )
                    // InternalGag.g:827:6: lv_value_6_0= ruleEJavaObject
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_value_6_0=ruleEJavaObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"inria.fuchsia.gag.xtext.Gag.EJavaObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalGag.g:853:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // InternalGag.g:853:51: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // InternalGag.g:854:2: iv_ruleEJavaObject= ruleEJavaObject EOF
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
    // InternalGag.g:860:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGag.g:866:2: (kw= 'EJavaObject' )
            // InternalGag.g:867:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalGag.g:875:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGag.g:875:45: (iv_ruleRule= ruleRule EOF )
            // InternalGag.g:876:2: iv_ruleRule= ruleRule EOF
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
    // InternalGag.g:882:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( (lv_left_hand_side_4_0= ruleService ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )? (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )? otherlv_13= '}' ) ;
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

        EObject lv_left_hand_side_4_0 = null;

        EObject lv_right_hand_side_service_7_0 = null;

        EObject lv_right_hand_side_service_9_0 = null;

        EObject lv_guard_12_0 = null;



        	enterRule();

        try {
            // InternalGag.g:888:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( (lv_left_hand_side_4_0= ruleService ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )? (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )? otherlv_13= '}' ) )
            // InternalGag.g:889:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( (lv_left_hand_side_4_0= ruleService ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )? (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )? otherlv_13= '}' )
            {
            // InternalGag.g:889:2: (otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( (lv_left_hand_side_4_0= ruleService ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )? (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )? otherlv_13= '}' )
            // InternalGag.g:890:3: otherlv_0= 'Rule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left_hand_side' ( (lv_left_hand_side_4_0= ruleService ) ) (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )? (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGag.g:894:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:895:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:895:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:896:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getLeft_hand_sideKeyword_3());
            		
            // InternalGag.g:921:3: ( (lv_left_hand_side_4_0= ruleService ) )
            // InternalGag.g:922:4: (lv_left_hand_side_4_0= ruleService )
            {
            // InternalGag.g:922:4: (lv_left_hand_side_4_0= ruleService )
            // InternalGag.g:923:5: lv_left_hand_side_4_0= ruleService
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getLeft_hand_sideServiceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_left_hand_side_4_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"left_hand_side",
            						lv_left_hand_side_4_0,
            						"inria.fuchsia.gag.xtext.Gag.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:940:3: (otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGag.g:941:4: otherlv_5= 'right_hand_side_service' otherlv_6= '{' ( (lv_right_hand_side_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRight_hand_side_serviceKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGag.g:949:4: ( (lv_right_hand_side_service_7_0= ruleService ) )
                    // InternalGag.g:950:5: (lv_right_hand_side_service_7_0= ruleService )
                    {
                    // InternalGag.g:950:5: (lv_right_hand_side_service_7_0= ruleService )
                    // InternalGag.g:951:6: lv_right_hand_side_service_7_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_right_hand_side_service_7_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"right_hand_side_service",
                    							lv_right_hand_side_service_7_0,
                    							"inria.fuchsia.gag.xtext.Gag.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:968:4: (otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGag.g:969:5: otherlv_8= ',' ( (lv_right_hand_side_service_9_0= ruleService ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_20); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGag.g:973:5: ( (lv_right_hand_side_service_9_0= ruleService ) )
                    	    // InternalGag.g:974:6: (lv_right_hand_side_service_9_0= ruleService )
                    	    {
                    	    // InternalGag.g:974:6: (lv_right_hand_side_service_9_0= ruleService )
                    	    // InternalGag.g:975:7: lv_right_hand_side_service_9_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_right_hand_side_service_9_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"right_hand_side_service",
                    	    								lv_right_hand_side_service_9_0,
                    	    								"inria.fuchsia.gag.xtext.Gag.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGag.g:998:3: (otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGag.g:999:4: otherlv_11= 'guard' ( (lv_guard_12_0= ruleGuard ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getGuardKeyword_6_0());
                    			
                    // InternalGag.g:1003:4: ( (lv_guard_12_0= ruleGuard ) )
                    // InternalGag.g:1004:5: (lv_guard_12_0= ruleGuard )
                    {
                    // InternalGag.g:1004:5: (lv_guard_12_0= ruleGuard )
                    // InternalGag.g:1005:6: lv_guard_12_0= ruleGuard
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getGuardGuardParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_guard_12_0=ruleGuard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_12_0,
                    							"inria.fuchsia.gag.xtext.Gag.Guard");
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


    // $ANTLR start "entryRuleGuard"
    // InternalGag.g:1031:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalGag.g:1031:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalGag.g:1032:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalGag.g:1038:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'Guard' otherlv_1= '{' otherlv_2= 'classPath' ( (lv_classPath_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_classPath_3_0 = null;



        	enterRule();

        try {
            // InternalGag.g:1044:2: ( (otherlv_0= 'Guard' otherlv_1= '{' otherlv_2= 'classPath' ( (lv_classPath_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalGag.g:1045:2: (otherlv_0= 'Guard' otherlv_1= '{' otherlv_2= 'classPath' ( (lv_classPath_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGag.g:1045:2: (otherlv_0= 'Guard' otherlv_1= '{' otherlv_2= 'classPath' ( (lv_classPath_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalGag.g:1046:3: otherlv_0= 'Guard' otherlv_1= '{' otherlv_2= 'classPath' ( (lv_classPath_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getGuardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getClassPathKeyword_2());
            		
            // InternalGag.g:1058:3: ( (lv_classPath_3_0= ruleEString ) )
            // InternalGag.g:1059:4: (lv_classPath_3_0= ruleEString )
            {
            // InternalGag.g:1059:4: (lv_classPath_3_0= ruleEString )
            // InternalGag.g:1060:5: lv_classPath_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getClassPathEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_classPath_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"classPath",
            						lv_classPath_3_0,
            						"inria.fuchsia.gag.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuard"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});

}