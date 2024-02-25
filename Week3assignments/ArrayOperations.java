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
        
        int temp = arr[smallestIndex];
        arr[smallestIndex] = arr[largestIndex];
        arr[largestIndex] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        int sumWithoutLargest = sumWithoutLargest(array);
        System.out.println("Sum without largest element: " + sumWithoutLargest);
        
        System.out.println("Array after removing largest element: " + Arrays.toString(newArray));
        
        swapLargestSmallest(array);
        System.out.println("Array after swapLargestSmallest: " + Arrays.toString(array));
    }
}