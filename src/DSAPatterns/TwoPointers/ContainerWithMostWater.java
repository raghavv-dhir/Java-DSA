package DSAPatterns.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol(arr));
    }
    static int sol(int[] arr){
        int i=0, j= arr.length-1;
        int maxWater=0;
        while (i < j){
            int w = j-i;
            int h = Math.min(arr[i], arr[j]);
            int area = w * h;
            maxWater = Math.max(maxWater, area);
            if (arr[i] > arr[j]) j--;
            else i++;
        }
        return maxWater;
    }
}
