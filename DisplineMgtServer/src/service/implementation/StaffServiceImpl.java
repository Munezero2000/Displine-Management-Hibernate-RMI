package service.implementation;

import dao.StaffDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Staff;
import service.StaffService;

/**
 *
 * @author Munezero
 */
public class StaffServiceImpl extends UnicastRemoteObject implements StaffService {

    public StaffServiceImpl() throws RemoteException {
    }
    StaffDao dao = new StaffDao();

    @Override
    public Staff AddStaff(Staff theStaff) throws RemoteException {
        return dao.AddStaff(theStaff);
    }

    @Override
    public Staff updateStaff(Staff theStaff) throws RemoteException {
        return dao.updateStaff(theStaff);
    }

    @Override
    public Staff deleteStaff(Staff theStaff) throws RemoteException {
        return dao.deleteStaff(theStaff);
    }

    @Override
    public Staff searchStaff(Staff theStaff) throws RemoteException {
        return dao.searchStaff(theStaff);
    }
    
    @Override
    public Staff searchStaffEmail(Staff theStaff) throws RemoteException {
        return dao.searchStaffEmail(theStaff);
    }

    @Override
    public List<Staff> getAllStaff() throws RemoteException {
        return dao.getAllStaff();
    }

}
