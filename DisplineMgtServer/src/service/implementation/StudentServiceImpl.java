package service.implementation;

import dao.StudentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Student;
import service.StudentService;

/**
 *
 * @author Munezero
 */
public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    public StudentServiceImpl() throws RemoteException {
    }
    StudentDao dao = new StudentDao();

    @Override
    public Student AddStudent(Student theStudent) throws RemoteException {
        return dao.AddStudent(theStudent);
    }

    @Override
    public Student updateStudent(Student theStudent) throws RemoteException {
        return dao.updateStudent(theStudent);
    }

    @Override
    public Student deleteStudent(Student theStudent) throws RemoteException {
        return dao.deleteStudent(theStudent);
    }

    @Override
    public Student searchStudent(Student theStudent) throws RemoteException {
        return dao.searchStudent(theStudent);
    }

    @Override
    public List<Student> getAllStudent() throws RemoteException {
        return dao.getAllStudent();
    }

}
