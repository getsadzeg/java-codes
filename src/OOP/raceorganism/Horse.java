
package raceorganism;


public class Horse extends Animal {
    private String Sex;
    public Horse() {
        
    }
    public Horse(String Sex,boolean isDanger, double Coefficient, int number, double speed) {
        super(isDanger, Coefficient, number, speed);
        this.Sex = Sex;
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }
}
