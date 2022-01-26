package Arrays;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,2,5,1));
        ArrayList<Integer> C = new ArrayList<>(List.of(3,2));
        ArrayList<Integer> D = new ArrayList<>(List.of(5,5));
        ArrayList<Integer> E = new ArrayList<>(List.of(2,4));
        ArrayList<Integer> F = new ArrayList<>(List.of(3,2));
        ArrayList<Integer> G = new ArrayList<>(List.of(5,2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(C);
        B.add(D);
        B.add(E);
        B.add(F);
        B.add(G);
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        System.out.println(B);
        LinkedHashMap<Integer, ArrayList<Integer>> hash = new LinkedHashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i = 0; i < B.size(); i++) {
            if(hash.get(B.get(i).get(0)) == null) {
                count.put(B.get(i).get(0), 0);
                hash.put(B.get(i).get(0), new ArrayList<>(List.of(B.get(i).get(1))));
            } else {

                hash.get(B.get(i).get(0)).add(B.get(i).get(1));
            }
        }
        for (Map.Entry<Integer,ArrayList<Integer>> set : hash.entrySet()) {
           for(int i = 0; i < A.size();i++) {
               if(A.get(i) == set.getKey()) {
                   A.set(i,set.getValue().get(count.get(set.getKey())));
                   count.put(set.getKey(), count.get(set.getKey()) + 1);
               }
           }
        }
        return A;
    }
}
