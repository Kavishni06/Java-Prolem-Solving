package DAY7;
import java.util.*;
public class FirstelementVector {

	public static void main(String[] args) {
		Vector <String> vec2=new Vector<String>();
	    vec2.add("Grapes");
	    vec2.add("Orange");
	    vec2.add("Banana");
	    vec2.add("Papaya");
	    vec2.add("Cherry");
	    System.out.println("First element:"+vec2.firstElement());
        System.out.println("last element:"+vec2.lastElement());
	}

}
