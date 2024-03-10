package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Munezero
 */
@Entity
public class Permission implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permit_id")
    private int permissionId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private String Description;
    @Column(name = "date_done")
    private Date dateDone;
    private Status Status;
    private int daysPermitted;
    @ManyToOne
    @JoinColumn(name = "in_charge")
    private Staff inCharge;

    public Permission() {
    }

    public Permission(int permissionId) {
        this.permissionId = permissionId;
    }

    public Permission(int permissionId, Student student, String Description, Status Status, int daysPermitted, Staff inCharge, Date doneDone) {
        this.permissionId = permissionId;
        this.student = student;
        this.Description = Description;
        this.Status = Status;
        this.daysPermitted = daysPermitted;
        this.inCharge = inCharge;
        this.dateDone = dateDone;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public Student getStudent() {
        return student;
    }
    
    public Date getDateDone(){
        return dateDone;
    }
    
    public void setDateDone(Date dateDone){
        this.dateDone = dateDone;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public int getDaysPermitted() {
        return daysPermitted;
    }

    public void setDaysPermitted(int daysPermitted) {
        this.daysPermitted = daysPermitted;
    }

    public Staff getInCharge() {
        return inCharge;
    }

    public void setInCharge(Staff inCharge) {
        this.inCharge = inCharge;
    }

    
    
}
