package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Hashmap {
	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap<>();
		hm.put(1, "Noorpal");
		hm.put(2, "Arsh");
		hm.put(3, "Baani");
		System.out.println(hm);
		Set set = hm.entrySet();
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			Map.Entry entry = (Map.Entry) itr.next();
		}
		for(Map.Entry tree1 : hm.entrySet()) {
			System.out.println(tree1.getKey() + " " + tree1.getValue());
		}
	}
}
