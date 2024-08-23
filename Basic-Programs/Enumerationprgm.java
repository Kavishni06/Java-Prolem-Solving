package DAY7;
import java.util.*;
public class Enumerationprgm {

	public static void main(String[] args) {
	Vector <String> vec=new Vector<String>();
	vec.add("Apple");
	vec.add("Grapes");
	vec.add("Banana");
	vec.add("Mango");
	vec.add("orange");
	Enumeration enumval=vec.elements();
	System.out.println("The values are:");
	while(enumval.hasMoreElements()) {
		System.out.println(enumval.nextElement());
	}
	

	}

}
