package Strings;
import java.util.*;
public class Accenture2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String arr[]=s.split("");
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			int j=i+1;
			if(!(arr[i].equals(arr[j]))){
				count++;
			}
		}
		System.out.println(count);
	}
}
