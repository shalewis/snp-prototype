package com.github.jlgrock.snp.core.data;

import com.github.jlgrock.integration.sample.PocDemoCheck;
import com.github.jlgrock.snp.apis.connection.MongoDbFactory;
import com.github.jlgrock.snp.apis.data.MongoRepository;
import com.github.jlgrock.snp.apis.data.Page;
import com.github.jlgrock.snp.apis.data.Pageable;
import com.github.jlgrock.snp.apis.data.Sort;
import com.github.jlgrock.snp.apis.domain.MongoDomainObject;
import com.github.jlgrock.snp.apis.exceptions.DataAccessException;
import com.github.jlgrock.snp.core.connection.SimpleMongoDbFactory;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an Abstract implementation of the Spring Framework repository class for Java
 */
public abstract class AbstractRepositoryImpl<S extends MongoDomainObject<T>, T extends Serializable> implements MongoRepository<S, T> {

	
	/**
	 * 
	 * @param dbObjectin Data Base Object is an input parameter used in this method
	 * @return the method returns a Serializable S object as output
	 */
	protected abstract S convertCollection(final DBObject dbObjectin);	
	
	/**
	 * 
	 * @param an s Serializable object is used as an input parameter for this method
	 * @return the method returns an object of type DBObject
	 */
	protected abstract DBObject convertToDBObject(final S s);
	
	/**
	 * LOGGER is used to generate an error message if the database artifacts cannot be accesses
	 */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractRepositoryImpl.class);
	
    /**
     * variable of type MongoDbFactory used to create/access an MongoDB instance
     */
	private final MongoDbFactory mongoDbFactory;

	/**
	 * 
	 * @param mongoDbFactoryIn is set to the parameter mongoDbFactoryIn by the constructor
	 */
	protected AbstractRepositoryImpl(final MongoDbFactory mongoDbFactoryIn){
		mongoDbFactory = mongoDbFactoryIn;
	}
	
	/**
	 * 
	 * @return method will return a string 
	 */
	protected abstract String getCollection();

	/**
	 * 
	 * @return method returns a DBCollection object which contains a collection of data from the MongoD instance.
	 */
	private DBCollection dBCollection(){
       	DB db = null;
    	try {
			db = mongoDbFactory.db();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Could not get access to the data.", e);
		}   
       	return db.getCollection(getCollection());
	}

	/**
	 * Determine the id to use.
	 * @param obj the object to turn into an id
	 * @return an id that can be serialized.  If it cannot be serialied, the optional is returned and an error is
	 * logged.
	 */
	private Optional<?> serializeId(T obj) {
		Optional<?> returnval = null;
		if (obj instanceof Number || obj instanceof Binary || obj instanceof ObjectId || obj instanceof DBObject) {
			returnval = Optional.of(obj);
		} else if (obj instanceof MongoDomainObject) {
			returnval = Optional.of(((MongoDomainObject) obj).getId());
		} else {
			LOGGER.error("Cannot serialize id for class of type " + obj.getClass());
			return Optional.empty();
		}
		return returnval;
	}

	private List<?> serializeId(List<T> objs) {
		List<?> list = new ArrayList<>();
		for (Object obj : objs) {
			Optional<?> o = serializeId(obj);
			if (o.isPresent()) {
				list.add(o.get());
			}
		}
	}
	
    @Override
    public Iterable<S> findAll(Sort sort) {
    	List<S> sList = new ArrayList<S>();
	    DBCollection dbc1 = dBCollection();
	    if(sort = Sort.ASC){
	    
	    	dbc1.find().sort()	
	    }
	    else{
	    	
	    	
	    }
	    	
    	BasicDBObject query = new BasicDBObject (, sort); 
    	DBCursor x = dbc1.find(query);
        for(DBObject o:x){
        	sList.add(convertCollection(o));
        	}
		return sList;
    }

    @Override
    public Page<S> findAll(Pageable pageable) {
    	List<S> sList = new ArrayList<S>();
    	 DBCollection dbc1 = dBCollection();
    	BasicDBObject query = new BasicDBObject (pageable).skip(start).limit(count); 
    	dbc1.find(query);
        for(DBObject o:x){
        	sList.add(convertCollection(o));
        	}
		return sList;
    }

    @Override
    public <S1 extends S> S save(S1 entity) {
    	DBCollection dbc1 = dBCollection();
    	dbc1.save(convertToDBObject(entity));
    }

    @Override
    public <S1 extends S> Iterable<S1> save(Iterable<S1> entities) {
    	DBCollection dbc1 = dBCollection();
        for(S1 o:entities){
    	dbc1.save(convertToDBObject(o));
        }
    }

    @Override
    public S findOne(T t) {
    	List<S> sList = new ArrayList<S>();
    	DBCollection dbc1 = dBCollection();
    	BasicDBObject query = new BasicDBObject ("$eq", t); 
    	DBObject x = dbc1.findOne(query);
    	return convertCollection(x);
    }

    @Override
    public boolean exists(T t) { 
    	DBCollection dbc1 = dBCollection();
    	BasicDBObject query = new BasicDBObject ("$eq", t); 
    	DBCursor x = dbc1.find(query);
    	if(x != null){ return true;}
    	else{return false;}
        	}
     
    @Override
    public Iterable<S> findAll() {
    	List<S> sList = new ArrayList<S>();
    	DBCollection dbc1 = dBCollection();
    	DBCursor x = dbc1.find();
        for(DBObject o:x){
        	sList.add(convertCollection(o));	
        }
		return sList;
    }

    @Override
    public Iterable<S> findAll(Iterable<T> ids) {
    	List<S> sList = new ArrayList<S>();
    	DBCollection dbc1 = dBCollection();
    	BasicDBObject query = new BasicDBObject ("$in", ids); 
    	DBCursor x = dbc1.find(query);
        for(DBObject o:x){
        	sList.add(convertCollection(o));
        	}
		return sList;
    }
    
    @Override
    public long count() {
    	DBCollection dbc1 = dBCollection();
    	long x = dbc1.count();
    }

    @Override
    public void deleteById(T t) {
    	DBCollection dbc1 = dBCollection();
    	dbc1.remove(t); 
    }

    @Override
    public void delete(S entity) {
    	DBCollection dbc1 = dBCollection();
    	dbc1.remove(convertToDBObject(entity));    	
    }

    @Override
    public void delete(Iterable<? extends S> entities) {

    }

    @Override
    public void deleteAll() {
    	DBCollection dbc1 = dBCollection();
    	DBCursor x = dbc1.refind();
    	while (x.hasNext()) {
    		dbc1.remove(x.next());
    	}
    }
}