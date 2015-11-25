
package table;

public class Runner {
    public static void main(String[] args) {
        Foot f = new Foot("tree" , 1.05 , 4 , 200_00);
        Surface s = new Surface("tree" , 5 , 2 , 300_00);
        SmallThings st = new SmallThings(100_00);
        Table t = new Table("Ashland" , f , s , st);
        System.out.println("Cost: " + t.cost(30, 3));
    }
}
