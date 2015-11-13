
package figures;


public class Rectangle extends Figure {
    private double a;
    private double b;
    public Rectangle() {
        
    }
    public Rectangle(double x) {
        a = x;
        b = x;
    }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double area() {
        return getA()*getB();
    }
    @Override
    public double perimeter() {
        return 2*getA() + 2*getB();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
