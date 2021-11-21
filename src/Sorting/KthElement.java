package Sorting;

import java.util.ArrayList;
import java.util.List;

public class KthElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(47,7));
        System.out.println(solve(A,2));
    }
    public static int solve(ArrayList<Integer> A,int B) {
        int temp;
        int max_Index = 0;
        int last_index = A.size()-1;
        int b = B;
        ArrayList<Integer> array = new ArrayList<>(A);
        while(B > 0) {
            int curr_min = Integer.MAX_VALUE;
            for (int i = 0; i <= last_index; i++) {
                if (array.get(i) < curr_min) {
                    curr_min = array.get(i);

                    max_Index = i;
                }
            }
             temp = array.get(max_Index);
            array.set(max_Index,array.get(last_index));
            array.set(last_index,temp);
            last_index--;
            B--;
        }

        return array.get(array.size()-b);
    }
}
