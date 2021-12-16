package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumXor {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(0,4,9,7));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int ans = A.get(0) ^ A.get(1);
        for(int i = 1; i < A.size()-1; i++) {
            ans = Math.min(ans,A.get(i)^A.get(i+1));
        }
        return ans;
    }
}
