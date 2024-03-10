package service;
import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface LevelService extends Remote {
    StudentLevel AddLevel(StudentLevel level) throws RemoteException;

    StudentLevel updateLevel(StudentLevel level) throws RemoteException;

    StudentLevel deleteLevel(StudentLevel level) throws RemoteException;

    StudentLevel searchLevel(StudentLevel level) throws RemoteException;

    List<StudentLevel> getAllLevel() throws RemoteException;
}
