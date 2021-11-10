package Arithmetic;

public class OddFibonacci {
    public static void main(String[] args) {
        int a = 15, b = 49;
        System.out.println(solve(a,b));
    }
    public static int solve(int a, int b) {
        int res = 0;
       int ans = (b /3)- (a - 1)/3;

        return (b - a + 1) - ans;
    }
}
