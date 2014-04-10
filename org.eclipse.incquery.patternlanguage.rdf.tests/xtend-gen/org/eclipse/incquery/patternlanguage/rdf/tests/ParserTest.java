package org.eclipse.incquery.patternlanguage.rdf.tests;

import com.google.inject.Inject;
import org.eclipse.incquery.patternlanguage.rdf.RdfPatternLanguageInjectorProvider;
import org.eclipse.incquery.patternlanguage.rdf.rdfPatternLanguage.Base;
import org.eclipse.incquery.patternlanguage.rdf.rdfPatternLanguage.PatternModel;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(RdfPatternLanguageInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<PatternModel> parser;
  
  @Test
  public void posLength() {
    try {
      final String expectedBaseIri = "<http://example.org/>";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("base ");
      _builder.append(expectedBaseIri, "");
      _builder.newLineIfNotEmpty();
      _builder.append("prefix train: <http://train.org/>");
      _builder.newLine();
      _builder.append("prefix xsd: <http://www.w3.org/2001/XMLSchema#>");
      _builder.newLine();
      _builder.append("pattern posLength(Source, Target) = {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<Segment>(Source);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("train:<Segment_length>(Source, Target);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("check((Target as Integer) <= 0);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final PatternModel model = this.parser.parse(_builder);
      Base _base = model.getBase();
      String _iri = _base.getIri();
      Assert.assertEquals(expectedBaseIri, _iri);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}