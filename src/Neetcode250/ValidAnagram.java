package Neetcode250;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(sol(s,t));
    }
    static boolean sol(String s, String t){
        if (s.length() != t.length()) return false;
        int[] count = new int[26]; //for lowercase english alphabets
        for(char c: s.toCharArray()){
            count[c-'a']++;
        }
        for(char c: t.toCharArray()){
            count[c-'a']--;
            if (count[c-'a'] < 0) return false;
        }
        return true;
    }
}
