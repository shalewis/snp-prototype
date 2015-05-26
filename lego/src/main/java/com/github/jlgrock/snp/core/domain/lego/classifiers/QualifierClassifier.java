package com.github.jlgrock.snp.core.domain.lego.classifiers;

import com.github.jlgrock.snp.core.domain.lego.Qualifier;
import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;

/**
 *
 */
public class QualifierClassifier extends AbstractLegoClassifier {

    private final Qualifier qualifier;

    QualifierClassifier(final TerminologyStoreDI terminologyStoreDI, final Qualifier qualifierIn) {
        super(terminologyStoreDI);
        qualifier = qualifierIn;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void classify() {
        throw new UnsupportedOperationException();
    }
}