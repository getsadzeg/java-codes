package student;
public class Student {
	private String Name;
	private int Age;
	private int Course;
	private double Mark;
	public Student() {

	}
	public Student(String Name, int Age, int Course, double Mark) {
		this.Name = Name;
		this.Age = Age;
		this.Course = Course;
		this.Mark = Mark;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public int getCourse() {
		return Course;
	}
	public void setCourse(int Course) {
		this.Course = Course;
	}
	public double getMark() {
		return Mark;
	}
	public void setMark(double Mark) {
		this.Mark = Mark;
	}
}