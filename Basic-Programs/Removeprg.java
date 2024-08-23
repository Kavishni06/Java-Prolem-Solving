package DAY8;
import java.util.*;
public class Removeprg {

	public static void main(String[] args) {
		Deque<Integer> n=new ArrayDeque<>();
		n.offer(14);
		n.offerLast(27);
		n.offer(18);
		n.offerFirst(15);
		boolean result=n.remove(2);
		System.out.println(n);
		int nu=n.poll();
		System.out.println(nu);
	}

}
