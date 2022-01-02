package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 4, 5, 8, 10));
        ArrayList<Integer> B = new ArrayList<>(List.of(6, 9, 15));
        ArrayList<Integer> C = new ArrayList<>(List.of(2, 3, 6, 6 ));
        System.out.println(solve(A,B,C));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int diff = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int i = 0, j = 0, k = 0;
        while(i < A.size() && j < B.size() && k < C.size()) {
            min = Math.min(A.get(i),B.get(j));
            min = Math.min(min,C.get(k));
            max = Math.max(A.get(i), B.get(j));
            max = Math.max(max,C.get(k));
            diff = Math.min(diff, max-min);
            if(diff == 0) break;
            if(A.get(i) == min) i++;
            else if(B.get(j) == min) j++;
            else k++;
        }
        return diff;
    }
}
