package Arrays;

import java.util.*;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        //Leetcode 350
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(sol(nums1, nums2)));
    }
    static int[] sol(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num,0)+1); //map-> {1:2,2:2}
        }

        List<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if (map.containsKey(num) && map.get(num) > 0){
                list.add(num); //list-> {2,2}
                map.put(num, map.get(num)-1); //map-> {1:2, 2:0} decrement count
            }
        }
        int[] ans = new int[list.size()]; //put list elements into answer array
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i); // ans = [2,2]
        }
        return ans;
    }
}
