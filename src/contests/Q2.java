package contests;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3));
        System.out.println(solve(A, A.size()));
    }
    public static int solve(ArrayList<Integer> A, int N) {
        long sum = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++ ) {
                if(Math.abs(A.get(i)-A.get(j)) > 1) {
                    sum = sum + A.get(j) - A.get(i);

                }
            }
        }

        if(sum < 0) sum = sum + 1000000007;
        return (int)sum % 1000000007;
    }
}
