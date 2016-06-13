
public class Exceptions {
    public static void main(String[] args) {
        char[] git = {'g', 'i', 't'};
        try {
            System.out.println("git's last letter is " + git[3]); //It of course prints that exception detected. because last letter is git[2].
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception detected " + e);
        }
        System.out.println("git's last letter is " + git[2]); //It works.
    }
}
