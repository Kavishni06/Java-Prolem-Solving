package Programs;
import java.util.*;
public class StrongNumber {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	int sum =0;
	while(temp!=0) {
		int remainder=temp%10;
		sum=sum+factorial(remainder);
		temp=temp/10;
	}
	if(num==sum) {
		System.out.println("Strong Number");
	}
	else {
		System.out.println("Not Strong Number");
	}
}
}
