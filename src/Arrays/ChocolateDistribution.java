package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3));
        System.out.println(solve(A,0));
    }
    public static int solve(ArrayList<Integer> A,  int B){
        Collections.sort(A);
        if(A.size() < B || B == 0) return 0;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i + B - 1  < A.size(); i++) {
            if(A.get(i + B - 1) - A.get(i) < minDiff ) {
                minDiff = A.get(i + B - 1) - A.get(i);
            }

        }
        return minDiff;
     }
}
