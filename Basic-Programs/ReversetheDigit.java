package DAY2;
import java.util.*;
public class ReversetheDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(temp>0) {
			int remainder=temp%10;
			System.out.print(remainder);
			temp=temp/10;
		}
	}

}
