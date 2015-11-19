
package raceorganism;


public class Person extends Creature {
    private long moneyAmount;
    private String Name;
    private String surName;
    private String ID;
    public Person() {
        
    }
    public Person(long moneyAmount, String Name, String surName, String ID) {
        this.moneyAmount = moneyAmount;
        this.Name = Name;
        this.surName = surName;
        this.ID = ID;
    }
    
    @Override
    public void breathe() {
        System.out.println("Human's breathing");
    }
    @Override
    public void move() {
        System.out.println("Human's moving");
    }
    public void speak() {
        System.out.println("Human's speaking");
    }
    
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
