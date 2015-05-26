package com.github.jlgrock.snp.core.domain.lego.classifiers;

import com.github.jlgrock.snp.core.domain.lego.Lego;
import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;

/**
 *
 */
public class LegoClassifier extends AbstractLegoClassifier {

    private final Lego lego;

    LegoClassifier(final TerminologyStoreDI terminologyStoreDI, final Lego legoIn) {
        super(terminologyStoreDI);
        lego = legoIn;
    }

    /**
     * {@inheritDoc}
     */
    public void classify() {
        parseLego(lego);
    }
}