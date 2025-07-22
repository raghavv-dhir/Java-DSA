package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //Leetcode 1
        int[] nums = {3,2,1};
        int target = 6;
        System.out.println(Arrays.toString(sol(nums, target)));
    }
    static int[] sol(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                // We found the two numbers!
                return new int[]{map.get(remaining), i};
            }
            // Add current number with its index
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // If no solution found
    }
}
