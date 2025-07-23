package Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        //Leetcode 242
        String s = "anagram";
        String t = "nagaram";
        System.out.println(sol(s,t));
    }
    static boolean sol(String s, String t){
        if (s.length() != t.length()) return false;

        Map<Character, Integer> freq = new HashMap<>();
        for (char c: s.toCharArray()){ //s = "anagram"
            freq.put(c, freq.getOrDefault(c, 0)+1); //map = {a:3, n:1, g:1, r:1, m:1}
        }
        for (char c: t.toCharArray()){ //t = nagaram
            freq.put(c, freq.getOrDefault(c,0)-1);// map= {a:0, n:0, g:0, r:0, m:0}
        }
        for (char c: freq.keySet()){ //keySet= {0,0,0,0,0}
            if (freq.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
