package DSAPatterns.TwoPointers;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;
        int[] res = sol(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int[] sol(int[] arr, int target){
        int[] res = new int[2];
        int i = 0, j = arr.length-1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if (sum == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
