package Arithmetic.BitManupulation;

public class StrangeEquality {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }
    public static int solve(int A) {

        int n = (int) (Math.log(A)/Math.log(2)+1) ;
        int temp = (1<<n)-1;
        int x = (A ^ temp);//refer notes on bit manipulation for formula and derivation
        int y = (1<<n);
        return x^y;
    }


}
