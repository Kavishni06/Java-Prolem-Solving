package ArrayPrograms;
import java.util.*;
public class Move0toend {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int a[]=new int[size];
         for(int i=0;i<size;i++) {
        	 a[i]=sc.nextInt();
         }
         int b[]=new int[size];
         int j=0;
         int count=0;
         for(int i=0;i<size;i++) {
        	 if(a[i]!=0){
        		 b[j]=a[i];
        		 j++;
          }
          else {
        		 count++;
        	 }
         }
         while(count>0) {
        	 b[j]=0;
        	 j++;
        	 count--;
         }
         for(int i=0;i<size;i++) {
        	 a[i]=b[i];
         }
         for(int i=0;i<size;i++) {
        	 System.out.print(a[i]+" ");
         }
         
	}

}
