package contests;

import javax.management.MBeanAttributeInfo;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,2,5,1));
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> C = new ArrayList<>(List.of(3,2));
        ArrayList<Integer> D = new ArrayList<>(List.of(5,5));
        ArrayList<Integer> E = new ArrayList<>(List.of(2,4));
        ArrayList<Integer> F = new ArrayList<>(List.of(3,2));
        ArrayList<Integer> G = new ArrayList<>(List.of(5,2));

        B.add(C);
        B.add(D);
        B.add(E);
        B.add(F);
        B.add(G);
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int m = 0; m < B.size(); m++) {
            map.put(B.get(m).get(0),B.get(m).get(1));
        }
        for(int j = 0; j <  A.size(); j++) {
               for(Map.Entry<Integer, Integer> e: map.entrySet()) {
                   if (Objects.equals(e.getKey(), A.get(j))) {
                       A.set(j, e.getValue());
                   }
               }
        }
        return A;
    }
}
