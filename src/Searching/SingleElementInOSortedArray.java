package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SingleElementInOSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,2,5,5,8,8,13,13,18,18));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int l = 0; int r = A.size()-1;
        int mid;
        while(l <= r) {
            mid = l + (r - l)/2;
            if(mid != 0 && mid!= A.size()-1) {
                if (!Objects.equals(A.get(mid + 1), A.get(mid)) && !Objects.equals(A.get(mid - 1), A.get(mid))) return A.get(mid);
                if(Objects.equals(A.get(mid), A.get(mid - 1))) {
                     if ((mid - 1) % 2 == 0) l = mid + 1;
                     else r = mid - 1;;
                }
                if(Objects.equals(A.get(mid), A.get(mid + 1)))
                    if((mid + 1) % 2 == 0) r = mid - 1;
                    else  l = mid + 1;
            } else{
                if(mid == 0 && !Objects.equals(A.get(mid + 1), A.get(mid))) return A.get(mid);
                if(mid == 0 && Objects.equals(A.get(mid + 1), A.get(mid))) l =  mid + 1;
                if(mid == A.size()-1 && !Objects.equals(A.get(mid), A.get(mid - 1))) return A.get(mid);
                if(mid == A.size()-1 && Objects.equals(A.get(mid), A.get(mid - 1))) r = mid - 1;
            }
        }
      return A.get(r);
    }
}
