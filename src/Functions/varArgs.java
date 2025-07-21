package Functions;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        variableArguments();
        variableArguments(10);
        variableArguments(1,2,3,4,5);
    }
    static void variableArguments(int... values){
        for(int value: values){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
