package Neetcode250;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,4,1,2};
        int[] ans = sol(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sol(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];// simultaneously adding on additional indices
        }
        return ans;
    }
}
