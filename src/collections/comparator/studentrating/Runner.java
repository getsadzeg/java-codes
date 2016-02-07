
package comparator.studentrating;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Student>();
        ArrayList marks1 = new ArrayList<Integer>();
        marks1.add(10);
        marks1.add(10);
        marks1.add(10);
        ArrayList marks2 = new ArrayList<Integer>();
        marks2.add(9);
        marks2.add(9);
        marks2.add(9);
        al.add(new Student("Guri", "Getsadze", marks1 , new Date(2002,6,14)));
        al.add(new Student("Zuka", "Grdzelidze", marks2, new Date(2002, 5, 7)));
        Collections.sort(al, new CompareByAge());
        System.out.println(al);
        System.out.println("-------------");
        Collections.sort(al, new CompareByAverageMark()); //requires to fix/optimize
        System.out.println(al);
        System.out.println("------------");
        Collections.sort(al, new CompareByLex());
        System.out.println(al);
        System.out.println("-------------");
    }
}
