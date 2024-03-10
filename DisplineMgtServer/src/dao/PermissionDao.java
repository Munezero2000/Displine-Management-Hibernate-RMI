
package dao;

import java.util.*;
import model.HibernateUtil;
import model.Permission;
import org.hibernate.Session;

/**
 *
 * @author Munezero
 */
public class PermissionDao {
    public Permission AddPermission(Permission permission) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(permission);
            ss.beginTransaction().commit();
            ss.close();
            return permission;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Permission updatePermission(Permission permission) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(permission);
            ss.beginTransaction().commit();
            ss.close();
            return permission;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Permission deletePermission(Permission permission) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(permission);
            ss.beginTransaction().commit();
            ss.close();
            return permission;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Permission searchPermission(Permission permission) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Permission thePermission = (Permission) ss.get(Permission.class, permission.getPermissionId());
            ss.close();
            return thePermission;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Permission> getAllPermission() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Permission> parks = ss.createQuery("select permission from Permission permission").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
