package Programs;

import java.util.Scanner;

public class Arraycube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			int cube=arr[i]*arr[i]*arr[i];
			sum=sum+cube;
		}
		System.out.println(sum);
		

	}

}
