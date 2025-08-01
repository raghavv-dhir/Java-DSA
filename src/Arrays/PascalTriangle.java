package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for(List<Integer> row: result){
            for(int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < prevRow.size(); j++) {
                int sum = prevRow.get(j-1)+prevRow.get(j);
                newRow.add(sum);
            }
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }
}
