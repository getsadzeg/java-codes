
package collections.arraylist;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(14);
        arr.add(2);
        System.out.println(arr);
        arr.add(1,27); //add element via index, but throws exception when trying to access out for bound index
        System.out.println(arr.get(2)); //output: 14
        arr.remove((Integer)14); //via object
        arr.remove(1); //via index
    }
}
