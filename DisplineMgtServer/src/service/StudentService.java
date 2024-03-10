package service;

import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface StudentService extends Remote {

    Student AddStudent(Student theStudent) throws RemoteException;

    Student updateStudent(Student theStudent) throws RemoteException;

    Student deleteStudent(Student theStudent) throws RemoteException;

    Student searchStudent(Student theStudent) throws RemoteException;

    List<Student> getAllStudent() throws RemoteException;
}
