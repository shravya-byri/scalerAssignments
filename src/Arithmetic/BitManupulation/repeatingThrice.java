package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class repeatingThrice {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3,4,6,6,3,2,6,3,2));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int j = 0; j < A.size(); j++) {
                if (((A.get(j)) & (1 << i)) == (1<<i)) {
                    count++;
                }
            }
            if(count % 3 != 0) {
                ans = ans + (1 << i);
            }

        }
        return ans;
    }
 }
