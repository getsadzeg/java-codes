
package ge.mziuri.corporation;
import ge.mziuri.exceptions.*;

public class Staff {
    private String name;
    private String surName;
    private String ID;
    private long wage;
    public Staff() {
        
    }
    public Staff(String name, String surName, String ID, long wage) throws IllegalIDException {
        if(ID.length() != 11 || !ID.matches("[0-9]+")) 
        throw new IllegalIDException("Illegal ID - you referenced non-digit symbols or not equals to 11 symbols");
        this.name = name;
        this.surName = surName;
        this.ID = ID;
        this.wage = wage;
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

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }
    
}
