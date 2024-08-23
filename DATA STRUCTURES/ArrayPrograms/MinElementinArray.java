package ArrayPrograms;
import java.util.*;
public class MinElementinArray {
public static int min(int arr[],int n) {
	int minval=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]<minval) {
			minval =arr[i];
		}
	}
	return minval;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(min(arr,n));

	}

}
