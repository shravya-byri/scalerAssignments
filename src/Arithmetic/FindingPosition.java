package Arithmetic;

public class FindingPosition {
    public static void main(String[] args) {
        int A = 100;
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        long res = 1;
       while(res <= A/2) {
           res = res * 2;
       }

        return (int)res;
    }
}
