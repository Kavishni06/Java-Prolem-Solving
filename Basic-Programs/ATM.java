package Programs;

import java.util.*;

public class ATM {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input the amount to withdraw and the current balance
	        int X = scanner.nextInt(); // Amount Pooja wishes to withdraw
	        double Y = scanner.nextDouble(); // Pooja's current account balance
	        
	        // Calculate the new balance after the attempted transaction
	        double newBalance = calculateBalance(X, Y);
	        
	        // Print the new balance with two decimal places
	        System.out.printf("%.2f\n", newBalance);
	    }
	    
	    public static double calculateBalance(int X, double Y) {
	        // Check if X is a multiple of 5 and if there's enough balance
	        if (X % 5 == 0 && Y >= (X + 0.50)) {
	            Y -= (X + 0.50); // Deduct the withdrawal and the fee
	        }
	        // Return the balance
	        return Y;
	    
	}
}



