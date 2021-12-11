package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColourfulNumber {
    public static void main(String[] args) {
        System.out.println(solve(1));
    }
    public static int solve(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        while(A > 0) {
            res.add(A%10);
            A = A/10;
        }
        for(int i = res.size()-1; i >= 0; i--) {
            res1.add(res.get(i));

        }
        HashSet<Integer> hash = new HashSet<>(res);
        if(res1.size() != hash.size() && res1.size() != 1) return 0;
        if(res1.size() == 1) return 1;
        for(int i = 0; i < res.size()-1; i++) {

           if(hash.contains(res.get(i) * res.get(i+1))) return 0;
        }
        return 1;
    }
}
