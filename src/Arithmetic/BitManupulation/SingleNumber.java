package Arithmetic;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,1,3,3,5,7,7,2));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int res = 0;
        for(int i = 0; i < A.size(); i++) {
            res = res ^ A.get(i);
        }
        return res;
    }
}
