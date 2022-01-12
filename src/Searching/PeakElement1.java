package Searching;

import java.util.ArrayList;
import java.util.List;

public class PeakElement1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int l = 1;
        int r = A.size() - 2;
        int mid;
        if (A.size() == 1) return A.get(0);
        if (A.get(0) > A.get(1)) return A.get(0);
        if (A.get(A.size() - 1) > A.get(A.size() - 2)) return A.get(A.size() - 1);
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (A.get(mid - 1) < A.get(mid) && A.get(mid + 1) < A.get(mid)) return A.get(mid);
            else if (A.get(mid + 1) > A.get(mid)) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
