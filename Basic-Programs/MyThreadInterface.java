package DAY4;
import java.util.*;
public class MyThreadInterface implements Runnable {
	public void run() {
		System.out.println("Run");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		MyThreadInterface r1=new MyThreadInterface();
		r1.start();
	

	}

}
