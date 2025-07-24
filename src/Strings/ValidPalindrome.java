package Strings;

public class ValidPalindrome {
    // Leetcode 125: Valid Palindrome
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(sol(s));  // Output: true
    }

    static boolean sol(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            // Skip non-alphanumeric characters from left
            if (!isAlphanumeric(c1)) {
                i++;
                continue;
            }

            // Skip non-alphanumeric characters from right
            if (!isAlphanumeric(c2)) {
                j--;
                continue;
            }

            // Compare both characters in lowercase form
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false; // Not a palindrome
            }

            i++;
            j--;
        }

        return true; // All matched
    }

    // Helper function to check if a character is alphanumeric
    static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
