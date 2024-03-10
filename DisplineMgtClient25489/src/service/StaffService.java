package service;

import java.rmi.Remote;
import model.*;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Munezero
 */
public interface StaffService extends Remote {

    Staff AddStaff(Staff theStaff) throws RemoteException;

    Staff updateStaff(Staff theStaff) throws RemoteException;

    Staff deleteStaff(Staff theStaff) throws RemoteException;

    Staff searchStaff(Staff theStaff) throws RemoteException;
    Staff searchStaffEmail(Staff theStaff) throws RemoteException;
    List<Staff> getAllStaff() throws RemoteException;
}
