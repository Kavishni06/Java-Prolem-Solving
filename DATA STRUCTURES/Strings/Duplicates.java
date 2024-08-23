package Strings;
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	int count=0;
        	for(int j=i+1;j<ch.length;j++) {
        		if(ch[i]==ch[j]) {
        		   ch[j]='*';
        		   count++;
        		}
        		}
        		if(count==0 && ch[i]!='*') {
        			System.out.print(ch[i]+" ");
        		}
        		
        	}
        		
        }
      }
	


