/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask5;

/**
 *
 * @author Student
 * BubbleSortTask - A class that implements the bubble sort algorithm
 * to sort integer arrays in ascending order.
 */
public class BubbleSortTask {
    
    /**
     * Sorts an array of integers using the bubble sort algorithm.
     * The algorithm repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they're in the wrong order.
     * 
     * @param array The integer array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        // Outer loop: controls the number of passes through the array
        for (int i = 0; i < n - 1; i++) {
            
            // Inner loop: compares adjacent elements up to the unsorted part
            // n - i - 1 ensures we don't compare elements that are already in place
            for (int j = 0; j < n - i - 1; j++) {
                
                // If current element is greater than the next one, swap them
                if (array[j] > array[j + 1]) {
                    // Swap logic using a temporary variable
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Displays the contents of an integer array in a formatted way.
     * 
     * @param array The integer array to display
     * @param message A descriptive message to print before the array
     */
    public static void printArray(int[] array, String message) {
        System.out.print(message + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            // Add comma between elements except after the last one
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Move to next line after printing array
    }
    
    /**
     * BONUS: Sorts array in descending order and counts swaps.
     * This version changes the comparison operator and tracks swap operations.
     * 
     * @param array The integer array to be sorted
     * @return The total number of swaps performed during sorting
     */
    public static int bubbleSortDescending(int[] array) {
        int n = array.length;
        int swapCount = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // For descending order, swap if current is LESS than next
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
    
    /**
     * Main method to test the bubble sort implementation.
     */
    public static void main(String[] args) {
        // Test array as specified in the instructions
        int[] numbers = {5, 2, 9, 1, 6};
        
        // Display original array
        printArray(numbers, "Original array");
        
        // Sort the array using bubble sort
        bubbleSort(numbers);
        
        // Display sorted array
        printArray(numbers, "Sorted array (ascending)");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // BONUS: Test descending sort with swap counting
        int[] bonusNumbers = {5, 2, 9, 1, 6};
        printArray(bonusNumbers, "Original array for bonus");
        
        int swaps = bubbleSortDescending(bonusNumbers);
        printArray(bonusNumbers, "Sorted array (descending)");
        System.out.println("Total swaps performed: " + swaps);
    }
}