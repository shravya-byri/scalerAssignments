package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumSwaps {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 12, 10, 3, 14, 10, 5));
        int B = 8;
        System.out.println(solve(A,B));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        int tempswaps = 0;
        int totalSwaps = 0;
        for(int i = 0; i < A.size(); i++) {
          if(A.get(i) <= B) count++;
        }
        for(int i = 0; i < count; i++) {
            if(A.get(i) > B) tempswaps++;
        }
        totalSwaps = tempswaps;
        for(int i = 0; i < A.size(); i++) {
            int j = i + count-1;
            if(j >= A.size()) break;;
            if(A.get(i) > B) {
                tempswaps--;
            }
            if(A.get(j) > B) tempswaps++;
            totalSwaps = Math.min(totalSwaps,tempswaps);

        }

        return totalSwaps;
    }
}
