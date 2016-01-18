package exceptions.banking;
public class User {
	private String name;
	private String surName;
	private String ID;
	public User() {

	}
	public User(String name, String surName, String ID) throws IllegalIDException {
		if(ID.length() != 11 || !ID.matches("[0-9]+")) 
		throw new IllegalIDException("Illegal ID - you referenced non-digit symbols or not equals to 11 symbols");
	    this.name = name;
		this.surName = surName;
		this.ID = ID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surName) {
		this.surName = surName;
	}
	public String getSurname() {
		return surName;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	boolean getMoney(Card card, double money, String password) throws IncorrectPasswordException {
		if(!password.equals(card.getPassword())) throw new IncorrectPasswordException("Password is incorrect");
		if(money < card.getCash() || money == card.getCash()) {
			card.setCash(card.getCash() - money);
			return true;
		}
		else
			return false;
	}
}