package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(100,101,4,200,102,103,104,105,1,3,2));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count; int ma = 0; int ans = 0;
        HashSet<Integer> hash = new HashSet<>(A);
        for(int i = 0; i < A.size(); i++) {
            if(!(hash.contains(A.get(i)-1))) {
                count = 1;
                int x = A.get(i);
                while(hash.contains(x+1)){
                    x++;
                    count++;
                }
                ma = Math.max(ma,count);
            }
        }


        return ma;
    }
}
