package TwoPointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 2, 1, -9, -7, -8, 2, -8, 2, 3, -8));
        System.out.println(solve(A,-1));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int sum; int diff1 = 100000002;
        Collections.sort(A);
        int j,k;
        for(int i = 0; i < A.size()-2; i++) {
            j = i+1; k = A.size()-1;
            while(j < k) {
                sum = A.get(i) + A.get(j) + A.get(k);
                int x = Math.abs(sum - B);
                int y = Math.abs(diff1 - B);
                if(x < y ) {
                    diff1 = sum;
                }
                if(sum < B) {
                    j++;
                } else if(sum > B) {
                    k--;
                } else return B;
            }

        }
        return diff1;

    }
}
