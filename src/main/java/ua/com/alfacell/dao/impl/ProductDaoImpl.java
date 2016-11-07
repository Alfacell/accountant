package ua.com.alfacell.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ua.com.alfacell.dao.BaseDao;
import ua.com.alfacell.dao.CrudDao;
import ua.com.alfacell.models.Product;

import java.util.List;

@Repository
public class ProductDaoImpl extends BaseDao implements CrudDao<Product> {
    @Override
    public Product findById(int id) {
        Session session = getActiveSession();
        Product product = (Product) session.createCriteria(Product.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        return product;
    }

    @Override
    public List<Product> findAll() {
        Session session = getActiveSession();
        List<Product> products = session.createCriteria(Product.class).list();
        return products;
    }

    @Override
    public void save(Product product) {
        Session session = getActiveSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(product);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Product updateProduct) {
        Session session = getActiveSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(updateProduct);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Product product) {
        Session session = getActiveSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(product);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
