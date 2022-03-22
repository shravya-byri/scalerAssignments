package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class sumOfElementsInArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6));
      //  solve(A,0,0);
        System.out.println(solve(A,0,0));
    }
    public static int solve(ArrayList<Integer> A, int sum,int index) {
        if(index == A.size()) return sum;
        return solve(A,sum+A.get(index),index+1);
    }
}
