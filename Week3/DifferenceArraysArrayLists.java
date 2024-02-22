import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array Example
        String[] array = new String[3]; // Creating an array of size 3
        array[0] = "Red"; // Assigning value to the first element
        array[1] = "Orange"; // Assigning value to the second element
        array[2] = "Yellow"; // Assigning value to the third element

        System.out.println("\nArray Example:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>(); // Creating an ArrayList

        arrayList.add("Red"); // Adding elements to the ArrayList
        arrayList.add("Orange");
        arrayList.add("Yellow");

        System.out.println("\nArrayList Example:");
        
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
           

        }

        //Differences in adding elements to both array and arrayList. 

        // How to add elements to the array(Sike, you would have to build a whole new array. But you can pull the data from the old array so you do not have to start from scratch.)
        String[] updatedArray = new String[array.length + 2]; // Creating a new array with larger size

        for (int i = 0; i < array.length; i++) {
            updatedArray[i] = array[i]; // Copying existing elements from the original array
        }

        updatedArray[array.length] = "Green"; // Adding a new element at index 3
        updatedArray[array.length + 1] = "Blue"; // Adding a new element at index 4

        System.out.println("\nUpdated Array:");
        for (int i = 0; i < updatedArray.length; i++) {
            System.out.println("Element at index " + i + ": " + updatedArray[i]);
        }

        // Adding more elements to the original ArrayList
        arrayList.add("Green"); // Adding "Green" to the end of the ArrayList
        arrayList.add("Blue"); // Adding "Blue" to the end of the ArrayList
  
          System.out.println("\nUpdated ArrayList:"); // Naming it "updated" just for clarification, still uses original "arrayList".
          for (int i = 0; i < arrayList.size(); i++) {
              System.out.println("Element at index " + i + ": " + arrayList.get(i));
              
               //Printing the updated state of the ArrayList using a loop.
               //The loop iterates over each element in the updated ArrayList and prints its value along with its index.
               
          }
    }
}