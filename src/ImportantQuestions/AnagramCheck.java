package ImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        String s= "anagram";
        String t = "nagaram";
        System.out.println(sol(s,t));
    }
    static boolean sol(String s, String t){
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for (char c: t.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)-1);
        }
        for(char c: freq.keySet()){
            if (freq.get(c) == 1){
                return false;
            }
        }
        return true;
    }
}
