package Searching;

public class SqrtOfANumber {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
    public static int solve(int A) {
        long l = 0; long r = A;
        long ans = 0; long mid;
        while(l <= r) {
            mid = l + (r - l)/2;
            if((mid * mid) == A )  return (int)mid;
            if((mid * mid) < A) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return (int)ans;
     }
}
