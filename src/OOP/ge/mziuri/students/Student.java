
package ge.mziuri.students;
import ge.mziuri.enums.*;
import java.util.Objects;
public class Student {
    private String name;
    private int age;
    private double mark;
    private Gender gender;
    public Student() {
        
    }
    public Student(String name, int age, double mark, Gender gender) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.gender = gender;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Student s = (Student)obj;
        if(name == s.getName() && mark == s.getMark() && age == s.getAge() && gender == s.getGender()) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int p = 11;
        int m = 1_000_000_007;
        int h = 31;
        h = (int)(((long)(h+name.hashCode()) * p) % m);
        h = (int)((long)(h + age) * p % m);
        h = (int)((long)(h + Double.hashCode(mark)) * p % m);
        h = (int)((long)(h + gender.hashCode() * p) % m);
        return h;
    }
    @Override
    public String toString() {
        String s = "";
        s = s + "Name - " + name + System.lineSeparator();
        s = s + "Age - : " + age + System.lineSeparator();
        s = s + "Mark - : " + mark + System.lineSeparator();
        s = s + "Gender - : " + gender + System.lineSeparator();
        return s;
    }
}
