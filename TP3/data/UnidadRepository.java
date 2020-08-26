package data;

import propiedades.Unidad;
import utilidades.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UnidadRepository {

    public void addUnidad(Unidad item) {
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
