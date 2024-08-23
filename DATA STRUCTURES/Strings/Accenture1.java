package Strings;
import java.util.*;
public class Accenture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String arr[]=s.split("");
        System.out.print(arr[0]);
        for(int i=0;i<arr.length-1;i++) {
        int j=i+1;
        if(!(arr[i].equals(arr[j]))) {
         System.out.print(arr[j]);
      }
           }
        }
        
	}


