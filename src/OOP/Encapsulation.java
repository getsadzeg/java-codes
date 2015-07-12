//We review getters and setters,So Encapsulation in this code.
class Location {
	private double Longitude;
	private double Latitude;
	private String locationName;
	public void setLongitude(double Longitude) {
		this.Longitude = Longitude;
	}
	public void setLatitude(double Latitude) {
		this.Latitude = Latitude;
	}
	public void setlocationName(String locationName) {
		this.locationName = locationName;
	}
	public double getLongitude() {
		return Longitude;
	}
	public double getLatitude() {
		return Latitude;
	}
	public String getlocationName() {
		return locationName;
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Location location = new Location();
	location.setLongitude(41.7167);
	location.setLatitude(44.7833);
	location.setlocationName("Tbilisi");
	System.out.println("That location's longitude is " +  location.getLongitude() + ", Latitude is " + location.getLatitude() + ", name is " + location.getlocationName() + " ");
}
}