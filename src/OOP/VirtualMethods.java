class Programmer { //We can use Programmer as abstract. But creating object: Programmer programmer = new Programmer(arguments) is impossible.
	protected String name;
	protected String lang;
	protected String level;
	public Programmer(String name,String lang,String level) {
		System.out.println("Constructing an Programmer");
		this.name = name;
		this.lang = lang;
		this.level = level;
	}
	void access() {
		System.out.println("Access granted for programmer");
	}
}
class Junior extends Programmer {
	public Junior(String name,String lang,String level) {
		super(name,lang,level);
	}
	void access() {
		System.out.println("Access granted for junior programmer");
	}
}
public class VirtualMethods {
	public static void main(String[] args) {
		Junior junior = new Junior("John","Android", "High");
		Programmer programmer = new Junior("Ben","C++","Medium"); //It invokes Junior's access method. Not Programmer's.
		System.out.println("Call access method using Programmer reference");
		programmer.access();
		System.out.println("Call access method using Junior reference");
		junior.access();
		//Result is same. 
	}
}