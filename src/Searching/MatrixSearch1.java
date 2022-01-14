package Searching;

import java.util.ArrayList;
import java.util.List;

public class MatrixSearch1 {
    public static void main(String[] args) {
        ArrayList<Integer> r1 = new ArrayList(List.of(1, 2, 5, 7));
        ArrayList<Integer> r2 = new ArrayList(List.of(10, 12, 15, 17));
        ArrayList<Integer> r3 = new ArrayList(List.of(21, 22, 25, 27));
        ArrayList<ArrayList<Integer>> ab = new ArrayList<>(List.of(r1, r2, r3));
        System.out.println(searchMatrix(ab, 17));
    }
    public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int l = 0; int r = A.size() * A.get(0).size()-1; int mid;
        while(l <= r) {
            mid = l + (r-l)/2;
            int i = mid/A.get(0).size(); int j = mid % A.get(0).size();
            if(B < A.get(i).get(j)) {
                r = mid - 1;
            } else if(B > A.get(i).get(j)) l = mid + 1;
            else return 1;

        }
        return 0;
    }
}
