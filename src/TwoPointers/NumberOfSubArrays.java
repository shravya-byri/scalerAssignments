package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class NumberOfSubArrays {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24, 10, 25, 96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54, 78, 67, 56, 8, 70, 43, 63));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
       long res = 0;
        Collections.sort(A);
       int one = A.size();
        HashSet<Integer> C = new HashSet<>(A);
        ArrayList<Integer> M = new ArrayList<>(C);
        int two = M.size();
        res = (long)(Math.pow(2,Math.abs(two - 31)) - 1) % 1000000007;
        res = res - two + one;

        return (int) res;
    }
}
