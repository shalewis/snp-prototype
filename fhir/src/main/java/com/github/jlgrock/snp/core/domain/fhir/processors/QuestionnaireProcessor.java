package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.Questionnaire;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class QuestionnaireProcessor extends AbstractFhirProcessor {

    @Inject
    public QuestionnaireProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        Questionnaire questionnaire = (Questionnaire) unmarshalledObject;
		throw new UnsupportedOperationException();
		
	}

    @Override
    public Class processesType() {
        return Questionnaire.class;
    }
}
