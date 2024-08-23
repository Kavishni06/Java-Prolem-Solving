package Strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="Madam";
        String Name=name.toLowerCase();
        String newstr="";
        for(int i=name.length()-1;i>=0;i--) {
        	newstr+=Name.charAt(i);
        }
        System.out.println(newstr);
        if(Name.equals(newstr)) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not palindrome");
        }
	}

}
