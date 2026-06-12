package Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorQueue {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add("hey");
		q.add("Welc");
		q.offer("Noorpal");
//		q.add(420);
		System.out.println(q);
		
		//get the head element
		System.out.println(q.element()); //throws exception
		System.out.println(q.peek());	//gives null value
		
		//return and remove the elements from queue
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		for (Iterator iterator = q.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		}
	}
}
