package Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        //Leetcode 283
        int[] nums = {0,1,0,3,12};
        sol(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sol(int[] nums) {
        int j = 0; // pointer for position to place next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++; // move j to next spot for non-zero
            }
        }
    }

}
