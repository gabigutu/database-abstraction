package com.gabigutu.model;

import com.gabigutu.model.IDatabase;

import java.io.File;

public class MongoDBDatabase implements IDatabase {

    MongoDBDatabase() { }

    @Override
    // does nothing for MongoDB; added to implement the interface
    public void setConfiguration(String databaseName, String username, String password) {
        return;
    }

    @Override
    public void setConfiguration(String fileName) {
        File file = new File(fileName);
        // do what you need to do with the file
    }

}
