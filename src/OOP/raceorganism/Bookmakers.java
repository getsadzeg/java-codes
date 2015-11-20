
package raceorganism;


public class Bookmakers {
    private double betMoney;
    public Creature[] creatures;
    
    public Bookmakers(Creature[] creatures) {
        this.creatures = creatures;
        this.creatures = new Creature[100];
    }
    

    public double getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(double betMoney) {
        this.betMoney = betMoney;
    }
    public void bet(double betMoney) {
        Creature max = creatures[0];
        for(int i=0; i<4; i++) {
            if(creatures[i].getSpeed() > max.getSpeed()) max = creatures[i];
        }
        System.out.println("Max speed: " + max.getSpeed());
    }
    
}
