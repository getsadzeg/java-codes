package exceptions.banking;
public class User {
	String name;
	String surName;
	String ID;
	public User() {

	}
	public User(String name, String surName, String ID) {
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