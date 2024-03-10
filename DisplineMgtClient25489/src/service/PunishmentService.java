package service;

import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface PunishmentService extends Remote {

    Punishment AddPunishment(Punishment thePunishment) throws RemoteException;

    Punishment updatePunishment(Punishment thePunishment) throws RemoteException;

    Punishment deletePunishment(Punishment thePunishment) throws RemoteException;

    Punishment searchPunishment(Punishment thePunishment) throws RemoteException;

    List<Punishment> getAllPunishment() throws RemoteException;
}
