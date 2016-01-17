package exceptions.banking;
public class Main {
	public static void main(String[] args) {
		User user;
		try {
			user = new User("Guri", "Getsadze", "12345678910");
			Card card = new Card(666.6, "gameofcodes");
			System.out.println(user.getMoney(card, 6.6, "gamefcodes")); //exception activated here
		}
		catch(IllegalIDException | IllegalPasswordException | IncorrectPasswordException ex) {
			System.out.println(ex.getMessage()); //or printStackTrace. Result is "Password is incorrect"
		} 
	}
}