public class Numbers {
	public static void main(String[] args) {
		Integer x = 2;
		Integer w = -5;
		System.out.println(x.compareTo(3)); //2 is less than 3,so it returns -1. if equals - 0, if greater - 1.
		System.out.println(x.equals(3)); //false
		System.out.println(x.toString()); //returns 2. But it's string.
		System.out.println(Math.abs(w)); //Returns 5.
		System.out.println(Math.min(x, w)); //Returns -5.
		System.out.println(Math.max(x, w)); //Returns 2.
		System.out.println(Math.random()); //Returns random number.
	}
}