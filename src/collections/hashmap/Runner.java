package collections.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Runner {
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("hello", "გამარჯობა");
		System.out.println(hmap.get("hello"));
		Iterator it2 = hmap.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}