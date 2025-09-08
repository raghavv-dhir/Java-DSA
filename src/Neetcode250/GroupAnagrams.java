package Neetcode250;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = sol(strs);
        System.out.println(ans);
    }
    static List<List<String>> sol(String[] strs){
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); //sort each word
            String key = new String(chars); //sorted string as key
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
/*
🛠 Dry Run with Input

["eat","tea","tan","ate","nat","bat"]

"eat" → sort = "aet" → map = { "aet" : ["eat"] }

"tea" → sort = "aet" → map = { "aet" : ["eat","tea"] }

"tan" → sort = "ant" → map = { "aet":["eat","tea"], "ant":["tan"] }

"ate" → sort = "aet" → map = { "aet":["eat","tea","ate"], "ant":["tan"] }

"nat" → sort = "ant" → map = { "aet":["eat","tea","ate"], "ant":["tan","nat"] }

"bat" → sort = "abt" → map = { "aet":[...], "ant":[...], "abt":["bat"] }

Return: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
 */
