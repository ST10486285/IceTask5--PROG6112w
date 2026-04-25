/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask5;

/**
 *
 * @author Student
 * BubbleSortTask - A class that implements the bubble sort algorithm
 * to sort integer arrays in ascending order.
 */

import java.util.Scanner;

public class IceTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ICE TASK 5 MENU ===");
        System.out.println("1. Run Bubble Sort Task");
        System.out.println("2. Run Home Makeover Report");
        System.out.println("3. Run Staff Hiring System");
        System.out.print("Choose an option (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                BubbleSortTask.main(args);
                break;
            case 2:
                HomeMakeoverReport.main(args);
                break;
            case 3:
                UseStaff.main(args);
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}