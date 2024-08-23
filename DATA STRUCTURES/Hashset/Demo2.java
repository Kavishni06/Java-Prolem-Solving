package Hashset;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet hs=new HashSet();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        System.out.println(hs);
        //addall
        HashSet num = new HashSet();
        num.addAll(hs);
        num.add(10);
        num.add(2);
        System.out.println(num);
        
        //removeall
        
        num.removeAll(hs);
        System.out.println(num);
        
        
	}

}
