package Neetcode250;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = sol(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sol(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

/*
i=0
nums[0] = 2
rem = 9-2 = 7
map.containsKey(7)? → false
map = {2:0}

i=1
nums[1] = 7
rem = 9-7 = 2
map.containsKey(2)? -> true
return new int[]{map.get(rem),i} -> {0,1}, because get returns the value of the key

*/
