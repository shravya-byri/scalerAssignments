package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    public static void main(String[] args) {
        String S = "abcagcb";
        System.out.println(solve(S));
    }
    public static int solve(String S) {
        int countEven = 0; int countOdd = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0; i < S.length();i++) {
            if(hash.get(S.charAt(i)) == null) {
                hash.put(S.charAt(i),1);
            } else hash.put(S.charAt(i),hash.get(S.charAt(i))+1);
        }
        for(Map.Entry<Character,Integer> set : hash.entrySet()) {
            if (set.getValue()% 2 == 0) countEven++;
            else countOdd++;
        }
        if(countOdd == 0 || countOdd == 1) return 1;
        else return 0;
    }
}
