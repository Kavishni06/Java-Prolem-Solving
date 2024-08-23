package DAY7;
import java.util.*;
public class Compareprg {

	public static void main(String[] args) {
		Vector <String> vec1=new Vector<String>();
		Vector <String> vec2=new Vector<String>();
		Vector <String> vec3=new Vector<String>();
		vec1.add("Apple");
		vec1.add("org");
		vec1.add("Fig");
		vec2.add("Apple");
		vec2.add("org");
		vec2.add("Fig");
		vec3.add("Apple");
		vec3.add("org");
		vec3.add("Fig");
	
	if(vec1.equals(vec2)) {
		System.out.println("Vec1 and Vec2 have same elements");
	}
	else {
		System.out.println("Vec1 and Vec2 have different elements");
	}
	if(vec1.equals(vec3)) {
		System.out.println("Vec1 and Vec3 have same elements");
	}
	else {
		System.out.println("Vec1 and Vec3 have different elements");
	}

}
}
