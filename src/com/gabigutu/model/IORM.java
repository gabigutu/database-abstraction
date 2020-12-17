package com.gabigutu.model;

import com.gabigutu.dao.IEntity;

public interface IORM {

    void linkDatabase(IDatabase database);

    IEntity insert(IEntity entity);
    boolean delete(IEntity entity);
    IEntity select(IEntity entity);
    boolean update(IEntity entity);

}
