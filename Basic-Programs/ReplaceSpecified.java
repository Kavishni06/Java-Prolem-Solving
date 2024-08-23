package DAY7;
import java.util.*;
public class ReplaceSpecified {

	public static void main(String[] args) {
		Vector <String> vec2=new Vector<String>();
	    vec2.add("Grapes");
	    vec2.add("Orange");
	    vec2.add("Banana");
	    vec2.add("Papaya");
	    vec2.add("Cherry");
	    System.out.println(vec2);
	    Collections.replaceAll(vec2, "Banana", "Apple");
	    System.out.println(vec2);

	}

}
