package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Munezero
 */
public class Permission implements Serializable{

    private int permissionId;
    private Student student;
    private String Description;
    private Status Status;
    private Date dateDone;
    private int daysPermitted;
    private Staff inCharge;

    public Permission() {
    }

    public Permission(int permissionId) {
        this.permissionId = permissionId;
    }

    public Permission(int permissionId, Student student, String Description, Status Status, int daysPermitted, Staff inCharge, Date dateDone) {
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
    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }
    
    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public Student getStudent() {
        return student;
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
