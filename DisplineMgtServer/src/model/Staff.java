package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
@Entity
public class Staff implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="names")
    private String fullNames;
    private String email;
    private String password;
    @OneToMany(mappedBy = "inCharge")
    private List<Permission> permissions = new ArrayList<Permission>();
    @OneToMany(mappedBy = "inCharge")
    private List<Punishment> punishments = new ArrayList<Punishment>();

    public Staff() {
    }

    public Staff(int id) {
        this.id = id;
    }

    public Staff(int id, String fullNames, String email, String password) {
        this.id = id;
        this.fullNames = fullNames;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Punishment> getPunishments() {
        return punishments;
    }

    public void setPunishments(List<Punishment> punishments) {
        this.punishments = punishments;
    }
    
    
    
 }
