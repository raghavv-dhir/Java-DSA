package Stacks.Questions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParenthesis {
    //Leetcode 1249
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemove(s));
    }
    static String minRemove(String s){
        Set<Integer> toRemove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        // Step 1: find unmatched indices
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // valid pair
                } else {
                    toRemove.add(i); // extra ')'
                }
            }
        }

        // Step 2: remaining '(' are invalid
        while (!stack.isEmpty()) {
            toRemove.add(stack.pop());
        }

        // Step 3: build final string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
