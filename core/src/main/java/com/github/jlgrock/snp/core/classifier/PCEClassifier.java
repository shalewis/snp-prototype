package com.github.jlgrock.snp.core.classifier;

import gov.vha.isaac.logic.LogicGraph;

import com.github.jlgrock.snp.core.domain.ClassifiedAssertion;

/**
 * Replace Post Coordinated Expressions in Logic Graph with Classifier ID
 *
 */
public class PCEClassifier implements Classifier {

	@Override
	public String classify(final LogicGraph logicGraph) {
		// TODO call a service that takes a LogicGraph and returns a classifier ID
		return null;
	}
	
	public ClassifiedAssertion transform(String classifierID) {
		ClassifiedAssertion  classifiedAssertion = new ClassifiedAssertion();
		classifiedAssertion.setUuid(classifierID);
		return classifiedAssertion;
	}
	
}
