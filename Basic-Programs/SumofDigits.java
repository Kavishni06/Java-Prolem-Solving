package DAY2;
import java.util.*;
public class SumofDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(temp>0) {
			int remainder=temp%10;
			sum+=remainder;
			temp=temp/10;
			
		}
		System.out.println("Sum of digits="+sum);
	}

}
