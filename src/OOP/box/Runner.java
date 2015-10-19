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
        Box b = new Box();
        b.width = 7;
        b.length = 10;
        b.height = 5;
        double v = b.width * b.length * b.height;
        System.out.println(v);
    }
}
