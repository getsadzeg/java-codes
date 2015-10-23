/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author user
 */
public class examRunner {
    public static void main(String[] args) {
        Subject math = new Subject("Math", 90 , 75);
        Subject english = new Subject("English", 90, 60);
        Subject russian = new Subject("Russian", 90, 10);
        System.out.println(math.Percentage());
        System.out.println(english.Percentage());
        System.out.println(russian.Percentage());
        if(russian.Percentage() > math.Percentage() && russian.Percentage() > english.Percentage()) {
            System.out.println(russian.getName() + " is the most difficult subject");
        }
        else if(math.Percentage() > russian.Percentage() && math.Percentage() > english.Percentage()) {
            System.out.println(math.getName() + " is the most difficult subject");
        }
        else if(english.Percentage() > math.Percentage() && english.Percentage() > russian.Percentage()) {
            System.out.println(english.getName() + " is the most difficult subject");
        }
    }
}
