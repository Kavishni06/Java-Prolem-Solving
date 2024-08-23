package DAY2;
import java.util.*;
public class Reverse_table {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int table=sc.nextInt();
	int start=sc.nextInt();
	int end=sc.nextInt();
	for(int i=end;i>=start;i--) {
		System.out.println(i+"*"+table+"="+i*table);
	}

	}

}
