package Arrays;

import java.util.ArrayList;

public class aaa {
    public static void main(String[] args) {
        System.out.println(solve(3122));
    }
    public static int solve(int N) {
        int S = N; int M;
        int digit = 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        while(S > 0) {
            M = S%10;
            A.add(M);
            S = S/10;
            digit++;
        }
        for(int i= A.size()-1; i >= 0; i--) {
            B.add(A.get(i));
        }
        return 0;
    }
}
