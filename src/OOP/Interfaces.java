//An interface is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
interface Fish {
	public void eat(); //No method's body in interface.
	public void swim(); //No method's body in interface.
}
interface Sport {
	public void setHomeTeam(String homeTeam);
	public void setVisitingTeam(String visitingTeam);
}
//if the Football interface extended both Sport and Show, it would be declared with comma: Sport,Show.
interface Football extends Sport { //Interface extends inteface. NO TO IMPLEMENT.
	public void setHomeTeamStadium(String homeTeamStadiumName);
	public void setAwayTeamStadium(String awayTeamStadiumName);
	public void setHomeTeamStadiumScore(String homeScore);
	public void setAwayTeamStadiumScore(String awayScore);
	public int finalResult();
}
class Salmon implements Fish {
	public void eat() { //Method's body in class which implements.
		System.out.println("Salmon can eat"); //Method's body in class which implements.
	}
	public void swim() {
		System.out.println("Salmon can swim");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Salmon salmon = new Salmon();
		salmon.eat();
		salmon.swim();
	}
}