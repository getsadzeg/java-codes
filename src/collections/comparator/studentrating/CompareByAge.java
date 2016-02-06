
package comparator.studentrating;

import java.util.*;

public class CompareByAge implements Comparator<Student> {

    @Override
    public int compare(Student t, Student t1) {
        if(t.age() > t1.age()) 
            return 1;
        else if(t.age() == t1.age()) 
            return 0;
        else return -1;
    }
    
}
