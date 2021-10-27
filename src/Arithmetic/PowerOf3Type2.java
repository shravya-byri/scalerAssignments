package Arithmetic;

import java.util.ArrayList;

public class PowerOf3Type2 {
    public static void main(String[] args) {
        int A = 100;
        System.out.print(solve(A));
    }


    public static ArrayList<Integer> solve(int A) {

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int pow = 1;
        while (A > 0) {
            int times = A % 3;
            while (times > 0) {
                ans.add(pow);
                times--;
            }
            System.out.print(ans);
            pow *= 3;
            A /= 3;
        }
        return ans;
    }
}
