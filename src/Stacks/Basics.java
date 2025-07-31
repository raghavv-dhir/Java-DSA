package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); //built-in stack class
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); //(LIFO priciple)
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
