package Arithmetic;

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String[] args) {
        int A = 16777214;
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Boolean> prime = new ArrayList<>();
        for(int i = 0; i <= A; i++) {
            prime.add(false);
        }
        for(int i = 2; i <= A; i++) {
              if(prime.get(i) == false) {
                  for (int j = i; j <= A; j = j + i) {
                         if (prime.get(j) == false && j != i) {
                             prime.set(j, true);
                         }
                  }
              }
        }
        for(int i = 2; i <= A; i++) {
            if(prime.get(i) == false && prime.get(A-i) == false){
                res.add(i);
                res.add(A-i);
                break;
            }
        }
        //System.out.println(prime);
        return res;
    }
}
