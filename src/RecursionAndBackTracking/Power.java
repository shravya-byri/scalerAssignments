package RecursionAndBackTracking;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(-1,1,20));
    }
    public static int power(int A, int B, int C) {
        if(A == 0) return 0;
        if(B == 0) return 1;
        else {
            long x = ((long) power(A, B / 2, C)) % C;
            if(B % 2 == 0) {
                if(x > 0) return (int)(x * x);
                else return (Integer.MAX_VALUE-(int) (x*x)) % C ;
            }
            else{
                if(x > 0) return A * (int)(x * x);
                else return (Integer.MAX_VALUE-(A * (int)(x * x))) % C;
            }
        }
    }
}
