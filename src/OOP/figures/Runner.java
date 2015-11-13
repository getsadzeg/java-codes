
package figures;


public class Runner {
    public static void main(String[] args) {
        Figure[] f = new Figure[100];
        Triangle triangle = new Triangle(5,6,7);
        Rectangle rectangle = new Rectangle(8);
        Circle circle = new Circle(5.2);
        f[0] = triangle;
        f[1] = rectangle;
        f[2] = circle;
        Figure bg = f[0];
        for(int i=0; i<3; i++) {
            if(f[i].area() > bg.area()) bg = f[i];
        }
        System.out.println("Max area is " + bg.area());
    }
}
