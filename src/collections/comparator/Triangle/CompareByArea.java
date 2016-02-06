
package collections.comparator;
import java.util.*;

public class CompareByArea implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        if(o1.area() > o2.area()) 
            return 1;
        else if(o1.area() == o2.area()) return 0;
        else return -1;
    }
}
