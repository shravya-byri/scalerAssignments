package Arithmetic.PRIME;

import java.util.*;

public class FactorialArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 4, 2, 3,6,7));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {

        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            if ( i == 0 || i == 1) prime.add(0);
            else
            prime.add(1);
        }
        for (int i = 2; i <= 1000; i++) {
            if (prime.get(i) == 1) {
                for (int j = i; j <= 1000000; j = j + i) {
                    if(j != i)
                        prime.set(j, 0);
                }
            }
        }
        Collections.sort(A);
        //System.out.println(A);
        int j;
        //int lastIndex = A.size()-1;
        for(int i = 0; i < A.size(); i++) {
            j = A.get(i);
            while(j > 1) {
                if(prime.get(j) == 1) {
                    B.add(j);
                    break;
                } else j--;

            }
        }
       // System.out.println(B);
        int ans = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < B.size(); i++) {
            if(hash.get(B.get(i)) == null) {
                hash.put(B.get(i),1);
            } else hash.put(B.get(i),hash.get(B.get(i))+1);
        }
       // System.out.println(hash);
        for(Map.Entry<Integer,Integer> e : hash.entrySet()) {
            ans = (ans + (int)Math.pow(2,e.getValue())-1) % (int)((Math.pow(10,9))+7);
        }

        return ans;
    }
}
