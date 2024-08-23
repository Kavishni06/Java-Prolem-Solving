package DAY11;
import java.util.*;
public class Adding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("First_number: ");

        int num1 = sc.nextInt();

        System.out.print("Second_number: ");

        int num2 = sc.nextInt();

        int sum = Test2(num1, num2);
        System.out.println("The sum is: " + sum);

    }

    public static int Test2(int a, int b) {

        int sum, carry;

        while (b != 0) {

            carry = (a & b) << 1;

            a = a ^ b;

            b = carry;

        }



        return a;

	}

}
