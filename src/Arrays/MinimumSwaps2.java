package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 0, 1, 3));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            while(A.get(i) != i) {
                swap(A,i,A.get(i));
                count++;
            }
        }

        return count;
    }
    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);

    }
}
