package Stacks;

import java.util.Stack;

public class underflow {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Raghav");
        st.push("Kritika");
        st.push("Naman");
        st.push("Shivansh");
        st.push("Manav");
        st.push("Banni");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //st.pop(); //here underflow error will come because we are trying to pop/peek element from an empty stack (Empty stack exception)
    }
}
