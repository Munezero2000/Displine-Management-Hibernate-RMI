package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
public class Student implements Serializable{
    public static final long serialVersionUID = -359019431574817742L;
    private Integer studentId;
    private String studentNames;
    private StudentLevel studentClass;
    private Date dateOfBirth;
    private Integer Marks;
    private Status status;
    private List<Permission> permissions = new ArrayList<Permission>();
    private List<Punishment> punishments = new ArrayList<Punishment>();
    private Set<Faulte> faultes;

    public Student() {
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(Integer studentId, String studentNames, StudentLevel StudentClass, Date dateOfBirth, Integer Marks, Status status, Set<Faulte> faultes) {
        this.studentId = studentId;
        this.studentNames = studentNames;
        this.studentClass = StudentClass;
        this.dateOfBirth = dateOfBirth;
        this.Marks = Marks;
        this.status = status;
        this.faultes = faultes;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String studentNames) {
        this.studentNames = studentNames;
    }

    public StudentLevel getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentLevel StudentClass) {
        this.studentClass = StudentClass;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getMarks() {
        return Marks;
    }

    public void setMarks(Integer Marks) {
        this.Marks = Marks;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public Set<Faulte> getFaultes() {
        return faultes;
    }

    public void setFaultes(Set<Faulte> faultes) {
        this.faultes = faultes;
    }
    
    
}
