package Arrays.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        //Leetcode 34
        int[] nums= {5,7,7,8,8,10};
        int target = 8;
        int[] ans = solution(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solution(int[] nums, int target){
        if (nums == null || nums.length == 0){
            return new int[]{-1,-1};
        } else {
            return new int[]{firstPos(nums,target),lastPos(nums,target)};
        }
    }
    static int firstPos(int[] nums, int target){
        int start=0, end= nums.length-1;
        int firstIdx = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                firstIdx = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstIdx;
    }
    static int lastPos(int[] nums, int target){
        int start=0, end= nums.length-1;
        int lastIdx = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                lastIdx = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIdx;
    }
}
