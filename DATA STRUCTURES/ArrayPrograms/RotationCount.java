package ArrayPrograms;
import java.util.*;
public class RotationCount {
	public static int count(int arr[],int n) {
		int min=arr[0],minindex=0;
		for(int i=0;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
				minindex=i;
			}
		}
		return minindex;
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,1,2};
		int n=arr.length;
		int ans=count(arr,n);
		System.out.println(ans);
	}

}
