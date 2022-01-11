package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MxAndMinDiff {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3,4,5,6,7,8,9));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(A);
        int maxSum = 0;
        int minSum = 0;
        int m = 1000000007;
        int i = 0; int j = A.size()-1;
        while(i < j) {
            maxSum = ((maxSum)%m + (Math.abs(A.get(j) - A.get(i)))%m)%m;
            i++;
            j--;

        }
        int k = 0;
        while(k < A.size()-1) {
            minSum = ((minSum %m) + (Math.abs(A.get(k+1)-A.get(k)))%m)%m;
            k++;
            k++;
        }
        res.add(maxSum);
        res.add(minSum);
        return res;

    }
}
