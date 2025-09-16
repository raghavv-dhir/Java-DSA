package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] ans = mergeArrays(nums1,m,nums2,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n){
        int[] merged = new int[m+n];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left < m && right < n){
            if (nums1[left] <= nums2[right]){
                merged[index++] = nums1[left++];
            } else {
                merged[index++] = nums2[right++];
            }
        }
        while(left < m){
            merged[index++] = nums1[left++];
        }
        while(right < n){
            merged[index++] = nums2[right++];
        }
        return merged;
    }
}
