
package comparable;


public class Triangle implements Comparable<Triangle>{
    private double a;
    private double b;
    private double c;
    public Triangle() {
        
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public double area() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));
    }
    @Override
    public int compareTo(Triangle o) {
        if(o.area() > this.area()) {
            return 1;
        }
        else if(o.area() == this.area()) {
            return 0;
        }
        else return -1;
    }
    @Override
    public String toString() {
        String str = System.lineSeparator() + "Triangle: " +  a + " " + b + " " + c + "Area: " + area();
        return str;
    }
    
}
