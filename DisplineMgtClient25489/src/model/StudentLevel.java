
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Munezero
 */
public class StudentLevel implements Serializable{
    public static final  long serialVersionUID = -509309945471467835L;
    private int levelId;
    private String levelName;
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

    @Override
    public String toString() {
        return  levelId + "-" + levelName;
    }
    
    

   
    
    
}
