
package raceorganism;


public abstract class Animal extends Creature {
    public boolean isDanger;
    public double Coefficient;
    public abstract void run();
    public Animal() {
        
    }
    public Animal(boolean isDanger, double Coefficient) {
        this.isDanger = isDanger;
        this.Coefficient = Coefficient;
    }
}
