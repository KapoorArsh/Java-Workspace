//Introduction of JavaStreamAPI
//*These streams are related to CollectionFrameworks/(Groups of objects).
//These streams are very different from io stream,io streams are the sequence of data.
//*StreamAPI-These streams are used to process the group of objects
//*IOStream-These streams are Used to read and write the data from source to destination.
//Sequence of data.
//*These streams are introduced in java 1.8version.
//*Streams API is basically perform bulk operations and process the objects of collection.
//*Stream reduce the code length.
//With stream vs Without StreamCode Comparison
package corejava.Java9.features;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICompare {
public static void main(String args[])
{
	//Q)Crate a link list and filter all even numbers from list
	List<Integer>list1=List.of(25,36,41,56,78,33,39);
	System.out.println(list1);
	//List<Integer>list2=new ArrayList<Integer>();
	//list2.add(87);
	//list2.add(67);
	//list2.add(56);
	//list2.add(46);
	//list2.add(45);
	//List<Integer>list3=Arrays.asList(45,67,89,65,67);
	//list1
	//without stream
	//List<Integer>listEven=new ArrayList<>();
	//for(Integer i:list1) {
	//	if(i%2==0)
		//{
			//listEven.add(i);
		//}
	//}
	//	System.out.println(listEven);
	//Using Stream
	Stream<Integer> stream=list1.stream();
	List<Integer>newlist=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newlist);
	 List<Integer>newlist1=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	 System.out.println(newlist1);
	 //Numbers from list1 which is greater 
	 List<Integer>newlist2= list1.stream().filter(i->i>45).collect(Collectors.toList());
	 System.out.println(newlist2);
	}
}

