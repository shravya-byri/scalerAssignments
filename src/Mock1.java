import java.util.ArrayList;
import java.util.List;

public class Mock1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        int m = 0, n = 0;
        int PeakPassed = 0;
        for(int i = 0; i < A.size()-1;i++) {
             if (A.get(i) <= A.get(i+1)) {
                if (PeakPassed == 1) {
                    m = i;
                }
                PeakPassed = 0;
            } else  {
                PeakPassed = 1;
                n = i+1;
                count = Integer.max(count, n - m +1);
            }
        }
        return count;
    }
}
