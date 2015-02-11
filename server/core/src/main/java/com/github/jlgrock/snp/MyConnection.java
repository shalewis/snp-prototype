package com.github.jlgrock.snp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import com.mongodb.DB;
import org.springframework.stereotype.Component;
/**
 * 
 * @author jlgrock
 *
 */
@Component
public class MyConnection {

    private static Logger LOGGER = LoggerFactory.getLogger(MyConnection.class);

    private final MongoDbFactory mongo;
/**
 * 
 * @param mongo
 */
    @Autowired
    public MyConnection(final MongoDbFactory mongo) {
        this.mongo = mongo;
    }
/**
 *  
 *     
 */
    public void printAddress() {
        DB db = mongo.getDb();
        LOGGER.info("db address: {}", db.getMongo().getAddress());
    }

}

