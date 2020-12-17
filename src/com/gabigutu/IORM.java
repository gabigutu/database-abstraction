package com.gabigutu;

public interface IORM {

    void setDatabase(IDatabase database);

    void insert(IEntity entity);
    void delete(IEntity entity);
    void select(IEntity entity);
    void update(IEntity entity);

}
