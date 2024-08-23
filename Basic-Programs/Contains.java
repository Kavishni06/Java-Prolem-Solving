package DAY7;
import java.util.*;
public class Contains {

	public static void main(String[] args) {
		Vector <String> vec2=new Vector<String>();
	    vec2.add("Grapes");
	    vec2.add("Orange");
	    vec2.add("Banana");
	    vec2.add("Papaya");
	    vec2.add("Cherry");
	    if(vec2.contains("Orange")) {
	    	System.out.println("it contains orange");
	    }
	    else {
	    	System.out.println("it not contains orange");
	    }
	}

}
