package ua.com.alfacell.dao.impl;

// Created by Ponomarenko Oleh on 21.08.2016.

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import ua.com.alfacell.dao.BaseDao;
import ua.com.alfacell.dao.CrudDao;
import ua.com.alfacell.models.Category;

import java.util.List;

public class CategoryDaoImpl extends BaseDao implements CrudDao<Category> {

    @Override
    public Category findById(int id) {
        Session session = getActiveSession();
        Category category = (Category) session.createCriteria(Category.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        return category;
    }

    @Override
    public List<Category> findAll() {
        Session session = getActiveSession();
        List<Category> categories = session.createCriteria(Category.class).list();
        return categories;
    }

    @Override
    public void save(Category category) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(category);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Category updateCategory) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(updateCategory);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Category category) {
        Session session = getActiveSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(category);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
