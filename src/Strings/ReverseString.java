package Strings;

public class ReverseString {
    public static void main(String[] args) {
        //Leetcode 344
        char[] s = {'h','e','l','l','o'};
        sol(s);
        System.out.println(s);
    }
    static void sol(char[] s){
        int i = 0; //pointer at starting
        int j = s.length-1; //pointer at end
        while (i <= j){
            //Reverse till both pointers intersect
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
