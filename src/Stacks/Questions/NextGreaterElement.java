package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = nextGreater(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] nextGreater(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(nums[n-1]);
        res[n-1] = -1;
        for (int i = n-2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums[i]){
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(nums[i]);
        }
        return res;
    }
}
