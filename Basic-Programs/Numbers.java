package DAY4;
import java.util.*;
public class Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=20;i++) {
			int num=sc.nextInt();
			if((num%3==0)&&(num%5==0)){
				System.out.println("usbdevice");
			}
			else if(num %3==0) {
				System.out.println("usb");
			}
			else if(num%5==0) {
				System.out.println("device");
			}
			
			else {
				System.out.println(num);
			}
			
		}
	}

}
