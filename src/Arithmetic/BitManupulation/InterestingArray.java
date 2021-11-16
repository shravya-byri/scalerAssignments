package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class InterestingArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(solve(A));
    }
    public static String solve(ArrayList<Integer> A) {
        int count = 0;
        if(A.size() == 1) return "No";
        else {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) % 2 == 0) count++;
            }
            if (count % 2 == 0) return "Yes";
            else return "No";
        }
    }
}
