package Arithmetic;

import java.util.ArrayList;

public class NthMagicNuber {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(solve(A));
    }
    public static int solve(int A){

        int rem = 0;
        int pow = 0;
        int M = A;
        while(M > 1) {
            M /= 2;
            pow++;
        }
        rem = A - (int) Math.pow(2,pow);

        System.out.println(pow);
        System.out.println(rem);
        return magicNum(pow,rem);
    }
    public static int magicNum(int pow, int rem) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        

        int num = 0;
        num = (int) Math.pow(5,pow+1);

        return num;
    }
}
