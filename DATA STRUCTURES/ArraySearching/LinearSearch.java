package ArraySearching;
import java.util.*;
public class LinearSearch {

	
		// TODO Auto-generated method stub
        public static int search(int arr[],int N,int target) {
        	for(int i=0;i<N;i++) {
        		if(arr[i]==target) {
        			return i;
        		}
        		
        	}
        	return -1;
        }
        public static void main(String args[]) {
        	int arr[]= {1,2,3,4,5};
        	int target=3;
        	int N=arr.length;
        	int result=search(arr,N,target);
        	if(result==-1) {
        		System.out.println("Element not found");
        	}else
        		System.out.println(result);
        }
	}


