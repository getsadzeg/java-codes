
package comparator.studentrating;
import java.util.*;

public class Student {
    private String name;
    private String surName;
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private Date birthDate = new Date();
    public Student() {
        
    }
    public Student(String name, String surName, ArrayList<Integer> marks, Date birthDate) {
        this.name = name;
        this.surName = surName;
        this.marks = marks;
        this.birthDate = birthDate;
    }
    public long age() { //if millseconds are less, that's hint of greater age.
        return getBirthDate().getTime();
    }
    public double averageMark() { //needs fix. ?
        double sum = 0.0;
        for (Integer mark : marks) {
            sum += (int)mark;
        }
        return sum/marks.size();
    }
    public int lex(String othername) {
        return this.name.compareTo(othername);
    }
    @Override
    public String toString() {
        String str = System.lineSeparator() + "Age: " + age() + " Average mark: " + averageMark();
        return str;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
