package DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 int arr[][]=new int[size][size];
	 int arr1[][]=new int[size][size];
	 for(int i=0;i<size;i++) {
		 for(int j=0;j<size;i++) {
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 System.out.print(Arrays.toString(arr));
	 (int i=size-1,c=0;i>=0;i--,c++) {
		 for(int j=0,m=0;j<size;j++,m++) {
			 arr1[c][m]=arr[i][j];
			 System.out.print(arr1[c][m]+" ");
		 }
		 System.out.println();
		 
	 }

	}

}
