package data;

import propiedades.Inquilino;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InquilinoRepository {

    public void addInquilino(Inquilino user) {
     /*   Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }*/
    }
}
