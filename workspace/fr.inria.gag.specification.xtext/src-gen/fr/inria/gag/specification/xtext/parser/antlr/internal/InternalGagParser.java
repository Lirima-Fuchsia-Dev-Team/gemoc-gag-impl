package fr.inria.gag.specification.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.gag.specification.xtext.services.GagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGagParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GAG'", "'{'", "'services'", "','", "'}'", "'isAxiom'", "'Service'", "'rules'", "'inputParameters'", "'outputParameters'", "'DecompositionRule'", "'subServices'", "'('", "')'", "'guard'", "'semantic'", "'Parameter'", "'Guard'", "'classPath'", "'SemanticRule'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
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
        	return "GAG";
       	}

       	@Override
       	protected GagGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGAG"
    // InternalGag.g:64:1: entryRuleGAG returns [EObject current=null] : iv_ruleGAG= ruleGAG EOF ;
    public final EObject entryRuleGAG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAG = null;


        try {
            // InternalGag.g:64:44: (iv_ruleGAG= ruleGAG EOF )
            // InternalGag.g:65:2: iv_ruleGAG= ruleGAG EOF
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
    // InternalGag.g:71:1: ruleGAG returns [EObject current=null] : ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleGAG() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_services_6_0 = null;

        EObject lv_services_8_0 = null;



        	enterRule();

        try {
            // InternalGag.g:77:2: ( ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalGag.g:78:2: ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalGag.g:78:2: ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalGag.g:79:3: () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalGag.g:79:3: ()
            // InternalGag.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGAGAccess().getGAGAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGAGAccess().getGAGKeyword_1());
            		
            // InternalGag.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:91:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGAGAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGAGRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGag.g:113:3: (otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGag.g:114:4: otherlv_4= 'services' otherlv_5= '{' ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getGAGAccess().getServicesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGag.g:122:4: ( (lv_services_6_0= ruleService ) )
                    // InternalGag.g:123:5: (lv_services_6_0= ruleService )
                    {
                    // InternalGag.g:123:5: (lv_services_6_0= ruleService )
                    // InternalGag.g:124:6: lv_services_6_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getGAGAccess().getServicesServiceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_services_6_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGAGRule());
                    						}
                    						add(
                    							current,
                    							"services",
                    							lv_services_6_0,
                    							"fr.inria.gag.specification.xtext.Gag.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:141:4: (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGag.g:142:5: otherlv_7= ',' ( (lv_services_8_0= ruleService ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGAGAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGag.g:146:5: ( (lv_services_8_0= ruleService ) )
                    	    // InternalGag.g:147:6: (lv_services_8_0= ruleService )
                    	    {
                    	    // InternalGag.g:147:6: (lv_services_8_0= ruleService )
                    	    // InternalGag.g:148:7: lv_services_8_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getGAGAccess().getServicesServiceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_services_8_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGAGRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"services",
                    	    								lv_services_8_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleService"
    // InternalGag.g:179:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalGag.g:179:48: (iv_ruleService= ruleService EOF )
            // InternalGag.g:180:2: iv_ruleService= ruleService EOF
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
    // InternalGag.g:186:1: ruleService returns [EObject current=null] : ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleDecompositionRule ) ) (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )* otherlv_9= '}' (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_isAxiom_0_0=null;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rules_6_0 = null;

        EObject lv_rules_8_0 = null;

        EObject lv_inputParameters_12_0 = null;

        EObject lv_inputParameters_14_0 = null;

        EObject lv_outputParameters_18_0 = null;

        EObject lv_outputParameters_20_0 = null;



        	enterRule();

        try {
            // InternalGag.g:192:2: ( ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleDecompositionRule ) ) (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )* otherlv_9= '}' (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalGag.g:193:2: ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleDecompositionRule ) ) (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )* otherlv_9= '}' (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalGag.g:193:2: ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleDecompositionRule ) ) (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )* otherlv_9= '}' (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalGag.g:194:3: ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleDecompositionRule ) ) (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )* otherlv_9= '}' (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalGag.g:194:3: ( (lv_isAxiom_0_0= 'isAxiom' ) )
            // InternalGag.g:195:4: (lv_isAxiom_0_0= 'isAxiom' )
            {
            // InternalGag.g:195:4: (lv_isAxiom_0_0= 'isAxiom' )
            // InternalGag.g:196:5: lv_isAxiom_0_0= 'isAxiom'
            {
            lv_isAxiom_0_0=(Token)match(input,16,FOLLOW_9); 

            					newLeafNode(lv_isAxiom_0_0, grammarAccess.getServiceAccess().getIsAxiomIsAxiomKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(current, "isAxiom", true, "isAxiom");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
            		
            // InternalGag.g:212:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:213:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:213:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:214:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRulesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGag.g:243:3: ( (lv_rules_6_0= ruleDecompositionRule ) )
            // InternalGag.g:244:4: (lv_rules_6_0= ruleDecompositionRule )
            {
            // InternalGag.g:244:4: (lv_rules_6_0= ruleDecompositionRule )
            // InternalGag.g:245:5: lv_rules_6_0= ruleDecompositionRule
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_rules_6_0=ruleDecompositionRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_6_0,
            						"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:262:3: (otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGag.g:263:4: otherlv_7= ',' ( (lv_rules_8_0= ruleDecompositionRule ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGag.g:267:4: ( (lv_rules_8_0= ruleDecompositionRule ) )
            	    // InternalGag.g:268:5: (lv_rules_8_0= ruleDecompositionRule )
            	    {
            	    // InternalGag.g:268:5: (lv_rules_8_0= ruleDecompositionRule )
            	    // InternalGag.g:269:6: lv_rules_8_0= ruleDecompositionRule
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rules_8_0=ruleDecompositionRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_8_0,
            	    							"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalGag.g:291:3: (otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGag.g:292:4: otherlv_10= 'inputParameters' otherlv_11= '{' ( (lv_inputParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getInputParametersKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalGag.g:300:4: ( (lv_inputParameters_12_0= ruleParameter ) )
                    // InternalGag.g:301:5: (lv_inputParameters_12_0= ruleParameter )
                    {
                    // InternalGag.g:301:5: (lv_inputParameters_12_0= ruleParameter )
                    // InternalGag.g:302:6: lv_inputParameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_inputParameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"inputParameters",
                    							lv_inputParameters_12_0,
                    							"fr.inria.gag.specification.xtext.Gag.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:319:4: (otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGag.g:320:5: otherlv_13= ',' ( (lv_inputParameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGag.g:324:5: ( (lv_inputParameters_14_0= ruleParameter ) )
                    	    // InternalGag.g:325:6: (lv_inputParameters_14_0= ruleParameter )
                    	    {
                    	    // InternalGag.g:325:6: (lv_inputParameters_14_0= ruleParameter )
                    	    // InternalGag.g:326:7: lv_inputParameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_inputParameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputParameters",
                    	    								lv_inputParameters_14_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalGag.g:349:3: (otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGag.g:350:4: otherlv_16= 'outputParameters' otherlv_17= '{' ( (lv_outputParameters_18_0= ruleParameter ) ) (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getOutputParametersKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalGag.g:358:4: ( (lv_outputParameters_18_0= ruleParameter ) )
                    // InternalGag.g:359:5: (lv_outputParameters_18_0= ruleParameter )
                    {
                    // InternalGag.g:359:5: (lv_outputParameters_18_0= ruleParameter )
                    // InternalGag.g:360:6: lv_outputParameters_18_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_outputParameters_18_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"outputParameters",
                    							lv_outputParameters_18_0,
                    							"fr.inria.gag.specification.xtext.Gag.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:377:4: (otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGag.g:378:5: otherlv_19= ',' ( (lv_outputParameters_20_0= ruleParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalGag.g:382:5: ( (lv_outputParameters_20_0= ruleParameter ) )
                    	    // InternalGag.g:383:6: (lv_outputParameters_20_0= ruleParameter )
                    	    {
                    	    // InternalGag.g:383:6: (lv_outputParameters_20_0= ruleParameter )
                    	    // InternalGag.g:384:7: lv_outputParameters_20_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_outputParameters_20_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputParameters",
                    	    								lv_outputParameters_20_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalGag.g:415:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGag.g:415:47: (iv_ruleEString= ruleEString EOF )
            // InternalGag.g:416:2: iv_ruleEString= ruleEString EOF
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
    // InternalGag.g:422:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGag.g:428:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGag.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGag.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGag.g:430:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:438:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDecompositionRule"
    // InternalGag.g:449:1: entryRuleDecompositionRule returns [EObject current=null] : iv_ruleDecompositionRule= ruleDecompositionRule EOF ;
    public final EObject entryRuleDecompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionRule = null;


        try {
            // InternalGag.g:449:58: (iv_ruleDecompositionRule= ruleDecompositionRule EOF )
            // InternalGag.g:450:2: iv_ruleDecompositionRule= ruleDecompositionRule EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecompositionRule=ruleDecompositionRule();

            state._fsp--;

             current =iv_ruleDecompositionRule; 
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
    // $ANTLR end "entryRuleDecompositionRule"


    // $ANTLR start "ruleDecompositionRule"
    // InternalGag.g:456:1: ruleDecompositionRule returns [EObject current=null] : ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )? (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleDecompositionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_guard_11_0 = null;

        EObject lv_semantic_13_0 = null;



        	enterRule();

        try {
            // InternalGag.g:462:2: ( ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )? (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? otherlv_14= '}' ) )
            // InternalGag.g:463:2: ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )? (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? otherlv_14= '}' )
            {
            // InternalGag.g:463:2: ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )? (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? otherlv_14= '}' )
            // InternalGag.g:464:3: () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )? (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? otherlv_14= '}'
            {
            // InternalGag.g:464:3: ()
            // InternalGag.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionRuleAccess().getDecompositionRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionRuleAccess().getDecompositionRuleKeyword_1());
            		
            // InternalGag.g:475:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:476:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:476:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:477:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecompositionRuleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDecompositionRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGag.g:498:3: (otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGag.g:499:4: otherlv_4= 'subServices' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecompositionRuleAccess().getSubServicesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDecompositionRuleAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGag.g:507:4: ( ( ruleEString ) )
                    // InternalGag.g:508:5: ( ruleEString )
                    {
                    // InternalGag.g:508:5: ( ruleEString )
                    // InternalGag.g:509:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:523:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGag.g:524:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDecompositionRuleAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGag.g:528:5: ( ( ruleEString ) )
                    	    // InternalGag.g:529:6: ( ruleEString )
                    	    {
                    	    // InternalGag.g:529:6: ( ruleEString )
                    	    // InternalGag.g:530:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getDecompositionRuleAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGag.g:550:3: (otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGag.g:551:4: otherlv_10= 'guard' ( (lv_guard_11_0= ruleGuard ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getDecompositionRuleAccess().getGuardKeyword_5_0());
                    			
                    // InternalGag.g:555:4: ( (lv_guard_11_0= ruleGuard ) )
                    // InternalGag.g:556:5: (lv_guard_11_0= ruleGuard )
                    {
                    // InternalGag.g:556:5: (lv_guard_11_0= ruleGuard )
                    // InternalGag.g:557:6: lv_guard_11_0= ruleGuard
                    {

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getGuardGuardParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_guard_11_0=ruleGuard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecompositionRuleRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_11_0,
                    							"fr.inria.gag.specification.xtext.Gag.Guard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:575:3: (otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGag.g:576:4: otherlv_12= 'semantic' ( (lv_semantic_13_0= ruleSemanticRule ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecompositionRuleAccess().getSemanticKeyword_6_0());
                    			
                    // InternalGag.g:580:4: ( (lv_semantic_13_0= ruleSemanticRule ) )
                    // InternalGag.g:581:5: (lv_semantic_13_0= ruleSemanticRule )
                    {
                    // InternalGag.g:581:5: (lv_semantic_13_0= ruleSemanticRule )
                    // InternalGag.g:582:6: lv_semantic_13_0= ruleSemanticRule
                    {

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSemanticSemanticRuleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_semantic_13_0=ruleSemanticRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecompositionRuleRule());
                    						}
                    						set(
                    							current,
                    							"semantic",
                    							lv_semantic_13_0,
                    							"fr.inria.gag.specification.xtext.Gag.SemanticRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDecompositionRuleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDecompositionRule"


    // $ANTLR start "entryRuleParameter"
    // InternalGag.g:608:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalGag.g:608:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalGag.g:609:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalGag.g:615:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalGag.g:621:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalGag.g:622:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalGag.g:622:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) )
            // InternalGag.g:623:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalGag.g:623:3: ()
            // InternalGag.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalGag.g:634:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:635:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:635:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:636:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // InternalGag.g:657:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalGag.g:657:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalGag.g:658:2: iv_ruleGuard= ruleGuard EOF
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
    // InternalGag.g:664:1: ruleGuard returns [EObject current=null] : ( () otherlv_1= 'Guard' otherlv_2= '{' (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_classPath_4_0 = null;



        	enterRule();

        try {
            // InternalGag.g:670:2: ( ( () otherlv_1= 'Guard' otherlv_2= '{' (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalGag.g:671:2: ( () otherlv_1= 'Guard' otherlv_2= '{' (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalGag.g:671:2: ( () otherlv_1= 'Guard' otherlv_2= '{' (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalGag.g:672:3: () otherlv_1= 'Guard' otherlv_2= '{' (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalGag.g:672:3: ()
            // InternalGag.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getGuardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGag.g:687:3: (otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGag.g:688:4: otherlv_3= 'classPath' ( (lv_classPath_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getClassPathKeyword_3_0());
                    			
                    // InternalGag.g:692:4: ( (lv_classPath_4_0= ruleEString ) )
                    // InternalGag.g:693:5: (lv_classPath_4_0= ruleEString )
                    {
                    // InternalGag.g:693:5: (lv_classPath_4_0= ruleEString )
                    // InternalGag.g:694:6: lv_classPath_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGuardAccess().getClassPathEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_classPath_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGuardRule());
                    						}
                    						set(
                    							current,
                    							"classPath",
                    							lv_classPath_4_0,
                    							"fr.inria.gag.specification.xtext.Gag.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleSemanticRule"
    // InternalGag.g:720:1: entryRuleSemanticRule returns [EObject current=null] : iv_ruleSemanticRule= ruleSemanticRule EOF ;
    public final EObject entryRuleSemanticRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticRule = null;


        try {
            // InternalGag.g:720:53: (iv_ruleSemanticRule= ruleSemanticRule EOF )
            // InternalGag.g:721:2: iv_ruleSemanticRule= ruleSemanticRule EOF
            {
             newCompositeNode(grammarAccess.getSemanticRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemanticRule=ruleSemanticRule();

            state._fsp--;

             current =iv_ruleSemanticRule; 
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
    // $ANTLR end "entryRuleSemanticRule"


    // $ANTLR start "ruleSemanticRule"
    // InternalGag.g:727:1: ruleSemanticRule returns [EObject current=null] : ( () otherlv_1= 'SemanticRule' ) ;
    public final EObject ruleSemanticRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGag.g:733:2: ( ( () otherlv_1= 'SemanticRule' ) )
            // InternalGag.g:734:2: ( () otherlv_1= 'SemanticRule' )
            {
            // InternalGag.g:734:2: ( () otherlv_1= 'SemanticRule' )
            // InternalGag.g:735:3: () otherlv_1= 'SemanticRule'
            {
            // InternalGag.g:735:3: ()
            // InternalGag.g:736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticRuleAccess().getSemanticRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSemanticRuleAccess().getSemanticRuleKeyword_1());
            		

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
    // $ANTLR end "ruleSemanticRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020008000L});

}