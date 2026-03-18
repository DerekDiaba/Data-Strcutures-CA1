/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */
// AccessibleLocation call extends location and adds Extra details for accessibility tracking
public class AccessibleLocation extends Location {

    // Additional fields specific to accessible locations
    private String notes;      // Extra notes
    private String priority;   // Priority levels: High, Medium, Low

    
     // Constructor 
     
    public AccessibleLocation(String name, int rating, String notes, String priority) {
        super(name, rating); // Call parent (Location) constructor
        this.notes = notes;
        this.priority = priority;
    }

    
     // Getter for notes
     
    public String getNotes() {
        return notes;
    }

    
     // Getter for priority
     
    public String getPriority() {
        return priority;
    }

    
     //Setter for notes
     
    public void setNotes(String notes) {
        this.notes = notes;
    }

    
     // Setter for priority
     
    public void setPriority(String priority) {
        this.priority = priority;
    }

    
     // Overrides the displayDetails method from Location
     // Adds notes and priority to the output
     
    @Override
    public String displayDetails() {
        return super.displayDetails() 
                + ", Notes: " + notes 
                + ", Priority: " + priority;
    }
}