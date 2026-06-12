package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
	public static void main(String[] args) {
		// type safe collection
		ArrayList<String>names=new ArrayList<>();
		names.add("Noorpal");
		names.add("Arsh");
		names.add("Jindal");
		names.add("Bhavik");
		names.add("Baani");
		names.remove(4);
		System.out.println(names);
		System.out.println(names.get(0));
		// untype safe collection
		ArrayList list = new ArrayList();
		list.add("Noorpal");
		list.add(true);
		list.add(420);
		System.out.println(list);
		System.out.println("Size of list is: " + list.size());
		System.out.println(names.contains("Jindal"));
		names.set(2, "Kartik");
		System.out.println(names);
		
		ArrayList <String>v1 = new ArrayList<>();
		v1.addAll(names);
		System.out.println(v1);
		
		//iterate elements using loops
		for(int i = 0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		//sorting
		Collections.sort(names);
		System.out.println(names);
		
		//clear list
		names.clear();
		System.out.println(names);
	}
}
