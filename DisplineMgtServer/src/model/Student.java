package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
@Entity
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stid")
    private Integer studentId;
    @Column(name = "stnames")
    private String studentNames;
    @ManyToOne
    @JoinColumn(name = "level")
    private StudentLevel studentClass;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "displine_marks")
    private Integer Marks;
    private Status status;
    @OneToMany(mappedBy = "")
    private List<Permission> permissions = new ArrayList<Permission>();
    @OneToMany(mappedBy = "student")
    private List<Punishment> punishments = new ArrayList<Punishment>();
  
    @ManyToMany(mappedBy = "students")
    private Set<Faulte> faultes;

    public Student() {
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(Integer studentId, String studentNames, StudentLevel studentClass, Date dateOfBirth, Integer Marks, Status status, Set<Faulte> faultes) {
        this.studentId = studentId;
        this.studentNames = studentNames;
        this.studentClass = studentClass;
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

    public StudentLevel getstudentClass() {
        return studentClass;
    }

    public void setstudentClass(StudentLevel studentClass) {
        this.studentClass = studentClass;
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
