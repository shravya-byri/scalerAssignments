package Arithmetic;

public class InverseMod {
    public static void main(String[] args) {
        int A = 3;
        int B = 5;
        System.out.println(solve(A,B));
    }
    public static int solve(int A, int B) {
        long res = 1;
        int C = B;
        B = B-2;
        long D = A;
        while(B > 0) {
            if(B % 2 == 0) {
                D = (D*D) % C; B =B/2;
            } else {
                res = (res *D) % C;
                D = (D*D)%C;
                B = (B-1)/2;
            }

        }
        return (int)res;
       }
}
