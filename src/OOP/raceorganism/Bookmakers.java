
package raceorganism;


public class Bookmakers {
    private double betMoney;
    public Creature[] creatures;
    
    public Bookmakers(Creature[] creatures) {
        this.creatures = creatures;
    }
    

    public double getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(double betMoney) {
        this.betMoney = betMoney;
    }
    public void bet(double betMoney, Creature choice, Person person) {
        Creature max = creatures[0];
        for(int i=0; i<4; i++) {
            if(creatures[i].getSpeed() > max.getSpeed()) max = creatures[i];
        }
        System.out.println("Max speed: " + max.getSpeed());
        if(max.getNumber() == choice.getNumber()) System.out.println("You won! Your money becomes " + (person.getMoneyAmount() + betMoney * choice.getCoefficient()));
        else System.out.println("You lose! Your money becomes " + (person.getMoneyAmount() - betMoney));
    }
    
}
