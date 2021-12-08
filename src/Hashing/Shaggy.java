package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shaggy {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(7, 1, 3, 4, 1, 7));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int res = 0;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < A.size(); i++) {
            if(hash.get(A.get(i)) != null) {
                ans = Math.min(ans,(i - hash.get(A.get(i))));
                hash.put(A.get(i), i );
            } else hash.put(A.get(i),i);
        }
        if(ans == Integer.MAX_VALUE) ans = -1;
        return ans;

    }
}
