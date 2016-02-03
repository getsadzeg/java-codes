
package collections.comparable.basketballer;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Basketballer>();
        al.add(new Basketballer(5, 6, 13, 8, 7, 3));
        al.add(new Basketballer(6, 7, 8, 12, 15, 5));
        Collections.sort(al);
        System.out.println(al);
    }
}
