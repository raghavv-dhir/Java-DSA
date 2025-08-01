package ImportantQuestions;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {-1,2,5,8,9,-8,10,14,7,89,54};
        System.out.println(sol(arr));
    }
    static int sol(int[] arr){
        if (arr == null || arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
