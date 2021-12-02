package Searching;

import java.util.ArrayList;

public class StairCase {
    public static void main(String[] args) {
        System.out.println(solve(1));
    }
    public static int solve(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        if(A == 0) return 0;
        int i = 1;
        res.add(1);
        while(res.get(i-1)+i+1 <= A) {
            res.add(i+1+res.get(i-1));
            i++;
        }
        return res.size();
    }
}
