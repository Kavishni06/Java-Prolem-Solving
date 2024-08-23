package HashMap;
import java.util.*;
public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap <Integer,String> m=new HashMap<Integer,String>();
          //HashMap m=new HashMap();
          m.put(101, "Kavi");
          m.put(102, "Kavis");
          m.put(103, "Kavif");
          m.put(104, "hf");
          m.put(105, "Kavity");
          m.put(103, "x");//old value replaced with new value
          System.out.println(m);
          
          System.out.println(m.get(105));
          
          m.remove(105);//remove
          System.out.println(m);
          
          System.out.println(m.containsKey(105));//false
          System.out.println(m.containsValue("Kavi"));//true
          System.out.println(m.isEmpty());//false
          
          //to get only keys and values
          //System.out.println(m.keySet());
          for(Object i:m.keySet()) {
        	  System.out.println(i);
          }
          System.out.println();
          //System.out.println(m.values());
          for(Object i:m.values()) {
        	  System.out.println(i);
          }
          //to get the entries
          //System.out.println(m.entrySet());
          for(Object i:m.keySet()) {
        	  System.out.println(i+"  "+m.get(i));
          }
          
          System.out.println();
          
          //Entry interface methods
          for(Map.Entry i:m.entrySet()) {
        	  System.out.println(i.getKey()+" "+i.getValue());
          }
          System.out.println();
          //iterator method
          
         
          
	}

}
