package LL;
import java.util.*;
public class SpecialsMethodsforStackQueue {
public static void main(String args[]) {
	LinkedList l=new LinkedList();
	l.add("dog");
	l.add("dog");
	l.add("cat");
	l.add("horse");
	
	
	l.addFirst("Tiger");
	l.addLast("Elephant");
	System.out.println(l);
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	l.removeFirst();
	l.removeLast();
	System.out.println(l);
	
}
}
