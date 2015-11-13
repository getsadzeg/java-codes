
package figures;


public class Circle extends Figure {
    private double r;
    public Circle() {
        
    }
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * getR() * getR();
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * getR();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
