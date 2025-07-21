package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        //Leetcode 136
        int[] nums = {2,2,1};
        System.out.println(sol(nums));
        System.out.println(sol2(nums));
    }
    static int sol(int[] nums){
        // Step 1: Create a HashMap to store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        // Step 2: Traverse through the array
        for (int num : nums) {
            // If 'num' is already in the map, increase its count by 1
            // Otherwise, add it to the map with value 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Loop through the map entries (i.e., all unique keys)
        for (int key : map.keySet()) {
            // Check if this number occurred only once
            if (map.get(key) == 1) {
                // This is the single number we’re looking for
                return key;
            }
        }

        // Step 4: Fallback in case no single number is found
        // (Technically unnecessary as per problem constraints)
        return -1;
    }

    static int sol2(int[] nums){
        int res = 0;
        for(int num: nums){
            res = res ^ num; // 0 ^ 2 ^ 2 ^ 1 --> 0 ^ 0 ^ 1 --> 0 ^ 1 --> 1(n ^ n = 0) and (0 ^ n = n)
        }
        return res;
    }
}
