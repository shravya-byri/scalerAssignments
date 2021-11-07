package Arithmetic;

public class NCRP {
    public static void main(String[] args) {
        int A = 51299;
        int B  = 25646;
        int C =  3685739;
        System.out.println(solve(A,B,C));
    }
    public static int solve(int A, int B, int C) {
        long res;
        int pow1 = factorial(A-B,C);
        int pow2 = factorial(B,C);
        int term1 = factorial(A,C);
        int term2 = InverseMod(pow1,C);
        int term3 = InverseMod(pow2,C);
        res = ((((long) (term1 % C) * (term2 % C)) % C ) * (term3 % C)) % C ;
        return (int)res;
    }
    public static int factorial(int n, int C) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = (ans * i) % C;
        }
        int fac = (int) (ans % C);
        return fac;

    }
    public static int InverseMod(int A, int C){
            long res = 1;
            int M = C;
            C = C-2;
            long D = A;
            while(C > 0) {
                if(C % 2 == 0) {
                    D = (D*D) % M; C =C/2;
                } else {
                    res = (res * D) % M;
                    D = (D*D) % M;
                    C = (C-1)/2;
                }

            }
            return (int)(res % M);

    }
}
