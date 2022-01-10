package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumTheDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(3,1,-4));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        long maxSum = 0;
        long minSum = 0;
        int m = 1000000007;
        Collections.sort(A);
        for(int i = 0; i < A.size();i++) {
            maxSum = ((maxSum % m) + ((power(2,i) %m) * (A.get(i) % m)) %m) % m;
        }
        for(int i = 0; i < A.size();i++) {
            minSum = ((minSum % m) + ((power(2,A.size()-1-i))%m * (A.get(i) % m)) % m) %m;
        }
        return (int)(maxSum-minSum) ;
    }
    public static long power(int A, int B) {
        long ans = 1;
        while( B > 0) {
            ans = (ans * A) % 1000000007;
            B--;
        }
        return ans % 1000000007;
    }
}
