package ArrayPrograms;
import java.util.*;
public class RotationusingTemp {
public static void rotate(int arr[],int d,int n) {
	int temp[]=new int[n];
	int k=0;
	for(int i=d;i<n;i++) {
		temp[k]=arr[i];
		k++;
	}
	for(int i=0;i<d;i++) {
		temp[k]=arr[i];
		k++;
	}
	for(int i=0;i<n;i++) {
		arr[i]=temp[i];
	}
	System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotate(arr,2,arr.length);
	}

}
