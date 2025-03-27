package Javalearning15;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList
      ArrayList<String>  list= new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("First element: " + list.get(0));

        // Iterate through the ArrayList
        for (String item : list) {
            System.out.println(item);
        }

        // Remove an element
     list.remove("Cherry");

        // Check size
        System.out.println("Size of the list: " + list.size());
    }
}