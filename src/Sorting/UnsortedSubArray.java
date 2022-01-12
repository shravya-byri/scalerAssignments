package Sorting;

import java.util.ArrayList;
import java.util.List;

public class UnsortedSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4,15,4,4,15,18,19,20));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int i; int j;
        if(A.size() == 1){
            res.add(-1);
            return res;
        }
        for( i = 0; i < A.size()-1; i++) {
            if(A.get(i) > A.get(i+1)) {
                break;
            }
        }
        for(j = A.size()-1; j > 0; j--) {
            if(A.get(i) > A.get(j)) {
                break;
            }
        }
        if(i < j) {
            res.add(i);
            res.add(j);
        } else res.add(-1);
        return res;

    }
}
