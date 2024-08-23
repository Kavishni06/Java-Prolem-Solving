package DAY2;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    if((num%8==0)&&(num%4==0))
	    	System.out.println("correct");
	    else
	    	System.out.println("Not correct");
	}

}
