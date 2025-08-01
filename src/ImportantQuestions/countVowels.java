package ImportantQuestions;

import org.w3c.dom.ls.LSOutput;

public class countVowels {
    public static void main(String[] args) {
        String s = "aeiou";
        System.out.println(sol(s));
    }
    static int sol(String s){
        char[] chars = s.toCharArray();
        int count = 0;
        for(char c: chars){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }
}
