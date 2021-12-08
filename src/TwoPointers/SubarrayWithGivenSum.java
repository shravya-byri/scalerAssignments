package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 1,1000000000));
        System.out.println(solve(A, 1000000000));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        //Collections.sort(A);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0; int j = 1; int sum = A.get(0);
        while(i < A.size() && i <= j) {
            if (sum < B && j < A.size()) {
                sum = sum + A.get(j);
                j++;

            } else if(sum == B) {
                while(i < j) {
                    res.add(A.get(i));
                    i++;
                }
                return res;
            } else {
                sum = sum - A.get(i);
                i++;
            }

        }
        if( j == A.size() && sum != B) {
            res.add(-1);
            return res;
        }

        return res;

    }
}
