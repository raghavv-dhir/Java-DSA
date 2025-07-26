package Strings;

public class FindTheIndexOfTheFirstOccurenceInAString {
    //Leetcode 28
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(sol(needle, haystack));
    }
    static int sol(String haystack, String needle){
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && (i+j) < haystack.length()){
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
                j++;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
}
