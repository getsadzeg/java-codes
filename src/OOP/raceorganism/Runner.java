
package raceorganism;


public class Runner {
    public static void main(String[] args) {
       Creature[] creatures = new Creature[100];
       Creature maxy = new Dog("kane-korso", 10.9);
       creatures[0] = maxy;
       Creature bucefal = new Horse("Male", 1.4);
       creatures[1] = bucefal;
       Creature gale = new Eagle("Black", 1.1);
       creatures[2] = gale;
       Creature nils = new Penguin("Tom", 100.5);
       creatures[3] = nils;
       Person mzia = new Person(6000, "Mzia", "Pirvelyofili", "112233344");
       Bookmakers crystalbet = new Bookmakers(creatures);
       crystalbet.bet(2700);
       
    }
}
