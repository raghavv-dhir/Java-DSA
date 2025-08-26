package Arrays.BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        //Leetcode 69
        int x = 18;
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
        // s               m                          e
        //              (9*9=81>18)
        // s     m       e
        //   (4*4=16<18), result=4
        //         s     e
        //         s m   e
        //         (6*6=36>18)
        //         s
        //         e
        //         m
        //     (5*5=25>18)
        //         s
        //       e         (condition breaks), result = 4
        System.out.print("Sqrt of "+x+" is: "+mySqrt(x));
    }
    static int mySqrt(int x) {
        if (x == 0) return 0;
        int start =1, end= x;
        int result = 1;
        while (start <= end){
            int mid = start + (end - start) / 2; // safe mid calculation
            long sqrt = (long) mid * mid; // cast to long to avoid overflow
            if (sqrt == x){
                return mid; // perfect square
            } else if(sqrt < x){
                result = mid;   // store best candidate so far
                start = mid + 1; // search right half
            } else {
                //sqrt > x
                end = mid - 1;   // search left half
            }
        }
        return result; // returns floor value of sqrt
    }
}
