package Programs;
import java.util.*;
public class Duplicatepeak {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++) {
    	 arr[i]=sc.nextInt();
     }
   
     for(int i=0;i<size;i++) {
    	 for(int j=i+1;j<size;j++) {
    		 if(arr[i]==arr[j]) {
    			 break;
    		 }
    		 else if(arr[i]!=arr[j]) {
    			 System.out.print(arr[i]+" ");
    		 }
    		
    	 }
     }
	}

}
