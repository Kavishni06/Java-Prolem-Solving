package Programs;
import java.util.*;
public class Distinct {
   public static void main(String args[]) {
	   int arr[]= {10,10,50,50,20,20,20,40,10,21};
	   for(int i=0;i<arr.length;i++) {
		   int count=0;
		   for(int j=i+1;j<arr.length;j++) {
		   if(arr[i]==arr[j]) {
			   arr[j]='*';
			   count++;
		   }
	   }
		   if(count==0 && arr[i]!='*') {
			   System.out.print(arr[i]+" ");
		   }
   }
   }
}
