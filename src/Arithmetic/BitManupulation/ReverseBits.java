package Arithmetic.BitManupulation;

public class ReverseBits {
    public static void main(String[] args) {
         long A = 5;
         System.out.println(solve(A));
    }
    public static long solve(long A) {
        long res = A - ( A & (A -1));
        while(res )
    }
}
