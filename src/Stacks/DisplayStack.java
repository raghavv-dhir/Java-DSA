package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Raghav");
        st.push("Kritika");
        st.push("Naman");
        st.push("Shivansh");
        st.push("Manav");
        st.push("Banni");
        //System.out.println(st); (without using this)
        displayStack1(st);
        displayStack2(st);
        displayStackReverseRecursively(st);
        System.out.println();
        displayStackRecursively(st);
    }
    static void displayStack1(Stack<String> st){
        int n = st.size();
        String[] arr = new String[n];
        for (int i = n-1; i >=0 ; i--) {
            arr[i] = st.pop();
        }
        for(String str: arr){
            System.out.print(str+" ");
            st.push(str);
        }
        System.out.println();
    }
    static void displayStack2(Stack<String> st){
        Stack<String> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        while (!temp.isEmpty()){
            String x = temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
    }
    static void displayStackReverseRecursively(Stack<String> st){
        if (st.isEmpty()) return;
        String top = st.pop();
        System.out.print(top+" ");
        displayStackReverseRecursively(st);
        st.push(top);
    }
    static void displayStackRecursively(Stack<String> st){
        if (st.isEmpty()) return;
        String top = st.pop();
        displayStackRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
}
