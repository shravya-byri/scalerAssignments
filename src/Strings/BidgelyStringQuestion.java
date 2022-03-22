package Strings;

import java.util.Locale;

public class BidgelyStringQuestion {
    public static void main(String[] args) {
        String A = "baafiggiooogu";
        System.out.println(solve(A.toLowerCase(Locale.ROOT)));
    }
    public static boolean solve(String A) {
        if(!isConsonant(A.charAt(0))) return false;
        char prev = A.charAt(0);
        for(int i = 1; i < A.length(); i++) {
            if(isConsonant(prev)){
                if(isConsonant(A.charAt(i))) return false;
            }
            prev = A.charAt(i);
        }
        return true;

    }
    public static boolean isConsonant(Character A) {
        if(A == 'a' || A == 'e' || A == 'i' || A == 'o' || A == 'u') {
            return false;
        }
        return true;
    }
}
