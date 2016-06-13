import java.io.*;
import java.util.Scanner;
public class FilesIO {
  public static void main(String[] args) throws IOException {
    int a;
    Scanner reader = new Scanner(System.in); //Input Example.
    a = reader.nextInt(); //
    System.out.println("Entered number is:" + a); //
    InputStream text = new FileInputStream("read"); //"read" is the file,plain text file In the Java directory. #Ubuntu #Unix #Linux
    int size = text.available();
    for (int i = 0; i < size; i++) {
      System.out.print((char)text.read());
    }
    text.close();
    File file = new File("write.txt");
    File dir = new File("Mr.White");
    dir.mkdir();
    file.createNewFile();
    FileWriter filewriter = new FileWriter(file);
    filewriter.write("HEISENBERG");
    filewriter.flush();
    filewriter.close();
  }
}