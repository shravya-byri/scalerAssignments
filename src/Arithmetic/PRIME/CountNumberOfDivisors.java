package Arithmetic.PRIME;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountNumberOfDivisors {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(8,9,10));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> primeFactor = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i <= 100; i++) {
            primeFactor.add(0);
        }
        for(int i = 2; i <= 100; i++) {
              if(primeFactor.get(i) == 0) {
                  for(int j = i; j <= 100; j = j+i ) {
                      if(primeFactor.get(j) == 0){
                          primeFactor.set(j,i);
                      }
                  }
              }
        }
       System.out.println(primeFactor);
        for ( int i = 0; i < A.size(); i++) {
            int ans = 1;
            int p,e,n;
            n = A.get(i);
            p = primeFactor.get(n);
            while(p > 1) {
                e = 0;
                while(n % p == 0) {
                    e++;
                    n = n/p;
                }
                ans = ans * (e + 1);
                p = primeFactor.get(n);
            }
            res.add(ans);

        }
        return res;
    }
}
