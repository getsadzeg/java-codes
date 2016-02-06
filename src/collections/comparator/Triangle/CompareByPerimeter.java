
package collections.comparator;
import java.util.*;

public class CompareByPerimeter implements Comparator<Triangle>{

    @Override
    public int compare(Triangle o1, Triangle o2) {
        if(o1.perimeter() > o2.perimeter()) 
            return 1;
        else if(o1.perimeter() == o2.perimeter()) return 0;
        else return -1;
    }
}
