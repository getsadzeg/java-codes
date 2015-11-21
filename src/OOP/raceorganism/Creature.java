
package raceorganism;


public abstract class Creature {
    private int number;
    private double speed;
    private double Coefficient;
    public abstract void breathe();
    public abstract void move();
    public Creature() {
        
    }
    public Creature(int number, double speed, double Coefficient) {
        this.number = number;
        this.speed = speed;
        this.Coefficient = Coefficient;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCoefficient() {
        return Coefficient;
    }

    public void setCoefficient(double Coefficient) {
        this.Coefficient = Coefficient;
    }
    
    
}
