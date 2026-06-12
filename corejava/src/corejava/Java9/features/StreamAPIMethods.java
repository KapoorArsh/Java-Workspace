package corejava.Java9.features;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMethods {
	public static void main(String args[]) {
		//Filter(Predicate)
		//boolean valued function
		//e->true/false
		//map(Function)
		/*
		  In this we perform operations on each element
		  Function returns value here
		 */
		List<String>names=List.of("vijeta","Avantii","Hiii","Hllo","Avni");
		List<String>names1=	names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(names1);
		List<Integer>numbers=List.of(34,56,63,56,71,23);
		List<Integer>numbers1=numbers.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(numbers1);
       names.stream().forEach(
       e->
       {
    	System.out.println(e) ;  
       }
       );
       names1.stream().forEach(System.out::println);
       //sorted
       numbers.stream().sorted().forEach(System.out::println);
       //minimum
      Integer integer= numbers.stream().sorted().min((x,y)->x.compareTo(y)).get();
      System.out.println("Minimum number is"+integer);
      Integer integer1= numbers.stream().sorted().max((x,y)->x.compareTo(y)).get();
      System.out.println("Maximum number is"+integer1);
	}
}

