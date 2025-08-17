package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Raghav");
        st.push("Kritika");
        st.push("Naman");
        st.push("Shivansh");
        st.push("Manav");
        st.push("Banni");
        System.out.println("Original: " + st);

        reverseRec(st);

        System.out.println("Reversed (Recursive): " + st);
    }

    static void reverseRec(Stack<String> st) {
        if (st.size() == 1) return;

        String top = st.pop();
        reverseRec(st);
        pushAtBottom(st, top);
    }

    static void pushAtBottom(Stack<String> st, String top) {
        if (st.isEmpty()) {
            st.push(top);
            return;
        }
        String temp = st.pop();
        pushAtBottom(st, top);
        st.push(temp);
    }
}
