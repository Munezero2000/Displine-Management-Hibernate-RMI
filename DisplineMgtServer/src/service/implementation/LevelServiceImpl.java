package service.implementation;

import dao.LevelDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.StudentLevel;
import service.LevelService;

/**
 *
 * @author Munezero
 */
public class LevelServiceImpl extends UnicastRemoteObject implements LevelService {

    public LevelServiceImpl() throws RemoteException {
    }
    LevelDao dao = new LevelDao();

    @Override
    public StudentLevel AddLevel(StudentLevel theLevel) throws RemoteException {
        return dao.AddLevel(theLevel);
    }

    @Override
    public StudentLevel updateLevel(StudentLevel theLevel) throws RemoteException {
        return dao.updateLevel(theLevel);
    }

    @Override
    public StudentLevel deleteLevel(StudentLevel theLevel) throws RemoteException {
        return dao.deleteLevel(theLevel);
    }

    @Override
    public StudentLevel searchLevel(StudentLevel theLevel) throws RemoteException {
        return dao.searchLevel(theLevel);
    }

    @Override
    public List<StudentLevel> getAllLevel() throws RemoteException {
        return dao.getAllLevel();
    }

}
