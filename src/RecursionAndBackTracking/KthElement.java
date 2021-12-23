package RecursionAndBackTracking;

public class KthElement {
    public static void main(String[] args) {
        System.out.println(solve(3,2));

    }
    public static int solve(int A, int B) {
        if(A == 1 || B == 1) return 0;
        int x = solve(A-1,(B+1)/2);
        if(B % 2 == 0) return 1-x;
        else return x;
    }
}
