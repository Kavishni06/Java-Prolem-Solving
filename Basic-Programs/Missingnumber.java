package Programs;
import java.util.*;
public class Missingnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
			}
		}
		System.out.println(arr.length+1);

	}

}
