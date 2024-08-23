package Programs;
import java.util.*;
public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int t=sc.nextInt();
		int sum=0;
		for(int i=1;i<=t;i++) {
		for(int j=0;j<n;j++)
		{
		arr[j]=sc.nextInt();
		sum=sum+arr[j];
		}
		System.out.println(sum);
		sum=0;
		}
	
	}
}
