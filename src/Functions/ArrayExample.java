package Functions;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {0, 99, 88,56};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] arr){
        arr[0] = 10; //If you make change to the object via this reference variable, original object will be changed.
    }
}
