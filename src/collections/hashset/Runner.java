
package collections.hashset;
import java.util.HashSet;

public class Runner {
    public static void main(String[] args) {
        HashSet someset = new HashSet<Character>();
        someset.add(1);
        someset.add(2);
        someset.add(1);
        someset.add(1);
        //Although, object named '1' will be added only ONCE.
        someset.add(25);
        someset.add(1);
        System.out.println(someset);
    }
}
