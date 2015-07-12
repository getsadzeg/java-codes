class Kitten {
	int kittenAge;
	public Kitten(String name) {
		System.out.println("Kitten's name is " + name);
	}
	public void setAge(int a) {
		kittenAge = a;
	}
	public int getAge() {
		System.out.println("Kitten's age is " + kittenAge);
		return kittenAge;
	}
}
public class Helloworld {
	public static void main(String[] args) {
		Kitten lukakvaKitten = new Kitten("molly");
		lukakvaKitten.setAge(1);
		lukakvaKitten.getAge();
	}
}

//Molly is Luka Kvavilashvili's(my stupid friend,with love of course) cat. She's One of the greatest. I hope I will see Molly soon.
//My first Java software is dedicated to Molly.