package Programs;
import java.util.*;
public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int j=size-1;j>=0;j--) {
			System.out.println(arr[j]);
		}

	}

}
