package corejava.Java9.features;

import java.util.List;
import java.util.Map;

public class Factory {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : list) {
			System.out.println(l);
		}

		Map<Integer, String> map1 = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
		for (Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
