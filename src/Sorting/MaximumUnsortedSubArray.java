package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MaximumUnsortedSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19 ));
        System.out.println(solve( A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int i,j;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(i = 0; i < A.size()-1; i++) {
            if(A.get(i) > A.get(i+1))
             break;
        }
        if (i == A.size()-1) {
            ans.add(-1);
            return ans;
        }
        for( j = A.size()-1; j >= 0; j--) {
            if(A.get(j) < A.get(j-1))
             break;
        }
        for(int k = i; k <= j; k++) {
                max = Math.max(A.get(k),max);

                min = Math.min(A.get(k),min);
        }
        int l,r;
        for( l = 0; l < i; l++) {
            if(A.get(l) > min) break;
        }
        for(r = A.size()-1; r > j; r--){
            if((A.get(r) < max)) break;
        }
        ans.add(l);
        ans.add(r);
        return ans;
    }
}
