package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ContainerOfWater {
    public static void main(String[] args) {
        ArrayList<Integer> A  = new ArrayList<>(List.of(1, 5, 4, 3));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int i = 0; int j = A.size()-1;
        int area = 0;
        while(i != j) {
            area = Math.max(area,(j - i) * Math.min(A.get(i),A.get(j)));
            if(A.get(i) < A.get(j)) i++;
            else j--;

        }
      return area;
    }
}
