package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        //Leetcode 26
       int[] arr =  {0,0,1,1,1,2,2,3,3,4};
       int ans = solution(arr);
        System.out.println(ans);
    }
    static int solution(int[] arr) {
        // Edge case: if array is empty, there are no unique elements
        if (arr.length == 0) return 0;

        // 'k' keeps track of the position to insert the next unique element
        int k = 1;

        // Start scanning from the second element (index 1)
        for (int j = 1; j < arr.length; j++) {
            // If current element is not equal to the previous one
            // It means it's a unique element we haven't seen yet
            if (arr[j - 1] != arr[j]) {
                arr[k] = arr[j]; // Place the unique element at index 'k'
                k++;             // Move 'k' forward for the next unique element
            }
        }

        // Return the number of unique elements found
        // All unique elements are now in arr[0...k-1]
        return k;
    }

}
