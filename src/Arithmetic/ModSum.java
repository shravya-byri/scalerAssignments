package Arithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,1,2,3,4,11,8,1,11,11,115,7,6));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        long sum = 0;
        int[] M = new int[1001];
        for(int i = 0; i < A.size(); i++) {
            M[A.get(i)] = M[A.get(i)]+1;
        }
        for(int i = 0; i < 1001; i++) {

        }

       for(int i = 0; i < 1001; i++) {
           System.out.print(M[i]);

       }
      ;
        return (int)sum;

    }
}
