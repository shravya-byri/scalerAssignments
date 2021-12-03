package Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaintersBoard {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1000000, 1000000));
        System.out.println(solve(A,1,1000000));

    }
    public static int solve(ArrayList<Integer> C, int A, int B ) {
        //Collections.sort(C);
        long low = Integer.MIN_VALUE;
        long high = 0; long mid; long ans = 0;
        for(int i = 0; i < C.size(); i++) {
            if(low < C.get(i)) low = C.get(i);
            high = ( high + C.get(i)) % 10000003;
        }
        while(low <= high) {
            mid = low + (high - low)/2;
            if(check(C,A,mid)) {
                ans = mid % 10000003;
                high = mid - 1;
            } else low = mid + 1;
        }
        ans = (ans * B) % 10000003;
        return  (int) ans;
    }
    public static boolean check(ArrayList<Integer> C, int A, long mid) {
        int painter = 1;
        int time = 0;
        for(int i = 0; i < C.size(); i++) {
           time = time + C.get(i);
           if(time > mid) {
               time = C.get(i);
               painter++;
           }
        }
        if(painter > A) return false;
        return true;

    }
}
