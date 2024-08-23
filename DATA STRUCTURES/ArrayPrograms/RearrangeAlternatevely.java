package ArrayPrograms;
import java.util.*;
public class RearrangeAlternatevely {
public static void rearrange(long arr[],int n) {
	Arrays.sort(arr);
	long temp[]=new long[n];
	int small=0;
	int large=n-1;
	boolean flag=true;
	for(int i=0;i<n;i++) {
		if(flag) {
			temp[i]=arr[large--];
		}
		else {
			temp[i]=arr[small++];
		}
		flag=!flag;
	}
	for(int i=0;i<n;i++) {
		arr[i]=temp[i];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         long arr[]= {2,3,4,1,5,6};
         int n=arr.length;
         rearrange(arr,n);
         for(int i=0;i<n;i++) {
        	 System.out.print(arr[i]+" ");
         }
	}

}
