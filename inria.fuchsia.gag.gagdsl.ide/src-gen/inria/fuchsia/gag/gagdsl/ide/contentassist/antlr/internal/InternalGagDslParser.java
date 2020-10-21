package inria.fuchsia.gag.gagdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import inria.fuchsia.gag.gagdsl.services.GagDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGagDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EJavaObject'", "'Configuration'", "'{'", "'root'", "'consistent_to'", "'}'", "'Task'", "'id'", "'appliedRule'", "'instance_of'", "'sub_task'", "','", "'-'", "'Value'", "'value'", "'sub_value'", "'Rule'", "'left_hand_side'", "'right_hand_side_service'", "'('", "')'", "'guard'", "'is_open'", "'defined'"
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

    	public void setGrammarAccess(GagDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConfiguration"
    // InternalGagDsl.g:53:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalGagDsl.g:54:1: ( ruleConfiguration EOF )
            // InternalGagDsl.g:55:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGagDsl.g:62:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:66:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalGagDsl.g:67:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalGagDsl.g:67:2: ( ( rule__Configuration__Group__0 ) )
            // InternalGagDsl.g:68:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalGagDsl.g:69:3: ( rule__Configuration__Group__0 )
            // InternalGagDsl.g:69:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleTask"
    // InternalGagDsl.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalGagDsl.g:79:1: ( ruleTask EOF )
            // InternalGagDsl.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGagDsl.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalGagDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalGagDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalGagDsl.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalGagDsl.g:94:3: ( rule__Task__Group__0 )
            // InternalGagDsl.g:94:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleEString"
    // InternalGagDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGagDsl.g:104:1: ( ruleEString EOF )
            // InternalGagDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGagDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGagDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGagDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalGagDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGagDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalGagDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleELong"
    // InternalGagDsl.g:128:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalGagDsl.g:129:1: ( ruleELong EOF )
            // InternalGagDsl.g:130:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalGagDsl.g:137:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:141:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalGagDsl.g:142:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalGagDsl.g:142:2: ( ( rule__ELong__Group__0 ) )
            // InternalGagDsl.g:143:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalGagDsl.g:144:3: ( rule__ELong__Group__0 )
            // InternalGagDsl.g:144:4: rule__ELong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleValue"
    // InternalGagDsl.g:153:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGagDsl.g:154:1: ( ruleValue EOF )
            // InternalGagDsl.g:155:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGagDsl.g:162:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:166:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalGagDsl.g:167:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalGagDsl.g:167:2: ( ( rule__Value__Group__0 ) )
            // InternalGagDsl.g:168:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalGagDsl.g:169:3: ( rule__Value__Group__0 )
            // InternalGagDsl.g:169:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalGagDsl.g:178:1: entryRuleEJavaObject : ruleEJavaObject EOF ;
    public final void entryRuleEJavaObject() throws RecognitionException {
        try {
            // InternalGagDsl.g:179:1: ( ruleEJavaObject EOF )
            // InternalGagDsl.g:180:1: ruleEJavaObject EOF
            {
             before(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getEJavaObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEJavaObject"


    // $ANTLR start "ruleEJavaObject"
    // InternalGagDsl.g:187:1: ruleEJavaObject : ( 'EJavaObject' ) ;
    public final void ruleEJavaObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:191:2: ( ( 'EJavaObject' ) )
            // InternalGagDsl.g:192:2: ( 'EJavaObject' )
            {
            // InternalGagDsl.g:192:2: ( 'EJavaObject' )
            // InternalGagDsl.g:193:3: 'EJavaObject'
            {
             before(grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEJavaObject"


    // $ANTLR start "entryRuleRule"
    // InternalGagDsl.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGagDsl.g:204:1: ( ruleRule EOF )
            // InternalGagDsl.g:205:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGagDsl.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGagDsl.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGagDsl.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalGagDsl.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGagDsl.g:219:3: ( rule__Rule__Group__0 )
            // InternalGagDsl.g:219:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGagDsl.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGagDsl.g:232:2: ( RULE_STRING )
                    {
                    // InternalGagDsl.g:232:2: ( RULE_STRING )
                    // InternalGagDsl.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGagDsl.g:238:2: ( RULE_ID )
                    {
                    // InternalGagDsl.g:238:2: ( RULE_ID )
                    // InternalGagDsl.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalGagDsl.g:248:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:252:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalGagDsl.g:253:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalGagDsl.g:260:1: rule__Configuration__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:264:1: ( ( 'Configuration' ) )
            // InternalGagDsl.g:265:1: ( 'Configuration' )
            {
            // InternalGagDsl.g:265:1: ( 'Configuration' )
            // InternalGagDsl.g:266:2: 'Configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalGagDsl.g:275:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:279:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalGagDsl.g:280:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalGagDsl.g:287:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:291:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalGagDsl.g:292:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalGagDsl.g:292:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalGagDsl.g:293:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalGagDsl.g:294:2: ( rule__Configuration__NameAssignment_1 )
            // InternalGagDsl.g:294:3: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalGagDsl.g:302:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:306:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalGagDsl.g:307:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalGagDsl.g:314:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:318:1: ( ( '{' ) )
            // InternalGagDsl.g:319:1: ( '{' )
            {
            // InternalGagDsl.g:319:1: ( '{' )
            // InternalGagDsl.g:320:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // InternalGagDsl.g:329:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:333:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalGagDsl.g:334:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // InternalGagDsl.g:341:1: rule__Configuration__Group__3__Impl : ( 'root' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:345:1: ( ( 'root' ) )
            // InternalGagDsl.g:346:1: ( 'root' )
            {
            // InternalGagDsl.g:346:1: ( 'root' )
            // InternalGagDsl.g:347:2: 'root'
            {
             before(grammarAccess.getConfigurationAccess().getRootKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRootKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // InternalGagDsl.g:356:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:360:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalGagDsl.g:361:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // InternalGagDsl.g:368:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__RootAssignment_4 ) ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:372:1: ( ( ( rule__Configuration__RootAssignment_4 ) ) )
            // InternalGagDsl.g:373:1: ( ( rule__Configuration__RootAssignment_4 ) )
            {
            // InternalGagDsl.g:373:1: ( ( rule__Configuration__RootAssignment_4 ) )
            // InternalGagDsl.g:374:2: ( rule__Configuration__RootAssignment_4 )
            {
             before(grammarAccess.getConfigurationAccess().getRootAssignment_4()); 
            // InternalGagDsl.g:375:2: ( rule__Configuration__RootAssignment_4 )
            // InternalGagDsl.g:375:3: rule__Configuration__RootAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__RootAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getRootAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // InternalGagDsl.g:383:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:387:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalGagDsl.g:388:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // InternalGagDsl.g:395:1: rule__Configuration__Group__5__Impl : ( 'consistent_to' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:399:1: ( ( 'consistent_to' ) )
            // InternalGagDsl.g:400:1: ( 'consistent_to' )
            {
            // InternalGagDsl.g:400:1: ( 'consistent_to' )
            // InternalGagDsl.g:401:2: 'consistent_to'
            {
             before(grammarAccess.getConfigurationAccess().getConsistent_toKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConsistent_toKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__Configuration__Group__6"
    // InternalGagDsl.g:410:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:414:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalGagDsl.g:415:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Configuration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6"


    // $ANTLR start "rule__Configuration__Group__6__Impl"
    // InternalGagDsl.g:422:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__Consistent_toAssignment_6 ) ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:426:1: ( ( ( rule__Configuration__Consistent_toAssignment_6 ) ) )
            // InternalGagDsl.g:427:1: ( ( rule__Configuration__Consistent_toAssignment_6 ) )
            {
            // InternalGagDsl.g:427:1: ( ( rule__Configuration__Consistent_toAssignment_6 ) )
            // InternalGagDsl.g:428:2: ( rule__Configuration__Consistent_toAssignment_6 )
            {
             before(grammarAccess.getConfigurationAccess().getConsistent_toAssignment_6()); 
            // InternalGagDsl.g:429:2: ( rule__Configuration__Consistent_toAssignment_6 )
            // InternalGagDsl.g:429:3: rule__Configuration__Consistent_toAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Consistent_toAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getConsistent_toAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group__7"
    // InternalGagDsl.g:437:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:441:1: ( rule__Configuration__Group__7__Impl )
            // InternalGagDsl.g:442:2: rule__Configuration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7"


    // $ANTLR start "rule__Configuration__Group__7__Impl"
    // InternalGagDsl.g:448:1: rule__Configuration__Group__7__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:452:1: ( ( '}' ) )
            // InternalGagDsl.g:453:1: ( '}' )
            {
            // InternalGagDsl.g:453:1: ( '}' )
            // InternalGagDsl.g:454:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalGagDsl.g:464:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:468:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalGagDsl.g:469:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalGagDsl.g:476:1: rule__Task__Group__0__Impl : ( ( rule__Task__Is_openAssignment_0 )? ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:480:1: ( ( ( rule__Task__Is_openAssignment_0 )? ) )
            // InternalGagDsl.g:481:1: ( ( rule__Task__Is_openAssignment_0 )? )
            {
            // InternalGagDsl.g:481:1: ( ( rule__Task__Is_openAssignment_0 )? )
            // InternalGagDsl.g:482:2: ( rule__Task__Is_openAssignment_0 )?
            {
             before(grammarAccess.getTaskAccess().getIs_openAssignment_0()); 
            // InternalGagDsl.g:483:2: ( rule__Task__Is_openAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGagDsl.g:483:3: rule__Task__Is_openAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Is_openAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getIs_openAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalGagDsl.g:491:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:495:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalGagDsl.g:496:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalGagDsl.g:503:1: rule__Task__Group__1__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:507:1: ( ( 'Task' ) )
            // InternalGagDsl.g:508:1: ( 'Task' )
            {
            // InternalGagDsl.g:508:1: ( 'Task' )
            // InternalGagDsl.g:509:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalGagDsl.g:518:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:522:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalGagDsl.g:523:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalGagDsl.g:530:1: rule__Task__Group__2__Impl : ( ( rule__Task__NameAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:534:1: ( ( ( rule__Task__NameAssignment_2 ) ) )
            // InternalGagDsl.g:535:1: ( ( rule__Task__NameAssignment_2 ) )
            {
            // InternalGagDsl.g:535:1: ( ( rule__Task__NameAssignment_2 ) )
            // InternalGagDsl.g:536:2: ( rule__Task__NameAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_2()); 
            // InternalGagDsl.g:537:2: ( rule__Task__NameAssignment_2 )
            // InternalGagDsl.g:537:3: rule__Task__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalGagDsl.g:545:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:549:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalGagDsl.g:550:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalGagDsl.g:557:1: rule__Task__Group__3__Impl : ( '{' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:561:1: ( ( '{' ) )
            // InternalGagDsl.g:562:1: ( '{' )
            {
            // InternalGagDsl.g:562:1: ( '{' )
            // InternalGagDsl.g:563:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalGagDsl.g:572:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:576:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalGagDsl.g:577:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalGagDsl.g:584:1: rule__Task__Group__4__Impl : ( 'id' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:588:1: ( ( 'id' ) )
            // InternalGagDsl.g:589:1: ( 'id' )
            {
            // InternalGagDsl.g:589:1: ( 'id' )
            // InternalGagDsl.g:590:2: 'id'
            {
             before(grammarAccess.getTaskAccess().getIdKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalGagDsl.g:599:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:603:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalGagDsl.g:604:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalGagDsl.g:611:1: rule__Task__Group__5__Impl : ( ( rule__Task__IdAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:615:1: ( ( ( rule__Task__IdAssignment_5 ) ) )
            // InternalGagDsl.g:616:1: ( ( rule__Task__IdAssignment_5 ) )
            {
            // InternalGagDsl.g:616:1: ( ( rule__Task__IdAssignment_5 ) )
            // InternalGagDsl.g:617:2: ( rule__Task__IdAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getIdAssignment_5()); 
            // InternalGagDsl.g:618:2: ( rule__Task__IdAssignment_5 )
            // InternalGagDsl.g:618:3: rule__Task__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalGagDsl.g:626:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:630:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalGagDsl.g:631:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalGagDsl.g:638:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:642:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalGagDsl.g:643:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalGagDsl.g:643:1: ( ( rule__Task__Group_6__0 )? )
            // InternalGagDsl.g:644:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalGagDsl.g:645:2: ( rule__Task__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGagDsl.g:645:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalGagDsl.g:653:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:657:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalGagDsl.g:658:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalGagDsl.g:665:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:669:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // InternalGagDsl.g:670:1: ( ( rule__Task__Group_7__0 )? )
            {
            // InternalGagDsl.g:670:1: ( ( rule__Task__Group_7__0 )? )
            // InternalGagDsl.g:671:2: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // InternalGagDsl.g:672:2: ( rule__Task__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGagDsl.g:672:3: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalGagDsl.g:680:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:684:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalGagDsl.g:685:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalGagDsl.g:692:1: rule__Task__Group__8__Impl : ( ( rule__Task__Group_8__0 )? ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:696:1: ( ( ( rule__Task__Group_8__0 )? ) )
            // InternalGagDsl.g:697:1: ( ( rule__Task__Group_8__0 )? )
            {
            // InternalGagDsl.g:697:1: ( ( rule__Task__Group_8__0 )? )
            // InternalGagDsl.g:698:2: ( rule__Task__Group_8__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_8()); 
            // InternalGagDsl.g:699:2: ( rule__Task__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGagDsl.g:699:3: rule__Task__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalGagDsl.g:707:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:711:1: ( rule__Task__Group__9__Impl )
            // InternalGagDsl.g:712:2: rule__Task__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalGagDsl.g:718:1: rule__Task__Group__9__Impl : ( '}' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:722:1: ( ( '}' ) )
            // InternalGagDsl.g:723:1: ( '}' )
            {
            // InternalGagDsl.g:723:1: ( '}' )
            // InternalGagDsl.g:724:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalGagDsl.g:734:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:738:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalGagDsl.g:739:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalGagDsl.g:746:1: rule__Task__Group_6__0__Impl : ( 'appliedRule' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:750:1: ( ( 'appliedRule' ) )
            // InternalGagDsl.g:751:1: ( 'appliedRule' )
            {
            // InternalGagDsl.g:751:1: ( 'appliedRule' )
            // InternalGagDsl.g:752:2: 'appliedRule'
            {
             before(grammarAccess.getTaskAccess().getAppliedRuleKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAppliedRuleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalGagDsl.g:761:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:765:1: ( rule__Task__Group_6__1__Impl )
            // InternalGagDsl.g:766:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalGagDsl.g:772:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__AppliedRuleAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:776:1: ( ( ( rule__Task__AppliedRuleAssignment_6_1 ) ) )
            // InternalGagDsl.g:777:1: ( ( rule__Task__AppliedRuleAssignment_6_1 ) )
            {
            // InternalGagDsl.g:777:1: ( ( rule__Task__AppliedRuleAssignment_6_1 ) )
            // InternalGagDsl.g:778:2: ( rule__Task__AppliedRuleAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getAppliedRuleAssignment_6_1()); 
            // InternalGagDsl.g:779:2: ( rule__Task__AppliedRuleAssignment_6_1 )
            // InternalGagDsl.g:779:3: rule__Task__AppliedRuleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__AppliedRuleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAppliedRuleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_7__0"
    // InternalGagDsl.g:788:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:792:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // InternalGagDsl.g:793:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0"


    // $ANTLR start "rule__Task__Group_7__0__Impl"
    // InternalGagDsl.g:800:1: rule__Task__Group_7__0__Impl : ( 'instance_of' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:804:1: ( ( 'instance_of' ) )
            // InternalGagDsl.g:805:1: ( 'instance_of' )
            {
            // InternalGagDsl.g:805:1: ( 'instance_of' )
            // InternalGagDsl.g:806:2: 'instance_of'
            {
             before(grammarAccess.getTaskAccess().getInstance_ofKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getInstance_ofKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0__Impl"


    // $ANTLR start "rule__Task__Group_7__1"
    // InternalGagDsl.g:815:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:819:1: ( rule__Task__Group_7__1__Impl )
            // InternalGagDsl.g:820:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1"


    // $ANTLR start "rule__Task__Group_7__1__Impl"
    // InternalGagDsl.g:826:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__Instance_ofAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:830:1: ( ( ( rule__Task__Instance_ofAssignment_7_1 ) ) )
            // InternalGagDsl.g:831:1: ( ( rule__Task__Instance_ofAssignment_7_1 ) )
            {
            // InternalGagDsl.g:831:1: ( ( rule__Task__Instance_ofAssignment_7_1 ) )
            // InternalGagDsl.g:832:2: ( rule__Task__Instance_ofAssignment_7_1 )
            {
             before(grammarAccess.getTaskAccess().getInstance_ofAssignment_7_1()); 
            // InternalGagDsl.g:833:2: ( rule__Task__Instance_ofAssignment_7_1 )
            // InternalGagDsl.g:833:3: rule__Task__Instance_ofAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__Instance_ofAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getInstance_ofAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1__Impl"


    // $ANTLR start "rule__Task__Group_8__0"
    // InternalGagDsl.g:842:1: rule__Task__Group_8__0 : rule__Task__Group_8__0__Impl rule__Task__Group_8__1 ;
    public final void rule__Task__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:846:1: ( rule__Task__Group_8__0__Impl rule__Task__Group_8__1 )
            // InternalGagDsl.g:847:2: rule__Task__Group_8__0__Impl rule__Task__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__0"


    // $ANTLR start "rule__Task__Group_8__0__Impl"
    // InternalGagDsl.g:854:1: rule__Task__Group_8__0__Impl : ( 'sub_task' ) ;
    public final void rule__Task__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:858:1: ( ( 'sub_task' ) )
            // InternalGagDsl.g:859:1: ( 'sub_task' )
            {
            // InternalGagDsl.g:859:1: ( 'sub_task' )
            // InternalGagDsl.g:860:2: 'sub_task'
            {
             before(grammarAccess.getTaskAccess().getSub_taskKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSub_taskKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__0__Impl"


    // $ANTLR start "rule__Task__Group_8__1"
    // InternalGagDsl.g:869:1: rule__Task__Group_8__1 : rule__Task__Group_8__1__Impl rule__Task__Group_8__2 ;
    public final void rule__Task__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:873:1: ( rule__Task__Group_8__1__Impl rule__Task__Group_8__2 )
            // InternalGagDsl.g:874:2: rule__Task__Group_8__1__Impl rule__Task__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__1"


    // $ANTLR start "rule__Task__Group_8__1__Impl"
    // InternalGagDsl.g:881:1: rule__Task__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Task__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:885:1: ( ( '{' ) )
            // InternalGagDsl.g:886:1: ( '{' )
            {
            // InternalGagDsl.g:886:1: ( '{' )
            // InternalGagDsl.g:887:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__1__Impl"


    // $ANTLR start "rule__Task__Group_8__2"
    // InternalGagDsl.g:896:1: rule__Task__Group_8__2 : rule__Task__Group_8__2__Impl rule__Task__Group_8__3 ;
    public final void rule__Task__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:900:1: ( rule__Task__Group_8__2__Impl rule__Task__Group_8__3 )
            // InternalGagDsl.g:901:2: rule__Task__Group_8__2__Impl rule__Task__Group_8__3
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__2"


    // $ANTLR start "rule__Task__Group_8__2__Impl"
    // InternalGagDsl.g:908:1: rule__Task__Group_8__2__Impl : ( ( rule__Task__Sub_taskAssignment_8_2 ) ) ;
    public final void rule__Task__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:912:1: ( ( ( rule__Task__Sub_taskAssignment_8_2 ) ) )
            // InternalGagDsl.g:913:1: ( ( rule__Task__Sub_taskAssignment_8_2 ) )
            {
            // InternalGagDsl.g:913:1: ( ( rule__Task__Sub_taskAssignment_8_2 ) )
            // InternalGagDsl.g:914:2: ( rule__Task__Sub_taskAssignment_8_2 )
            {
             before(grammarAccess.getTaskAccess().getSub_taskAssignment_8_2()); 
            // InternalGagDsl.g:915:2: ( rule__Task__Sub_taskAssignment_8_2 )
            // InternalGagDsl.g:915:3: rule__Task__Sub_taskAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__Sub_taskAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSub_taskAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__2__Impl"


    // $ANTLR start "rule__Task__Group_8__3"
    // InternalGagDsl.g:923:1: rule__Task__Group_8__3 : rule__Task__Group_8__3__Impl rule__Task__Group_8__4 ;
    public final void rule__Task__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:927:1: ( rule__Task__Group_8__3__Impl rule__Task__Group_8__4 )
            // InternalGagDsl.g:928:2: rule__Task__Group_8__3__Impl rule__Task__Group_8__4
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__3"


    // $ANTLR start "rule__Task__Group_8__3__Impl"
    // InternalGagDsl.g:935:1: rule__Task__Group_8__3__Impl : ( ( rule__Task__Group_8_3__0 )* ) ;
    public final void rule__Task__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:939:1: ( ( ( rule__Task__Group_8_3__0 )* ) )
            // InternalGagDsl.g:940:1: ( ( rule__Task__Group_8_3__0 )* )
            {
            // InternalGagDsl.g:940:1: ( ( rule__Task__Group_8_3__0 )* )
            // InternalGagDsl.g:941:2: ( rule__Task__Group_8_3__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_8_3()); 
            // InternalGagDsl.g:942:2: ( rule__Task__Group_8_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGagDsl.g:942:3: rule__Task__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Task__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__3__Impl"


    // $ANTLR start "rule__Task__Group_8__4"
    // InternalGagDsl.g:950:1: rule__Task__Group_8__4 : rule__Task__Group_8__4__Impl ;
    public final void rule__Task__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:954:1: ( rule__Task__Group_8__4__Impl )
            // InternalGagDsl.g:955:2: rule__Task__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__4"


    // $ANTLR start "rule__Task__Group_8__4__Impl"
    // InternalGagDsl.g:961:1: rule__Task__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Task__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:965:1: ( ( '}' ) )
            // InternalGagDsl.g:966:1: ( '}' )
            {
            // InternalGagDsl.g:966:1: ( '}' )
            // InternalGagDsl.g:967:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8__4__Impl"


    // $ANTLR start "rule__Task__Group_8_3__0"
    // InternalGagDsl.g:977:1: rule__Task__Group_8_3__0 : rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1 ;
    public final void rule__Task__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:981:1: ( rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1 )
            // InternalGagDsl.g:982:2: rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8_3__0"


    // $ANTLR start "rule__Task__Group_8_3__0__Impl"
    // InternalGagDsl.g:989:1: rule__Task__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Task__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:993:1: ( ( ',' ) )
            // InternalGagDsl.g:994:1: ( ',' )
            {
            // InternalGagDsl.g:994:1: ( ',' )
            // InternalGagDsl.g:995:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_8_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8_3__0__Impl"


    // $ANTLR start "rule__Task__Group_8_3__1"
    // InternalGagDsl.g:1004:1: rule__Task__Group_8_3__1 : rule__Task__Group_8_3__1__Impl ;
    public final void rule__Task__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1008:1: ( rule__Task__Group_8_3__1__Impl )
            // InternalGagDsl.g:1009:2: rule__Task__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8_3__1"


    // $ANTLR start "rule__Task__Group_8_3__1__Impl"
    // InternalGagDsl.g:1015:1: rule__Task__Group_8_3__1__Impl : ( ( rule__Task__Sub_taskAssignment_8_3_1 ) ) ;
    public final void rule__Task__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1019:1: ( ( ( rule__Task__Sub_taskAssignment_8_3_1 ) ) )
            // InternalGagDsl.g:1020:1: ( ( rule__Task__Sub_taskAssignment_8_3_1 ) )
            {
            // InternalGagDsl.g:1020:1: ( ( rule__Task__Sub_taskAssignment_8_3_1 ) )
            // InternalGagDsl.g:1021:2: ( rule__Task__Sub_taskAssignment_8_3_1 )
            {
             before(grammarAccess.getTaskAccess().getSub_taskAssignment_8_3_1()); 
            // InternalGagDsl.g:1022:2: ( rule__Task__Sub_taskAssignment_8_3_1 )
            // InternalGagDsl.g:1022:3: rule__Task__Sub_taskAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__Sub_taskAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSub_taskAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_8_3__1__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // InternalGagDsl.g:1031:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1035:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalGagDsl.g:1036:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ELong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELong__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__0"


    // $ANTLR start "rule__ELong__Group__0__Impl"
    // InternalGagDsl.g:1043:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1047:1: ( ( ( '-' )? ) )
            // InternalGagDsl.g:1048:1: ( ( '-' )? )
            {
            // InternalGagDsl.g:1048:1: ( ( '-' )? )
            // InternalGagDsl.g:1049:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalGagDsl.g:1050:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGagDsl.g:1050:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__0__Impl"


    // $ANTLR start "rule__ELong__Group__1"
    // InternalGagDsl.g:1058:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1062:1: ( rule__ELong__Group__1__Impl )
            // InternalGagDsl.g:1063:2: rule__ELong__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__1"


    // $ANTLR start "rule__ELong__Group__1__Impl"
    // InternalGagDsl.g:1069:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1073:1: ( ( RULE_INT ) )
            // InternalGagDsl.g:1074:1: ( RULE_INT )
            {
            // InternalGagDsl.g:1074:1: ( RULE_INT )
            // InternalGagDsl.g:1075:2: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalGagDsl.g:1085:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1089:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalGagDsl.g:1090:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalGagDsl.g:1097:1: rule__Value__Group__0__Impl : ( ( rule__Value__DefinedAssignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1101:1: ( ( ( rule__Value__DefinedAssignment_0 ) ) )
            // InternalGagDsl.g:1102:1: ( ( rule__Value__DefinedAssignment_0 ) )
            {
            // InternalGagDsl.g:1102:1: ( ( rule__Value__DefinedAssignment_0 ) )
            // InternalGagDsl.g:1103:2: ( rule__Value__DefinedAssignment_0 )
            {
             before(grammarAccess.getValueAccess().getDefinedAssignment_0()); 
            // InternalGagDsl.g:1104:2: ( rule__Value__DefinedAssignment_0 )
            // InternalGagDsl.g:1104:3: rule__Value__DefinedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__DefinedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getDefinedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalGagDsl.g:1112:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1116:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalGagDsl.g:1117:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalGagDsl.g:1124:1: rule__Value__Group__1__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1128:1: ( ( 'Value' ) )
            // InternalGagDsl.g:1129:1: ( 'Value' )
            {
            // InternalGagDsl.g:1129:1: ( 'Value' )
            // InternalGagDsl.g:1130:2: 'Value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // InternalGagDsl.g:1139:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1143:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalGagDsl.g:1144:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalGagDsl.g:1151:1: rule__Value__Group__2__Impl : ( ( rule__Value__NameAssignment_2 ) ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1155:1: ( ( ( rule__Value__NameAssignment_2 ) ) )
            // InternalGagDsl.g:1156:1: ( ( rule__Value__NameAssignment_2 ) )
            {
            // InternalGagDsl.g:1156:1: ( ( rule__Value__NameAssignment_2 ) )
            // InternalGagDsl.g:1157:2: ( rule__Value__NameAssignment_2 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_2()); 
            // InternalGagDsl.g:1158:2: ( rule__Value__NameAssignment_2 )
            // InternalGagDsl.g:1158:3: rule__Value__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__3"
    // InternalGagDsl.g:1166:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1170:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalGagDsl.g:1171:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // InternalGagDsl.g:1178:1: rule__Value__Group__3__Impl : ( '{' ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1182:1: ( ( '{' ) )
            // InternalGagDsl.g:1183:1: ( '{' )
            {
            // InternalGagDsl.g:1183:1: ( '{' )
            // InternalGagDsl.g:1184:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__Value__Group__4"
    // InternalGagDsl.g:1193:1: rule__Value__Group__4 : rule__Value__Group__4__Impl rule__Value__Group__5 ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1197:1: ( rule__Value__Group__4__Impl rule__Value__Group__5 )
            // InternalGagDsl.g:1198:2: rule__Value__Group__4__Impl rule__Value__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__4"


    // $ANTLR start "rule__Value__Group__4__Impl"
    // InternalGagDsl.g:1205:1: rule__Value__Group__4__Impl : ( ( rule__Value__Group_4__0 )? ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1209:1: ( ( ( rule__Value__Group_4__0 )? ) )
            // InternalGagDsl.g:1210:1: ( ( rule__Value__Group_4__0 )? )
            {
            // InternalGagDsl.g:1210:1: ( ( rule__Value__Group_4__0 )? )
            // InternalGagDsl.g:1211:2: ( rule__Value__Group_4__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_4()); 
            // InternalGagDsl.g:1212:2: ( rule__Value__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGagDsl.g:1212:3: rule__Value__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__4__Impl"


    // $ANTLR start "rule__Value__Group__5"
    // InternalGagDsl.g:1220:1: rule__Value__Group__5 : rule__Value__Group__5__Impl rule__Value__Group__6 ;
    public final void rule__Value__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1224:1: ( rule__Value__Group__5__Impl rule__Value__Group__6 )
            // InternalGagDsl.g:1225:2: rule__Value__Group__5__Impl rule__Value__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__5"


    // $ANTLR start "rule__Value__Group__5__Impl"
    // InternalGagDsl.g:1232:1: rule__Value__Group__5__Impl : ( ( rule__Value__Group_5__0 )? ) ;
    public final void rule__Value__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1236:1: ( ( ( rule__Value__Group_5__0 )? ) )
            // InternalGagDsl.g:1237:1: ( ( rule__Value__Group_5__0 )? )
            {
            // InternalGagDsl.g:1237:1: ( ( rule__Value__Group_5__0 )? )
            // InternalGagDsl.g:1238:2: ( rule__Value__Group_5__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_5()); 
            // InternalGagDsl.g:1239:2: ( rule__Value__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGagDsl.g:1239:3: rule__Value__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__5__Impl"


    // $ANTLR start "rule__Value__Group__6"
    // InternalGagDsl.g:1247:1: rule__Value__Group__6 : rule__Value__Group__6__Impl ;
    public final void rule__Value__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1251:1: ( rule__Value__Group__6__Impl )
            // InternalGagDsl.g:1252:2: rule__Value__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__6"


    // $ANTLR start "rule__Value__Group__6__Impl"
    // InternalGagDsl.g:1258:1: rule__Value__Group__6__Impl : ( '}' ) ;
    public final void rule__Value__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1262:1: ( ( '}' ) )
            // InternalGagDsl.g:1263:1: ( '}' )
            {
            // InternalGagDsl.g:1263:1: ( '}' )
            // InternalGagDsl.g:1264:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__6__Impl"


    // $ANTLR start "rule__Value__Group_4__0"
    // InternalGagDsl.g:1274:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1278:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalGagDsl.g:1279:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Value__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0"


    // $ANTLR start "rule__Value__Group_4__0__Impl"
    // InternalGagDsl.g:1286:1: rule__Value__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1290:1: ( ( 'value' ) )
            // InternalGagDsl.g:1291:1: ( 'value' )
            {
            // InternalGagDsl.g:1291:1: ( 'value' )
            // InternalGagDsl.g:1292:2: 'value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0__Impl"


    // $ANTLR start "rule__Value__Group_4__1"
    // InternalGagDsl.g:1301:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1305:1: ( rule__Value__Group_4__1__Impl )
            // InternalGagDsl.g:1306:2: rule__Value__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1"


    // $ANTLR start "rule__Value__Group_4__1__Impl"
    // InternalGagDsl.g:1312:1: rule__Value__Group_4__1__Impl : ( ( rule__Value__ValueAssignment_4_1 ) ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1316:1: ( ( ( rule__Value__ValueAssignment_4_1 ) ) )
            // InternalGagDsl.g:1317:1: ( ( rule__Value__ValueAssignment_4_1 ) )
            {
            // InternalGagDsl.g:1317:1: ( ( rule__Value__ValueAssignment_4_1 ) )
            // InternalGagDsl.g:1318:2: ( rule__Value__ValueAssignment_4_1 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_4_1()); 
            // InternalGagDsl.g:1319:2: ( rule__Value__ValueAssignment_4_1 )
            // InternalGagDsl.g:1319:3: rule__Value__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1__Impl"


    // $ANTLR start "rule__Value__Group_5__0"
    // InternalGagDsl.g:1328:1: rule__Value__Group_5__0 : rule__Value__Group_5__0__Impl rule__Value__Group_5__1 ;
    public final void rule__Value__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1332:1: ( rule__Value__Group_5__0__Impl rule__Value__Group_5__1 )
            // InternalGagDsl.g:1333:2: rule__Value__Group_5__0__Impl rule__Value__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Value__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0"


    // $ANTLR start "rule__Value__Group_5__0__Impl"
    // InternalGagDsl.g:1340:1: rule__Value__Group_5__0__Impl : ( 'sub_value' ) ;
    public final void rule__Value__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1344:1: ( ( 'sub_value' ) )
            // InternalGagDsl.g:1345:1: ( 'sub_value' )
            {
            // InternalGagDsl.g:1345:1: ( 'sub_value' )
            // InternalGagDsl.g:1346:2: 'sub_value'
            {
             before(grammarAccess.getValueAccess().getSub_valueKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getSub_valueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0__Impl"


    // $ANTLR start "rule__Value__Group_5__1"
    // InternalGagDsl.g:1355:1: rule__Value__Group_5__1 : rule__Value__Group_5__1__Impl rule__Value__Group_5__2 ;
    public final void rule__Value__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1359:1: ( rule__Value__Group_5__1__Impl rule__Value__Group_5__2 )
            // InternalGagDsl.g:1360:2: rule__Value__Group_5__1__Impl rule__Value__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Value__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1"


    // $ANTLR start "rule__Value__Group_5__1__Impl"
    // InternalGagDsl.g:1367:1: rule__Value__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Value__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1371:1: ( ( '{' ) )
            // InternalGagDsl.g:1372:1: ( '{' )
            {
            // InternalGagDsl.g:1372:1: ( '{' )
            // InternalGagDsl.g:1373:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1__Impl"


    // $ANTLR start "rule__Value__Group_5__2"
    // InternalGagDsl.g:1382:1: rule__Value__Group_5__2 : rule__Value__Group_5__2__Impl rule__Value__Group_5__3 ;
    public final void rule__Value__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1386:1: ( rule__Value__Group_5__2__Impl rule__Value__Group_5__3 )
            // InternalGagDsl.g:1387:2: rule__Value__Group_5__2__Impl rule__Value__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2"


    // $ANTLR start "rule__Value__Group_5__2__Impl"
    // InternalGagDsl.g:1394:1: rule__Value__Group_5__2__Impl : ( ( rule__Value__Sub_valueAssignment_5_2 ) ) ;
    public final void rule__Value__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1398:1: ( ( ( rule__Value__Sub_valueAssignment_5_2 ) ) )
            // InternalGagDsl.g:1399:1: ( ( rule__Value__Sub_valueAssignment_5_2 ) )
            {
            // InternalGagDsl.g:1399:1: ( ( rule__Value__Sub_valueAssignment_5_2 ) )
            // InternalGagDsl.g:1400:2: ( rule__Value__Sub_valueAssignment_5_2 )
            {
             before(grammarAccess.getValueAccess().getSub_valueAssignment_5_2()); 
            // InternalGagDsl.g:1401:2: ( rule__Value__Sub_valueAssignment_5_2 )
            // InternalGagDsl.g:1401:3: rule__Value__Sub_valueAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Value__Sub_valueAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getSub_valueAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2__Impl"


    // $ANTLR start "rule__Value__Group_5__3"
    // InternalGagDsl.g:1409:1: rule__Value__Group_5__3 : rule__Value__Group_5__3__Impl rule__Value__Group_5__4 ;
    public final void rule__Value__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1413:1: ( rule__Value__Group_5__3__Impl rule__Value__Group_5__4 )
            // InternalGagDsl.g:1414:2: rule__Value__Group_5__3__Impl rule__Value__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3"


    // $ANTLR start "rule__Value__Group_5__3__Impl"
    // InternalGagDsl.g:1421:1: rule__Value__Group_5__3__Impl : ( ( rule__Value__Group_5_3__0 )* ) ;
    public final void rule__Value__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1425:1: ( ( ( rule__Value__Group_5_3__0 )* ) )
            // InternalGagDsl.g:1426:1: ( ( rule__Value__Group_5_3__0 )* )
            {
            // InternalGagDsl.g:1426:1: ( ( rule__Value__Group_5_3__0 )* )
            // InternalGagDsl.g:1427:2: ( rule__Value__Group_5_3__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_5_3()); 
            // InternalGagDsl.g:1428:2: ( rule__Value__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGagDsl.g:1428:3: rule__Value__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Value__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3__Impl"


    // $ANTLR start "rule__Value__Group_5__4"
    // InternalGagDsl.g:1436:1: rule__Value__Group_5__4 : rule__Value__Group_5__4__Impl ;
    public final void rule__Value__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1440:1: ( rule__Value__Group_5__4__Impl )
            // InternalGagDsl.g:1441:2: rule__Value__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__4"


    // $ANTLR start "rule__Value__Group_5__4__Impl"
    // InternalGagDsl.g:1447:1: rule__Value__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Value__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1451:1: ( ( '}' ) )
            // InternalGagDsl.g:1452:1: ( '}' )
            {
            // InternalGagDsl.g:1452:1: ( '}' )
            // InternalGagDsl.g:1453:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__4__Impl"


    // $ANTLR start "rule__Value__Group_5_3__0"
    // InternalGagDsl.g:1463:1: rule__Value__Group_5_3__0 : rule__Value__Group_5_3__0__Impl rule__Value__Group_5_3__1 ;
    public final void rule__Value__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1467:1: ( rule__Value__Group_5_3__0__Impl rule__Value__Group_5_3__1 )
            // InternalGagDsl.g:1468:2: rule__Value__Group_5_3__0__Impl rule__Value__Group_5_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Value__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5_3__0"


    // $ANTLR start "rule__Value__Group_5_3__0__Impl"
    // InternalGagDsl.g:1475:1: rule__Value__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Value__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1479:1: ( ( ',' ) )
            // InternalGagDsl.g:1480:1: ( ',' )
            {
            // InternalGagDsl.g:1480:1: ( ',' )
            // InternalGagDsl.g:1481:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5_3__0__Impl"


    // $ANTLR start "rule__Value__Group_5_3__1"
    // InternalGagDsl.g:1490:1: rule__Value__Group_5_3__1 : rule__Value__Group_5_3__1__Impl ;
    public final void rule__Value__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1494:1: ( rule__Value__Group_5_3__1__Impl )
            // InternalGagDsl.g:1495:2: rule__Value__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5_3__1"


    // $ANTLR start "rule__Value__Group_5_3__1__Impl"
    // InternalGagDsl.g:1501:1: rule__Value__Group_5_3__1__Impl : ( ( rule__Value__Sub_valueAssignment_5_3_1 ) ) ;
    public final void rule__Value__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1505:1: ( ( ( rule__Value__Sub_valueAssignment_5_3_1 ) ) )
            // InternalGagDsl.g:1506:1: ( ( rule__Value__Sub_valueAssignment_5_3_1 ) )
            {
            // InternalGagDsl.g:1506:1: ( ( rule__Value__Sub_valueAssignment_5_3_1 ) )
            // InternalGagDsl.g:1507:2: ( rule__Value__Sub_valueAssignment_5_3_1 )
            {
             before(grammarAccess.getValueAccess().getSub_valueAssignment_5_3_1()); 
            // InternalGagDsl.g:1508:2: ( rule__Value__Sub_valueAssignment_5_3_1 )
            // InternalGagDsl.g:1508:3: rule__Value__Sub_valueAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__Sub_valueAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getSub_valueAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5_3__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGagDsl.g:1517:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1521:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGagDsl.g:1522:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGagDsl.g:1529:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1533:1: ( ( 'Rule' ) )
            // InternalGagDsl.g:1534:1: ( 'Rule' )
            {
            // InternalGagDsl.g:1534:1: ( 'Rule' )
            // InternalGagDsl.g:1535:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGagDsl.g:1544:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1548:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGagDsl.g:1549:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGagDsl.g:1556:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1560:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalGagDsl.g:1561:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalGagDsl.g:1561:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalGagDsl.g:1562:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalGagDsl.g:1563:2: ( rule__Rule__NameAssignment_1 )
            // InternalGagDsl.g:1563:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGagDsl.g:1571:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1575:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGagDsl.g:1576:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGagDsl.g:1583:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1587:1: ( ( '{' ) )
            // InternalGagDsl.g:1588:1: ( '{' )
            {
            // InternalGagDsl.g:1588:1: ( '{' )
            // InternalGagDsl.g:1589:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGagDsl.g:1598:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1602:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGagDsl.g:1603:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGagDsl.g:1610:1: rule__Rule__Group__3__Impl : ( 'left_hand_side' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1614:1: ( ( 'left_hand_side' ) )
            // InternalGagDsl.g:1615:1: ( 'left_hand_side' )
            {
            // InternalGagDsl.g:1615:1: ( 'left_hand_side' )
            // InternalGagDsl.g:1616:2: 'left_hand_side'
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeft_hand_sideKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalGagDsl.g:1625:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1629:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalGagDsl.g:1630:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalGagDsl.g:1637:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Left_hand_sideAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1641:1: ( ( ( rule__Rule__Left_hand_sideAssignment_4 ) ) )
            // InternalGagDsl.g:1642:1: ( ( rule__Rule__Left_hand_sideAssignment_4 ) )
            {
            // InternalGagDsl.g:1642:1: ( ( rule__Rule__Left_hand_sideAssignment_4 ) )
            // InternalGagDsl.g:1643:2: ( rule__Rule__Left_hand_sideAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideAssignment_4()); 
            // InternalGagDsl.g:1644:2: ( rule__Rule__Left_hand_sideAssignment_4 )
            // InternalGagDsl.g:1644:3: rule__Rule__Left_hand_sideAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Left_hand_sideAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getLeft_hand_sideAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalGagDsl.g:1652:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1656:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalGagDsl.g:1657:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalGagDsl.g:1664:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1668:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalGagDsl.g:1669:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalGagDsl.g:1669:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalGagDsl.g:1670:2: ( rule__Rule__Group_5__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalGagDsl.g:1671:2: ( rule__Rule__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGagDsl.g:1671:3: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalGagDsl.g:1679:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1683:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalGagDsl.g:1684:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalGagDsl.g:1691:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1695:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalGagDsl.g:1696:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalGagDsl.g:1696:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalGagDsl.g:1697:2: ( rule__Rule__Group_6__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalGagDsl.g:1698:2: ( rule__Rule__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGagDsl.g:1698:3: rule__Rule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalGagDsl.g:1706:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1710:1: ( rule__Rule__Group__7__Impl )
            // InternalGagDsl.g:1711:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalGagDsl.g:1717:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1721:1: ( ( '}' ) )
            // InternalGagDsl.g:1722:1: ( '}' )
            {
            // InternalGagDsl.g:1722:1: ( '}' )
            // InternalGagDsl.g:1723:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalGagDsl.g:1733:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1737:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalGagDsl.g:1738:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalGagDsl.g:1745:1: rule__Rule__Group_5__0__Impl : ( 'right_hand_side_service' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1749:1: ( ( 'right_hand_side_service' ) )
            // InternalGagDsl.g:1750:1: ( 'right_hand_side_service' )
            {
            // InternalGagDsl.g:1750:1: ( 'right_hand_side_service' )
            // InternalGagDsl.g:1751:2: 'right_hand_side_service'
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalGagDsl.g:1760:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1764:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalGagDsl.g:1765:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalGagDsl.g:1772:1: rule__Rule__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1776:1: ( ( '(' ) )
            // InternalGagDsl.g:1777:1: ( '(' )
            {
            // InternalGagDsl.g:1777:1: ( '(' )
            // InternalGagDsl.g:1778:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // InternalGagDsl.g:1787:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3 ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1791:1: ( rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3 )
            // InternalGagDsl.g:1792:2: rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // InternalGagDsl.g:1799:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1803:1: ( ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) ) )
            // InternalGagDsl.g:1804:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) )
            {
            // InternalGagDsl.g:1804:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) )
            // InternalGagDsl.g:1805:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_2 )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_2()); 
            // InternalGagDsl.g:1806:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_2 )
            // InternalGagDsl.g:1806:3: rule__Rule__Right_hand_side_serviceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Right_hand_side_serviceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__Rule__Group_5__3"
    // InternalGagDsl.g:1814:1: rule__Rule__Group_5__3 : rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4 ;
    public final void rule__Rule__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1818:1: ( rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4 )
            // InternalGagDsl.g:1819:2: rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__3"


    // $ANTLR start "rule__Rule__Group_5__3__Impl"
    // InternalGagDsl.g:1826:1: rule__Rule__Group_5__3__Impl : ( ( rule__Rule__Group_5_3__0 )* ) ;
    public final void rule__Rule__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1830:1: ( ( ( rule__Rule__Group_5_3__0 )* ) )
            // InternalGagDsl.g:1831:1: ( ( rule__Rule__Group_5_3__0 )* )
            {
            // InternalGagDsl.g:1831:1: ( ( rule__Rule__Group_5_3__0 )* )
            // InternalGagDsl.g:1832:2: ( rule__Rule__Group_5_3__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5_3()); 
            // InternalGagDsl.g:1833:2: ( rule__Rule__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGagDsl.g:1833:3: rule__Rule__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__3__Impl"


    // $ANTLR start "rule__Rule__Group_5__4"
    // InternalGagDsl.g:1841:1: rule__Rule__Group_5__4 : rule__Rule__Group_5__4__Impl ;
    public final void rule__Rule__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1845:1: ( rule__Rule__Group_5__4__Impl )
            // InternalGagDsl.g:1846:2: rule__Rule__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__4"


    // $ANTLR start "rule__Rule__Group_5__4__Impl"
    // InternalGagDsl.g:1852:1: rule__Rule__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1856:1: ( ( ')' ) )
            // InternalGagDsl.g:1857:1: ( ')' )
            {
            // InternalGagDsl.g:1857:1: ( ')' )
            // InternalGagDsl.g:1858:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__4__Impl"


    // $ANTLR start "rule__Rule__Group_5_3__0"
    // InternalGagDsl.g:1868:1: rule__Rule__Group_5_3__0 : rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1 ;
    public final void rule__Rule__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1872:1: ( rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1 )
            // InternalGagDsl.g:1873:2: rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_3__0"


    // $ANTLR start "rule__Rule__Group_5_3__0__Impl"
    // InternalGagDsl.g:1880:1: rule__Rule__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1884:1: ( ( ',' ) )
            // InternalGagDsl.g:1885:1: ( ',' )
            {
            // InternalGagDsl.g:1885:1: ( ',' )
            // InternalGagDsl.g:1886:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_5_3__1"
    // InternalGagDsl.g:1895:1: rule__Rule__Group_5_3__1 : rule__Rule__Group_5_3__1__Impl ;
    public final void rule__Rule__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1899:1: ( rule__Rule__Group_5_3__1__Impl )
            // InternalGagDsl.g:1900:2: rule__Rule__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_3__1"


    // $ANTLR start "rule__Rule__Group_5_3__1__Impl"
    // InternalGagDsl.g:1906:1: rule__Rule__Group_5_3__1__Impl : ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) ) ;
    public final void rule__Rule__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1910:1: ( ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) ) )
            // InternalGagDsl.g:1911:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) )
            {
            // InternalGagDsl.g:1911:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) )
            // InternalGagDsl.g:1912:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_3_1()); 
            // InternalGagDsl.g:1913:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 )
            // InternalGagDsl.g:1913:3: rule__Rule__Right_hand_side_serviceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Right_hand_side_serviceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_3__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalGagDsl.g:1922:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1926:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalGagDsl.g:1927:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalGagDsl.g:1934:1: rule__Rule__Group_6__0__Impl : ( 'guard' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1938:1: ( ( 'guard' ) )
            // InternalGagDsl.g:1939:1: ( 'guard' )
            {
            // InternalGagDsl.g:1939:1: ( 'guard' )
            // InternalGagDsl.g:1940:2: 'guard'
            {
             before(grammarAccess.getRuleAccess().getGuardKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getGuardKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalGagDsl.g:1949:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1953:1: ( rule__Rule__Group_6__1__Impl )
            // InternalGagDsl.g:1954:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalGagDsl.g:1960:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__GuardAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1964:1: ( ( ( rule__Rule__GuardAssignment_6_1 ) ) )
            // InternalGagDsl.g:1965:1: ( ( rule__Rule__GuardAssignment_6_1 ) )
            {
            // InternalGagDsl.g:1965:1: ( ( rule__Rule__GuardAssignment_6_1 ) )
            // InternalGagDsl.g:1966:2: ( rule__Rule__GuardAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getGuardAssignment_6_1()); 
            // InternalGagDsl.g:1967:2: ( rule__Rule__GuardAssignment_6_1 )
            // InternalGagDsl.g:1967:3: rule__Rule__GuardAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__GuardAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGuardAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // InternalGagDsl.g:1976:1: rule__Configuration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1980:1: ( ( ruleEString ) )
            // InternalGagDsl.g:1981:2: ( ruleEString )
            {
            // InternalGagDsl.g:1981:2: ( ruleEString )
            // InternalGagDsl.g:1982:3: ruleEString
            {
             before(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NameAssignment_1"


    // $ANTLR start "rule__Configuration__RootAssignment_4"
    // InternalGagDsl.g:1991:1: rule__Configuration__RootAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Configuration__RootAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:1995:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:1996:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:1996:2: ( ( ruleEString ) )
            // InternalGagDsl.g:1997:3: ( ruleEString )
            {
             before(grammarAccess.getConfigurationAccess().getRootTaskCrossReference_4_0()); 
            // InternalGagDsl.g:1998:3: ( ruleEString )
            // InternalGagDsl.g:1999:4: ruleEString
            {
             before(grammarAccess.getConfigurationAccess().getRootTaskEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getRootTaskEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConfigurationAccess().getRootTaskCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__RootAssignment_4"


    // $ANTLR start "rule__Configuration__Consistent_toAssignment_6"
    // InternalGagDsl.g:2010:1: rule__Configuration__Consistent_toAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Configuration__Consistent_toAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2014:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2015:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2015:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2016:3: ( ruleEString )
            {
             before(grammarAccess.getConfigurationAccess().getConsistent_toGAGCrossReference_6_0()); 
            // InternalGagDsl.g:2017:3: ( ruleEString )
            // InternalGagDsl.g:2018:4: ruleEString
            {
             before(grammarAccess.getConfigurationAccess().getConsistent_toGAGEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConsistent_toGAGEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConfigurationAccess().getConsistent_toGAGCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Consistent_toAssignment_6"


    // $ANTLR start "rule__Task__Is_openAssignment_0"
    // InternalGagDsl.g:2029:1: rule__Task__Is_openAssignment_0 : ( ( 'is_open' ) ) ;
    public final void rule__Task__Is_openAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2033:1: ( ( ( 'is_open' ) ) )
            // InternalGagDsl.g:2034:2: ( ( 'is_open' ) )
            {
            // InternalGagDsl.g:2034:2: ( ( 'is_open' ) )
            // InternalGagDsl.g:2035:3: ( 'is_open' )
            {
             before(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 
            // InternalGagDsl.g:2036:3: ( 'is_open' )
            // InternalGagDsl.g:2037:4: 'is_open'
            {
             before(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 

            }

             after(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Is_openAssignment_0"


    // $ANTLR start "rule__Task__NameAssignment_2"
    // InternalGagDsl.g:2048:1: rule__Task__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Task__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2052:1: ( ( ruleEString ) )
            // InternalGagDsl.g:2053:2: ( ruleEString )
            {
            // InternalGagDsl.g:2053:2: ( ruleEString )
            // InternalGagDsl.g:2054:3: ruleEString
            {
             before(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_2"


    // $ANTLR start "rule__Task__IdAssignment_5"
    // InternalGagDsl.g:2063:1: rule__Task__IdAssignment_5 : ( ruleELong ) ;
    public final void rule__Task__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2067:1: ( ( ruleELong ) )
            // InternalGagDsl.g:2068:2: ( ruleELong )
            {
            // InternalGagDsl.g:2068:2: ( ruleELong )
            // InternalGagDsl.g:2069:3: ruleELong
            {
             before(grammarAccess.getTaskAccess().getIdELongParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getIdELongParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IdAssignment_5"


    // $ANTLR start "rule__Task__AppliedRuleAssignment_6_1"
    // InternalGagDsl.g:2078:1: rule__Task__AppliedRuleAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Task__AppliedRuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2082:1: ( ( ruleEString ) )
            // InternalGagDsl.g:2083:2: ( ruleEString )
            {
            // InternalGagDsl.g:2083:2: ( ruleEString )
            // InternalGagDsl.g:2084:3: ruleEString
            {
             before(grammarAccess.getTaskAccess().getAppliedRuleEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getAppliedRuleEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__AppliedRuleAssignment_6_1"


    // $ANTLR start "rule__Task__Instance_ofAssignment_7_1"
    // InternalGagDsl.g:2093:1: rule__Task__Instance_ofAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Task__Instance_ofAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2097:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2098:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2098:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2099:3: ( ruleEString )
            {
             before(grammarAccess.getTaskAccess().getInstance_ofServiceCrossReference_7_1_0()); 
            // InternalGagDsl.g:2100:3: ( ruleEString )
            // InternalGagDsl.g:2101:4: ruleEString
            {
             before(grammarAccess.getTaskAccess().getInstance_ofServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getInstance_ofServiceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getInstance_ofServiceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Instance_ofAssignment_7_1"


    // $ANTLR start "rule__Task__Sub_taskAssignment_8_2"
    // InternalGagDsl.g:2112:1: rule__Task__Sub_taskAssignment_8_2 : ( ruleTask ) ;
    public final void rule__Task__Sub_taskAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2116:1: ( ( ruleTask ) )
            // InternalGagDsl.g:2117:2: ( ruleTask )
            {
            // InternalGagDsl.g:2117:2: ( ruleTask )
            // InternalGagDsl.g:2118:3: ruleTask
            {
             before(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Sub_taskAssignment_8_2"


    // $ANTLR start "rule__Task__Sub_taskAssignment_8_3_1"
    // InternalGagDsl.g:2127:1: rule__Task__Sub_taskAssignment_8_3_1 : ( ruleTask ) ;
    public final void rule__Task__Sub_taskAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2131:1: ( ( ruleTask ) )
            // InternalGagDsl.g:2132:2: ( ruleTask )
            {
            // InternalGagDsl.g:2132:2: ( ruleTask )
            // InternalGagDsl.g:2133:3: ruleTask
            {
             before(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSub_taskTaskParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Sub_taskAssignment_8_3_1"


    // $ANTLR start "rule__Value__DefinedAssignment_0"
    // InternalGagDsl.g:2142:1: rule__Value__DefinedAssignment_0 : ( ( 'defined' ) ) ;
    public final void rule__Value__DefinedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2146:1: ( ( ( 'defined' ) ) )
            // InternalGagDsl.g:2147:2: ( ( 'defined' ) )
            {
            // InternalGagDsl.g:2147:2: ( ( 'defined' ) )
            // InternalGagDsl.g:2148:3: ( 'defined' )
            {
             before(grammarAccess.getValueAccess().getDefinedDefinedKeyword_0_0()); 
            // InternalGagDsl.g:2149:3: ( 'defined' )
            // InternalGagDsl.g:2150:4: 'defined'
            {
             before(grammarAccess.getValueAccess().getDefinedDefinedKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getDefinedDefinedKeyword_0_0()); 

            }

             after(grammarAccess.getValueAccess().getDefinedDefinedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__DefinedAssignment_0"


    // $ANTLR start "rule__Value__NameAssignment_2"
    // InternalGagDsl.g:2161:1: rule__Value__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Value__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2165:1: ( ( ruleEString ) )
            // InternalGagDsl.g:2166:2: ( ruleEString )
            {
            // InternalGagDsl.g:2166:2: ( ruleEString )
            // InternalGagDsl.g:2167:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NameAssignment_2"


    // $ANTLR start "rule__Value__ValueAssignment_4_1"
    // InternalGagDsl.g:2176:1: rule__Value__ValueAssignment_4_1 : ( ruleEJavaObject ) ;
    public final void rule__Value__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2180:1: ( ( ruleEJavaObject ) )
            // InternalGagDsl.g:2181:2: ( ruleEJavaObject )
            {
            // InternalGagDsl.g:2181:2: ( ruleEJavaObject )
            // InternalGagDsl.g:2182:3: ruleEJavaObject
            {
             before(grammarAccess.getValueAccess().getValueEJavaObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueEJavaObjectParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_4_1"


    // $ANTLR start "rule__Value__Sub_valueAssignment_5_2"
    // InternalGagDsl.g:2191:1: rule__Value__Sub_valueAssignment_5_2 : ( ruleValue ) ;
    public final void rule__Value__Sub_valueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2195:1: ( ( ruleValue ) )
            // InternalGagDsl.g:2196:2: ( ruleValue )
            {
            // InternalGagDsl.g:2196:2: ( ruleValue )
            // InternalGagDsl.g:2197:3: ruleValue
            {
             before(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Sub_valueAssignment_5_2"


    // $ANTLR start "rule__Value__Sub_valueAssignment_5_3_1"
    // InternalGagDsl.g:2206:1: rule__Value__Sub_valueAssignment_5_3_1 : ( ruleValue ) ;
    public final void rule__Value__Sub_valueAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2210:1: ( ( ruleValue ) )
            // InternalGagDsl.g:2211:2: ( ruleValue )
            {
            // InternalGagDsl.g:2211:2: ( ruleValue )
            // InternalGagDsl.g:2212:3: ruleValue
            {
             before(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getSub_valueValueParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Sub_valueAssignment_5_3_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalGagDsl.g:2221:1: rule__Rule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2225:1: ( ( ruleEString ) )
            // InternalGagDsl.g:2226:2: ( ruleEString )
            {
            // InternalGagDsl.g:2226:2: ( ruleEString )
            // InternalGagDsl.g:2227:3: ruleEString
            {
             before(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__Left_hand_sideAssignment_4"
    // InternalGagDsl.g:2236:1: rule__Rule__Left_hand_sideAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Rule__Left_hand_sideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2240:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2241:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2241:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2242:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideServiceCrossReference_4_0()); 
            // InternalGagDsl.g:2243:3: ( ruleEString )
            // InternalGagDsl.g:2244:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideServiceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getLeft_hand_sideServiceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getLeft_hand_sideServiceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Left_hand_sideAssignment_4"


    // $ANTLR start "rule__Rule__Right_hand_side_serviceAssignment_5_2"
    // InternalGagDsl.g:2255:1: rule__Rule__Right_hand_side_serviceAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Rule__Right_hand_side_serviceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2259:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2260:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2260:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2261:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_2_0()); 
            // InternalGagDsl.g:2262:3: ( ruleEString )
            // InternalGagDsl.g:2263:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Right_hand_side_serviceAssignment_5_2"


    // $ANTLR start "rule__Rule__Right_hand_side_serviceAssignment_5_3_1"
    // InternalGagDsl.g:2274:1: rule__Rule__Right_hand_side_serviceAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__Right_hand_side_serviceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2278:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2279:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2279:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2280:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_3_1_0()); 
            // InternalGagDsl.g:2281:3: ( ruleEString )
            // InternalGagDsl.g:2282:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Right_hand_side_serviceAssignment_5_3_1"


    // $ANTLR start "rule__Rule__GuardAssignment_6_1"
    // InternalGagDsl.g:2293:1: rule__Rule__GuardAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__GuardAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGagDsl.g:2297:1: ( ( ( ruleEString ) ) )
            // InternalGagDsl.g:2298:2: ( ( ruleEString ) )
            {
            // InternalGagDsl.g:2298:2: ( ( ruleEString ) )
            // InternalGagDsl.g:2299:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getGuardGuardCrossReference_6_1_0()); 
            // InternalGagDsl.g:2300:3: ( ruleEString )
            // InternalGagDsl.g:2301:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getGuardGuardEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getGuardGuardEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getGuardGuardCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__GuardAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000120010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080400000L});

}