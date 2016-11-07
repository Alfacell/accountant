package ua.com.alfacell.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.com.alfacell.utilites.HibernateUtil;

public class BaseDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    protected Session getActiveSession() {
        Session session = sessionFactory.openSession();
        return session;
    }
}
