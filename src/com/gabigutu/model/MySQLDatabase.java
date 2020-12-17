package com.gabigutu.model;

import com.gabigutu.model.IDatabase;

public class MySQLDatabase implements IDatabase {

    public MySQLDatabase() { }

    @Override
    public void setConfiguration(String databaseName, String username, String password) {
        // built the query string and connect to database
    }

    @Override
    // does nothing for MySQL; added to implement the interface
    public void setConfiguration(String fileName) {
        return;
    }

}
