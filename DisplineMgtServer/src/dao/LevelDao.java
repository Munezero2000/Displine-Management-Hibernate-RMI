
package dao;

import java.util.*;
import model.HibernateUtil;
import model.StudentLevel;
import org.hibernate.Session;

/**
 *
 * @author Munezero
 */
public class LevelDao {
    public StudentLevel AddLevel(StudentLevel level) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(level);
            ss.beginTransaction().commit();
            ss.close();
            return level;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public StudentLevel updateLevel(StudentLevel level) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(level);
            ss.beginTransaction().commit();
            ss.close();
            return level;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public StudentLevel deleteLevel(StudentLevel level) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(level);
            ss.beginTransaction().commit();
            ss.close();
            return level;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public StudentLevel searchLevel(StudentLevel level) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            StudentLevel theLevel = (StudentLevel) ss.get(StudentLevel.class, level.getLevelId());
            ss.close();
            return theLevel;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<StudentLevel> getAllLevel() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<StudentLevel> parks = ss.createQuery("select level from StudentLevel level").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
