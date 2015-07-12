class ForStatement {
	public int a = 5;
	public int b = 4;
	public int[] nums = {10,20,30,40};
	public int[] secondnums = {50, 60, 70, 80, 90};
}
public class Loops {
	public static void main(String[] args) {
		ForStatement statement = new ForStatement();
		int i = 0;
		System.out.println("While loop:\n");
		while(i <= statement.a) {
			System.out.println(i);
			i++;
		}
		System.out.println("FOR loop:\n");
		for(int j=0; j<=statement.b; j++) {
			System.out.println(j);
		}
		System.out.println("Enhanced FOR loop:\n"); //Great thing. Discovered just now.
		for(int e : statement.nums ) {
			System.out.println(e);
		}
		System.out.println("Enhanced FOR loop with break:\n");
		for(int e : statement.secondnums) {
			if(e == 60) continue;
			if(e == 80) break;
			System.out.println(e);
		}
	}
}

//NO TO do while.