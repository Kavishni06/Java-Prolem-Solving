package ArrayPrograms;
import java.util.*;
public class InsertAtAnyPosition {
public static void insert(int arr[],int n,int pos,int val) {
	for(int i=n-1;i>=pos;i--)
		arr[i+1]=arr[i];
	arr[pos]=val;
} 
public static void main(String[] args) {	
		int arr[]=new int[20];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int n=5,pos=2,val=10;
		insert(arr,n,pos,val);
		for(int i=0;i<n+1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}