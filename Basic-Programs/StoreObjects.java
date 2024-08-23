package DAY7;
import java.util.*;

public class StoreObjects {

	public static void main(String[] args) {
		Vector <Complex> vec=new Vector<Complex>();
		vec.add(new Complex(1,6));
		vec.add(new Complex(2,7));
		vec.add(new Complex(3,8));
		vec.add(new Complex(4,9));
		vec.add(new Complex(5,10));
        for(Complex c:vec) {
        	c.printComplex();
        }
	}

}
class Complex{
	int real;
	int ima;
	Complex(int r,int i){
		this.real=r;
		this.ima=i;
	}
	void printComplex() {
		System.out.println("Complex:"+real+"+"+ima+"i");
	}
	
}
