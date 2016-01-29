
package hashmap.tasks.education;
import java.util.HashMap;
import java.util.ArrayList;

public class Student {
    private String name;
    private String surName;
    private String ID;
    private HashMap hm = new HashMap<String, ArrayList<Integer>>();
    public Student() {
        
    }
    public Student(String name, String surName, String ID) {
        this.name = name;
        this.surName = surName;
        this.ID = ID;
    }
    public void addMark(String subject, int mark) {
        ArrayList al = new ArrayList<Integer>();
   
        if(hm.containsKey(subject)) 
        {
            al = (ArrayList)hm.get(subject);
            al.add(mark);
        }
        else {
            al.add(mark);
            hm.put(subject, al);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
}
