
package raceorganism;


public class Dog extends Animal {
    private String Variety;
    
    public Dog() {
        
    }
    public Dog(String Variety, boolean isDanger, double Coefficient, int number, double speed) {
        super(isDanger, Coefficient, number, speed);
        this.Variety = Variety;
    }
    
    @Override
    public void run() {
        System.out.println("Dog's running");
    }
    @Override
    public void move() {
        System.out.println("Dog's moving");
    }
    @Override
    public void breathe() {
        System.out.println("Dog's breathing");
    }

    public String getVariety() {
        return Variety;
    }

    public void setVariety(String Variety) {
        this.Variety = Variety;
    }
}
