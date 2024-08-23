package Programs;
import java.util.*;
public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++) {
        	if(num%i==0) {
        		sum+=i;
        	}
        }
        if(sum==num) {
        	System.out.println("Perfect");
        
        }
        else {
        	System.out.println("Not Perfect");
        }
	}

}
