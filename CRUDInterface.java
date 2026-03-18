/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */
//CRUD interface 
// Defines basic operations for managing Location objects
// Create, Read, Update, Delete


import java.util.ArrayList;

public interface CRUDInterface {
    void addLocation(Location loc); // Add a new location
    void deleteLocation(int index); // Deletes a Location 
    void updateLocation(int index, Location loc); // Updates Location
    ArrayList<Location> getAllLocations(); // Returns all locations as a list
}
