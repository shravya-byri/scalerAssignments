package Searching;

import java.util.ArrayList;
import java.util.List;

public class RotatedArrayFinf {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 5, 6, 7, 1, 2, 3));
        System.out.println(solve(A, 1));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int l = 0;
        int r = A.size() - 1;
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if(A.get(mid) == B) return mid;
            if (A.get(mid) >= A.get(0)) {
                if(B < A.get(0) || B > A.get(mid)) {
                    l = mid + 1;
                } else r = mid - 1;
            } else{
                if(B >= A.get(0) || B < A.get(mid)) {
                    r = mid - 1;
                } else l = mid + 1;
            }
        }
        return -1;
    }
}