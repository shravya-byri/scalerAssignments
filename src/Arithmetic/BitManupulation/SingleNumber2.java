package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,2,3,3,3,5,5,5,7,2));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans = 0,res;
        int x = 0;
        int count = 0;
        for(int i = 0; i < 32; i++) {
            for(int j = 0; j < A.size(); j++) {
                res = A.get(j) & (1<<i);
                x = 1 << i;
                if(res == x) count++;
            }
            if(count % 3 != 0) ans |= (x);
            count = 0;
        }
       return ans;
    }
}
