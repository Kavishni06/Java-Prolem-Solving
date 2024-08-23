package DAY17;
import java.util.*;
public class Stringprgm {
	public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int Square= num*num;
        int lastdigit=Square % 10;
        System.out.println("enter the number:" +Square);
        if(num ==lastdigit){
            System.out.println("It is automorphic");
            
        }
        else{
            System.out.println("It is not automorphic");
        }
    }
}

    

