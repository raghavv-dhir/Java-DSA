package Arrays.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        //Leetcode 33
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(target+" is at index: "+search(nums,target));
    }
    static int search(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            } else if (nums[start] <= nums[mid]) { //means left part is sorted
                if (target >= nums[start] && target < nums[mid]){
                    end = mid -1;  // search left
                } else {
                    start = mid + 1; // search right
                }
            } else { // means right part is sorted
                if (target > nums[mid] && target <= nums[end]){
                    start = mid+1;  // search right
                } else {
                    end = mid-1;  // search left
                }
            }
        }
        return -1;
    }
}
