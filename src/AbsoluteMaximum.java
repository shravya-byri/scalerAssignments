import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class AbsoluteMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4));
        ArrayList<Integer> B = new ArrayList<>(List.of(-1,4,5,6));
        ArrayList<Integer> C = new ArrayList<>(List.of(-10,5,3,-8));
        ArrayList<Integer> D = new ArrayList<>(List.of(-1,-9,-6,-10));
        System.out.println(solve(A,B,C,D));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {
        int res = 0;
        int n = A.size();
        int max, min,curr,temp;
        for(int i = 0; i < 16;i++) {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                curr = A.get(j);
                for(int k = 0; k<4; k++) {
                    if( k == 0) temp = B.get(j);
                    else if (k == 1) temp = C.get(j);
                    else if (k == 2) temp = D.get(j);
                    else temp = j;
                    if ((i & 1<<k) == 0) curr += temp;
                    else curr -= temp;

                }
                max = Math.max(max,curr);
                min = Math.min(min, curr);

            }
            res = Math.max(res, max-min);

        }
        return res;
    }
}
