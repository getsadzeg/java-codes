
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
        
        
        try {
            System.out.println(area(3,3,3)); //normal output
            System.out.println(area(3,3,3000)); //msg activated
        }
        catch(IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static double area(double a, double b, double c) throws IllegalTriangleException {
        if(a+b <= c || a+c <=b || b+c <=a) {
            throw new IllegalTriangleException("triangle like that is illegal");
        }
        double p = (a+b+c)/2;
        return Math.sqrt(p * (p-a)*(p-b)*(p-c));
    }
}
