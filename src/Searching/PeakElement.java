package Searching;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,3));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int l = 0; int r = A.size()-1;
        while(l < r) {
            int mid = l + ((r - l)/2);
            if(mid == 0) {
                if(A.get(mid) > A.get(mid+1))
                    return A.get(mid);
                else return A.get(mid+1);
            } else if(mid == A.size()-1) {
                if(A.get(mid) > A.get(mid-1)) return A.get(mid);
                else return A.get(mid-1);
            }else{
                if (A.get(mid - 1) <= A.get(mid) && A.get(mid + 1) <= A.get(mid)) return A.get(mid);
                if (A.get(mid - 1) <= A.get(mid) && A.get(mid + 1) > A.get(mid)) l = mid + 1;
                if (A.get(mid - 1) > A.get(mid) && A.get(mid + 1) <= A.get(mid)) r = mid - 1;
                if (A.get(mid - 1) > A.get(mid) && A.get(mid + 1) > A.get(mid)) l = mid + 1;

            }
        }

        return A.get(r);
    }
}
