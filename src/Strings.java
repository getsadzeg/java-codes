public class Strings {
	public static void main(String[] args) {
		String greeting = new String(); //We can use constructor to declare a string variable.
		greeting = "Hello,World";
		System.out.println(greeting);
		String request = "Now. Say my name."; //This is second way,better way.
		System.out.println(request);
		char[] saymynameArray = {'H', 'E', 'I', 'S', 'E', 'N', 'B', 'E', 'R', 'G'}; //Let me recall legendary Breaking Bad.
		String saymynameString = new String(saymynameArray);
		System.out.println(saymynameString);
		System.out.println("You're goddamn right."); //without if statement,of course.
		int namelength = saymynameString.length();
		System.out.println("The one who knock's name length is " + namelength);
		String concatenated = "I'm the one who ".concat("knocks!");
		System.out.println(concatenated);
		boolean result;
		if ("Walter" == "Walter") result = true; //One way. true.
		else result = false;
		System.out.println(result);
		result = false;
		if ("Walter".equals("Walter")) result = true; //Second way. true.
		else result = false;
		System.out.println(result);
		String favouriteCar = "My favourite car is Mercedes-Benz";
		boolean endsWith = favouriteCar.endsWith("Mercedes-Benz");
		if (endsWith == true) System.out.println("You're great man,because you like Mercedes-Benz");
		else System.out.println("I don't like you!");
	}
}