package DAY4;
import java.util.*;
public class MyThread extends Thread {
	public void run() {
		System.out.println("Run");
	}

	public static void main(String[] args) {
		System.out.println("main");
		MyThread r1=new MyThread();
		r1.start();
	}

}