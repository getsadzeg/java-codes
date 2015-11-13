
package figures;


public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    public Triangle() {
        
    }
    public Triangle(double x) {
        a = x;
        b = x;
        c = x;
    }
    public Triangle(double x, double y) {
        a = x;
        b = x;
        c = y;
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p - a) * (p - b) * (p-c));
    }
    @Override
    public double perimeter() {
        return getA()+getB()+getC();
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
   
}
