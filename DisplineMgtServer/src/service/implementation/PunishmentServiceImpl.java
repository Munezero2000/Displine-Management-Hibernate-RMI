package service.implementation;

import dao.PunishmentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Punishment;
import service.PunishmentService;

/**
 *
 * @author Munezero
 */
public class PunishmentServiceImpl extends UnicastRemoteObject implements PunishmentService {

    public PunishmentServiceImpl() throws RemoteException {
    }
    PunishmentDao dao = new PunishmentDao();

    @Override
    public Punishment AddPunishment(Punishment thePunishment) throws RemoteException {
        return dao.AddPunishment(thePunishment);
    }

    @Override
    public Punishment updatePunishment(Punishment thePunishment) throws RemoteException {
        return dao.updatePunishment(thePunishment);
    }

    @Override
    public Punishment deletePunishment(Punishment thePunishment) throws RemoteException {
        return dao.deletePunishment(thePunishment);
    }

    @Override
    public Punishment searchPunishment(Punishment thePunishment) throws RemoteException {
        return dao.searchPunishment(thePunishment);
    }

    @Override
    public List<Punishment> getAllPunishment() throws RemoteException {
        return dao.getAllPunishment();
    }

}
