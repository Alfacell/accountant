
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import ua.com.alfacell.utilites.HibernateUtil;

public class HibernateTestConnection {

    @Test
    public void testConnection() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            System.out.println("All is OK!");
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
