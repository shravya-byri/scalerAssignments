package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(8,6,1,2,9,3));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(A);
        long min =  0; long max = 0;
        for (int i = 0; i < A.size(); i++) {
            min = (min + Math.abs(A.get(i) - A.get(i+1))) % 1000000007;
            i++;
        }
        for (int i = 0; i < A.size()/2; i++) {
            max = (max + Math.abs(A.get(i) - A.get(A.size()-1-i)))% 1000000007;
        }

        res.add((int)max % 1000000007);
        res.add((int)min % 1000000007);
        return res;
    }
}
