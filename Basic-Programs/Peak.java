package Programs;
import java.util.*;
public class Peak {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		System.out.println(arr[n-1]);
	}
}


