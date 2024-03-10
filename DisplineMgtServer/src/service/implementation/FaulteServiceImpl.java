package service.implementation;

import dao.FaulteDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Faulte;
import service.FaulteService;

/**
 *
 * @author Munezero
 */
public class FaulteServiceImpl extends UnicastRemoteObject implements FaulteService {

    public FaulteServiceImpl() throws RemoteException {
    }
    FaulteDao dao = new FaulteDao();

    @Override
    public Faulte AddFaulte(Faulte theFaulte) throws RemoteException {
        return dao.AddFaulte(theFaulte);
    }

    @Override
    public Faulte updateFaulte(Faulte theFaulte) throws RemoteException {
        return dao.updateFaulte(theFaulte);
    }

    @Override
    public Faulte deleteFaulte(Faulte theFaulte) throws RemoteException {
        return dao.deleteFaulte(theFaulte);
    }

    @Override
    public Faulte searchFaulte(Faulte theFaulte) throws RemoteException {
        return dao.searchFaulte(theFaulte);
    }

    @Override
    public List<Faulte> getAllFaulte() throws RemoteException {
        return dao.getAllFaulte();
    }

}
