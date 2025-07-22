package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //Leetcode 189
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    static void solution(int[] nums, int k){
        //edge cases
        int n = nums.length;
        if (k % n == 0){
            return;
        }
        k = k % n;

        //firstly reverse whole array-> 7,6,5,4,3,2,1
        rev(nums,0, nums.length-1);
        //now reverse first 'k' elements-> 7,6,5 -> 5,6,7
        rev(nums, 0, k-1);
        //now reverse the remaining array-> 4,3,2,1 -> 1,2,3,4
        rev(nums, k, nums.length-1);
        //now it should look like-> 5,6,7,1,2,3,4 (rotated by k steps)
    }
    static void rev(int[] nums, int start, int end){
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
