
package country;


public class City {
    private String Name;
    private int Population;
    private int Area;
    public City() {
        
    }
    public City(String Name, int Population, int Area) {
        this.Name = Name;
        this.Population = Population;
        this.Area = Area;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int Population) {
        this.Population = Population;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }
    
   
    
}
