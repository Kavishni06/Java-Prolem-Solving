package DAY7;
import java.util.*;
public class SpecifiedIndex {

	public static void main(String[] args) {
		Vector <String> vec2=new Vector<String>();
	    vec2.add("Grapes");
	    vec2.add("Orange");
	    vec2.add("Banana");
	    vec2.add("Papaya");
	    System.out.println("Vector elements:"+vec2);
	    vec2.setElementAt("Pink",3);
	    System.out.println("After setting");
	    System.out.println(vec2);

	}

}
