package DAY6;
import java.util.*;
public class Iterateprgm {

	public static void main(String[] args) {
		LinkedList<String> book_list = new LinkedList<String>();
		book_list.add("Cpp");
		book_list.add("Php");
		book_list.add("Css");
		book_list.add("Python");
		book_list.add("MySql");
		for(String b:book_list) {
			System.out.println(b);
		}

	}

}
