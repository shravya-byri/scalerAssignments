package Arithmetic;

import java.sql.Array;
import java.util.*;

public class luckyNumbers {
    public static void main(String[] args) {
        int A = 12;
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        int res = 0;
        ArrayList<Integer> factor = new ArrayList<>();
       // ArrayList<Integer> num = new ArrayList<>(List.of(0,0));
        for(int i = 0; i <= A; i++) {
            factor.add(0);
        }
       for(int i = 2; i <= A; i++) {
           if(factor.get(i) == 0) {
               for(int j = i; j <= A; j = j+i) {
                   factor.set(j, factor.get(j)+1);
               }
           }

       }
       int count = 0;
       for(int i = 0; i <= A; i++) {
           if(factor.get(i) == 2) {
               count++;
           }
       }
         System.out.println(factor);
        return count;
    }
}
