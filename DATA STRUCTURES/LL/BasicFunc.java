package LL;
import java.util.*;
public class BasicFunc {
public static void main(String args[]) {
	LinkedList l=new LinkedList();//heterogenoes data
	//LinkedList <Integer> l=new LinkedList<Integer>(); //homogeneous data
	//add elemrnts
	l.add(100);
	l.add("welcome");
	l.add(15.6);
	l.add("A");
	l.add(true);
	l.add(null);
	System.out.println(l);
	System.out.println(l.size());
	//remove
	l.remove(3);
	System.out.println("After removing:"+l.size());
	System.out.println(l);
	//adding in the middle of LL
	l.add(3,"Kavi");
	System.out.println(l);
	//retriving the  object
	System.out.println(l.get(5));
	//change the element
	l.set(5, "X");
	System.out.println(l);
	//contains
	System.out.println(l.contains("Java"));
	//isEmpty
	System.out.println(l.isEmpty());
	/*retriving all elements-for loop
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	//retriving using for each loop
	for(Object i:l) {
		System.out.println(i);
	}*/
	//retriving using iterator
	Iterator it=l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
