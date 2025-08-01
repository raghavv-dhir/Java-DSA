package ImportantQuestions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,2,4,6};
        Set<Integer> ans = sol(arr1, arr2);
        System.out.println(ans);
    }
    static Set<Integer> sol(int[] arr1, int[] arr2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int num: arr1) s1.add(num);
        for(int num: arr2) s2.add(num);
        s1.retainAll(s2);
        return s1;
    }
}
