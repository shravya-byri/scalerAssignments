package Arithmetic;

public class Summation {
    public static void main(String[] args) {
        int A = 39;
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        long ans;
        ans = ((A * (A-1)) % 1000000007);
        ans = (ans * fastPower(3,A-2)) % 1000000007;
        return (int)(ans % 1000000007);


    }
    public static int fastPower(int B, int C) {
        long res = 1;
        int M = 1000000007;
        long D = B;
        while(C > 0) {
            if(C % 2 == 0) {
                D = (D*D) % M;
                C =C/2;
            } else {
                res = (res * D) % M;
                D = (D*D) % M;
                C = (C-1)/2;
            }

        }
        res = (int) res % M;
        return (int) (res % M);

     }
    }



