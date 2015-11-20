
package raceorganism;


public class Horse extends Animal {
    private String Gender;
    public Horse() {
        
    }
    public Horse(String Gender,double Coefficient) {
        this.Gender = Gender;
        this.Coefficient = Coefficient;
    }
    
    @Override
    public void run() {
        System.out.println("Horse's running");
    }
    @Override
    public void move() {
        System.out.println("Horse's moving");
    }
    @Override
    public void breathe() {
        System.out.println("Horse's breathing");
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
