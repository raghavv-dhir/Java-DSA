package Arrays;

public class CountHillsAndValleysInArray {
    public static void main(String[] args) {
        //Leetcode 2210
        int[] nums = {6,6,5,5,4,1};
        System.out.println(sol(nums));
    }
    static int sol(int[] nums){
        int i = 0; //points to the non-equal neighbour in LHS
        int j = 1; //points to non-equal neighbour in RHS by j+1
        int count = 0;
        while(j + 1 < nums.length){
            if ((nums[i] < nums[j] && nums[j] > nums[j+1])
                || (nums[i] > nums[j] && nums[j] < nums[j+1])){
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }
}
