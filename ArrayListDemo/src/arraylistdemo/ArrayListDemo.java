/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);

        System.out.println("ArrayList: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Convert ArrayList to Array
        Integer[] numbersArray = new Integer[numbers.size()];
        numbers.toArray(numbersArray);
        System.out.println("Array: " + Arrays.toString(numbersArray));

        // Fill the Array with a specific value
        Arrays.fill(numbersArray, 10);
        System.out.println("Array after filling with 10: " + Arrays.toString(numbersArray));

        // Binary search in the sorted Array
        int index = Arrays.binarySearch(numbersArray, 10);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        // Check if Array contains a specific element
        boolean contains = Arrays.asList(numbersArray).contains(10);
        System.out.println("Array contains 10: " + contains);
    }
}
