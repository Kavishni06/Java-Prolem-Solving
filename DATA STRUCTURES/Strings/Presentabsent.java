package Strings;
import java.util.*;
public class Presentabsent {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		for(int j=0;j<3;j++) {
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		
		int Pcount=0;
		int Acount=0;
		for(int i=0;i<5;i++) {
			if(ch[i]=='A') {
				Acount++;
			}
			else {
				Pcount++;
			}
		}
		if(Pcount>=4) {
			System.out.println("eligible to get incentive");
		}
		else if((Pcount<4)&&(Pcount!=0)) {
			System.out.println("Not eligible");
		}
		else if(Pcount==0) {
			System.out.println("Not a member");
		}
		else {
			System.out.println();
		}
	}
	}

}
