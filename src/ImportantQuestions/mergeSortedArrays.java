package ImportantQuestions;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,8,10,12};
        int[] arr2 = {1,3,5,6,9,11,13,14,15};
        int[] merged = sol(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
    static int[] sol(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
