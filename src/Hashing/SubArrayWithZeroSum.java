package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-1,1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans = 0;
        long prefix = 0;
        HashMap<Long,Integer> hash = new HashMap<>();
        hash.put(0L,-1);
        for(int i = 0; i < A.size(); i++) {
            prefix = prefix + A.get(i);
            if(hash.get(prefix) != null) {
                return  1;
            } else {
                hash.putIfAbsent(prefix, i);
            }
        }
        return ans;
    }
}
