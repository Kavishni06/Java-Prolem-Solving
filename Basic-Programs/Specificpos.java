package DAY6;
import java.util.*;
public class Specificpos {

	public static void main(String[] args) {
	LinkedList<String> fruitlist=new LinkedList<>();
	fruitlist.add("Apple");
	fruitlist.add("Mango");
	System.out.println(fruitlist);
	fruitlist.add(2,"Orange");
    System.out.println(fruitlist);
	}

}
