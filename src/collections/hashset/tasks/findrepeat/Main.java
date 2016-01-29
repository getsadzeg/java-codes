
package tasks.findrepeat;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr0 = {1,5,6,7};
        int[] arr1 = {1,9};
        HashSet first = new HashSet<>();
        HashSet second = new HashSet<>();
        HashSet third = new HashSet<>();
        addon(first, second, third, arr, arr0, arr1);
        System.out.println(iterateThrough(first, second, third));
        
    }
    public static void addon(HashSet first, HashSet second, HashSet third, int[] arr, int[] arr0, int[] arr1) {
        for(int i=0; i<arr.length; i++) {
            first.add(arr[i]);
        }
        for(int i=0; i<arr0.length; i++) {
            second.add(arr[i]);
        }
        for(int i=0; i<arr1.length; i++) {
            third.add(arr[i]);
        }
        /*first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        second.add(1);
        second.add(5);
        second.add(6);
        second.add(7);
        third.add(1);
       */ third.add(9);
    }

    
    public static Object iterateThrough(HashSet first, HashSet second, HashSet third) {
        Iterator it = first.iterator();
        Iterator it0 = second.iterator();
        Iterator it1 = third.iterator();
        Object duplicate = null;
           while(it0.hasNext()) {
                    duplicate = it0.next();
                    if (first.contains(duplicate)) {
                    for (Object obj : first) {
                    if (obj.equals(duplicate)) {
                         duplicate = obj;
                         //return obj;
                    }
                    for (Object obj1 : third) {
                     if(obj1.equals(duplicate)) return obj1;
               } 
          }
           }
          
    }
            return null;
   }
}
