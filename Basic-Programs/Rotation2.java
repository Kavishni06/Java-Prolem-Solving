package Programs;
import java.util.*;
public class Rotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size-1;i++) {
        	 arr[i]=sc.nextInt();
         }
         for(int i=0,j=1;i<size;i++) {
        	 if(arr[i]!=j) {
        		 System.out.println(j);
        	 }
        	 j++;
         }
        	 
         }
	}


