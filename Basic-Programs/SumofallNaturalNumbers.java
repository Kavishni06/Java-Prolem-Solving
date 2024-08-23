package DAY2;
import java.util.*;
public class SumofallNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of all NAtural numbers="+sum);

	}

}
