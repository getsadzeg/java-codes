
package raceorganism;


public class Eagle extends Bird {
    String color;
    @Override 
    public void breathe() {
        System.out.println("Eagle is breathing");
    }
    @Override
    public void move() {
        System.out.println("Eagle is moving");
    }
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
