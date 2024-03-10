/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Permission;
import model.Punishment;

/**
 *
 * @author Munezero
 */
public abstract class Session {
    public static Integer id;
    public static String fullNames;
    public static String email;
    public static String password;
    public static List<Permission> permissions = new ArrayList<Permission>();
    public static List<Punishment> punishments = new ArrayList<Punishment>();
}
