
package exam;


public class Runner {
    public static void main(String[] args) {
		Student andrea = new Student("Andrea", 19, 2, 51.02);
                Student john = new Student("John", 20, 2, 90.01);
                Student david = new Student("David", 21, 3, 80.5);
                String highMark = null;
                if(andrea.getMark() > john.getMark() && andrea.getMark() > david.getMark()) {
                    highMark = andrea.getName();
                }
                else if(john.getMark() > andrea.getMark() && john.getMark() > david.getMark()) {
                    highMark = john.getName();
                }
                else if(david.getMark() > andrea.getMark() && david.getMark() > john.getMark()) {
                    highMark = david.getName();
                }
                System.out.println(highMark + " has the highest mark");
	}
}
