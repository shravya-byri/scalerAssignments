package TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class sortByColours {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(0));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < A.size(); i++) {
            if (hash.get(A.get(i)) == null) {
                hash.put(A.get(i), 1);
            } else hash.put(A.get(i), hash.get(A.get(i)) + 1);
        }
        int i = 0;
        if(hash.get(0) != null) {
            int x = hash.get(0);
            while (x != 0) {
                A.set(i, 0);
                x--;
                i++;
            }
        }
        if(hash.get(1) != null) {
            int y = hash.get(1);
            while (y != 0) {
                A.set(i, 1);
                y--;
                i++;
            }
        }
        if(hash.get(1) != null) {
            int z = hash.get(2);
            while (z != 0) {
                A.set(i, 2);
                z--;
                i++;
            }
        }
       return A;
    }
}
