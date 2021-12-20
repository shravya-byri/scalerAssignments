package RecursionAndBackTracking;

public class SumOfDigits {
    public static void main(String args[]) {
        int A = 46;
        System.out.println(isMagicNumber(1291));
    }
    public static int sumOfDigits(int A, int sum) {
        if(A > 0)  {
            return sumOfDigits(A/10,sum + A % 10);
        }
        return sum;
    }
    public static int isMagicNumber (int A) {
        while (A/10 != 0) {
            A = sumOfDigits(A, 0);
        }
        return A == 1 ? 1 : 0;
    }
}
