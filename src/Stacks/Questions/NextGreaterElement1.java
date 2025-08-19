package Stacks.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = nextGreater(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
    static int[] nextGreater(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>(); // stores num -> nextGreater
        Stack<Integer> st = new Stack<>();

        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num); // current num is next greater for stack top
            }
            st.push(num);
        }

        // remaining elements in stack don’t have a next greater → map not updated

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}
