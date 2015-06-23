package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.Device;
import gov.vha.isaac.logic.LogicGraph;

/**
 *
 */
public class DeviceProcessor extends AbstractFhirProcessor {

    private final Device device;

    public DeviceProcessor(final LogicGraphClassifier logicGraphClassifierIn, final Device deviceIn) {
        super(logicGraphClassifierIn);
        device = deviceIn;
    }

    @Override
    protected LogicGraph getLogicGraph() {
        throw new UnsupportedOperationException();
    }

	@Override
	public void process() {
		throw new UnsupportedOperationException();
		
	}

}
