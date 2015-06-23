package com.github.jlgrock.snp.web.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.jlgrock.snp.domain.data.PatientRepository;
import com.github.jlgrock.snp.domain.types.Gender;
import com.github.jlgrock.snp.domain.types.Patient;

import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.jlgrock.snp.domain.data.PatientRepository;
import com.github.jlgrock.snp.domain.types.Gender;
import com.github.jlgrock.snp.domain.types.Patient;
//import com.github.jlgrock.snp.domain.types.Race;
import com.google.common.io.CharStreams;

import static org.testng.Assert.assertEquals;

/**
 *
 */
public class PatientControllerTest extends GenericControllerTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientControllerTest.class);
	
	public static final String RESOURCE_URI = "patient";
	
	@Mock
	Patient patient;

	@Mock
	PatientRepository patientRepository;
	
	private PatientController patientController;


    @Override
    public void registerInjectionPoints(final ResourceConfig application) {
        application.register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindFactory(new Factory<PatientRepository>() {
                    @Override
                    public PatientRepository provide() {
                        return patientRepository;
                    }

                    @Override
                    public void dispose(PatientRepository instance) {
                    }
                }).to(PatientRepository.class).ranked(DEFAULT_HK2_TEST_BIND_RANK);;
            }
        });
    }

    @Override
	@BeforeMethod
    public void setUpTests() throws Exception {
        // Required to make this work on TestNG
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPatient() {
    	Mockito.when(patientRepository.findOneById(patient.getId())).thenReturn(patient);
        patientController = new PatientController(patientRepository);
    	Patient actual = patientController.getPatient(patient.getId());

    	assertEquals(actual, patient);
    }

    @Test
    public void testGetPatientRestCall() throws JsonProcessingException {
        Patient patientTemp = new Patient();
        patientTemp.setId(1l);
        patientTemp.setFirstName("a");
        patientTemp.setMiddleName("b");
        patientTemp.setLastName("c");
        patientTemp.setGender(Gender.FEMALE);
        Mockito.when(patientRepository.findOneById(Mockito.any())).thenReturn(patientTemp);
        final WebTarget target = target(RESOURCE_URI + "/1");
//        String response = target.request().get(String.class);
//        String serialized = JacksonConfig.newObjectMapper().writeValueAsString(patientTemp);
//        Assert.assertEquals(response, serialized);
    }
    
    @Test
    public void testGetPatientSearch() throws IOException {
    	final WebTarget target = target().path(RESOURCE_URI + "/search")
    			.queryParam("filter", "testf").queryParam("sort", "ASC").queryParam("fields", "1,2");
    	final Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
    	
    	LOGGER.debug("Patient search response: " + CharStreams.toString(new InputStreamReader((InputStream) response.getEntity())));
//    	Assert.assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
    }
    
//    @Test
//    public void testGetPatientSearchError() throws IOException {
//    	final WebTarget target = target().path(RESOURCE_URI + "/search");
//    	final Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
//    	
//    	LOGGER.debug("Patient search response error: " + CharStreams.toString(new InputStreamReader((InputStream) response.getEntity())));
//    	Assert.assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
//    }
}
