
package ge.mziuri.student;
import java.util.*;
import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; //deserialization won't work without this
    private String name;
    private String surname; //add new field
    private int age;
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    public Student() {
        
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
    
}
