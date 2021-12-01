package Searching;

import java.util.ArrayList;
import java.util.List;

public class RotatedArraySearch {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(   101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100));
        System.out.println(solve(A,202));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        System.out.println(A);
        int l = 0; int r = A.size()-1;
        while(l <= r) {
            int mid = l + ((r - l) / 2);
            if (B == A.get(mid)) return mid;
            if (B < A.get(0)) {
                if (A.get(mid) >= A.get(0)) l = mid + 1;
                else {
                    if (B < A.get(mid)) r = mid - 1;
                    else l = mid + 1;
                }
            } else {
                if (A.get(mid) < A.get(0)) r = mid - 1;
                else {
                    if (B > A.get(mid)) l = mid + 1;
                    else r = mid - 1;
                }

            }
        }

        return -1;
    }
}
