package com.gabigutu;

import com.gabigutu.model.IDatabase;
import com.gabigutu.model.MongoDBDatabase;
import com.gabigutu.model.MySQLDatabase;

public class Main {

    public static void main(String[] args) {
	    IDatabase mySQLDatabase;
	    mySQLDatabase = initialDatabase();
	    // after a few months, boss decides to change database from MySQL to MongoDB
	    mySQLDatabase = changedDatabase();
    }

    private static IDatabase initialDatabase() {
        return new MySQLDatabase();
    }

    private static IDatabase changedDatabase() {
        return new MongoDBDatabase();
    }
}

