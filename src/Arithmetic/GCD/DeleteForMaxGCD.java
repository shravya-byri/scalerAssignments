package Arithmetic.GCD;

import java.util.ArrayList;
import java.util.List;

public class DeleteForMaxGCD {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(9,18,49,12,30));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefix = new ArrayList<>();
        ArrayList<Integer> suffix = new ArrayList<>();
        int ans = 0;
        prefix.add(0);
        for (int i = 0; i < A.size(); i++) {
            prefix.add(GCD(prefix.get(i),A.get(i)));
        }
        for(int i = 0; i <= A.size(); i++) {
            suffix.add(0);
        }
        for (int i = A.size()-1; i > 0; i--) {
            if ( i == A.size()-1) {
                suffix.set(i,A.get(i));
            }
            suffix.set(i-1,(GCD(suffix.get(i),A.get(i-1))));
        }
        for ( int i = 0; i < A.size(); i++) {
            ans = Math.max(ans,GCD(prefix.get(i), suffix.get(i+1)));
        }


        System.out.println(prefix);
        System.out.println(suffix);
        return ans;
    }
    public static int GCD (int A, int B) {
        if ( B == 0) return A;
        return GCD(B,A%B);
    }
}
