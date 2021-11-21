package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,4,5,7,0));
        System.out.println(solve(A));
    }
    public static int solve (ArrayList<Integer> A) {
        int diff = Integer.MAX_VALUE;
        Collections.sort(A);
        for (int i = 0; i < A.size()-1;i++) {
            if(Math.abs(A.get(i) - A.get(i+1)) < diff) {
                diff = Math.abs(A.get(i)-A.get(i+1));
            }

        }
        return diff;
    }
}
