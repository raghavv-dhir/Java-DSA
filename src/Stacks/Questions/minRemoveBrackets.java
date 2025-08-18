package Stacks.Questions;

public class minRemoveBrackets {
    public static void main(String[] args) {
        String s = "())(";
        System.out.println(minRemove(s));
    }
    static int minRemove(String s){
        int openCount = 0;
        int removeCount = 0;
        for (char c: s.toCharArray()){
            if (c == '('){ //push '('
                openCount++;
            } else if (c == ')') {
                if (openCount > 0){
                    openCount--; //match with previous opening '('
                } else {
                    removeCount++; //extra ')'
                }
            }
        }
        // all unmatched '(' are also invalid
        return openCount+removeCount;
    }
}
