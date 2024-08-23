package DAY13;
import java.util.*;
public class Index {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			int tmp = 0;  
			if (arr[i] > arr[j])   
			{  
			tmp = arr[i];  
			arr[i] = arr[j];  
			arr[j] = tmp;  
			}  
			}
		
	}
	int target=sc.nextInt();
	for(int i=0;i<size;i++) {
		if(target==arr[i]) {
			System.out.print(i+" ");
		}
	}
		  
		  
	}
}
