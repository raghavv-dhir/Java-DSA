package Maths;

import java.util.HashSet;

public class HappyNumber {
    //Leetcode 202
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n){
        HashSet <Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);  // store current number to detect cycles
            n = getNext(n); //transform number
        }
        return n == 1; //happy if we reached 1
    }
    static int getNext(int n){
        int totalSum =0;
        while(n > 0){
            int digit = n % 10; //extract last digit
             n /= 10; //remove last digit
             totalSum += digit*digit; //add square of digit
        }
        return totalSum;
    }
}
