package ImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(sol(s));
    }
    static char sol(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for(char c: s.toCharArray()){
            if (freq.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
