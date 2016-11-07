package ua.com.alfacell.dao;

import java.util.List;

public interface CrudDao<T> {

    T findById(int id);

    List<T> findAll();

    void save(T t);

    void update(T t);

    void delete(T t);


}
