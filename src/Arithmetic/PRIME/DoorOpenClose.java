package Arithmetic;

public class DoorOpenClose {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        int res;
        res = (int) Math.sqrt(A);
        return res;
    }
}
