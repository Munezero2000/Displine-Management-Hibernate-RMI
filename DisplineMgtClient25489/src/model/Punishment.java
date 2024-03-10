package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Munezero
 */

public class Punishment implements Serializable{
    private int punishmentId;
    private Student student;
    private Faulte reason;
    private int daysofPunishment = 0;
    private Date dateDone;
    private Staff inCharge;

    public Punishment() {
    }

    public Punishment(int punishmentId) {
        this.punishmentId = punishmentId;
    }

    public Punishment(int punishmentId, Student student, Faulte reason, int marksDeducted, Date dateDone, Staff inCharge, Status status) {
        this.punishmentId = punishmentId;
        this.student = student;
        this.reason = reason;
        this.dateDone = dateDone;
        this.inCharge = inCharge;
    }

    public int getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(int punishmentId) {
        this.punishmentId = punishmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Faulte getReason() {
        return reason;
    }

    public void setReason(Faulte reason) {
        this.reason = reason;
    }

    public int getDaysofPunishment() {
        return daysofPunishment;
    }

    public void setDaysofPunishment(int daysofPunishment) {
        this.daysofPunishment = daysofPunishment;
    }


    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    public Staff getInCharge() {
        return inCharge;
    }

    public void setInCharge(Staff inCharge) {
        this.inCharge = inCharge;
    }
        
}
