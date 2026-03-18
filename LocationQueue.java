/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */
// Queue class used to manage AccessibleLocation objects and Used Java FIFO First in first out
import java.util.LinkedList;
import java.util.Queue;

public class LocationQueue {
    
    //Queue to store AccessibleLocation objects
    Queue<AccessibleLocation> queue = new LinkedList<>();

    
    //Adds a location to the queue (enqueue)
    public void enqueue(AccessibleLocation loc) {
        queue.add(loc); // Adds to the end of the queue
    }

    public AccessibleLocation dequeue() {
        return queue.poll(); // Returns null if queue is empty
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // returns number of elements in the queue
    public int size() {
        return queue.size();
    }
}