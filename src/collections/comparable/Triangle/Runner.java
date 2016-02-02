
package collections.comparable.Triangle;
import java.util.*;
        
public class Runner {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Triangle>();
        al.add(new Triangle(3,3,3));
        al.add(new Triangle(1,1,1));
        al.add(new Triangle(2,2,2));
        al.add(new Triangle(1,3,3));
        al.add(new Triangle(1,2,2));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
