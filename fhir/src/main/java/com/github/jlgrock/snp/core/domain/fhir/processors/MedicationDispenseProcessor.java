package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.MedicationDispense;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class MedicationDispenseProcessor extends AbstractFhirProcessor {

    @Inject
    public MedicationDispenseProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        MedicationDispense medicationDispense = (MedicationDispense) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return MedicationDispense.class;
    }
}
