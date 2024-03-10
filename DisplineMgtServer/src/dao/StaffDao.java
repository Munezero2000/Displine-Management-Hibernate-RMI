
package dao;

import java.util.*;
import model.HibernateUtil;
import model.Staff;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Munezero
 */
public class StaffDao {
    public Staff AddStaff(Staff Staff) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(Staff);
            ss.beginTransaction().commit();
            ss.close();
            return Staff;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Staff updateStaff(Staff Staff) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(Staff);
            ss.beginTransaction().commit();
            ss.close();
            return Staff;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Staff deleteStaff(Staff Staff) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(Staff);
            ss.beginTransaction().commit();
            ss.close();
            return Staff;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Staff searchStaff(Staff Staff) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Staff theStaff = (Staff) ss.get(Staff.class, Staff.getId());
            ss.close();
            return theStaff;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Staff searchStaffEmail(Staff staff) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Staff.class);
            criteria.add(Restrictions.eq("email", staff.getEmail()));

            Staff theStaff = (Staff) criteria.uniqueResult();

            session.close();
            return theStaff;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Staff> getAllStaff() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Staff> parks = ss.createQuery("select Staff from Staff Staff").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
