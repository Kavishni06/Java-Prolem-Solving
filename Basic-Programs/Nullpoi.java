package DAY4;
import java.util.*;
public class Nullpoi {
    static String s;
	public static void main(String[] args) {
		try {
		 s=null;
		 System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
