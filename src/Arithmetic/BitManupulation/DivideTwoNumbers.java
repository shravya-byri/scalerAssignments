package Arithmetic.BitManupulation;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int A = -2147483648;
        int B = -1;
        System.out.println(solve(A,B));
    }
    public static int solve(int A, int B) {
        int sign = ((A < 0) ^ (B < 0)) ? -1 : 1;
        int quotient = 0;
        int C = A;
        if(A == Integer.MIN_VALUE) {
            A = Integer.MAX_VALUE;
        }
            A = Math.abs(A);
            B = Math.abs(B);
            while (A >= B) {
                A = A - B;
                ++quotient;
            }

            if (sign == -1) quotient = -quotient;
            if(C == Integer.MIN_VALUE && quotient == Integer.MIN_VALUE+1)
                return quotient-1;


        return quotient;
        }
    }

