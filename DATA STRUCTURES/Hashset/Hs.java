package Hashset;
import java.util.*;
public class Hs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //HashSet hs=new HashSet();//default capacity is 16 and load factor is 0.75
        
        HashSet hs=new HashSet(100);//setting up the size
        
        //Add  elements
        hs.add(100);
        hs.add("Kavi");
        hs.add(1.3);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        
        //remove element
        hs.remove(1.3);
        System.out.println(hs);
        
        System.out.println(hs.contains(1.3));
        
        System.out.println(hs.isEmpty());
        
        //reading all the elements from hashset using for each loop
        
        for(Object i:hs) {
        	System.out.println(i);
        }
        
        //iterator method
        
        Iterator it=hs.iterator();
        while(it.hasNext()) {
        	System.out.print(it.next()+" ");
        }
        
        
	}

}
