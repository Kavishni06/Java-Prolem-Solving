package DAY2;
import java.util.*;
public class Reverse_alphabet {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char alp=sc.next().charAt(0);
	for(char i='z';i>=alp;i--) {
		System.out.print(i+" ");
	}

	}

}
