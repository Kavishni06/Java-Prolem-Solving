package Programs;
import java.util.*;
public class Repeatedelemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int first=-1;
		int second=-1;
		for(int i=0;i<n;i++) {
		if(arr[i]==arr[i+1]) {
			if(first==-1) {
			first=arr[i];
		}
		else {
			second=arr[i];
			break;
		}
		
	}
}
		System.out.println(first+" "+second);

	}
}
