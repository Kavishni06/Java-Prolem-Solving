package ArrayPrograms;
import java.util.*;
public class Evenpositionedgreaterthanoddpositioned {
	public static void rearrange(int arr[]) {
		int N=arr.length;
		for(int i=1;i<N;i++) {
			if((i+1)%2==0) {
				if(arr[i]<arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
			}
			else {
				if(arr[i]>arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=arr[i];
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,2,1};
        rearrange(a);
        
	}

}
