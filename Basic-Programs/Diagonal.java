package Programs;
import java.util.*;
public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++) {
        	for(int j=0;j<4;j++) {
        		arr[i][j]=sc.nextInt();
        	}
        }
        int sum1=0;
        for(int i=0;i<4;i++) {
        	for(int j=i;j<=i;j++) {
        		sum1+=arr[i][j];
        	}
        }
        int sum2=0;
        
       for(int i=0,j=3;i<4;i++) {
    	   sum2+=arr[i][j];
    	   j--;
       }
       
        	
       int sum=sum1+sum2;
       System.out.println(sum);
        
}}
