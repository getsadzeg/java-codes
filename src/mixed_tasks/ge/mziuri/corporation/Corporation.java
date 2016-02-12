
package ge.mziuri.corporation;
import java.util.*;
import java.util.Map.Entry;
import ge.mziuri.exceptions.*;
public class Corporation {
    private String name;
    private Address address;
    private HashMap<String,String> contact;
    private ArrayList<Staff> staff;
    public Corporation() {
        
    }
    public Corporation(String name, Address address, HashMap<String, String> contact, ArrayList<Staff> staff ) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.staff = staff;
    }
    public String aboutUs() {
        String str = "";
        str+="Address:" + address.getCountry() + " " + address.getCity() + " " + address.getStreet() + " " + address.getBuilding();
        Iterator it = contact.keySet().iterator();
        while(it.hasNext()) {
                String key = (String)it.next();
                String value = contact.get(key);
                str+="Information type: " + key + " Phone num: " + value;
        }
        return str;
    }
    public void addContact(String type, String phone) {
        contact.put(type, phone);
    }
    public void addStaff(Staff person) {
        staff.add(person);
    }
    public long AllOfWage() {
        long allof = 0;
        for(int i=0; i<staff.size(); i++) {
            allof+=staff.get(i).getWage();
        }
        return allof;
    }
    public String contactNum(String type) throws IllegalTypeException {
        if(!contact.containsKey(type)) throw new IllegalTypeException("Illegal Type");
        return contact.get(type);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<String,String> getContact() {
        return contact;
    }

    public void setContact(HashMap<String,String> contact) {
        this.contact = contact;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }
    
}
