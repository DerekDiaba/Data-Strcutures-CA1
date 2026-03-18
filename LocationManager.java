/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */
import java.util.*;

public class LocationManager implements CRUDInterface {

     ArrayList<Location> locations = new ArrayList<>(); // ArrayList ADT
     Queue<Location> recentQueue = new LinkedList<>();  // Queue ADT
     Stack<Location> deleteStack = new Stack<>();       // Stack ADT
     LocationLinkedList linkedList = new LocationLinkedList(); // LinkedList ADT

    // CREATE
    @Override
    public void addLocation(Location loc) {
        locations.add(loc);         // ArrayList storage
        recentQueue.add(loc);       // Queue ADT for recent locations
        linkedList.add(loc);        // LinkedList ADT
    }

    // DELETE
    @Override
    public void deleteLocation(int index) {
        if (index >= 0 && index < locations.size()) {
            Location loc = locations.get(index);
            deleteStack.push(loc);       // Stack ADT to allow undo
            locations.remove(index);     // Remove from ArrayList
            linkedList.remove(index);    // Remove from LinkedList
        }
    }

    // UPDATE
    @Override
    public void updateLocation(int index, Location loc) {
        if (index >= 0 && index < locations.size()) {
            locations.set(index, loc);     // Update ArrayList
            linkedList.remove(index);      // Remove old LinkedList node
            linkedList.add(loc);           // Add new node to LinkedList
        }
    }

    // READ
    @Override
    public ArrayList<Location> getAllLocations() {
        return locations;   // Return ArrayList for GUI display
    }

    // Undo DELETE (Stack)
    public void undoDelete() {
        if (!deleteStack.isEmpty()) {
            Location loc = deleteStack.pop();
            locations.add(loc);       // Restore to ArrayList
            linkedList.add(loc);      // Restore to LinkedList
            recentQueue.add(loc);     // Also add to Queue
        }
    }

    // Get recent locations (Queue)
    public String getRecentLocations() {
        StringBuilder result = new StringBuilder();
        for (Location loc : recentQueue) {
            result.append(loc.displayDetails()).append("\n");
        }
        return result.toString();
    }

    // Get all locations from LinkedList
    public String getLinkedListData() {
        Location[] arr = linkedList.getAll();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(i).append(": ").append(arr[i].displayDetails()).append("\n");
        }
        return result.toString();
    }
}