package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayWithConsecutiveElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,4,3,1,6,5,9,7));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i-1)+1 != (A.get(i))) {
                return 0;
            }
        }
        return 1;

    }
}
