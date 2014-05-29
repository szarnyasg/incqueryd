package org.eclipse.incquery.patternlanguage.rdf

import hu.bme.mit.incqueryd.rdf.RdfUtils
import java.net.URL
import org.eclipse.emf.ecore.EObject
import org.eclipse.incquery.patternlanguage.rdf.rdfPatternLanguage.Iri
import org.eclipse.incquery.patternlanguage.rdf.rdfPatternLanguage.RdfPatternModel
import org.eclipse.incquery.patternlanguage.rdf.rdfPatternLanguage.Vocabulary
import org.openrdf.model.Model
import org.openrdf.model.Resource
import org.openrdf.model.impl.URIImpl

import static org.eclipse.emf.common.util.URI.*

import static extension org.eclipse.xtext.EcoreUtil2.*

class RdfPatternLanguageUtils {

	static def String asString(Iri iri) {
		val prefix = iri.prefix?.value ?: iri.getContainerOfType(RdfPatternModel)?.baseIriValue
		'''«prefix»«iri.value»'''
	}

	static def Resource toRdfResource(Iri iri) {
		new URIImpl(iri.asString)
	}

	static def Model getVocabulary(EObject object) {
		val patternModel = object.getContainerOfType(RdfPatternModel)
		RdfUtils.load(patternModel.vocabularies.map[url].toSet)
	}

	def static getUrl(Vocabulary vocabulary) {
		val uri = createURI(vocabulary.location)
		val resolvedUri = if (vocabulary.eResource == null) {
			uri
		} else {
			uri.resolve(vocabulary.eResource.URI)
		}
		new URL(resolvedUri.toString)
	}

}