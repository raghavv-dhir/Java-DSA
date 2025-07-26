package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        //Leetcode 349
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(sol(nums1, nums2)));
    }
    static int[] sol(int[] nums1, int[] nums2){
        Set<Integer> s1 = new HashSet<>(); //because set only contains unique elements
        Set<Integer> s2 = new HashSet<>();

        for(int num: nums1)  s1.add(num); //s1-> [4,9,5]

        for(int num: nums2)  s2.add(num); //s2-> [9,4,8]

        s1.retainAll(s2); // modifies set1 to only keep common elements // s1= {4,9}

        int[] ans = new int[s1.size()];
        int i = 0;
        for(int n: s1)  ans[i++] = n;

        return ans;
    }
}
