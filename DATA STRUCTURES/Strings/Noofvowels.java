package Strings;
import java.util.*;
public class Noofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String name=sc.next();
         name=name.toUpperCase();
         int count=0;
         for(int i=0;i<name.length();i++) {
        	 if(isVowel(name.charAt(i))) {
        		 count++;
        	 }
         }
         System.out.println(count);
	}
	public static boolean isVowel(char ch) {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		return false;
	}

}
