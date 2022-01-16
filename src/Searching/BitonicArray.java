package Searching;

import java.util.ArrayList;
import java.util.List;

public class BitonicArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(3,8,10,14,17,20,18,16,10));
        System.out.println(solve(A));
       if(leftSearch(A,solve(A),9) == -1) {
           System.out.println(rightSearch(A,solve(A),8));
       } else System.out.println(leftSearch(A,solve(A),8));
    }
    public static int solve(ArrayList<Integer> A) {
        int l = 0; int r = A.size()-1;
        int mid;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(A.get(mid) > A.get(mid-1) && A.get(mid) > A.get(mid+1)) return mid;
            if(A.get(mid) < A.get(mid + 1)) l = mid + 1;
            if(A.get(mid) < A.get(mid - 1)) r = mid -1;

        }
        return -1;
    }
    public static int leftSearch(ArrayList<Integer> A, int C,int B) {
        int l = 0; int r = C-1;
        int mid;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(A.get(mid) == B) return mid;
            if(A.get(mid) > B) r = mid - 1;
            else l = mid + 1;
        }
       return -1;
    }
    public static int rightSearch(ArrayList<Integer> A, int C, int B) {
        int l = C; int r = A.size()-1;
        int mid;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(A.get(mid) == B) return mid;
            if(A.get(mid) > B) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
