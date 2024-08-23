package DAY6;
import java.util.*;
public class ArraytoArraylist {

	public static void main(String[] args) {
    String days[]= {"sunday","monday","tuesday"};
    ArrayList <String> arrList=new ArrayList <String>(Arrays.asList(days));
    for(String item:arrList) {
    	System.out.println(item);
    }

	}

}

