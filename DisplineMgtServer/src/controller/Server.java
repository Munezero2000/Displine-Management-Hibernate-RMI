package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.FaulteServiceImpl;
import service.implementation.LevelServiceImpl;
import service.implementation.PermissionServiceImpl;
import service.implementation.PunishmentServiceImpl;
import service.implementation.StaffServiceImpl;
import service.implementation.StudentServiceImpl;


/**
 *
 * @author Munezero
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("staff", new StaffServiceImpl());
            theRegistry.rebind("level", new LevelServiceImpl());
            theRegistry.rebind("student", new StudentServiceImpl());
            theRegistry.rebind("permit", new PermissionServiceImpl());
            theRegistry.rebind("sanction", new FaulteServiceImpl());
            theRegistry.rebind("punish", new PunishmentServiceImpl());
            System.out.println("The server is running on port 6000");
            Thread.currentThread().join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
