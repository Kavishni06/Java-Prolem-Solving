package DAY6;
import java.util.*;
public class Linkedlistprogram {

	public static void main(String[] args) throws java.lang.Exception{
	LinkedList days=new LinkedList();
	days.add("Monday");
	days.add("Tuesday");
	days.add("Wednesday");
	days.add("Thursday");
	days.add("Friday");
	Iterator<String> itr=days.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
	}
	days.addFirst("Sunday");
	days.addLast("Saturday");
	System.out.println(days);
	days.add(0,"Days in a week");
	days.add(4,"Middle");
	days.add(9,"End");
	System.out.println(days);
	days.removeFirst();
	days.remove(2);
	System.out.println(days);
	System.out.println("Size:"+days.size());
	

	}

}
