package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.converters.FhirPatientConverter;
import com.github.jlgrock.snp.core.domain.fhir.model.Patient;
import com.github.jlgrock.snp.domain.data.PatientRepository;
import gov.vha.isaac.logic.LogicGraph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class PatientProcessor extends AbstractFhirProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientProcessor.class);

    private final Patient patient;
    private final FhirPatientConverter fhirPatientConverter;
    private final PatientRepository patientRepo;

    public PatientProcessor(final LogicGraphClassifier logicGraphClassifierIn, final Patient patientIn,
    		final FhirPatientConverter fhirPatientConverterIn, final PatientRepository patientRepositoryIn) {
        super(logicGraphClassifierIn);
        patient = patientIn;
        fhirPatientConverter = fhirPatientConverterIn;
        patientRepo = patientRepositoryIn;
    }

    @Override
    protected LogicGraph getLogicGraph() {
        throw new UnsupportedOperationException();
    }

	@Override
	public void process() {
        LOGGER.trace("Processing Patient {}", patient);
		com.github.jlgrock.snp.domain.types.Patient patientOut = fhirPatientConverter.convert(patient);
		patientRepo.save(patientOut);
	}
}
