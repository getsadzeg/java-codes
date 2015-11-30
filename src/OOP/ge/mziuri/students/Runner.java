
package ge.mziuri.students;
import ge.mziuri.enums.*;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("vinme", 25, 40.6, Gender.MALE);
        Student s2 = new Student("vinme", 25, 40.6, Gender.MALE);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
