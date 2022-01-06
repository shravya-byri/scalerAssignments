package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaxDistance {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-1,-1,2));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        if(A.size() == 0) return 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < A.size(); i++) {
            hash.putIfAbsent(A.get(i), i);
        }
        Collections.sort(A);
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++) {
            min = Math.min(min,hash.get(A.get(i)));
            ans = Math.max(ans,hash.get(A.get(i))-min);

        }

        return ans;
    }
}
