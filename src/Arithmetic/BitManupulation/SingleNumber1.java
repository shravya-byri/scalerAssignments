package Arithmetic.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(186, 256, 102, 377, 186, 377));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int res = 0;
        for(int i = 0; i < A.size(); i++) {
            res = res ^ A.get(i);
        }
        res = res - (res & (res - 1));
        int a=0 ,b = 0;
        for(int i = 0; i < A.size(); i++) {
            if ( (A.get(i) & res) == res) {
                a = a ^ A.get(i);
            } else b = b ^ A.get(i);
        }
        ans.add(Math.min(a,b));
        ans.add(Math.max(a,b));
        return ans;
    }
}
