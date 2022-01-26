package Strings;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String A = "AaaA";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int l = 0; int r = 0; int ans = 0;
        HashSet<Character> hash = new HashSet<>();
        while(l <= r && r < A.length()) {
            if(hash.contains(A.charAt(r))) {
                ans = Math.max(ans,(r-l));
                if(A.charAt(l) == A.charAt(r)) {
                    hash.remove(A.charAt(l));
                    l++;
                } else {
                    while (A.charAt(l) != A.charAt(r)) {
                        hash.remove(A.charAt(l));
                        l++;
                    }
                }
                 // l will be the duplicate element so l++;
            } else {
                hash.add(A.charAt(r));
                r++;
            }

        }
        ans = Math.max(ans,(r-l));
        return ans;
    }
}
//tc is O(N)