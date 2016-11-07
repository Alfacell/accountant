package ua.com.alfacell.dao.impl;

// Created by Ponomarenko Oleh on 21.08.2016.

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import ua.com.alfacell.dao.BaseDao;
import ua.com.alfacell.dao.CrudDao;
import ua.com.alfacell.models.Shop;

import java.util.List;

public class ShopDaoImpl extends BaseDao implements CrudDao<Shop> {
    @Override
    public Shop findById(int id) {
        Session session = getActiveSession();
        Shop shop = (Shop) session.createCriteria(Shop.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        return shop;
    }

    @Override
    public List<Shop> findAll() {
        Session session = getActiveSession();
        List<Shop> shops = session.createCriteria(Shop.class).list();
        return shops;
    }

    @Override
    public void save(Shop shop) {
        Session session = getActiveSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(shop);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Override
    public void update(Shop updateShop) {
        Session session = getActiveSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(updateShop);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Shop shop) {
        Session session = getActiveSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(shop);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
