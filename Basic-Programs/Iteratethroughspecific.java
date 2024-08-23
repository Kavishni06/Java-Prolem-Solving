package DAY6;
import java.util.*;
public class Iteratethroughspecific {

	public static void main(String[] args) {
			LinkedList<String> book_list = new LinkedList<String>();
			book_list.add("Java");
			book_list.add("C");
			book_list.add("Cpp");
			book_list.add("Python");
			book_list.add("Php");
			book_list.add("Css");
			book_list.add("Html");
			book_list.add("MySql");
			Iterator b = book_list.listIterator(3);
			while (b.hasNext())
			{
				System.out.println(b.next());
			}
		}


	}


