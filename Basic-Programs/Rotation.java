package Programs;
import java.util.*;
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       int rot[]=new int[size];
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       for(int i=0,j=3;i<size-3;i++) {
    	  rot[i]=arr[j];
    	  j++;
       }
       
       for(int i=4,j=0;i<7;i++) {
    	   rot[i]=arr[j];
    	   j++;
       }
      for(int i=0;i<size;i++) {
    	  System.out.print(rot[i]+" ");
      }
       
	}

}
