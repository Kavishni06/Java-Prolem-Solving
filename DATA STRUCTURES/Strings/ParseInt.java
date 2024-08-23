package Strings;
import java.util.*;
public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="Hello123";
 StringBuilder s3=new StringBuilder();
 for(int i=5;i<=s1.length();i++) {
     s3=s3.append(s1.indexOf(i));
	}
    String num=s3.toString();
    System.out.println(num);
    System.out.println(Integer.parseInt(num));
	}
}
