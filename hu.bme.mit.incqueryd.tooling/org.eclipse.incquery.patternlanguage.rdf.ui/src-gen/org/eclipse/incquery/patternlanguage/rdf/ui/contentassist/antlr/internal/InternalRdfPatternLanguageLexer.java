package org.eclipse.incquery.patternlanguage.rdf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdfPatternLanguageLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=6;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_DECIMAL=8;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_RAW_IRI=4;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalRdfPatternLanguageLexer() {;} 
    public InternalRdfPatternLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRdfPatternLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:11:7: ( '=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:12:7: ( '||' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:13:7: ( '&&' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:13:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:14:7: ( 'true' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:14:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:15:7: ( 'false' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:15:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:16:7: ( 'TRUE' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:16:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:17:7: ( 'FALSE' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:17:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:18:7: ( '+=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:18:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:19:7: ( '-=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:19:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:20:7: ( '*=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:20:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:21:7: ( '/=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:21:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:22:7: ( '%=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:22:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:23:7: ( '==' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:23:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:24:7: ( '!=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:24:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:25:7: ( '===' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:25:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26:7: ( '!==' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:27:7: ( '>=' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:28:7: ( '>' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:29:7: ( '<' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:29:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:30:7: ( '->' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:30:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:31:7: ( '..<' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:31:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:32:7: ( '..' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:32:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:33:7: ( '=>' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:33:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:34:7: ( '<>' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:34:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:35:7: ( '?:' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:35:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:36:7: ( '+' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:37:7: ( '-' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:38:7: ( '*' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:39:7: ( '**' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:39:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:40:7: ( '/' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:40:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:41:7: ( '%' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:41:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:42:7: ( '!' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:42:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:43:7: ( '++' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:43:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:44:7: ( '--' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:44:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:45:7: ( '.' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:45:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:46:7: ( 'val' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:46:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:47:7: ( 'extends' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:47:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:48:7: ( 'static' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:48:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:49:7: ( 'import' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:49:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:50:7: ( 'extension' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:50:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:51:7: ( 'super' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:51:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:52:7: ( 'base' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:52:9: 'base'
            {
            match("base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:53:7: ( 'vocabulary' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:53:9: 'vocabulary'
            {
            match("vocabulary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:54:7: ( 'prefix' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:54:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:55:7: ( ':' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:55:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:56:7: ( '(' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:56:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:57:7: ( ')' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:57:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:58:7: ( ',' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:58:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:59:7: ( 'check' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:59:9: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:60:7: ( '^^' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:60:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:61:7: ( '@' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:61:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:62:7: ( 'pattern' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:62:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:63:7: ( 'or' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:63:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:64:7: ( '{' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:64:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:65:7: ( '}' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:65:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:66:7: ( ';' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:66:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:67:7: ( 'find' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:67:9: 'find'
            {
            match("find"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:68:7: ( '[' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:68:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:69:7: ( ']' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:69:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:70:7: ( 'eval' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:70:9: 'eval'
            {
            match("eval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:71:7: ( 'count' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:71:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:72:7: ( 'instanceof' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:72:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:73:7: ( 'as' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:73:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:74:7: ( '#' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:74:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:75:7: ( 'if' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:75:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:76:7: ( 'else' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:76:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:77:7: ( 'switch' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:77:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:78:7: ( 'default' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:78:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:79:7: ( 'case' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:79:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:80:7: ( 'for' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:80:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:81:7: ( 'while' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:81:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:82:7: ( 'do' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:82:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:83:7: ( 'new' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:83:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:84:7: ( 'null' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:84:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:85:7: ( 'typeof' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:85:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:86:7: ( 'throw' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:86:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:87:7: ( 'return' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:87:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:88:7: ( 'try' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:88:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:89:7: ( 'finally' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:89:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:90:7: ( 'synchronized' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:90:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:91:7: ( 'catch' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:91:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:92:7: ( '?' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:92:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:93:7: ( '&' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:93:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:94:7: ( 'private' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:94:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:95:7: ( 'neg' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:95:9: 'neg'
            {
            match("neg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:96:7: ( '::' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:96:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:97:8: ( '?.' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:97:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:98:8: ( '|' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:98:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:99:8: ( 'var' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:99:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "RULE_RAW_IRI"
    public final void mRULE_RAW_IRI() throws RecognitionException {
        try {
            int _type = RULE_RAW_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26274:14: ( '<' ( '\\\\>' | ~ ( '>' ) )* '>' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26274:16: '<' ( '\\\\>' | ~ ( '>' ) )* '>'
            {
            match('<'); 
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26274:20: ( '\\\\>' | ~ ( '>' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='>') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }

                        else {
                            alt1=2;
                        }

                    }
                    else if ( ((LA1_2>='\u0000' && LA1_2<='=')||(LA1_2>='?' && LA1_2<='\uFFFF')) ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='=')||(LA1_0>='?' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26274:21: '\\\\>'
            	    {
            	    match("\\>"); 


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26274:27: ~ ( '>' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAW_IRI"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:12: ( '0x' | '0X' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='x') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='X') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='#') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='B'||LA4_0=='b') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='L'||LA4_0=='l') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26276:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26278:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26278:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26278:21: ( '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||LA6_0=='_') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:36: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='B'||LA9_0=='b') ) {
                alt9=1;
            }
            else if ( (LA9_0=='D'||LA9_0=='F'||LA9_0=='L'||LA9_0=='d'||LA9_0=='f'||LA9_0=='l') ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26280:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26282:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26282:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26282:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26282:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26282:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='$'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:44: ( '\"' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\"') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:79: ( '\\'' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\'') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26284:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26286:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26286:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26286:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26286:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26288:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26290:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26290:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26290:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26292:16: ( . )
            // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:26292:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_RAW_IRI | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=99;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:547: RULE_RAW_IRI
                {
                mRULE_RAW_IRI(); 

                }
                break;
            case 91 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:560: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 92 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:569: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 93 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:578: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 94 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:591: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:599: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 96 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:611: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 97 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:627: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 98 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:643: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 99 :
                // ../org.eclipse.incquery.patternlanguage.rdf.ui/src-gen/org/eclipse/incquery/patternlanguage/rdf/ui/contentassist/antlr/internal/InternalRdfPatternLanguage.g:1:651: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\64\1\66\1\70\4\74\1\104\1\110\1\113\1\117\1\121\1\123\1\125\1\127\1\132\1\135\6\74\1\156\3\uffff\1\74\1\61\1\uffff\1\74\5\uffff\1\74\1\uffff\4\74\2\u0086\5\uffff\1\u008c\6\uffff\3\74\1\uffff\5\74\20\uffff\1\u0097\6\uffff\1\u009a\4\uffff\13\74\1\u00a7\3\74\5\uffff\3\74\2\uffff\1\u00b0\5\uffff\1\u00b1\1\uffff\1\74\1\u00b3\4\74\2\uffff\1\u0086\5\uffff\1\74\1\u00ba\4\74\1\u00c0\2\74\5\uffff\1\u00c3\1\u00c4\12\74\1\uffff\10\74\2\uffff\1\74\1\uffff\1\74\1\u00d9\1\u00da\2\74\1\u00dd\1\uffff\3\74\1\u00e1\1\74\1\uffff\1\u00e3\1\74\2\uffff\2\74\1\u00e7\1\u00e8\6\74\1\u00ef\5\74\1\u00f5\3\74\2\uffff\1\u00f9\1\74\1\uffff\1\74\1\u00fc\1\u00fd\1\uffff\1\74\1\uffff\1\u00ff\2\74\2\uffff\1\74\1\u0104\4\74\1\uffff\3\74\1\u010c\1\u010d\1\uffff\1\u010e\1\74\1\u0110\1\uffff\1\74\1\u0112\2\uffff\1\74\1\uffff\3\74\1\u0117\1\uffff\1\u0118\1\74\1\u011a\1\74\1\u011c\2\74\3\uffff\1\74\1\uffff\1\u0120\1\uffff\1\u0121\1\74\1\u0123\1\74\2\uffff\1\74\1\uffff\1\74\1\uffff\1\u0127\1\u0128\1\u0129\2\uffff\1\74\1\uffff\3\74\3\uffff\1\74\1\u012f\2\74\1\u0132\1\uffff\1\74\1\u0134\1\uffff\1\74\1\uffff\1\u0136\1\uffff";
    static final String DFA22_eofS =
        "\u0137\uffff";
    static final String DFA22_minS =
        "\1\0\1\75\1\174\1\46\1\150\1\141\1\122\1\101\1\53\1\55\2\52\3\75\1\0\2\56\1\141\1\154\1\164\1\146\2\141\1\72\3\uffff\1\141\1\44\1\uffff\1\162\5\uffff\1\163\1\uffff\1\145\1\150\2\145\2\60\5\uffff\1\75\6\uffff\1\165\1\160\1\162\1\uffff\1\154\1\156\1\162\1\125\1\114\20\uffff\1\75\6\uffff\1\74\4\uffff\1\154\1\143\1\164\1\141\1\163\1\141\1\160\1\151\1\156\1\160\1\163\1\44\1\163\1\145\1\164\5\uffff\1\145\1\165\1\163\2\uffff\1\44\5\uffff\1\44\1\uffff\1\146\1\44\1\151\1\147\1\154\1\164\2\uffff\1\60\5\uffff\1\145\1\44\1\145\1\157\1\163\1\141\1\44\1\105\1\123\5\uffff\2\44\1\141\1\145\1\154\1\145\1\164\1\145\1\164\1\143\1\157\1\164\1\uffff\1\145\1\146\1\166\1\164\1\143\1\156\1\145\1\143\2\uffff\1\141\1\uffff\1\154\2\44\1\154\1\165\1\44\1\uffff\1\157\1\167\1\145\1\44\1\154\1\uffff\1\44\1\105\2\uffff\1\142\1\156\2\44\1\151\1\162\1\143\1\150\1\162\1\141\1\44\1\151\1\141\1\145\1\153\1\164\1\44\1\150\1\165\1\145\2\uffff\1\44\1\162\1\uffff\1\146\2\44\1\uffff\1\154\1\uffff\1\44\1\165\1\144\2\uffff\1\143\1\44\1\150\1\162\1\164\1\156\1\uffff\1\170\1\164\1\162\2\44\1\uffff\1\44\1\154\1\44\1\uffff\1\156\1\44\2\uffff\1\171\1\uffff\1\154\1\163\1\151\1\44\1\uffff\1\44\1\157\1\44\1\143\1\44\1\145\1\156\3\uffff\1\164\1\uffff\1\44\1\uffff\1\44\1\141\1\44\1\157\2\uffff\1\156\1\uffff\1\145\1\uffff\3\44\2\uffff\1\162\1\uffff\1\156\1\151\1\157\3\uffff\1\171\1\44\1\172\1\146\1\44\1\uffff\1\145\1\44\1\uffff\1\144\1\uffff\1\44\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\76\1\174\1\46\1\171\1\157\1\122\1\101\1\75\1\76\5\75\1\uffff\1\56\1\72\1\157\1\170\1\171\1\156\1\141\1\162\1\72\3\uffff\1\157\1\172\1\uffff\1\162\5\uffff\1\163\1\uffff\1\157\1\150\1\165\1\145\1\170\1\154\5\uffff\1\75\6\uffff\1\171\1\160\1\162\1\uffff\1\154\1\156\1\162\1\125\1\114\20\uffff\1\75\6\uffff\1\74\4\uffff\1\162\1\143\1\164\1\141\1\163\1\141\1\160\1\151\1\156\1\160\1\163\1\172\1\163\1\151\1\164\5\uffff\1\145\1\165\1\164\2\uffff\1\172\5\uffff\1\172\1\uffff\1\146\1\172\1\151\1\167\1\154\1\164\2\uffff\1\154\5\uffff\1\145\1\172\1\145\1\157\1\163\1\144\1\172\1\105\1\123\5\uffff\2\172\1\141\1\145\1\154\1\145\1\164\1\145\1\164\1\143\1\157\1\164\1\uffff\1\145\1\146\1\166\1\164\1\143\1\156\1\145\1\143\2\uffff\1\141\1\uffff\1\154\2\172\1\154\1\165\1\172\1\uffff\1\157\1\167\1\145\1\172\1\154\1\uffff\1\172\1\105\2\uffff\1\142\1\156\2\172\1\151\1\162\1\143\1\150\1\162\1\141\1\172\1\151\1\141\1\145\1\153\1\164\1\172\1\150\1\165\1\145\2\uffff\1\172\1\162\1\uffff\1\146\2\172\1\uffff\1\154\1\uffff\1\172\1\165\1\163\2\uffff\1\143\1\172\1\150\1\162\1\164\1\156\1\uffff\1\170\1\164\1\162\2\172\1\uffff\1\172\1\154\1\172\1\uffff\1\156\1\172\2\uffff\1\171\1\uffff\1\154\1\163\1\151\1\172\1\uffff\1\172\1\157\1\172\1\143\1\172\1\145\1\156\3\uffff\1\164\1\uffff\1\172\1\uffff\1\172\1\141\1\172\1\157\2\uffff\1\156\1\uffff\1\145\1\uffff\3\172\2\uffff\1\162\1\uffff\1\156\1\151\1\157\3\uffff\1\171\2\172\1\146\1\172\1\uffff\1\145\1\172\1\uffff\1\144\1\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\31\uffff\1\56\1\57\1\60\2\uffff\1\63\1\uffff\1\66\1\67\1\70\1\72\1\73\1\uffff\1\100\6\uffff\1\136\2\137\1\142\1\143\1\uffff\1\27\1\1\1\2\1\130\1\3\1\123\3\uffff\1\136\5\uffff\1\10\1\41\1\32\1\11\1\24\1\42\1\33\1\12\1\35\1\34\1\13\1\140\1\141\1\36\1\14\1\37\1\uffff\1\40\1\21\1\22\1\30\1\23\1\132\1\uffff\1\43\1\31\1\127\1\122\17\uffff\1\126\1\55\1\56\1\57\1\60\3\uffff\1\62\1\63\1\uffff\1\66\1\67\1\70\1\72\1\73\1\uffff\1\100\6\uffff\1\133\1\134\1\uffff\1\135\1\137\1\142\1\17\1\15\11\uffff\1\20\1\16\1\30\1\25\1\26\14\uffff\1\101\10\uffff\1\65\1\77\1\uffff\1\110\6\uffff\1\116\5\uffff\1\106\2\uffff\1\44\1\131\24\uffff\1\111\1\125\2\uffff\1\4\3\uffff\1\71\1\uffff\1\6\3\uffff\1\74\1\102\6\uffff\1\52\5\uffff\1\105\3\uffff\1\112\2\uffff\1\114\1\5\1\uffff\1\7\4\uffff\1\51\7\uffff\1\61\1\75\1\121\1\uffff\1\107\1\uffff\1\113\4\uffff\1\46\1\103\1\uffff\1\47\1\uffff\1\54\3\uffff\1\115\1\117\1\uffff\1\45\3\uffff\1\124\1\64\1\104\5\uffff\1\50\2\uffff\1\53\1\uffff\1\76\1\uffff\1\120";
    static final String DFA22_specialS =
        "\1\0\16\uffff\1\1\u0127\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\15\1\56\1\46\1\55\1\14\1\3\1\57\1\31\1\32\1\12\1\10\1\33\1\11\1\20\1\13\1\53\11\54\1\30\1\42\1\17\1\1\1\16\1\21\1\36\5\55\1\7\15\55\1\6\6\55\1\43\1\61\1\44\1\35\1\55\1\61\1\45\1\26\1\34\1\47\1\23\1\5\2\55\1\25\4\55\1\51\1\37\1\27\1\55\1\52\1\24\1\4\1\55\1\22\1\50\3\55\1\40\1\2\1\41\uff82\61",
            "\1\62\1\63",
            "\1\65",
            "\1\67",
            "\1\73\11\uffff\1\71\6\uffff\1\72",
            "\1\75\7\uffff\1\76\5\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\103\21\uffff\1\102",
            "\1\107\17\uffff\1\105\1\106",
            "\1\112\22\uffff\1\111",
            "\1\115\4\uffff\1\116\15\uffff\1\114",
            "\1\120",
            "\1\122",
            "\1\124",
            "\76\130\1\126\uffc1\130",
            "\1\131",
            "\1\134\13\uffff\1\133",
            "\1\136\15\uffff\1\137",
            "\1\142\11\uffff\1\141\1\uffff\1\140",
            "\1\143\1\144\1\uffff\1\145\1\uffff\1\146",
            "\1\151\6\uffff\1\147\1\150",
            "\1\152",
            "\1\154\20\uffff\1\153",
            "\1\155",
            "",
            "",
            "",
            "\1\164\6\uffff\1\162\6\uffff\1\163",
            "\1\74\34\uffff\32\74\3\uffff\1\165\1\74\1\uffff\32\74",
            "",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "",
            "\1\177\11\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082\17\uffff\1\u0083",
            "\1\u0084",
            "\12\u0087\10\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088\13\uffff\1\u0085\6\uffff\1\u0087\2\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088\13\uffff\1\u0085",
            "\12\u0087\10\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088\22\uffff\1\u0087\2\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d\3\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "\1\u009b\5\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00a8",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\1\u00af",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u00b2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00b4",
            "\1\u00b6\17\uffff\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\12\u0087\10\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088\22\uffff\1\u0087\2\uffff\1\u0088\1\uffff\3\u0088\5\uffff\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b9",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00bf\2\uffff\1\u00be",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00db",
            "\1\u00dc",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00e2",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00e4",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u00fe",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0100",
            "\1\u0101\16\uffff\1\u0102",
            "",
            "",
            "\1\u0103",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u010f",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0111",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0119",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "",
            "\1\u011f",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0122",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0124",
            "",
            "",
            "\1\u0125",
            "",
            "\1\u0126",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "",
            "\1\u012e",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0130",
            "\1\u0131",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0133",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0135",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_RAW_IRI | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='=') ) {s = 1;}

                        else if ( (LA22_0=='|') ) {s = 2;}

                        else if ( (LA22_0=='&') ) {s = 3;}

                        else if ( (LA22_0=='t') ) {s = 4;}

                        else if ( (LA22_0=='f') ) {s = 5;}

                        else if ( (LA22_0=='T') ) {s = 6;}

                        else if ( (LA22_0=='F') ) {s = 7;}

                        else if ( (LA22_0=='+') ) {s = 8;}

                        else if ( (LA22_0=='-') ) {s = 9;}

                        else if ( (LA22_0=='*') ) {s = 10;}

                        else if ( (LA22_0=='/') ) {s = 11;}

                        else if ( (LA22_0=='%') ) {s = 12;}

                        else if ( (LA22_0=='!') ) {s = 13;}

                        else if ( (LA22_0=='>') ) {s = 14;}

                        else if ( (LA22_0=='<') ) {s = 15;}

                        else if ( (LA22_0=='.') ) {s = 16;}

                        else if ( (LA22_0=='?') ) {s = 17;}

                        else if ( (LA22_0=='v') ) {s = 18;}

                        else if ( (LA22_0=='e') ) {s = 19;}

                        else if ( (LA22_0=='s') ) {s = 20;}

                        else if ( (LA22_0=='i') ) {s = 21;}

                        else if ( (LA22_0=='b') ) {s = 22;}

                        else if ( (LA22_0=='p') ) {s = 23;}

                        else if ( (LA22_0==':') ) {s = 24;}

                        else if ( (LA22_0=='(') ) {s = 25;}

                        else if ( (LA22_0==')') ) {s = 26;}

                        else if ( (LA22_0==',') ) {s = 27;}

                        else if ( (LA22_0=='c') ) {s = 28;}

                        else if ( (LA22_0=='^') ) {s = 29;}

                        else if ( (LA22_0=='@') ) {s = 30;}

                        else if ( (LA22_0=='o') ) {s = 31;}

                        else if ( (LA22_0=='{') ) {s = 32;}

                        else if ( (LA22_0=='}') ) {s = 33;}

                        else if ( (LA22_0==';') ) {s = 34;}

                        else if ( (LA22_0=='[') ) {s = 35;}

                        else if ( (LA22_0==']') ) {s = 36;}

                        else if ( (LA22_0=='a') ) {s = 37;}

                        else if ( (LA22_0=='#') ) {s = 38;}

                        else if ( (LA22_0=='d') ) {s = 39;}

                        else if ( (LA22_0=='w') ) {s = 40;}

                        else if ( (LA22_0=='n') ) {s = 41;}

                        else if ( (LA22_0=='r') ) {s = 42;}

                        else if ( (LA22_0=='0') ) {s = 43;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 44;}

                        else if ( (LA22_0=='$'||(LA22_0>='A' && LA22_0<='E')||(LA22_0>='G' && LA22_0<='S')||(LA22_0>='U' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='j' && LA22_0<='m')||LA22_0=='q'||LA22_0=='u'||(LA22_0>='x' && LA22_0<='z')) ) {s = 45;}

                        else if ( (LA22_0=='\"') ) {s = 46;}

                        else if ( (LA22_0=='\'') ) {s = 47;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 48;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_15 = input.LA(1);

                        s = -1;
                        if ( (LA22_15=='>') ) {s = 86;}

                        else if ( ((LA22_15>='\u0000' && LA22_15<='=')||(LA22_15>='?' && LA22_15<='\uFFFF')) ) {s = 88;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}