package ImportantQuestions;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(sol(str));
    }
    static boolean sol(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
