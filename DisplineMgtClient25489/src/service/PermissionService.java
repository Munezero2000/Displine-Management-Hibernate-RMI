package service;

import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface PermissionService extends Remote {

    Permission AddPermission(Permission thePermission) throws RemoteException;

    Permission updatePermission(Permission thePermission) throws RemoteException;

    Permission deletePermission(Permission thePermission) throws RemoteException;

    Permission searchPermission(Permission thePermission) throws RemoteException;

    List<Permission> getAllPermission() throws RemoteException;
}
