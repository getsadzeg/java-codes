class Animal {}
interface Vegetarian {}
class Deer extends Animal implements Vegetarian {}
public class Polymorphism {
	public static void main(String[] args) {
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
	}
}