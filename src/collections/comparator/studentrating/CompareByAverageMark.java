
package comparator.studentrating;

import java.util.*;

public class CompareByAverageMark implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
        if(t.averageMark() > t1.averageMark())
            return 1;
        else if(t.averageMark() == t1.averageMark()) 
            return 0;
        else return -1;
    }
    
}
