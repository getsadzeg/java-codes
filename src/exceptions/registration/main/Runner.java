package registration.main;
import registration.enums.*;
import registration.exceptions.*;
import java.lang.String;
import java.lang.Character;
import java.util.Date;
public class Runner {
    public static void main(String[] args) {
            try {
            register("Guri", "Getsadze", "11", "test", 2002, 5, 14, "555555555", Gender.MALE, "getsadzeg", "wazzaaaaaa1");
                System.out.println("Successfully registered");
            }
            catch(MainException ex) { //can't go on catch
                for(int i=0; i<ex.getAmount(); i++) {
                    System.out.println(ex.getExceptions()[i].getMessage());
                }
            }
    }
    public static void register(String name, String surname, String ID, String email, int year,
            int month, int date, String number, Gender gender, String username, String password) throws MainException {
        
            MainException mainex = new MainException();
            try {
                validateName(name);
            }
            catch(IllegalNameException ex) {
                mainex.add(ex);
            }
            try {
                validateSurname(surname);
            }
            catch(IllegalSurnameException ex) {
                mainex.add(ex);
            }
            try {
                validateID(ID);
            }
            catch(IllegalIDException ex) {
                mainex.add(ex);
            }
            try {
                validateYear(year, month, date);
            }
            catch(IllegalDateException ex) {
                mainex.add(ex);
            }
            try {
                validateNumber(number);
            }
            catch(IllegalNumberException ex) {
                mainex.add(ex);
            }
            try {
                validateUsername(username);
            }
            catch(IllegalUsernameException ex) {
                mainex.add(ex);
            }
            try {
                validatePassword(password);
            }
            catch(IllegalPasswordException ex) {
                mainex.add(ex);
            }
    }
    public static void validateName(String name) throws IllegalNameException {
        if(name.length() <= 1) {
            throw new IllegalNameException("Illegal name");
        }
    }
    public static void validateSurname(String surname) throws IllegalSurnameException {
        if(surname.length() <= 1) {
            throw new IllegalSurnameException("Illegal surname");
        }
    }
    public static void validateID(String ID) throws IllegalIDException {
        if(ID.length() != 11 || !ID.matches("[0-9]+")) {
            throw new IllegalIDException("Illegal ID");
        }
    }
    public static void validateEmail(String email) throws IllegalEmailException {
        if(email.length() < 3 || !email.contains("@")) throw new IllegalEmailException();
    }
    public static void validateYear(int year, int month, int date ) throws IllegalDateException { // use Date class for year
        if(month <= 0 || month >= 11)
            if(date <= 0 || date >= 30) throw new IllegalDateException("Illegal Date");
        Date dateobj = new Date();
        //should add date
        }
    public static void validateNumber(String number) throws IllegalNumberException {
        if(!number.matches("[0-9]+")) throw new IllegalNumberException("Illegal Number");

       }
    public static void validateUsername(String username) throws IllegalUsernameException {
        if((username.length() < 4 || username.length() > 12) && username.contains(" "))
            throw new IllegalUsernameException("Illegal Username");
       }
    public static void validatePassword(String password) throws IllegalPasswordException {
        if(!password.matches(".*\\d+.*") || password.length() < 8 || password.length() > 12)
            throw new IllegalPasswordException("Illegal Password");
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        if(!hasUppercase) throw new IllegalPasswordException("Must have an uppercase character");
        if(!hasLowercase) throw new IllegalPasswordException("Must have an lowercase character");
    }
}
