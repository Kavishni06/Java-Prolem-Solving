package Strings;
import java.util.*;
public class Duplicate {

	   public static void method1(String str) {
		// TODO Auto-generated method stub
		
		char ch[]=new char[str.length()];
		 ch=str.toCharArray();
		 for(int i=0;i<ch.length;i++) {
			 for(int j=i+1;j<ch.length;j++) {
				 if(ch[i]==ch[j]) {
					System.out.print(ch[i]+" ");
				 }
			 }
		 }
		 System.out.println();
				

	}
	   public static void method2(String str) {
			// TODO Auto-generated method stub
			
			char ch[]=new char[str.length()];
			 ch=str.toCharArray();
			 for(int i=0;i<ch.length;i++) {
				 for(int j=i+1;j<ch.length;j++) {
					 if(ch[i]!=ch[j]) {
						 System.out.print(ch[i]+" ");
						
					 }
				 
					
					
				 }
				 
			 }
					

		}
	   
	   public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   String str=sc.next();
		   method1(str);
		   method2(str);
	   }
	   
	   
}
