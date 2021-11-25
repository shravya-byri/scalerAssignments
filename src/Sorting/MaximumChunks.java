package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MaximumChunks {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,0,1,3));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        int max = -1;
        for(int i = 0; i < A.size(); i++) {
            max = Math.max(max,A.get(i));
            if(i == max) {
              count++;
            }
        }
        return count;
    }
}
