package Strings;

public class ReverseNumber {
    public static void main(String[] args) {
        //Leetcode 7
        int x = 123;
        System.out.println(sol(x));
    }
    static int sol(int x){
        int rev = 0;

        while(x != 0){
            int lastDigit = x % 10; //Get the last digit
            x /= 10; //Remove the last digit
            //Check for overflow before it happens
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)){
                return 0; // overflow if goes beyond +2,147,483,647
            }

            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)){
                return 0; // underflow if goes below -2,147,483,648
            }

            rev = rev * 10 + lastDigit;
        }
        return rev;
    }
}
