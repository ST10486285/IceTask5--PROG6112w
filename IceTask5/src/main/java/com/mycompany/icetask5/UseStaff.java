/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask5;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class UseStaff {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for staff number
        System.out.print("Enter the current staff number: ");
        int staffNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Prompt user for store location
        System.out.print("Enter the staff hiring location: ");
        String location = scanner.nextLine();
        
        // Instantiate StaffHiring class with user-provided data
        StaffHiring hiringReport = new StaffHiring(staffNumber, location);
        
        // Display the hiring report
        hiringReport.printStaffHiring();
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}