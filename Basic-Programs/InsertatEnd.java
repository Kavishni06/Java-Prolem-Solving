package DAY6;
import java.util.*;
public class InsertatEnd {

	public static void main(String[] args) {
			LinkedList<String> fru_list = new LinkedList<String>();
			fru_list.add("Guava");
			fru_list.add("Papaya");
			fru_list.add("Mulberry");
			fru_list.add("Apple");
			fru_list.add("Banana");
			fru_list.add("Cherry");
			fru_list.add("Watermelon");
			fru_list.add("Pineapple");
			System.out.println("Given linked list :" + fru_list);  
			Object f_ele = fru_list.getFirst();
			System.out.println("First Element : "+f_ele);
			Object l_ele = fru_list.getLast();
			System.out.println("Last Element : "+l_ele);
		}


	}


