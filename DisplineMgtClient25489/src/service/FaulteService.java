package service;

import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface FaulteService extends Remote {

    Faulte AddFaulte(Faulte theFaulte) throws RemoteException;

    Faulte updateFaulte(Faulte theFaulte) throws RemoteException;

    Faulte deleteFaulte(Faulte theFaulte) throws RemoteException;

    Faulte searchFaulte(Faulte theFaulte) throws RemoteException;

    List<Faulte> getAllFaulte() throws RemoteException;
}
