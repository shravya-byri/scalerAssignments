package Searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SingleElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(13, 13, 21, 21, 27, 50, 50, 102, 102, 108, 108, 110, 110, 117, 117, 120, 120, 123, 123, 124, 124, 132, 132, 164, 164, 166, 166, 190, 190, 200, 200, 212, 212, 217, 217, 225, 225, 238, 238, 261, 261, 276, 276, 347, 347, 348, 348, 386, 386, 394, 394, 405, 405, 426, 426, 435, 435, 474, 474, 493, 493));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int l = 0; int r = A.size()-1;
        int mid;
        if(!Objects.equals(A.get(0), A.get(1))) return A.get(0);
        if(!Objects.equals(A.get(A.size() - 1), A.get(A.size() - 2))) return A.get(A.size()-1);
        while(l <= r) {
            mid = l + (r - l)/2;
            if(!Objects.equals(A.get(mid - 1), A.get(mid)) && !Objects.equals(A.get(mid), A.get(mid + 1))) return A.get(mid);
            if(Objects.equals(A.get(mid), A.get(mid-1))) {
                mid = mid - 1;
            }
            if(mid % 2 == 0) {
                l = mid + 2;
            } else r = mid - 1;
        }
        return A.get(l);

    }
}
