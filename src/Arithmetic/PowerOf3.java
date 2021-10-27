package Arithmetic;

import java.util.ArrayList;

public class PowerOf3 {
    public static void main(String[] args) {
        int A = 100;
        System.out.print(solve(A));
    }
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        int mul = 1;
        res.add(mul);
        int left = A;
        while (A > mul*3){
            mul = mul * 3;
            res.add(mul);
        }
        int i = res.size()-1;
        while(i >= 0) {
            if(left >= res.get(i)) {
                left = left - res.get(i);
                res1.add(res.get(i));

            }
            else i--;
        }

        return res1;
    }
}
