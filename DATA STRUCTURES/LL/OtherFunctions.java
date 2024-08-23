package LL;
import java.util.*;
public class OtherFunctions {
public static void main(String args[]) {
	LinkedList l=new LinkedList();
	l.add("x");
	l.add("y");
	l.add("z");
	l.add("A");
	l.add("B");
	LinkedList ls=new LinkedList();
	ls.add("m");
	ls.addAll(l);
	System.out.println(ls);
	ls.removeAll(l);
	System.out.println(ls);
	//sorting Ascendinng
	Collections.sort(l);
	System.out.println(l);
	//sorting descending
	Collections.sort(l,Collections.reverseOrder());
	System.out.println(l);
	//shuffling
	Collections.shuffle(l);
	System.out.println(l);
}
}
