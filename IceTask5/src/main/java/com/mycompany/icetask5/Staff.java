package com.mycompany.icetask5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 * Staff Abstract Class - Provides base structure for staff management.
 * Implements iStaff interface and contains common attributes and methods.
 */
public abstract class Staff implements iStaff {
    // Variables to store staff information
    protected int staffNumber;
    protected String location;
    
    /**
     * Constructor for Staff class
     * @param staffNumber The number of staff members
     * @param location The store location
     */
    public Staff(int staffNumber, String location) {
        this.staffNumber = staffNumber;
        this.location = location;
    }
    
    /**
     * Getter method for staff number
     * @return The current staff count
     */
    public int getStaffNumber() {
        return staffNumber;
    }
    
    /**
     * Getter method for staff location
     * @return The store location
     */
    public String getStaffLocation() {
        return location;
    }
    
    /**
     * Determines if hiring process should start
     * @return "YES" if staff number is less than 20, "NO" otherwise
     */
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
