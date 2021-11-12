package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class Sixlets {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,8));
        int B = 2;
        System.out.println(solve1(A,B));
    }
    public static int solve1(ArrayList<Integer> A, int B) {
        int i = 0,sum = 0;
        return(solve(i,sum, B,A));

    }
    public static int solve(int i, int sum,int size, ArrayList<Integer> A) {
        if(sum > 1000) return 0;
        if(size == 0)  return 1;
        if(i == A.size())     return 0;
        return solve(i+1, sum + A.get(i),size-1,A) + solve(i+1,sum,size,A);

    }
}
