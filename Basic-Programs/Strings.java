package DAY8;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		Stack <String> stack=new Stack<>();
		stack.push("hi");
		stack.push("bi");
		stack.push("kii");
		stack.push("poo");
		boolean var=stack.isEmpty();
		System.out.println(var);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		boolean var1=stack.isEmpty();
		System.out.println(var1);

	}

}
