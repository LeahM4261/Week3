import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static int sumWithoutLargest(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        
        int largest = arr[0];
        int largestIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }
        
        // Remove the largest number from the array
        int[] newArray = new int[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != largestIndex) {
                newArray[j++] = arr[i];
            }
        }
        
        // Update the original array with the modified array
        System.arraycopy(newArray, 0, arr, 0, newArray.length);
        
        int sum = 0;
        
        for (int num : newArray) {
            sum += num;
        }
        
        return sum;
    }
    
    public static void swapLargestSmallest(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
		int smallestIndex = 0;
		int largestIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[smallestIndex]) {
				smallestIndex = i;
			} else if (arr[i] > arr[largestIndex]) {
				largestIndex = i;
			}
		}

		// Swap the positions of the smallest and largest numbers
		int temp = arr[smallestIndex];
		arr[smallestIndex] = arr[largestIndex];
		arr[largestIndex] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nThis program allows you to input an array and determine its size.");
        System.out.println("It will then: ");
        System.out.println("- Swap its largest and smallest numbers.");
        System.out.println("- Calculate the sum.");
        System.out.println("- Remove the largest number in the array then calculate the new sum without the largest number.");
        System.out.println("- Print out a new array without the largest number");
        System.out.print("\nEnter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];

        System.out.println("\nEnter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("\nOriginal Array: " + Arrays.toString(array));
        
     // Swap the positions of the largest and smallest numbers in the array
        swapLargestSmallest(array);
        System.out.println("Array after swapping largest and smallest numbers: " + Arrays.toString(array));
        
        // Calculate the sum of all elements in the modified array
        int sumAfterSwap = 0;
        
        for (int num : array) {
            sumAfterSwap += num;
        }
        
        System.out.println("Sum of array after swapping: " + sumAfterSwap);
        
        // Calculate the sum of all elements except the largest one
        int sumWithoutLargest = sumWithoutLargest(array);
        System.out.println("Sum without largest element: " + sumWithoutLargest);
        
		// Create a new array after removing the largest element
		int[] newArray = Arrays.copyOf(array, array.length - 1);

		System.out.println("Array without largest element: " + Arrays.toString(newArray));
    }
}