
package tasks.finddupname;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        String[] names = {"გიორგი", "ნინო", "ნინო", "გიორგი", "ბექა"};
        findrep(names, hm);
    }
    public static void findrep(String[] names, HashMap hm) {
        for(int i=0; i<names.length; i++) {
            if(!hm.containsKey(names[i])) hm.put(names[i], 1);
            else {
                hm.replace(names[i], (int)hm.get(names[i])+1);
            }
        }
        System.out.println(hm);
    }
}
