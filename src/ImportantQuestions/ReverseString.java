package ImportantQuestions;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "manav";
        System.out.println(sol(str));
    }
    static String sol(String str){
        char[] strs = str.toCharArray();
        int i = 0;
        int j = strs.length-1;
        while (i <= j){
            char temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
        return new String(strs);
    }
}
