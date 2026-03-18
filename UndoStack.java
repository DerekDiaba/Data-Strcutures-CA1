/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 // Stack class used to undo the functionality and Uses Java Stack LIFO Last in 1st out
 * @author derek
 */
import java.util.Stack;

public class UndoStack {
     Stack<AccessibleLocation> stack = new Stack<>();

    public void push(AccessibleLocation loc) {
        stack.push(loc);
    }

    public AccessibleLocation pop() {
        if(!stack.isEmpty()) return stack.pop();
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}