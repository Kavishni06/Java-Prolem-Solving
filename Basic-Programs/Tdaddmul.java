package Programs;
import java.util.*;
public class Tdaddmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int colsize=sc.nextInt();
    int rowsize=sc.nextInt();
    int arr[][]=new int[rowsize][colsize];
    for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int arr1[][]=new int[rowsize][colsize];
    for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
    		arr1[i][j]=sc.nextInt();
    	}
    }
    
    int sum=0;
    int arr3[][]=new int[rowsize][colsize];
    for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
    	arr3[i][j]=arr[i][j] + arr1[i][j];
    		
    	}
    	
    }
    System.out.println(arr3[0][2]);
    /*for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
          System.out.print(arr3[i][j]+" ");
	}
    	System.out.println();

}*/
	}
}
