package exceptions.banking;
public class User {
	private String name;
	private String surName;
	private String ID;
	public User() {

	}
	public User(String name, String surName, String ID) throws IllegalIDException {
		if(ID.length() < 11 && !ID.matches("[0-9]+")) 
		throw new IllegalIDException("Illegal ID - you referenced non-digit symbols or less than 11 symbols");
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
}