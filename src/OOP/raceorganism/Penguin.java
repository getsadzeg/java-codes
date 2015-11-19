
package raceorganism;


public class Penguin extends Bird {
    private String Owner;
    public Penguin() {
        
    }
    public Penguin(String Owner) {
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

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }
}
