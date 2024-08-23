package Strings;
import java.util.*;
public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String val[]= {"abi","cat","bat"};
       for(int i=0;i<val.length;i++) {
    	   for(int j=0;j<val.length-1;j++) {
    		   if(val[i].compareTo(val[j])<0) {
    			   String  temp=val[i];
    			   val[i]=val[j];
    			   val[j]=temp;
    		   }
    	   }
       }
       for(String word:val) {
    	   System.out.println(word);
       }
       
	}

}
