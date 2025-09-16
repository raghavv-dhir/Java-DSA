package Strings;

import java.util.HashSet;
import java.util.Set;

public class MatchingCharacters {
    public static void main(String[] args) {
        String[] str1 = {"apple", "banana"};
        String[] str2 = {"grape","peach","banana"};
        Set<Character> ans = returnChars(str1,str2);
        System.out.println(ans);
    }
    static Set<Character> returnChars(String[] str1, String[] str2){
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        for (String s: str1){   //s= "apple", "banana"
            for (char c: s.toCharArray()){ // {a,p,p,l,e},{b,a,n,a,n,a}
                s1.add(c); //{a,p,l,e,b,n}
            }
        }
        for (String s: str2){  //s = "grape","peach","banana"
            for (char c: s.toCharArray()){ // c = {g,r,a,p,e},{p,e,a,c,h},{b,a,n,a,n,a}
                s2.add(c);  // {g,r,a,p,e,c,h,b,n}
            }
        }
        s1.retainAll(s2); // {a,p,e,b,n}
        return s1;
    }
}
