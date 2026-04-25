package com.mycompany.icetask5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 * HomeMakeoverReport - Displays monthly home makeover jobs for a renovator.
 * Uses arrays to store bathroom, kitchen, and garden makeover data for six months.
 */
public class HomeMakeoverReport {
    
    public static void main(String[] args) {
        // Single dimensional array for month names
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE"};
        
        // Two dimensional array for makeover data
        // Rows represent months (0-5), columns represent job types (0=Bathrooms, 1=Kitchens, 2=Garden)
        int[][] makeovers = {
            {8, 2, 5},  // January data
            {7, 4, 5},  // February data
            {5, 5, 2},  // March data
            {2, 2, 3},  // April data
            {7, 7, 9},  // May data
            {7, 8, 5}   // June data
        };
        
        // Single dimensional array to store monthly totals
        int[] monthlyTotals = new int[6];
        
        // Print report header
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("=".repeat(50));
        
        // Display the makeover data by month
        System.out.println("\nMONTHLY BREAKDOWN:");
        System.out.println("-".repeat(50));
        System.out.printf("%-10s %-12s %-10s %-10s%n", "Month", "Bathrooms", "Kitchens", "Garden");
        System.out.println("-".repeat(50));
        
        // Process each month's data
        for (int i = 0; i < months.length; i++) {
            // Calculate total for current month by summing all three job types
            int monthlyTotal = 0;
            for (int j = 0; j < makeovers[i].length; j++) {
                monthlyTotal += makeovers[i][j];
            }
            monthlyTotals[i] = monthlyTotal;
            
            // Display the data for this month
            System.out.printf("%-10s %-12d %-10d %-10d%n", 
                months[i], makeovers[i][0], makeovers[i][1], makeovers[i][2]);
        }
        
        // Print monthly totals section
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MONTHLY TOTALS");
        System.out.println("-".repeat(50));
        
        // Display each month's total with stars if applicable
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s %-8d", months[i], monthlyTotals[i]);
            
            // Decision structure: print three stars if total is 15 or greater
            if (monthlyTotals[i] >= 15) {
                System.out.print("   ***");
            }
            System.out.println(); // Move to next line
        }
        
        System.out.println("=".repeat(50));
    }
}