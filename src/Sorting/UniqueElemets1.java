package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UniqueElemets1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6, 14, 23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75, 69, 54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66, 73, 13, 85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69, 62));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        Collections.sort(A);
        System.out.println(A);
        for(int i = 0; i < A.size()-1; i++) {

            if(A.get(i) >= A.get(i+1)) {
                count = count + (A.get(i) - A.get(i+1)) + 1;
                A.set(i+1,A.get(i) + 1);

            }

        }
        System.out.println(A);
        return count;

    }
}
