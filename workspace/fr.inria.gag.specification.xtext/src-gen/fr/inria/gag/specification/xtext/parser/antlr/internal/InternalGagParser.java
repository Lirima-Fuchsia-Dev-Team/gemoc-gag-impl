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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GAG'", "'{'", "'services'", "','", "'}'", "'isAxiom'", "'Service'", "'inputParameters'", "'('", "')'", "'outputParameters'", "'rules'", "'DecompositionRule'", "'guard'", "'semantic'", "'subServices'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
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
    // InternalGag.g:186:1: ruleService returns [EObject current=null] : ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'rules' otherlv_17= '{' ( (lv_rules_18_0= ruleDecompositionRule ) ) (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
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

        EObject lv_rules_18_0 = null;

        EObject lv_rules_20_0 = null;



        	enterRule();

        try {
            // InternalGag.g:192:2: ( ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'rules' otherlv_17= '{' ( (lv_rules_18_0= ruleDecompositionRule ) ) (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalGag.g:193:2: ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'rules' otherlv_17= '{' ( (lv_rules_18_0= ruleDecompositionRule ) ) (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalGag.g:193:2: ( ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'rules' otherlv_17= '{' ( (lv_rules_18_0= ruleDecompositionRule ) ) (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalGag.g:194:3: ( (lv_isAxiom_0_0= 'isAxiom' ) ) otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'rules' otherlv_17= '{' ( (lv_rules_18_0= ruleDecompositionRule ) ) (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )* otherlv_21= '}' otherlv_22= '}'
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
            		
            // InternalGag.g:235:3: (otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGag.g:236:4: otherlv_4= 'inputParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getInputParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGag.g:244:4: ( ( ruleEString ) )
                    // InternalGag.g:245:5: ( ruleEString )
                    {
                    // InternalGag.g:245:5: ( ruleEString )
                    // InternalGag.g:246:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:260:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGag.g:261:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGag.g:265:5: ( ( ruleEString ) )
                    	    // InternalGag.g:266:6: ( ruleEString )
                    	    {
                    	    // InternalGag.g:266:6: ( ruleEString )
                    	    // InternalGag.g:267:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServiceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGag.g:287:3: (otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGag.g:288:4: otherlv_10= 'outputParameters' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getOutputParametersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGag.g:296:4: ( ( ruleEString ) )
                    // InternalGag.g:297:5: ( ruleEString )
                    {
                    // InternalGag.g:297:5: ( ruleEString )
                    // InternalGag.g:298:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:312:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGag.g:313:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGag.g:317:5: ( ( ruleEString ) )
                    	    // InternalGag.g:318:6: ( ruleEString )
                    	    {
                    	    // InternalGag.g:318:6: ( ruleEString )
                    	    // InternalGag.g:319:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServiceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getRulesKeyword_6());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGag.g:347:3: ( (lv_rules_18_0= ruleDecompositionRule ) )
            // InternalGag.g:348:4: (lv_rules_18_0= ruleDecompositionRule )
            {
            // InternalGag.g:348:4: (lv_rules_18_0= ruleDecompositionRule )
            // InternalGag.g:349:5: lv_rules_18_0= ruleDecompositionRule
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_rules_18_0=ruleDecompositionRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_18_0,
            						"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:366:3: (otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGag.g:367:4: otherlv_19= ',' ( (lv_rules_20_0= ruleDecompositionRule ) )
            	    {
            	    otherlv_19=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalGag.g:371:4: ( (lv_rules_20_0= ruleDecompositionRule ) )
            	    // InternalGag.g:372:5: (lv_rules_20_0= ruleDecompositionRule )
            	    {
            	    // InternalGag.g:372:5: (lv_rules_20_0= ruleDecompositionRule )
            	    // InternalGag.g:373:6: lv_rules_20_0= ruleDecompositionRule
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rules_20_0=ruleDecompositionRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_20_0,
            	    							"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_21=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10());
            		
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
    // InternalGag.g:403:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGag.g:403:47: (iv_ruleEString= ruleEString EOF )
            // InternalGag.g:404:2: iv_ruleEString= ruleEString EOF
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
    // InternalGag.g:410:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGag.g:416:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGag.g:417:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGag.g:417:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalGag.g:418:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:426:3: this_ID_1= RULE_ID
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
    // InternalGag.g:437:1: entryRuleDecompositionRule returns [EObject current=null] : iv_ruleDecompositionRule= ruleDecompositionRule EOF ;
    public final EObject entryRuleDecompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionRule = null;


        try {
            // InternalGag.g:437:58: (iv_ruleDecompositionRule= ruleDecompositionRule EOF )
            // InternalGag.g:438:2: iv_ruleDecompositionRule= ruleDecompositionRule EOF
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
    // InternalGag.g:444:1: ruleDecompositionRule returns [EObject current=null] : ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'guard' ( ( ruleEString ) ) )? (otherlv_6= 'semantic' ( ( ruleEString ) ) )? (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleDecompositionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalGag.g:450:2: ( ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'guard' ( ( ruleEString ) ) )? (otherlv_6= 'semantic' ( ( ruleEString ) ) )? (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalGag.g:451:2: ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'guard' ( ( ruleEString ) ) )? (otherlv_6= 'semantic' ( ( ruleEString ) ) )? (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalGag.g:451:2: ( () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'guard' ( ( ruleEString ) ) )? (otherlv_6= 'semantic' ( ( ruleEString ) ) )? (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalGag.g:452:3: () otherlv_1= 'DecompositionRule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'guard' ( ( ruleEString ) ) )? (otherlv_6= 'semantic' ( ( ruleEString ) ) )? (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // InternalGag.g:452:3: ()
            // InternalGag.g:453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionRuleAccess().getDecompositionRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionRuleAccess().getDecompositionRuleKeyword_1());
            		
            // InternalGag.g:463:3: ( (lv_name_2_0= ruleEString ) )
            // InternalGag.g:464:4: (lv_name_2_0= ruleEString )
            {
            // InternalGag.g:464:4: (lv_name_2_0= ruleEString )
            // InternalGag.g:465:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDecompositionRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGag.g:486:3: (otherlv_4= 'guard' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGag.g:487:4: otherlv_4= 'guard' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecompositionRuleAccess().getGuardKeyword_4_0());
                    			
                    // InternalGag.g:491:4: ( ( ruleEString ) )
                    // InternalGag.g:492:5: ( ruleEString )
                    {
                    // InternalGag.g:492:5: ( ruleEString )
                    // InternalGag.g:493:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getGuardGuardCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:508:3: (otherlv_6= 'semantic' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGag.g:509:4: otherlv_6= 'semantic' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDecompositionRuleAccess().getSemanticKeyword_5_0());
                    			
                    // InternalGag.g:513:4: ( ( ruleEString ) )
                    // InternalGag.g:514:5: ( ruleEString )
                    {
                    // InternalGag.g:514:5: ( ruleEString )
                    // InternalGag.g:515:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSemanticSemanticRuleCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:530:3: (otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGag.g:531:4: otherlv_8= 'subServices' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getDecompositionRuleAccess().getSubServicesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDecompositionRuleAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalGag.g:539:4: ( ( ruleEString ) )
                    // InternalGag.g:540:5: ( ruleEString )
                    {
                    // InternalGag.g:540:5: ( ruleEString )
                    // InternalGag.g:541:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:555:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGag.g:556:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDecompositionRuleAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGag.g:560:5: ( ( ruleEString ) )
                    	    // InternalGag.g:561:6: ( ruleEString )
                    	    {
                    	    // InternalGag.g:561:6: ( ruleEString )
                    	    // InternalGag.g:562:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

                    otherlv_13=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getDecompositionRuleAccess().getRightParenthesisKeyword_6_4());
                    			

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004008000L});

}