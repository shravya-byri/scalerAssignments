package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongesConsecutiveSequenceSumZero {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(3,2,-2,4,-4));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        long prefix = 0; int l = 0; int r = 0; int res = 0; int res1 = 0;
        HashMap<Long,Integer> hash = new HashMap<>();
        hash.put(0L,-1);
        for(int i = 0; i < A.size(); i++) {
            prefix = prefix + A.get(i);
            if(hash.get(prefix) != null) {
                res = i-hash.get(prefix);
                if(res1 < res) {
                    res1 = res;
                    l = hash.get(prefix);
                    r = i;
                }
            } else {
                hash.putIfAbsent(prefix, i);
            }
        }
        for(int i = l+1; i <= r; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }


}
