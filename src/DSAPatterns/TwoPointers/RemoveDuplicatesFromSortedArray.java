package DSAPatterns.TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr= {0,0};
        System.out.println("New length after removing duplicates: "+ sol(arr));
    }
    static int sol(int[] arr){
        if (arr.length == 0) return 0;
        int k=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]){
                arr[++k] = arr[i];
            }
        }
        return k;
    }
}
