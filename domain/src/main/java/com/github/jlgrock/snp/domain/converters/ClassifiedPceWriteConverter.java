package com.github.jlgrock.snp.domain.converters;

import com.github.jlgrock.snp.apis.converters.WriteConverter;
import com.github.jlgrock.snp.domain.data.ClassifiedPceTags;
import com.github.jlgrock.snp.domain.data.SharedTags;
import com.github.jlgrock.snp.domain.types.ClassifiedPce;
import org.bson.Document;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * A Conversion class to convert between an PCE objects and a MongoDB DBObject.
 */
@Service
@Named
public class ClassifiedPceWriteConverter implements WriteConverter<ClassifiedPce, Document> {
    @Override
    public Document convert(final ClassifiedPce source) {
        Document dbo = new Document();
        if (source.getId() != null) {
            dbo.put(SharedTags.ID_TAG, source.getId());
        }
        if (source.getDesc() != null) {
            dbo.put(ClassifiedPceTags.DESCRIPTION_TAG, source.getDesc());
        }
        return dbo;

    }
}
