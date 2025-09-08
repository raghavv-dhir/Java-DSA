package Neetcode250;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(sol(nums,val));
    }
    static int sol(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
/*
Dry Run

Input: nums = [3,2,2,3], val = 3

Start with k = 0.

i=0 → nums[0]=3 → skip (equal to val).

i=1 → nums[1]=2 → keep → nums[0]=2, k=1.

i=2 → nums[2]=2 → keep → nums[1]=2, k=2.

i=3 → nums[3]=3 → skip.

Final:

newLength = 2

nums = [2,2, _, _]

Output:

New length: 2
Modified array: 2 2
 */
