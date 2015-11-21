
package raceorganism;


public abstract class Bird extends Creature {
    public abstract void fly();
    public Bird() {
        
    }
    public Bird(double Coefficient, int number, double speed) {
        super(number,speed, Coefficient);
    }

    
}
