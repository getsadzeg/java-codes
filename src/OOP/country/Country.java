
package country;


public class Country {
    private String Name;
    private City Capital;
    private City Cities[];
    public Country() {
        
    }
    public Country(String Name, City Capital, City[] Cities) {
        this.Name = Name;
        this.Capital = Capital;
        this.Cities = Cities;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public City getCapital() {
        return Capital;
    }

    public void setCapital(City Capital) {
        this.Capital = Capital;
    }

    public City[] getCities() {
        return Cities;
    }

    public void setCities(City[] Cities) {
        this.Cities = Cities;
    }

    public int areaCount(int i, int p) {
        p+=Cities[i].getArea();
        return p;
    }
    public int populationCount(int j, int k) {
        k+=Cities[j].getPopulation();
        return k;
    }
}
