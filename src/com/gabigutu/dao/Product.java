package com.gabigutu.dao;

public class Product implements IEntity {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
