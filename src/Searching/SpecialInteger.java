package Searching;

import java.util.ArrayList;
import java.util.List;

public class SpecialInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(solve(A,10));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int low = 0;
        int high = A.size()-1;
        int ans = 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int sum = 0;
            for (int i = 0; i < mid;i++) {
                sum = sum + A.get(i);
                if (sum > B) {
                    break;
                }
            }
            if (sum <= B) {
                for (int i = mid; i < A.size()-1; i++) {
                    sum = sum - A.get(i-mid);
                    sum= sum + A.get(i);
                    if (sum > B) break;
                }
            }
            if (sum > B) {
                high = mid-1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;




    }
}
