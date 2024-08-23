package Programs;
import java.util.*;
public class AppleDividee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of children:");
		int child=sc.nextInt();
		System.out.println("No of apples:");
        int apples=sc.nextInt();
        int remaining=apples%child;
        System.out.println(remaining);
	}

}
