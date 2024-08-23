package ArrayPrograms;
import java.util.*;
public class ReverseusingRecursion {
  public static void reversearray(int arr[],int str,int end) {
	  int temp=0;
	  if(str>=end)
		  return;
		  temp=arr[str];
		  arr[str]=arr[end];
		  arr[end]=temp;
		  reversearray(arr,str+1,end-1);
  }
  public static void printarray(int arr[],int size) {
	  for(int i=0;i<size;i++) {
		  System.out.print(arr[i]+" ");
		  
	  }
	  System.out.println();
  }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int str=0;
		int end=arr.length-1;
		printarray(arr, 5);
		reversearray(arr,str,end);
		printarray(arr,5);
     
	}

}
