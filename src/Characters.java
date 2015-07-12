public class Characters {
	 public static void main(String[] args) {
		System.out.println(Character.isDigit('c')); //false
		System.out.println(Character.isDigit('5')); //true
		System.out.println(Character.isUpperCase('a')); //false
		System.out.println(Character.isUpperCase('A')); //true
		System.out.println(Character.isLowerCase('B')); //false
		System.out.println(Character.isLowerCase('b')); //true
		System.out.println(Character.toUpperCase('c')); //Prints C
		System.out.println(Character.toLowerCase('D')); //Prints d
		System.out.println(Character.toString('e')); //Prints e - but string.
	}
}