package Collection;
import java.util.TreeMap;
public class treemap {
	public static void main(String[] args) {
		TreeMap <Integer,String> tree = new TreeMap<>();
		tree.put(1, "Noor");
		tree.put(4, "Arsh");
		tree.put(3, "Baani");
		System.out.println(tree);
		System.out.println(tree.ceilingEntry(2));
		System.out.println(tree.floorKey(2));
		System.out.println(tree.containsKey(2));
		System.out.println(tree.containsValue("Noorpal"));
		System.out.println(tree.get(2));
		System.out.println(tree.firstEntry());
		System.out.println(tree.headMap(2));
		System.out.println(tree.higherEntry(2));
		System.out.println(tree.higherKey(2));
		System.out.println(tree.keySet());
		System.out.println(tree.values());
		System.out.println(tree.pollFirstEntry());
		System.out.println(tree);
		tree.remove(4);
		System.out.println(tree);
		tree.replace(3, "Tebby");
		System.out.println(tree);
	}
}
