package DAY11;
import java.util.*;
public class Duplicatearray {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

		        System.out.print("number of elements: ");

		        int n = sc.nextInt();

		        int[] inputArray = new int[n];

		        System.out.println("Enter the elements:");

		        for (int i = 0; i < n; i++) {

		            inputArray[i] = sc.nextInt();}

		        System.out.print("Elements before filtering and sorting: ");

		        displayArray(inputArray);

		        int newSize = removeDuplicates(inputArray);

		        int[] filteredArray = new int[newSize];

		        for (int i = 0; i < newSize; i++) {

		            filteredArray[i] = inputArray[i];}

		        bubbleSort(filteredArray);

		        System.out.print("\nFiltered and sorted elements: ");

		        displayArray(filteredArray);}

		    public static void displayArray(int[] arr) {

		        for (int num : arr) {

		            System.out.print(num + " ");

		        }

		        System.out.println();

		    }

		    public static int removeDuplicates(int[] arr) {

		        int n = arr.length;

		        int newSize = 1;

		        for (int i = 1; i < n; i++) {

		            boolean duplicate = false;

		            for (int j = 0; j < newSize; j++) {

		                if (arr[i] == arr[j]) {

		                    duplicate = true;

		                    break;

		                }}

		            if (!duplicate) {

		                arr[newSize] = arr[i];

		                newSize++;

		            }}

		        return newSize;}

		    public static void bubbleSort(int[] arr) {

		        int n = arr.length;

		        for (int i = 0; i < n - 1; i++) {

		            for (int j = 0; j < n - i - 1; j++) {

		                if (arr[j] > arr[j + 1]) {

		                    int temp = arr[j];

		                    arr[j] = arr[j + 1];

		                    arr[j + 1] = temp;

		                }
		            }
		        }
		    }
}


