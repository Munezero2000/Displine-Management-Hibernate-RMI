
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
@Entity
public class StudentLevel implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "level_Id")
    private int levelId;
    @Column(name = "level_name")
    private String levelName;
    @OneToMany(mappedBy = "studentClass")
    List<Student> students = new ArrayList<Student>();

    public StudentLevel() {
    }
    
    public StudentLevel(int levelId) {
        this.levelId = levelId;
    }

    public StudentLevel(int levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    

   
    
    
}
