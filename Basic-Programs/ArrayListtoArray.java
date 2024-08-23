package DAY6;
import java.util.*;
public class ArrayListtoArray {
	public static void main(String[] args) {
	 ArrayList <String> aList=new ArrayList<String>();
	 aList.add("Book");
	 aList.add("Pen");
	 aList.add("pencil");
	 String[] arr=(String[])aList.toArray(new String[aList.size()]);
	 System.out.println(Arrays.toString(arr));

	}

}
