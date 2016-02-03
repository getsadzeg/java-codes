
package collections.comparable.basketballer;


public class Basketballer implements Comparable<Basketballer> {
    private int points;
    private int rebounds;
    private int assists;
    private int steals;
    private int blocks;
    private int losses;
    public Basketballer() {
        
    }
    public Basketballer(int points, int rebounds, int assists, int steals, int blocks, int losses) {
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.losses = losses;
    }
    public double addOn() {
        double dassists = (double)assists;
        dassists*=1.5;
        steals*=2;
        blocks*=2;
        losses*=-2;
        return points + rebounds + dassists + steals + blocks + losses;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getSteals() {
        return steals;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public int compareTo(Basketballer t) {
        if(t.addOn() > this.addOn()) 
            return 1;
        else if(t.addOn() == this.addOn()) 
            return 0;
        else return -1;
    }
    @Override
    public String toString() {
        String str = System.lineSeparator() + "Summary of results: " + addOn();
        return str;
    }
    
}
