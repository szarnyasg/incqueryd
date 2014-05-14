package org.eclipse.incquery.patternlanguage.rdf.psystem

import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternBody
import org.eclipse.incquery.patternlanguage.patternLanguage.Variable
import org.eclipse.incquery.runtime.matchers.psystem.PBody
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery

import static extension org.eclipse.incquery.patternlanguage.rdf.psystem.PUtils.*
import static extension org.eclipse.incquery.patternlanguage.rdf.psystem.RdfPConstraint.*

class RdfPBody {

	static def PBody toPBody(PatternBody body, Pattern pattern, PQuery query, RdfPatternMatcherContext context) {
		new PBody(query) => [pBody |
			pBody.exportedParameters = pattern.parameters.map[parameter |
				parameter.toExportedParameter(pBody)
			]
			pBody.constraints.addAll(
				pattern.parameters.map[parameter |
					parameter.toPConstraint(pBody, context)
				] +
				body.constraints.map[constraint |
					constraint.toPConstraint(pBody, context)
				]
			)
		]
	}

	static def ExportedParameter toExportedParameter(Variable parameter, PBody pBody) {
		new ExportedParameter(pBody, parameter.toPVariable(pBody), parameter.name)
	}

}