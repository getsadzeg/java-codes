
package ge.mziuri.corporation;
import ge.mziuri.enums.*;
import ge.mziuri.exceptions.*;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
         ArrayList<Staff> staff = new ArrayList<Staff>();
        HashMap<String,String> contact = new HashMap<>();
        Corporation Ecorp = new Corporation("Google", new Address("Agmashenebeli", "2A", Country.GEORGIA, Cities.TBILISI ), contact,
                staff);
        Ecorp.addContact("sainformacio ganyofileba", "599734023");
        Ecorp.addContact("direqtoris kabineti", "551520582");
        try {
        Staff sergeybrin = new Staff("Sergey", "Brin", "11111111111", 1000000);
        Ecorp.addStaff(sergeybrin);
        }
        catch(IllegalIDException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Staff sundarpichai = new Staff("Sundar", "Pichai", "22222222222", 1000000);
            Ecorp.addStaff(sundarpichai);
        }
        catch(IllegalIDException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(Ecorp.contactNum("direqtoris kabineti"));
        }
        catch(IllegalTypeException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Ecorp.aboutUs());
        System.out.println(Ecorp.AllOfWage());
        
    }
}
