package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class DifferentBitsPairSumWise {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,5));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count0 = 0;
        int count1 = 0;
        long ans = 0;
        int res;
        for(int i = 0; i < 32; i++) {
            for(int j = 0; j < A.size(); j++) {
                res = A.get(j) & (1<<i);
                int x = 1 << i;
                if(res == x) count1++;
                else count0++;
            }
            ans = ans + ((long) (count0 % 1000000007) * (count1 % 1000000007)) % 1000000007;
            count0 = 0;
            count1 = 0;
        }
        return (int) (2 * ans);
    }
}
