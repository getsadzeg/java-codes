
package exam;


public class Subject {
    private String Name;
    private int allQuantity;
    private int successQuantity;
    public Subject() {
        
    }
    public Subject(String Name, int allQuantity, int successQuantity) {
        this.Name = Name;
        this.allQuantity = allQuantity;
        this.successQuantity = successQuantity;
    }
    public double Percentage() {
         return (double)(getallQuantity() - getsuccessQuantity()) / getallQuantity() * 100;
    }
    public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getallQuantity() {
		return allQuantity;
	}
	public void setallQuantity(int allQuantity) {
		this.allQuantity = allQuantity;
	}
	public int getsuccessQuantity() {
		return successQuantity;
	}
	public void setsuccessQuantity(int successQuantity) {
		this.successQuantity = successQuantity;
	}
}
