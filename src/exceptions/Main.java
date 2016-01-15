
package exceptions;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args)  {
        try {
        FileInputStream fin = new FileInputStream("oeoek");
        System.out.println("after fileinputstream"); // won't be printed
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage()); // wow. messages that file 'oeoek' doesn't exist anymore
        }
        finally {
            System.out.println("like default block!");
        }
        System.out.println("outside catch method"); //will be printed
        /*try {
            System.out.println("yo");
        }
        catch(Exception e) {
            e.printStackTrace();
        }*/
    }
}
