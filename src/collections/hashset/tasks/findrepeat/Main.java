
package collections.tasks.findrepeat;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr0 = {1,5,6,7, 2};
        int[] arr1 = {1,2, 9};
        HashSet first = new HashSet<>();
        HashSet second = new HashSet<>();
        addon(first, second, arr, arr0, arr1);
        iterateThrough(arr1, first, second);
        
    }
    public static void addon(HashSet first, HashSet second, int[] arr, int[] arr0, int[] arr1) {
        for(int i=0; i<arr.length; i++) {
            first.add(arr[i]);
        }
        for(int i=0; i<arr0.length; i++) {
            second.add(arr0[i]);
        }
        
    }

    
    public static void iterateThrough(int[] arr1, HashSet first, HashSet second) {
           for(int i=0; i<arr1.length; i++) {
               if(first.contains(arr1[i]) && second.contains(arr1[i])) System.out.println(arr1[i]);
           }
   }
}
