package Programs;
import java.util.*;
public class Arrayp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[0]);		
	}

}
