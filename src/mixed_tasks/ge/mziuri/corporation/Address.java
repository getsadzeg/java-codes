
package ge.mziuri.corporation;
import ge.mziuri.enums.*;

public class Address {
    private String street;
    private String building;
    private Country country;
    private Cities city;
    public Address() {
        
    }
    public Address(String street, String building, Country country, Cities city) {
        this.street = street;
        this.building = building;
        this.country = country;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }
    
}
