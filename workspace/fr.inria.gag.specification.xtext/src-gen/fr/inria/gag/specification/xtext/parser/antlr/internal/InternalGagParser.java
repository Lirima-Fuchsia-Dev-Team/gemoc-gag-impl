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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GAG'", "'{'", "','", "'}'", "'Axiom'", "'('", "')'", "'['", "']'", "':'", "'sub'", "'guard'", "'sem'", "'location'", "'method'", "'func'", "'equations'", "'='", "';'", "'.'"
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
    // InternalGag.g:71:1: ruleGAG returns [EObject current=null] : ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleGAG() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_services_6_0 = null;



        	enterRule();

        try {
            // InternalGag.g:77:2: ( ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )? ) )
            // InternalGag.g:78:2: ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )? )
            {
            // InternalGag.g:78:2: ( () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )? )
            // InternalGag.g:79:3: () otherlv_1= 'GAG' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )?
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

            // InternalGag.g:109:3: (otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGag.g:110:4: otherlv_3= '{' ( (lv_services_4_0= ruleService ) ) (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalGag.g:114:4: ( (lv_services_4_0= ruleService ) )
                    // InternalGag.g:115:5: (lv_services_4_0= ruleService )
                    {
                    // InternalGag.g:115:5: (lv_services_4_0= ruleService )
                    // InternalGag.g:116:6: lv_services_4_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getGAGAccess().getServicesServiceParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_services_4_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGAGRule());
                    						}
                    						add(
                    							current,
                    							"services",
                    							lv_services_4_0,
                    							"fr.inria.gag.specification.xtext.Gag.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:133:4: (otherlv_5= ',' ( (lv_services_6_0= ruleService ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGag.g:134:5: otherlv_5= ',' ( (lv_services_6_0= ruleService ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getGAGAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalGag.g:138:5: ( (lv_services_6_0= ruleService ) )
                    	    // InternalGag.g:139:6: (lv_services_6_0= ruleService )
                    	    {
                    	    // InternalGag.g:139:6: (lv_services_6_0= ruleService )
                    	    // InternalGag.g:140:7: lv_services_6_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getGAGAccess().getServicesServiceParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleGAG"


    // $ANTLR start "entryRuleExpression"
    // InternalGag.g:167:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGag.g:167:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGag.g:168:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGag.g:174:1: ruleExpression returns [EObject current=null] : (this_RightPartExpression_0= ruleRightPartExpression | this_FunctionExpression_1= ruleFunctionExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RightPartExpression_0 = null;

        EObject this_FunctionExpression_1 = null;



        	enterRule();

        try {
            // InternalGag.g:180:2: ( (this_RightPartExpression_0= ruleRightPartExpression | this_FunctionExpression_1= ruleFunctionExpression ) )
            // InternalGag.g:181:2: (this_RightPartExpression_0= ruleRightPartExpression | this_FunctionExpression_1= ruleFunctionExpression )
            {
            // InternalGag.g:181:2: (this_RightPartExpression_0= ruleRightPartExpression | this_FunctionExpression_1= ruleFunctionExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    alt3=2;
                }
                else if ( (LA3_1==30) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||(LA3_2>=29 && LA3_2<=30)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==16) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGag.g:182:3: this_RightPartExpression_0= ruleRightPartExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getRightPartExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightPartExpression_0=ruleRightPartExpression();

                    state._fsp--;


                    			current = this_RightPartExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:191:3: this_FunctionExpression_1= ruleFunctionExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionExpression_1=ruleFunctionExpression();

                    state._fsp--;


                    			current = this_FunctionExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleService"
    // InternalGag.g:203:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalGag.g:203:48: (iv_ruleService= ruleService EOF )
            // InternalGag.g:204:2: iv_ruleService= ruleService EOF
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
    // InternalGag.g:210:1: ruleService returns [EObject current=null] : ( ( (lv_isAxiom_0_0= 'Axiom' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )? otherlv_12= ':' otherlv_13= '{' ( (lv_rules_14_0= ruleDecompositionRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )* otherlv_17= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_isAxiom_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inputParameters_3_0 = null;

        EObject lv_inputParameters_5_0 = null;

        EObject lv_outputParameters_8_0 = null;

        EObject lv_outputParameters_10_0 = null;

        EObject lv_rules_14_0 = null;

        EObject lv_rules_16_0 = null;



        	enterRule();

        try {
            // InternalGag.g:216:2: ( ( ( (lv_isAxiom_0_0= 'Axiom' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )? otherlv_12= ':' otherlv_13= '{' ( (lv_rules_14_0= ruleDecompositionRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )* otherlv_17= '}' ) )
            // InternalGag.g:217:2: ( ( (lv_isAxiom_0_0= 'Axiom' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )? otherlv_12= ':' otherlv_13= '{' ( (lv_rules_14_0= ruleDecompositionRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )* otherlv_17= '}' )
            {
            // InternalGag.g:217:2: ( ( (lv_isAxiom_0_0= 'Axiom' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )? otherlv_12= ':' otherlv_13= '{' ( (lv_rules_14_0= ruleDecompositionRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )* otherlv_17= '}' )
            // InternalGag.g:218:3: ( (lv_isAxiom_0_0= 'Axiom' ) )? ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )? otherlv_12= ':' otherlv_13= '{' ( (lv_rules_14_0= ruleDecompositionRule ) ) (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )* otherlv_17= '}'
            {
            // InternalGag.g:218:3: ( (lv_isAxiom_0_0= 'Axiom' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGag.g:219:4: (lv_isAxiom_0_0= 'Axiom' )
                    {
                    // InternalGag.g:219:4: (lv_isAxiom_0_0= 'Axiom' )
                    // InternalGag.g:220:5: lv_isAxiom_0_0= 'Axiom'
                    {
                    lv_isAxiom_0_0=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(lv_isAxiom_0_0, grammarAccess.getServiceAccess().getIsAxiomAxiomKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceRule());
                    					}
                    					setWithLastConsumed(current, "isAxiom", true, "Axiom");
                    				

                    }


                    }
                    break;

            }

            // InternalGag.g:232:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:233:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:233:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:234:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:251:3: (otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGag.g:252:4: otherlv_2= '(' ( (lv_inputParameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalGag.g:256:4: ( (lv_inputParameters_3_0= ruleParameter ) )
                    // InternalGag.g:257:5: (lv_inputParameters_3_0= ruleParameter )
                    {
                    // InternalGag.g:257:5: (lv_inputParameters_3_0= ruleParameter )
                    // InternalGag.g:258:6: lv_inputParameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_inputParameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"inputParameters",
                    							lv_inputParameters_3_0,
                    							"fr.inria.gag.specification.xtext.Gag.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:275:4: (otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGag.g:276:5: otherlv_4= ',' ( (lv_inputParameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalGag.g:280:5: ( (lv_inputParameters_5_0= ruleParameter ) )
                    	    // InternalGag.g:281:6: (lv_inputParameters_5_0= ruleParameter )
                    	    {
                    	    // InternalGag.g:281:6: (lv_inputParameters_5_0= ruleParameter )
                    	    // InternalGag.g:282:7: lv_inputParameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getInputParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_inputParameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputParameters",
                    	    								lv_inputParameters_5_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalGag.g:305:3: (otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGag.g:306:4: otherlv_7= '[' ( (lv_outputParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalGag.g:310:4: ( (lv_outputParameters_8_0= ruleParameter ) )
                    // InternalGag.g:311:5: (lv_outputParameters_8_0= ruleParameter )
                    {
                    // InternalGag.g:311:5: (lv_outputParameters_8_0= ruleParameter )
                    // InternalGag.g:312:6: lv_outputParameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_outputParameters_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"outputParameters",
                    							lv_outputParameters_8_0,
                    							"fr.inria.gag.specification.xtext.Gag.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:329:4: (otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGag.g:330:5: otherlv_9= ',' ( (lv_outputParameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalGag.g:334:5: ( (lv_outputParameters_10_0= ruleParameter ) )
                    	    // InternalGag.g:335:6: (lv_outputParameters_10_0= ruleParameter )
                    	    {
                    	    // InternalGag.g:335:6: (lv_outputParameters_10_0= ruleParameter )
                    	    // InternalGag.g:336:7: lv_outputParameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getOutputParametersParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_outputParameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputParameters",
                    	    								lv_outputParameters_10_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getColonKeyword_4());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGag.g:367:3: ( (lv_rules_14_0= ruleDecompositionRule ) )
            // InternalGag.g:368:4: (lv_rules_14_0= ruleDecompositionRule )
            {
            // InternalGag.g:368:4: (lv_rules_14_0= ruleDecompositionRule )
            // InternalGag.g:369:5: lv_rules_14_0= ruleDecompositionRule
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_rules_14_0=ruleDecompositionRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_14_0,
            						"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGag.g:386:3: (otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGag.g:387:4: otherlv_15= ',' ( (lv_rules_16_0= ruleDecompositionRule ) )
            	    {
            	    otherlv_15=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGag.g:391:4: ( (lv_rules_16_0= ruleDecompositionRule ) )
            	    // InternalGag.g:392:5: (lv_rules_16_0= ruleDecompositionRule )
            	    {
            	    // InternalGag.g:392:5: (lv_rules_16_0= ruleDecompositionRule )
            	    // InternalGag.g:393:6: lv_rules_16_0= ruleDecompositionRule
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getRulesDecompositionRuleParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rules_16_0=ruleDecompositionRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_16_0,
            	    							"fr.inria.gag.specification.xtext.Gag.DecompositionRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGag.g:419:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGag.g:419:47: (iv_ruleEString= ruleEString EOF )
            // InternalGag.g:420:2: iv_ruleEString= ruleEString EOF
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
    // InternalGag.g:426:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGag.g:432:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGag.g:433:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGag.g:433:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGag.g:434:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:442:3: this_ID_1= RULE_ID
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
    // InternalGag.g:453:1: entryRuleDecompositionRule returns [EObject current=null] : iv_ruleDecompositionRule= ruleDecompositionRule EOF ;
    public final EObject entryRuleDecompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionRule = null;


        try {
            // InternalGag.g:453:58: (iv_ruleDecompositionRule= ruleDecompositionRule EOF )
            // InternalGag.g:454:2: iv_ruleDecompositionRule= ruleDecompositionRule EOF
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
    // InternalGag.g:460:1: ruleDecompositionRule returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )? (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? ) ;
    public final EObject ruleDecompositionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_guard_10_0 = null;

        EObject lv_semantic_13_0 = null;



        	enterRule();

        try {
            // InternalGag.g:466:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )? (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? ) )
            // InternalGag.g:467:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )? (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? )
            {
            // InternalGag.g:467:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )? (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )? )
            // InternalGag.g:468:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )? (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )?
            {
            // InternalGag.g:468:3: ()
            // InternalGag.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionRuleAccess().getDecompositionRuleAction_0(),
            					current);
            			

            }

            // InternalGag.g:475:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:476:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:476:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:477:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecompositionRuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionRuleAccess().getColonKeyword_2());
            		
            // InternalGag.g:498:3: (otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGag.g:499:4: otherlv_3= 'sub' otherlv_4= ':' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecompositionRuleAccess().getSubKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecompositionRuleAccess().getColonKeyword_3_1());
                    			
                    // InternalGag.g:507:4: ( ( ruleEString ) )
                    // InternalGag.g:508:5: ( ruleEString )
                    {
                    // InternalGag.g:508:5: ( ruleEString )
                    // InternalGag.g:509:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:523:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==RULE_STRING) ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3==EOF||(LA11_3>=13 && LA11_3<=14)||(LA11_3>=22 && LA11_3<=23)) ) {
                                    alt11=1;
                                }


                            }
                            else if ( (LA11_2==RULE_ID) ) {
                                int LA11_4 = input.LA(3);

                                if ( (LA11_4==EOF||(LA11_4>=13 && LA11_4<=14)||(LA11_4>=22 && LA11_4<=23)) ) {
                                    alt11=1;
                                }


                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGag.g:524:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDecompositionRuleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGag.g:528:5: ( ( ruleEString ) )
                    	    // InternalGag.g:529:6: ( ruleEString )
                    	    {
                    	    // InternalGag.g:529:6: ( ruleEString )
                    	    // InternalGag.g:530:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecompositionRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSubServicesServiceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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


                    }
                    break;

            }

            // InternalGag.g:546:3: (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGag.g:547:4: otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleGuard ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getDecompositionRuleAccess().getGuardKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getDecompositionRuleAccess().getColonKeyword_4_1());
                    			
                    // InternalGag.g:555:4: ( (lv_guard_10_0= ruleGuard ) )
                    // InternalGag.g:556:5: (lv_guard_10_0= ruleGuard )
                    {
                    // InternalGag.g:556:5: (lv_guard_10_0= ruleGuard )
                    // InternalGag.g:557:6: lv_guard_10_0= ruleGuard
                    {

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getGuardGuardParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_guard_10_0=ruleGuard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecompositionRuleRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_10_0,
                    							"fr.inria.gag.specification.xtext.Gag.Guard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGag.g:575:3: (otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGag.g:576:4: otherlv_11= 'sem' otherlv_12= ':' ( (lv_semantic_13_0= ruleSemanticRule ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getDecompositionRuleAccess().getSemKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecompositionRuleAccess().getColonKeyword_5_1());
                    			
                    // InternalGag.g:584:4: ( (lv_semantic_13_0= ruleSemanticRule ) )
                    // InternalGag.g:585:5: (lv_semantic_13_0= ruleSemanticRule )
                    {
                    // InternalGag.g:585:5: (lv_semantic_13_0= ruleSemanticRule )
                    // InternalGag.g:586:6: lv_semantic_13_0= ruleSemanticRule
                    {

                    						newCompositeNode(grammarAccess.getDecompositionRuleAccess().getSemanticSemanticRuleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
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
    // InternalGag.g:615:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGag.g:621:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalGag.g:622:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalGag.g:622:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalGag.g:623:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalGag.g:623:3: ()
            // InternalGag.g:624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalGag.g:630:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGag.g:631:4: (lv_name_1_0= ruleEString )
            {
            // InternalGag.g:631:4: (lv_name_1_0= ruleEString )
            // InternalGag.g:632:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalGag.g:653:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalGag.g:653:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalGag.g:654:2: iv_ruleGuard= ruleGuard EOF
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
    // InternalGag.g:660:1: ruleGuard returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'location' otherlv_2= ':' ( (lv_location_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'method' otherlv_6= ':' ( (lv_method_7_0= ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_location_3_0 = null;

        AntlrDatatypeRuleToken lv_method_7_0 = null;



        	enterRule();

        try {
            // InternalGag.g:666:2: ( (otherlv_0= '{' otherlv_1= 'location' otherlv_2= ':' ( (lv_location_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'method' otherlv_6= ':' ( (lv_method_7_0= ruleEString ) ) otherlv_8= '}' ) )
            // InternalGag.g:667:2: (otherlv_0= '{' otherlv_1= 'location' otherlv_2= ':' ( (lv_location_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'method' otherlv_6= ':' ( (lv_method_7_0= ruleEString ) ) otherlv_8= '}' )
            {
            // InternalGag.g:667:2: (otherlv_0= '{' otherlv_1= 'location' otherlv_2= ':' ( (lv_location_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'method' otherlv_6= ':' ( (lv_method_7_0= ruleEString ) ) otherlv_8= '}' )
            // InternalGag.g:668:3: otherlv_0= '{' otherlv_1= 'location' otherlv_2= ':' ( (lv_location_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'method' otherlv_6= ':' ( (lv_method_7_0= ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLocationKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getColonKeyword_2());
            		
            // InternalGag.g:680:3: ( (lv_location_3_0= ruleEString ) )
            // InternalGag.g:681:4: (lv_location_3_0= ruleEString )
            {
            // InternalGag.g:681:4: (lv_location_3_0= ruleEString )
            // InternalGag.g:682:5: lv_location_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getLocationEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_location_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_3_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getMethodKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGuardAccess().getColonKeyword_6());
            		
            // InternalGag.g:711:3: ( (lv_method_7_0= ruleEString ) )
            // InternalGag.g:712:4: (lv_method_7_0= ruleEString )
            {
            // InternalGag.g:712:4: (lv_method_7_0= ruleEString )
            // InternalGag.g:713:5: lv_method_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getMethodEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
            lv_method_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_7_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGag.g:738:1: entryRuleSemanticRule returns [EObject current=null] : iv_ruleSemanticRule= ruleSemanticRule EOF ;
    public final EObject entryRuleSemanticRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticRule = null;


        try {
            // InternalGag.g:738:53: (iv_ruleSemanticRule= ruleSemanticRule EOF )
            // InternalGag.g:739:2: iv_ruleSemanticRule= ruleSemanticRule EOF
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
    // InternalGag.g:745:1: ruleSemanticRule returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )? (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleSemanticRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_functionDeclaration_4_0 = null;

        EObject lv_functionDeclaration_6_0 = null;

        EObject lv_equations_9_0 = null;

        EObject lv_equations_10_0 = null;



        	enterRule();

        try {
            // InternalGag.g:751:2: ( ( () otherlv_1= '{' (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )? (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )? otherlv_11= '}' ) )
            // InternalGag.g:752:2: ( () otherlv_1= '{' (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )? (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )? otherlv_11= '}' )
            {
            // InternalGag.g:752:2: ( () otherlv_1= '{' (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )? (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )? otherlv_11= '}' )
            // InternalGag.g:753:3: () otherlv_1= '{' (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )? (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )? otherlv_11= '}'
            {
            // InternalGag.g:753:3: ()
            // InternalGag.g:754:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticRuleAccess().getSemanticRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSemanticRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGag.g:764:3: (otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGag.g:765:4: otherlv_2= 'func' otherlv_3= ':' ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) ) (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getSemanticRuleAccess().getFuncKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSemanticRuleAccess().getColonKeyword_2_1());
                    			
                    // InternalGag.g:773:4: ( (lv_functionDeclaration_4_0= ruleFunctionDeclaration ) )
                    // InternalGag.g:774:5: (lv_functionDeclaration_4_0= ruleFunctionDeclaration )
                    {
                    // InternalGag.g:774:5: (lv_functionDeclaration_4_0= ruleFunctionDeclaration )
                    // InternalGag.g:775:6: lv_functionDeclaration_4_0= ruleFunctionDeclaration
                    {

                    						newCompositeNode(grammarAccess.getSemanticRuleAccess().getFunctionDeclarationFunctionDeclarationParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_functionDeclaration_4_0=ruleFunctionDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticRuleRule());
                    						}
                    						add(
                    							current,
                    							"functionDeclaration",
                    							lv_functionDeclaration_4_0,
                    							"fr.inria.gag.specification.xtext.Gag.FunctionDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:792:4: (otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGag.g:793:5: otherlv_5= ',' ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSemanticRuleAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGag.g:797:5: ( (lv_functionDeclaration_6_0= ruleFunctionDeclaration ) )
                    	    // InternalGag.g:798:6: (lv_functionDeclaration_6_0= ruleFunctionDeclaration )
                    	    {
                    	    // InternalGag.g:798:6: (lv_functionDeclaration_6_0= ruleFunctionDeclaration )
                    	    // InternalGag.g:799:7: lv_functionDeclaration_6_0= ruleFunctionDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getSemanticRuleAccess().getFunctionDeclarationFunctionDeclarationParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_functionDeclaration_6_0=ruleFunctionDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSemanticRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"functionDeclaration",
                    	    								lv_functionDeclaration_6_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.FunctionDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGag.g:818:3: (otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGag.g:819:4: otherlv_7= 'equations' otherlv_8= ':' ( (lv_equations_9_0= ruleEquation ) ) ( (lv_equations_10_0= ruleEquation ) )*
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getSemanticRuleAccess().getEquationsKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSemanticRuleAccess().getColonKeyword_3_1());
                    			
                    // InternalGag.g:827:4: ( (lv_equations_9_0= ruleEquation ) )
                    // InternalGag.g:828:5: (lv_equations_9_0= ruleEquation )
                    {
                    // InternalGag.g:828:5: (lv_equations_9_0= ruleEquation )
                    // InternalGag.g:829:6: lv_equations_9_0= ruleEquation
                    {

                    						newCompositeNode(grammarAccess.getSemanticRuleAccess().getEquationsEquationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_equations_9_0=ruleEquation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticRuleRule());
                    						}
                    						add(
                    							current,
                    							"equations",
                    							lv_equations_9_0,
                    							"fr.inria.gag.specification.xtext.Gag.Equation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:846:4: ( (lv_equations_10_0= ruleEquation ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGag.g:847:5: (lv_equations_10_0= ruleEquation )
                    	    {
                    	    // InternalGag.g:847:5: (lv_equations_10_0= ruleEquation )
                    	    // InternalGag.g:848:6: lv_equations_10_0= ruleEquation
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticRuleAccess().getEquationsEquationParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_equations_10_0=ruleEquation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSemanticRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"equations",
                    	    							lv_equations_10_0,
                    	    							"fr.inria.gag.specification.xtext.Gag.Equation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSemanticRuleAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalGag.g:874:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalGag.g:874:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalGag.g:875:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalGag.g:881:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'location' otherlv_3= ':' ( (lv_location_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'method' otherlv_7= ':' ( (lv_method_8_0= ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_location_4_0 = null;

        AntlrDatatypeRuleToken lv_method_8_0 = null;



        	enterRule();

        try {
            // InternalGag.g:887:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'location' otherlv_3= ':' ( (lv_location_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'method' otherlv_7= ':' ( (lv_method_8_0= ruleEString ) ) otherlv_9= '}' ) )
            // InternalGag.g:888:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'location' otherlv_3= ':' ( (lv_location_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'method' otherlv_7= ':' ( (lv_method_8_0= ruleEString ) ) otherlv_9= '}' )
            {
            // InternalGag.g:888:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'location' otherlv_3= ':' ( (lv_location_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'method' otherlv_7= ':' ( (lv_method_8_0= ruleEString ) ) otherlv_9= '}' )
            // InternalGag.g:889:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'location' otherlv_3= ':' ( (lv_location_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'method' otherlv_7= ':' ( (lv_method_8_0= ruleEString ) ) otherlv_9= '}'
            {
            // InternalGag.g:889:3: ( (lv_name_0_0= ruleEString ) )
            // InternalGag.g:890:4: (lv_name_0_0= ruleEString )
            {
            // InternalGag.g:890:4: (lv_name_0_0= ruleEString )
            // InternalGag.g:891:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLocationKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
            		
            // InternalGag.g:920:3: ( (lv_location_4_0= ruleEString ) )
            // InternalGag.g:921:4: (lv_location_4_0= ruleEString )
            {
            // InternalGag.g:921:4: (lv_location_4_0= ruleEString )
            // InternalGag.g:922:5: lv_location_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getLocationEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_location_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getMethodKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_7());
            		
            // InternalGag.g:951:3: ( (lv_method_8_0= ruleEString ) )
            // InternalGag.g:952:4: (lv_method_8_0= ruleEString )
            {
            // InternalGag.g:952:4: (lv_method_8_0= ruleEString )
            // InternalGag.g:953:5: lv_method_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getMethodEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_method_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_8_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleEquation"
    // InternalGag.g:978:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalGag.g:978:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalGag.g:979:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalGag.g:985:1: ruleEquation returns [EObject current=null] : ( ( (lv_leftpart_0_0= ruleRightPartExpression ) ) otherlv_1= '=' ( (lv_rightpart_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_leftpart_0_0 = null;

        EObject lv_rightpart_2_0 = null;



        	enterRule();

        try {
            // InternalGag.g:991:2: ( ( ( (lv_leftpart_0_0= ruleRightPartExpression ) ) otherlv_1= '=' ( (lv_rightpart_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalGag.g:992:2: ( ( (lv_leftpart_0_0= ruleRightPartExpression ) ) otherlv_1= '=' ( (lv_rightpart_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalGag.g:992:2: ( ( (lv_leftpart_0_0= ruleRightPartExpression ) ) otherlv_1= '=' ( (lv_rightpart_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalGag.g:993:3: ( (lv_leftpart_0_0= ruleRightPartExpression ) ) otherlv_1= '=' ( (lv_rightpart_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalGag.g:993:3: ( (lv_leftpart_0_0= ruleRightPartExpression ) )
            // InternalGag.g:994:4: (lv_leftpart_0_0= ruleRightPartExpression )
            {
            // InternalGag.g:994:4: (lv_leftpart_0_0= ruleRightPartExpression )
            // InternalGag.g:995:5: lv_leftpart_0_0= ruleRightPartExpression
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getLeftpartRightPartExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_leftpart_0_0=ruleRightPartExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"leftpart",
            						lv_leftpart_0_0,
            						"fr.inria.gag.specification.xtext.Gag.RightPartExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
            		
            // InternalGag.g:1016:3: ( (lv_rightpart_2_0= ruleExpression ) )
            // InternalGag.g:1017:4: (lv_rightpart_2_0= ruleExpression )
            {
            // InternalGag.g:1017:4: (lv_rightpart_2_0= ruleExpression )
            // InternalGag.g:1018:5: lv_rightpart_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getRightpartExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_rightpart_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"rightpart",
            						lv_rightpart_2_0,
            						"fr.inria.gag.specification.xtext.Gag.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleRightPartExpression"
    // InternalGag.g:1043:1: entryRuleRightPartExpression returns [EObject current=null] : iv_ruleRightPartExpression= ruleRightPartExpression EOF ;
    public final EObject entryRuleRightPartExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPartExpression = null;


        try {
            // InternalGag.g:1043:60: (iv_ruleRightPartExpression= ruleRightPartExpression EOF )
            // InternalGag.g:1044:2: iv_ruleRightPartExpression= ruleRightPartExpression EOF
            {
             newCompositeNode(grammarAccess.getRightPartExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightPartExpression=ruleRightPartExpression();

            state._fsp--;

             current =iv_ruleRightPartExpression; 
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
    // $ANTLR end "entryRuleRightPartExpression"


    // $ANTLR start "ruleRightPartExpression"
    // InternalGag.g:1050:1: ruleRightPartExpression returns [EObject current=null] : (this_IdExpression_0= ruleIdExpression | this_LocalData_1= ruleLocalData ) ;
    public final EObject ruleRightPartExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IdExpression_0 = null;

        EObject this_LocalData_1 = null;



        	enterRule();

        try {
            // InternalGag.g:1056:2: ( (this_IdExpression_0= ruleIdExpression | this_LocalData_1= ruleLocalData ) )
            // InternalGag.g:1057:2: (this_IdExpression_0= ruleIdExpression | this_LocalData_1= ruleLocalData )
            {
            // InternalGag.g:1057:2: (this_IdExpression_0= ruleIdExpression | this_LocalData_1= ruleLocalData )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==EOF||LA19_2==13||LA19_2==17||(LA19_2>=28 && LA19_2<=29)) ) {
                    alt19=2;
                }
                else if ( (LA19_2==30) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGag.g:1058:3: this_IdExpression_0= ruleIdExpression
                    {

                    			newCompositeNode(grammarAccess.getRightPartExpressionAccess().getIdExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdExpression_0=ruleIdExpression();

                    state._fsp--;


                    			current = this_IdExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGag.g:1067:3: this_LocalData_1= ruleLocalData
                    {

                    			newCompositeNode(grammarAccess.getRightPartExpressionAccess().getLocalDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalData_1=ruleLocalData();

                    state._fsp--;


                    			current = this_LocalData_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRightPartExpression"


    // $ANTLR start "entryRuleLocalData"
    // InternalGag.g:1079:1: entryRuleLocalData returns [EObject current=null] : iv_ruleLocalData= ruleLocalData EOF ;
    public final EObject entryRuleLocalData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalData = null;


        try {
            // InternalGag.g:1079:50: (iv_ruleLocalData= ruleLocalData EOF )
            // InternalGag.g:1080:2: iv_ruleLocalData= ruleLocalData EOF
            {
             newCompositeNode(grammarAccess.getLocalDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalData=ruleLocalData();

            state._fsp--;

             current =iv_ruleLocalData; 
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
    // $ANTLR end "entryRuleLocalData"


    // $ANTLR start "ruleLocalData"
    // InternalGag.g:1086:1: ruleLocalData returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLocalData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGag.g:1092:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGag.g:1093:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGag.g:1093:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGag.g:1094:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGag.g:1094:3: (lv_name_0_0= RULE_ID )
            // InternalGag.g:1095:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLocalDataAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLocalDataRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleLocalData"


    // $ANTLR start "entryRuleIdExpression"
    // InternalGag.g:1114:1: entryRuleIdExpression returns [EObject current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final EObject entryRuleIdExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdExpression = null;


        try {
            // InternalGag.g:1114:53: (iv_ruleIdExpression= ruleIdExpression EOF )
            // InternalGag.g:1115:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression; 
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
    // $ANTLR end "entryRuleIdExpression"


    // $ANTLR start "ruleIdExpression"
    // InternalGag.g:1121:1: ruleIdExpression returns [EObject current=null] : ( ( (lv_serviceName_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_parameterName_2_0= ruleEString ) ) ) ;
    public final EObject ruleIdExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_serviceName_0_0 = null;

        AntlrDatatypeRuleToken lv_parameterName_2_0 = null;



        	enterRule();

        try {
            // InternalGag.g:1127:2: ( ( ( (lv_serviceName_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_parameterName_2_0= ruleEString ) ) ) )
            // InternalGag.g:1128:2: ( ( (lv_serviceName_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_parameterName_2_0= ruleEString ) ) )
            {
            // InternalGag.g:1128:2: ( ( (lv_serviceName_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_parameterName_2_0= ruleEString ) ) )
            // InternalGag.g:1129:3: ( (lv_serviceName_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_parameterName_2_0= ruleEString ) )
            {
            // InternalGag.g:1129:3: ( (lv_serviceName_0_0= ruleEString ) )
            // InternalGag.g:1130:4: (lv_serviceName_0_0= ruleEString )
            {
            // InternalGag.g:1130:4: (lv_serviceName_0_0= ruleEString )
            // InternalGag.g:1131:5: lv_serviceName_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIdExpressionAccess().getServiceNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_serviceName_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdExpressionRule());
            					}
            					set(
            						current,
            						"serviceName",
            						lv_serviceName_0_0,
            						"fr.inria.gag.specification.xtext.Gag.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIdExpressionAccess().getFullStopKeyword_1());
            		
            // InternalGag.g:1152:3: ( (lv_parameterName_2_0= ruleEString ) )
            // InternalGag.g:1153:4: (lv_parameterName_2_0= ruleEString )
            {
            // InternalGag.g:1153:4: (lv_parameterName_2_0= ruleEString )
            // InternalGag.g:1154:5: lv_parameterName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIdExpressionAccess().getParameterNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdExpressionRule());
            					}
            					set(
            						current,
            						"parameterName",
            						lv_parameterName_2_0,
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
    // $ANTLR end "ruleIdExpression"


    // $ANTLR start "entryRuleFunctionExpression"
    // InternalGag.g:1175:1: entryRuleFunctionExpression returns [EObject current=null] : iv_ruleFunctionExpression= ruleFunctionExpression EOF ;
    public final EObject entryRuleFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionExpression = null;


        try {
            // InternalGag.g:1175:59: (iv_ruleFunctionExpression= ruleFunctionExpression EOF )
            // InternalGag.g:1176:2: iv_ruleFunctionExpression= ruleFunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getFunctionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionExpression=ruleFunctionExpression();

            state._fsp--;

             current =iv_ruleFunctionExpression; 
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
    // $ANTLR end "entryRuleFunctionExpression"


    // $ANTLR start "ruleFunctionExpression"
    // InternalGag.g:1182:1: ruleFunctionExpression returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalGag.g:1188:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalGag.g:1189:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalGag.g:1189:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )? otherlv_5= ')' )
            // InternalGag.g:1190:3: ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalGag.g:1190:3: ( ( ruleEString ) )
            // InternalGag.g:1191:4: ( ruleEString )
            {
            // InternalGag.g:1191:4: ( ruleEString )
            // InternalGag.g:1192:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFunctionExpressionAccess().getFunctionFunctionDeclarationCrossReference_0_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGag.g:1210:3: ( ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGag.g:1211:4: ( (lv_expressions_2_0= ruleRightPartExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )*
                    {
                    // InternalGag.g:1211:4: ( (lv_expressions_2_0= ruleRightPartExpression ) )
                    // InternalGag.g:1212:5: (lv_expressions_2_0= ruleRightPartExpression )
                    {
                    // InternalGag.g:1212:5: (lv_expressions_2_0= ruleRightPartExpression )
                    // InternalGag.g:1213:6: lv_expressions_2_0= ruleRightPartExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionExpressionAccess().getExpressionsRightPartExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_expressions_2_0=ruleRightPartExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_2_0,
                    							"fr.inria.gag.specification.xtext.Gag.RightPartExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGag.g:1230:4: (otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGag.g:1231:5: otherlv_3= ',' ( (lv_expressions_4_0= ruleRightPartExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGag.g:1235:5: ( (lv_expressions_4_0= ruleRightPartExpression ) )
                    	    // InternalGag.g:1236:6: (lv_expressions_4_0= ruleRightPartExpression )
                    	    {
                    	    // InternalGag.g:1236:6: (lv_expressions_4_0= ruleRightPartExpression )
                    	    // InternalGag.g:1237:7: lv_expressions_4_0= ruleRightPartExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionExpressionAccess().getExpressionsRightPartExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_expressions_4_0=ruleRightPartExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expressions",
                    	    								lv_expressions_4_0,
                    	    								"fr.inria.gag.specification.xtext.Gag.RightPartExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000150000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C02002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020030L});

}