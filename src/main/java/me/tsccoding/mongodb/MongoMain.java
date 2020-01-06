package me.tsccoding.mongodb;


import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class MongoMain {


    public static void main(String args[]) throws UnknownHostException {

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB mongoDatabase = mongoClient.getDB("TheDatabaseName");
        DBCollection collection = mongoDatabase.getCollection("TheCollectionName");

        DBObject query = new BasicDBObject("_id", "jo");
        collection.findAndRemove(query);
        collection.findAndRemove(query);


        DBObject person = new BasicDBObject("_id", "jo")
                .append("name", "Jo Bloggs")
                .append("age", 34)
                .append("address", new BasicDBObject("street", "123 Fake St")
                        .append("city", "Faketon")
                        .append("state", "MA")
                        .append("zip", 12345))
                .append("books", Arrays.asList(27464, 747854));

        System.out.println("Collection Aggregrated.");

        collection.insert(person);

        DBCursor cursor = collection.find(query);
        DBObject jo = cursor.one();

     //   Klient k = new Klient(jo);
     //   System.out.println(k.toString());

        System.out.println(jo.toString());
        System.out.println((String)cursor.one().get("name"));
        System.out.println(Integer.toString((Integer) jo.get("age")));


    }


}
