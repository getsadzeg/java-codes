/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author User
 */
public class Runner {
    public static void main(String[] args) {
        Box b = new Box(7,10,5);
        b.setWidth(7);
        b.setLength(10);
        b.setHeight(5);
        double v = b.volume();
        double s = b.area();
        double w = b.weight(100);
        System.out.println(s);
        System.out.println(v);
        System.out.println(w);
    }
}
