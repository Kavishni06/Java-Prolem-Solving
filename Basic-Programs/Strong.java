package DAY2;
import java.util.*;
public class Strong {

	public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	while(temp>0) {
		int remainder=temp%10;
		int fact=1;
		int i=1;
		while(i<=remainder) {
			fact=fact*i;
			i++;
		}
		temp=temp/10;
		 sum+=fact;
	}
System.out.println(sum);
if(num==sum) {
	System.out.println("Strong");
}
else {
	System.out.println("Not a strong number");
}
	}

}
