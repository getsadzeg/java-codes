
package comparator.studentrating;

import java.util.*;

public class CompareByLex implements Comparator<Student> {

    @Override
    public int compare(Student t, Student t1) {
        if(t.lex(t1.getName()) > t1.lex(t.getName())) 
            return 1;
        else if(t.lex(t1.getName()) == t1.lex(t.getName()))
            return 0;
        else return -1;
    }
    
}
