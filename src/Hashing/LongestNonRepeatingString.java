package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestNonRepeatingString {
    public static void main(String[] args) {
        String S = "uklu";
        System.out.println(solve(S));
    }
    public static int solve(String S) {
        int s = 0, l = 1; int ans = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(S.charAt(s));

        while (s < l && l < S.length()) {
            if (!set.contains(S.charAt(l))) {
                set.add(S.charAt(l));
                l++;
                ans = Math.max(ans, set.size());
            } else {
                while (S.charAt(l) != S.charAt(s)) {
                    set.remove(S.charAt(s));
                    s++;
                }
                s++;
                l++;
            }
        }
        return ans;
    }
}
