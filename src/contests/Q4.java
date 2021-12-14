package contests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(3,1,1,3));
        System.out.println(solve(A));
    }
    public static boolean equal(ArrayList<Integer> A) {
        for(int i = 0; i < A.size()-1; i++) {
           if(A.get(i) != A.get(i + 1)) {
               return false;
           }
        }
        return true;
    }
    public static int solve(ArrayList<Integer> A) {
        int count  = 0;
        int small = Integer.MAX_VALUE;
       int  i = A.size()-1;

       while(!equal(A)) {
           for(int j = 0; j < A.size(); j++) {
               if(A.get(j) < small) {
                   small = A.get(j);
               }
           }
           for (int k = 0; k < A.size(); k++) {
               if(A.get(k) > small) {
                   A.set(k, A.get(k) / 2);
                   count++;
               }
           }
       }

        return count;
    }
}
