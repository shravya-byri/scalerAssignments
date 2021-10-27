import java.util.ArrayList;
import java.util.List;

public class ClosestSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(377, 448, 173, 307, 108));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        int last_min = Integer.MIN_VALUE;
        int last_max = Integer.MIN_VALUE;
        for(int i =0; i < A.size(); i++) {
            if(A.get(i) > max) max = A.get(i);
            if(A.get(i) < min) min = A.get(i);
        }
        for(int i = 0; i < A.size();i++) {
            if (A.get(i) == max) {
                res = Math.min(Math.abs(res),Math.abs( i - last_min+1));
                last_max = i;

            }
            if (A.get(i) == min) {
                res = Math.min(Math.abs(res),Math.abs( i - last_max+1));
                last_min = i;

            }
        }

        return res;
    }
}
