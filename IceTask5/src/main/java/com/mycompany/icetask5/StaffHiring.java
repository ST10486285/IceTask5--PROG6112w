package com.mycompany.icetask5;


import com.mycompany.icetask5.Staff;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 * StaffHiring Class - Extends Staff and provides specialized hiring functionality.
 */
public class StaffHiring extends Staff {
    
    /**
     * Constructor for StaffHiring class
     * @param staffNumber The number of staff members
     * @param location The store location
     */
    public StaffHiring(int staffNumber, String location) {
        super(staffNumber, location);
    }
    
    /**
     * Prints the complete staff hiring report
     * Displays location, staff number, and hiring decision
     */
    public void printStaffHiring() {
        System.out.println("\nSTAFF HIRING REPORT");
        System.out.println("**********************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}