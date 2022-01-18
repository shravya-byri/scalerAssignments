package Searching;

import java.util.ArrayList;
import java.util.List;

public class SpecialIntegerMohit {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println(solve(A,10));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int l = 1;
        int r = A.size(); //search space is from 1 to n as it is taking length.
        int ans = 0; int mid;
        while ( l <= r) {
            mid = l + (r - l)/2;
            if(check(A,B,mid)) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }
    public static boolean check(ArrayList<Integer> A, int B, int mid) {
        long sum = 0; // sliding window
        for(int i = 0; i < mid; i++) {
            sum = sum + A.get(i);

        }
        if(sum > B) return false;
        for(int i = mid; i < A.size();i++) {
            sum = sum + A.get(i) - A.get(i - mid);
            if(sum > B) return false;
        }
      return true;
    }
}
