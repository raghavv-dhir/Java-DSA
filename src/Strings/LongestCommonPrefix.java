package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //Leetcode 14
        String[] strs = {"flower","flow","flight"};
        System.out.println(sol(strs));
    }
    static String sol(String[] strs){
        if (strs == null || strs.length == 0) return ""; //Edge case

        //Let first string as initial prefix
        String prefix = strs[0];
        //Loop through all the array
        for (int i = 1; i < strs.length; i++) {
            //chop off the prefix from end until it matches whole with strs[i]
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1); //chop off
                if (prefix.isEmpty()){ // If it becomes empty, means no common prefix
                    return "";
                }
            }
        }
        return prefix;
    }
}
