package ArraySearching;
import java.util.*;
public class SentinelLinrearSearch {
  public static void sentinelSearch(int arr[],int n,int key) {
	  int last=arr[n-1];
	  
	  arr[n-1]=key;
	  int index=0;
	  while(arr[index]!=key) {
		  index++;
		  
	  }
	  arr[n-1]=last;
	  if((index<n-1)||arr[n-1]==key) {
		  System.out.println("Found at"+index);
	  }
	  else {
		  System.out.println("Not found");
	  }
  }
  public static void main(String args[]) {
	  int arr[]= {1,2,3,4,5};
	  int n=arr.length;
	  int key=2;
	  sentinelSearch(arr,n,key);
  }
	
	

}
