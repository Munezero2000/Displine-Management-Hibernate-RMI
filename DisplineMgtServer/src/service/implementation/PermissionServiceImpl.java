package service.implementation;

import dao.PermissionDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Permission;
import service.PermissionService;

/**
 *
 * @author Munezero
 */
public class PermissionServiceImpl extends UnicastRemoteObject implements PermissionService {

    public PermissionServiceImpl() throws RemoteException {
    }
    PermissionDao dao = new PermissionDao();

    @Override
    public Permission AddPermission(Permission thePermission) throws RemoteException {
        return dao.AddPermission(thePermission);
    }

    @Override
    public Permission updatePermission(Permission thePermission) throws RemoteException {
        return dao.updatePermission(thePermission);
    }

    @Override
    public Permission deletePermission(Permission thePermission) throws RemoteException {
        return dao.deletePermission(thePermission);
    }

    @Override
    public Permission searchPermission(Permission thePermission) throws RemoteException {
        return dao.searchPermission(thePermission);
    }

    @Override
    public List<Permission> getAllPermission() throws RemoteException {
        return dao.getAllPermission();
    }

}
