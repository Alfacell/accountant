package ua.com.alfacell.service;

// Created by Ponomarenko Oleh on 31.08.2016.

import java.util.List;

public interface CrudService<T> {

    T findById(int id);

    List<T> findAll();

    void save(T t);

    void update(T t);

    void delete(T t);

}
