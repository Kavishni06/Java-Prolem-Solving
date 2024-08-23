package DAY12;
import java.util.*;
public class Arratprg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{1,2,3,4,5,6,7,8} ;
	
	
		for(int i=0;i<8;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<8;i++) {
			if(arr[i]%2 !=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}