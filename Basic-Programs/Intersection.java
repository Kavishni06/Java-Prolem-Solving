package Programs;
import java.util.*;
public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
		arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
		arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++) {
			if(arr1[i]==arr2[i]) {
				System.out.println(arr1[i]);
				
				
			}
		}
	}

}
