package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); //built-in stack class
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); //(LIFO principle)
        System.out.println(st);
        System.out.println(st.peek()); //topmost element(read only)
        System.out.println(st.size()); //number of elements in stack
        System.out.println(st.pop()); //Last(topmost) element
        while (st.size() > 1){ //continuous popping
            st.pop();
        } //To directly access 1st element
        System.out.println(st);
        System.out.println(st.isEmpty()); //Boolean expression to check whether stack is empty or not
    }
}

/*
🔹 What is a Stack?

A stack is like a pile of plates 🍽️ in your kitchen:

You add a plate on top → push operation

You remove the top plate → pop operation

You can only see/use the top plate → peek/top operation

👉 The rule is LIFO (Last In, First Out).
The last item you put in is the first one that comes out.

🔹 Real-Life Examples

Undo/Redo in Word or Notepad (the last action is undone first)

Browser Back Button (last visited page goes first)

Call Stack in Programs (functions finish in reverse order they were called)

Plates/books stack (classic example)

🔹 Basic Operations

Push(x) → Add an element x to the top.

Pop() → Remove and return the top element.

Peek()/Top() → Just look at the top element without removing.

isEmpty() → Check if stack has no elements.

isFull() (for fixed-size stacks) → Check if stack is full.
 */
