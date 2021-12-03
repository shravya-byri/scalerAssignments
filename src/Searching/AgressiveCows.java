package Searching;

import java.util.ArrayList;
import java.util.List;

public class AgressiveCows {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,6,11,14,19,25,30,39,43));
        System.out.println(solve(A,4));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int low = 1;
        int high = A.get(A.size()-1) - A.get(0);
        int mid;
        int ans = 0;
        while(low <= high) {
            mid = low + (high - low)/2;
            if(check(A, B, mid)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;

    }
    public static boolean check(ArrayList<Integer>A, int B, int mid) {
        int recentPlace = A.get(0);
        int cowsPlaced = 1;
        for(int i = 1; i < A.size(); i++) {
            if (A.get(i) - recentPlace >= mid) {
                recentPlace = A.get(i);
                cowsPlaced++;
            }
        }
            if(cowsPlaced >= B) return true;
            else return false;
    }
}
