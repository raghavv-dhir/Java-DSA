package ImportantQuestions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol(nums,k); // [5,6,7,1,2,3,4]
        System.out.println(Arrays.toString(nums));
    }
    static void sol(int[] arr, int k){
        int n = arr.length;
        if (k % n == 0) return;
        k = k % n;
        reverse(arr, 0, n-1); // [7,6,5,4,3,2,1]
        reverse(arr,0,k-1);// [5,6,7,4,3,2,1]
        reverse(arr,k, n-1); // [5,6,7,1,2,3,4]
    }
    static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
