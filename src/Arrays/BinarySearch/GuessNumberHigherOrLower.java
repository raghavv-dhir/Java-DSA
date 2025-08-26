package Arrays.BinarySearch;

public class GuessNumberHigherOrLower {
    //Hidden number
    static int pick = 6;

    //Guess API
    static int guess(int num){
        if (num == pick) return 0;
        else if (num > pick) return -1;
        else return 1;
    }
    static int guessNumber(int n){
        int start=1, end=n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            if (result == 0) return mid; //found 'pick'
            else if (result < 0) end = mid-1; //pick is smaller
            else start = mid + 1; //pick is larger
        }
        return -1; //should never reach here
    }
    public static void main(String[] args) {
        //Leetcode 374
        int n = 10; // should be >= pick
        System.out.println("Picked number is: "+guessNumber(n));
    }
}
