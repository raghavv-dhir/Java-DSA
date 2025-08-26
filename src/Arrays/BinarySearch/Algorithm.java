package Arrays.BinarySearch;

public class Algorithm {
    public static void main(String[] args) {
        //Leetcode 704
        int[] nums= {-1,0,3,5,9,12};
        int target= 13;
        int ans = solution(nums,target);
        System.out.println(target+" is present at index: "+ans);
    }
    static int solution(int[] nums, int target){
        if (nums.length == 1 && target == nums[0]){
            return 0;
        } //if only one element is present, and it is target, return its index
        int start= 0, end = nums.length-1; //2 pointers
        while (start <= end){ //while search space is present
            int mid = start+ (end - start)/2; //find mid element
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) {
                end = mid-1; //search in left of mid
            } else {
                start = mid+1; //search in right of mid
            }
        }
        return -1; //if target is not present, return -1
    }
}
