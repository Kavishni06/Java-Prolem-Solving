package DAY2;
import java.util.*;
public class SumofOdd {

	public static void main(String[] args) {
		int sum=0;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		if(i%2!=0) {
			sum+=i;
		}
	}
	System.out.println("Sum of odd="+sum);

	}

}
