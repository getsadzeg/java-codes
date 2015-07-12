class Cat {
	protected int age;
	protected String color;
	protected boolean danger;
}
class Tiger extends Cat {
	//public static void setAndPrintInfo(int a,String c, boolean d) {
		//age = a;

	//}
}
class Lion extends Cat {

}
public class Inheritance {
	public static void main(String[] args) {
		Tiger tony = new Tiger();
		tony.age = 2;
		tony.color = "yellow";
		tony.danger = true;
		System.out.println(tony.danger); //yo,True!
	}
}