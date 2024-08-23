package DAY7;
import java.util.*;
public class Sublist {

	public static void main(String[] args) {
	Vector <String> vec=new Vector<String>(2);
	  vec.addElement("Apple");
	  vec.addElement("Orange");
	  vec.addElement("Mango");
	  vec.addElement("Fig");
	  vec.addElement("Figi");
	  List subList=vec.subList(2,4);
	  System.out.println("Sub list elements:");
	  for(int i=0;i<subList.size();i++) {
		  System.out.println(subList.get(i));
	  }

	}

}
