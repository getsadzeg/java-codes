
package raceorganism;


public class Penguin extends Bird {
    private Person Owner;
    public Penguin() {
        
    }
    public Penguin(Person Owner, double Coefficient, int number, double speed) {
        super(Coefficient, number, speed);
        this.Owner = Owner;
    }
    
    @Override 
    public void breathe() {
        System.out.println("Penguin's breathing");
    }
    @Override
    public void move() {
        System.out.println("Pengiun's moving");
    }
    @Override
    public void fly() {
        System.out.println("In fact, penguin cannot fly");
    }

    public Person getOwner() {
        return Owner;
    }

    public void setOwner(Person Owner) {
        this.Owner = Owner;
    }
}
