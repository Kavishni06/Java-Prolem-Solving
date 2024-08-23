package Programs;
import java.util.*;
public class Newdiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++) {
			int ftv=sc.nextInt();
			int stv=sc.nextInt();
			int fd=sc.nextInt();
			int sd=sc.nextInt();
			if((ftv-fd)<(stv-sd)) {
				System.out.println("First");
			}
			else if((ftv-fd)(stv-sd)) {
				System.out.println("Second");
			}
			else {
				System.out.println("Any");
			}
			
		}

	}

}
