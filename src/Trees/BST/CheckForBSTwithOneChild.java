package Trees.BST;

import java.util.ArrayList;
import java.util.List;

public class CheckForBSTwithOneChild {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 6, 4));
        System.out.println(solve(A));
    }
    public static String solve(ArrayList<Integer> A) {
        int root = A.get(0);
        int L = Integer.MIN_VALUE;
        int R = Integer.MAX_VALUE;
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) > root) {
                L = root;
            } else R = root;
            if(A.get(i) < L || A.get(i) > R) {
                return "NO";
            }
            root = A.get(i);
        }
      return "YES";
    }
}
