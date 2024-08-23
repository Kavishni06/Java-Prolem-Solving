package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.*;
public class LinkedListss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList q =new LinkedList();
      q.offer("A");
      q.offer("A");
	  q.add(100);
	  q.add("B");
		q.add("c");
		q.offer("c");
		System.out.println(q); //[A, B, c, c]
		//get head element element() peek()
		System.out.println(q.element()); //A
		//System.out.println(q.peek()); //A
		
		
		//return and remove the element fromqueue  remove() poll()
		//System.out.println(q.remove());
		//System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println();
		Iterator it =q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			}
	  
	}

	
	
	}

