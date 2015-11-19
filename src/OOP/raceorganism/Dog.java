
package raceorganism;


public class Dog extends Animal {
    String Variety;
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
}
