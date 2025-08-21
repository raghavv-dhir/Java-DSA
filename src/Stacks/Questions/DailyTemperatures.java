package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemp(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] dailyTemp(int[] temperatures){
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < n; i++) {
            int currTemp = temperatures[i];
            while (!st.isEmpty()){
                int idx = st.peek();
                int tempTop = temperatures[idx];
                if (tempTop < currTemp){
                    res[idx] = i-idx;
                    st.pop();
                } else {
                    break;
                }
            }
            st.push(i);
        }
        return res;
    }
}
