
package ge.mziuri.student;
import java.io.*;

public class Runner {
    public static void main(String[] args) {
        Student s = new Student("whoever", 20);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"))) { //writing
            out.writeObject(s);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
		//independent from each other
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"))) { //reading
            Student st = (Student)in.readObject();
            System.out.println(st.getName() + " " + st.getAge());
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
