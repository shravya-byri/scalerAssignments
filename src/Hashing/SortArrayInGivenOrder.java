package Hashing;

import java.security.PublicKey;
import java.util.*;

public class SortArrayInGivenOrder {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(10, 2, 18, 16, 16, 16 ));
        ArrayList<Integer> B = new ArrayList<>(List.of( 3, 13, 2, 16, 4, 19 ));
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        int[] m = new int[A.size()];
        LinkedHashMap<Integer,Integer> hash = new LinkedHashMap<>();
        for(int i = 0; i < A.size(); i++) {
            if(hash.get(A.get(i)) == null)
                hash.put(A.get(i),1);
            else hash.put(A.get(i),(hash.get(A.get(i)))+1);
        }
        int j = 0;
        for(int i = 0; i < B.size(); i++) {

           while(hash.get(B.get(i)) != null) {
               m[j] = B.get(i);
               j++;
               if(hash.get(B.get(i)) == 1)
                   hash.put(B.get(i),null);
               else hash.put(B.get(i),hash.get(B.get(i))-1);
            }
        }
            for(Integer e : hash.keySet()) {
                while(hash.get(e) != null) {
                    m[j] = e;
                    j++;
                    if(hash.get(e) != 1)
                        hash.put(e,hash.get(e)-1);
                    else  hash.put(e,null);
                }
            }
            for(int i = 0; i < A.size(); i++) {
                A.set(i,m[i]);
            }
        return A;
    }
}
