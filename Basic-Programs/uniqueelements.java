package Programs;
import java.util.*;
public class uniqueelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int temp=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
				temp++;
				arr[j]=0;
			}
			}
			if(temp==0 && arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
