package Programs;
import java.util.*;
public class Prime {
	public static boolean isPrime(int n) {
		int i;
		int m=n/2;
		if(n==0||n==1) {
			return false;
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int term=sc.nextInt();
      for(int i=0;i<=term;i++) {
    	  if(isPrime(i)) {
    		  System.out.println(i);
    	  }
      
      }
  	
}
      
}
