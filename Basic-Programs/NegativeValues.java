package DAY13;
import java.util.*;
public class NegativeValues {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size1 and size2");
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int arr[][]=new int[size1][size2];
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(arr[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
