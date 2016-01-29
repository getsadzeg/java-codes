
package collections.tasks.findrepeat;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr0 = {1,5,6,7};
        int[] arr1 = {1,9};
        HashSet first = new HashSet<>();
        HashSet second = new HashSet<>();
        addon(first, second, arr, arr0, arr1);
        System.out.println(iterateThrough(first, second));
        
    }
    public static void addon(HashSet first, HashSet second, int[] arr, int[] arr0, int[] arr1) {
        for(int i=0; i<arr.length; i++) {
            first.add(arr[i]);
        }
        for(int i=0; i<arr0.length; i++) {
            second.add(arr[i]);
        }
        
    }

    
    public static Object iterateThrough(HashSet first, HashSet second) {
        Iterator it = first.iterator();
        Iterator it0 = second.iterator();
        Object duplicate = null;
           while(it0.hasNext()) {
                    duplicate = it0.next();
                    if (first.contains(duplicate)) {
                    for (Object obj : first) {
                    if (obj.equals(duplicate)) {
                         duplicate = obj;
                         //return obj;
                    }
                    
          }
           }
          
    }
            return null;
   }
}
