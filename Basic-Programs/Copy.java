package DAY7;
import java.util.*;
public class Copy {

	public static void main(String[] args) {
		Vector <String> vec=new Vector<String>();
		String vehicles[]=new String[3];
		vec.add("Apple");
		vec.add("Banana");
		vec.add("orange");
		System.out.println("vector elements:"+vec);
		vec.copyInto(vehicles);
		System.out.println("Array elements:");
		for(String v:vehicles) {
			System.out.println(" "+v);
		}
	}
}
