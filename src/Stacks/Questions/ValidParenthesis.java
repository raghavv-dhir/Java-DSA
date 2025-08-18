package Stacks.Questions;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        //Leetcode 20
        String str1 = "()";
        System.out.println(isValid(str1));
        String str2 = "()[]{}";
        System.out.println(isValid(str2));
        String str3 = "(]";
        System.out.println(isValid(str3));
        String str4 = "([)]";
        System.out.println(isValid(str4));
        String str5 = "{[]}";
        System.out.println(isValid(str5));
    }
    static boolean isValid(String s){
        if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray()){
            //Push opening brackets
            if (c == '(' || c == '{' || c == '['){
                st.push(c);
            } else { //closing brackets
                if (st.isEmpty()) return false; //nothing to match

                char top = st.pop(); //last opening bracket
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return st.isEmpty(); //must be empty at the end
    }
}
