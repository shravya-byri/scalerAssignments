package Arithmetic;

import java.util.ArrayList;

public class NthMagicNumber {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(solve(A));
    }
    public static int solve(int A){
        int x = 1;
        int rem;
        int ans = 0;
        while(A > 0) {
            rem = A % 2;
            x = x * 5;
            ans = ans + x * rem;
            A /= 2;
        }


     return ans;
    }
}
