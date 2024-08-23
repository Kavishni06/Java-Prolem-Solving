package Programs;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=100;
		int testcase=sc.nextInt();
		int discount;
		for(int i=1;i<=testcase;i++) {
			discount=sc.nextInt();
			System.out.println(total-discount);
			
		}
		

	}

}
