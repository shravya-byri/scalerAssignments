package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MaxMod {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(5,5,5,5,5));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int l = A.size()-1;
        int max = A.get(A.size()-1);
        int secmax;
        while(Objects.equals(A.get(l), A.get(l - 1)) && l > 1) {
            l--;
        }
        secmax = A.get(l-1);
        return secmax % max;
    }
}
