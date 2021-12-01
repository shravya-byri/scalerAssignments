package Searching;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));

    }
    public static int sqrt(int A) {
        int l = 0; int r = A;
        long mid;
        while(l <= r) {
            mid = l + (r - l)/2;
            if((mid*mid) < A) l = (int)mid + 1;
            if(mid * mid == A) return (int)mid;
            if(mid * mid > A) r = (int)mid - 1;
        }
        return Math.min(l,r);
    }
}
