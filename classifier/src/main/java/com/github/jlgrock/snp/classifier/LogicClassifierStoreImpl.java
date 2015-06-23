package com.github.jlgrock.snp.classifier;

import com.github.jlgrock.snp.apis.classifier.LogicClassifierStore;
import com.github.jlgrock.snp.apis.connection.configuration.FileConfiguration;
import gov.vha.isaac.logic.LogicService;
import gov.vha.isaac.metadata.coordinates.EditCoordinates;
import gov.vha.isaac.metadata.coordinates.LogicCoordinates;
import gov.vha.isaac.metadata.coordinates.StampCoordinates;
import gov.vha.isaac.metadata.coordinates.ViewCoordinates;
import gov.vha.isaac.ochre.api.IdentifierService;
import gov.vha.isaac.ochre.api.LookupService;
import gov.vha.isaac.ochre.api.TaxonomyService;
import gov.vha.isaac.ochre.api.constants.Constants;
import org.glassfish.hk2.runlevel.RunLevelController;
import org.ihtsdo.otf.tcc.api.coordinate.ViewCoordinate;
import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;
import org.ihtsdo.otf.tcc.model.index.service.IndexerBI;
import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;

/**
 * The default implementation of the classifier store, this stores data in ochre and lucene.
 * Because the objects retrieved here are powerful, control to this object is restricted to the
 * package.
 */
@Service
@Singleton
class LogicClassifierStoreImpl implements LogicClassifierStore {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogicClassifierStoreImpl.class);

    private final FileConfiguration fileConfiguration;

    /**
     * Constructor that will create and start the expression service.
     * @param fileConfigurationIn the configuration that will be used for the expression service
     */
    @Inject
    public LogicClassifierStoreImpl(final FileConfiguration fileConfigurationIn) {
        LOGGER.info("Starting Expression Service...");
        fileConfiguration = fileConfigurationIn;
        startExpressionService();
        runFullClassification();
    }

    /**
     * Classification consists of: converting the logic graph to axioms in memory, running the classification
     * algorithms over the axioms, retrieving the results, determining what changed, and then write back to the
     * logic graph assemblage. Running a full classification will likely take several minutes.
     */
    private void runFullClassification() {
        getLogicService().fullClassification(
                StampCoordinates.getDevelopmentLatest(),
                LogicCoordinates.getStandardElProfile(),
                EditCoordinates.getDefaultUserSolorOverlay());
    }

    @Override
    public void startExpressionService() {
        LOGGER.trace("RunLevelController runLevel: {}", LookupService.getService(RunLevelController.class).getCurrentRunLevel());

        if(!LookupService.isIsaacStarted()) {
            LOGGER.info("Setting System properties for Expression Service startup...");
            System.setProperty(Constants.CHRONICLE_COLLECTIONS_ROOT_LOCATION_PROPERTY, fileConfiguration.chronicleLocation().toString());
            System.setProperty(Constants.SEARCH_ROOT_LOCATION_PROPERTY, fileConfiguration.luceneLocation().toString());

            LookupService.startupIsaac();
            LOGGER.info("Expression Service is now up.");
        } else {
            LOGGER.warn("Expression Service is already up and running.");
        }
    }

    @Override
    public IndexerBI getIndexer() {
        return LookupService.getService(IndexerBI.class, "snomed id refex indexer");
    }

    @Override
    public TerminologyStoreDI getTerminologyStore() {
        return LookupService.getService(TerminologyStoreDI.class);
    }

    @Override
    public LogicService getLogicService() {
        return LookupService.getService(LogicService.class);
    }

    @Override
    public IdentifierService getIdentifierService() {
        return LookupService.getService(IdentifierService.class);
    }

    @Override
    public TaxonomyService getTaxonomyService() {
        return LookupService.getService(TaxonomyService.class);
    }

    @Override
    public void stopExpressionService() {
        LookupService.shutdownIsaac();
        LOGGER.info("System down...");
    }

    @Override
    public ViewCoordinate getViewCoordinates() {
        ViewCoordinate viewCoordinate = null;
        try {
            viewCoordinate = ViewCoordinates.getDevelopmentInferredLatest();
        } catch(IOException ioe) {
            LOGGER.error("Unable to get latest inferred view coordinates", ioe);
        }
        return viewCoordinate;
    }

}
