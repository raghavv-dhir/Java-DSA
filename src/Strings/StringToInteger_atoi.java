package Strings;

public class StringToInteger_atoi {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(sol(s));  // Output: 1337
    }

    static int sol(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        int num = 0;

        // Step 1: Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle optional + or -
        if (i < n) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // Step 3: Convert digits and check for overflow
        while (i < n && isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Overflow check: Before doing num * 10 + digit
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
