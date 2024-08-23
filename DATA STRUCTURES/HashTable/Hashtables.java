package HashTable;
import java.util.*;
import java.util.Map.Entry;
public class Hashtables {
public static void main(String args[]) {
	Hashtable <Integer,String>t=new Hashtable();
	t.put(101,"Kavi");
	t.put(102,"Kavis");
	t.put(103,"Kavit");
	//t.put(null, "X"); nullls are not allowed in hashtable
	System.out.println(t);
	
	System.out.println(t.get(101));
	t.remove(101);
	System.out.println(t);
	
	System.out.println(t.containsKey(101));//false
	System.out.println(t.containsValue("Kavis"));
	
	System.out.println(t.isEmpty());
	
	//toget all the keys and values
	System.out.println(t.keySet());//returns as a set
	System.out.println(t.values());
	
	for(Object i:t.keySet()) {
		System.out.println(i+"  "+t.get(i));
	}
	System.out.println();
	//Entry specific methods
	for(Map.Entry entry:t.entrySet()) {//(key,value)
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	System.out.println();
	//iterator
	Set s=t.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
		Map.Entry entry=(Entry) it.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
}
}
