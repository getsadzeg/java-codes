
package raceorganism;


public abstract class Animal extends Creature {
    private boolean isDanger;
    public abstract void run();
    public Animal() {
        
    }
    public Animal(boolean isDanger, double Coefficient, int number, double speed) {
        super(number, speed, Coefficient);
        this.isDanger = isDanger;
    }

    public boolean isIsDanger() {
        return isDanger;
    }

    public void setIsDanger(boolean isDanger) {
        this.isDanger = isDanger;
    }
    
}
