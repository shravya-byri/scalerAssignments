package Hashing;

import java.util.*;

public class SortSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 3, 20, 17, 17 ));
        ArrayList<Integer> B = new ArrayList<>(List.of( 5, 9, 20, 11, 6, 18, 7, 13));
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();

        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < A.size(); i++) {
            hash.putIfAbsent(A.get(i), i);
        }
        for(int i = 0; i < B.size(); i++) {
            if(hash.containsKey(B.get(i))) {
                res.add(B.get(i));
                hash.replace(B.get(i),null);
            }
        }
        for(Map.Entry<Integer,Integer> set : hash.entrySet()){
            if(set.getValue() != null)
               res1.add(set.getKey());
        }
        for(int i = 0; i < A.size(); i++) {
            if(i < res.size())
               A.set(i,res.get(i));
            else A.set(i,res1.get(i-res.size()));
        }
        return A;
    }
}
