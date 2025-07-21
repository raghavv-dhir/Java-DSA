package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        //Leetcode 217
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
        System.out.println(solution2(nums));
    }
    static boolean solution(int[] nums){
        Arrays.sort(nums); // [1,1,2,3]
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    static boolean solution2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
