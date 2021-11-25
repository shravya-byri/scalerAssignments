package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3,4,5,1));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i = 1; i < A.size(); i++) {
            int temp = A.get(i);
            A.set(i, A.get(i-1));
            A.set(i-1,temp);
            i++;
        }
        return A;
    }
}
