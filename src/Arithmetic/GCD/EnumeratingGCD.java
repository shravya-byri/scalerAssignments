package Arithmetic.GCD;

public class EnumeratingGCD {
    public static void main(String[] args) {
        String A = "3412";
        String B = "3413";
        System.out.println(solve(A, B));
    }

    public static String solve(String A, String B) {
        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == B.charAt(i)) {
                    continue;
                } else return "1";
            }
        } else return "1";

        return A;
    }
}
