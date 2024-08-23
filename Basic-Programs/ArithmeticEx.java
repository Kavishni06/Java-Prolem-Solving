package DAY4;
import java.util.*;
public class ArithmeticEx {

	public static void main(String[] args) {
	try {
		int a=100/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}

	}

}
