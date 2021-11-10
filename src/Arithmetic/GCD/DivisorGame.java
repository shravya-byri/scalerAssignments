package Arithmetic;

public class DivisorGame {
    public static void main(String[] args) {
        int A = 12, B = 2, C = 3;
        System.out.println(solve(A,B,C));
    }
    public static int solve(int A, int B,int C) {
        int mul;
        int num = 1;
        mul = lcm(B,C);
        int res = mul;
       while(res <= A) {
           ++num;
           res = res + mul;

       }
       return num-1;
    }
    public static int lcm(int a,int b) {
        int lcm;
        lcm = (a * b)/gcd(a,b);
        return lcm;
    }
    public static int gcd(int a,int b){
        if (b == 0) {
            return a;
        }
        return gcd(b,a % b);

    }
}
