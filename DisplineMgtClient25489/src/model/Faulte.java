package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */

public class Faulte implements Serializable{
    public static final long serialVersionUID = -7543646231577169039L;
    private Integer faulteId;
    private String Description;
    private Integer Marks;
    private Status result;
    private Set<Student> students = new HashSet<Student>();

    public Faulte() {
    }

    public Faulte(Integer faulteId) {
        this.faulteId = faulteId;
    }
    
    
    
    public Faulte(Integer faulteId, String Description, Integer Marks, Status result) {
        this.faulteId = faulteId;
        this.Description = Description;
        this.Marks = Marks;
        this.result = result;
    }

    public Integer getFaulteId() {
        return faulteId;
    }

    public void setFaulteId(Integer faulteId) {
        this.faulteId = faulteId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Integer getMarks() {
        return Marks;
    }

    public void setMarks(Integer Marks) {
        this.Marks = Marks;
    }

    public Status getResult() {
        return result;
    }

    public void setResult(Status result) {
        this.result = result;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return faulteId + "-" + Description;
    }

    
}
