package Strings;
import java.util.*;
public class Cts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String numbers = "1,5,3,2,8,12,11,15";
        
        // Split the string into an array
        String[] numArray = numbers.split(",");
        System.out.println(Arrays.toString(numArray));
        
        int oddCount = 0;
        int evenCount = 0;

        // Loop through the array and count odd and even numbers
        for (String num : numArray) {
            int number = Integer.parseInt(num); // Convert string to integer
            
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the results
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Even numbers count: " + evenCount);
    }
}