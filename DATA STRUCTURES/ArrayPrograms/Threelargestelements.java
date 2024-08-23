package ArrayPrograms;
import java.util.*;
public class Threelargestelements {
public static void printLargest(int arr[],int size) {
	int first,second,third;
	if(size<3) {
		System.out.println("Invalid");	
	}
	first=third=second=Integer.MIN_VALUE;
	for(int i=0;i<size;i++) {
		if(arr[i]>first) {
			third=second;
			second=first;
			first=arr[i];
		}
		else if(arr[i]>second) {
			third=second;
			second=arr[i];
		}
		else if(arr[i]>third) {
			third=arr[i];
		}
	}
	System.out.println(first+" "+second+" "+third);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        printLargest(arr, n);
		
     
	}

}
