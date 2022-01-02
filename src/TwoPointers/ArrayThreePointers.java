package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ArrayThreePointers {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,4,10));
        ArrayList<Integer> B = new ArrayList<>(List.of(2,15,20));
        ArrayList<Integer> C = new ArrayList<>(List.of(10,12));
        System.out.println(solve(A,B,C));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
       int diff;
       int i = 0; int j = 0; int k = 0; int diff1 = Integer.MAX_VALUE;
       while(i < A.size() && j < B.size() && k < C.size()) {
           int min;
           min = Math.min(A.get(i),B.get(j));
           min = Math.min(min,C.get(k));
           int x = A.get(i) - B.get(j);
           int y = B.get(j) - C.get(k);
           int z = A.get(i) - C.get(k);
           diff = Math.max(Math.abs(x),Math.abs(y));
           diff = Math.max(diff,Math.abs(z));
           diff1 = Math.min(diff1,diff);

           if(min == A.get(i)) {
               i++;
           }else if(min == B.get(j)) {
               j++;
           }else k++;
       }
       return diff1;
    }
}
