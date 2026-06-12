package Collection;
import java.util.HashSet;
public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer>hs = new HashSet<>();
		hs.add(420);	
		hs.add(50);
		hs.add(40);
		hs.add(30);
		hs.add(20);
		System.out.println(hs);
		hs.remove(40);
		System.out.println(hs);
		System.out.println(hs.contains(50));
		hs.clear();
		System.out.println(hs);
	}
}
