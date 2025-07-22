package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //Leetcode 66
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(sol(digits)));
    }
    static int[] sol(int[] digits){
        // Traverse the array from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is 9, we need to carry over
            if (digits[i] == 9) {
                digits[i] = 0; // Set current digit to 0 and carry over to the next left digit
            } else {
                // If the current digit is less than 9, simply increment it
                digits[i] += 1;
                return digits; // No carry needed, so return the updated array
            }
        }

        // If we exited the loop, all digits were 9 (e.g., 999 -> 000)
        // We need a new array with an extra digit to store the carry (1000)
        int[] res = new int[digits.length + 1];
        res[0] = 1; // First digit is 1, rest are 0s by default
        return res; // Return the new array
    }
}
