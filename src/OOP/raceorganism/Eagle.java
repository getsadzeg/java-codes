
package raceorganism;


public class Eagle extends Bird {
    private String Color;
    public Eagle() {
        
    }
    public Eagle(String Color, double Coefficient) {
        this.Color = Color;
        this.Coefficient = Coefficient;
    }
    
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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
}
