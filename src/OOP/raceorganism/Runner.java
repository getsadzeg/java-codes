
package raceorganism;


public class Runner {
    public static void main(String[] args) {
       Creature[] creatures = new Creature[100];
       Person jesse = new Person(7000, "Jesse", "Pinkman", "112233344");
       Creature maxy = new Dog("kane-korso", false, 10.9, 1, 21.4);
       creatures[0] = maxy;
       Creature bucefal = new Horse("Male", false, 1.4, 2, 30.5 );
       creatures[1] = bucefal;
       Creature gale = new Eagle("Black", 1.1, 3, 270.7);
       creatures[2] = gale;
       Creature nils = new Penguin(jesse, 100.5, 4, 2.3);
       creatures[3] = nils;
       Bookmakers crystalbet = new Bookmakers(creatures);
       crystalbet.bet(100, gale, jesse);
       
    }
}
