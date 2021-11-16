package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinXORValue {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6));
       System.out.println(solve(A));
     }
     public static int solve(ArrayList<Integer> A) {
        int res = Integer.MAX_VALUE;
         Collections.sort(A);
         for(int i = 0; i < A.size()-1; i++) {
             res = Math.min(res,A.get(i)^A.get(i+1));
         }

        return res;
     }
}
