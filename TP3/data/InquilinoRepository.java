package data;

import propiedades.Inquilino;
import utilidades.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InquilinoRepository {

    public void addInquilino(Inquilino item) {
        Transaction trns = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
}
