package exceptions.banking;
public class Card {
	private double cash;
	private String password;
	public Card() {

	}
	public Card(double cash, String password) throws IllegalPasswordException { //
		this.cash = cash;
		this.password = password;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public double getCash() {
		return cash;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}