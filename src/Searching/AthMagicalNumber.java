package Searching;

import java.util.ArrayList;

public class AthMagicalNumber {
    public static void main(String[] args) {
        System.out.println(solve(5,2,3));
    }
    public static int solve(int A, int B, int C) {
         long l = Math.min(B,C);
         long r = (long)Math.min(B,C) * A;
         long mid; int ans = 0;
         while(l <= r) {
             mid = l + ((r - l)/2);
             //ans = (int)mid;
             if(A <= NoOfMultiplesunderN(mid,B,C)) {
                  ans = (int)mid;
                 r = mid -1;
             } else l = mid + 1;
         }
         return ans;
    }
    public static int NoOfMultiplesunderN(long mid,int B,int C) {
        int T;
        T = (int)((mid/B) + (mid/C) - (mid/lcm(B,C)));
        return T;
    }
    public static int lcm(int a,int b) {
        int lcm;
        lcm = (a * b)/gcd(a,b);
        return lcm;
    }
    public static int gcd(int a,int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
