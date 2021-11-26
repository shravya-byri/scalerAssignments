package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameOfBottles {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,2,3,3,3,4,5));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 1; int maxrep = 0;
        for(int i = 1; i < A.size(); i++) {
            if(Objects.equals(A.get(i), A.get(i - 1))) {
                count++;
            }else {

                maxrep = Math.max(maxrep,count);
                count = 1;
            }
        }
        return maxrep;
    }
}
