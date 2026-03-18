/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */
  // Linked list class calls in storing Location objects

public class LocationLinkedList {
     // Head (first node) of the linked list
    private Node head;

    // Inner Node class (each element in the list)
    private class Node {
        Location data; // Stores the Location object
        Node next;     // Points to the next node in the list

        // Node constructor
        Node(Location data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Adds a new Location to the end of the list
     */
    public void add(Location loc) {
        Node newNode = new Node(loc);

        // If list is empty, new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the end and add the node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    /**
     * Gets a Location at a specific index
     */
    public Location get(int index) {
        Node current = head;
        int i = 0;

        // Traverse through list until index is found
        while (current != null) {
            if (i == index) {
                return current.data;
            }
            current = current.next;
            i++;
        }

        // Return null if index is out of bounds
        return null;
    }

    /**
     * Removes a Location at a specific index
     */
    public void remove(int index) {

        // If list is empty, do nothing
        if (head == null) {
            return;
        }

        // If removing the first element
        if (index == 0) {
            head = head.next;
            return;
        }

        // Traverse to the node before the one we want to remove
        Node current = head;
        for (int i = 0; current.next != null && i < index - 1; i++) {
            current = current.next;
        }

        // Remove the node by skipping it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /**
     * Returns the size (number of elements) in the list
     */
    public int size() {
        int count = 0;
        Node current = head;

        // Count each node
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    /**
     * Returns all Locations as an array
     */
    public Location[] getAll() {
        int n = size();
        Location[] arr = new Location[n];

        Node current = head;
        int i = 0;

        // Copy data from linked list into array
        while (current != null) {
            arr[i++] = current.data;
            current = current.next;
        }

        return arr;
    }
}
