package Stacks;

import java.util.Stack;

public class RemoveFromBottom {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Raghav");
        st.push("Kritika");
        st.push("Naman");
        st.push("Shivansh");
        st.push("Manav");
        st.push("Banni");

        Stack<String> temp = new Stack<>();
        while (st.size()>1){ //only "Raghav" left
            temp.push(st.pop());
        }
        st.pop(); //pop "Raghav"
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st); //"Raghav" removed
    }
}
