package TwoPointers;

import java.util.*;

public class PairWithDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2));
        System.out.println(solve(A,0));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int res = 0; int i = 0; int j = 1;
        //Collections.sort(A);
        HashSet<Integer> M = new HashSet<>(A);
       // int des = A.get(j) - A.get(i);
        ArrayList<Integer> C = new ArrayList<>(M);
        Collections.sort(C);
        if(C.size() == 1 && B == 0) return 1;
        while( j < C.size() && i != C.size()-1) {
            int des = C.get(j) - C.get(i);
            if (des < B) {
                j++;
            } else {
                if (des == B) {
                    res++;
                    i++;
                } else {
                    i++;
                }
            }
        }
        return res;
    }
}
