
package raceorganism;


public abstract class Creature {
    private byte number;
    private double speed;
    public abstract void breathe();
    public abstract void move();

    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
}
