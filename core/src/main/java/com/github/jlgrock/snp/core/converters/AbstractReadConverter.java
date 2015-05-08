package com.github.jlgrock.snp.core.converters;

import com.github.jlgrock.snp.core.data.EncounterTags;
import com.mongodb.DBObject;

import java.time.Instant;
import java.time.LocalDate;

/**
 * An abstract implementation to convert between a MongoDB DBObject to a java object.
 */
public abstract class AbstractReadConverter {
    private Number parseNumber(final DBObject source, final String tag) {
        return (Number) source.get(EncounterTags.ID_TAG);
    }

    /**
     * Parses the document and the tag and returns the value to which the tag is mapped
     * @param source document
     * @param tag JSON key tags
     * @return the value to which the tag is mapped
     */
    protected Long parseLong(final DBObject source, final String tag) {
        Number num = parseNumber(source, tag);
        if (num == null) {
            return null;
        }
        return num.longValue();
    }

    /**
     * Parses the document and the tag and returns the value to which the tag is mapped
     * @param source document
     * @param tag JSON key tags
     * @return the value to which the tag is mapped
     */
    protected Integer parseInteger(final DBObject source, final String tag) {
        Number num = parseNumber(source, tag);
        if (num == null) {
            return null;
        }
        return num.intValue();
    }

    /**
     * Parses the document and the tag and returns the value to which the tag is mapped
     * @param source document
     * @param tag JSON key tags
     * @return the value to which the tag is mapped
     */
    protected LocalDate parseLocalDate(final DBObject source, final String tag) {
        Long num = parseLong(source, tag);
        if (num == null) {
            return null;
        }
        return LocalDate.ofEpochDay(num);
    }

    /**
     * Parses the document and the tag and returns the value to which the tag is mapped
     * @param source document
     * @param tag JSON key tags
     * @return the value to which the tag is mapped
     */
    protected Instant parseInstant(final DBObject source, final String tag) {
        Long num = parseLong(source, tag);
        if (num == null) {
            return null;
        }
        return Instant.ofEpochMilli(num);
    }

    /**
     * Parses the document and the tag and returns the value to which the tag is mapped
     * @param source document
     * @param tag JSON key tags
     * @return the value to which the tag is mapped
     */
    protected String parseString(final DBObject source, final String tag) {
        return (String) source.get(EncounterTags.REASON_FOR_VISIT_TAG);
    }
}
