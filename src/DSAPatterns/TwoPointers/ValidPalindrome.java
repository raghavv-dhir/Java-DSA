package DSAPatterns.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(sol(s));
    }
    static boolean sol(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int i=0, j= s.length()-1;
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
