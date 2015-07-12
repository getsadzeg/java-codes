class Final {
	public static short a = 2;
	public final short b = 3;
}

public class Modifiers {
	public static void main(String[] args) {
		Final object = new Final();
		object.a = 5;
		object.b = 6; //Compiler error,of course. Cannot assign a value to final variable.
		System.out.println(object.a);
		//System.out.println(object.b);
	}
}