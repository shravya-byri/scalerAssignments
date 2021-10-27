import java.util.ArrayList;
import java.util.List;

public class MinimumJumps {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,4,3,7,1,2,6,7,6,10));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        if(A.size() <= 1) return 0;
        if(A.get(0) == 0) return -1;
        int maxReach = A.get(0);
        int steps = A.get(0);
        int jumps = 1;
        for(int i = 1; i < A.size(); i++) {
            if(i == A.size()-1) return jumps;
            maxReach = Math.max(maxReach, i+A.get(i));
            steps--;
            if(steps == 0) {
                jumps++;
                if (i >= maxReach) return -1;
                steps = maxReach - i;
            }
        }
      return -1;
    }
}
