package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class DifferentBitSumPairWise {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 5));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        long ans = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int j = 0; j < A.size(); j++) {
                if(((A.get(j) & 1 << i) == 0) ) {
                        count++;
                }
            }
            ans = ans + 2L * count * (A.size()-count);
            ans = ans % 1000000007;
        }
        return (int)ans % 1000000007;
    }
}
