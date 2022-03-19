package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumPerfectSquares {
    public static void main(String[] args) {
       System.out.println( countMinSquares(12));
    }
    public static int countMinSquares(int A) {
        int[] dp = new int[A + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return pSquares(A,dp);

    }
    public static int pSquares(int A, int[] dp) {
        if(A == 0) return 0;
        if(dp[A] != Integer.MAX_VALUE) return dp[A];
        for(int i = 1; i <= Math.floor(Math.sqrt(A)); i++) {
            dp[A] = Math.min(dp[A],1+pSquares(A-(i*i),dp));
        }
        return dp[A];
    }
}
