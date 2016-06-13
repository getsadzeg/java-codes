public class Methods {
	public static int Add(int a, int b) {
		return a + b;
	}
	public static int Subtract(int a, int b) {
		return a - b;
	}
	public static int Divide(int a, int b) {
		return a / b;
	}
	public static int Multiply(int a, int b) {
		return a * b;
	}
	public static void sayHello() { //This is void method.
		System.out.println("Hello!");
	}
	public static void main(String[] args) {
		System.out.println(Add(5, 6)); //Prints 11.
		System.out.println(Add(2, 3)); //Prints 5. It's method overloading.
		System.out.println(Subtract(6, 5)); //Prints 1.
		System.out.println(Divide(10, 5)); //Prints 2.
		System.out.println(Multiply(3, 3)); //Prints 9.
		sayHello();
	}
}