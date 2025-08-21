package Stacks.Questions;

import java.util.Stack;

public class minStack {
    Stack<Node> st;

    public minStack(){
        st = new Stack<>();
    }

    public void push(int val){
        if (st.isEmpty()){
            st.push(new Node(val, val));
        } else {
            st.push(new Node(val, Math.min(val,st.peek().min)));
        }
    }

    public void pop(){
        if(st.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        st.pop();
    }

    public int top(){
        if (st.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return st.peek().val;
    }

    public int getMin(){
        if (st.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return st.peek().min;
    }

    public static void main(String[] args) {
        minStack ms = new minStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);
        System.out.println("Top: " + ms.top());      // 2
        System.out.println("Min: " + ms.getMin());   // 2

        ms.pop();
        System.out.println("Top after pop: " + ms.top());   // 7
        System.out.println("Min after pop: " + ms.getMin()); // 3

        ms.pop();
        System.out.println("Top after pop: " + ms.top());   // 3
        System.out.println("Min after pop: " + ms.getMin()); // 3
    }
}
class Node{
    int val;
    int min;

    public Node(int val, int min){
        this.val = val;
        this.min = min;
    }
}