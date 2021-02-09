package inria.fuchsia.gag.xtext.ide.contentassist.antlr.internal;

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
import inria.fuchsia.gag.xtext.services.GagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGagParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EJavaObject'", "'Process'", "'{'", "'configuration'", "'specification'", "'}'", "'Configuration'", "'root'", "'GAG'", "'rule'", "','", "'Task'", "'id'", "'appliedRule'", "'associated_to'", "'sub_task'", "'-'", "'Service'", "'input'", "'output'", "'Attribute'", "'type'", "'value'", "'Rule'", "'left_hand_side'", "'right_hand_side_service'", "'guard'", "'Guard'", "'classPath'", "'is_open'"
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

    	public void setGrammarAccess(GagGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalGag.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalGag.g:54:1: ( ruleProcess EOF )
            // InternalGag.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalGag.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalGag.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalGag.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalGag.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalGag.g:69:3: ( rule__Process__Group__0 )
            // InternalGag.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleConfiguration"
    // InternalGag.g:78:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalGag.g:79:1: ( ruleConfiguration EOF )
            // InternalGag.g:80:1: ruleConfiguration EOF
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
    // InternalGag.g:87:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:91:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalGag.g:92:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalGag.g:92:2: ( ( rule__Configuration__Group__0 ) )
            // InternalGag.g:93:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalGag.g:94:3: ( rule__Configuration__Group__0 )
            // InternalGag.g:94:4: rule__Configuration__Group__0
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


    // $ANTLR start "entryRuleGAG"
    // InternalGag.g:103:1: entryRuleGAG : ruleGAG EOF ;
    public final void entryRuleGAG() throws RecognitionException {
        try {
            // InternalGag.g:104:1: ( ruleGAG EOF )
            // InternalGag.g:105:1: ruleGAG EOF
            {
             before(grammarAccess.getGAGRule()); 
            pushFollow(FOLLOW_1);
            ruleGAG();

            state._fsp--;

             after(grammarAccess.getGAGRule()); 
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
    // $ANTLR end "entryRuleGAG"


    // $ANTLR start "ruleGAG"
    // InternalGag.g:112:1: ruleGAG : ( ( rule__GAG__Group__0 ) ) ;
    public final void ruleGAG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:116:2: ( ( ( rule__GAG__Group__0 ) ) )
            // InternalGag.g:117:2: ( ( rule__GAG__Group__0 ) )
            {
            // InternalGag.g:117:2: ( ( rule__GAG__Group__0 ) )
            // InternalGag.g:118:3: ( rule__GAG__Group__0 )
            {
             before(grammarAccess.getGAGAccess().getGroup()); 
            // InternalGag.g:119:3: ( rule__GAG__Group__0 )
            // InternalGag.g:119:4: rule__GAG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GAG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGAGAccess().getGroup()); 

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
    // $ANTLR end "ruleGAG"


    // $ANTLR start "entryRuleTask"
    // InternalGag.g:128:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalGag.g:129:1: ( ruleTask EOF )
            // InternalGag.g:130:1: ruleTask EOF
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
    // InternalGag.g:137:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:141:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalGag.g:142:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalGag.g:142:2: ( ( rule__Task__Group__0 ) )
            // InternalGag.g:143:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalGag.g:144:3: ( rule__Task__Group__0 )
            // InternalGag.g:144:4: rule__Task__Group__0
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
    // InternalGag.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGag.g:154:1: ( ruleEString EOF )
            // InternalGag.g:155:1: ruleEString EOF
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
    // InternalGag.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGag.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGag.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalGag.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGag.g:169:3: ( rule__EString__Alternatives )
            // InternalGag.g:169:4: rule__EString__Alternatives
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
    // InternalGag.g:178:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalGag.g:179:1: ( ruleELong EOF )
            // InternalGag.g:180:1: ruleELong EOF
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
    // InternalGag.g:187:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:191:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalGag.g:192:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalGag.g:192:2: ( ( rule__ELong__Group__0 ) )
            // InternalGag.g:193:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalGag.g:194:3: ( rule__ELong__Group__0 )
            // InternalGag.g:194:4: rule__ELong__Group__0
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


    // $ANTLR start "entryRuleService"
    // InternalGag.g:203:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalGag.g:204:1: ( ruleService EOF )
            // InternalGag.g:205:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalGag.g:212:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:216:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalGag.g:217:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalGag.g:217:2: ( ( rule__Service__Group__0 ) )
            // InternalGag.g:218:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalGag.g:219:3: ( rule__Service__Group__0 )
            // InternalGag.g:219:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAttribute"
    // InternalGag.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalGag.g:229:1: ( ruleAttribute EOF )
            // InternalGag.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalGag.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalGag.g:242:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalGag.g:242:2: ( ( rule__Attribute__Group__0 ) )
            // InternalGag.g:243:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalGag.g:244:3: ( rule__Attribute__Group__0 )
            // InternalGag.g:244:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEJavaObject"
    // InternalGag.g:253:1: entryRuleEJavaObject : ruleEJavaObject EOF ;
    public final void entryRuleEJavaObject() throws RecognitionException {
        try {
            // InternalGag.g:254:1: ( ruleEJavaObject EOF )
            // InternalGag.g:255:1: ruleEJavaObject EOF
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
    // InternalGag.g:262:1: ruleEJavaObject : ( 'EJavaObject' ) ;
    public final void ruleEJavaObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:266:2: ( ( 'EJavaObject' ) )
            // InternalGag.g:267:2: ( 'EJavaObject' )
            {
            // InternalGag.g:267:2: ( 'EJavaObject' )
            // InternalGag.g:268:3: 'EJavaObject'
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
    // InternalGag.g:278:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGag.g:279:1: ( ruleRule EOF )
            // InternalGag.g:280:1: ruleRule EOF
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
    // InternalGag.g:287:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:291:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGag.g:292:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGag.g:292:2: ( ( rule__Rule__Group__0 ) )
            // InternalGag.g:293:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGag.g:294:3: ( rule__Rule__Group__0 )
            // InternalGag.g:294:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleGuard"
    // InternalGag.g:303:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // InternalGag.g:304:1: ( ruleGuard EOF )
            // InternalGag.g:305:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalGag.g:312:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:316:2: ( ( ( rule__Guard__Group__0 ) ) )
            // InternalGag.g:317:2: ( ( rule__Guard__Group__0 ) )
            {
            // InternalGag.g:317:2: ( ( rule__Guard__Group__0 ) )
            // InternalGag.g:318:3: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // InternalGag.g:319:3: ( rule__Guard__Group__0 )
            // InternalGag.g:319:4: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGag.g:327:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:331:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalGag.g:332:2: ( RULE_STRING )
                    {
                    // InternalGag.g:332:2: ( RULE_STRING )
                    // InternalGag.g:333:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGag.g:338:2: ( RULE_ID )
                    {
                    // InternalGag.g:338:2: ( RULE_ID )
                    // InternalGag.g:339:3: RULE_ID
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


    // $ANTLR start "rule__Process__Group__0"
    // InternalGag.g:348:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:352:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalGag.g:353:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalGag.g:360:1: rule__Process__Group__0__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:364:1: ( ( 'Process' ) )
            // InternalGag.g:365:1: ( 'Process' )
            {
            // InternalGag.g:365:1: ( 'Process' )
            // InternalGag.g:366:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalGag.g:375:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:379:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalGag.g:380:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalGag.g:387:1: rule__Process__Group__1__Impl : ( '{' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:391:1: ( ( '{' ) )
            // InternalGag.g:392:1: ( '{' )
            {
            // InternalGag.g:392:1: ( '{' )
            // InternalGag.g:393:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalGag.g:402:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:406:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalGag.g:407:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalGag.g:414:1: rule__Process__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:418:1: ( ( 'configuration' ) )
            // InternalGag.g:419:1: ( 'configuration' )
            {
            // InternalGag.g:419:1: ( 'configuration' )
            // InternalGag.g:420:2: 'configuration'
            {
             before(grammarAccess.getProcessAccess().getConfigurationKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getConfigurationKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalGag.g:429:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:433:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalGag.g:434:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalGag.g:441:1: rule__Process__Group__3__Impl : ( ( rule__Process__ConfigurationAssignment_3 ) ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:445:1: ( ( ( rule__Process__ConfigurationAssignment_3 ) ) )
            // InternalGag.g:446:1: ( ( rule__Process__ConfigurationAssignment_3 ) )
            {
            // InternalGag.g:446:1: ( ( rule__Process__ConfigurationAssignment_3 ) )
            // InternalGag.g:447:2: ( rule__Process__ConfigurationAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getConfigurationAssignment_3()); 
            // InternalGag.g:448:2: ( rule__Process__ConfigurationAssignment_3 )
            // InternalGag.g:448:3: rule__Process__ConfigurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Process__ConfigurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getConfigurationAssignment_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalGag.g:456:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:460:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalGag.g:461:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalGag.g:468:1: rule__Process__Group__4__Impl : ( 'specification' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:472:1: ( ( 'specification' ) )
            // InternalGag.g:473:1: ( 'specification' )
            {
            // InternalGag.g:473:1: ( 'specification' )
            // InternalGag.g:474:2: 'specification'
            {
             before(grammarAccess.getProcessAccess().getSpecificationKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSpecificationKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalGag.g:483:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:487:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalGag.g:488:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalGag.g:495:1: rule__Process__Group__5__Impl : ( ( rule__Process__SpecificationAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:499:1: ( ( ( rule__Process__SpecificationAssignment_5 ) ) )
            // InternalGag.g:500:1: ( ( rule__Process__SpecificationAssignment_5 ) )
            {
            // InternalGag.g:500:1: ( ( rule__Process__SpecificationAssignment_5 ) )
            // InternalGag.g:501:2: ( rule__Process__SpecificationAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getSpecificationAssignment_5()); 
            // InternalGag.g:502:2: ( rule__Process__SpecificationAssignment_5 )
            // InternalGag.g:502:3: rule__Process__SpecificationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__SpecificationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getSpecificationAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalGag.g:510:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:514:1: ( rule__Process__Group__6__Impl )
            // InternalGag.g:515:2: rule__Process__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__6__Impl();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalGag.g:521:1: rule__Process__Group__6__Impl : ( '}' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:525:1: ( ( '}' ) )
            // InternalGag.g:526:1: ( '}' )
            {
            // InternalGag.g:526:1: ( '}' )
            // InternalGag.g:527:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalGag.g:537:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:541:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalGag.g:542:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGag.g:549:1: rule__Configuration__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:553:1: ( ( 'Configuration' ) )
            // InternalGag.g:554:1: ( 'Configuration' )
            {
            // InternalGag.g:554:1: ( 'Configuration' )
            // InternalGag.g:555:2: 'Configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGag.g:564:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:568:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalGag.g:569:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGag.g:576:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:580:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalGag.g:581:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalGag.g:581:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalGag.g:582:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalGag.g:583:2: ( rule__Configuration__NameAssignment_1 )
            // InternalGag.g:583:3: rule__Configuration__NameAssignment_1
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
    // InternalGag.g:591:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:595:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalGag.g:596:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGag.g:603:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:607:1: ( ( '{' ) )
            // InternalGag.g:608:1: ( '{' )
            {
            // InternalGag.g:608:1: ( '{' )
            // InternalGag.g:609:2: '{'
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
    // InternalGag.g:618:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:622:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalGag.g:623:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGag.g:630:1: rule__Configuration__Group__3__Impl : ( 'root' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:634:1: ( ( 'root' ) )
            // InternalGag.g:635:1: ( 'root' )
            {
            // InternalGag.g:635:1: ( 'root' )
            // InternalGag.g:636:2: 'root'
            {
             before(grammarAccess.getConfigurationAccess().getRootKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGag.g:645:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:649:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalGag.g:650:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalGag.g:657:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__RootAssignment_4 ) ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:661:1: ( ( ( rule__Configuration__RootAssignment_4 ) ) )
            // InternalGag.g:662:1: ( ( rule__Configuration__RootAssignment_4 ) )
            {
            // InternalGag.g:662:1: ( ( rule__Configuration__RootAssignment_4 ) )
            // InternalGag.g:663:2: ( rule__Configuration__RootAssignment_4 )
            {
             before(grammarAccess.getConfigurationAccess().getRootAssignment_4()); 
            // InternalGag.g:664:2: ( rule__Configuration__RootAssignment_4 )
            // InternalGag.g:664:3: rule__Configuration__RootAssignment_4
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
    // InternalGag.g:672:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:676:1: ( rule__Configuration__Group__5__Impl )
            // InternalGag.g:677:2: rule__Configuration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__5__Impl();

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
    // InternalGag.g:683:1: rule__Configuration__Group__5__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:687:1: ( ( '}' ) )
            // InternalGag.g:688:1: ( '}' )
            {
            // InternalGag.g:688:1: ( '}' )
            // InternalGag.g:689:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__GAG__Group__0"
    // InternalGag.g:699:1: rule__GAG__Group__0 : rule__GAG__Group__0__Impl rule__GAG__Group__1 ;
    public final void rule__GAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:703:1: ( rule__GAG__Group__0__Impl rule__GAG__Group__1 )
            // InternalGag.g:704:2: rule__GAG__Group__0__Impl rule__GAG__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GAG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__1();

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
    // $ANTLR end "rule__GAG__Group__0"


    // $ANTLR start "rule__GAG__Group__0__Impl"
    // InternalGag.g:711:1: rule__GAG__Group__0__Impl : ( 'GAG' ) ;
    public final void rule__GAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:715:1: ( ( 'GAG' ) )
            // InternalGag.g:716:1: ( 'GAG' )
            {
            // InternalGag.g:716:1: ( 'GAG' )
            // InternalGag.g:717:2: 'GAG'
            {
             before(grammarAccess.getGAGAccess().getGAGKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getGAGKeyword_0()); 

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
    // $ANTLR end "rule__GAG__Group__0__Impl"


    // $ANTLR start "rule__GAG__Group__1"
    // InternalGag.g:726:1: rule__GAG__Group__1 : rule__GAG__Group__1__Impl rule__GAG__Group__2 ;
    public final void rule__GAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:730:1: ( rule__GAG__Group__1__Impl rule__GAG__Group__2 )
            // InternalGag.g:731:2: rule__GAG__Group__1__Impl rule__GAG__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GAG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__2();

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
    // $ANTLR end "rule__GAG__Group__1"


    // $ANTLR start "rule__GAG__Group__1__Impl"
    // InternalGag.g:738:1: rule__GAG__Group__1__Impl : ( ( rule__GAG__NameAssignment_1 ) ) ;
    public final void rule__GAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:742:1: ( ( ( rule__GAG__NameAssignment_1 ) ) )
            // InternalGag.g:743:1: ( ( rule__GAG__NameAssignment_1 ) )
            {
            // InternalGag.g:743:1: ( ( rule__GAG__NameAssignment_1 ) )
            // InternalGag.g:744:2: ( rule__GAG__NameAssignment_1 )
            {
             before(grammarAccess.getGAGAccess().getNameAssignment_1()); 
            // InternalGag.g:745:2: ( rule__GAG__NameAssignment_1 )
            // InternalGag.g:745:3: rule__GAG__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GAG__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGAGAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GAG__Group__1__Impl"


    // $ANTLR start "rule__GAG__Group__2"
    // InternalGag.g:753:1: rule__GAG__Group__2 : rule__GAG__Group__2__Impl rule__GAG__Group__3 ;
    public final void rule__GAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:757:1: ( rule__GAG__Group__2__Impl rule__GAG__Group__3 )
            // InternalGag.g:758:2: rule__GAG__Group__2__Impl rule__GAG__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GAG__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__3();

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
    // $ANTLR end "rule__GAG__Group__2"


    // $ANTLR start "rule__GAG__Group__2__Impl"
    // InternalGag.g:765:1: rule__GAG__Group__2__Impl : ( '{' ) ;
    public final void rule__GAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:769:1: ( ( '{' ) )
            // InternalGag.g:770:1: ( '{' )
            {
            // InternalGag.g:770:1: ( '{' )
            // InternalGag.g:771:2: '{'
            {
             before(grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GAG__Group__2__Impl"


    // $ANTLR start "rule__GAG__Group__3"
    // InternalGag.g:780:1: rule__GAG__Group__3 : rule__GAG__Group__3__Impl rule__GAG__Group__4 ;
    public final void rule__GAG__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:784:1: ( rule__GAG__Group__3__Impl rule__GAG__Group__4 )
            // InternalGag.g:785:2: rule__GAG__Group__3__Impl rule__GAG__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GAG__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__4();

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
    // $ANTLR end "rule__GAG__Group__3"


    // $ANTLR start "rule__GAG__Group__3__Impl"
    // InternalGag.g:792:1: rule__GAG__Group__3__Impl : ( 'rule' ) ;
    public final void rule__GAG__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:796:1: ( ( 'rule' ) )
            // InternalGag.g:797:1: ( 'rule' )
            {
            // InternalGag.g:797:1: ( 'rule' )
            // InternalGag.g:798:2: 'rule'
            {
             before(grammarAccess.getGAGAccess().getRuleKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getRuleKeyword_3()); 

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
    // $ANTLR end "rule__GAG__Group__3__Impl"


    // $ANTLR start "rule__GAG__Group__4"
    // InternalGag.g:807:1: rule__GAG__Group__4 : rule__GAG__Group__4__Impl rule__GAG__Group__5 ;
    public final void rule__GAG__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:811:1: ( rule__GAG__Group__4__Impl rule__GAG__Group__5 )
            // InternalGag.g:812:2: rule__GAG__Group__4__Impl rule__GAG__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__GAG__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__5();

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
    // $ANTLR end "rule__GAG__Group__4"


    // $ANTLR start "rule__GAG__Group__4__Impl"
    // InternalGag.g:819:1: rule__GAG__Group__4__Impl : ( '{' ) ;
    public final void rule__GAG__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:823:1: ( ( '{' ) )
            // InternalGag.g:824:1: ( '{' )
            {
            // InternalGag.g:824:1: ( '{' )
            // InternalGag.g:825:2: '{'
            {
             before(grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__GAG__Group__4__Impl"


    // $ANTLR start "rule__GAG__Group__5"
    // InternalGag.g:834:1: rule__GAG__Group__5 : rule__GAG__Group__5__Impl rule__GAG__Group__6 ;
    public final void rule__GAG__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:838:1: ( rule__GAG__Group__5__Impl rule__GAG__Group__6 )
            // InternalGag.g:839:2: rule__GAG__Group__5__Impl rule__GAG__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__GAG__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__6();

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
    // $ANTLR end "rule__GAG__Group__5"


    // $ANTLR start "rule__GAG__Group__5__Impl"
    // InternalGag.g:846:1: rule__GAG__Group__5__Impl : ( ( rule__GAG__RuleAssignment_5 ) ) ;
    public final void rule__GAG__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:850:1: ( ( ( rule__GAG__RuleAssignment_5 ) ) )
            // InternalGag.g:851:1: ( ( rule__GAG__RuleAssignment_5 ) )
            {
            // InternalGag.g:851:1: ( ( rule__GAG__RuleAssignment_5 ) )
            // InternalGag.g:852:2: ( rule__GAG__RuleAssignment_5 )
            {
             before(grammarAccess.getGAGAccess().getRuleAssignment_5()); 
            // InternalGag.g:853:2: ( rule__GAG__RuleAssignment_5 )
            // InternalGag.g:853:3: rule__GAG__RuleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GAG__RuleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGAGAccess().getRuleAssignment_5()); 

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
    // $ANTLR end "rule__GAG__Group__5__Impl"


    // $ANTLR start "rule__GAG__Group__6"
    // InternalGag.g:861:1: rule__GAG__Group__6 : rule__GAG__Group__6__Impl rule__GAG__Group__7 ;
    public final void rule__GAG__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:865:1: ( rule__GAG__Group__6__Impl rule__GAG__Group__7 )
            // InternalGag.g:866:2: rule__GAG__Group__6__Impl rule__GAG__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__GAG__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__7();

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
    // $ANTLR end "rule__GAG__Group__6"


    // $ANTLR start "rule__GAG__Group__6__Impl"
    // InternalGag.g:873:1: rule__GAG__Group__6__Impl : ( ( rule__GAG__Group_6__0 )* ) ;
    public final void rule__GAG__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:877:1: ( ( ( rule__GAG__Group_6__0 )* ) )
            // InternalGag.g:878:1: ( ( rule__GAG__Group_6__0 )* )
            {
            // InternalGag.g:878:1: ( ( rule__GAG__Group_6__0 )* )
            // InternalGag.g:879:2: ( rule__GAG__Group_6__0 )*
            {
             before(grammarAccess.getGAGAccess().getGroup_6()); 
            // InternalGag.g:880:2: ( rule__GAG__Group_6__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGag.g:880:3: rule__GAG__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GAG__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGAGAccess().getGroup_6()); 

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
    // $ANTLR end "rule__GAG__Group__6__Impl"


    // $ANTLR start "rule__GAG__Group__7"
    // InternalGag.g:888:1: rule__GAG__Group__7 : rule__GAG__Group__7__Impl rule__GAG__Group__8 ;
    public final void rule__GAG__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:892:1: ( rule__GAG__Group__7__Impl rule__GAG__Group__8 )
            // InternalGag.g:893:2: rule__GAG__Group__7__Impl rule__GAG__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__GAG__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group__8();

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
    // $ANTLR end "rule__GAG__Group__7"


    // $ANTLR start "rule__GAG__Group__7__Impl"
    // InternalGag.g:900:1: rule__GAG__Group__7__Impl : ( '}' ) ;
    public final void rule__GAG__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:904:1: ( ( '}' ) )
            // InternalGag.g:905:1: ( '}' )
            {
            // InternalGag.g:905:1: ( '}' )
            // InternalGag.g:906:2: '}'
            {
             before(grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__GAG__Group__7__Impl"


    // $ANTLR start "rule__GAG__Group__8"
    // InternalGag.g:915:1: rule__GAG__Group__8 : rule__GAG__Group__8__Impl ;
    public final void rule__GAG__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:919:1: ( rule__GAG__Group__8__Impl )
            // InternalGag.g:920:2: rule__GAG__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAG__Group__8__Impl();

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
    // $ANTLR end "rule__GAG__Group__8"


    // $ANTLR start "rule__GAG__Group__8__Impl"
    // InternalGag.g:926:1: rule__GAG__Group__8__Impl : ( '}' ) ;
    public final void rule__GAG__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:930:1: ( ( '}' ) )
            // InternalGag.g:931:1: ( '}' )
            {
            // InternalGag.g:931:1: ( '}' )
            // InternalGag.g:932:2: '}'
            {
             before(grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__GAG__Group__8__Impl"


    // $ANTLR start "rule__GAG__Group_6__0"
    // InternalGag.g:942:1: rule__GAG__Group_6__0 : rule__GAG__Group_6__0__Impl rule__GAG__Group_6__1 ;
    public final void rule__GAG__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:946:1: ( rule__GAG__Group_6__0__Impl rule__GAG__Group_6__1 )
            // InternalGag.g:947:2: rule__GAG__Group_6__0__Impl rule__GAG__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__GAG__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GAG__Group_6__1();

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
    // $ANTLR end "rule__GAG__Group_6__0"


    // $ANTLR start "rule__GAG__Group_6__0__Impl"
    // InternalGag.g:954:1: rule__GAG__Group_6__0__Impl : ( ',' ) ;
    public final void rule__GAG__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:958:1: ( ( ',' ) )
            // InternalGag.g:959:1: ( ',' )
            {
            // InternalGag.g:959:1: ( ',' )
            // InternalGag.g:960:2: ','
            {
             before(grammarAccess.getGAGAccess().getCommaKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGAGAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__GAG__Group_6__0__Impl"


    // $ANTLR start "rule__GAG__Group_6__1"
    // InternalGag.g:969:1: rule__GAG__Group_6__1 : rule__GAG__Group_6__1__Impl ;
    public final void rule__GAG__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:973:1: ( rule__GAG__Group_6__1__Impl )
            // InternalGag.g:974:2: rule__GAG__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAG__Group_6__1__Impl();

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
    // $ANTLR end "rule__GAG__Group_6__1"


    // $ANTLR start "rule__GAG__Group_6__1__Impl"
    // InternalGag.g:980:1: rule__GAG__Group_6__1__Impl : ( ( rule__GAG__RuleAssignment_6_1 ) ) ;
    public final void rule__GAG__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:984:1: ( ( ( rule__GAG__RuleAssignment_6_1 ) ) )
            // InternalGag.g:985:1: ( ( rule__GAG__RuleAssignment_6_1 ) )
            {
            // InternalGag.g:985:1: ( ( rule__GAG__RuleAssignment_6_1 ) )
            // InternalGag.g:986:2: ( rule__GAG__RuleAssignment_6_1 )
            {
             before(grammarAccess.getGAGAccess().getRuleAssignment_6_1()); 
            // InternalGag.g:987:2: ( rule__GAG__RuleAssignment_6_1 )
            // InternalGag.g:987:3: rule__GAG__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__GAG__RuleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGAGAccess().getRuleAssignment_6_1()); 

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
    // $ANTLR end "rule__GAG__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalGag.g:996:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1000:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalGag.g:1001:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGag.g:1008:1: rule__Task__Group__0__Impl : ( ( rule__Task__Is_openAssignment_0 )? ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1012:1: ( ( ( rule__Task__Is_openAssignment_0 )? ) )
            // InternalGag.g:1013:1: ( ( rule__Task__Is_openAssignment_0 )? )
            {
            // InternalGag.g:1013:1: ( ( rule__Task__Is_openAssignment_0 )? )
            // InternalGag.g:1014:2: ( rule__Task__Is_openAssignment_0 )?
            {
             before(grammarAccess.getTaskAccess().getIs_openAssignment_0()); 
            // InternalGag.g:1015:2: ( rule__Task__Is_openAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGag.g:1015:3: rule__Task__Is_openAssignment_0
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
    // InternalGag.g:1023:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1027:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalGag.g:1028:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGag.g:1035:1: rule__Task__Group__1__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1039:1: ( ( 'Task' ) )
            // InternalGag.g:1040:1: ( 'Task' )
            {
            // InternalGag.g:1040:1: ( 'Task' )
            // InternalGag.g:1041:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGag.g:1050:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1054:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalGag.g:1055:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalGag.g:1062:1: rule__Task__Group__2__Impl : ( ( rule__Task__NameAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1066:1: ( ( ( rule__Task__NameAssignment_2 ) ) )
            // InternalGag.g:1067:1: ( ( rule__Task__NameAssignment_2 ) )
            {
            // InternalGag.g:1067:1: ( ( rule__Task__NameAssignment_2 ) )
            // InternalGag.g:1068:2: ( rule__Task__NameAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_2()); 
            // InternalGag.g:1069:2: ( rule__Task__NameAssignment_2 )
            // InternalGag.g:1069:3: rule__Task__NameAssignment_2
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
    // InternalGag.g:1077:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1081:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalGag.g:1082:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGag.g:1089:1: rule__Task__Group__3__Impl : ( '{' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1093:1: ( ( '{' ) )
            // InternalGag.g:1094:1: ( '{' )
            {
            // InternalGag.g:1094:1: ( '{' )
            // InternalGag.g:1095:2: '{'
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
    // InternalGag.g:1104:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1108:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalGag.g:1109:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGag.g:1116:1: rule__Task__Group__4__Impl : ( 'id' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1120:1: ( ( 'id' ) )
            // InternalGag.g:1121:1: ( 'id' )
            {
            // InternalGag.g:1121:1: ( 'id' )
            // InternalGag.g:1122:2: 'id'
            {
             before(grammarAccess.getTaskAccess().getIdKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGag.g:1131:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1135:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalGag.g:1136:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGag.g:1143:1: rule__Task__Group__5__Impl : ( ( rule__Task__IdAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1147:1: ( ( ( rule__Task__IdAssignment_5 ) ) )
            // InternalGag.g:1148:1: ( ( rule__Task__IdAssignment_5 ) )
            {
            // InternalGag.g:1148:1: ( ( rule__Task__IdAssignment_5 ) )
            // InternalGag.g:1149:2: ( rule__Task__IdAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getIdAssignment_5()); 
            // InternalGag.g:1150:2: ( rule__Task__IdAssignment_5 )
            // InternalGag.g:1150:3: rule__Task__IdAssignment_5
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
    // InternalGag.g:1158:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1162:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalGag.g:1163:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalGag.g:1170:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1174:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalGag.g:1175:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalGag.g:1175:1: ( ( rule__Task__Group_6__0 )? )
            // InternalGag.g:1176:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalGag.g:1177:2: ( rule__Task__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGag.g:1177:3: rule__Task__Group_6__0
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
    // InternalGag.g:1185:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1189:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalGag.g:1190:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalGag.g:1197:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1201:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // InternalGag.g:1202:1: ( ( rule__Task__Group_7__0 )? )
            {
            // InternalGag.g:1202:1: ( ( rule__Task__Group_7__0 )? )
            // InternalGag.g:1203:2: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // InternalGag.g:1204:2: ( rule__Task__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGag.g:1204:3: rule__Task__Group_7__0
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
    // InternalGag.g:1212:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1216:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalGag.g:1217:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalGag.g:1224:1: rule__Task__Group__8__Impl : ( ( rule__Task__Group_8__0 )? ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1228:1: ( ( ( rule__Task__Group_8__0 )? ) )
            // InternalGag.g:1229:1: ( ( rule__Task__Group_8__0 )? )
            {
            // InternalGag.g:1229:1: ( ( rule__Task__Group_8__0 )? )
            // InternalGag.g:1230:2: ( rule__Task__Group_8__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_8()); 
            // InternalGag.g:1231:2: ( rule__Task__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGag.g:1231:3: rule__Task__Group_8__0
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
    // InternalGag.g:1239:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1243:1: ( rule__Task__Group__9__Impl )
            // InternalGag.g:1244:2: rule__Task__Group__9__Impl
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
    // InternalGag.g:1250:1: rule__Task__Group__9__Impl : ( '}' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1254:1: ( ( '}' ) )
            // InternalGag.g:1255:1: ( '}' )
            {
            // InternalGag.g:1255:1: ( '}' )
            // InternalGag.g:1256:2: '}'
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
    // InternalGag.g:1266:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1270:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalGag.g:1271:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGag.g:1278:1: rule__Task__Group_6__0__Impl : ( 'appliedRule' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1282:1: ( ( 'appliedRule' ) )
            // InternalGag.g:1283:1: ( 'appliedRule' )
            {
            // InternalGag.g:1283:1: ( 'appliedRule' )
            // InternalGag.g:1284:2: 'appliedRule'
            {
             before(grammarAccess.getTaskAccess().getAppliedRuleKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGag.g:1293:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1297:1: ( rule__Task__Group_6__1__Impl )
            // InternalGag.g:1298:2: rule__Task__Group_6__1__Impl
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
    // InternalGag.g:1304:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__AppliedRuleAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1308:1: ( ( ( rule__Task__AppliedRuleAssignment_6_1 ) ) )
            // InternalGag.g:1309:1: ( ( rule__Task__AppliedRuleAssignment_6_1 ) )
            {
            // InternalGag.g:1309:1: ( ( rule__Task__AppliedRuleAssignment_6_1 ) )
            // InternalGag.g:1310:2: ( rule__Task__AppliedRuleAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getAppliedRuleAssignment_6_1()); 
            // InternalGag.g:1311:2: ( rule__Task__AppliedRuleAssignment_6_1 )
            // InternalGag.g:1311:3: rule__Task__AppliedRuleAssignment_6_1
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
    // InternalGag.g:1320:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1324:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // InternalGag.g:1325:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGag.g:1332:1: rule__Task__Group_7__0__Impl : ( 'associated_to' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1336:1: ( ( 'associated_to' ) )
            // InternalGag.g:1337:1: ( 'associated_to' )
            {
            // InternalGag.g:1337:1: ( 'associated_to' )
            // InternalGag.g:1338:2: 'associated_to'
            {
             before(grammarAccess.getTaskAccess().getAssociated_toKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssociated_toKeyword_7_0()); 

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
    // InternalGag.g:1347:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1351:1: ( rule__Task__Group_7__1__Impl )
            // InternalGag.g:1352:2: rule__Task__Group_7__1__Impl
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
    // InternalGag.g:1358:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__Associated_toAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1362:1: ( ( ( rule__Task__Associated_toAssignment_7_1 ) ) )
            // InternalGag.g:1363:1: ( ( rule__Task__Associated_toAssignment_7_1 ) )
            {
            // InternalGag.g:1363:1: ( ( rule__Task__Associated_toAssignment_7_1 ) )
            // InternalGag.g:1364:2: ( rule__Task__Associated_toAssignment_7_1 )
            {
             before(grammarAccess.getTaskAccess().getAssociated_toAssignment_7_1()); 
            // InternalGag.g:1365:2: ( rule__Task__Associated_toAssignment_7_1 )
            // InternalGag.g:1365:3: rule__Task__Associated_toAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__Associated_toAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssociated_toAssignment_7_1()); 

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
    // InternalGag.g:1374:1: rule__Task__Group_8__0 : rule__Task__Group_8__0__Impl rule__Task__Group_8__1 ;
    public final void rule__Task__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1378:1: ( rule__Task__Group_8__0__Impl rule__Task__Group_8__1 )
            // InternalGag.g:1379:2: rule__Task__Group_8__0__Impl rule__Task__Group_8__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGag.g:1386:1: rule__Task__Group_8__0__Impl : ( 'sub_task' ) ;
    public final void rule__Task__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1390:1: ( ( 'sub_task' ) )
            // InternalGag.g:1391:1: ( 'sub_task' )
            {
            // InternalGag.g:1391:1: ( 'sub_task' )
            // InternalGag.g:1392:2: 'sub_task'
            {
             before(grammarAccess.getTaskAccess().getSub_taskKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGag.g:1401:1: rule__Task__Group_8__1 : rule__Task__Group_8__1__Impl rule__Task__Group_8__2 ;
    public final void rule__Task__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1405:1: ( rule__Task__Group_8__1__Impl rule__Task__Group_8__2 )
            // InternalGag.g:1406:2: rule__Task__Group_8__1__Impl rule__Task__Group_8__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGag.g:1413:1: rule__Task__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Task__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1417:1: ( ( '{' ) )
            // InternalGag.g:1418:1: ( '{' )
            {
            // InternalGag.g:1418:1: ( '{' )
            // InternalGag.g:1419:2: '{'
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
    // InternalGag.g:1428:1: rule__Task__Group_8__2 : rule__Task__Group_8__2__Impl rule__Task__Group_8__3 ;
    public final void rule__Task__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1432:1: ( rule__Task__Group_8__2__Impl rule__Task__Group_8__3 )
            // InternalGag.g:1433:2: rule__Task__Group_8__2__Impl rule__Task__Group_8__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGag.g:1440:1: rule__Task__Group_8__2__Impl : ( ( rule__Task__Sub_taskAssignment_8_2 ) ) ;
    public final void rule__Task__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1444:1: ( ( ( rule__Task__Sub_taskAssignment_8_2 ) ) )
            // InternalGag.g:1445:1: ( ( rule__Task__Sub_taskAssignment_8_2 ) )
            {
            // InternalGag.g:1445:1: ( ( rule__Task__Sub_taskAssignment_8_2 ) )
            // InternalGag.g:1446:2: ( rule__Task__Sub_taskAssignment_8_2 )
            {
             before(grammarAccess.getTaskAccess().getSub_taskAssignment_8_2()); 
            // InternalGag.g:1447:2: ( rule__Task__Sub_taskAssignment_8_2 )
            // InternalGag.g:1447:3: rule__Task__Sub_taskAssignment_8_2
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
    // InternalGag.g:1455:1: rule__Task__Group_8__3 : rule__Task__Group_8__3__Impl rule__Task__Group_8__4 ;
    public final void rule__Task__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1459:1: ( rule__Task__Group_8__3__Impl rule__Task__Group_8__4 )
            // InternalGag.g:1460:2: rule__Task__Group_8__3__Impl rule__Task__Group_8__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGag.g:1467:1: rule__Task__Group_8__3__Impl : ( ( rule__Task__Group_8_3__0 )* ) ;
    public final void rule__Task__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1471:1: ( ( ( rule__Task__Group_8_3__0 )* ) )
            // InternalGag.g:1472:1: ( ( rule__Task__Group_8_3__0 )* )
            {
            // InternalGag.g:1472:1: ( ( rule__Task__Group_8_3__0 )* )
            // InternalGag.g:1473:2: ( rule__Task__Group_8_3__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_8_3()); 
            // InternalGag.g:1474:2: ( rule__Task__Group_8_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGag.g:1474:3: rule__Task__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Task__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalGag.g:1482:1: rule__Task__Group_8__4 : rule__Task__Group_8__4__Impl ;
    public final void rule__Task__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1486:1: ( rule__Task__Group_8__4__Impl )
            // InternalGag.g:1487:2: rule__Task__Group_8__4__Impl
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
    // InternalGag.g:1493:1: rule__Task__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Task__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1497:1: ( ( '}' ) )
            // InternalGag.g:1498:1: ( '}' )
            {
            // InternalGag.g:1498:1: ( '}' )
            // InternalGag.g:1499:2: '}'
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
    // InternalGag.g:1509:1: rule__Task__Group_8_3__0 : rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1 ;
    public final void rule__Task__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1513:1: ( rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1 )
            // InternalGag.g:1514:2: rule__Task__Group_8_3__0__Impl rule__Task__Group_8_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGag.g:1521:1: rule__Task__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Task__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1525:1: ( ( ',' ) )
            // InternalGag.g:1526:1: ( ',' )
            {
            // InternalGag.g:1526:1: ( ',' )
            // InternalGag.g:1527:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_8_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGag.g:1536:1: rule__Task__Group_8_3__1 : rule__Task__Group_8_3__1__Impl ;
    public final void rule__Task__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1540:1: ( rule__Task__Group_8_3__1__Impl )
            // InternalGag.g:1541:2: rule__Task__Group_8_3__1__Impl
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
    // InternalGag.g:1547:1: rule__Task__Group_8_3__1__Impl : ( ( rule__Task__Sub_taskAssignment_8_3_1 ) ) ;
    public final void rule__Task__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1551:1: ( ( ( rule__Task__Sub_taskAssignment_8_3_1 ) ) )
            // InternalGag.g:1552:1: ( ( rule__Task__Sub_taskAssignment_8_3_1 ) )
            {
            // InternalGag.g:1552:1: ( ( rule__Task__Sub_taskAssignment_8_3_1 ) )
            // InternalGag.g:1553:2: ( rule__Task__Sub_taskAssignment_8_3_1 )
            {
             before(grammarAccess.getTaskAccess().getSub_taskAssignment_8_3_1()); 
            // InternalGag.g:1554:2: ( rule__Task__Sub_taskAssignment_8_3_1 )
            // InternalGag.g:1554:3: rule__Task__Sub_taskAssignment_8_3_1
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
    // InternalGag.g:1563:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1567:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalGag.g:1568:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGag.g:1575:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1579:1: ( ( ( '-' )? ) )
            // InternalGag.g:1580:1: ( ( '-' )? )
            {
            // InternalGag.g:1580:1: ( ( '-' )? )
            // InternalGag.g:1581:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalGag.g:1582:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGag.g:1582:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalGag.g:1590:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1594:1: ( rule__ELong__Group__1__Impl )
            // InternalGag.g:1595:2: rule__ELong__Group__1__Impl
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
    // InternalGag.g:1601:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1605:1: ( ( RULE_INT ) )
            // InternalGag.g:1606:1: ( RULE_INT )
            {
            // InternalGag.g:1606:1: ( RULE_INT )
            // InternalGag.g:1607:2: RULE_INT
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


    // $ANTLR start "rule__Service__Group__0"
    // InternalGag.g:1617:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1621:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalGag.g:1622:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalGag.g:1629:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1633:1: ( ( () ) )
            // InternalGag.g:1634:1: ( () )
            {
            // InternalGag.g:1634:1: ( () )
            // InternalGag.g:1635:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalGag.g:1636:2: ()
            // InternalGag.g:1636:3: 
            {
            }

             after(grammarAccess.getServiceAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalGag.g:1644:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1648:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalGag.g:1649:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalGag.g:1656:1: rule__Service__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1660:1: ( ( 'Service' ) )
            // InternalGag.g:1661:1: ( 'Service' )
            {
            // InternalGag.g:1661:1: ( 'Service' )
            // InternalGag.g:1662:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalGag.g:1671:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1675:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalGag.g:1676:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalGag.g:1683:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1687:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // InternalGag.g:1688:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // InternalGag.g:1688:1: ( ( rule__Service__NameAssignment_2 ) )
            // InternalGag.g:1689:2: ( rule__Service__NameAssignment_2 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            // InternalGag.g:1690:2: ( rule__Service__NameAssignment_2 )
            // InternalGag.g:1690:3: rule__Service__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalGag.g:1698:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1702:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalGag.g:1703:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalGag.g:1710:1: rule__Service__Group__3__Impl : ( '{' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1714:1: ( ( '{' ) )
            // InternalGag.g:1715:1: ( '{' )
            {
            // InternalGag.g:1715:1: ( '{' )
            // InternalGag.g:1716:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalGag.g:1725:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1729:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalGag.g:1730:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalGag.g:1737:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )? ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1741:1: ( ( ( rule__Service__Group_4__0 )? ) )
            // InternalGag.g:1742:1: ( ( rule__Service__Group_4__0 )? )
            {
            // InternalGag.g:1742:1: ( ( rule__Service__Group_4__0 )? )
            // InternalGag.g:1743:2: ( rule__Service__Group_4__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // InternalGag.g:1744:2: ( rule__Service__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGag.g:1744:3: rule__Service__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalGag.g:1752:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1756:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalGag.g:1757:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalGag.g:1764:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )? ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1768:1: ( ( ( rule__Service__Group_5__0 )? ) )
            // InternalGag.g:1769:1: ( ( rule__Service__Group_5__0 )? )
            {
            // InternalGag.g:1769:1: ( ( rule__Service__Group_5__0 )? )
            // InternalGag.g:1770:2: ( rule__Service__Group_5__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalGag.g:1771:2: ( rule__Service__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGag.g:1771:3: rule__Service__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalGag.g:1779:1: rule__Service__Group__6 : rule__Service__Group__6__Impl ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1783:1: ( rule__Service__Group__6__Impl )
            // InternalGag.g:1784:2: rule__Service__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__6__Impl();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalGag.g:1790:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1794:1: ( ( '}' ) )
            // InternalGag.g:1795:1: ( '}' )
            {
            // InternalGag.g:1795:1: ( '}' )
            // InternalGag.g:1796:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // InternalGag.g:1806:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1810:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // InternalGag.g:1811:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__1();

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
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // InternalGag.g:1818:1: rule__Service__Group_4__0__Impl : ( 'input' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1822:1: ( ( 'input' ) )
            // InternalGag.g:1823:1: ( 'input' )
            {
            // InternalGag.g:1823:1: ( 'input' )
            // InternalGag.g:1824:2: 'input'
            {
             before(grammarAccess.getServiceAccess().getInputKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getInputKeyword_4_0()); 

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
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // InternalGag.g:1833:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl rule__Service__Group_4__2 ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1837:1: ( rule__Service__Group_4__1__Impl rule__Service__Group_4__2 )
            // InternalGag.g:1838:2: rule__Service__Group_4__1__Impl rule__Service__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__2();

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
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // InternalGag.g:1845:1: rule__Service__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1849:1: ( ( '{' ) )
            // InternalGag.g:1850:1: ( '{' )
            {
            // InternalGag.g:1850:1: ( '{' )
            // InternalGag.g:1851:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group_4__2"
    // InternalGag.g:1860:1: rule__Service__Group_4__2 : rule__Service__Group_4__2__Impl rule__Service__Group_4__3 ;
    public final void rule__Service__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1864:1: ( rule__Service__Group_4__2__Impl rule__Service__Group_4__3 )
            // InternalGag.g:1865:2: rule__Service__Group_4__2__Impl rule__Service__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__3();

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
    // $ANTLR end "rule__Service__Group_4__2"


    // $ANTLR start "rule__Service__Group_4__2__Impl"
    // InternalGag.g:1872:1: rule__Service__Group_4__2__Impl : ( ( rule__Service__InputAssignment_4_2 ) ) ;
    public final void rule__Service__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1876:1: ( ( ( rule__Service__InputAssignment_4_2 ) ) )
            // InternalGag.g:1877:1: ( ( rule__Service__InputAssignment_4_2 ) )
            {
            // InternalGag.g:1877:1: ( ( rule__Service__InputAssignment_4_2 ) )
            // InternalGag.g:1878:2: ( rule__Service__InputAssignment_4_2 )
            {
             before(grammarAccess.getServiceAccess().getInputAssignment_4_2()); 
            // InternalGag.g:1879:2: ( rule__Service__InputAssignment_4_2 )
            // InternalGag.g:1879:3: rule__Service__InputAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__InputAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getInputAssignment_4_2()); 

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
    // $ANTLR end "rule__Service__Group_4__2__Impl"


    // $ANTLR start "rule__Service__Group_4__3"
    // InternalGag.g:1887:1: rule__Service__Group_4__3 : rule__Service__Group_4__3__Impl rule__Service__Group_4__4 ;
    public final void rule__Service__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1891:1: ( rule__Service__Group_4__3__Impl rule__Service__Group_4__4 )
            // InternalGag.g:1892:2: rule__Service__Group_4__3__Impl rule__Service__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4();

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
    // $ANTLR end "rule__Service__Group_4__3"


    // $ANTLR start "rule__Service__Group_4__3__Impl"
    // InternalGag.g:1899:1: rule__Service__Group_4__3__Impl : ( ( rule__Service__Group_4_3__0 )* ) ;
    public final void rule__Service__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1903:1: ( ( ( rule__Service__Group_4_3__0 )* ) )
            // InternalGag.g:1904:1: ( ( rule__Service__Group_4_3__0 )* )
            {
            // InternalGag.g:1904:1: ( ( rule__Service__Group_4_3__0 )* )
            // InternalGag.g:1905:2: ( rule__Service__Group_4_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4_3()); 
            // InternalGag.g:1906:2: ( rule__Service__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGag.g:1906:3: rule__Service__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Service__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Service__Group_4__3__Impl"


    // $ANTLR start "rule__Service__Group_4__4"
    // InternalGag.g:1914:1: rule__Service__Group_4__4 : rule__Service__Group_4__4__Impl ;
    public final void rule__Service__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1918:1: ( rule__Service__Group_4__4__Impl )
            // InternalGag.g:1919:2: rule__Service__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4__Impl();

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
    // $ANTLR end "rule__Service__Group_4__4"


    // $ANTLR start "rule__Service__Group_4__4__Impl"
    // InternalGag.g:1925:1: rule__Service__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1929:1: ( ( '}' ) )
            // InternalGag.g:1930:1: ( '}' )
            {
            // InternalGag.g:1930:1: ( '}' )
            // InternalGag.g:1931:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Service__Group_4__4__Impl"


    // $ANTLR start "rule__Service__Group_4_3__0"
    // InternalGag.g:1941:1: rule__Service__Group_4_3__0 : rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 ;
    public final void rule__Service__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1945:1: ( rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 )
            // InternalGag.g:1946:2: rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1();

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
    // $ANTLR end "rule__Service__Group_4_3__0"


    // $ANTLR start "rule__Service__Group_4_3__0__Impl"
    // InternalGag.g:1953:1: rule__Service__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1957:1: ( ( ',' ) )
            // InternalGag.g:1958:1: ( ',' )
            {
            // InternalGag.g:1958:1: ( ',' )
            // InternalGag.g:1959:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Service__Group_4_3__0__Impl"


    // $ANTLR start "rule__Service__Group_4_3__1"
    // InternalGag.g:1968:1: rule__Service__Group_4_3__1 : rule__Service__Group_4_3__1__Impl ;
    public final void rule__Service__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1972:1: ( rule__Service__Group_4_3__1__Impl )
            // InternalGag.g:1973:2: rule__Service__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_4_3__1"


    // $ANTLR start "rule__Service__Group_4_3__1__Impl"
    // InternalGag.g:1979:1: rule__Service__Group_4_3__1__Impl : ( ( rule__Service__InputAssignment_4_3_1 ) ) ;
    public final void rule__Service__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1983:1: ( ( ( rule__Service__InputAssignment_4_3_1 ) ) )
            // InternalGag.g:1984:1: ( ( rule__Service__InputAssignment_4_3_1 ) )
            {
            // InternalGag.g:1984:1: ( ( rule__Service__InputAssignment_4_3_1 ) )
            // InternalGag.g:1985:2: ( rule__Service__InputAssignment_4_3_1 )
            {
             before(grammarAccess.getServiceAccess().getInputAssignment_4_3_1()); 
            // InternalGag.g:1986:2: ( rule__Service__InputAssignment_4_3_1 )
            // InternalGag.g:1986:3: rule__Service__InputAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__InputAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getInputAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Service__Group_4_3__1__Impl"


    // $ANTLR start "rule__Service__Group_5__0"
    // InternalGag.g:1995:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:1999:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalGag.g:2000:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1();

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
    // $ANTLR end "rule__Service__Group_5__0"


    // $ANTLR start "rule__Service__Group_5__0__Impl"
    // InternalGag.g:2007:1: rule__Service__Group_5__0__Impl : ( 'output' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2011:1: ( ( 'output' ) )
            // InternalGag.g:2012:1: ( 'output' )
            {
            // InternalGag.g:2012:1: ( 'output' )
            // InternalGag.g:2013:2: 'output'
            {
             before(grammarAccess.getServiceAccess().getOutputKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getOutputKeyword_5_0()); 

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
    // $ANTLR end "rule__Service__Group_5__0__Impl"


    // $ANTLR start "rule__Service__Group_5__1"
    // InternalGag.g:2022:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl rule__Service__Group_5__2 ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2026:1: ( rule__Service__Group_5__1__Impl rule__Service__Group_5__2 )
            // InternalGag.g:2027:2: rule__Service__Group_5__1__Impl rule__Service__Group_5__2
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__2();

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
    // $ANTLR end "rule__Service__Group_5__1"


    // $ANTLR start "rule__Service__Group_5__1__Impl"
    // InternalGag.g:2034:1: rule__Service__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2038:1: ( ( '{' ) )
            // InternalGag.g:2039:1: ( '{' )
            {
            // InternalGag.g:2039:1: ( '{' )
            // InternalGag.g:2040:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Service__Group_5__1__Impl"


    // $ANTLR start "rule__Service__Group_5__2"
    // InternalGag.g:2049:1: rule__Service__Group_5__2 : rule__Service__Group_5__2__Impl rule__Service__Group_5__3 ;
    public final void rule__Service__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2053:1: ( rule__Service__Group_5__2__Impl rule__Service__Group_5__3 )
            // InternalGag.g:2054:2: rule__Service__Group_5__2__Impl rule__Service__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__3();

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
    // $ANTLR end "rule__Service__Group_5__2"


    // $ANTLR start "rule__Service__Group_5__2__Impl"
    // InternalGag.g:2061:1: rule__Service__Group_5__2__Impl : ( ( rule__Service__OutputAssignment_5_2 ) ) ;
    public final void rule__Service__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2065:1: ( ( ( rule__Service__OutputAssignment_5_2 ) ) )
            // InternalGag.g:2066:1: ( ( rule__Service__OutputAssignment_5_2 ) )
            {
            // InternalGag.g:2066:1: ( ( rule__Service__OutputAssignment_5_2 ) )
            // InternalGag.g:2067:2: ( rule__Service__OutputAssignment_5_2 )
            {
             before(grammarAccess.getServiceAccess().getOutputAssignment_5_2()); 
            // InternalGag.g:2068:2: ( rule__Service__OutputAssignment_5_2 )
            // InternalGag.g:2068:3: rule__Service__OutputAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__OutputAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOutputAssignment_5_2()); 

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
    // $ANTLR end "rule__Service__Group_5__2__Impl"


    // $ANTLR start "rule__Service__Group_5__3"
    // InternalGag.g:2076:1: rule__Service__Group_5__3 : rule__Service__Group_5__3__Impl rule__Service__Group_5__4 ;
    public final void rule__Service__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2080:1: ( rule__Service__Group_5__3__Impl rule__Service__Group_5__4 )
            // InternalGag.g:2081:2: rule__Service__Group_5__3__Impl rule__Service__Group_5__4
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__4();

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
    // $ANTLR end "rule__Service__Group_5__3"


    // $ANTLR start "rule__Service__Group_5__3__Impl"
    // InternalGag.g:2088:1: rule__Service__Group_5__3__Impl : ( ( rule__Service__Group_5_3__0 )* ) ;
    public final void rule__Service__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2092:1: ( ( ( rule__Service__Group_5_3__0 )* ) )
            // InternalGag.g:2093:1: ( ( rule__Service__Group_5_3__0 )* )
            {
            // InternalGag.g:2093:1: ( ( rule__Service__Group_5_3__0 )* )
            // InternalGag.g:2094:2: ( rule__Service__Group_5_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_5_3()); 
            // InternalGag.g:2095:2: ( rule__Service__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGag.g:2095:3: rule__Service__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Service__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Service__Group_5__3__Impl"


    // $ANTLR start "rule__Service__Group_5__4"
    // InternalGag.g:2103:1: rule__Service__Group_5__4 : rule__Service__Group_5__4__Impl ;
    public final void rule__Service__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2107:1: ( rule__Service__Group_5__4__Impl )
            // InternalGag.g:2108:2: rule__Service__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_5__4__Impl();

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
    // $ANTLR end "rule__Service__Group_5__4"


    // $ANTLR start "rule__Service__Group_5__4__Impl"
    // InternalGag.g:2114:1: rule__Service__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2118:1: ( ( '}' ) )
            // InternalGag.g:2119:1: ( '}' )
            {
            // InternalGag.g:2119:1: ( '}' )
            // InternalGag.g:2120:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Service__Group_5__4__Impl"


    // $ANTLR start "rule__Service__Group_5_3__0"
    // InternalGag.g:2130:1: rule__Service__Group_5_3__0 : rule__Service__Group_5_3__0__Impl rule__Service__Group_5_3__1 ;
    public final void rule__Service__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2134:1: ( rule__Service__Group_5_3__0__Impl rule__Service__Group_5_3__1 )
            // InternalGag.g:2135:2: rule__Service__Group_5_3__0__Impl rule__Service__Group_5_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5_3__1();

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
    // $ANTLR end "rule__Service__Group_5_3__0"


    // $ANTLR start "rule__Service__Group_5_3__0__Impl"
    // InternalGag.g:2142:1: rule__Service__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2146:1: ( ( ',' ) )
            // InternalGag.g:2147:1: ( ',' )
            {
            // InternalGag.g:2147:1: ( ',' )
            // InternalGag.g:2148:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Service__Group_5_3__0__Impl"


    // $ANTLR start "rule__Service__Group_5_3__1"
    // InternalGag.g:2157:1: rule__Service__Group_5_3__1 : rule__Service__Group_5_3__1__Impl ;
    public final void rule__Service__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2161:1: ( rule__Service__Group_5_3__1__Impl )
            // InternalGag.g:2162:2: rule__Service__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_5_3__1"


    // $ANTLR start "rule__Service__Group_5_3__1__Impl"
    // InternalGag.g:2168:1: rule__Service__Group_5_3__1__Impl : ( ( rule__Service__OutputAssignment_5_3_1 ) ) ;
    public final void rule__Service__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2172:1: ( ( ( rule__Service__OutputAssignment_5_3_1 ) ) )
            // InternalGag.g:2173:1: ( ( rule__Service__OutputAssignment_5_3_1 ) )
            {
            // InternalGag.g:2173:1: ( ( rule__Service__OutputAssignment_5_3_1 ) )
            // InternalGag.g:2174:2: ( rule__Service__OutputAssignment_5_3_1 )
            {
             before(grammarAccess.getServiceAccess().getOutputAssignment_5_3_1()); 
            // InternalGag.g:2175:2: ( rule__Service__OutputAssignment_5_3_1 )
            // InternalGag.g:2175:3: rule__Service__OutputAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__OutputAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOutputAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Service__Group_5_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalGag.g:2184:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2188:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalGag.g:2189:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalGag.g:2196:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2200:1: ( ( 'Attribute' ) )
            // InternalGag.g:2201:1: ( 'Attribute' )
            {
            // InternalGag.g:2201:1: ( 'Attribute' )
            // InternalGag.g:2202:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalGag.g:2211:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2215:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalGag.g:2216:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalGag.g:2223:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2227:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalGag.g:2228:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalGag.g:2228:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalGag.g:2229:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalGag.g:2230:2: ( rule__Attribute__NameAssignment_1 )
            // InternalGag.g:2230:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalGag.g:2238:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2242:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalGag.g:2243:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalGag.g:2250:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2254:1: ( ( '{' ) )
            // InternalGag.g:2255:1: ( '{' )
            {
            // InternalGag.g:2255:1: ( '{' )
            // InternalGag.g:2256:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalGag.g:2265:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2269:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalGag.g:2270:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalGag.g:2277:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2281:1: ( ( 'type' ) )
            // InternalGag.g:2282:1: ( 'type' )
            {
            // InternalGag.g:2282:1: ( 'type' )
            // InternalGag.g:2283:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalGag.g:2292:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2296:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalGag.g:2297:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalGag.g:2304:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2308:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalGag.g:2309:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalGag.g:2309:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalGag.g:2310:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalGag.g:2311:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalGag.g:2311:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalGag.g:2319:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2323:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalGag.g:2324:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalGag.g:2331:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2335:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalGag.g:2336:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalGag.g:2336:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalGag.g:2337:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalGag.g:2338:2: ( rule__Attribute__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGag.g:2338:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalGag.g:2346:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2350:1: ( rule__Attribute__Group__6__Impl )
            // InternalGag.g:2351:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6__Impl();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalGag.g:2357:1: rule__Attribute__Group__6__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2361:1: ( ( '}' ) )
            // InternalGag.g:2362:1: ( '}' )
            {
            // InternalGag.g:2362:1: ( '}' )
            // InternalGag.g:2363:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalGag.g:2373:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2377:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalGag.g:2378:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalGag.g:2385:1: rule__Attribute__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2389:1: ( ( 'value' ) )
            // InternalGag.g:2390:1: ( 'value' )
            {
            // InternalGag.g:2390:1: ( 'value' )
            // InternalGag.g:2391:2: 'value'
            {
             before(grammarAccess.getAttributeAccess().getValueKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalGag.g:2400:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2404:1: ( rule__Attribute__Group_5__1__Impl )
            // InternalGag.g:2405:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalGag.g:2411:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__ValueAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2415:1: ( ( ( rule__Attribute__ValueAssignment_5_1 ) ) )
            // InternalGag.g:2416:1: ( ( rule__Attribute__ValueAssignment_5_1 ) )
            {
            // InternalGag.g:2416:1: ( ( rule__Attribute__ValueAssignment_5_1 ) )
            // InternalGag.g:2417:2: ( rule__Attribute__ValueAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_5_1()); 
            // InternalGag.g:2418:2: ( rule__Attribute__ValueAssignment_5_1 )
            // InternalGag.g:2418:3: rule__Attribute__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_5_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGag.g:2427:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2431:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGag.g:2432:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGag.g:2439:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2443:1: ( ( 'Rule' ) )
            // InternalGag.g:2444:1: ( 'Rule' )
            {
            // InternalGag.g:2444:1: ( 'Rule' )
            // InternalGag.g:2445:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGag.g:2454:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2458:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGag.g:2459:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGag.g:2466:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2470:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalGag.g:2471:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalGag.g:2471:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalGag.g:2472:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalGag.g:2473:2: ( rule__Rule__NameAssignment_1 )
            // InternalGag.g:2473:3: rule__Rule__NameAssignment_1
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
    // InternalGag.g:2481:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2485:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGag.g:2486:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGag.g:2493:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2497:1: ( ( '{' ) )
            // InternalGag.g:2498:1: ( '{' )
            {
            // InternalGag.g:2498:1: ( '{' )
            // InternalGag.g:2499:2: '{'
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
    // InternalGag.g:2508:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2512:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGag.g:2513:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGag.g:2520:1: rule__Rule__Group__3__Impl : ( 'left_hand_side' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2524:1: ( ( 'left_hand_side' ) )
            // InternalGag.g:2525:1: ( 'left_hand_side' )
            {
            // InternalGag.g:2525:1: ( 'left_hand_side' )
            // InternalGag.g:2526:2: 'left_hand_side'
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGag.g:2535:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2539:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalGag.g:2540:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalGag.g:2547:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Left_hand_sideAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2551:1: ( ( ( rule__Rule__Left_hand_sideAssignment_4 ) ) )
            // InternalGag.g:2552:1: ( ( rule__Rule__Left_hand_sideAssignment_4 ) )
            {
            // InternalGag.g:2552:1: ( ( rule__Rule__Left_hand_sideAssignment_4 ) )
            // InternalGag.g:2553:2: ( rule__Rule__Left_hand_sideAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideAssignment_4()); 
            // InternalGag.g:2554:2: ( rule__Rule__Left_hand_sideAssignment_4 )
            // InternalGag.g:2554:3: rule__Rule__Left_hand_sideAssignment_4
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
    // InternalGag.g:2562:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2566:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalGag.g:2567:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalGag.g:2574:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2578:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalGag.g:2579:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalGag.g:2579:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalGag.g:2580:2: ( rule__Rule__Group_5__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalGag.g:2581:2: ( rule__Rule__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGag.g:2581:3: rule__Rule__Group_5__0
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
    // InternalGag.g:2589:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2593:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalGag.g:2594:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalGag.g:2601:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2605:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalGag.g:2606:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalGag.g:2606:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalGag.g:2607:2: ( rule__Rule__Group_6__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalGag.g:2608:2: ( rule__Rule__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGag.g:2608:3: rule__Rule__Group_6__0
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
    // InternalGag.g:2616:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2620:1: ( rule__Rule__Group__7__Impl )
            // InternalGag.g:2621:2: rule__Rule__Group__7__Impl
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
    // InternalGag.g:2627:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2631:1: ( ( '}' ) )
            // InternalGag.g:2632:1: ( '}' )
            {
            // InternalGag.g:2632:1: ( '}' )
            // InternalGag.g:2633:2: '}'
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
    // InternalGag.g:2643:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2647:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalGag.g:2648:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGag.g:2655:1: rule__Rule__Group_5__0__Impl : ( 'right_hand_side_service' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2659:1: ( ( 'right_hand_side_service' ) )
            // InternalGag.g:2660:1: ( 'right_hand_side_service' )
            {
            // InternalGag.g:2660:1: ( 'right_hand_side_service' )
            // InternalGag.g:2661:2: 'right_hand_side_service'
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGag.g:2670:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2674:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalGag.g:2675:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalGag.g:2682:1: rule__Rule__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2686:1: ( ( '{' ) )
            // InternalGag.g:2687:1: ( '{' )
            {
            // InternalGag.g:2687:1: ( '{' )
            // InternalGag.g:2688:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // InternalGag.g:2697:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3 ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2701:1: ( rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3 )
            // InternalGag.g:2702:2: rule__Rule__Group_5__2__Impl rule__Rule__Group_5__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGag.g:2709:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2713:1: ( ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) ) )
            // InternalGag.g:2714:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) )
            {
            // InternalGag.g:2714:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_2 ) )
            // InternalGag.g:2715:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_2 )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_2()); 
            // InternalGag.g:2716:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_2 )
            // InternalGag.g:2716:3: rule__Rule__Right_hand_side_serviceAssignment_5_2
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
    // InternalGag.g:2724:1: rule__Rule__Group_5__3 : rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4 ;
    public final void rule__Rule__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2728:1: ( rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4 )
            // InternalGag.g:2729:2: rule__Rule__Group_5__3__Impl rule__Rule__Group_5__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGag.g:2736:1: rule__Rule__Group_5__3__Impl : ( ( rule__Rule__Group_5_3__0 )* ) ;
    public final void rule__Rule__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2740:1: ( ( ( rule__Rule__Group_5_3__0 )* ) )
            // InternalGag.g:2741:1: ( ( rule__Rule__Group_5_3__0 )* )
            {
            // InternalGag.g:2741:1: ( ( rule__Rule__Group_5_3__0 )* )
            // InternalGag.g:2742:2: ( rule__Rule__Group_5_3__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5_3()); 
            // InternalGag.g:2743:2: ( rule__Rule__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGag.g:2743:3: rule__Rule__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Rule__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalGag.g:2751:1: rule__Rule__Group_5__4 : rule__Rule__Group_5__4__Impl ;
    public final void rule__Rule__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2755:1: ( rule__Rule__Group_5__4__Impl )
            // InternalGag.g:2756:2: rule__Rule__Group_5__4__Impl
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
    // InternalGag.g:2762:1: rule__Rule__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2766:1: ( ( '}' ) )
            // InternalGag.g:2767:1: ( '}' )
            {
            // InternalGag.g:2767:1: ( '}' )
            // InternalGag.g:2768:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // InternalGag.g:2778:1: rule__Rule__Group_5_3__0 : rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1 ;
    public final void rule__Rule__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2782:1: ( rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1 )
            // InternalGag.g:2783:2: rule__Rule__Group_5_3__0__Impl rule__Rule__Group_5_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGag.g:2790:1: rule__Rule__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2794:1: ( ( ',' ) )
            // InternalGag.g:2795:1: ( ',' )
            {
            // InternalGag.g:2795:1: ( ',' )
            // InternalGag.g:2796:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGag.g:2805:1: rule__Rule__Group_5_3__1 : rule__Rule__Group_5_3__1__Impl ;
    public final void rule__Rule__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2809:1: ( rule__Rule__Group_5_3__1__Impl )
            // InternalGag.g:2810:2: rule__Rule__Group_5_3__1__Impl
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
    // InternalGag.g:2816:1: rule__Rule__Group_5_3__1__Impl : ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) ) ;
    public final void rule__Rule__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2820:1: ( ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) ) )
            // InternalGag.g:2821:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) )
            {
            // InternalGag.g:2821:1: ( ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 ) )
            // InternalGag.g:2822:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 )
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceAssignment_5_3_1()); 
            // InternalGag.g:2823:2: ( rule__Rule__Right_hand_side_serviceAssignment_5_3_1 )
            // InternalGag.g:2823:3: rule__Rule__Right_hand_side_serviceAssignment_5_3_1
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
    // InternalGag.g:2832:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2836:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalGag.g:2837:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalGag.g:2844:1: rule__Rule__Group_6__0__Impl : ( 'guard' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2848:1: ( ( 'guard' ) )
            // InternalGag.g:2849:1: ( 'guard' )
            {
            // InternalGag.g:2849:1: ( 'guard' )
            // InternalGag.g:2850:2: 'guard'
            {
             before(grammarAccess.getRuleAccess().getGuardKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGag.g:2859:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2863:1: ( rule__Rule__Group_6__1__Impl )
            // InternalGag.g:2864:2: rule__Rule__Group_6__1__Impl
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
    // InternalGag.g:2870:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__GuardAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2874:1: ( ( ( rule__Rule__GuardAssignment_6_1 ) ) )
            // InternalGag.g:2875:1: ( ( rule__Rule__GuardAssignment_6_1 ) )
            {
            // InternalGag.g:2875:1: ( ( rule__Rule__GuardAssignment_6_1 ) )
            // InternalGag.g:2876:2: ( rule__Rule__GuardAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getGuardAssignment_6_1()); 
            // InternalGag.g:2877:2: ( rule__Rule__GuardAssignment_6_1 )
            // InternalGag.g:2877:3: rule__Rule__GuardAssignment_6_1
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


    // $ANTLR start "rule__Guard__Group__0"
    // InternalGag.g:2886:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2890:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // InternalGag.g:2891:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__1();

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
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // InternalGag.g:2898:1: rule__Guard__Group__0__Impl : ( 'Guard' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2902:1: ( ( 'Guard' ) )
            // InternalGag.g:2903:1: ( 'Guard' )
            {
            // InternalGag.g:2903:1: ( 'Guard' )
            // InternalGag.g:2904:2: 'Guard'
            {
             before(grammarAccess.getGuardAccess().getGuardKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getGuardKeyword_0()); 

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
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // InternalGag.g:2913:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2917:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // InternalGag.g:2918:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__2();

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
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // InternalGag.g:2925:1: rule__Guard__Group__1__Impl : ( '{' ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2929:1: ( ( '{' ) )
            // InternalGag.g:2930:1: ( '{' )
            {
            // InternalGag.g:2930:1: ( '{' )
            // InternalGag.g:2931:2: '{'
            {
             before(grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // InternalGag.g:2940:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2944:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // InternalGag.g:2945:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__3();

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
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // InternalGag.g:2952:1: rule__Guard__Group__2__Impl : ( 'classPath' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2956:1: ( ( 'classPath' ) )
            // InternalGag.g:2957:1: ( 'classPath' )
            {
            // InternalGag.g:2957:1: ( 'classPath' )
            // InternalGag.g:2958:2: 'classPath'
            {
             before(grammarAccess.getGuardAccess().getClassPathKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getClassPathKeyword_2()); 

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
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // InternalGag.g:2967:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2971:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // InternalGag.g:2972:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__4();

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
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // InternalGag.g:2979:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__ClassPathAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2983:1: ( ( ( rule__Guard__ClassPathAssignment_3 ) ) )
            // InternalGag.g:2984:1: ( ( rule__Guard__ClassPathAssignment_3 ) )
            {
            // InternalGag.g:2984:1: ( ( rule__Guard__ClassPathAssignment_3 ) )
            // InternalGag.g:2985:2: ( rule__Guard__ClassPathAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getClassPathAssignment_3()); 
            // InternalGag.g:2986:2: ( rule__Guard__ClassPathAssignment_3 )
            // InternalGag.g:2986:3: rule__Guard__ClassPathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Guard__ClassPathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getClassPathAssignment_3()); 

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
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__Guard__Group__4"
    // InternalGag.g:2994:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:2998:1: ( rule__Guard__Group__4__Impl )
            // InternalGag.g:2999:2: rule__Guard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group__4__Impl();

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
    // $ANTLR end "rule__Guard__Group__4"


    // $ANTLR start "rule__Guard__Group__4__Impl"
    // InternalGag.g:3005:1: rule__Guard__Group__4__Impl : ( '}' ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3009:1: ( ( '}' ) )
            // InternalGag.g:3010:1: ( '}' )
            {
            // InternalGag.g:3010:1: ( '}' )
            // InternalGag.g:3011:2: '}'
            {
             before(grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Guard__Group__4__Impl"


    // $ANTLR start "rule__Process__ConfigurationAssignment_3"
    // InternalGag.g:3021:1: rule__Process__ConfigurationAssignment_3 : ( ruleConfiguration ) ;
    public final void rule__Process__ConfigurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3025:1: ( ( ruleConfiguration ) )
            // InternalGag.g:3026:2: ( ruleConfiguration )
            {
            // InternalGag.g:3026:2: ( ruleConfiguration )
            // InternalGag.g:3027:3: ruleConfiguration
            {
             before(grammarAccess.getProcessAccess().getConfigurationConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getConfigurationConfigurationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Process__ConfigurationAssignment_3"


    // $ANTLR start "rule__Process__SpecificationAssignment_5"
    // InternalGag.g:3036:1: rule__Process__SpecificationAssignment_5 : ( ruleGAG ) ;
    public final void rule__Process__SpecificationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3040:1: ( ( ruleGAG ) )
            // InternalGag.g:3041:2: ( ruleGAG )
            {
            // InternalGag.g:3041:2: ( ruleGAG )
            // InternalGag.g:3042:3: ruleGAG
            {
             before(grammarAccess.getProcessAccess().getSpecificationGAGParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGAG();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getSpecificationGAGParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__SpecificationAssignment_5"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // InternalGag.g:3051:1: rule__Configuration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3055:1: ( ( ruleEString ) )
            // InternalGag.g:3056:2: ( ruleEString )
            {
            // InternalGag.g:3056:2: ( ruleEString )
            // InternalGag.g:3057:3: ruleEString
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
    // InternalGag.g:3066:1: rule__Configuration__RootAssignment_4 : ( ruleTask ) ;
    public final void rule__Configuration__RootAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3070:1: ( ( ruleTask ) )
            // InternalGag.g:3071:2: ( ruleTask )
            {
            // InternalGag.g:3071:2: ( ruleTask )
            // InternalGag.g:3072:3: ruleTask
            {
             before(grammarAccess.getConfigurationAccess().getRootTaskParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getRootTaskParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__GAG__NameAssignment_1"
    // InternalGag.g:3081:1: rule__GAG__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GAG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3085:1: ( ( ruleEString ) )
            // InternalGag.g:3086:2: ( ruleEString )
            {
            // InternalGag.g:3086:2: ( ruleEString )
            // InternalGag.g:3087:3: ruleEString
            {
             before(grammarAccess.getGAGAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGAGAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GAG__NameAssignment_1"


    // $ANTLR start "rule__GAG__RuleAssignment_5"
    // InternalGag.g:3096:1: rule__GAG__RuleAssignment_5 : ( ruleRule ) ;
    public final void rule__GAG__RuleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3100:1: ( ( ruleRule ) )
            // InternalGag.g:3101:2: ( ruleRule )
            {
            // InternalGag.g:3101:2: ( ruleRule )
            // InternalGag.g:3102:3: ruleRule
            {
             before(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GAG__RuleAssignment_5"


    // $ANTLR start "rule__GAG__RuleAssignment_6_1"
    // InternalGag.g:3111:1: rule__GAG__RuleAssignment_6_1 : ( ruleRule ) ;
    public final void rule__GAG__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3115:1: ( ( ruleRule ) )
            // InternalGag.g:3116:2: ( ruleRule )
            {
            // InternalGag.g:3116:2: ( ruleRule )
            // InternalGag.g:3117:3: ruleRule
            {
             before(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getGAGAccess().getRuleRuleParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__GAG__RuleAssignment_6_1"


    // $ANTLR start "rule__Task__Is_openAssignment_0"
    // InternalGag.g:3126:1: rule__Task__Is_openAssignment_0 : ( ( 'is_open' ) ) ;
    public final void rule__Task__Is_openAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3130:1: ( ( ( 'is_open' ) ) )
            // InternalGag.g:3131:2: ( ( 'is_open' ) )
            {
            // InternalGag.g:3131:2: ( ( 'is_open' ) )
            // InternalGag.g:3132:3: ( 'is_open' )
            {
             before(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 
            // InternalGag.g:3133:3: ( 'is_open' )
            // InternalGag.g:3134:4: 'is_open'
            {
             before(grammarAccess.getTaskAccess().getIs_openIs_openKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGag.g:3145:1: rule__Task__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Task__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3149:1: ( ( ruleEString ) )
            // InternalGag.g:3150:2: ( ruleEString )
            {
            // InternalGag.g:3150:2: ( ruleEString )
            // InternalGag.g:3151:3: ruleEString
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
    // InternalGag.g:3160:1: rule__Task__IdAssignment_5 : ( ruleELong ) ;
    public final void rule__Task__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3164:1: ( ( ruleELong ) )
            // InternalGag.g:3165:2: ( ruleELong )
            {
            // InternalGag.g:3165:2: ( ruleELong )
            // InternalGag.g:3166:3: ruleELong
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
    // InternalGag.g:3175:1: rule__Task__AppliedRuleAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Task__AppliedRuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3179:1: ( ( ruleEString ) )
            // InternalGag.g:3180:2: ( ruleEString )
            {
            // InternalGag.g:3180:2: ( ruleEString )
            // InternalGag.g:3181:3: ruleEString
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


    // $ANTLR start "rule__Task__Associated_toAssignment_7_1"
    // InternalGag.g:3190:1: rule__Task__Associated_toAssignment_7_1 : ( ruleService ) ;
    public final void rule__Task__Associated_toAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3194:1: ( ( ruleService ) )
            // InternalGag.g:3195:2: ( ruleService )
            {
            // InternalGag.g:3195:2: ( ruleService )
            // InternalGag.g:3196:3: ruleService
            {
             before(grammarAccess.getTaskAccess().getAssociated_toServiceParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getAssociated_toServiceParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Task__Associated_toAssignment_7_1"


    // $ANTLR start "rule__Task__Sub_taskAssignment_8_2"
    // InternalGag.g:3205:1: rule__Task__Sub_taskAssignment_8_2 : ( ruleTask ) ;
    public final void rule__Task__Sub_taskAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3209:1: ( ( ruleTask ) )
            // InternalGag.g:3210:2: ( ruleTask )
            {
            // InternalGag.g:3210:2: ( ruleTask )
            // InternalGag.g:3211:3: ruleTask
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
    // InternalGag.g:3220:1: rule__Task__Sub_taskAssignment_8_3_1 : ( ruleTask ) ;
    public final void rule__Task__Sub_taskAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3224:1: ( ( ruleTask ) )
            // InternalGag.g:3225:2: ( ruleTask )
            {
            // InternalGag.g:3225:2: ( ruleTask )
            // InternalGag.g:3226:3: ruleTask
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


    // $ANTLR start "rule__Service__NameAssignment_2"
    // InternalGag.g:3235:1: rule__Service__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3239:1: ( ( ruleEString ) )
            // InternalGag.g:3240:2: ( ruleEString )
            {
            // InternalGag.g:3240:2: ( ruleEString )
            // InternalGag.g:3241:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_2"


    // $ANTLR start "rule__Service__InputAssignment_4_2"
    // InternalGag.g:3250:1: rule__Service__InputAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__Service__InputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3254:1: ( ( ruleAttribute ) )
            // InternalGag.g:3255:2: ( ruleAttribute )
            {
            // InternalGag.g:3255:2: ( ruleAttribute )
            // InternalGag.g:3256:3: ruleAttribute
            {
             before(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Service__InputAssignment_4_2"


    // $ANTLR start "rule__Service__InputAssignment_4_3_1"
    // InternalGag.g:3265:1: rule__Service__InputAssignment_4_3_1 : ( ruleAttribute ) ;
    public final void rule__Service__InputAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3269:1: ( ( ruleAttribute ) )
            // InternalGag.g:3270:2: ( ruleAttribute )
            {
            // InternalGag.g:3270:2: ( ruleAttribute )
            // InternalGag.g:3271:3: ruleAttribute
            {
             before(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getInputAttributeParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Service__InputAssignment_4_3_1"


    // $ANTLR start "rule__Service__OutputAssignment_5_2"
    // InternalGag.g:3280:1: rule__Service__OutputAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Service__OutputAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3284:1: ( ( ruleAttribute ) )
            // InternalGag.g:3285:2: ( ruleAttribute )
            {
            // InternalGag.g:3285:2: ( ruleAttribute )
            // InternalGag.g:3286:3: ruleAttribute
            {
             before(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Service__OutputAssignment_5_2"


    // $ANTLR start "rule__Service__OutputAssignment_5_3_1"
    // InternalGag.g:3295:1: rule__Service__OutputAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Service__OutputAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3299:1: ( ( ruleAttribute ) )
            // InternalGag.g:3300:2: ( ruleAttribute )
            {
            // InternalGag.g:3300:2: ( ruleAttribute )
            // InternalGag.g:3301:3: ruleAttribute
            {
             before(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOutputAttributeParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Service__OutputAssignment_5_3_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalGag.g:3310:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3314:1: ( ( ruleEString ) )
            // InternalGag.g:3315:2: ( ruleEString )
            {
            // InternalGag.g:3315:2: ( ruleEString )
            // InternalGag.g:3316:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalGag.g:3325:1: rule__Attribute__TypeAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3329:1: ( ( ruleEString ) )
            // InternalGag.g:3330:2: ( ruleEString )
            {
            // InternalGag.g:3330:2: ( ruleEString )
            // InternalGag.g:3331:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__ValueAssignment_5_1"
    // InternalGag.g:3340:1: rule__Attribute__ValueAssignment_5_1 : ( ruleEJavaObject ) ;
    public final void rule__Attribute__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3344:1: ( ( ruleEJavaObject ) )
            // InternalGag.g:3345:2: ( ruleEJavaObject )
            {
            // InternalGag.g:3345:2: ( ruleEJavaObject )
            // InternalGag.g:3346:3: ruleEJavaObject
            {
             before(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEJavaObject();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Attribute__ValueAssignment_5_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalGag.g:3355:1: rule__Rule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3359:1: ( ( ruleEString ) )
            // InternalGag.g:3360:2: ( ruleEString )
            {
            // InternalGag.g:3360:2: ( ruleEString )
            // InternalGag.g:3361:3: ruleEString
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
    // InternalGag.g:3370:1: rule__Rule__Left_hand_sideAssignment_4 : ( ruleService ) ;
    public final void rule__Rule__Left_hand_sideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3374:1: ( ( ruleService ) )
            // InternalGag.g:3375:2: ( ruleService )
            {
            // InternalGag.g:3375:2: ( ruleService )
            // InternalGag.g:3376:3: ruleService
            {
             before(grammarAccess.getRuleAccess().getLeft_hand_sideServiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getLeft_hand_sideServiceParserRuleCall_4_0()); 

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
    // InternalGag.g:3385:1: rule__Rule__Right_hand_side_serviceAssignment_5_2 : ( ruleService ) ;
    public final void rule__Rule__Right_hand_side_serviceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3389:1: ( ( ruleService ) )
            // InternalGag.g:3390:2: ( ruleService )
            {
            // InternalGag.g:3390:2: ( ruleService )
            // InternalGag.g:3391:3: ruleService
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_2_0()); 

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
    // InternalGag.g:3400:1: rule__Rule__Right_hand_side_serviceAssignment_5_3_1 : ( ruleService ) ;
    public final void rule__Rule__Right_hand_side_serviceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3404:1: ( ( ruleService ) )
            // InternalGag.g:3405:2: ( ruleService )
            {
            // InternalGag.g:3405:2: ( ruleService )
            // InternalGag.g:3406:3: ruleService
            {
             before(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRight_hand_side_serviceServiceParserRuleCall_5_3_1_0()); 

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
    // InternalGag.g:3415:1: rule__Rule__GuardAssignment_6_1 : ( ruleGuard ) ;
    public final void rule__Rule__GuardAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3419:1: ( ( ruleGuard ) )
            // InternalGag.g:3420:2: ( ruleGuard )
            {
            // InternalGag.g:3420:2: ( ruleGuard )
            // InternalGag.g:3421:3: ruleGuard
            {
             before(grammarAccess.getRuleAccess().getGuardGuardParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getGuardGuardParserRuleCall_6_1_0()); 

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


    // $ANTLR start "rule__Guard__ClassPathAssignment_3"
    // InternalGag.g:3430:1: rule__Guard__ClassPathAssignment_3 : ( ruleEString ) ;
    public final void rule__Guard__ClassPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGag.g:3434:1: ( ( ruleEString ) )
            // InternalGag.g:3435:2: ( ruleEString )
            {
            // InternalGag.g:3435:2: ( ruleEString )
            // InternalGag.g:3436:3: ruleEString
            {
             before(grammarAccess.getGuardAccess().getClassPathEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getClassPathEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Guard__ClassPathAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});

}