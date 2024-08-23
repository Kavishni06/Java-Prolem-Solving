package Programs;
import java.util.*;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int term=sc.nextInt();
     /*int n1=0;
     int n2=1;
     System.out.print(n1+" ");
     System.out.print(n2+" ");
     int sum=0;
     for(int i=3;i<=term;i++) {
    	 sum=n1+n2;
    	 n1=n2;
    	 n2=sum;
    	 
    	 System.out.print(sum+" ");
     }
     
	}

}*/
     for(int i=0;i<term;i++) {
    	 int value=fibonacci(i);
    	 System.out.print(value+" ");
     }
	}
     public static int fibonacci(int n) {
    	 if(n<=1)
    		 return n;
    	 return fibonacci(n-1)+fibonacci(n-2);
     }
    	 
     }
