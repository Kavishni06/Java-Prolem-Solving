package ArrayPrograms;
import java.util.*;
public class SecondLargest {
public static void printSecond(int arr[],int size) {
	int largest,second;
	if(size<2) {
		System.out.println("Cannot be performed");
	}
	 largest= second =Integer.MIN_VALUE;
	 for(int i=0;i<size;i++) {
		 largest=Math.max(largest, arr[i]);
	 }
	 for(int i=0;i<size;i++) {
		 if(arr[i]!=largest) {
			 second=Math.max(second, arr[i]);
		 }
	 }
	 if(second==Integer.MIN_VALUE) {
		 System.out.println("There is no second largest element");
	 }
	 else {
		 System.out.println(second);
	 }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,1,0 };
        int n = arr.length;

        printSecond(arr, n);
	}

}
