
package dao;

import java.util.*;
import model.HibernateUtil;
import model.Punishment;
import org.hibernate.Session;

/**
 *
 * @author Munezero
 */
public class PunishmentDao {
    public Punishment AddPunishment(Punishment punishment) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(punishment);
            ss.beginTransaction().commit();
            ss.close();
            return punishment;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Punishment updatePunishment(Punishment punishment) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(punishment);
            ss.beginTransaction().commit();
            ss.close();
            return punishment;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Punishment deletePunishment(Punishment punishment) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(punishment);
            ss.beginTransaction().commit();
            ss.close();
            return punishment;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Punishment searchPunishment(Punishment punishment) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Punishment thePunishment = (Punishment) ss.get(Punishment.class, punishment.getPunishmentId());
            ss.close();
            return thePunishment;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Punishment> getAllPunishment() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Punishment> parks = ss.createQuery("select punishment from Punishment punishment").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
