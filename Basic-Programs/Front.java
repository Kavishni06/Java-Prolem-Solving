package DAY6;
import java.util.*;
public class Front {

	public static void main(String[] args) {
		
			LinkedList<String> book_list = new LinkedList<String>();
			book_list.add("Cpp");
			book_list.add("Php");
			book_list.add("Css");
			book_list.add("Python");
			book_list.add("MySql");
			System.out.println("Given linked list : "+ book_list);
			book_list.offerFirst("Java");
			System.out.println("Final linked list : "+ book_list);  
		}

}


