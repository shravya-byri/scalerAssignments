package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DistributeCandies {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 2, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < A.size(); i++) {
            res.add(1);
        }
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) > A.get(i-1)) {
                res.set(i,res.get(i-1)+1);
            }
        }

        for(int i = A.size()-2; i > 0; i--) {
           if(A.get(i) > A.get(i+1)){
               res.set(i,Math.max(res.get(i),res.get(i+1)+1));
           }
        }


        int ans = 0;
        for(int i = 0; i < res.size(); i++) {
            ans = ans + res.get(i);
        }

        return ans;
    }
}
