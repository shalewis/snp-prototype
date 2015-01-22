package com.deloitte.mongo.domain.converters;

import com.deloitte.mongo.data.PatientRepository;
import com.deloitte.mongo.domain.Encounter;
import com.deloitte.mongo.domain.Observation;
import com.deloitte.mongo.domain.Patient;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jlgrock on 1/12/15.
 */
public class EncounterReadConverter implements Converter<DBObject, Encounter> {

    @Autowired
    ObservationReadConverter observationReadConverter;

    @Override
    public Encounter convert(DBObject source) {
        Encounter encounter = new Encounter();
        encounter.setId(((Long) source.get("_id")));
        encounter.setPatientId(((Number) source.get("patient_id")).longValue());
        encounter.setDate((Date) source.get("date"));
        encounter.setType(((Number) source.get("type")).intValue());
        encounter.setReasonForVisit((String) source.get("reason_for_visit"));

        List<Observation> observations = new ArrayList();
        ((List<DBObject>) source.get("observations")).forEach(observationReadConverter::convert);
        encounter.setObservations(observations);
        return encounter;
    }
}