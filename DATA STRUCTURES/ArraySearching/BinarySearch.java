package ArraySearching;
import java.util.*;
public class BinarySearch {
	public  static int binarySearch(int arr[],int x) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]<x)
			  low=mid+1;
			else
				high=mid-1;	
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[]= {2,3,4,10,40};
		int n=arr.length;
		int x=10;
		int result=binarySearch(arr,x);
		if(result==-1)
			System.out.println("Not found");
		else
			System.out.println(result);
		
		

	}

}
