package com.gabigutu;

public interface IDatabase {

//    void setConfiguration(String connectionString);
    void setConfiguration(String databaseName, String username, String password);
    void setConfiguration(String fileName);

}
