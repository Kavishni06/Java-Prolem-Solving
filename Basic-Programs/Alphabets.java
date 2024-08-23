package DAY2;
import java.util.*;
public class Alphabets {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	char alp=sc.next().charAt(0);
    for(char i=alp;i<='z';i++) {
    	System.out.print(i+" ");
    }
}
}