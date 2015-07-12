import java.util.*;
public class DateTime {
	public static void main(String[] args) {
		try {
		System.out.println(new Date() + "\n");
		Thread.sleep(3000); //3 seconds!
		System.out.println(new Date() + "\n");
	}
	catch(Exception e) {
		System.out.println("Exception detected");
	}
	}
}