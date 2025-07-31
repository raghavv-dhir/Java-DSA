package Stacks;

import java.util.Stack;

public class MoveStackElements {
    public static void main(String[] args) {
        //copy 'st' elements into 'rt' but in same order
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);//[1,2,3,4,5]

        //Using temporary stack
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        } //[5,4,3,2,1]

        Stack<Integer> rt = new Stack<>();
        while (!temp.isEmpty()){
            rt.push(temp.pop());
        } //[1,2,3,4,5]
        System.out.println(rt);
    }
}
