package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.OperationOutcome;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class OperationOutcomeProcessor extends AbstractFhirProcessor {

    @Inject
    public OperationOutcomeProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        OperationOutcome operationOutcome = (OperationOutcome) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return OperationOutcome.class;
    }
}
