
package raceorganism;


public class Horse extends Animal {
    String sex;
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
}
