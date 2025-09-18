package Strings;

import java.util.*;

public class compareStrings {
    public static void main(String[] args) {
        String[] str1 = {"apple","banana","peach"};
        String[] str2 = {"apple","banana"};
        Set<String> ans = returnCommon(str1, str2);
        System.out.println(ans);
    }
    static Set<String> returnCommon(String[] str1, String[] str2){
        Set<String> s1 = new HashSet<>(); //{}
        Set<String> s2 = new HashSet<>(); //{}
        for(String s: str1){
            s1.add(s);   //{apple,banana,peach}
        }
        for(String s: str2){
            s2.add(s); // {apple,banana}
        }
        s1.retainAll(s2);  //{apple,banana}
        return s1; //return any set
    }
}
