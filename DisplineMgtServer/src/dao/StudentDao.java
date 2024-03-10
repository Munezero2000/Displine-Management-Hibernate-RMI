
package dao;

import java.util.*;
import model.HibernateUtil;
import model.Student;
import org.hibernate.Session;

/**
 *
 * @author Munezero
 */
public class StudentDao {
    public Student AddStudent(Student student) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(student);
            ss.beginTransaction().commit();
            ss.close();
            return student;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Student updateStudent(Student student) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(student);
            ss.beginTransaction().commit();
            ss.close();
            return student;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Student deleteStudent(Student student) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(student);
            ss.beginTransaction().commit();
            ss.close();
            return student;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Student searchStudent(Student student) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Student theStudent = (Student) ss.get(Student.class, student.getStudentId());
            ss.close();
            return theStudent;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Student> getAllStudent() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Student> parks = ss.createQuery("select student from Student student").list();
            ss.close();
            return parks;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
