package Hashset;
import java.util.*;
public class Specialmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //union intersection difference
		
		HashSet hs1=new HashSet();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		HashSet hs2=new HashSet();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		
		System.out.println(hs1);
		System.out.println(hs2);
		
		//union
		/*hs1.addAll(hs2);
		System.out.println(hs1);*/
		
		/*//intersection
		hs1.retainAll(hs2);
		System.out.println(hs1);*/
		
		//difference
		//hs1.removeAll(hs2);
		//System.out.println(hs1);
		
		//subset
		hs1.containsAll(hs2);
		System.out.println(hs1);
	}

}
