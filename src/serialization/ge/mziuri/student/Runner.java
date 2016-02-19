
package ge.mziuri.student;
import java.io.*;

public class Runner {
    public static void main(String[] args) {
        Student s = new Student("whoever", 20);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"))) {
            out.writeObject(s);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
