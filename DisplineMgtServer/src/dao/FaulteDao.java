
package dao;

import java.util.*;
import model.HibernateUtil;
import model.Faulte;
import org.hibernate.Session;

/**
 *
 * @author Munezero
 */
public class FaulteDao {
    public Faulte AddFaulte(Faulte faulte) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(faulte);
            ss.beginTransaction().commit();
            ss.close();
            return faulte;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Faulte updateFaulte(Faulte faulte) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(faulte);
            ss.beginTransaction().commit();
            ss.close();
            return faulte;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Faulte deleteFaulte(Faulte faulte) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(faulte);
            ss.beginTransaction().commit();
            ss.close();
            return faulte;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Faulte searchFaulte(Faulte faulte) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Faulte theFaulte = (Faulte) ss.get(Faulte.class, faulte.getFaulteId());
            ss.close();
            return theFaulte;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Faulte> getAllFaulte() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Faulte> parks = ss.createQuery("select faulte from Faulte faulte").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
