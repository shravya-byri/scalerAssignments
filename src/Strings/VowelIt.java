package Strings;

import java.util.Locale;

public class VowelIt {
    public static void main(String[] args) {
        String A = "InterviewBit";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        StringBuilder res = new StringBuilder();
       A =  A.toLowerCase(Locale.ROOT);
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                res.append(A.charAt(i));
            }
        }
       // System.out.println(res);
        return res.toString();
    }
}

