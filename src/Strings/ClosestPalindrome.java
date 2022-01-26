package Strings;

public class ClosestPalindrome {
    public static void main(String[] args) {
        String S = "abba";
        System.out.println(solve(S));
    }
    public static String solve(String S) {
        int i = 0; int j = S.length()-1;
        int count = 0;
        while(i < j) {
            if(S.charAt(i) != S.charAt(j)) {
                count++;
            }
            i++;
            j--;
        }
        if(S.length() % 2 == 0) {
            if(count == 1) return "YES";
        } else {
            if(count == 0 || count == 1) {
                return "YES";
            }
        }
        return "NO";

    }
}
