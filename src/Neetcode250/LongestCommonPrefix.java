package Neetcode250;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(sol(strs));
    }
    static String sol(String[] strs){
        if (strs == null || strs.length == 0) return ""; //Edge case

        //Let first string as initial prefix
        String prefix = strs[0];
        //Loop through all the array
        for (int i = 1; i < strs.length; i++) {
            //chop off the prefix from end until it matches whole with strs[i]
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1); //chop off
                if (prefix.isEmpty()){ // If it becomes empty, means no common prefix
                    return "";
                }
            }
        }
        return prefix;
    }
}

/*
DRY RUN:
Dry Run with Example

Input:

["flower", "flow", "flight"]


Step 1:
prefix = "flower"

Step 2: Compare with "flow"

Does "flow".startsWith("flower")? ❌ No

Chop: "flowe"

"flow".startsWith("flowe")? ❌ No

Chop: "flow"

"flow".startsWith("flow")? ✅ Yes

So prefix = "flow"

Step 3: Compare with "flight"

Does "flight".startsWith("flow")? ❌ No

Chop: "flo"

"flight".startsWith("flo")? ❌ No

Chop: "fl"

"flight".startsWith("fl")? ✅ Yes

So prefix = "fl"

Loop ends.

Final Answer:
"fl"
 */
