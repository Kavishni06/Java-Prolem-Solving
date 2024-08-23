package Programs;
import java.util.*;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        for(int i=0;i<size;i++) {
        	arr1[i]=sc.nextInt(); 	
        }
        for(int i=0;i<size;i++) {
        	arr2[i]=sc.nextInt();	
        }
        int res[]=new int[size];
        for(int i=0;i<size;i++) {
        	if(arr1[i]>=arr2[i]) {
        		res[i]=arr1[i];
        	}
        	else if(arr1[i]<=arr2[i]) {
        		res[i]=arr2[i];
        	}
        }
        System.out.println(Arrays.toString(res));
	}

}
