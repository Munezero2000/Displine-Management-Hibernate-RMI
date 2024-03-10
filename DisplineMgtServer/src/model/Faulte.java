package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
@Entity
public class Faulte implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faulte_id")
    private Integer faulteId;
    @Column(name = "Description")
    private String Description;
    @Column(name = "deduction_marks")
    private Integer Marks;
    private Status result;
    @ManyToMany
    @JoinTable(
            name = "student_faultes",
            joinColumns = @JoinColumn(name = "std_id"),
            inverseJoinColumns = @JoinColumn(name = "faulte_id")
    )
    private Set<Student> students = new HashSet<Student>();
    @OneToMany(mappedBy = "reason")
    List<Punishment> punishments = new ArrayList<>();
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
    
    
}
